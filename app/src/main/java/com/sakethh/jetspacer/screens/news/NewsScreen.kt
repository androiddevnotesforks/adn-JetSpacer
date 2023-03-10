package com.sakethh.jetspacer.screens.news

import android.app.Activity
import android.content.Intent
import android.widget.Toast
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.OpenInBrowser
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.pullrefresh.PullRefreshIndicator
import androidx.compose.material.pullrefresh.pullRefresh
import androidx.compose.material.pullrefresh.rememberPullRefreshState
import androidx.compose.material3.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.sakethh.jetspacer.Coil_Image

import com.sakethh.jetspacer.R
import com.sakethh.jetspacer.localDB.NewsDB
import com.sakethh.jetspacer.navigation.NavigationRoutes
import com.sakethh.jetspacer.screens.Status
import com.sakethh.jetspacer.screens.StatusScreen
import com.sakethh.jetspacer.screens.bookMarks.BookMarksVM
import com.sakethh.jetspacer.screens.bookMarks.screens.triggerHapticFeedback
import com.sakethh.jetspacer.screens.home.AlertDialogForDeletingFromDB
import com.sakethh.jetspacer.screens.home.HomeScreenViewModel
import com.sakethh.jetspacer.screens.news.dto.Article
import com.sakethh.jetspacer.screens.settings.redirectToWeb
import com.sakethh.jetspacer.screens.webview.WebViewUtils
import com.sakethh.jetspacer.ui.theme.AppTheme
import io.ktor.http.*
import kotlinx.coroutines.*
import java.util.*


@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterialApi::class)
@Composable
fun NewsScreen(navController: NavController) {
    NewsVM.NewsData.currentPage = 1
    val newsVM: NewsVM = viewModel()
    val topHeadLinesData = newsVM.topHeadLinesListFromAPI
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    val coroutineScope = rememberCoroutineScope()
    val context = LocalContext.current
    val shouldLoadMoreData = rememberSaveable { mutableStateOf(true) }
    val isRefreshing = remember { mutableStateOf(false) }
    val newsBottomSheetContentImpl = NewsBottomSheetContentImpl().copy()
    val modalBottomSheetState =
        rememberModalBottomSheetState(initialValue = ModalBottomSheetValue.Hidden)
    BackHandler {
        if (modalBottomSheetState.isVisible) {
            coroutineScope.launch {
                modalBottomSheetState.hide()
            }
        } else {
            navController.navigate(route = NavigationRoutes.HOME_SCREEN) {
                popUpTo(0)
            }
        }
    }
    val isConnectedToInternet =
        HomeScreenViewModel.Network.connectedToInternet.collectAsState()

    val bookMarksVM: BookMarksVM = viewModel()
    val pullRefreshState =
        rememberPullRefreshState(refreshing = isRefreshing.value,
            onRefresh = {
                isRefreshing.value = true
                shouldLoadMoreData.value = true
                coroutineScope.launch {
                    awaitAll(
                        async {
                            withContext(Dispatchers.Main) {
                                if (isConnectedToInternet.value) {
                                    Toast.makeText(
                                        context,
                                        "Refreshing data in a moment",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }
                                delay(2000L)
                                isRefreshing.value = false
                            }
                        },
                        async {
                            try {
                                HomeScreenViewModel.Network.isConnectionSucceed.value =
                                    true
                                newsVM.reloadTopHeadLinesData()
                            } catch (_: Exception) {
                                HomeScreenViewModel.Network.isConnectionSucceed.value =
                                    false
                                withContext(Dispatchers.Main) {
                                    isRefreshing.value = false
                                    Toast.makeText(
                                        context,
                                        "Network not detected",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }
                            }
                        }
                    )
                }
            })
    AppTheme {
        ModalBottomSheetLayout(sheetShape =
        RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp),
            sheetState = modalBottomSheetState,
            sheetContent = {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .background(MaterialTheme.colorScheme.primary)
                ) {
                    Spacer(modifier = Modifier.height(20.dp))
                    NewsBottomSheetContent(newsBottomSheetContentImpl = newsBottomSheetContentImpl)
                    Spacer(modifier = Modifier.height(70.dp))
                }
            }) {
            Scaffold(
                modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
                topBar = {
                    CenterAlignedTopAppBar(
                        scrollBehavior = scrollBehavior,
                        title = {
                            Text(
                                text = "Top Headlines",
                                color = MaterialTheme.colorScheme.onSurface,
                                fontSize = 22.sp,
                                style = MaterialTheme.typography.headlineLarge
                            )
                        },
                        modifier = Modifier.background(MaterialTheme.colorScheme.surface),
                        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = MaterialTheme.colorScheme.surface)
                    )
                }) {
                if (topHeadLinesData.value.isEmpty()) {
                    Column {
                        Spacer(modifier = Modifier.height(70.dp))
                        val status = if (isConnectedToInternet.value) {
                            Status.LOADING
                        } else {
                            Status.NO_INTERNET
                        }
                        StatusScreen(
                            title = "Wait a moment!",
                            description = "Fetching the latest space-related top headlines from around the globe\n" +
                                    "\n" +
                                    "if this take toooooo long,\n" +
                                    "try changing API Keys from Settings(??? _ ???)",
                            status = status
                        )
                    }
                } else {
                    Box(modifier = Modifier.pullRefresh(state = pullRefreshState)) {
                        LazyColumn(
                            contentPadding = it,
                            modifier = Modifier
                                .fillMaxSize()
                                .background(MaterialTheme.colorScheme.surface)
                        ) {
                            this.newsUI(
                                topHeadLinesData = topHeadLinesData,
                                bottomSheetState = modalBottomSheetState,
                                coroutineScope = coroutineScope,
                                newsBottomSheetContentImpl = newsBottomSheetContentImpl,
                                navController = navController,
                                bookMarksVM = bookMarksVM
                            )
                            item {
                                if (newsVM._topHeadLinesListFromAPI.value.isEmpty()) {
                                    shouldLoadMoreData.value = false
                                    Text(
                                        text = "You've came to end! It usually takes an hour or less to update new Top-headlines until then go and touch some grass bro U_U",
                                        fontSize = 14.sp,
                                        style = MaterialTheme.typography.headlineMedium,
                                        modifier = Modifier.padding(20.dp),
                                        textAlign = TextAlign.Start,
                                        color = MaterialTheme.colorScheme.secondary,
                                        lineHeight = 16.sp
                                    )
                                } else {
                                    Button(
                                        modifier = Modifier
                                            .padding(20.dp)
                                            .fillMaxWidth(),
                                        onClick = {
                                            if (shouldLoadMoreData.value) {
                                                shouldLoadMoreData.value = false
                                                NewsVM.NewsData.currentPage++
                                                coroutineScope.launch {
                                                    newsVM.loadTopHeadLinesData()
                                                }.invokeOnCompletion {
                                                    shouldLoadMoreData.value = true
                                                }
                                            }
                                        },
                                        colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
                                    ) {
                                        if (shouldLoadMoreData.value) {
                                            Text(
                                                text = "Load more news",
                                                style = MaterialTheme.typography.headlineMedium,
                                                color = MaterialTheme.colorScheme.onPrimary
                                            )
                                        } else {
                                            Row(
                                                modifier = Modifier.fillMaxWidth(),
                                                horizontalArrangement = Arrangement.SpaceAround
                                            ) {
                                                Text(
                                                    text = "Loading more news...",
                                                    style = MaterialTheme.typography.headlineMedium,
                                                    color = MaterialTheme.colorScheme.onPrimary
                                                )
                                                CircularProgressIndicator(
                                                    color = MaterialTheme.colorScheme.onPrimary,
                                                    modifier = Modifier.size(20.dp),
                                                    strokeWidth = 3.dp
                                                )
                                            }
                                        }
                                    }
                                }
                                Spacer(modifier = Modifier.height(60.dp))
                            }
                        }
                        PullRefreshIndicator(
                            refreshing = isRefreshing.value,
                            state = pullRefreshState,
                            Modifier.align(Alignment.TopCenter),
                            scale = true
                        )
                    }
                }
            }
        }

        var doesExistsInDB = false
        if (HomeScreenViewModel.BookMarkUtils.isAlertDialogEnabledForAPODDB.value || HomeScreenViewModel.BookMarkUtils.isAlertDialogEnabledForRoversDB.value) {
            AlertDialogForDeletingFromDB(
                bookMarkedCategory = "newsdb",
                onConfirmBtnClick = {
                    triggerHapticFeedback(context = context)
                    coroutineScope.launch {
                        doesExistsInDB =
                            bookMarksVM.deleteDataFromNewsDB(sourceURL = newsBottomSheetContentImpl.sourceURL)
                        modalBottomSheetState.hide()
                    }.invokeOnCompletion {
                        bookMarksVM.doesThisExistsInNewsDBIconTxt(sourceURL = newsBottomSheetContentImpl.sourceURL)
                        if (doesExistsInDB) {
                            Toast.makeText(
                                context,
                                "Bookmark didn't got removed as expected, report it:(",
                                Toast.LENGTH_SHORT
                            )
                                .show()
                        } else {
                            bookMarksVM.doesThisExistsInNewsDBIconTxt(sourceURL = newsBottomSheetContentImpl.sourceURL)
                            Toast.makeText(
                                context,
                                "Removed from bookmarks:)",
                                Toast.LENGTH_SHORT
                            )
                                .show()
                        }
                        bookMarksVM.doesThisExistsInNewsDBIconTxt(sourceURL = newsBottomSheetContentImpl.sourceURL)
                    }
                    HomeScreenViewModel.BookMarkUtils.isAlertDialogEnabledForAPODDB.value = false
                    HomeScreenViewModel.BookMarkUtils.isAlertDialogEnabledForRoversDB.value = false
                }
            )
        }
    }
}


@OptIn(ExperimentalMaterialApi::class)
fun LazyListScope.newsUI(
    bottomSheetState: ModalBottomSheetState,
    topHeadLinesData: MutableState<List<Article>>? = null,
    coroutineScope: CoroutineScope,
    bookMarkedData: State<List<NewsDB>>? = null,
    newsBottomSheetContentImpl: NewsBottomSheetContentImpl,
    navController: NavController,
    bookMarksVM: BookMarksVM,
) {
    if (topHeadLinesData != null) {
        items(topHeadLinesData.value) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp, start = 8.dp, end = 8.dp)
                    .wrapContentHeight()
                    .redirectToWeb(
                        navController = navController,
                        newsBottomSheetContentImpl = newsBottomSheetContentImpl,
                        onClick = {
                            newsBottomSheetContentImpl.imageURL = it.urlToImage
                            newsBottomSheetContentImpl.publishedTime = it.publishedAt
                            newsBottomSheetContentImpl.sourceName = it.source.name
                            newsBottomSheetContentImpl.sourceURL = it.url
                            newsBottomSheetContentImpl.title = it.title
                        }
                    )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth(0.75f)
                        .wrapContentHeight()
                ) {
                    Text(
                        text = it.title,
                        fontSize = 20.sp,
                        style = MaterialTheme.typography.headlineLarge,
                        modifier = Modifier.padding(
                            top = 15.dp,
                            end = 15.dp
                        ),
                        textAlign = TextAlign.Start,
                        lineHeight = 22.sp,
                        maxLines = 4,
                        color = MaterialTheme.colorScheme.onSurface,
                        overflow = TextOverflow.Ellipsis,
                        minLines = 1
                    )
                    Text(
                        text = it.source.name,
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.headlineMedium,
                        modifier = Modifier.padding(
                            top = 5.dp,
                            end = 15.dp
                        ),
                        textAlign = TextAlign.Start,
                        maxLines = 1,
                        color = MaterialTheme.colorScheme.secondary,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = it.publishedAt,
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.headlineMedium,
                        modifier = Modifier.padding(
                            top = 5.dp,
                            end = 15.dp
                        ),
                        textAlign = TextAlign.Start,
                        maxLines = 1,
                        color = MaterialTheme.colorScheme.secondary,
                        overflow = TextOverflow.Ellipsis
                    )
                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                ) {
                    Coil_Image().CoilImage(
                        imgURL = it.urlToImage,
                        contentDescription = "",
                        modifier = Modifier
                            .padding(top = 15.dp)
                            .clip(RoundedCornerShape(10.dp))
                            .border(
                                width = 1.dp,
                                shape = RoundedCornerShape(10.dp),
                                color = MaterialTheme.colorScheme.secondary
                            )
                            .size(100.dp)
                            .align(Alignment.TopEnd),
                        onError = painterResource(id = R.drawable.baseline_image_24),
                        contentScale = ContentScale.Crop
                    )
                    Icon(
                        modifier = Modifier
                            .align(Alignment.BottomEnd)
                            .clickable {
                                newsBottomSheetContentImpl.imageURL = it.urlToImage
                                newsBottomSheetContentImpl.publishedTime = it.publishedAt
                                newsBottomSheetContentImpl.sourceName = it.source.name
                                newsBottomSheetContentImpl.sourceURL = it.url
                                bookMarksVM.doesThisExistsInNewsDBIconTxt(
                                    sourceURL = newsBottomSheetContentImpl.sourceURL
                                )
                                newsBottomSheetContentImpl.title = it.title
                                coroutineScope.launch {
                                    bottomSheetState.show()
                                }.invokeOnCompletion {
                                    bookMarksVM.doesThisExistsInNewsDBIconTxt(sourceURL = newsBottomSheetContentImpl.sourceURL)
                                }
                            },
                        imageVector = Icons.Filled.MoreVert,
                        contentDescription = ""
                    )
                }
            }
        }
    }
    if (bookMarkedData != null) {
        items(bookMarkedData.value) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp, start = 8.dp, end = 8.dp)
                    .wrapContentHeight()
                    .redirectToWeb(
                        navController = navController,
                        newsBottomSheetContentImpl = newsBottomSheetContentImpl,
                        onClick = {
                            newsBottomSheetContentImpl.imageURL = it.imageURL
                            newsBottomSheetContentImpl.publishedTime = it.publishedTime
                            newsBottomSheetContentImpl.sourceName = it.sourceOfNews
                            newsBottomSheetContentImpl.sourceURL = it.sourceURL
                            newsBottomSheetContentImpl.title = it.title
                        }
                    )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth(0.75f)
                        .wrapContentHeight()
                ) {
                    Text(
                        text = it.title,
                        fontSize = 20.sp,
                        style = MaterialTheme.typography.headlineLarge,
                        modifier = Modifier.padding(
                            top = 15.dp,
                            end = 15.dp
                        ),
                        textAlign = TextAlign.Start,
                        lineHeight = 22.sp,
                        maxLines = 4,
                        color = MaterialTheme.colorScheme.onSurface,
                        overflow = TextOverflow.Ellipsis,
                        minLines = 1
                    )
                    Text(
                        text = it.sourceOfNews,
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.headlineMedium,
                        modifier = Modifier.padding(
                            top = 5.dp,
                            end = 15.dp
                        ),
                        textAlign = TextAlign.Start,
                        maxLines = 1,
                        color = MaterialTheme.colorScheme.secondary,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = it.publishedTime,
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.headlineMedium,
                        modifier = Modifier.padding(
                            top = 5.dp,
                            end = 15.dp
                        ),
                        textAlign = TextAlign.Start,
                        maxLines = 1,
                        color = MaterialTheme.colorScheme.secondary,
                        overflow = TextOverflow.Ellipsis
                    )
                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                ) {
                    Coil_Image().CoilImage(
                        imgURL = it.imageURL,
                        contentDescription = "",
                        modifier = Modifier
                            .padding(top = 15.dp)
                            .clip(RoundedCornerShape(10.dp))
                            .border(
                                width = 1.dp,
                                shape = RoundedCornerShape(10.dp),
                                color = MaterialTheme.colorScheme.secondary
                            )
                            .size(100.dp)
                            .align(Alignment.TopEnd),
                        onError = painterResource(id = R.drawable.baseline_image_24),
                        contentScale = ContentScale.Crop
                    )
                    Icon(
                        modifier = Modifier
                            .align(Alignment.BottomEnd)
                            .clickable {
                                newsBottomSheetContentImpl.imageURL = it.imageURL
                                newsBottomSheetContentImpl.publishedTime = it.publishedTime
                                newsBottomSheetContentImpl.sourceName = it.sourceOfNews
                                newsBottomSheetContentImpl.sourceURL = it.sourceURL
                                newsBottomSheetContentImpl.title = it.title
                                bookMarksVM.doesThisExistsInNewsDBIconTxt(sourceURL = newsBottomSheetContentImpl.sourceURL)
                                coroutineScope.launch {
                                    bottomSheetState.show()
                                }.invokeOnCompletion {
                                    bookMarksVM.doesThisExistsInNewsDBIconTxt(sourceURL = newsBottomSheetContentImpl.sourceURL)
                                }
                            },
                        imageVector = Icons.Filled.MoreVert,
                        contentDescription = ""
                    )
                }
            }
        }
    }
}

data class NewsBottomSheetContent(val title: String, val icon: ImageVector, val onClick: () -> Unit)

data class NewsBottomSheetContentImpl(
    var imageURL: String = "",
    var sourceName: String = "",
    var title: String = "",
    var publishedTime: String = "",
    var sourceURL: String = "",
)

@Composable
fun NewsBottomSheetContent(newsBottomSheetContentImpl: NewsBottomSheetContentImpl) {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    val bookMarksVM: BookMarksVM = viewModel()
    val localURI = LocalUriHandler.current
    val localClipBoard = LocalClipboardManager.current
    var doDataExistsInDB = false
    bookMarksVM.doesThisExistsInNewsDBIconTxt(sourceURL = newsBottomSheetContentImpl.sourceURL)
    val bottomList = listOf(
        NewsBottomSheetContent(
            title = bookMarksVM.bookMarkText.value,
            icon = bookMarksVM.bookMarkIcons.value,
            onClick = {
                triggerHapticFeedback(context = context)
                coroutineScope.launch {
                    doDataExistsInDB = BookMarksVM.dbImplementation.localDBData()
                        .doesThisExistsInNewsDB(newsBottomSheetContentImpl.sourceURL)
                }.invokeOnCompletion {
                    if (!doDataExistsInDB) {
                        coroutineScope.launch {
                            bookMarksVM.addDataToNewsDB(newsDB = NewsDB().apply {
                                this.title = newsBottomSheetContentImpl.title
                                this.imageURL = newsBottomSheetContentImpl.imageURL
                                this.sourceOfNews = newsBottomSheetContentImpl.sourceName
                                this.publishedTime = newsBottomSheetContentImpl.publishedTime
                                this.sourceURL = newsBottomSheetContentImpl.sourceURL
                            })
                        }.invokeOnCompletion {
                            bookMarksVM.doesThisExistsInNewsDBIconTxt(sourceURL = newsBottomSheetContentImpl.sourceURL)
                        }
                        Toast.makeText(
                            context,
                            "Added to bookmarks:)",
                            Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        HomeScreenViewModel.BookMarkUtils.isAlertDialogEnabledForAPODDB.value =
                            true
                    }
                }
            }),
        NewsBottomSheetContent(
            title = "Open in browser",
            icon = Icons.Default.OpenInBrowser,
            onClick = {
                bookMarksVM.doesThisExistsInNewsDBIconTxt(sourceURL = newsBottomSheetContentImpl.sourceURL)
                localURI.openUri(newsBottomSheetContentImpl.sourceURL)
            }),
        NewsBottomSheetContent(
            title = "Copy news source link",
            icon = Icons.Default.ContentCopy,
            onClick = {
                localClipBoard.setText(AnnotatedString(newsBottomSheetContentImpl.sourceURL))
                Toast.makeText(context, "Copied to clipboard", Toast.LENGTH_SHORT).show()
            }),
        NewsBottomSheetContent(
            title = "Share",
            icon = Icons.Default.Share,
            onClick = {
                val intent = Intent()
                intent.action = Intent.ACTION_SEND
                intent.putExtra(
                    Intent.EXTRA_TEXT,
                    "Checkout top-headline:\n${newsBottomSheetContentImpl.title}\nsource:\n${newsBottomSheetContentImpl.sourceURL}"
                )
                intent.type = "text/plain"
                val activity = context as Activity?
                activity?.startActivity(intent)
            }),
    )
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.primary)
    ) {
        bottomList.forEach {
            Row(
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 10.dp)
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.primary)
                    .clickable { it.onClick() }
            ) {
                Spacer(modifier = Modifier.width(20.dp))
                androidx.compose.material.Icon(
                    imageVector = it.icon,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onPrimary
                )
                Spacer(modifier = Modifier.width(25.dp))
                Text(
                    text = it.title,
                    color = MaterialTheme.colorScheme.onPrimary,
                    style = MaterialTheme.typography.headlineMedium,
                    modifier = Modifier.padding(end = 20.dp)
                )
            }
        }
    }
}

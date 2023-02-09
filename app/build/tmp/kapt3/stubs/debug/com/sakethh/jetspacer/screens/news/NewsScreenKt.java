package com.sakethh.jetspacer.screens.news;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001ab\u0010\u0007\u001a\u00020\u0001*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\r\u0018\u00010\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015\u00a8\u0006\u0016"}, d2 = {"NewsBottomSheetContent", "", "newsBottomSheetContentImpl", "Lcom/sakethh/jetspacer/screens/news/NewsBottomSheetContentImpl;", "NewsScreen", "navController", "Landroidx/navigation/NavController;", "newsUI", "Landroidx/compose/foundation/lazy/LazyListScope;", "bottomSheetState", "Landroidx/compose/material/ModalBottomSheetState;", "topHeadLinesData", "Landroidx/compose/runtime/MutableState;", "", "Lcom/sakethh/jetspacer/screens/news/dto/Article;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "bookMarkedData", "Landroidx/compose/runtime/State;", "Lcom/sakethh/jetspacer/localDB/NewsDB;", "bookMarksVM", "Lcom/sakethh/jetspacer/screens/bookMarks/BookMarksVM;", "app_debug"})
public final class NewsScreenKt {
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class, androidx.compose.material.ExperimentalMaterialApi.class})
    public static final void NewsScreen(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController) {
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.material.ExperimentalMaterialApi.class})
    public static final void newsUI(@org.jetbrains.annotations.NotNull
    androidx.compose.foundation.lazy.LazyListScope $this$newsUI, @org.jetbrains.annotations.NotNull
    androidx.compose.material.ModalBottomSheetState bottomSheetState, @org.jetbrains.annotations.Nullable
    androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.news.dto.Article>> topHeadLinesData, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.Nullable
    androidx.compose.runtime.State<? extends java.util.List<com.sakethh.jetspacer.localDB.NewsDB>> bookMarkedData, @org.jetbrains.annotations.NotNull
    com.sakethh.jetspacer.screens.news.NewsBottomSheetContentImpl newsBottomSheetContentImpl, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
    com.sakethh.jetspacer.screens.bookMarks.BookMarksVM bookMarksVM) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void NewsBottomSheetContent(@org.jetbrains.annotations.NotNull
    com.sakethh.jetspacer.screens.news.NewsBottomSheetContentImpl newsBottomSheetContentImpl) {
    }
}
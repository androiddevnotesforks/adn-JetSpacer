package com.sakethh.jetspacer.screens.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\b\u001a\u00dd\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00052\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u001a\u0010\u001b\u001aN\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\u0006\u0010\n\u001a\u00020\u0005H\u0007\u001aM\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\u0006\u0010\"\u001a\u00020#2\b\b\u0003\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020#2\u0006\u0010\'\u001a\u00020%H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b(\u0010)\u001a\u001e\u0010*\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00052\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0007\u001a\u0091\u0001\u0010,\u001a\u00020\u00012\u0006\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00052\b\b\u0002\u0010/\u001a\u00020%2\b\b\u0002\u00100\u001a\u0002012\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u00102\u001a\u00020\f2\b\b\u0002\u00103\u001a\u00020\u00052\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u00105\u001a\u0004\u0018\u00010#2\n\b\u0002\u00106\u001a\u0004\u0018\u00010#2\b\b\u0002\u00107\u001a\u00020\u000e2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u000eH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b9\u0010:\u001a\u00c5\u0001\u0010;\u001a\u00020\u00012\u0006\u0010<\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u00052\u000e\b\u0002\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010@\u001a\u00020\u000e2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010#2\u0006\u0010C\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u00052\b\b\u0002\u0010E\u001a\u0002012\b\b\u0002\u0010F\u001a\u0002012\u000e\b\u0002\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010I\u001a\u00020\u000e2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010#H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\bL\u0010M\u001a&\u0010N\u001a\u00020\u00012\u0006\u0010O\u001a\u00020\u00052\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\u0006\u0010\u001f\u001a\u00020 H\u0007\u001a\u0010\u0010P\u001a\u00020\u00012\u0006\u0010Q\u001a\u00020RH\u0007\u001a&\u0010S\u001a\u00020\u00012\b\u0010T\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u00052\u0006\u0010V\u001a\u00020%H\u0007\u001a/\u0010W\u001a\u00020%*\u00020%2\u0006\u00104\u001a\u00020\u000e2\u0006\u00105\u001a\u00020#2\u0006\u00106\u001a\u00020#\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\bX\u0010Y\u0082\u0002\u000b\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006Z"}, d2 = {"APODCardComposable", "", "homeScreenViewModel", "Lcom/sakethh/jetspacer/screens/home/HomeScreenViewModel;", "imageURL", "", "apodHDImageURL", "apodDate", "apodDescription", "apodTitle", "apodMediaType", "cardTopPaddingValue", "Landroidx/compose/ui/unit/Dp;", "inBookMarkScreen", "", "inSpaceScreen", "imageOnClick", "Lkotlin/Function0;", "bookMarkedCategory", "changeDateChipOnClick", "inAPODBottomSheetContent", "onBookMarkButtonClick", "capturedOnSol", "capturedBy", "roverName", "onConfirmButtonClick", "APODCardComposable-KUi3TG8", "(Lcom/sakethh/jetspacer/screens/home/HomeScreenViewModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FZZLkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "APODMediaLayout", "hdImageURLForAPOD", "APODSideIconButton", "imageVector", "Landroidx/compose/ui/graphics/vector/ImageVector;", "onClick", "iconBtnColor", "Landroidx/compose/ui/graphics/Color;", "iconBtnModifier", "Landroidx/compose/ui/Modifier;", "iconColor", "iconModifier", "APODSideIconButton-lrywsJo", "(Landroidx/compose/ui/graphics/vector/ImageVector;Lkotlin/jvm/functions/Function0;JLandroidx/compose/ui/Modifier;JLandroidx/compose/ui/Modifier;)V", "AlertDialogForDeletingFromDB", "onConfirmBtnClick", "CardForRowGridRaw", "title", "value", "cardModifier", "cardColors", "Landroidx/compose/material3/CardColors;", "imageHeight", "imgURL", "visible", "color", "shimmerHighLightColor", "isShimmering", "singleRawCard", "CardForRowGridRaw-aadPK8o", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/CardColors;ZFLjava/lang/String;Ljava/lang/Boolean;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;ZLjava/lang/Boolean;)V", "CardRowGrid", "lhsCardTitle", "lhsCardValue", "lhsOnClick", "isLHSShimmerVisible", "isLHSShimmering", "lhsShimmerColor", "lhsShimmerHighlightColor", "rhsCardTitle", "rhsCardValue", "lhsCardColors", "rhsCardColors", "rhsOnClick", "isRHSShimmerVisible", "isRHSShimmering", "rhsShimmerColor", "rhsShimmerHighlightColor", "CardRowGrid-AcOeGFE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/Boolean;ZLandroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardColors;Lkotlin/jvm/functions/Function0;Ljava/lang/Boolean;ZLandroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;)V", "DropDownMenuItemModified", "text", "HomeScreen", "navController", "Landroidx/navigation/NavController;", "WebViewModified", "url", "embedString", "modifier", "shimmer", "shimmer-0YGnOg8", "(Landroidx/compose/ui/Modifier;ZJJ)Landroidx/compose/ui/Modifier;", "app_debug"})
public final class HomeScreenKt {
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material.ExperimentalMaterialApi.class})
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final void HomeScreen(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController) {
    }
    
    @androidx.compose.runtime.Composable
    @android.annotation.SuppressLint(value = {"SetJavaScriptEnabled"})
    public static final void WebViewModified(@org.jetbrains.annotations.Nullable
    java.lang.String url, @org.jetbrains.annotations.Nullable
    java.lang.String embedString, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void AlertDialogForDeletingFromDB(@org.jetbrains.annotations.NotNull
    java.lang.String bookMarkedCategory, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onConfirmBtnClick) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void DropDownMenuItemModified(@org.jetbrains.annotations.NotNull
    java.lang.String text, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.graphics.vector.ImageVector imageVector) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void APODMediaLayout(@org.jetbrains.annotations.NotNull
    com.sakethh.jetspacer.screens.home.HomeScreenViewModel homeScreenViewModel, @org.jetbrains.annotations.NotNull
    java.lang.String imageURL, @org.jetbrains.annotations.NotNull
    java.lang.String hdImageURLForAPOD, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onBookMarkButtonClick, boolean inAPODBottomSheetContent, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> imageOnClick, @org.jetbrains.annotations.NotNull
    java.lang.String apodMediaType) {
    }
}
package com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007\u001ad\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007\u001a.\u0010\u0015\u001a\u00020\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u0006H\u0007\u001a\n\u0010\u001a\u001a\u00020\u0006*\u00020\u001b\u00a8\u0006\u001c"}, d2 = {"ModifiedLazyVerticalGrid", "", "listData", "", "Lcom/sakethh/jetspacer/screens/space/rovers/curiosity/cameras/random/remote/data/dto/Photo;", "loadMoreButtonBooleanExpression", "", "onLoadMoreImagesBtnPress", "Lkotlin/Function0;", "RoverBottomSheetContent", "imgURL", "", "cameraName", "sol", "earthDate", "roverName", "roverStatus", "launchingDate", "landingDate", "onBookMarkButtonClick", "onConfirmBookMarkDeletionButtonClick", "SolTextField", "onContinueClick", "solValue", "Landroidx/compose/runtime/MutableState;", "inSettingsScreen", "atLastIndex", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "app_debug"})
public final class RandomCuriosityCameraScreenKt {
    
    @androidx.compose.runtime.Composable
    @android.annotation.SuppressLint(value = {"CoroutineCreationDuringComposition"})
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class, androidx.compose.foundation.ExperimentalFoundationApi.class})
    public static final void ModifiedLazyVerticalGrid(@org.jetbrains.annotations.NotNull
    java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo> listData, boolean loadMoreButtonBooleanExpression, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onLoadMoreImagesBtnPress) {
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.foundation.ExperimentalFoundationApi.class})
    public static final boolean atLastIndex(@org.jetbrains.annotations.NotNull
    androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState $this$atLastIndex) {
        return false;
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    public static final void SolTextField(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onContinueClick, @org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.String> solValue, boolean inSettingsScreen) {
    }
    
    @androidx.compose.runtime.Composable
    @android.annotation.SuppressLint(value = {"CoroutineCreationDuringComposition"})
    public static final void RoverBottomSheetContent(@org.jetbrains.annotations.NotNull
    java.lang.String imgURL, @org.jetbrains.annotations.NotNull
    java.lang.String cameraName, @org.jetbrains.annotations.NotNull
    java.lang.String sol, @org.jetbrains.annotations.NotNull
    java.lang.String earthDate, @org.jetbrains.annotations.NotNull
    java.lang.String roverName, @org.jetbrains.annotations.NotNull
    java.lang.String roverStatus, @org.jetbrains.annotations.NotNull
    java.lang.String launchingDate, @org.jetbrains.annotations.NotNull
    java.lang.String landingDate, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onBookMarkButtonClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onConfirmBookMarkDeletionButtonClick) {
    }
}
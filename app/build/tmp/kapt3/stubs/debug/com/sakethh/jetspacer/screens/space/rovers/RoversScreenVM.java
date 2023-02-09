package com.sakethh.jetspacer.screens.space.rovers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001%B\u0005\u00a2\u0006\u0002\u0010\u0002JN\u0010#\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0007R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0007R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0007\u00a8\u0006&"}, d2 = {"Lcom/sakethh/jetspacer/screens/space/rovers/RoversScreenVM;", "Landroidx/lifecycle/ViewModel;", "()V", "cameraName", "Landroidx/compose/runtime/MutableState;", "", "getCameraName", "()Landroidx/compose/runtime/MutableState;", "capturedOn", "getCapturedOn", "curiosityRoverCameras", "", "Lcom/sakethh/jetspacer/screens/space/rovers/RoverCameras;", "getCuriosityRoverCameras", "()Ljava/util/List;", "earthDate", "getEarthDate", "imgURL", "getImgURL", "landingDate", "getLandingDate", "launchingDate", "getLaunchingDate", "listForDrawerContent", "Lcom/sakethh/jetspacer/screens/space/rovers/RoversScreen;", "getListForDrawerContent", "roverName", "getRoverName", "roverStatus", "getRoverStatus", "shouldBtmSheetVisible", "", "getShouldBtmSheetVisible", "sol", "getSol", "openRoverBtmSheet", "", "RoverScreenUtils", "app_debug"})
public final class RoversScreenVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.sakethh.jetspacer.screens.space.rovers.RoversScreen> listForDrawerContent = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.sakethh.jetspacer.screens.space.rovers.RoverCameras> curiosityRoverCameras = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.String> imgURL = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.String> capturedOn = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.String> cameraName = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.String> sol = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.String> earthDate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.String> roverName = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.String> roverStatus = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.String> launchingDate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.String> landingDate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> shouldBtmSheetVisible = null;
    
    public RoversScreenVM() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sakethh.jetspacer.screens.space.rovers.RoversScreen> getListForDrawerContent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sakethh.jetspacer.screens.space.rovers.RoverCameras> getCuriosityRoverCameras() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.String> getImgURL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.String> getCapturedOn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.String> getCameraName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.String> getSol() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.String> getEarthDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.String> getRoverName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.String> getRoverStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.String> getLaunchingDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.String> getLandingDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> getShouldBtmSheetVisible() {
        return null;
    }
    
    public final void openRoverBtmSheet(@org.jetbrains.annotations.NotNull
    java.lang.String imgURL, @org.jetbrains.annotations.NotNull
    java.lang.String capturedOn, @org.jetbrains.annotations.NotNull
    java.lang.String cameraName, @org.jetbrains.annotations.NotNull
    java.lang.String sol, @org.jetbrains.annotations.NotNull
    java.lang.String earthDate, @org.jetbrains.annotations.NotNull
    java.lang.String roverName, @org.jetbrains.annotations.NotNull
    java.lang.String roverStatus, @org.jetbrains.annotations.NotNull
    java.lang.String launchingDate, @org.jetbrains.annotations.NotNull
    java.lang.String landingDate) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007\u00a8\u0006\r"}, d2 = {"Lcom/sakethh/jetspacer/screens/space/rovers/RoversScreenVM$RoverScreenUtils;", "", "()V", "atLastIndexInLazyVerticalGrid", "Landroidx/compose/runtime/MutableState;", "", "getAtLastIndexInLazyVerticalGrid", "()Landroidx/compose/runtime/MutableState;", "atNearlyLastImageAtLastSolPage", "getAtNearlyLastImageAtLastSolPage", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "getPaddingValues", "app_debug"})
    public static final class RoverScreenUtils {
        @org.jetbrains.annotations.NotNull
        public static final com.sakethh.jetspacer.screens.space.rovers.RoversScreenVM.RoverScreenUtils INSTANCE = null;
        @org.jetbrains.annotations.NotNull
        private static final androidx.compose.runtime.MutableState<androidx.compose.foundation.layout.PaddingValues> paddingValues = null;
        @org.jetbrains.annotations.NotNull
        private static final androidx.compose.runtime.MutableState<java.lang.Boolean> atLastIndexInLazyVerticalGrid = null;
        @org.jetbrains.annotations.NotNull
        private static final androidx.compose.runtime.MutableState<java.lang.Boolean> atNearlyLastImageAtLastSolPage = null;
        
        private RoverScreenUtils() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.compose.runtime.MutableState<androidx.compose.foundation.layout.PaddingValues> getPaddingValues() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.compose.runtime.MutableState<java.lang.Boolean> getAtLastIndexInLazyVerticalGrid() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.compose.runtime.MutableState<java.lang.Boolean> getAtNearlyLastImageAtLastSolPage() {
            return null;
        }
    }
}
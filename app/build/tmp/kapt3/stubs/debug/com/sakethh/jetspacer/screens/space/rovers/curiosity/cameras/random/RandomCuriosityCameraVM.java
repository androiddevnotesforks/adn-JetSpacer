package com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0012\u001a\u00020\u0013J!\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/sakethh/jetspacer/screens/space/rovers/curiosity/cameras/random/RandomCuriosityCameraVM;", "Landroidx/lifecycle/ViewModel;", "randomCameraCuriosityFetching", "Lcom/sakethh/jetspacer/screens/space/rovers/curiosity/cameras/random/remote/data/RandomCameraCuriosityFetching;", "(Lcom/sakethh/jetspacer/screens/space/rovers/curiosity/cameras/random/remote/data/RandomCameraCuriosityFetching;)V", "_randomCuriosityCameraData", "Landroidx/compose/runtime/MutableState;", "", "Lcom/sakethh/jetspacer/screens/space/rovers/curiosity/cameras/random/remote/data/dto/Photo;", "get_randomCuriosityCameraData", "()Landroidx/compose/runtime/MutableState;", "currentPage", "", "getCurrentPage", "isRandomCamerasDataLoaded", "", "randomCuriosityCameraData", "getRandomCuriosityCameraData", "clearRandomCuriosityCameraData", "", "getRandomCuriosityData", "sol", "page", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RandomCuriosityCameraVM extends androidx.lifecycle.ViewModel {
    private final com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.RandomCameraCuriosityFetching randomCameraCuriosityFetching = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> _randomCuriosityCameraData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> randomCuriosityCameraData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> isRandomCamerasDataLoaded = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.Integer> currentPage = null;
    
    public RandomCuriosityCameraVM() {
        super();
    }
    
    public RandomCuriosityCameraVM(@org.jetbrains.annotations.NotNull
    com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.RandomCameraCuriosityFetching randomCameraCuriosityFetching) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> get_randomCuriosityCameraData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> getRandomCuriosityCameraData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> isRandomCamerasDataLoaded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.Integer> getCurrentPage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getRandomCuriosityData(int sol, int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void clearRandomCuriosityCameraData() {
    }
}
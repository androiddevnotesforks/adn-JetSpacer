package com.sakethh.jetspacer.screens.space;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0011\u0010\u0016\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/sakethh/jetspacer/screens/space/SpaceScreenVM;", "Landroidx/lifecycle/ViewModel;", "spaceScreenImplementation", "Lcom/sakethh/jetspacer/screens/space/remote/data/SpaceScreenImplementation;", "apodFetching", "Lcom/sakethh/jetspacer/screens/home/data/remote/apod/APODFetching;", "(Lcom/sakethh/jetspacer/screens/space/remote/data/SpaceScreenImplementation;Lcom/sakethh/jetspacer/screens/home/data/remote/apod/APODFetching;)V", "apodDateData", "Landroidx/compose/runtime/MutableState;", "Lcom/sakethh/jetspacer/screens/home/data/remote/apod/dto/APOD_DTO;", "getApodDateData", "()Landroidx/compose/runtime/MutableState;", "coroutineExceptionalHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "marsWeatherDTO", "Lcom/sakethh/jetspacer/screens/space/remote/data/marsWeather/dto/MarsWeatherDTO;", "getMarsWeatherDTO", "getAPODDateData", "", "apodDateForURL", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class SpaceScreenVM extends androidx.lifecycle.ViewModel {
    private final com.sakethh.jetspacer.screens.space.remote.data.SpaceScreenImplementation spaceScreenImplementation = null;
    private final com.sakethh.jetspacer.screens.home.data.remote.apod.APODFetching apodFetching = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.sakethh.jetspacer.screens.home.data.remote.apod.dto.APOD_DTO> apodDateData = null;
    private final kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionalHandler = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.sakethh.jetspacer.screens.space.remote.data.marsWeather.dto.MarsWeatherDTO> marsWeatherDTO = null;
    
    public SpaceScreenVM() {
        super();
    }
    
    public SpaceScreenVM(@org.jetbrains.annotations.NotNull
    com.sakethh.jetspacer.screens.space.remote.data.SpaceScreenImplementation spaceScreenImplementation, @org.jetbrains.annotations.NotNull
    com.sakethh.jetspacer.screens.home.data.remote.apod.APODFetching apodFetching) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<com.sakethh.jetspacer.screens.home.data.remote.apod.dto.APOD_DTO> getApodDateData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<com.sakethh.jetspacer.screens.space.remote.data.marsWeather.dto.MarsWeatherDTO> getMarsWeatherDTO() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object loadData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getAPODDateData(@org.jetbrains.annotations.NotNull
    java.lang.String apodDateForURL, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}
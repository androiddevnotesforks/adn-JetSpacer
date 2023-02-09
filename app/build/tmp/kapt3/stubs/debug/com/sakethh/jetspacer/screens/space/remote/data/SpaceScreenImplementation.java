package com.sakethh.jetspacer.screens.space.remote.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/sakethh/jetspacer/screens/space/remote/data/SpaceScreenImplementation;", "Lcom/sakethh/jetspacer/screens/space/remote/data/SpaceScreenService;", "()V", "getAPODSpecificDateData", "Lcom/sakethh/jetspacer/screens/home/data/remote/apod/dto/APOD_DTO;", "apodDateForURL", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMarsWeatherData", "Lcom/sakethh/jetspacer/screens/space/remote/data/marsWeather/dto/MarsWeatherDTO;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class SpaceScreenImplementation implements com.sakethh.jetspacer.screens.space.remote.data.SpaceScreenService {
    
    public SpaceScreenImplementation() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getAPODSpecificDateData(@org.jetbrains.annotations.NotNull
    java.lang.String apodDateForURL, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.sakethh.jetspacer.screens.home.data.remote.apod.dto.APOD_DTO> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getMarsWeatherData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.sakethh.jetspacer.screens.space.remote.data.marsWeather.dto.MarsWeatherDTO> continuation) {
        return null;
    }
}
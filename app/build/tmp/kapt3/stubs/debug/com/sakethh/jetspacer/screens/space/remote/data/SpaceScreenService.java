package com.sakethh.jetspacer.screens.space.remote.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/sakethh/jetspacer/screens/space/remote/data/SpaceScreenService;", "", "getAPODSpecificDateData", "Lcom/sakethh/jetspacer/screens/home/data/remote/apod/dto/APOD_DTO;", "apodDateForURL", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMarsWeatherData", "Lcom/sakethh/jetspacer/screens/space/remote/data/marsWeather/dto/MarsWeatherDTO;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface SpaceScreenService {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAPODSpecificDateData(@org.jetbrains.annotations.NotNull
    java.lang.String apodDateForURL, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.sakethh.jetspacer.screens.home.data.remote.apod.dto.APOD_DTO> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMarsWeatherData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.sakethh.jetspacer.screens.space.remote.data.marsWeather.dto.MarsWeatherDTO> continuation);
}
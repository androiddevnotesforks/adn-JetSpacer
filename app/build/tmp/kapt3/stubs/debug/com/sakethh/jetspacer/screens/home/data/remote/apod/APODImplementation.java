package com.sakethh.jetspacer.screens.home.data.remote.apod;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/sakethh/jetspacer/screens/home/data/remote/apod/APODImplementation;", "Lcom/sakethh/jetspacer/screens/home/data/remote/apod/APODService;", "ktorClient", "Lio/ktor/client/HttpClient;", "apodURL", "", "(Lio/ktor/client/HttpClient;Ljava/lang/String;)V", "getAPOD", "Lcom/sakethh/jetspacer/screens/home/data/remote/apod/dto/APOD_DTO;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAPODForPaginatedList", "", "app_debug"})
public final class APODImplementation implements com.sakethh.jetspacer.screens.home.data.remote.apod.APODService {
    private final io.ktor.client.HttpClient ktorClient = null;
    private final java.lang.String apodURL = null;
    
    public APODImplementation(@org.jetbrains.annotations.NotNull
    io.ktor.client.HttpClient ktorClient, @org.jetbrains.annotations.NotNull
    java.lang.String apodURL) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getAPOD(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.sakethh.jetspacer.screens.home.data.remote.apod.dto.APOD_DTO> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getAPODForPaginatedList(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<? extends java.util.List<com.sakethh.jetspacer.screens.home.data.remote.apod.dto.APOD_DTO>>> continuation) {
        return null;
    }
}
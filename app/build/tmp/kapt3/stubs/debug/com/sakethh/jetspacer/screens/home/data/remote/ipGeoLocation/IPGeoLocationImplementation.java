package com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/sakethh/jetspacer/screens/home/data/remote/ipGeoLocation/IPGeoLocationImplementation;", "Lcom/sakethh/jetspacer/screens/home/data/remote/ipGeoLocation/IPGeolocationService;", "httpClient", "Lio/ktor/client/HttpClient;", "(Lio/ktor/client/HttpClient;)V", "getGeoLocationData", "Lcom/sakethh/jetspacer/screens/home/data/remote/ipGeoLocation/dto/IPGeoLocationDTO;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class IPGeoLocationImplementation implements com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.IPGeolocationService {
    private final io.ktor.client.HttpClient httpClient = null;
    
    public IPGeoLocationImplementation(@org.jetbrains.annotations.NotNull
    io.ktor.client.HttpClient httpClient) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getGeoLocationData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.dto.IPGeoLocationDTO> continuation) {
        return null;
    }
}
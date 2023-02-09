package com.sakethh.jetspacer.screens.home.data.remote.apod;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/sakethh/jetspacer/screens/home/data/remote/apod/APODService;", "", "getAPOD", "Lcom/sakethh/jetspacer/screens/home/data/remote/apod/dto/APOD_DTO;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAPODForPaginatedList", "", "app_debug"})
public abstract interface APODService {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAPOD(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.sakethh.jetspacer.screens.home.data.remote.apod.dto.APOD_DTO> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAPODForPaginatedList(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<? extends java.util.List<com.sakethh.jetspacer.screens.home.data.remote.apod.dto.APOD_DTO>>> continuation);
}
package com.sakethh.jetspacer.screens.space.apod;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0011\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0011\u0010\u0014\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/sakethh/jetspacer/screens/space/apod/APODScreenVM;", "Landroidx/lifecycle/ViewModel;", "apodPaginationFetching", "Lcom/sakethh/jetspacer/screens/space/apod/remote/data/APODPaginationFetching;", "(Lcom/sakethh/jetspacer/screens/space/apod/remote/data/APODPaginationFetching;)V", "_dataForAPODPagination", "Landroidx/compose/runtime/MutableState;", "", "Lcom/sakethh/jetspacer/screens/home/data/remote/apod/dto/APOD_DTO;", "get_dataForAPODPagination", "()Landroidx/compose/runtime/MutableState;", "coroutineExceptionalHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "dataForPagination", "getDataForPagination", "isDataForAPODPaginationLoaded", "", "fetchAPODData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshData", "app_debug"})
public final class APODScreenVM extends androidx.lifecycle.ViewModel {
    private final com.sakethh.jetspacer.screens.space.apod.remote.data.APODPaginationFetching apodPaginationFetching = null;
    private final kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionalHandler = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.home.data.remote.apod.dto.APOD_DTO>> _dataForAPODPagination = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.home.data.remote.apod.dto.APOD_DTO>> dataForPagination = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> isDataForAPODPaginationLoaded = null;
    
    public APODScreenVM() {
        super();
    }
    
    public APODScreenVM(@org.jetbrains.annotations.NotNull
    com.sakethh.jetspacer.screens.space.apod.remote.data.APODPaginationFetching apodPaginationFetching) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.home.data.remote.apod.dto.APOD_DTO>> get_dataForAPODPagination() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.home.data.remote.apod.dto.APOD_DTO>> getDataForPagination() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> isDataForAPODPaginationLoaded() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchAPODData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object refreshData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}
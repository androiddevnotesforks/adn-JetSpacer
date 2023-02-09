package com.sakethh.jetspacer.screens.space.apod.remote.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0006H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/sakethh/jetspacer/screens/space/apod/remote/data/APODPaginationFetching;", "", "apodImplementation", "Lcom/sakethh/jetspacer/screens/home/data/remote/apod/APODImplementation;", "(Lcom/sakethh/jetspacer/screens/home/data/remote/apod/APODImplementation;)V", "getPaginatedAPODATA", "", "Lcom/sakethh/jetspacer/screens/home/data/remote/apod/dto/APOD_DTO;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "APODPaginationUtils", "app_debug"})
public final class APODPaginationFetching {
    private final com.sakethh.jetspacer.screens.home.data.remote.apod.APODImplementation apodImplementation = null;
    
    public APODPaginationFetching() {
        super();
    }
    
    public APODPaginationFetching(@org.jetbrains.annotations.NotNull
    com.sakethh.jetspacer.screens.home.data.remote.apod.APODImplementation apodImplementation) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public final java.lang.Object getPaginatedAPODATA(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<? extends java.util.List<com.sakethh.jetspacer.screens.home.data.remote.apod.dto.APOD_DTO>>> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016\u00a8\u0006\u001a"}, d2 = {"Lcom/sakethh/jetspacer/screens/space/apod/remote/data/APODPaginationFetching$APODPaginationUtils;", "", "()V", "calendar", "Ljava/util/Calendar;", "getCalendar", "()Ljava/util/Calendar;", "currentAPODDate", "", "getCurrentAPODDate", "()Ljava/lang/String;", "setCurrentAPODDate", "(Ljava/lang/String;)V", "currentFetchedCount", "Landroidx/compose/runtime/MutableState;", "", "getCurrentFetchedCount", "()Landroidx/compose/runtime/MutableState;", "initialFetchingValue", "getInitialFetchingValue", "()I", "setInitialFetchingValue", "(I)V", "primaryInitForAPODEndDate", "getPrimaryInitForAPODEndDate", "setPrimaryInitForAPODEndDate", "app_debug"})
    public static final class APODPaginationUtils {
        @org.jetbrains.annotations.NotNull
        public static final com.sakethh.jetspacer.screens.space.apod.remote.data.APODPaginationFetching.APODPaginationUtils INSTANCE = null;
        @org.jetbrains.annotations.NotNull
        private static final java.util.Calendar calendar = null;
        @org.jetbrains.annotations.NotNull
        private static final androidx.compose.runtime.MutableState<java.lang.Integer> currentFetchedCount = null;
        private static int initialFetchingValue = 0;
        @org.jetbrains.annotations.NotNull
        private static java.lang.String currentAPODDate = "";
        private static int primaryInitForAPODEndDate = 0;
        
        private APODPaginationUtils() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Calendar getCalendar() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.compose.runtime.MutableState<java.lang.Integer> getCurrentFetchedCount() {
            return null;
        }
        
        public final int getInitialFetchingValue() {
            return 0;
        }
        
        public final void setInitialFetchingValue(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getCurrentAPODDate() {
            return null;
        }
        
        public final void setCurrentAPODDate(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
        
        public final int getPrimaryInitForAPODEndDate() {
            return 0;
        }
        
        public final void setPrimaryInitForAPODEndDate(int p0) {
        }
    }
}
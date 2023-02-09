package com.sakethh.jetspacer.screens.home;

import java.lang.System;

@android.annotation.SuppressLint(value = {"LongLogTag"})
@kotlin.Suppress(names = {"ObjectPropertyName"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0002*+B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0011\u0010&\u001a\u00020\'H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J\u0011\u0010)\u001a\u00020\'H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0012R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006,"}, d2 = {"Lcom/sakethh/jetspacer/screens/home/HomeScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "ipGeolocationFetching", "Lcom/sakethh/jetspacer/screens/home/data/remote/ipGeoLocation/IPGeolocationFetching;", "issLocationFetching", "Lcom/sakethh/jetspacer/screens/home/data/remote/issLocation/ISSLocationFetching;", "apodFetching", "Lcom/sakethh/jetspacer/screens/home/data/remote/apod/APODFetching;", "(Lcom/sakethh/jetspacer/screens/home/data/remote/ipGeoLocation/IPGeolocationFetching;Lcom/sakethh/jetspacer/screens/home/data/remote/issLocation/ISSLocationFetching;Lcom/sakethh/jetspacer/screens/home/data/remote/apod/APODFetching;)V", "_astronomicalDataFromAPIFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/sakethh/jetspacer/screens/home/data/remote/ipGeoLocation/dto/IPGeoLocationDTO;", "_issLocationFromAPIFlow", "Lcom/sakethh/jetspacer/screens/home/data/remote/issLocation/dto/ISSLocationDTO;", "apodDataFromAPI", "Landroidx/compose/runtime/MutableState;", "Lcom/sakethh/jetspacer/screens/home/data/remote/apod/dto/APOD_DTO;", "getApodDataFromAPI", "()Landroidx/compose/runtime/MutableState;", "astronomicalDataFromAPIFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getAstronomicalDataFromAPIFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "coroutineExceptionalHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "currentPhaseOfDay", "", "getCurrentPhaseOfDay", "()Ljava/lang/String;", "setCurrentPhaseOfDay", "(Ljava/lang/String;)V", "doesAPODExistsInDB", "", "getDoesAPODExistsInDB", "geolocationDTODataFromAPI", "getGeolocationDTODataFromAPI", "issLocationFromAPIFlow", "getIssLocationFromAPIFlow", "getAPODData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadData", "BookMarkUtils", "Network", "app_debug"})
public class HomeScreenViewModel extends androidx.lifecycle.ViewModel {
    private final com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.IPGeolocationFetching ipGeolocationFetching = null;
    private final com.sakethh.jetspacer.screens.home.data.remote.issLocation.ISSLocationFetching issLocationFetching = null;
    private final com.sakethh.jetspacer.screens.home.data.remote.apod.APODFetching apodFetching = null;
    @org.jetbrains.annotations.NotNull
    private java.lang.String currentPhaseOfDay = "";
    private final kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionalHandler = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.dto.IPGeoLocationDTO> geolocationDTODataFromAPI = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.dto.IPGeoLocationDTO> _astronomicalDataFromAPIFlow = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.dto.IPGeoLocationDTO> astronomicalDataFromAPIFlow = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.sakethh.jetspacer.screens.home.data.remote.issLocation.dto.ISSLocationDTO> _issLocationFromAPIFlow = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.sakethh.jetspacer.screens.home.data.remote.issLocation.dto.ISSLocationDTO> issLocationFromAPIFlow = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.sakethh.jetspacer.screens.home.data.remote.apod.dto.APOD_DTO> apodDataFromAPI = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> doesAPODExistsInDB = null;
    
    public HomeScreenViewModel() {
        super();
    }
    
    public HomeScreenViewModel(@org.jetbrains.annotations.NotNull
    com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.IPGeolocationFetching ipGeolocationFetching, @org.jetbrains.annotations.NotNull
    com.sakethh.jetspacer.screens.home.data.remote.issLocation.ISSLocationFetching issLocationFetching, @org.jetbrains.annotations.NotNull
    com.sakethh.jetspacer.screens.home.data.remote.apod.APODFetching apodFetching) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCurrentPhaseOfDay() {
        return null;
    }
    
    public final void setCurrentPhaseOfDay(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.dto.IPGeoLocationDTO> getGeolocationDTODataFromAPI() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.dto.IPGeoLocationDTO> getAstronomicalDataFromAPIFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.sakethh.jetspacer.screens.home.data.remote.issLocation.dto.ISSLocationDTO> getIssLocationFromAPIFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<com.sakethh.jetspacer.screens.home.data.remote.apod.dto.APOD_DTO> getApodDataFromAPI() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> getDoesAPODExistsInDB() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object loadData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getAPODData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/sakethh/jetspacer/screens/home/HomeScreenViewModel$Network;", "", "()V", "_connectedToInternet", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "connectedToInternet", "Lkotlinx/coroutines/flow/StateFlow;", "getConnectedToInternet", "()Lkotlinx/coroutines/flow/StateFlow;", "isConnectionSucceed", "Landroidx/compose/runtime/MutableState;", "()Landroidx/compose/runtime/MutableState;", "isConnectedToInternet", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    public static final class Network {
        @org.jetbrains.annotations.NotNull
        public static final com.sakethh.jetspacer.screens.home.HomeScreenViewModel.Network INSTANCE = null;
        private static final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _connectedToInternet = null;
        @org.jetbrains.annotations.NotNull
        private static final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> connectedToInternet = null;
        @org.jetbrains.annotations.NotNull
        private static final androidx.compose.runtime.MutableState<java.lang.Boolean> isConnectionSucceed = null;
        
        private Network() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getConnectedToInternet() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.compose.runtime.MutableState<java.lang.Boolean> isConnectionSucceed() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object isConnectedToInternet(@org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/sakethh/jetspacer/screens/home/HomeScreenViewModel$BookMarkUtils;", "", "()V", "isAlertDialogEnabledForAPODDB", "Landroidx/compose/runtime/MutableState;", "", "()Landroidx/compose/runtime/MutableState;", "isAlertDialogEnabledForRoversDB", "app_debug"})
    public static final class BookMarkUtils {
        @org.jetbrains.annotations.NotNull
        public static final com.sakethh.jetspacer.screens.home.HomeScreenViewModel.BookMarkUtils INSTANCE = null;
        @org.jetbrains.annotations.NotNull
        private static final androidx.compose.runtime.MutableState<java.lang.Boolean> isAlertDialogEnabledForAPODDB = null;
        @org.jetbrains.annotations.NotNull
        private static final androidx.compose.runtime.MutableState<java.lang.Boolean> isAlertDialogEnabledForRoversDB = null;
        
        private BookMarkUtils() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.compose.runtime.MutableState<java.lang.Boolean> isAlertDialogEnabledForAPODDB() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.compose.runtime.MutableState<java.lang.Boolean> isAlertDialogEnabledForRoversDB() {
            return null;
        }
    }
}
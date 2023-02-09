package com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001>B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202J!\u00103\u001a\u0002002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000205H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J!\u00108\u001a\u0002002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000205H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J!\u00109\u001a\u0002002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000205H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J!\u0010:\u001a\u0002002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000205H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J!\u0010;\u001a\u0002002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000205H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J!\u0010<\u001a\u0002002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000205H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J!\u0010=\u001a\u0002002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000205H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\fR\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\fR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\fR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\fR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\fR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\fR\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\fR\u001d\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\fR\u001d\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\fR\u001d\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\fR\u001d\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006?"}, d2 = {"Lcom/sakethh/jetspacer/screens/space/rovers/curiosity/cameras/CuriosityCamerasVM;", "Landroidx/lifecycle/ViewModel;", "randomCuriosityCameraVM", "Lcom/sakethh/jetspacer/screens/space/rovers/curiosity/cameras/random/RandomCuriosityCameraVM;", "curiosityCamerasImplementation", "Lcom/sakethh/jetspacer/screens/space/rovers/curiosity/cameras/CuriosityCamerasImplementation;", "(Lcom/sakethh/jetspacer/screens/space/rovers/curiosity/cameras/random/RandomCuriosityCameraVM;Lcom/sakethh/jetspacer/screens/space/rovers/curiosity/cameras/CuriosityCamerasImplementation;)V", "_chemcamDataFromAPI", "Landroidx/compose/runtime/MutableState;", "", "Lcom/sakethh/jetspacer/screens/space/rovers/curiosity/cameras/random/remote/data/dto/Photo;", "get_chemcamDataFromAPI", "()Landroidx/compose/runtime/MutableState;", "_fhazDataFromAPI", "get_fhazDataFromAPI", "_mahliDataFromAPI", "get_mahliDataFromAPI", "_mardiDataFromAPI", "get_mardiDataFromAPI", "_mastDataFromAPI", "get_mastDataFromAPI", "_navcamDataFromAPI", "get_navcamDataFromAPI", "_rhazDataFromAPI", "get_rhazDataFromAPI", "chemcamDataFromAPI", "getChemcamDataFromAPI", "fhazDataFromAPI", "getFhazDataFromAPI", "isChemCamDataLoaded", "", "isFHAZDataLoaded", "isMAHLIDataLoaded", "isMARDIDataLoaded", "isMASTCamDataLoaded", "isNAVCAMDataLoaded", "isRHAZCamDataLoaded", "mahliDataFromAPI", "getMahliDataFromAPI", "mardiDataFromAPI", "getMardiDataFromAPI", "mastDataFromAPI", "getMastDataFromAPI", "navcamDataFromAPI", "getNavcamDataFromAPI", "rhazDataFromAPI", "getRhazDataFromAPI", "clearCuriosityCameraData", "", "cameraName", "Lcom/sakethh/jetspacer/screens/space/rovers/curiosity/cameras/CuriosityCamerasVM$CuriosityCameras;", "getCHEMCAMData", "sol", "", "page", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFHAZData", "getMAHLIData", "getMARDIData", "getMASTData", "getNAVCAMData", "getRHAZData", "CuriosityCameras", "app_debug"})
public final class CuriosityCamerasVM extends androidx.lifecycle.ViewModel {
    private final com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.RandomCuriosityCameraVM randomCuriosityCameraVM = null;
    private final com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.CuriosityCamerasImplementation curiosityCamerasImplementation = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> _fhazDataFromAPI = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> fhazDataFromAPI = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> isFHAZDataLoaded = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> _rhazDataFromAPI = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> rhazDataFromAPI = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> isRHAZCamDataLoaded = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> _mastDataFromAPI = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> mastDataFromAPI = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> isMASTCamDataLoaded = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> _chemcamDataFromAPI = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> chemcamDataFromAPI = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> isChemCamDataLoaded = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> _mahliDataFromAPI = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> mahliDataFromAPI = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> isMAHLIDataLoaded = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> _mardiDataFromAPI = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> mardiDataFromAPI = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> isMARDIDataLoaded = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> _navcamDataFromAPI = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> navcamDataFromAPI = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> isNAVCAMDataLoaded = null;
    
    public CuriosityCamerasVM() {
        super();
    }
    
    public CuriosityCamerasVM(@org.jetbrains.annotations.NotNull
    com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.RandomCuriosityCameraVM randomCuriosityCameraVM, @org.jetbrains.annotations.NotNull
    com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.CuriosityCamerasImplementation curiosityCamerasImplementation) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> get_fhazDataFromAPI() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> getFhazDataFromAPI() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> isFHAZDataLoaded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> get_rhazDataFromAPI() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> getRhazDataFromAPI() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> isRHAZCamDataLoaded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> get_mastDataFromAPI() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> getMastDataFromAPI() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> isMASTCamDataLoaded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> get_chemcamDataFromAPI() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> getChemcamDataFromAPI() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> isChemCamDataLoaded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> get_mahliDataFromAPI() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> getMahliDataFromAPI() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> isMAHLIDataLoaded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> get_mardiDataFromAPI() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> getMardiDataFromAPI() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> isMARDIDataLoaded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> get_navcamDataFromAPI() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> getNavcamDataFromAPI() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> isNAVCAMDataLoaded() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getFHAZData(int sol, int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getRHAZData(int sol, int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getMASTData(int sol, int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getCHEMCAMData(int sol, int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getMAHLIData(int sol, int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getMARDIData(int sol, int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getNAVCAMData(int sol, int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void clearCuriosityCameraData(@org.jetbrains.annotations.NotNull
    com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.CuriosityCamerasVM.CuriosityCameras cameraName) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lcom/sakethh/jetspacer/screens/space/rovers/curiosity/cameras/CuriosityCamerasVM$CuriosityCameras;", "", "(Ljava/lang/String;I)V", "FHAZ", "RHAZ", "MAST", "CHEMCAM", "MAHLI", "MARDI", "NAVCAM", "RANDOM", "app_debug"})
    public static enum CuriosityCameras {
        /*public static final*/ FHAZ /* = new FHAZ() */,
        /*public static final*/ RHAZ /* = new RHAZ() */,
        /*public static final*/ MAST /* = new MAST() */,
        /*public static final*/ CHEMCAM /* = new CHEMCAM() */,
        /*public static final*/ MAHLI /* = new MAHLI() */,
        /*public static final*/ MARDI /* = new MARDI() */,
        /*public static final*/ NAVCAM /* = new NAVCAM() */,
        /*public static final*/ RANDOM /* = new RANDOM() */;
        
        CuriosityCameras() {
        }
    }
}
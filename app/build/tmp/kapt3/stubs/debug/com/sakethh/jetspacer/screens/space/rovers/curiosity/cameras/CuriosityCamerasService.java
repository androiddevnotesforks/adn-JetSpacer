package com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\'\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\'\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\'\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\'\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/sakethh/jetspacer/screens/space/rovers/curiosity/cameras/CuriosityCamerasService;", "", "getCHEMCAMData", "", "Lcom/sakethh/jetspacer/screens/space/rovers/curiosity/cameras/random/remote/data/dto/Photo;", "sol", "", "page", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFHAZData", "getMAHLIData", "getMARDIData", "getMASTData", "getNAVCAMData", "getRHAZData", "app_debug"})
public abstract interface CuriosityCamerasService {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getFHAZData(int sol, int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getRHAZData(int sol, int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMASTData(int sol, int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCHEMCAMData(int sol, int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMAHLIData(int sol, int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMARDIData(int sol, int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getNAVCAMData(int sol, int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> continuation);
}
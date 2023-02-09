package com.sakethh.jetspacer.screens.space.rovers.opportunity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\'\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\'\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\'\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\'\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ!\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/sakethh/jetspacer/screens/space/rovers/opportunity/OpportunityCamerasService;", "", "getFHAZData", "", "Lcom/sakethh/jetspacer/screens/space/rovers/curiosity/cameras/random/remote/data/dto/Photo;", "sol", "", "page", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMINITESData", "getNAVCAMData", "getPANCAMData", "getRHAZData", "getRandomCamerasData", "Lcom/sakethh/jetspacer/screens/space/rovers/curiosity/cameras/random/remote/data/dto/RandomCameraDTO;", "app_debug"})
public abstract interface OpportunityCamerasService {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getRandomCamerasData(int sol, int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.RandomCameraDTO> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getFHAZData(int sol, int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getRHAZData(int sol, int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getNAVCAMData(int sol, int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getPANCAMData(int sol, int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMINITESData(int sol, int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.Photo>> continuation);
}
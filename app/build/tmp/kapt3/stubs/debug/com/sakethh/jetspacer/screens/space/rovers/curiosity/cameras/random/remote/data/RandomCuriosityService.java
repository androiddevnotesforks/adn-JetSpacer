package com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/sakethh/jetspacer/screens/space/rovers/curiosity/cameras/random/remote/data/RandomCuriosityService;", "", "getRandomCuriosityData", "Lcom/sakethh/jetspacer/screens/space/rovers/curiosity/cameras/random/remote/data/dto/RandomCameraDTO;", "sol", "", "page", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface RandomCuriosityService {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getRandomCuriosityData(int sol, int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.sakethh.jetspacer.screens.space.rovers.curiosity.cameras.random.remote.data.dto.RandomCameraDTO> continuation);
}
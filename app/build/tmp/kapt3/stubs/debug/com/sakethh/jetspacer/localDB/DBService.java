package com.sakethh.jetspacer.localDB;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0011\u0010\u0013\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0011\u0010\u0015\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0011\u0010\u0016\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0019H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0019H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0019\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0019H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0019\u0010\"\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u0019H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0019\u0010#\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u0019H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0019\u0010$\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u0019H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050&H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0014\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0&0(H\'J\u0014\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0&0(H\'J\u0014\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110&0(H\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006+"}, d2 = {"Lcom/sakethh/jetspacer/localDB/DBService;", "", "addAPIKeys", "", "apiKeysDB", "Lcom/sakethh/jetspacer/localDB/APIKeysDB;", "(Lcom/sakethh/jetspacer/localDB/APIKeysDB;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addNewBookMarkToAPODDB", "apodDbDto", "Lcom/sakethh/jetspacer/localDB/APOD_DB_DTO;", "(Lcom/sakethh/jetspacer/localDB/APOD_DB_DTO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addNewBookMarkToNewsDB", "newsDB", "Lcom/sakethh/jetspacer/localDB/NewsDB;", "(Lcom/sakethh/jetspacer/localDB/NewsDB;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addNewBookMarkToRoverDB", "marsRoverDbDto", "Lcom/sakethh/jetspacer/localDB/MarsRoversDBDTO;", "(Lcom/sakethh/jetspacer/localDB/MarsRoversDBDTO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllDataFromAPODDB", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllDataFromMarsDB", "deleteAllDataFromNewsDB", "deleteFromAPODDB", "imageURL", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFromNewsDB", "sourceURL", "deleteFromRoverDB", "didThisNasaApiKeyGotUpdated", "", "apiKey", "didThisNewsApiKeyGotUpdated", "doesThisExistsInAPODDB", "doesThisExistsInNewsDB", "doesThisExistsInRoversDB", "getAPIKeys", "", "getBookMarkedAPODDBDATA", "Lkotlinx/coroutines/flow/Flow;", "getBookMarkedNewsDATA", "getBookMarkedRoverDBDATA", "app_debug"})
public abstract interface DBService {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM apod_db ORDER BY imageURL ASC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.sakethh.jetspacer.localDB.APOD_DB_DTO>> getBookMarkedAPODDBDATA();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 5)
    public abstract java.lang.Object addNewBookMarkToAPODDB(@org.jetbrains.annotations.NotNull
    com.sakethh.jetspacer.localDB.APOD_DB_DTO apodDbDto, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE from apod_db WHERE imageURL = :imageURL")
    public abstract java.lang.Object deleteFromAPODDB(@org.jetbrains.annotations.NotNull
    java.lang.String imageURL, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM marsRovers_db ORDER BY imageURL ASC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.sakethh.jetspacer.localDB.MarsRoversDBDTO>> getBookMarkedRoverDBDATA();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM newsDB ORDER BY imageURL ASC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.sakethh.jetspacer.localDB.NewsDB>> getBookMarkedNewsDATA();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 5)
    public abstract java.lang.Object addNewBookMarkToRoverDB(@org.jetbrains.annotations.NotNull
    com.sakethh.jetspacer.localDB.MarsRoversDBDTO marsRoverDbDto, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE from marsRovers_db WHERE imageURL = :imageURL")
    public abstract java.lang.Object deleteFromRoverDB(@org.jetbrains.annotations.NotNull
    java.lang.String imageURL, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 5)
    public abstract java.lang.Object addNewBookMarkToNewsDB(@org.jetbrains.annotations.NotNull
    com.sakethh.jetspacer.localDB.NewsDB newsDB, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE from newsDB WHERE sourceURL = :sourceURL")
    public abstract java.lang.Object deleteFromNewsDB(@org.jetbrains.annotations.NotNull
    java.lang.String sourceURL, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT EXISTS(SELECT * FROM apod_db WHERE imageURL = :imageURL)")
    public abstract java.lang.Object doesThisExistsInAPODDB(@org.jetbrains.annotations.NotNull
    java.lang.String imageURL, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT EXISTS(SELECT * FROM marsRovers_db WHERE imageURL = :imageURL)")
    public abstract java.lang.Object doesThisExistsInRoversDB(@org.jetbrains.annotations.NotNull
    java.lang.String imageURL, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT EXISTS(SELECT * FROM newsDB WHERE sourceURL = :sourceURL)")
    public abstract java.lang.Object doesThisExistsInNewsDB(@org.jetbrains.annotations.NotNull
    java.lang.String sourceURL, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM marsRovers_db")
    public abstract java.lang.Object deleteAllDataFromMarsDB(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM apod_db")
    public abstract java.lang.Object deleteAllDataFromAPODDB(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM newsDB")
    public abstract java.lang.Object deleteAllDataFromNewsDB(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM apiKeys")
    public abstract java.lang.Object getAPIKeys(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.sakethh.jetspacer.localDB.APIKeysDB>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object addAPIKeys(@org.jetbrains.annotations.NotNull
    com.sakethh.jetspacer.localDB.APIKeysDB apiKeysDB, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT EXISTS(SELECT * FROM apiKeys WHERE currentNASAAPIKey = :apiKey)")
    public abstract java.lang.Object didThisNasaApiKeyGotUpdated(@org.jetbrains.annotations.NotNull
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT EXISTS(SELECT * FROM apiKeys WHERE currentNewsAPIKey = :apiKey)")
    public abstract java.lang.Object didThisNewsApiKeyGotUpdated(@org.jetbrains.annotations.NotNull
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
}
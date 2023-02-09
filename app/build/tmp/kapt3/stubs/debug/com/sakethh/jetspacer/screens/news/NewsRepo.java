package com.sakethh.jetspacer.screens.news;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/sakethh/jetspacer/screens/news/NewsRepo;", "Lcom/sakethh/jetspacer/screens/news/NewsService;", "()V", "getCustomNewsList", "", "Lcom/sakethh/jetspacer/screens/news/dto/Article;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStatus", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "totalResults", "app_debug"})
public final class NewsRepo implements com.sakethh.jetspacer.screens.news.NewsService {
    
    public NewsRepo() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getCustomNewsList(int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<? extends java.util.List<com.sakethh.jetspacer.screens.news.dto.Article>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getStatus(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object totalResults(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return null;
    }
}
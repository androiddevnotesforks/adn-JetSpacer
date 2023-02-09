package com.sakethh.jetspacer.screens.news;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/sakethh/jetspacer/screens/news/NewsService;", "", "getCustomNewsList", "", "Lcom/sakethh/jetspacer/screens/news/dto/Article;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStatus", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "totalResults", "app_debug"})
public abstract interface NewsService {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCustomNewsList(int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<? extends java.util.List<com.sakethh.jetspacer.screens.news.dto.Article>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getStatus(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.String> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object totalResults(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation);
}
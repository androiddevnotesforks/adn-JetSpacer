package com.sakethh.jetspacer.screens.news;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0012\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0011\u0010\u0015\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0011\u0010\u000f\u001a\u00020\u0013H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/sakethh/jetspacer/screens/news/NewsVM;", "Landroidx/lifecycle/ViewModel;", "newsRepo", "Lcom/sakethh/jetspacer/screens/news/NewsRepo;", "(Lcom/sakethh/jetspacer/screens/news/NewsRepo;)V", "_topHeadLinesListFromAPI", "Landroidx/compose/runtime/MutableState;", "", "Lcom/sakethh/jetspacer/screens/news/dto/Article;", "get_topHeadLinesListFromAPI", "()Landroidx/compose/runtime/MutableState;", "coroutineExceptionalHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "topHeadLinesListFromAPI", "getTopHeadLinesListFromAPI", "totalNewsCount", "", "getTotalNewsCount", "loadTopHeadLinesData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reloadTopHeadLinesData", "NewsData", "app_debug"})
public final class NewsVM extends androidx.lifecycle.ViewModel {
    private final com.sakethh.jetspacer.screens.news.NewsRepo newsRepo = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.news.dto.Article>> _topHeadLinesListFromAPI = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.news.dto.Article>> topHeadLinesListFromAPI = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.Integer> totalNewsCount = null;
    private final kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionalHandler = null;
    
    public NewsVM() {
        super();
    }
    
    public NewsVM(@org.jetbrains.annotations.NotNull
    com.sakethh.jetspacer.screens.news.NewsRepo newsRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.news.dto.Article>> get_topHeadLinesListFromAPI() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.List<com.sakethh.jetspacer.screens.news.dto.Article>> getTopHeadLinesListFromAPI() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.Integer> getTotalNewsCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object loadTopHeadLinesData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object totalNewsCount(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object reloadTopHeadLinesData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/sakethh/jetspacer/screens/news/NewsVM$NewsData;", "", "()V", "currentPage", "", "getCurrentPage", "()I", "setCurrentPage", "(I)V", "app_debug"})
    public static final class NewsData {
        @org.jetbrains.annotations.NotNull
        public static final com.sakethh.jetspacer.screens.news.NewsVM.NewsData INSTANCE = null;
        private static int currentPage = 1;
        
        private NewsData() {
            super();
        }
        
        public final int getCurrentPage() {
            return 0;
        }
        
        public final void setCurrentPage(int p0) {
        }
    }
}
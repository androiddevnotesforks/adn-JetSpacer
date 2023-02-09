package com.sakethh.jetspacer.screens.webview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005\u00a8\u0006\n"}, d2 = {"enableBtmBarInWebView", "", "getEnableBtmBarInWebView", "()Z", "setEnableBtmBarInWebView", "(Z)V", "WebViewScreen", "", "navController", "Landroidx/navigation/NavController;", "app_debug"})
public final class WebViewScreenKt {
    private static boolean enableBtmBarInWebView = false;
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class, androidx.compose.material.ExperimentalMaterialApi.class})
    @android.annotation.SuppressLint(value = {"SetJavaScriptEnabled"})
    public static final void WebViewScreen(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController) {
    }
    
    public static final boolean getEnableBtmBarInWebView() {
        return false;
    }
    
    public static final void setEnableBtmBarInWebView(boolean p0) {
    }
}
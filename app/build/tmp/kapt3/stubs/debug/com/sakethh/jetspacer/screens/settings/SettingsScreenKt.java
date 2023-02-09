package com.sakethh.jetspacer.screens.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001a7\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\n\u0010\u000b\u001a\u001e\u0010\f\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\u001a7\u0010\u0012\u001a\u00020\u00012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0001\u00a2\u0006\u0002\u0010\u0017\u001a/\u0010\u0018\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0086@\u00f8\u0001\u0001\u00a2\u0006\u0002\u0010\u0019\u001a\n\u0010\u001a\u001a\u00020\u0004*\u00020\u0004\u001a2\u0010\u001b\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u0015\u001a\n\u0010!\u001a\u00020\u0004*\u00020\u0004\u0082\u0002\u000b\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006\""}, d2 = {"DividerComposable", "", "IndividualSettingItemComposable", "modifier", "Landroidx/compose/ui/Modifier;", "title", "", "description", "lineHeight", "Landroidx/compose/ui/unit/TextUnit;", "IndividualSettingItemComposable-lGoEivg", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;J)V", "SettingsScreen", "dataStore", "Landroidx/datastore/DataStore;", "Landroidx/datastore/preferences/Preferences;", "navController", "Landroidx/navigation/NavController;", "changeInAppBrowserSetting", "settingsPreferenceKey", "Landroidx/datastore/preferences/Preferences$Key;", "", "isInAppBrowsing", "(Landroidx/datastore/preferences/Preferences$Key;Landroidx/datastore/DataStore;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readInAppBrowserSetting", "(Landroidx/datastore/DataStore;Landroidx/datastore/preferences/Preferences$Key;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "descriptionPadding", "redirectToWeb", "newsBottomSheetContentImpl", "Lcom/sakethh/jetspacer/screens/news/NewsBottomSheetContentImpl;", "onClick", "Lkotlin/Function0;", "inSettingsScreen", "titlePadding", "app_debug"})
public final class SettingsScreenKt {
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class, androidx.compose.material.ExperimentalMaterialApi.class})
    public static final void SettingsScreen(@org.jetbrains.annotations.NotNull
    androidx.datastore.DataStore<androidx.datastore.preferences.Preferences> dataStore, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.ui.Modifier titlePadding(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier $this$titlePadding) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.ui.Modifier descriptionPadding(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier $this$descriptionPadding) {
        return null;
    }
    
    @androidx.compose.runtime.Composable
    public static final void DividerComposable() {
    }
    
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object changeInAppBrowserSetting(@org.jetbrains.annotations.NotNull
    androidx.datastore.preferences.Preferences.Key<java.lang.Boolean> settingsPreferenceKey, @org.jetbrains.annotations.NotNull
    androidx.datastore.DataStore<androidx.datastore.preferences.Preferences> dataStore, boolean isInAppBrowsing, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object readInAppBrowserSetting(@org.jetbrains.annotations.NotNull
    androidx.datastore.DataStore<androidx.datastore.preferences.Preferences> dataStore, @org.jetbrains.annotations.NotNull
    androidx.datastore.preferences.Preferences.Key<java.lang.Boolean> settingsPreferenceKey, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.compose.ui.Modifier redirectToWeb(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier $this$redirectToWeb, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
    com.sakethh.jetspacer.screens.news.NewsBottomSheetContentImpl newsBottomSheetContentImpl, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick, boolean inSettingsScreen) {
        return null;
    }
}
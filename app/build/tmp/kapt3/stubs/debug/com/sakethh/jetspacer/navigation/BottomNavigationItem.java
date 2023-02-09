package com.sakethh.jetspacer.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012JR\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\tH\u00d6\u0001J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0015\u0010\u0012\u00a8\u0006#"}, d2 = {"Lcom/sakethh/jetspacer/navigation/BottomNavigationItem;", "", "name", "", "navigationRoute", "selectedIcon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "nonSelectedIcon", "selectedIconRes", "", "nonSelectedIconRes", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getName", "()Ljava/lang/String;", "getNavigationRoute", "getNonSelectedIcon", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "getNonSelectedIconRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSelectedIcon", "getSelectedIconRes", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sakethh/jetspacer/navigation/BottomNavigationItem;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class BottomNavigationItem {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String navigationRoute = null;
    @org.jetbrains.annotations.Nullable
    private final androidx.compose.ui.graphics.vector.ImageVector selectedIcon = null;
    @org.jetbrains.annotations.Nullable
    private final androidx.compose.ui.graphics.vector.ImageVector nonSelectedIcon = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer selectedIconRes = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer nonSelectedIconRes = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.sakethh.jetspacer.navigation.BottomNavigationItem copy(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String navigationRoute, @org.jetbrains.annotations.Nullable
    androidx.compose.ui.graphics.vector.ImageVector selectedIcon, @org.jetbrains.annotations.Nullable
    androidx.compose.ui.graphics.vector.ImageVector nonSelectedIcon, @org.jetbrains.annotations.Nullable
    java.lang.Integer selectedIconRes, @org.jetbrains.annotations.Nullable
    java.lang.Integer nonSelectedIconRes) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public BottomNavigationItem(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String navigationRoute, @org.jetbrains.annotations.Nullable
    androidx.compose.ui.graphics.vector.ImageVector selectedIcon, @org.jetbrains.annotations.Nullable
    androidx.compose.ui.graphics.vector.ImageVector nonSelectedIcon, @org.jetbrains.annotations.Nullable
    java.lang.Integer selectedIconRes, @org.jetbrains.annotations.Nullable
    java.lang.Integer nonSelectedIconRes) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNavigationRoute() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final androidx.compose.ui.graphics.vector.ImageVector component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final androidx.compose.ui.graphics.vector.ImageVector getSelectedIcon() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final androidx.compose.ui.graphics.vector.ImageVector component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final androidx.compose.ui.graphics.vector.ImageVector getNonSelectedIcon() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getSelectedIconRes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getNonSelectedIconRes() {
        return null;
    }
}
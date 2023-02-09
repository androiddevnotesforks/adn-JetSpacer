package com.sakethh.jetspacer.localDB;

import java.lang.System;

@androidx.room.Entity(tableName = "marsRovers_db")
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b+\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000fJ\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\fH\u00c6\u0003Jw\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003H\u00c6\u0001J\u0013\u00105\u001a\u00020\f2\b\u00106\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00107\u001a\u000208H\u00d6\u0001J\t\u00109\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010\u0013R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010\u0013R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0011\"\u0004\b&\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0011\"\u0004\b(\u0010\u0013\u00a8\u0006:"}, d2 = {"Lcom/sakethh/jetspacer/localDB/MarsRoversDBDTO;", "", "imageURL", "", "capturedBy", "sol", "earthDate", "roverName", "roverStatus", "launchingDate", "landingDate", "isBookMarked", "", "category", "addedToLocalDBOn", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getAddedToLocalDBOn", "()Ljava/lang/String;", "setAddedToLocalDBOn", "(Ljava/lang/String;)V", "getCapturedBy", "setCapturedBy", "getCategory", "setCategory", "getEarthDate", "setEarthDate", "getImageURL", "setImageURL", "()Z", "setBookMarked", "(Z)V", "getLandingDate", "setLandingDate", "getLaunchingDate", "setLaunchingDate", "getRoverName", "setRoverName", "getRoverStatus", "setRoverStatus", "getSol", "setSol", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class MarsRoversDBDTO {
    @org.jetbrains.annotations.NotNull
    @androidx.room.PrimaryKey
    private java.lang.String imageURL;
    @org.jetbrains.annotations.NotNull
    private java.lang.String capturedBy;
    @org.jetbrains.annotations.NotNull
    private java.lang.String sol;
    @org.jetbrains.annotations.NotNull
    private java.lang.String earthDate;
    @org.jetbrains.annotations.NotNull
    private java.lang.String roverName;
    @org.jetbrains.annotations.NotNull
    private java.lang.String roverStatus;
    @org.jetbrains.annotations.NotNull
    private java.lang.String launchingDate;
    @org.jetbrains.annotations.NotNull
    private java.lang.String landingDate;
    private boolean isBookMarked;
    @org.jetbrains.annotations.NotNull
    private java.lang.String category;
    @org.jetbrains.annotations.NotNull
    private java.lang.String addedToLocalDBOn;
    
    @org.jetbrains.annotations.NotNull
    public final com.sakethh.jetspacer.localDB.MarsRoversDBDTO copy(@org.jetbrains.annotations.NotNull
    java.lang.String imageURL, @org.jetbrains.annotations.NotNull
    java.lang.String capturedBy, @org.jetbrains.annotations.NotNull
    java.lang.String sol, @org.jetbrains.annotations.NotNull
    java.lang.String earthDate, @org.jetbrains.annotations.NotNull
    java.lang.String roverName, @org.jetbrains.annotations.NotNull
    java.lang.String roverStatus, @org.jetbrains.annotations.NotNull
    java.lang.String launchingDate, @org.jetbrains.annotations.NotNull
    java.lang.String landingDate, boolean isBookMarked, @org.jetbrains.annotations.NotNull
    java.lang.String category, @org.jetbrains.annotations.NotNull
    java.lang.String addedToLocalDBOn) {
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
    
    public MarsRoversDBDTO() {
        super();
    }
    
    public MarsRoversDBDTO(@org.jetbrains.annotations.NotNull
    java.lang.String imageURL, @org.jetbrains.annotations.NotNull
    java.lang.String capturedBy, @org.jetbrains.annotations.NotNull
    java.lang.String sol, @org.jetbrains.annotations.NotNull
    java.lang.String earthDate, @org.jetbrains.annotations.NotNull
    java.lang.String roverName, @org.jetbrains.annotations.NotNull
    java.lang.String roverStatus, @org.jetbrains.annotations.NotNull
    java.lang.String launchingDate, @org.jetbrains.annotations.NotNull
    java.lang.String landingDate, boolean isBookMarked, @org.jetbrains.annotations.NotNull
    java.lang.String category, @org.jetbrains.annotations.NotNull
    java.lang.String addedToLocalDBOn) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getImageURL() {
        return null;
    }
    
    public final void setImageURL(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCapturedBy() {
        return null;
    }
    
    public final void setCapturedBy(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSol() {
        return null;
    }
    
    public final void setSol(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEarthDate() {
        return null;
    }
    
    public final void setEarthDate(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRoverName() {
        return null;
    }
    
    public final void setRoverName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRoverStatus() {
        return null;
    }
    
    public final void setRoverStatus(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLaunchingDate() {
        return null;
    }
    
    public final void setLaunchingDate(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLandingDate() {
        return null;
    }
    
    public final void setLandingDate(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final boolean component9() {
        return false;
    }
    
    public final boolean isBookMarked() {
        return false;
    }
    
    public final void setBookMarked(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCategory() {
        return null;
    }
    
    public final void setCategory(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAddedToLocalDBOn() {
        return null;
    }
    
    public final void setAddedToLocalDBOn(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
}
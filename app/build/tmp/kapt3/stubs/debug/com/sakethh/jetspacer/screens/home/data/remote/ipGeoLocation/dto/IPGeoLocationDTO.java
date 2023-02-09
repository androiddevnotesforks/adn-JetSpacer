package com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b@\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 g2\u00020\u0001:\u0002fgB\u00f1\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0002\u0010\u001bB\u00dd\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u001cJ\u000b\u0010F\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u0010\u0010K\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u0010\u0010L\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u0010\u0010T\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u0010\u0010U\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u0010\u0010V\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u000b\u0010W\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u00e6\u0001\u0010X\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010YJ\u0013\u0010Z\u001a\u00020[2\b\u0010\\\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010]\u001a\u00020\u0003H\u00d6\u0001J\t\u0010^\u001a\u00020\u0005H\u00d6\u0001J!\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020\u00002\u0006\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020eH\u00c7\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010\'R \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010+\u0012\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010*R \u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010+\u0012\u0004\b,\u0010\u001e\u001a\u0004\b-\u0010*R \u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010+\u0012\u0004\b.\u0010\u001e\u001a\u0004\b/\u0010*R \u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010+\u0012\u0004\b0\u0010\u001e\u001a\u0004\b1\u0010*R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b2\u0010\u001e\u001a\u0004\b3\u0010 R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b4\u0010\u001e\u001a\u0004\b5\u0010 R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b6\u0010\u001e\u001a\u0004\b7\u0010 R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b8\u0010\u001e\u001a\u0004\b9\u0010 R \u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010+\u0012\u0004\b:\u0010\u001e\u001a\u0004\b;\u0010*R \u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010+\u0012\u0004\b<\u0010\u001e\u001a\u0004\b=\u0010*R \u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010+\u0012\u0004\b>\u0010\u001e\u001a\u0004\b?\u0010*R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b@\u0010\u001e\u001a\u0004\bA\u0010 R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bB\u0010\u001e\u001a\u0004\bC\u0010 R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bD\u0010\u001e\u001a\u0004\bE\u0010 \u00a8\u0006h"}, d2 = {"Lcom/sakethh/jetspacer/screens/home/data/remote/ipGeoLocation/dto/IPGeoLocationDTO;", "", "seen1", "", "current_time", "", "date", "day_length", "location", "Lcom/sakethh/jetspacer/screens/home/data/remote/ipGeoLocation/dto/Location;", "moon_altitude", "", "moon_azimuth", "moon_distance", "moon_parallactic_angle", "moon_status", "moonrise", "moonset", "solar_noon", "sun_altitude", "sun_azimuth", "sun_distance", "sun_status", "sunrise", "sunset", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sakethh/jetspacer/screens/home/data/remote/ipGeoLocation/dto/Location;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sakethh/jetspacer/screens/home/data/remote/ipGeoLocation/dto/Location;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCurrent_time$annotations", "()V", "getCurrent_time", "()Ljava/lang/String;", "getDate$annotations", "getDate", "getDay_length$annotations", "getDay_length", "getLocation$annotations", "getLocation", "()Lcom/sakethh/jetspacer/screens/home/data/remote/ipGeoLocation/dto/Location;", "getMoon_altitude$annotations", "getMoon_altitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMoon_azimuth$annotations", "getMoon_azimuth", "getMoon_distance$annotations", "getMoon_distance", "getMoon_parallactic_angle$annotations", "getMoon_parallactic_angle", "getMoon_status$annotations", "getMoon_status", "getMoonrise$annotations", "getMoonrise", "getMoonset$annotations", "getMoonset", "getSolar_noon$annotations", "getSolar_noon", "getSun_altitude$annotations", "getSun_altitude", "getSun_azimuth$annotations", "getSun_azimuth", "getSun_distance$annotations", "getSun_distance", "getSun_status$annotations", "getSun_status", "getSunrise$annotations", "getSunrise", "getSunset$annotations", "getSunset", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sakethh/jetspacer/screens/home/data/remote/ipGeoLocation/dto/Location;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sakethh/jetspacer/screens/home/data/remote/ipGeoLocation/dto/IPGeoLocationDTO;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "app_debug"})
@kotlinx.serialization.Serializable
public final class IPGeoLocationDTO {
    @org.jetbrains.annotations.NotNull
    public static final com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.dto.IPGeoLocationDTO.Companion Companion = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String current_time = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String date = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String day_length = null;
    @org.jetbrains.annotations.Nullable
    private final com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.dto.Location location = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Double moon_altitude = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Double moon_azimuth = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Double moon_distance = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Double moon_parallactic_angle = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String moon_status = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String moonrise = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String moonset = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String solar_noon = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Double sun_altitude = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Double sun_azimuth = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Double sun_distance = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String sun_status = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String sunrise = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String sunset = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.dto.IPGeoLocationDTO copy(@org.jetbrains.annotations.Nullable
    java.lang.String current_time, @org.jetbrains.annotations.Nullable
    java.lang.String date, @org.jetbrains.annotations.Nullable
    java.lang.String day_length, @org.jetbrains.annotations.Nullable
    com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.dto.Location location, @org.jetbrains.annotations.Nullable
    java.lang.Double moon_altitude, @org.jetbrains.annotations.Nullable
    java.lang.Double moon_azimuth, @org.jetbrains.annotations.Nullable
    java.lang.Double moon_distance, @org.jetbrains.annotations.Nullable
    java.lang.Double moon_parallactic_angle, @org.jetbrains.annotations.Nullable
    java.lang.String moon_status, @org.jetbrains.annotations.Nullable
    java.lang.String moonrise, @org.jetbrains.annotations.Nullable
    java.lang.String moonset, @org.jetbrains.annotations.Nullable
    java.lang.String solar_noon, @org.jetbrains.annotations.Nullable
    java.lang.Double sun_altitude, @org.jetbrains.annotations.Nullable
    java.lang.Double sun_azimuth, @org.jetbrains.annotations.Nullable
    java.lang.Double sun_distance, @org.jetbrains.annotations.Nullable
    java.lang.String sun_status, @org.jetbrains.annotations.Nullable
    java.lang.String sunrise, @org.jetbrains.annotations.Nullable
    java.lang.String sunset) {
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
    
    @kotlin.jvm.JvmStatic
    public static final void write$Self(@org.jetbrains.annotations.NotNull
    com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.dto.IPGeoLocationDTO self, @org.jetbrains.annotations.NotNull
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    public IPGeoLocationDTO() {
        super();
    }
    
    public IPGeoLocationDTO(@org.jetbrains.annotations.Nullable
    java.lang.String current_time, @org.jetbrains.annotations.Nullable
    java.lang.String date, @org.jetbrains.annotations.Nullable
    java.lang.String day_length, @org.jetbrains.annotations.Nullable
    com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.dto.Location location, @org.jetbrains.annotations.Nullable
    java.lang.Double moon_altitude, @org.jetbrains.annotations.Nullable
    java.lang.Double moon_azimuth, @org.jetbrains.annotations.Nullable
    java.lang.Double moon_distance, @org.jetbrains.annotations.Nullable
    java.lang.Double moon_parallactic_angle, @org.jetbrains.annotations.Nullable
    java.lang.String moon_status, @org.jetbrains.annotations.Nullable
    java.lang.String moonrise, @org.jetbrains.annotations.Nullable
    java.lang.String moonset, @org.jetbrains.annotations.Nullable
    java.lang.String solar_noon, @org.jetbrains.annotations.Nullable
    java.lang.Double sun_altitude, @org.jetbrains.annotations.Nullable
    java.lang.Double sun_azimuth, @org.jetbrains.annotations.Nullable
    java.lang.Double sun_distance, @org.jetbrains.annotations.Nullable
    java.lang.String sun_status, @org.jetbrains.annotations.Nullable
    java.lang.String sunrise, @org.jetbrains.annotations.Nullable
    java.lang.String sunset) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCurrent_time() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "current_time")
    @java.lang.Deprecated
    public static void getCurrent_time$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDate() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "date")
    @java.lang.Deprecated
    public static void getDate$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDay_length() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "day_length")
    @java.lang.Deprecated
    public static void getDay_length$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.dto.Location component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.dto.Location getLocation() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "location")
    @java.lang.Deprecated
    public static void getLocation$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getMoon_altitude() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "moon_altitude")
    @java.lang.Deprecated
    public static void getMoon_altitude$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getMoon_azimuth() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "moon_azimuth")
    @java.lang.Deprecated
    public static void getMoon_azimuth$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getMoon_distance() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "moon_distance")
    @java.lang.Deprecated
    public static void getMoon_distance$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getMoon_parallactic_angle() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "moon_parallactic_angle")
    @java.lang.Deprecated
    public static void getMoon_parallactic_angle$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMoon_status() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "moon_status")
    @java.lang.Deprecated
    public static void getMoon_status$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMoonrise() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "moonrise")
    @java.lang.Deprecated
    public static void getMoonrise$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMoonset() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "moonset")
    @java.lang.Deprecated
    public static void getMoonset$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSolar_noon() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "solar_noon")
    @java.lang.Deprecated
    public static void getSolar_noon$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getSun_altitude() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "sun_altitude")
    @java.lang.Deprecated
    public static void getSun_altitude$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getSun_azimuth() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "sun_azimuth")
    @java.lang.Deprecated
    public static void getSun_azimuth$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getSun_distance() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "sun_distance")
    @java.lang.Deprecated
    public static void getSun_distance$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSun_status() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "sun_status")
    @java.lang.Deprecated
    public static void getSun_status$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSunrise() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "sunrise")
    @java.lang.Deprecated
    public static void getSunrise$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSunset() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "sunset")
    @java.lang.Deprecated
    public static void getSunset$annotations() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/sakethh/jetspacer/screens/home/data/remote/ipGeoLocation/dto/IPGeoLocationDTO$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sakethh/jetspacer/screens/home/data/remote/ipGeoLocation/dto/IPGeoLocationDTO;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final kotlinx.serialization.KSerializer<com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.dto.IPGeoLocationDTO> serializer() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"com/sakethh/jetspacer/screens/home/data/remote/ipGeoLocation/dto/IPGeoLocationDTO.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/sakethh/jetspacer/screens/home/data/remote/ipGeoLocation/dto/IPGeoLocationDTO;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_debug"})
    @java.lang.Deprecated
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.dto.IPGeoLocationDTO> {
        @org.jetbrains.annotations.NotNull
        public static final com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.dto.IPGeoLocationDTO.$serializer INSTANCE = null;
        
        private $serializer() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.dto.IPGeoLocationDTO deserialize(@org.jetbrains.annotations.NotNull
        kotlinx.serialization.encoding.Decoder decoder) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return null;
        }
        
        @java.lang.Override
        public void serialize(@org.jetbrains.annotations.NotNull
        kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull
        com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.dto.IPGeoLocationDTO value) {
        }
        
        @org.jetbrains.annotations.NotNull
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
}
package com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\'\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002DEB\u0091\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0012B}\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0013J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u0010\u00104\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u000b\u00105\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0086\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u00107J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010;\u001a\u00020\u0003H\u00d6\u0001J\t\u0010<\u001a\u00020\u0005H\u00d6\u0001J!\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u00002\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u00c7\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017R \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010%\u0012\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010$R \u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010%\u0012\u0004\b&\u0010\u0015\u001a\u0004\b\'\u0010$R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0015\u001a\u0004\b)\u0010\u0017R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0015\u001a\u0004\b+\u0010\u0017\u00a8\u0006F"}, d2 = {"Lcom/sakethh/jetspacer/screens/home/data/remote/ipGeoLocation/dto/Location;", "", "seen1", "", "city", "", "country_code2", "country_code3", "country_name", "district", "ip", "latitude", "", "longitude", "state_prov", "zipcode", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "getCity$annotations", "()V", "getCity", "()Ljava/lang/String;", "getCountry_code2$annotations", "getCountry_code2", "getCountry_code3$annotations", "getCountry_code3", "getCountry_name$annotations", "getCountry_name", "getDistrict$annotations", "getDistrict", "getIp$annotations", "getIp", "getLatitude$annotations", "getLatitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLongitude$annotations", "getLongitude", "getState_prov$annotations", "getState_prov", "getZipcode$annotations", "getZipcode", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lcom/sakethh/jetspacer/screens/home/data/remote/ipGeoLocation/dto/Location;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "app_debug"})
@kotlinx.serialization.Serializable
public final class Location {
    @org.jetbrains.annotations.NotNull
    public static final com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.dto.Location.Companion Companion = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String city = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String country_code2 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String country_code3 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String country_name = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String district = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String ip = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Double latitude = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Double longitude = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String state_prov = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String zipcode = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.dto.Location copy(@org.jetbrains.annotations.Nullable
    java.lang.String city, @org.jetbrains.annotations.Nullable
    java.lang.String country_code2, @org.jetbrains.annotations.Nullable
    java.lang.String country_code3, @org.jetbrains.annotations.Nullable
    java.lang.String country_name, @org.jetbrains.annotations.Nullable
    java.lang.String district, @org.jetbrains.annotations.Nullable
    java.lang.String ip, @org.jetbrains.annotations.Nullable
    java.lang.Double latitude, @org.jetbrains.annotations.Nullable
    java.lang.Double longitude, @org.jetbrains.annotations.Nullable
    java.lang.String state_prov, @org.jetbrains.annotations.Nullable
    java.lang.String zipcode) {
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
    com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.dto.Location self, @org.jetbrains.annotations.NotNull
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    public Location() {
        super();
    }
    
    public Location(@org.jetbrains.annotations.Nullable
    java.lang.String city, @org.jetbrains.annotations.Nullable
    java.lang.String country_code2, @org.jetbrains.annotations.Nullable
    java.lang.String country_code3, @org.jetbrains.annotations.Nullable
    java.lang.String country_name, @org.jetbrains.annotations.Nullable
    java.lang.String district, @org.jetbrains.annotations.Nullable
    java.lang.String ip, @org.jetbrains.annotations.Nullable
    java.lang.Double latitude, @org.jetbrains.annotations.Nullable
    java.lang.Double longitude, @org.jetbrains.annotations.Nullable
    java.lang.String state_prov, @org.jetbrains.annotations.Nullable
    java.lang.String zipcode) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCity() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "city")
    @java.lang.Deprecated
    public static void getCity$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCountry_code2() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "country_code2")
    @java.lang.Deprecated
    public static void getCountry_code2$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCountry_code3() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "country_code3")
    @java.lang.Deprecated
    public static void getCountry_code3$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCountry_name() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "country_name")
    @java.lang.Deprecated
    public static void getCountry_name$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDistrict() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "district")
    @java.lang.Deprecated
    public static void getDistrict$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getIp() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "ip")
    @java.lang.Deprecated
    public static void getIp$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getLatitude() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "latitude")
    @java.lang.Deprecated
    public static void getLatitude$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getLongitude() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "longitude")
    @java.lang.Deprecated
    public static void getLongitude$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getState_prov() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "state_prov")
    @java.lang.Deprecated
    public static void getState_prov$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getZipcode() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "zipcode")
    @java.lang.Deprecated
    public static void getZipcode$annotations() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/sakethh/jetspacer/screens/home/data/remote/ipGeoLocation/dto/Location$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sakethh/jetspacer/screens/home/data/remote/ipGeoLocation/dto/Location;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final kotlinx.serialization.KSerializer<com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.dto.Location> serializer() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"com/sakethh/jetspacer/screens/home/data/remote/ipGeoLocation/dto/Location.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/sakethh/jetspacer/screens/home/data/remote/ipGeoLocation/dto/Location;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_debug"})
    @java.lang.Deprecated
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.dto.Location> {
        @org.jetbrains.annotations.NotNull
        public static final com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.dto.Location.$serializer INSTANCE = null;
        
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
        public com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.dto.Location deserialize(@org.jetbrains.annotations.NotNull
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
        com.sakethh.jetspacer.screens.home.data.remote.ipGeoLocation.dto.Location value) {
        }
        
        @org.jetbrains.annotations.NotNull
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
}
// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018" }, d2 = { "Lcom/reddit/domain/model/UserLocation;", "", "countryCode", "", "regionCode", "cityCode", "cityUtf8", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCityCode", "()Ljava/lang/String;", "getCityUtf8", "getCountryCode", "getRegionCode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class UserLocation
{
    private final String cityCode;
    private final String cityUtf8;
    private final String countryCode;
    private final String regionCode;
    
    public UserLocation() {
        this(null, null, null, null, 15, null);
    }
    
    public UserLocation(final String countryCode, final String regionCode, final String cityCode, final String cityUtf8) {
        this.countryCode = countryCode;
        this.regionCode = regionCode;
        this.cityCode = cityCode;
        this.cityUtf8 = cityUtf8;
    }
    
    public final String component1() {
        return this.countryCode;
    }
    
    public final String component2() {
        return this.regionCode;
    }
    
    public final String component3() {
        return this.cityCode;
    }
    
    public final String component4() {
        return this.cityUtf8;
    }
    
    public final UserLocation copy(final String s, final String s2, final String s3, final String s4) {
        return new UserLocation(s, s2, s3, s4);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserLocation)) {
            return false;
        }
        final UserLocation userLocation = (UserLocation)o;
        return f.a((Object)this.countryCode, (Object)userLocation.countryCode) && f.a((Object)this.regionCode, (Object)userLocation.regionCode) && f.a((Object)this.cityCode, (Object)userLocation.cityCode) && f.a((Object)this.cityUtf8, (Object)userLocation.cityUtf8);
    }
    
    public final String getCityCode() {
        return this.cityCode;
    }
    
    public final String getCityUtf8() {
        return this.cityUtf8;
    }
    
    public final String getCountryCode() {
        return this.countryCode;
    }
    
    public final String getRegionCode() {
        return this.regionCode;
    }
    
    @Override
    public int hashCode() {
        final String countryCode = this.countryCode;
        int hashCode = 0;
        int hashCode2;
        if (countryCode == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = countryCode.hashCode();
        }
        final String regionCode = this.regionCode;
        int hashCode3;
        if (regionCode == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = regionCode.hashCode();
        }
        final String cityCode = this.cityCode;
        int hashCode4;
        if (cityCode == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = cityCode.hashCode();
        }
        final String cityUtf8 = this.cityUtf8;
        if (cityUtf8 != null) {
            hashCode = cityUtf8.hashCode();
        }
        return ((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("UserLocation(countryCode=");
        k.append(this.countryCode);
        k.append(", regionCode=");
        k.append(this.regionCode);
        k.append(", cityCode=");
        k.append(this.cityCode);
        k.append(", cityUtf8=");
        return b.k(k, this.cityUtf8, ')');
    }
}

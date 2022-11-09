// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import android.os.Parcel;
import ag0.a;
import ah2.f;
import ak0.m;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0002H\u00c6\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\n\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u000bH\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bH\u00d6\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001e" }, d2 = { "Lcom/reddit/domain/model/GeoAutocompleteSuggestion;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "placeId", "name", "source", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getPlaceId", "()Ljava/lang/String;", "getName", "getSource", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class GeoAutocompleteSuggestion implements Parcelable
{
    public static final Parcelable$Creator<GeoAutocompleteSuggestion> CREATOR;
    private final String name;
    private final String placeId;
    private final String source;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public GeoAutocompleteSuggestion(final String placeId, final String name, final String source) {
        m.y(placeId, "placeId", name, "name", source, "source");
        this.placeId = placeId;
        this.name = name;
        this.source = source;
    }
    
    public final String component1() {
        return this.placeId;
    }
    
    public final String component2() {
        return this.name;
    }
    
    public final String component3() {
        return this.source;
    }
    
    public final GeoAutocompleteSuggestion copy(final String s, final String s2, final String s3) {
        f.f((Object)s, "placeId");
        f.f((Object)s2, "name");
        f.f((Object)s3, "source");
        return new GeoAutocompleteSuggestion(s, s2, s3);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GeoAutocompleteSuggestion)) {
            return false;
        }
        final GeoAutocompleteSuggestion geoAutocompleteSuggestion = (GeoAutocompleteSuggestion)o;
        return f.a((Object)this.placeId, (Object)geoAutocompleteSuggestion.placeId) && f.a((Object)this.name, (Object)geoAutocompleteSuggestion.name) && f.a((Object)this.source, (Object)geoAutocompleteSuggestion.source);
    }
    
    public final String getName() {
        return this.name;
    }
    
    public final String getPlaceId() {
        return this.placeId;
    }
    
    public final String getSource() {
        return this.source;
    }
    
    @Override
    public int hashCode() {
        return this.source.hashCode() + a.f(this.name, this.placeId.hashCode() * 31, 31);
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("GeoAutocompleteSuggestion(placeId=");
        k.append(this.placeId);
        k.append(", name=");
        k.append(this.name);
        k.append(", source=");
        return b.k(k, this.source, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.placeId);
        parcel.writeString(this.name);
        parcel.writeString(this.source);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<GeoAutocompleteSuggestion>
    {
        public final GeoAutocompleteSuggestion createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            return new GeoAutocompleteSuggestion(parcel.readString(), parcel.readString(), parcel.readString());
        }
        
        public final GeoAutocompleteSuggestion[] newArray(final int n) {
            return new GeoAutocompleteSuggestion[n];
        }
    }
}

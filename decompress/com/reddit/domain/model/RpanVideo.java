// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import android.os.Parcel;
import p1.h;
import ng2.e;
import com.squareup.moshi.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J!\u0010\u0007\u001a\u00020\u00002\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001J\t\u0010\b\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\tH\u00d6\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u00d6\u0001R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b" }, d2 = { "Lcom/reddit/domain/model/RpanVideo;", "Landroid/os/Parcelable;", "", "component1", "component2", "hlsUrl", "scrubberMediaUrl", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lcg2/j;", "writeToParcel", "Ljava/lang/String;", "getHlsUrl", "()Ljava/lang/String;", "getScrubberMediaUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class RpanVideo implements Parcelable
{
    public static final Parcelable$Creator<RpanVideo> CREATOR;
    private final String hlsUrl;
    private final String scrubberMediaUrl;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public RpanVideo() {
        this(null, null, 3, null);
    }
    
    public RpanVideo(@n(name = "hls_url") final String hlsUrl, @n(name = "scrubber_media_url") final String scrubberMediaUrl) {
        this.hlsUrl = hlsUrl;
        this.scrubberMediaUrl = scrubberMediaUrl;
    }
    
    public RpanVideo(String s, String s2, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            s = null;
        }
        if ((n & 0x2) != 0x0) {
            s2 = null;
        }
        this(s, s2);
    }
    
    public static RpanVideo copy$default(final RpanVideo rpanVideo, String hlsUrl, String scrubberMediaUrl, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            hlsUrl = rpanVideo.hlsUrl;
        }
        if ((n & 0x2) != 0x0) {
            scrubberMediaUrl = rpanVideo.scrubberMediaUrl;
        }
        return rpanVideo.copy(hlsUrl, scrubberMediaUrl);
    }
    
    public final String component1() {
        return this.hlsUrl;
    }
    
    public final String component2() {
        return this.scrubberMediaUrl;
    }
    
    public final RpanVideo copy(@n(name = "hls_url") final String s, @n(name = "scrubber_media_url") final String s2) {
        return new RpanVideo(s, s2);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RpanVideo)) {
            return false;
        }
        final RpanVideo rpanVideo = (RpanVideo)o;
        return e.a((Object)this.hlsUrl, (Object)rpanVideo.hlsUrl) && e.a((Object)this.scrubberMediaUrl, (Object)rpanVideo.scrubberMediaUrl);
    }
    
    public final String getHlsUrl() {
        return this.hlsUrl;
    }
    
    public final String getScrubberMediaUrl() {
        return this.scrubberMediaUrl;
    }
    
    @Override
    public int hashCode() {
        final String hlsUrl = this.hlsUrl;
        int hashCode = 0;
        int hashCode2;
        if (hlsUrl == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = hlsUrl.hashCode();
        }
        final String scrubberMediaUrl = this.scrubberMediaUrl;
        if (scrubberMediaUrl != null) {
            hashCode = scrubberMediaUrl.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("RpanVideo(hlsUrl=");
        t.append(this.hlsUrl);
        t.append(", scrubberMediaUrl=");
        return h.c(t, this.scrubberMediaUrl, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.hlsUrl);
        parcel.writeString(this.scrubberMediaUrl);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<RpanVideo>
    {
        public final RpanVideo createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            return new RpanVideo(parcel.readString(), parcel.readString());
        }
        
        public /* bridge */ Object createFromParcel(final Parcel parcel) {
            return this.createFromParcel(parcel);
        }
        
        public final RpanVideo[] newArray(final int n) {
            return new RpanVideo[n];
        }
        
        public /* bridge */ Object[] newArray(final int n) {
            return this.newArray(n);
        }
    }
}

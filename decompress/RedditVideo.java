// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model.v1;

import android.os.Parcel;
import androidx.appcompat.widget.s0;
import com.squareup.moshi.n;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;
import java.io.Serializable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bk\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b4\u00105B\u0011\b\u0016\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\b4\u00108J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\rH\u00c6\u0003Jm\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0010\u001a\u00020\u00052\b\b\u0003\u0010\u0011\u001a\u00020\u00052\b\b\u0003\u0010\u0012\u001a\u00020\u00052\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0017\u001a\u00020\rH\u00c6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010\u001d\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0005H\u00d6\u0001R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010'\u001a\u0004\b*\u0010)R\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010'\u001a\u0004\b+\u0010)R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b,\u0010&R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010$\u001a\u0004\b-\u0010&R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010$\u001a\u0004\b.\u0010&R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010$\u001a\u0004\b/\u0010&R\"\u0010\u0017\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u00100\u001a\u0004\b\u0017\u00101\"\u0004\b2\u00103¨\u00069" }, d2 = { "Lcom/reddit/data/model/v1/RedditVideo;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "", "component9", "transcodingStatus", "width", "height", "duration", "fallbackUrl", "hlsUrl", "dashUrl", "scrubberMediaUrl", "isGif", "copy", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getTranscodingStatus", "()Ljava/lang/String;", "I", "getWidth", "()I", "getHeight", "getDuration", "getFallbackUrl", "getHlsUrl", "getDashUrl", "getScrubberMediaUrl", "Z", "()Z", "setGif", "(Z)V", "<init>", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Lcom/reddit/domain/model/RedditVideo;", "redditVideo", "(Lcom/reddit/domain/model/RedditVideo;)V", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class RedditVideo implements Serializable, Parcelable
{
    public static final Parcelable$Creator<RedditVideo> CREATOR;
    private final String dashUrl;
    private final int duration;
    private final String fallbackUrl;
    private final int height;
    private final String hlsUrl;
    private boolean isGif;
    private final String scrubberMediaUrl;
    private final String transcodingStatus;
    private final int width;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public RedditVideo() {
        this(null, 0, 0, 0, null, null, null, null, false, 511, null);
    }
    
    public RedditVideo(final com.reddit.domain.model.RedditVideo redditVideo) {
        f.f((Object)redditVideo, "redditVideo");
        this(redditVideo.getTranscodingStatus(), redditVideo.getWidth(), redditVideo.getHeight(), redditVideo.getDuration(), redditVideo.getFallBackUrl(), redditVideo.getHlsUrl(), redditVideo.getDashUrl(), redditVideo.getScrubbedMediaUrl(), redditVideo.isGif());
    }
    
    public RedditVideo(@n(name = "transcoding_status") final String transcodingStatus, @n(name = "width") final int width, @n(name = "height") final int height, @n(name = "duration") final int duration, @n(name = "fallback_url") final String fallbackUrl, @n(name = "hls_url") final String hlsUrl, @n(name = "dash_url") final String dashUrl, @n(name = "scrubber_media_url") final String scrubberMediaUrl, @n(name = "is_gif") final boolean isGif) {
        this.transcodingStatus = transcodingStatus;
        this.width = width;
        this.height = height;
        this.duration = duration;
        this.fallbackUrl = fallbackUrl;
        this.hlsUrl = hlsUrl;
        this.dashUrl = dashUrl;
        this.scrubberMediaUrl = scrubberMediaUrl;
        this.isGif = isGif;
    }
    
    public final String component1() {
        return this.transcodingStatus;
    }
    
    public final int component2() {
        return this.width;
    }
    
    public final int component3() {
        return this.height;
    }
    
    public final int component4() {
        return this.duration;
    }
    
    public final String component5() {
        return this.fallbackUrl;
    }
    
    public final String component6() {
        return this.hlsUrl;
    }
    
    public final String component7() {
        return this.dashUrl;
    }
    
    public final String component8() {
        return this.scrubberMediaUrl;
    }
    
    public final boolean component9() {
        return this.isGif;
    }
    
    public final RedditVideo copy(@n(name = "transcoding_status") final String s, @n(name = "width") final int n, @n(name = "height") final int n2, @n(name = "duration") final int n3, @n(name = "fallback_url") final String s2, @n(name = "hls_url") final String s3, @n(name = "dash_url") final String s4, @n(name = "scrubber_media_url") final String s5, @n(name = "is_gif") final boolean b) {
        return new RedditVideo(s, n, n2, n3, s2, s3, s4, s5, b);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RedditVideo)) {
            return false;
        }
        final RedditVideo redditVideo = (RedditVideo)o;
        return f.a((Object)this.transcodingStatus, (Object)redditVideo.transcodingStatus) && this.width == redditVideo.width && this.height == redditVideo.height && this.duration == redditVideo.duration && f.a((Object)this.fallbackUrl, (Object)redditVideo.fallbackUrl) && f.a((Object)this.hlsUrl, (Object)redditVideo.hlsUrl) && f.a((Object)this.dashUrl, (Object)redditVideo.dashUrl) && f.a((Object)this.scrubberMediaUrl, (Object)redditVideo.scrubberMediaUrl) && this.isGif == redditVideo.isGif;
    }
    
    public final String getDashUrl() {
        return this.dashUrl;
    }
    
    public final int getDuration() {
        return this.duration;
    }
    
    public final String getFallbackUrl() {
        return this.fallbackUrl;
    }
    
    public final int getHeight() {
        return this.height;
    }
    
    public final String getHlsUrl() {
        return this.hlsUrl;
    }
    
    public final String getScrubberMediaUrl() {
        return this.scrubberMediaUrl;
    }
    
    public final String getTranscodingStatus() {
        return this.transcodingStatus;
    }
    
    public final int getWidth() {
        return this.width;
    }
    
    @Override
    public int hashCode() {
        final String transcodingStatus = this.transcodingStatus;
        int hashCode = 0;
        int hashCode2;
        if (transcodingStatus == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = transcodingStatus.hashCode();
        }
        final int e = s0.e(this.duration, s0.e(this.height, s0.e(this.width, hashCode2 * 31, 31), 31), 31);
        final String fallbackUrl = this.fallbackUrl;
        int hashCode3;
        if (fallbackUrl == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = fallbackUrl.hashCode();
        }
        final String hlsUrl = this.hlsUrl;
        int hashCode4;
        if (hlsUrl == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = hlsUrl.hashCode();
        }
        final String dashUrl = this.dashUrl;
        int hashCode5;
        if (dashUrl == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = dashUrl.hashCode();
        }
        final String scrubberMediaUrl = this.scrubberMediaUrl;
        if (scrubberMediaUrl != null) {
            hashCode = scrubberMediaUrl.hashCode();
        }
        int isGif;
        if ((isGif = (this.isGif ? 1 : 0)) != 0) {
            isGif = 1;
        }
        return ((((e + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode) * 31 + isGif;
    }
    
    public final boolean isGif() {
        return this.isGif;
    }
    
    public final void setGif(final boolean isGif) {
        this.isGif = isGif;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("RedditVideo(transcodingStatus=");
        k.append(this.transcodingStatus);
        k.append(", width=");
        k.append(this.width);
        k.append(", height=");
        k.append(this.height);
        k.append(", duration=");
        k.append(this.duration);
        k.append(", fallbackUrl=");
        k.append(this.fallbackUrl);
        k.append(", hlsUrl=");
        k.append(this.hlsUrl);
        k.append(", dashUrl=");
        k.append(this.dashUrl);
        k.append(", scrubberMediaUrl=");
        k.append(this.scrubberMediaUrl);
        k.append(", isGif=");
        return s0.o(k, this.isGif, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.transcodingStatus);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.duration);
        parcel.writeString(this.fallbackUrl);
        parcel.writeString(this.hlsUrl);
        parcel.writeString(this.dashUrl);
        parcel.writeString(this.scrubberMediaUrl);
        parcel.writeInt((int)(this.isGif ? 1 : 0));
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<RedditVideo>
    {
        public final RedditVideo createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            return new RedditVideo(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }
        
        public final RedditVideo[] newArray(final int n) {
            return new RedditVideo[n];
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import android.os.Parcel;
import p1.h;
import aq2.a;
import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import b5.k;
import com.squareup.moshi.n;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u001a\u001a\u00020\r\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b=\u0010>J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\t\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\rH\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u0087\u0001\u0010\u001e\u001a\u00020\u00002\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0003\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0003\u0010\u0019\u001a\u00020\u00022\b\b\u0003\u0010\u001a\u001a\u00020\r2\b\b\u0003\u0010\u001b\u001a\u00020\u00022\b\b\u0003\u0010\u001c\u001a\u00020\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001J\t\u0010\u001f\u001a\u00020\u0002H\u00d6\u0001J\t\u0010 \u001a\u00020\u0007H\u00d6\u0001J\u0013\u0010#\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010!H\u00d6\u0003J\t\u0010$\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0007H\u00d6\u0001R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010*\u001a\u0004\b0\u0010,R\u0017\u0010\u0015\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010*\u001a\u0004\b4\u0010,R\u0017\u0010\u0017\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u00101\u001a\u0004\b5\u00103R\u0017\u0010\u0018\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u00101\u001a\u0004\b6\u00103R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010*\u001a\u0004\b7\u0010,R\u0017\u0010\u001a\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001a\u00108\u001a\u0004\b\u001a\u00109R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010*\u001a\u0004\b:\u0010,R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010*\u001a\u0004\b;\u0010,R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010*\u001a\u0004\b<\u0010,¨\u0006?" }, d2 = { "Lcom/reddit/domain/model/RedditVideo;", "Landroid/os/Parcelable;", "", "component1", "Lcom/reddit/domain/model/RedditVideoMp4Urls;", "component2", "component3", "", "component4", "component5", "component6", "component7", "component8", "", "component9", "component10", "component11", "component12", "packagedMp4Url", "mp4Urls", "dashUrl", "duration", "fallBackUrl", "height", "width", "hlsUrl", "isGif", "scrubbedMediaUrl", "transcodingStatus", "downloadUrl", "copy", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lcg2/j;", "writeToParcel", "Ljava/lang/String;", "getPackagedMp4Url", "()Ljava/lang/String;", "Lcom/reddit/domain/model/RedditVideoMp4Urls;", "getMp4Urls", "()Lcom/reddit/domain/model/RedditVideoMp4Urls;", "getDashUrl", "I", "getDuration", "()I", "getFallBackUrl", "getHeight", "getWidth", "getHlsUrl", "Z", "()Z", "getScrubbedMediaUrl", "getTranscodingStatus", "getDownloadUrl", "<init>", "(Ljava/lang/String;Lcom/reddit/domain/model/RedditVideoMp4Urls;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class RedditVideo implements Parcelable
{
    public static final Parcelable$Creator<RedditVideo> CREATOR;
    private final String dashUrl;
    private final String downloadUrl;
    private final int duration;
    private final String fallBackUrl;
    private final int height;
    private final String hlsUrl;
    private final boolean isGif;
    private final RedditVideoMp4Urls mp4Urls;
    private final String packagedMp4Url;
    private final String scrubbedMediaUrl;
    private final String transcodingStatus;
    private final int width;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public RedditVideo(@n(name = "packaged_mp4_url") final String packagedMp4Url, @n(name = "mp4_urls") final RedditVideoMp4Urls mp4Urls, @n(name = "dash_url") final String dashUrl, final int duration, @n(name = "fallback_url") final String fallBackUrl, final int height, final int width, @n(name = "hls_url") final String hlsUrl, @n(name = "is_gif") final boolean isGif, @n(name = "scrubber_media_url") final String scrubbedMediaUrl, @n(name = "transcoding_status") final String transcodingStatus, final String downloadUrl) {
        k.x(dashUrl, "dashUrl", fallBackUrl, "fallBackUrl", hlsUrl, "hlsUrl", scrubbedMediaUrl, "scrubbedMediaUrl", transcodingStatus, "transcodingStatus");
        this.packagedMp4Url = packagedMp4Url;
        this.mp4Urls = mp4Urls;
        this.dashUrl = dashUrl;
        this.duration = duration;
        this.fallBackUrl = fallBackUrl;
        this.height = height;
        this.width = width;
        this.hlsUrl = hlsUrl;
        this.isGif = isGif;
        this.scrubbedMediaUrl = scrubbedMediaUrl;
        this.transcodingStatus = transcodingStatus;
        this.downloadUrl = downloadUrl;
    }
    
    public RedditVideo(String s, RedditVideoMp4Urls redditVideoMp4Urls, final String s2, final int n, final String s3, final int n2, final int n3, final String s4, final boolean b, final String s5, final String s6, String s7, final int n4, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n4 & 0x1) != 0x0) {
            s = null;
        }
        if ((n4 & 0x2) != 0x0) {
            redditVideoMp4Urls = null;
        }
        if ((n4 & 0x800) != 0x0) {
            s7 = null;
        }
        this(s, redditVideoMp4Urls, s2, n, s3, n2, n3, s4, b, s5, s6, s7);
    }
    
    public static RedditVideo copy$default(final RedditVideo redditVideo, String packagedMp4Url, RedditVideoMp4Urls mp4Urls, String dashUrl, int duration, String fallBackUrl, int height, int width, String hlsUrl, boolean isGif, String scrubbedMediaUrl, String transcodingStatus, String downloadUrl, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            packagedMp4Url = redditVideo.packagedMp4Url;
        }
        if ((n & 0x2) != 0x0) {
            mp4Urls = redditVideo.mp4Urls;
        }
        if ((n & 0x4) != 0x0) {
            dashUrl = redditVideo.dashUrl;
        }
        if ((n & 0x8) != 0x0) {
            duration = redditVideo.duration;
        }
        if ((n & 0x10) != 0x0) {
            fallBackUrl = redditVideo.fallBackUrl;
        }
        if ((n & 0x20) != 0x0) {
            height = redditVideo.height;
        }
        if ((n & 0x40) != 0x0) {
            width = redditVideo.width;
        }
        if ((n & 0x80) != 0x0) {
            hlsUrl = redditVideo.hlsUrl;
        }
        if ((n & 0x100) != 0x0) {
            isGif = redditVideo.isGif;
        }
        if ((n & 0x200) != 0x0) {
            scrubbedMediaUrl = redditVideo.scrubbedMediaUrl;
        }
        if ((n & 0x400) != 0x0) {
            transcodingStatus = redditVideo.transcodingStatus;
        }
        if ((n & 0x800) != 0x0) {
            downloadUrl = redditVideo.downloadUrl;
        }
        return redditVideo.copy(packagedMp4Url, mp4Urls, dashUrl, duration, fallBackUrl, height, width, hlsUrl, isGif, scrubbedMediaUrl, transcodingStatus, downloadUrl);
    }
    
    public final String component1() {
        return this.packagedMp4Url;
    }
    
    public final String component10() {
        return this.scrubbedMediaUrl;
    }
    
    public final String component11() {
        return this.transcodingStatus;
    }
    
    public final String component12() {
        return this.downloadUrl;
    }
    
    public final RedditVideoMp4Urls component2() {
        return this.mp4Urls;
    }
    
    public final String component3() {
        return this.dashUrl;
    }
    
    public final int component4() {
        return this.duration;
    }
    
    public final String component5() {
        return this.fallBackUrl;
    }
    
    public final int component6() {
        return this.height;
    }
    
    public final int component7() {
        return this.width;
    }
    
    public final String component8() {
        return this.hlsUrl;
    }
    
    public final boolean component9() {
        return this.isGif;
    }
    
    public final RedditVideo copy(@n(name = "packaged_mp4_url") final String s, @n(name = "mp4_urls") final RedditVideoMp4Urls redditVideoMp4Urls, @n(name = "dash_url") final String s2, final int n, @n(name = "fallback_url") final String s3, final int n2, final int n3, @n(name = "hls_url") final String s4, @n(name = "is_gif") final boolean b, @n(name = "scrubber_media_url") final String s5, @n(name = "transcoding_status") final String s6, final String s7) {
        e.f((Object)s2, "dashUrl");
        e.f((Object)s3, "fallBackUrl");
        e.f((Object)s4, "hlsUrl");
        e.f((Object)s5, "scrubbedMediaUrl");
        e.f((Object)s6, "transcodingStatus");
        return new RedditVideo(s, redditVideoMp4Urls, s2, n, s3, n2, n3, s4, b, s5, s6, s7);
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
        return e.a((Object)this.packagedMp4Url, (Object)redditVideo.packagedMp4Url) && e.a((Object)this.mp4Urls, (Object)redditVideo.mp4Urls) && e.a((Object)this.dashUrl, (Object)redditVideo.dashUrl) && this.duration == redditVideo.duration && e.a((Object)this.fallBackUrl, (Object)redditVideo.fallBackUrl) && this.height == redditVideo.height && this.width == redditVideo.width && e.a((Object)this.hlsUrl, (Object)redditVideo.hlsUrl) && this.isGif == redditVideo.isGif && e.a((Object)this.scrubbedMediaUrl, (Object)redditVideo.scrubbedMediaUrl) && e.a((Object)this.transcodingStatus, (Object)redditVideo.transcodingStatus) && e.a((Object)this.downloadUrl, (Object)redditVideo.downloadUrl);
    }
    
    public final String getDashUrl() {
        return this.dashUrl;
    }
    
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }
    
    public final int getDuration() {
        return this.duration;
    }
    
    public final String getFallBackUrl() {
        return this.fallBackUrl;
    }
    
    public final int getHeight() {
        return this.height;
    }
    
    public final String getHlsUrl() {
        return this.hlsUrl;
    }
    
    public final RedditVideoMp4Urls getMp4Urls() {
        return this.mp4Urls;
    }
    
    public final String getPackagedMp4Url() {
        return this.packagedMp4Url;
    }
    
    public final String getScrubbedMediaUrl() {
        return this.scrubbedMediaUrl;
    }
    
    public final String getTranscodingStatus() {
        return this.transcodingStatus;
    }
    
    public final int getWidth() {
        return this.width;
    }
    
    @Override
    public int hashCode() {
        final String packagedMp4Url = this.packagedMp4Url;
        final int n = 0;
        int hashCode;
        if (packagedMp4Url == null) {
            hashCode = 0;
        }
        else {
            hashCode = packagedMp4Url.hashCode();
        }
        final RedditVideoMp4Urls mp4Urls = this.mp4Urls;
        int hashCode2;
        if (mp4Urls == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = mp4Urls.hashCode();
        }
        final int e = a.e(this.hlsUrl, a.c(this.width, a.c(this.height, a.e(this.fallBackUrl, a.c(this.duration, a.e(this.dashUrl, (hashCode * 31 + hashCode2) * 31, 31), 31), 31), 31), 31), 31);
        int isGif;
        if ((isGif = (this.isGif ? 1 : 0)) != 0) {
            isGif = 1;
        }
        final int e2 = a.e(this.transcodingStatus, a.e(this.scrubbedMediaUrl, (e + isGif) * 31, 31), 31);
        final String downloadUrl = this.downloadUrl;
        int hashCode3;
        if (downloadUrl == null) {
            hashCode3 = n;
        }
        else {
            hashCode3 = downloadUrl.hashCode();
        }
        return e2 + hashCode3;
    }
    
    public final boolean isGif() {
        return this.isGif;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("RedditVideo(packagedMp4Url=");
        t.append(this.packagedMp4Url);
        t.append(", mp4Urls=");
        t.append(this.mp4Urls);
        t.append(", dashUrl=");
        t.append(this.dashUrl);
        t.append(", duration=");
        t.append(this.duration);
        t.append(", fallBackUrl=");
        t.append(this.fallBackUrl);
        t.append(", height=");
        t.append(this.height);
        t.append(", width=");
        t.append(this.width);
        t.append(", hlsUrl=");
        t.append(this.hlsUrl);
        t.append(", isGif=");
        t.append(this.isGif);
        t.append(", scrubbedMediaUrl=");
        t.append(this.scrubbedMediaUrl);
        t.append(", transcodingStatus=");
        t.append(this.transcodingStatus);
        t.append(", downloadUrl=");
        return h.c(t, this.downloadUrl, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.packagedMp4Url);
        final RedditVideoMp4Urls mp4Urls = this.mp4Urls;
        if (mp4Urls == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            mp4Urls.writeToParcel(parcel, n);
        }
        parcel.writeString(this.dashUrl);
        parcel.writeInt(this.duration);
        parcel.writeString(this.fallBackUrl);
        parcel.writeInt(this.height);
        parcel.writeInt(this.width);
        parcel.writeString(this.hlsUrl);
        parcel.writeInt((int)(this.isGif ? 1 : 0));
        parcel.writeString(this.scrubbedMediaUrl);
        parcel.writeString(this.transcodingStatus);
        parcel.writeString(this.downloadUrl);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<RedditVideo>
    {
        public final RedditVideo createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            Object fromParcel;
            if (parcel.readInt() == 0) {
                fromParcel = null;
            }
            else {
                fromParcel = RedditVideoMp4Urls.CREATOR.createFromParcel(parcel);
            }
            return new RedditVideo(string, (RedditVideoMp4Urls)fromParcel, parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }
        
        public /* bridge */ Object createFromParcel(final Parcel parcel) {
            return this.createFromParcel(parcel);
        }
        
        public final RedditVideo[] newArray(final int n) {
            return new RedditVideo[n];
        }
        
        public /* bridge */ Object[] newArray(final int n) {
            return this.newArray(n);
        }
    }
}

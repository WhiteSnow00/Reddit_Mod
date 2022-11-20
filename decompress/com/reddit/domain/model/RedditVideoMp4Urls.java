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
@Metadata(bv = {}, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\"\u0010#J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003JE\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u000fH\u00d6\u0001J\u0019\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fH\u00d6\u0001R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b!\u0010\u001d¨\u0006$" }, d2 = { "Lcom/reddit/domain/model/RedditVideoMp4Urls;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "component4", "component5", "lowRes", "mediumRes", "highRes", "highestRes", "recommendedRes", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lcg2/j;", "writeToParcel", "Ljava/lang/String;", "getLowRes", "()Ljava/lang/String;", "getMediumRes", "getHighRes", "getHighestRes", "getRecommendedRes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class RedditVideoMp4Urls implements Parcelable
{
    public static final Parcelable$Creator<RedditVideoMp4Urls> CREATOR;
    private final String highRes;
    private final String highestRes;
    private final String lowRes;
    private final String mediumRes;
    private final String recommendedRes;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public RedditVideoMp4Urls() {
        this(null, null, null, null, null, 31, null);
    }
    
    public RedditVideoMp4Urls(@n(name = "low_res") final String lowRes, @n(name = "medium_res") final String mediumRes, @n(name = "high_res") final String highRes, @n(name = "highest_res") final String highestRes, @n(name = "recommended_res") final String recommendedRes) {
        this.lowRes = lowRes;
        this.mediumRes = mediumRes;
        this.highRes = highRes;
        this.highestRes = highestRes;
        this.recommendedRes = recommendedRes;
    }
    
    public RedditVideoMp4Urls(String s, String s2, String s3, String s4, String s5, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            s = null;
        }
        if ((n & 0x2) != 0x0) {
            s2 = null;
        }
        if ((n & 0x4) != 0x0) {
            s3 = null;
        }
        if ((n & 0x8) != 0x0) {
            s4 = null;
        }
        if ((n & 0x10) != 0x0) {
            s5 = null;
        }
        this(s, s2, s3, s4, s5);
    }
    
    public static RedditVideoMp4Urls copy$default(final RedditVideoMp4Urls redditVideoMp4Urls, String lowRes, String mediumRes, String highRes, String highestRes, String recommendedRes, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            lowRes = redditVideoMp4Urls.lowRes;
        }
        if ((n & 0x2) != 0x0) {
            mediumRes = redditVideoMp4Urls.mediumRes;
        }
        if ((n & 0x4) != 0x0) {
            highRes = redditVideoMp4Urls.highRes;
        }
        if ((n & 0x8) != 0x0) {
            highestRes = redditVideoMp4Urls.highestRes;
        }
        if ((n & 0x10) != 0x0) {
            recommendedRes = redditVideoMp4Urls.recommendedRes;
        }
        return redditVideoMp4Urls.copy(lowRes, mediumRes, highRes, highestRes, recommendedRes);
    }
    
    public final String component1() {
        return this.lowRes;
    }
    
    public final String component2() {
        return this.mediumRes;
    }
    
    public final String component3() {
        return this.highRes;
    }
    
    public final String component4() {
        return this.highestRes;
    }
    
    public final String component5() {
        return this.recommendedRes;
    }
    
    public final RedditVideoMp4Urls copy(@n(name = "low_res") final String s, @n(name = "medium_res") final String s2, @n(name = "high_res") final String s3, @n(name = "highest_res") final String s4, @n(name = "recommended_res") final String s5) {
        return new RedditVideoMp4Urls(s, s2, s3, s4, s5);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RedditVideoMp4Urls)) {
            return false;
        }
        final RedditVideoMp4Urls redditVideoMp4Urls = (RedditVideoMp4Urls)o;
        return e.a((Object)this.lowRes, (Object)redditVideoMp4Urls.lowRes) && e.a((Object)this.mediumRes, (Object)redditVideoMp4Urls.mediumRes) && e.a((Object)this.highRes, (Object)redditVideoMp4Urls.highRes) && e.a((Object)this.highestRes, (Object)redditVideoMp4Urls.highestRes) && e.a((Object)this.recommendedRes, (Object)redditVideoMp4Urls.recommendedRes);
    }
    
    public final String getHighRes() {
        return this.highRes;
    }
    
    public final String getHighestRes() {
        return this.highestRes;
    }
    
    public final String getLowRes() {
        return this.lowRes;
    }
    
    public final String getMediumRes() {
        return this.mediumRes;
    }
    
    public final String getRecommendedRes() {
        return this.recommendedRes;
    }
    
    @Override
    public int hashCode() {
        final String lowRes = this.lowRes;
        int hashCode = 0;
        int hashCode2;
        if (lowRes == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = lowRes.hashCode();
        }
        final String mediumRes = this.mediumRes;
        int hashCode3;
        if (mediumRes == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = mediumRes.hashCode();
        }
        final String highRes = this.highRes;
        int hashCode4;
        if (highRes == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = highRes.hashCode();
        }
        final String highestRes = this.highestRes;
        int hashCode5;
        if (highestRes == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = highestRes.hashCode();
        }
        final String recommendedRes = this.recommendedRes;
        if (recommendedRes != null) {
            hashCode = recommendedRes.hashCode();
        }
        return (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("RedditVideoMp4Urls(lowRes=");
        t.append(this.lowRes);
        t.append(", mediumRes=");
        t.append(this.mediumRes);
        t.append(", highRes=");
        t.append(this.highRes);
        t.append(", highestRes=");
        t.append(this.highestRes);
        t.append(", recommendedRes=");
        return h.c(t, this.recommendedRes, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.lowRes);
        parcel.writeString(this.mediumRes);
        parcel.writeString(this.highRes);
        parcel.writeString(this.highestRes);
        parcel.writeString(this.recommendedRes);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<RedditVideoMp4Urls>
    {
        public final RedditVideoMp4Urls createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            return new RedditVideoMp4Urls(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
        
        public /* bridge */ Object createFromParcel(final Parcel parcel) {
            return this.createFromParcel(parcel);
        }
        
        public final RedditVideoMp4Urls[] newArray(final int n) {
            return new RedditVideoMp4Urls[n];
        }
        
        public /* bridge */ Object[] newArray(final int n) {
            return this.newArray(n);
        }
    }
}

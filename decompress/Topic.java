// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.search;

import android.os.Parcel;
import androidx.appcompat.widget.s0;
import ag0.a;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ak0.m;
import com.squareup.moshi.n;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\r\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0010\u001a\u00020\b\u0012\b\b\u0003\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b*\u0010+J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\t\u001a\u00020\bH\u00c6\u0003J\t\u0010\n\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0002H\u00c6\u0003JQ\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\r\u001a\u00020\u00022\b\b\u0003\u0010\u000e\u001a\u00020\u00052\b\b\u0003\u0010\u000f\u001a\u00020\u00052\b\b\u0003\u0010\u0010\u001a\u00020\b2\b\b\u0003\u0010\u0011\u001a\u00020\u00022\b\b\u0003\u0010\u0012\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\u0014\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\bH\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\bH\u00d6\u0001J\u0019\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\bH\u00d6\u0001R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b\u000e\u0010$R\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b\u000f\u0010$R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b(\u0010!R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001f\u001a\u0004\b)\u0010!¨\u0006," }, d2 = { "Lcom/reddit/domain/model/search/Topic;", "Landroid/os/Parcelable;", "", "component1", "component2", "", "component3", "component4", "", "component5", "component6", "component7", "bannerImg", "description", "isSubscribed", "isLive", "followerCount", "categoryId", "categoryName", "copy", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getBannerImg", "()Ljava/lang/String;", "getDescription", "Z", "()Z", "I", "getFollowerCount", "()I", "getCategoryId", "getCategoryName", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/String;Ljava/lang/String;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class Topic implements Parcelable
{
    public static final Parcelable$Creator<Topic> CREATOR;
    private final String bannerImg;
    private final String categoryId;
    private final String categoryName;
    private final String description;
    private final int followerCount;
    private final boolean isLive;
    private final boolean isSubscribed;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public Topic(@n(name = "banner_img") final String bannerImg, @n(name = "description") final String description, @n(name = "is_subscribed") final boolean isSubscribed, @n(name = "is_live") final boolean isLive, @n(name = "follower_count") final int followerCount, @n(name = "category_id") final String categoryId, @n(name = "category_name") final String categoryName) {
        m.y(description, "description", categoryId, "categoryId", categoryName, "categoryName");
        this.bannerImg = bannerImg;
        this.description = description;
        this.isSubscribed = isSubscribed;
        this.isLive = isLive;
        this.followerCount = followerCount;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }
    
    public final String component1() {
        return this.bannerImg;
    }
    
    public final String component2() {
        return this.description;
    }
    
    public final boolean component3() {
        return this.isSubscribed;
    }
    
    public final boolean component4() {
        return this.isLive;
    }
    
    public final int component5() {
        return this.followerCount;
    }
    
    public final String component6() {
        return this.categoryId;
    }
    
    public final String component7() {
        return this.categoryName;
    }
    
    public final Topic copy(@n(name = "banner_img") final String s, @n(name = "description") final String s2, @n(name = "is_subscribed") final boolean b, @n(name = "is_live") final boolean b2, @n(name = "follower_count") final int n, @n(name = "category_id") final String s3, @n(name = "category_name") final String s4) {
        f.f((Object)s2, "description");
        f.f((Object)s3, "categoryId");
        f.f((Object)s4, "categoryName");
        return new Topic(s, s2, b, b2, n, s3, s4);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Topic)) {
            return false;
        }
        final Topic topic = (Topic)o;
        return f.a((Object)this.bannerImg, (Object)topic.bannerImg) && f.a((Object)this.description, (Object)topic.description) && this.isSubscribed == topic.isSubscribed && this.isLive == topic.isLive && this.followerCount == topic.followerCount && f.a((Object)this.categoryId, (Object)topic.categoryId) && f.a((Object)this.categoryName, (Object)topic.categoryName);
    }
    
    public final String getBannerImg() {
        return this.bannerImg;
    }
    
    public final String getCategoryId() {
        return this.categoryId;
    }
    
    public final String getCategoryName() {
        return this.categoryName;
    }
    
    public final String getDescription() {
        return this.description;
    }
    
    public final int getFollowerCount() {
        return this.followerCount;
    }
    
    @Override
    public int hashCode() {
        final String bannerImg = this.bannerImg;
        int hashCode;
        if (bannerImg == null) {
            hashCode = 0;
        }
        else {
            hashCode = bannerImg.hashCode();
        }
        final int f = a.f(this.description, hashCode * 31, 31);
        final int isSubscribed = this.isSubscribed ? 1 : 0;
        int n = 1;
        int n2 = isSubscribed;
        if (isSubscribed != 0) {
            n2 = 1;
        }
        final int isLive = this.isLive ? 1 : 0;
        if (isLive == 0) {
            n = isLive;
        }
        return this.categoryName.hashCode() + a.f(this.categoryId, s0.e(this.followerCount, ((f + n2) * 31 + n) * 31, 31), 31);
    }
    
    public final boolean isLive() {
        return this.isLive;
    }
    
    public final boolean isSubscribed() {
        return this.isSubscribed;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Topic(bannerImg=");
        k.append(this.bannerImg);
        k.append(", description=");
        k.append(this.description);
        k.append(", isSubscribed=");
        k.append(this.isSubscribed);
        k.append(", isLive=");
        k.append(this.isLive);
        k.append(", followerCount=");
        k.append(this.followerCount);
        k.append(", categoryId=");
        k.append(this.categoryId);
        k.append(", categoryName=");
        return b.k(k, this.categoryName, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.bannerImg);
        parcel.writeString(this.description);
        parcel.writeInt((int)(this.isSubscribed ? 1 : 0));
        parcel.writeInt((int)(this.isLive ? 1 : 0));
        parcel.writeInt(this.followerCount);
        parcel.writeString(this.categoryId);
        parcel.writeString(this.categoryName);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<Topic>
    {
        public final Topic createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            final int int1 = parcel.readInt();
            boolean b = false;
            final boolean b2 = int1 != 0;
            if (parcel.readInt() != 0) {
                b = true;
            }
            return new Topic(string, string2, b2, b, parcel.readInt(), parcel.readString(), parcel.readString());
        }
        
        public final Topic[] newArray(final int n) {
            return new Topic[n];
        }
    }
}

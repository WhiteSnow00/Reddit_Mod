// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import android.os.Parcel;
import p1.h;
import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.squareup.moshi.n;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J-\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001J\t\u0010\n\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u000bH\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bH\u00d6\u0001R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001e" }, d2 = { "Lcom/reddit/domain/chat/model/User;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "userId", "nickname", "profileUrl", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lcg2/j;", "writeToParcel", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "getNickname", "getProfileUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class User implements Parcelable
{
    public static final Parcelable$Creator<User> CREATOR;
    private final String nickname;
    private final String profileUrl;
    private final String userId;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public User(@n(name = "user_id") final String userId, @n(name = "nickname") final String nickname, @n(name = "profile_url") final String profileUrl) {
        this.userId = userId;
        this.nickname = nickname;
        this.profileUrl = profileUrl;
    }
    
    public User(final String s, final String s2, String s3, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x4) != 0x0) {
            s3 = null;
        }
        this(s, s2, s3);
    }
    
    public static User copy$default(final User user, String userId, String nickname, String profileUrl, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            userId = user.userId;
        }
        if ((n & 0x2) != 0x0) {
            nickname = user.nickname;
        }
        if ((n & 0x4) != 0x0) {
            profileUrl = user.profileUrl;
        }
        return user.copy(userId, nickname, profileUrl);
    }
    
    public final String component1() {
        return this.userId;
    }
    
    public final String component2() {
        return this.nickname;
    }
    
    public final String component3() {
        return this.profileUrl;
    }
    
    public final User copy(@n(name = "user_id") final String s, @n(name = "nickname") final String s2, @n(name = "profile_url") final String s3) {
        return new User(s, s2, s3);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        final User user = (User)o;
        return e.a((Object)this.userId, (Object)user.userId) && e.a((Object)this.nickname, (Object)user.nickname) && e.a((Object)this.profileUrl, (Object)user.profileUrl);
    }
    
    public final String getNickname() {
        return this.nickname;
    }
    
    public final String getProfileUrl() {
        return this.profileUrl;
    }
    
    public final String getUserId() {
        return this.userId;
    }
    
    @Override
    public int hashCode() {
        final String userId = this.userId;
        int hashCode = 0;
        int hashCode2;
        if (userId == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = userId.hashCode();
        }
        final String nickname = this.nickname;
        int hashCode3;
        if (nickname == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = nickname.hashCode();
        }
        final String profileUrl = this.profileUrl;
        if (profileUrl != null) {
            hashCode = profileUrl.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("User(userId=");
        t.append(this.userId);
        t.append(", nickname=");
        t.append(this.nickname);
        t.append(", profileUrl=");
        return h.c(t, this.profileUrl, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.userId);
        parcel.writeString(this.nickname);
        parcel.writeString(this.profileUrl);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<User>
    {
        public final User createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            return new User(parcel.readString(), parcel.readString(), parcel.readString());
        }
        
        public /* bridge */ Object createFromParcel(final Parcel parcel) {
            return this.createFromParcel(parcel);
        }
        
        public final User[] newArray(final int n) {
            return new User[n];
        }
        
        public /* bridge */ Object[] newArray(final int n) {
            return this.newArray(n);
        }
    }
}

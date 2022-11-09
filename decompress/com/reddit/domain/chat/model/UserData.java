// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import android.os.Parcel;
import androidx.appcompat.widget.s0;
import ag0.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b8\u00109J\t\u0010\u0004\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003¢\u0006\u0004\b\u000e\u0010\rJ\t\u0010\u000f\u001a\u00020\u000bH\u00c6\u0003Jf\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000bH\u00c6\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0007H\u00d6\u0001J\u0013\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0007H\u00d6\u0001R\u0017\u0010\u0010\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0011\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b(\u0010'R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010%\u001a\u0004\b)\u0010'R\u0017\u0010\u0013\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010-\u001a\u0004\b.\u0010/R$\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u00100\u001a\u0004\b1\u0010\r\"\u0004\b2\u00103R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0016\u00100\u001a\u0004\b\u0016\u0010\rR\"\u0010\u0017\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u00104\u001a\u0004\b\u0017\u00105\"\u0004\b6\u00107¨\u0006:" }, d2 = { "Lcom/reddit/domain/chat/model/UserData;", "Landroid/os/Parcelable;", "Lcom/reddit/domain/chat/model/ChatMember;", "", "component1", "component2", "component3", "", "component4", "", "component5", "", "component6", "()Ljava/lang/Boolean;", "component7", "component8", "userId", "username", "iconUrl", "karma", "createdUtc", "blocked", "isNsfw", "isOperator", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/Boolean;Ljava/lang/Boolean;Z)Lcom/reddit/domain/chat/model/UserData;", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "getUsername", "getIconUrl", "I", "getKarma", "()I", "J", "getCreatedUtc", "()J", "Ljava/lang/Boolean;", "getBlocked", "setBlocked", "(Ljava/lang/Boolean;)V", "Z", "()Z", "setOperator", "(Z)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/Boolean;Ljava/lang/Boolean;Z)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class UserData implements Parcelable, ChatMember
{
    public static final Parcelable$Creator<UserData> CREATOR;
    private Boolean blocked;
    private final long createdUtc;
    private final String iconUrl;
    private final Boolean isNsfw;
    private boolean isOperator;
    private final int karma;
    private final String userId;
    private final String username;
    
    static {
        CREATOR = (Parcelable$Creator)new UserData$Creator();
    }
    
    public UserData(final String userId, final String username, final String iconUrl, final int karma, final long createdUtc, final Boolean blocked, final Boolean isNsfw, final boolean isOperator) {
        f.f((Object)userId, "userId");
        f.f((Object)username, "username");
        this.userId = userId;
        this.username = username;
        this.iconUrl = iconUrl;
        this.karma = karma;
        this.createdUtc = createdUtc;
        this.blocked = blocked;
        this.isNsfw = isNsfw;
        this.isOperator = isOperator;
    }
    
    public final String component1() {
        return this.userId;
    }
    
    public final String component2() {
        return this.username;
    }
    
    public final String component3() {
        return this.iconUrl;
    }
    
    public final int component4() {
        return this.karma;
    }
    
    public final long component5() {
        return this.createdUtc;
    }
    
    public final Boolean component6() {
        return this.blocked;
    }
    
    public final Boolean component7() {
        return this.isNsfw;
    }
    
    public final boolean component8() {
        return this.isOperator;
    }
    
    public final UserData copy(final String s, final String s2, final String s3, final int n, final long n2, final Boolean b, final Boolean b2, final boolean b3) {
        f.f((Object)s, "userId");
        f.f((Object)s2, "username");
        return new UserData(s, s2, s3, n, n2, b, b2, b3);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserData)) {
            return false;
        }
        final UserData userData = (UserData)o;
        return f.a((Object)this.userId, (Object)userData.userId) && f.a((Object)this.username, (Object)userData.username) && f.a((Object)this.iconUrl, (Object)userData.iconUrl) && this.karma == userData.karma && this.createdUtc == userData.createdUtc && f.a((Object)this.blocked, (Object)userData.blocked) && f.a((Object)this.isNsfw, (Object)userData.isNsfw) && this.isOperator == userData.isOperator;
    }
    
    public final Boolean getBlocked() {
        return this.blocked;
    }
    
    public final long getCreatedUtc() {
        return this.createdUtc;
    }
    
    public final String getIconUrl() {
        return this.iconUrl;
    }
    
    public final int getKarma() {
        return this.karma;
    }
    
    public final String getUserId() {
        return this.userId;
    }
    
    public final String getUsername() {
        return this.username;
    }
    
    @Override
    public int hashCode() {
        final int f = a.f(this.username, this.userId.hashCode() * 31, 31);
        final String iconUrl = this.iconUrl;
        int hashCode = 0;
        int hashCode2;
        if (iconUrl == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = iconUrl.hashCode();
        }
        final int c = b.c(this.createdUtc, s0.e(this.karma, (f + hashCode2) * 31, 31), 31);
        final Boolean blocked = this.blocked;
        int hashCode3;
        if (blocked == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = blocked.hashCode();
        }
        final Boolean isNsfw = this.isNsfw;
        if (isNsfw != null) {
            hashCode = isNsfw.hashCode();
        }
        int isOperator;
        if ((isOperator = (this.isOperator ? 1 : 0)) != 0) {
            isOperator = 1;
        }
        return ((c + hashCode3) * 31 + hashCode) * 31 + isOperator;
    }
    
    public final Boolean isNsfw() {
        return this.isNsfw;
    }
    
    public final boolean isOperator() {
        return this.isOperator;
    }
    
    public final void setBlocked(final Boolean blocked) {
        this.blocked = blocked;
    }
    
    public final void setOperator(final boolean isOperator) {
        this.isOperator = isOperator;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("UserData(userId=");
        k.append(this.userId);
        k.append(", username=");
        k.append(this.username);
        k.append(", iconUrl=");
        k.append(this.iconUrl);
        k.append(", karma=");
        k.append(this.karma);
        k.append(", createdUtc=");
        k.append(this.createdUtc);
        k.append(", blocked=");
        k.append(this.blocked);
        k.append(", isNsfw=");
        k.append(this.isNsfw);
        k.append(", isOperator=");
        return s0.o(k, this.isOperator, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.userId);
        parcel.writeString(this.username);
        parcel.writeString(this.iconUrl);
        parcel.writeInt(this.karma);
        parcel.writeLong(this.createdUtc);
        final Boolean blocked = this.blocked;
        if (blocked == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, blocked);
        }
        final Boolean isNsfw = this.isNsfw;
        if (isNsfw == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, isNsfw);
        }
        parcel.writeInt((int)(this.isOperator ? 1 : 0));
    }
}

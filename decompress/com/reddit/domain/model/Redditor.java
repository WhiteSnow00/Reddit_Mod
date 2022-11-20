// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import java.util.ArrayList;
import java.util.Iterator;
import android.os.Parcel;
import aq2.a;
import ng2.e;
import com.reddit.domain.image.model.ImageResolution;
import java.util.List;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b'\u0010(J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\t\u0010\n\u001a\u00020\tH\u00c6\u0003JC\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\tH\u00c6\u0001J\t\u0010\u0011\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0012H\u00d6\u0001J\u0019\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0012H\u00d6\u0001R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b\u000f\u0010&¨\u0006)" }, d2 = { "Lcom/reddit/domain/model/Redditor;", "Landroid/os/Parcelable;", "", "component1", "component2", "", "Lcom/reddit/domain/image/model/ImageResolution;", "component3", "component4", "", "component5", "userId", "username", "resizedIcons", "snoovatarIconUrl", "isNsfw", "copy", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lcg2/j;", "writeToParcel", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "getUsername", "Ljava/util/List;", "getResizedIcons", "()Ljava/util/List;", "getSnoovatarIconUrl", "Z", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class Redditor implements Parcelable
{
    public static final Parcelable$Creator<Redditor> CREATOR;
    private final boolean isNsfw;
    private final List<ImageResolution> resizedIcons;
    private final String snoovatarIconUrl;
    private final String userId;
    private final String username;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public Redditor(final String userId, final String username, final List<ImageResolution> resizedIcons, final String snoovatarIconUrl, final boolean isNsfw) {
        e.f((Object)userId, "userId");
        e.f((Object)username, "username");
        e.f((Object)resizedIcons, "resizedIcons");
        this.userId = userId;
        this.username = username;
        this.resizedIcons = resizedIcons;
        this.snoovatarIconUrl = snoovatarIconUrl;
        this.isNsfw = isNsfw;
    }
    
    public static Redditor copy$default(final Redditor redditor, String userId, String username, List resizedIcons, String snoovatarIconUrl, boolean isNsfw, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            userId = redditor.userId;
        }
        if ((n & 0x2) != 0x0) {
            username = redditor.username;
        }
        if ((n & 0x4) != 0x0) {
            resizedIcons = redditor.resizedIcons;
        }
        if ((n & 0x8) != 0x0) {
            snoovatarIconUrl = redditor.snoovatarIconUrl;
        }
        if ((n & 0x10) != 0x0) {
            isNsfw = redditor.isNsfw;
        }
        return redditor.copy(userId, username, resizedIcons, snoovatarIconUrl, isNsfw);
    }
    
    public final String component1() {
        return this.userId;
    }
    
    public final String component2() {
        return this.username;
    }
    
    public final List<ImageResolution> component3() {
        return this.resizedIcons;
    }
    
    public final String component4() {
        return this.snoovatarIconUrl;
    }
    
    public final boolean component5() {
        return this.isNsfw;
    }
    
    public final Redditor copy(final String s, final String s2, final List<ImageResolution> list, final String s3, final boolean b) {
        e.f((Object)s, "userId");
        e.f((Object)s2, "username");
        e.f((Object)list, "resizedIcons");
        return new Redditor(s, s2, list, s3, b);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Redditor)) {
            return false;
        }
        final Redditor redditor = (Redditor)o;
        return e.a((Object)this.userId, (Object)redditor.userId) && e.a((Object)this.username, (Object)redditor.username) && e.a((Object)this.resizedIcons, (Object)redditor.resizedIcons) && e.a((Object)this.snoovatarIconUrl, (Object)redditor.snoovatarIconUrl) && this.isNsfw == redditor.isNsfw;
    }
    
    public final List<ImageResolution> getResizedIcons() {
        return this.resizedIcons;
    }
    
    public final String getSnoovatarIconUrl() {
        return this.snoovatarIconUrl;
    }
    
    public final String getUserId() {
        return this.userId;
    }
    
    public final String getUsername() {
        return this.username;
    }
    
    @Override
    public int hashCode() {
        final int b = ph0.a.b((List)this.resizedIcons, a.e(this.username, this.userId.hashCode() * 31, 31), 31);
        final String snoovatarIconUrl = this.snoovatarIconUrl;
        int hashCode;
        if (snoovatarIconUrl == null) {
            hashCode = 0;
        }
        else {
            hashCode = snoovatarIconUrl.hashCode();
        }
        int isNsfw;
        if ((isNsfw = (this.isNsfw ? 1 : 0)) != 0) {
            isNsfw = 1;
        }
        return (b + hashCode) * 31 + isNsfw;
    }
    
    public final boolean isNsfw() {
        return this.isNsfw;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("Redditor(userId=");
        t.append(this.userId);
        t.append(", username=");
        t.append(this.username);
        t.append(", resizedIcons=");
        t.append(this.resizedIcons);
        t.append(", snoovatarIconUrl=");
        t.append(this.snoovatarIconUrl);
        t.append(", isNsfw=");
        return d.n(t, this.isNsfw, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.userId);
        parcel.writeString(this.username);
        final Iterator r = android.support.v4.media.a.r((List)this.resizedIcons, parcel);
        while (r.hasNext()) {
            parcel.writeParcelable((Parcelable)r.next(), n);
        }
        parcel.writeString(this.snoovatarIconUrl);
        parcel.writeInt((int)(this.isNsfw ? 1 : 0));
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<Redditor>
    {
        public final Redditor createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            final int int1 = parcel.readInt();
            final ArrayList list = new ArrayList(int1);
            for (int i = 0; i != int1; i = android.support.v4.media.a.f((Class)Redditor.class, parcel, list, i, 1)) {}
            return new Redditor(string, string2, (List<ImageResolution>)list, parcel.readString(), parcel.readInt() != 0);
        }
        
        public /* bridge */ Object createFromParcel(final Parcel parcel) {
            return this.createFromParcel(parcel);
        }
        
        public final Redditor[] newArray(final int n) {
            return new Redditor[n];
        }
        
        public /* bridge */ Object[] newArray(final int n) {
            return this.newArray(n);
        }
    }
}

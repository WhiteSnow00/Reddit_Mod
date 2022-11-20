// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import android.os.Parcel;
import aq2.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng2.e;
import com.squareup.moshi.n;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0004\b\b\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0004\b\t\u0010\u0007JH\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0011\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0012H\u00d6\u0001J\u0019\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0012H\u00d6\u0001R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010\u0007R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b#\u0010\u0007R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b$\u0010\u0007¨\u0006'" }, d2 = { "Lcom/reddit/domain/model/Snoomoji;", "Landroid/os/Parcelable;", "", "component1", "component2", "", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "url", "createdBy", "userFlairAllowed", "postFlairAllowed", "modFlairOnly", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/reddit/domain/model/Snoomoji;", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lcg2/j;", "writeToParcel", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "getCreatedBy", "Ljava/lang/Boolean;", "getUserFlairAllowed", "getPostFlairAllowed", "getModFlairOnly", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class Snoomoji implements Parcelable
{
    public static final Parcelable$Creator<Snoomoji> CREATOR;
    private final String createdBy;
    private final Boolean modFlairOnly;
    private final Boolean postFlairAllowed;
    private final String url;
    private final Boolean userFlairAllowed;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public Snoomoji(final String url, @n(name = "created_by") final String createdBy, @n(name = "user_flair_allowed") final Boolean userFlairAllowed, @n(name = "post_flair_allowed") final Boolean postFlairAllowed, @n(name = "mod_flair_only") final Boolean modFlairOnly) {
        e.f((Object)url, "url");
        e.f((Object)createdBy, "createdBy");
        this.url = url;
        this.createdBy = createdBy;
        this.userFlairAllowed = userFlairAllowed;
        this.postFlairAllowed = postFlairAllowed;
        this.modFlairOnly = modFlairOnly;
    }
    
    public Snoomoji(final String s, final String s2, Boolean true, Boolean true2, Boolean false, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x4) != 0x0) {
            true = Boolean.TRUE;
        }
        if ((n & 0x8) != 0x0) {
            true2 = Boolean.TRUE;
        }
        if ((n & 0x10) != 0x0) {
            false = Boolean.FALSE;
        }
        this(s, s2, true, true2, false);
    }
    
    public static Snoomoji copy$default(final Snoomoji snoomoji, String url, String createdBy, Boolean userFlairAllowed, Boolean postFlairAllowed, Boolean modFlairOnly, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            url = snoomoji.url;
        }
        if ((n & 0x2) != 0x0) {
            createdBy = snoomoji.createdBy;
        }
        if ((n & 0x4) != 0x0) {
            userFlairAllowed = snoomoji.userFlairAllowed;
        }
        if ((n & 0x8) != 0x0) {
            postFlairAllowed = snoomoji.postFlairAllowed;
        }
        if ((n & 0x10) != 0x0) {
            modFlairOnly = snoomoji.modFlairOnly;
        }
        return snoomoji.copy(url, createdBy, userFlairAllowed, postFlairAllowed, modFlairOnly);
    }
    
    public final String component1() {
        return this.url;
    }
    
    public final String component2() {
        return this.createdBy;
    }
    
    public final Boolean component3() {
        return this.userFlairAllowed;
    }
    
    public final Boolean component4() {
        return this.postFlairAllowed;
    }
    
    public final Boolean component5() {
        return this.modFlairOnly;
    }
    
    public final Snoomoji copy(final String s, @n(name = "created_by") final String s2, @n(name = "user_flair_allowed") final Boolean b, @n(name = "post_flair_allowed") final Boolean b2, @n(name = "mod_flair_only") final Boolean b3) {
        e.f((Object)s, "url");
        e.f((Object)s2, "createdBy");
        return new Snoomoji(s, s2, b, b2, b3);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Snoomoji)) {
            return false;
        }
        final Snoomoji snoomoji = (Snoomoji)o;
        return e.a((Object)this.url, (Object)snoomoji.url) && e.a((Object)this.createdBy, (Object)snoomoji.createdBy) && e.a((Object)this.userFlairAllowed, (Object)snoomoji.userFlairAllowed) && e.a((Object)this.postFlairAllowed, (Object)snoomoji.postFlairAllowed) && e.a((Object)this.modFlairOnly, (Object)snoomoji.modFlairOnly);
    }
    
    public final String getCreatedBy() {
        return this.createdBy;
    }
    
    public final Boolean getModFlairOnly() {
        return this.modFlairOnly;
    }
    
    public final Boolean getPostFlairAllowed() {
        return this.postFlairAllowed;
    }
    
    public final String getUrl() {
        return this.url;
    }
    
    public final Boolean getUserFlairAllowed() {
        return this.userFlairAllowed;
    }
    
    @Override
    public int hashCode() {
        final int e = a.e(this.createdBy, this.url.hashCode() * 31, 31);
        final Boolean userFlairAllowed = this.userFlairAllowed;
        int hashCode = 0;
        int hashCode2;
        if (userFlairAllowed == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = userFlairAllowed.hashCode();
        }
        final Boolean postFlairAllowed = this.postFlairAllowed;
        int hashCode3;
        if (postFlairAllowed == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = postFlairAllowed.hashCode();
        }
        final Boolean modFlairOnly = this.modFlairOnly;
        if (modFlairOnly != null) {
            hashCode = modFlairOnly.hashCode();
        }
        return ((e + hashCode2) * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("Snoomoji(url=");
        t.append(this.url);
        t.append(", createdBy=");
        t.append(this.createdBy);
        t.append(", userFlairAllowed=");
        t.append(this.userFlairAllowed);
        t.append(", postFlairAllowed=");
        t.append(this.postFlairAllowed);
        t.append(", modFlairOnly=");
        return android.support.v4.media.a.m(t, this.modFlairOnly, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.url);
        parcel.writeString(this.createdBy);
        final Boolean userFlairAllowed = this.userFlairAllowed;
        if (userFlairAllowed == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, userFlairAllowed);
        }
        final Boolean postFlairAllowed = this.postFlairAllowed;
        if (postFlairAllowed == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, postFlairAllowed);
        }
        final Boolean modFlairOnly = this.modFlairOnly;
        if (modFlairOnly == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, modFlairOnly);
        }
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<Snoomoji>
    {
        public final Snoomoji createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            final int int1 = parcel.readInt();
            final boolean b = true;
            final Boolean b2 = null;
            Boolean value;
            if (int1 == 0) {
                value = null;
            }
            else {
                value = (parcel.readInt() != 0);
            }
            Boolean value2;
            if (parcel.readInt() == 0) {
                value2 = null;
            }
            else {
                value2 = (parcel.readInt() != 0);
            }
            Boolean value3;
            if (parcel.readInt() == 0) {
                value3 = b2;
            }
            else {
                value3 = (parcel.readInt() != 0 && b);
            }
            return new Snoomoji(string, string2, value, value2, value3);
        }
        
        public /* bridge */ Object createFromParcel(final Parcel parcel) {
            return this.createFromParcel(parcel);
        }
        
        public final Snoomoji[] newArray(final int n) {
            return new Snoomoji[n];
        }
        
        public /* bridge */ Object[] newArray(final int n) {
            return this.newArray(n);
        }
    }
}

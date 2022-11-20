// 
// Decompiled by Procyon v0.6.0
// 

package xc0;

import android.os.Parcel;
import p1.h;
import ng2.e;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class a implements Parcelable
{
    public static final Parcelable$Creator<a> CREATOR;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final long k;
    public final String l;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public a(final String f, final String g, final String h, final String i, final String j, final long k, final String l) {
        b.w(f, "prefixedName", g, "id", h, "publicDescriptionText");
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        return e.a((Object)this.f, (Object)a.f) && e.a((Object)this.g, (Object)a.g) && e.a((Object)this.h, (Object)a.h) && e.a((Object)this.i, (Object)a.i) && e.a((Object)this.j, (Object)a.j) && this.k == a.k && e.a((Object)this.l, (Object)a.l);
    }
    
    @Override
    public final int hashCode() {
        final int e = a.e(this.h, a.e(this.g, this.f.hashCode() * 31, 31), 31);
        final String i = this.i;
        final int n = 0;
        int hashCode;
        if (i == null) {
            hashCode = 0;
        }
        else {
            hashCode = i.hashCode();
        }
        final String j = this.j;
        int hashCode2;
        if (j == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = j.hashCode();
        }
        final int b = b.b(this.k, ((e + hashCode) * 31 + hashCode2) * 31, 31);
        final String l = this.l;
        int hashCode3;
        if (l == null) {
            hashCode3 = n;
        }
        else {
            hashCode3 = l.hashCode();
        }
        return b + hashCode3;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("InterestTopicSubreddit(prefixedName=");
        t.append(this.f);
        t.append(", id=");
        t.append(this.g);
        t.append(", publicDescriptionText=");
        t.append(this.h);
        t.append(", communityIcon=");
        t.append(this.i);
        t.append(", primaryColor=");
        t.append(this.j);
        t.append(", subscribersCount=");
        t.append(this.k);
        t.append(", detectedLanguage=");
        return p1.h.c(t, this.l, ')');
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeLong(this.k);
        parcel.writeString(this.l);
    }
    
    public static final class a implements Parcelable$Creator<xc0.a>
    {
        public final Object createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            return new xc0.a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString());
        }
        
        public final Object[] newArray(final int n) {
            return new xc0.a[n];
        }
    }
}

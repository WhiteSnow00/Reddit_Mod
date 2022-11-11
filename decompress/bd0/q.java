// 
// Decompiled by Procyon v0.6.0
// 

package bd0;

import android.os.Parcel;
import al0.g7;
import sg2.e;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class q implements Parcelable
{
    public static final Parcelable$Creator<q> CREATOR;
    public final int f;
    public final long g;
    public final String h;
    public final String i;
    public final String j;
    public final boolean k;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public q(final int f, final long g, final String h, final String i, final String j, final boolean k) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof q)) {
            return false;
        }
        final q q = (q)o;
        return this.f == q.f && this.g == q.g && e.a((Object)this.h, (Object)q.h) && e.a((Object)this.i, (Object)q.i) && e.a((Object)this.j, (Object)q.j) && this.k == q.k;
    }
    
    @Override
    public final int hashCode() {
        final int b = b.b(this.g, Integer.hashCode(this.f) * 31, 31);
        final String h = this.h;
        int hashCode = 0;
        int hashCode2;
        if (h == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = h.hashCode();
        }
        final String i = this.i;
        int hashCode3;
        if (i == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = i.hashCode();
        }
        final String j = this.j;
        if (j != null) {
            hashCode = j.hashCode();
        }
        int k;
        if ((k = (this.k ? 1 : 0)) != 0) {
            k = 1;
        }
        return (((b + hashCode2) * 31 + hashCode3) * 31 + hashCode) * 31 + k;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("SubredditTopSupporter(score=");
        r.append(this.f);
        r.append(", timestamp=");
        r.append(this.g);
        r.append(", name=");
        r.append(this.h);
        r.append(", iconUrl=");
        r.append(this.i);
        r.append(", snoovatarUrl=");
        r.append(this.j);
        r.append(", isNsfw=");
        return g7.m(r, this.k, ')');
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeInt(this.f);
        parcel.writeLong(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeInt((int)(this.k ? 1 : 0));
    }
    
    public static final class a implements Parcelable$Creator<q>
    {
        public final Object createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            return new q(parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }
        
        public final Object[] newArray(final int n) {
            return new q[n];
        }
    }
}

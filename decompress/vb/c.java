// 
// Decompiled by Procyon v0.6.0
// 

package vb;

import android.os.Parcelable;
import java.util.Arrays;
import bd.c0;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class c extends h
{
    public static final Parcelable$Creator<c> CREATOR;
    public final String g;
    public final int h;
    public final int i;
    public final long j;
    public final long k;
    public final h[] l;
    
    static {
        CREATOR = (Parcelable$Creator)new c$a();
    }
    
    public c(final Parcel parcel) {
        super("CHAP");
        final String string = parcel.readString();
        final int a = c0.a;
        this.g = string;
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = parcel.readLong();
        this.k = parcel.readLong();
        final int int1 = parcel.readInt();
        this.l = new h[int1];
        for (int i = 0; i < int1; ++i) {
            this.l[i] = (h)parcel.readParcelable(h.class.getClassLoader());
        }
    }
    
    public c(final String g, final int h, final int i, final long j, final long k, final h[] l) {
        super("CHAP");
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
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && c.class == o.getClass()) {
            final c c = (c)o;
            if (this.h != c.h || this.i != c.i || this.j != c.j || this.k != c.k || !c0.a((Object)this.g, (Object)c.g) || !Arrays.equals(this.l, c.l)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final int h = this.h;
        final int i = this.i;
        final int n = (int)this.j;
        final int n2 = (int)this.k;
        final String g = this.g;
        int hashCode;
        if (g != null) {
            hashCode = g.hashCode();
        }
        else {
            hashCode = 0;
        }
        return ((((527 + h) * 31 + i) * 31 + n) * 31 + n2) * 31 + hashCode;
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        parcel.writeString(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeLong(this.j);
        parcel.writeLong(this.k);
        parcel.writeInt(this.l.length);
        final h[] l = this.l;
        int length;
        for (length = l.length, i = 0; i < length; ++i) {
            parcel.writeParcelable((Parcelable)l[i], 0);
        }
    }
}

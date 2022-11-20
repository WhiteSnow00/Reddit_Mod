// 
// Decompiled by Procyon v0.6.0
// 

package vb;

import android.os.Parcelable;
import java.util.Arrays;
import bd.c0;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class d extends h
{
    public static final Parcelable$Creator<d> CREATOR;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final String[] j;
    public final h[] k;
    
    static {
        CREATOR = (Parcelable$Creator)new d$a();
    }
    
    public d(final Parcel parcel) {
        super("CTOC");
        final String string = parcel.readString();
        final int a = c0.a;
        this.g = string;
        final byte byte1 = parcel.readByte();
        final boolean b = true;
        int i = 0;
        this.h = (byte1 != 0);
        this.i = (parcel.readByte() != 0 && b);
        this.j = parcel.createStringArray();
        final int int1 = parcel.readInt();
        this.k = new h[int1];
        while (i < int1) {
            this.k[i] = (h)parcel.readParcelable(h.class.getClassLoader());
            ++i;
        }
    }
    
    public d(final String g, final boolean h, final boolean i, final String[] j, final h[] k) {
        super("CTOC");
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && d.class == o.getClass()) {
            final d d = (d)o;
            if (this.h != d.h || this.i != d.i || !c0.a((Object)this.g, (Object)d.g) || !Arrays.equals(this.j, d.j) || !Arrays.equals(this.k, d.k)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final int h = this.h ? 1 : 0;
        final int i = this.i ? 1 : 0;
        final String g = this.g;
        int hashCode;
        if (g != null) {
            hashCode = g.hashCode();
        }
        else {
            hashCode = 0;
        }
        return ((527 + h) * 31 + i) * 31 + hashCode;
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        parcel.writeString(this.g);
        parcel.writeByte((byte)(byte)(this.h ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.i ? 1 : 0));
        parcel.writeStringArray(this.j);
        parcel.writeInt(this.k.length);
        final h[] k = this.k;
        int length;
        for (length = k.length, i = 0; i < length; ++i) {
            parcel.writeParcelable((Parcelable)k[i], 0);
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package vb;

import xm2.a;
import u10.o;
import java.util.Arrays;
import bd.c0;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class k extends h
{
    public static final Parcelable$Creator<k> CREATOR;
    public final String g;
    public final byte[] h;
    
    static {
        CREATOR = (Parcelable$Creator)new k$a();
    }
    
    public k(final Parcel parcel) {
        super("PRIV");
        final String string = parcel.readString();
        final int a = c0.a;
        this.g = string;
        this.h = parcel.createByteArray();
    }
    
    public k(final String g, final byte[] h) {
        super("PRIV");
        this.g = g;
        this.h = h;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && k.class == o.getClass()) {
            final k k = (k)o;
            if (!c0.a((Object)this.g, (Object)k.g) || !Arrays.equals(this.h, k.h)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final String g = this.g;
        int hashCode;
        if (g != null) {
            hashCode = g.hashCode();
        }
        else {
            hashCode = 0;
        }
        return Arrays.hashCode(this.h) + (527 + hashCode) * 31;
    }
    
    public final String toString() {
        final String f = super.f;
        final String g = this.g;
        return a.a(o.e(g, o.e(f, 8)), f, ": owner=", g);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.g);
        parcel.writeByteArray(this.h);
    }
}

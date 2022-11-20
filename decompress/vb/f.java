// 
// Decompiled by Procyon v0.6.0
// 

package vb;

import u10.o;
import java.util.Arrays;
import bd.c0;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class f extends h
{
    public static final Parcelable$Creator<f> CREATOR;
    public final String g;
    public final String h;
    public final String i;
    public final byte[] j;
    
    static {
        CREATOR = (Parcelable$Creator)new f$a();
    }
    
    public f(final Parcel parcel) {
        super("GEOB");
        final String string = parcel.readString();
        final int a = c0.a;
        this.g = string;
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.createByteArray();
    }
    
    public f(final String g, final String h, final String i, final byte[] j) {
        super("GEOB");
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && f.class == o.getClass()) {
            final f f = (f)o;
            if (!c0.a((Object)this.g, (Object)f.g) || !c0.a((Object)this.h, (Object)f.h) || !c0.a((Object)this.i, (Object)f.i) || !Arrays.equals(this.j, f.j)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final String g = this.g;
        int hashCode = 0;
        int hashCode2;
        if (g != null) {
            hashCode2 = g.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String h = this.h;
        int hashCode3;
        if (h != null) {
            hashCode3 = h.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final String i = this.i;
        if (i != null) {
            hashCode = i.hashCode();
        }
        return Arrays.hashCode(this.j) + (((527 + hashCode2) * 31 + hashCode3) * 31 + hashCode) * 31;
    }
    
    public final String toString() {
        final String f = super.f;
        final String g = this.g;
        final String h = this.h;
        final String i = this.i;
        return a.r(d.p(o.e(i, o.e(h, o.e(g, o.e(f, 36)))), f, ": mimeType=", g, ", filename="), h, ", description=", i);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeByteArray(this.j);
    }
}

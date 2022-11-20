// 
// Decompiled by Procyon v0.6.0
// 

package vb;

import u10.o;
import java.util.Arrays;
import com.google.android.exoplayer2.r$a;
import bd.c0;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class a extends h
{
    public static final Parcelable$Creator<a> CREATOR;
    public final String g;
    public final String h;
    public final int i;
    public final byte[] j;
    
    static {
        CREATOR = (Parcelable$Creator)new a$a();
    }
    
    public a(final Parcel parcel) {
        super("APIC");
        final String string = parcel.readString();
        final int a = c0.a;
        this.g = string;
        this.h = parcel.readString();
        this.i = parcel.readInt();
        this.j = parcel.createByteArray();
    }
    
    public a(final String g, final String h, final int i, final byte[] j) {
        super("APIC");
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final void Q(final r$a r$a) {
        r$a.a(this.i, this.j);
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && a.class == o.getClass()) {
            final a a = (a)o;
            if (this.i != a.i || !c0.a((Object)this.g, (Object)a.g) || !c0.a((Object)this.h, (Object)a.h) || !Arrays.equals(this.j, a.j)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final int i = this.i;
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
        if (h != null) {
            hashCode = h.hashCode();
        }
        return Arrays.hashCode(this.j) + (((527 + i) * 31 + hashCode2) * 31 + hashCode) * 31;
    }
    
    public final String toString() {
        final String f = super.f;
        final String g = this.g;
        final String h = this.h;
        final StringBuilder p = d.p(o.e(h, o.e(g, o.e(f, 25))), f, ": mimeType=", g, ", description=");
        p.append(h);
        return p.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
        parcel.writeByteArray(this.j);
    }
}

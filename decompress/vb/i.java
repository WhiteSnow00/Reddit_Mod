// 
// Decompiled by Procyon v0.6.0
// 

package vb;

import u10.o;
import bd.c0;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class i extends h
{
    public static final Parcelable$Creator<i> CREATOR;
    public final String g;
    public final String h;
    public final String i;
    
    static {
        CREATOR = (Parcelable$Creator)new i$a();
    }
    
    public i(final Parcel parcel) {
        super("----");
        final String string = parcel.readString();
        final int a = c0.a;
        this.g = string;
        this.h = parcel.readString();
        this.i = parcel.readString();
    }
    
    public i(final String g, final String h, final String i) {
        super("----");
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && i.class == o.getClass()) {
            final i i = (i)o;
            if (!c0.a((Object)this.h, (Object)i.h) || !c0.a((Object)this.g, (Object)i.g) || !c0.a((Object)this.i, (Object)i.i)) {
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
        return ((527 + hashCode2) * 31 + hashCode3) * 31 + hashCode;
    }
    
    public final String toString() {
        final String f = super.f;
        final String g = this.g;
        final String h = this.h;
        final StringBuilder p = d.p(o.e(h, o.e(g, o.e(f, 23))), f, ": domain=", g, ", description=");
        p.append(h);
        return p.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(super.f);
        parcel.writeString(this.g);
        parcel.writeString(this.i);
    }
}

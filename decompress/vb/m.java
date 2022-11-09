// 
// Decompiled by Procyon v0.6.0
// 

package vb;

import ak0.n;
import ag0.a;
import bd.c0;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class m extends h
{
    public static final Parcelable$Creator<m> CREATOR;
    public final String g;
    public final String h;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<m>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new m(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new m[n];
            }
        };
    }
    
    public m(final Parcel parcel) {
        final String string = parcel.readString();
        final int a = c0.a;
        super(string);
        this.g = parcel.readString();
        this.h = parcel.readString();
    }
    
    public m(final String s, final String g, final String h) {
        super(s);
        this.g = g;
        this.h = h;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && m.class == o.getClass()) {
            final m m = (m)o;
            if (!super.f.equals(m.f) || !c0.a(this.g, m.g) || !c0.a(this.h, m.h)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final int f = a.f(super.f, 527, 31);
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
        return (f + hashCode2) * 31 + hashCode;
    }
    
    public final String toString() {
        final String f = super.f;
        final String h = this.h;
        return a.l(n.f(h, n.f(f, 6)), f, ": url=", h);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(super.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }
}

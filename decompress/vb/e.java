// 
// Decompiled by Procyon v0.6.0
// 

package vb;

import ak0.m;
import ak0.n;
import bd.c0;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class e extends h
{
    public static final Parcelable$Creator<e> CREATOR;
    public final String g;
    public final String h;
    public final String i;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<e>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new e(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new e[n];
            }
        };
    }
    
    public e(final Parcel parcel) {
        super("COMM");
        final String string = parcel.readString();
        final int a = c0.a;
        this.g = string;
        this.h = parcel.readString();
        this.i = parcel.readString();
    }
    
    public e(final String g, final String h, final String i) {
        super("COMM");
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && e.class == o.getClass()) {
            final e e = (e)o;
            if (!c0.a(this.h, e.h) || !c0.a(this.g, e.g) || !c0.a(this.i, e.i)) {
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
        final StringBuilder q = m.q(n.f(h, n.f(g, n.f(f, 25))), f, ": language=", g, ", description=");
        q.append(h);
        return q.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(super.f);
        parcel.writeString(this.g);
        parcel.writeString(this.i);
    }
}

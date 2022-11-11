// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.os.Parcel;
import lw0.b;
import android.os.Parcelable$Creator;
import qd.a;

public final class j7 extends a
{
    public static final Parcelable$Creator<j7> CREATOR;
    public final int f;
    public final String g;
    public final long h;
    public final Long i;
    public final String j;
    public final String k;
    public final Double l;
    
    static {
        CREATOR = (Parcelable$Creator)new k7();
    }
    
    public j7(final int f, final String g, final long h, final Long i, final Float n, final String j, final String k, final Double l) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        if (f == 1) {
            Double value;
            if (n != null) {
                value = (double)n;
            }
            else {
                value = null;
            }
            this.l = value;
        }
        else {
            this.l = l;
        }
        this.j = j;
        this.k = k;
    }
    
    public j7(final long h, final Object o, final String g, final String k) {
        b.O(g);
        this.f = 2;
        this.g = g;
        this.h = h;
        this.k = k;
        if (o == null) {
            this.i = null;
            this.l = null;
            this.j = null;
            return;
        }
        if (o instanceof Long) {
            this.i = (Long)o;
            this.l = null;
            this.j = null;
            return;
        }
        if (o instanceof String) {
            this.i = null;
            this.l = null;
            this.j = (String)o;
            return;
        }
        if (o instanceof Double) {
            this.i = null;
            this.l = (Double)o;
            this.j = null;
            return;
        }
        throw new IllegalArgumentException("User attribute given of un-supported type");
    }
    
    public j7(final l7 l7) {
        this(l7.d, l7.e, l7.c, l7.b);
    }
    
    public final Object q() {
        final Long i = this.i;
        if (i != null) {
            return i;
        }
        final Double l = this.l;
        if (l != null) {
            return l;
        }
        final String j = this.j;
        if (j != null) {
            return j;
        }
        return null;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        k7.a(this, parcel);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.os.Parcelable;
import android.os.Parcel;
import lw0.b;
import android.os.Parcelable$Creator;
import qd.a;

public final class c extends a
{
    public static final Parcelable$Creator<c> CREATOR;
    public String f;
    public String g;
    public j7 h;
    public long i;
    public boolean j;
    public String k;
    public final t l;
    public long m;
    public t n;
    public final long o;
    public final t p;
    
    static {
        CREATOR = (Parcelable$Creator)new d();
    }
    
    public c(final String f, final String g, final j7 h, final long i, final boolean j, final String k, final t l, final long m, final t n, final long o, final t p11) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p11;
    }
    
    public c(final c c) {
        b.R((Object)c);
        this.f = c.f;
        this.g = c.g;
        this.h = c.h;
        this.i = c.i;
        this.j = c.j;
        this.k = c.k;
        this.l = c.l;
        this.m = c.m;
        this.n = c.n;
        this.o = c.o;
        this.p = c.p;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int y0 = a92.b.y0(parcel, 20293);
        a92.b.t0(parcel, 2, this.f);
        a92.b.t0(parcel, 3, this.g);
        a92.b.s0(parcel, 4, (Parcelable)this.h, n);
        a92.b.q0(parcel, 5, this.i);
        a92.b.m0(parcel, 6, this.j);
        a92.b.t0(parcel, 7, this.k);
        a92.b.s0(parcel, 8, (Parcelable)this.l, n);
        a92.b.q0(parcel, 9, this.m);
        a92.b.s0(parcel, 10, (Parcelable)this.n, n);
        a92.b.q0(parcel, 11, this.o);
        a92.b.s0(parcel, 12, (Parcelable)this.p, n);
        a92.b.D0(parcel, y0);
    }
}

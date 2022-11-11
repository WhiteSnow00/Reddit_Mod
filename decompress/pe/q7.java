// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.os.Parcel;
import java.util.ArrayList;
import android.text.TextUtils;
import lw0.b;
import java.util.List;
import android.os.Parcelable$Creator;
import qd.a;

public final class q7 extends a
{
    public static final Parcelable$Creator<q7> CREATOR;
    public final String A;
    public final String B;
    public final String C;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final long j;
    public final long k;
    public final String l;
    public final boolean m;
    public final boolean n;
    public final long o;
    public final String p;
    @Deprecated
    public final long q;
    public final long r;
    public final int s;
    public final boolean t;
    public final boolean u;
    public final String v;
    public final Boolean w;
    public final long x;
    public final List y;
    public final String z;
    
    static {
        CREATOR = (Parcelable$Creator)new r7();
    }
    
    public q7(final String f, String g, final String h, final long o, final String i, final long j, final long k, final String l, final boolean m, final boolean n, final String p22, final long r, final int s, final boolean t, final boolean u, final String v, final Boolean w, final long x, final List y, final String a, final String b, final String c) {
        b.O(f);
        this.f = f;
        if (TextUtils.isEmpty((CharSequence)g)) {
            g = null;
        }
        this.g = g;
        this.h = h;
        this.o = o;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.p = p22;
        this.q = 0L;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = null;
        this.A = a;
        this.B = b;
        this.C = c;
    }
    
    public q7(final String f, final String g, final String h, final String i, final long j, final long k, final String l, final boolean m, final boolean n, final long o, final String p24, final long q, final long r, final int s, final boolean t, final boolean u, final String v, final Boolean w, final long x, final ArrayList y, final String z, final String a, final String b, final String c) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.o = o;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.p = p24;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = c;
    }
    
    public final void writeToParcel(final Parcel parcel, int y0) {
        y0 = a92.b.y0(parcel, 20293);
        a92.b.t0(parcel, 2, this.f);
        a92.b.t0(parcel, 3, this.g);
        a92.b.t0(parcel, 4, this.h);
        a92.b.t0(parcel, 5, this.i);
        a92.b.q0(parcel, 6, this.j);
        a92.b.q0(parcel, 7, this.k);
        a92.b.t0(parcel, 8, this.l);
        a92.b.m0(parcel, 9, this.m);
        a92.b.m0(parcel, 10, this.n);
        a92.b.q0(parcel, 11, this.o);
        a92.b.t0(parcel, 12, this.p);
        a92.b.q0(parcel, 13, this.q);
        a92.b.q0(parcel, 14, this.r);
        a92.b.p0(parcel, 15, this.s);
        a92.b.m0(parcel, 16, this.t);
        a92.b.m0(parcel, 18, this.u);
        a92.b.t0(parcel, 19, this.v);
        final Boolean w = this.w;
        if (w != null) {
            al0.b.o(parcel, 262165, w);
        }
        a92.b.q0(parcel, 22, this.x);
        a92.b.u0(parcel, 23, this.y);
        a92.b.t0(parcel, 24, this.z);
        a92.b.t0(parcel, 25, this.A);
        a92.b.t0(parcel, 26, this.B);
        a92.b.t0(parcel, 27, this.C);
        a92.b.D0(parcel, y0);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package he;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import hh.y;
import android.os.Parcelable$Creator;
import rd.a;

public final class wc extends a
{
    public static final Parcelable$Creator<wc> CREATOR;
    public String f;
    public String g;
    public boolean h;
    public String i;
    public String j;
    public hd k;
    public String l;
    public String m;
    public long n;
    public long o;
    public boolean p;
    public y q;
    public List r;
    
    static {
        CREATOR = (Parcelable$Creator)new xc();
    }
    
    public wc() {
        this.k = new hd();
    }
    
    public wc(final String f, final String g, final boolean h, final String i, final String j, final hd hd, final String l, final String m, final long n, final long o, final boolean p13, final y q, final ArrayList list) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        hd k;
        if (hd == null) {
            k = new hd();
        }
        else {
            final List f2 = hd.f;
            k = new hd();
            if (f2 != null) {
                k.f.addAll(f2);
            }
        }
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p13;
        this.q = q;
        ArrayList r;
        if ((r = list) == null) {
            r = new ArrayList();
        }
        this.r = r;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int b0 = i10.a.B0(parcel, 20293);
        i10.a.w0(parcel, 2, this.f);
        i10.a.w0(parcel, 3, this.g);
        i10.a.p0(parcel, 4, this.h);
        i10.a.w0(parcel, 5, this.i);
        i10.a.w0(parcel, 6, this.j);
        i10.a.v0(parcel, 7, (Parcelable)this.k, n);
        i10.a.w0(parcel, 8, this.l);
        i10.a.w0(parcel, 9, this.m);
        i10.a.t0(parcel, 10, this.n);
        i10.a.t0(parcel, 11, this.o);
        i10.a.p0(parcel, 12, this.p);
        i10.a.v0(parcel, 13, (Parcelable)this.q, n);
        i10.a.z0(parcel, 14, this.r);
        i10.a.G0(parcel, b0);
    }
}

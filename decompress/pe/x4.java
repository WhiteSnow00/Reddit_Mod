// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import java.util.Collection;
import java.util.List;
import lq0.k;
import android.text.TextUtils;
import lw0.b;
import java.util.ArrayList;

public final class x4
{
    public long A;
    public String B;
    public boolean C;
    public long D;
    public long E;
    public final h4 a;
    public final String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g;
    public long h;
    public long i;
    public String j;
    public long k;
    public String l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;
    public String q;
    public Boolean r;
    public long s;
    public ArrayList t;
    public String u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;
    
    public x4(final h4 a, final String b) {
        lw0.b.R((Object)a);
        lw0.b.O(b);
        this.a = a;
        this.b = b;
        a.b().M();
    }
    
    public final void a(final String s) {
        this.a.b().M();
        String q = s;
        if (TextUtils.isEmpty((CharSequence)s)) {
            q = null;
        }
        this.C |= (true ^ lq0.k.Y0((Object)this.q, (Object)q));
        this.q = q;
    }
    
    public final void b(final String c) {
        this.a.b().M();
        this.C |= (lq0.k.Y0((Object)this.c, (Object)c) ^ true);
        this.c = c;
    }
    
    public final void c(final String l) {
        this.a.b().M();
        this.C |= (lq0.k.Y0((Object)this.l, (Object)l) ^ true);
        this.l = l;
    }
    
    public final void d(final String j) {
        this.a.b().M();
        this.C |= (lq0.k.Y0((Object)this.j, (Object)j) ^ true);
        this.j = j;
    }
    
    public final void e(final long k) {
        this.a.b().M();
        this.C |= (this.k != k);
        this.k = k;
    }
    
    public final void f(final long d) {
        this.a.b().M();
        this.C |= (this.D != d);
        this.D = d;
    }
    
    public final void g(final long n) {
        this.a.b().M();
        this.C |= (this.n != n);
        this.n = n;
    }
    
    public final void h(final long s) {
        this.a.b().M();
        this.C |= (this.s != s);
        this.s = s;
    }
    
    public final void i(final String f) {
        this.a.b().M();
        this.C |= (lq0.k.Y0((Object)this.f, (Object)f) ^ true);
        this.f = f;
    }
    
    public final void j(final String s) {
        this.a.b().M();
        String d = s;
        if (TextUtils.isEmpty((CharSequence)s)) {
            d = null;
        }
        this.C |= (true ^ lq0.k.Y0((Object)this.d, (Object)d));
        this.d = d;
    }
    
    public final void k(final long m) {
        this.a.b().M();
        this.C |= (this.m != m);
        this.m = m;
    }
    
    public final void l(final String b) {
        this.a.b().M();
        this.C |= (lq0.k.Y0((Object)this.B, (Object)b) ^ true);
        this.B = b;
    }
    
    public final void m(final long i) {
        this.a.b().M();
        this.C |= (this.i != i);
        this.i = i;
    }
    
    public final void n(final long g) {
        boolean b = true;
        lw0.b.H(g >= 0L);
        this.a.b().M();
        final boolean c = this.C;
        if (this.g == g) {
            b = false;
        }
        this.C = (c | b);
        this.g = g;
    }
    
    public final void o(final long h) {
        this.a.b().M();
        this.C |= (this.h != h);
        this.h = h;
    }
    
    public final void p(final boolean o) {
        this.a.b().M();
        this.C |= (this.o != o);
        this.o = o;
    }
    
    public final void q(final String e) {
        this.a.b().M();
        this.C |= (lq0.k.Y0((Object)this.e, (Object)e) ^ true);
        this.e = e;
    }
    
    public final void r(final List list) {
        this.a.b().M();
        if (!lq0.k.Y0((Object)this.t, (Object)list)) {
            this.C = true;
            ArrayList t;
            if (list != null) {
                t = new ArrayList(list);
            }
            else {
                t = null;
            }
            this.t = t;
        }
    }
    
    public final long s() {
        this.a.b().M();
        return this.k;
    }
    
    public final String t() {
        this.a.b().M();
        return this.q;
    }
    
    public final String u() {
        this.a.b().M();
        final String b = this.B;
        this.l(null);
        return b;
    }
    
    public final String v() {
        this.a.b().M();
        return this.b;
    }
    
    public final String w() {
        this.a.b().M();
        return this.c;
    }
    
    public final String x() {
        this.a.b().M();
        return this.j;
    }
    
    public final String y() {
        this.a.b().M();
        return this.f;
    }
    
    public final String z() {
        this.a.b().M();
        return this.d;
    }
}

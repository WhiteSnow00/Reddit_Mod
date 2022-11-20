// 
// Decompiled by Procyon v0.6.0
// 

package vk2;

import tl2.c;
import kk2.m;
import pl2.d$b;
import pl2.t;
import yk2.e;
import java.math.BigInteger;
import yk2.d;
import java.util.Hashtable;

public final class a
{
    public static a$s A;
    public static a$t B;
    public static a$u C;
    public static a$w D;
    public static a$x E;
    public static a$y F;
    public static a$z G;
    public static final Hashtable H;
    public static final Hashtable I;
    public static final Hashtable J;
    public static a$k a;
    public static a$v b;
    public static a$a0 c;
    public static a$b0 d;
    public static a$c0 e;
    public static a$d0 f;
    public static a$e0 g;
    public static a$f0 h;
    public static a$g0 i;
    public static a$a j;
    public static a$b k;
    public static a$c l;
    public static a$d m;
    public static a$e n;
    public static a$f o;
    public static a$g p;
    public static a$h q;
    public static a$i r;
    public static a$j s;
    public static a$l t;
    public static a$m u;
    public static a$n v;
    public static a$o w;
    public static a$p x;
    public static a$q y;
    public static a$r z;
    
    static {
        vk2.a.a = new a$k();
        vk2.a.b = new a$v();
        vk2.a.c = new a$a0();
        vk2.a.d = new a$b0();
        vk2.a.e = new a$c0();
        vk2.a.f = new a$d0();
        vk2.a.g = new a$e0();
        vk2.a.h = new a$f0();
        vk2.a.i = new a$g0();
        vk2.a.j = new a$a();
        vk2.a.k = new a$b();
        vk2.a.l = new a$c();
        vk2.a.m = new a$d();
        vk2.a.n = new a$e();
        vk2.a.o = new a$f();
        vk2.a.p = new a$g();
        vk2.a.q = new a$h();
        vk2.a.r = new a$i();
        vk2.a.s = new a$j();
        vk2.a.t = new a$l();
        vk2.a.u = new a$m();
        vk2.a.v = new a$n();
        vk2.a.w = new a$o();
        vk2.a.x = new a$p();
        vk2.a.y = new a$q();
        vk2.a.z = new a$r();
        vk2.a.A = new a$s();
        vk2.a.B = new a$t();
        vk2.a.C = new a$u();
        vk2.a.D = new a$w();
        vk2.a.E = new a$x();
        vk2.a.F = new a$y();
        vk2.a.G = new a$z();
        H = new Hashtable();
        I = new Hashtable();
        J = new Hashtable();
        d("secp112r1", vk2.b.f, (d)vk2.a.a);
        d("secp112r2", vk2.b.g, (d)vk2.a.b);
        d("secp128r1", vk2.b.t, (d)vk2.a.c);
        d("secp128r2", vk2.b.u, (d)vk2.a.d);
        d("secp160k1", vk2.b.i, (d)vk2.a.e);
        d("secp160r1", vk2.b.h, (d)vk2.a.f);
        d("secp160r2", vk2.b.v, (d)vk2.a.g);
        d("secp192k1", vk2.b.w, (d)vk2.a.h);
        d("secp192r1", vk2.b.F, (d)vk2.a.i);
        d("secp224k1", vk2.b.x, (d)vk2.a.j);
        d("secp224r1", vk2.b.y, (d)vk2.a.k);
        d("secp256k1", vk2.b.j, (d)vk2.a.l);
        d("secp256r1", vk2.b.G, (d)vk2.a.m);
        d("secp384r1", vk2.b.z, (d)vk2.a.n);
        d("secp521r1", vk2.b.A, (d)vk2.a.o);
        d("sect113r1", vk2.b.d, (d)vk2.a.p);
        d("sect113r2", vk2.b.e, (d)vk2.a.q);
        d("sect131r1", vk2.b.n, (d)vk2.a.r);
        d("sect131r2", vk2.b.o, (d)vk2.a.s);
        d("sect163k1", vk2.b.a, (d)vk2.a.t);
        d("sect163r1", vk2.b.b, (d)vk2.a.u);
        d("sect163r2", vk2.b.k, (d)vk2.a.v);
        d("sect193r1", vk2.b.p, (d)vk2.a.w);
        d("sect193r2", vk2.b.q, (d)vk2.a.x);
        d("sect233k1", vk2.b.r, (d)vk2.a.y);
        d("sect233r1", vk2.b.s, (d)vk2.a.z);
        d("sect239k1", vk2.b.c, (d)vk2.a.A);
        d("sect283k1", vk2.b.l, (d)vk2.a.B);
        d("sect283r1", vk2.b.m, (d)vk2.a.C);
        d("sect409k1", vk2.b.B, (d)vk2.a.D);
        d("sect409r1", vk2.b.C, (d)vk2.a.E);
        d("sect571k1", vk2.b.D, (d)vk2.a.F);
        d("sect571r1", vk2.b.E, (d)vk2.a.G);
    }
    
    public static BigInteger a(final String s) {
        return new BigInteger(1, om2.a.a(s));
    }
    
    public static e b(final pl2.d d, final String s) {
        final e e = new e(d, om2.a.a(s));
        pl2.t.a(e.i());
        return e;
    }
    
    public static pl2.d c(final pl2.d.e e, final g3.a a) {
        synchronized (e) {
            final pl2.d.c c = (pl2.d)e.new c(((pl2.d)e).f, ((pl2.d)e).g, ((pl2.d)e).h);
            monitorexit(e);
            c.b = (c)new tl2.d((d$b)e, a);
            return c.a();
        }
    }
    
    public static void d(final String s, final m m, final d d) {
        vk2.a.H.put(s, m);
        vk2.a.J.put(m, s);
        vk2.a.I.put(m, d);
    }
}

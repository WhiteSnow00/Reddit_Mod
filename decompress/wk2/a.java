// 
// Decompiled by Procyon v0.6.0
// 

package wk2;

import nm2.h;
import kk2.m;
import pl2.t;
import yk2.e;
import java.math.BigInteger;
import yk2.d;
import java.util.Hashtable;

public final class a
{
    public static a$f a;
    public static a$g b;
    public static a$h c;
    public static a$i d;
    public static a$j e;
    public static a$k f;
    public static a$l g;
    public static a$m h;
    public static a$n i;
    public static a$a j;
    public static a$b k;
    public static a$c l;
    public static a$d m;
    public static a$e n;
    public static final Hashtable o;
    public static final Hashtable p;
    public static final Hashtable q;
    
    static {
        wk2.a.a = new a$f();
        wk2.a.b = new a$g();
        wk2.a.c = new a$h();
        wk2.a.d = new a$i();
        wk2.a.e = new a$j();
        wk2.a.f = new a$k();
        wk2.a.g = new a$l();
        wk2.a.h = new a$m();
        wk2.a.i = new a$n();
        wk2.a.j = new a$a();
        wk2.a.k = new a$b();
        wk2.a.l = new a$c();
        wk2.a.m = new a$d();
        wk2.a.n = new a$e();
        o = new Hashtable();
        p = new Hashtable();
        q = new Hashtable();
        c("brainpoolP160r1", wk2.b.a, (d)wk2.a.a);
        c("brainpoolP160t1", wk2.b.b, (d)wk2.a.b);
        c("brainpoolP192r1", wk2.b.c, (d)wk2.a.c);
        c("brainpoolP192t1", wk2.b.d, (d)wk2.a.d);
        c("brainpoolP224r1", wk2.b.e, (d)wk2.a.e);
        c("brainpoolP224t1", wk2.b.f, (d)wk2.a.f);
        c("brainpoolP256r1", wk2.b.g, (d)wk2.a.g);
        c("brainpoolP256t1", wk2.b.h, (d)wk2.a.h);
        c("brainpoolP320r1", wk2.b.i, (d)wk2.a.i);
        c("brainpoolP320t1", wk2.b.j, (d)wk2.a.j);
        c("brainpoolP384r1", wk2.b.k, (d)wk2.a.k);
        c("brainpoolP384t1", wk2.b.l, (d)wk2.a.l);
        c("brainpoolP512r1", wk2.b.m, (d)wk2.a.m);
        c("brainpoolP512t1", wk2.b.n, (d)wk2.a.n);
    }
    
    public static BigInteger a(final String s) {
        return new BigInteger(1, om2.a.a(s));
    }
    
    public static e b(final pl2.d.e e, final String s) {
        final e e2 = new e((pl2.d)e, om2.a.a(s));
        t.a(e2.i());
        return e2;
    }
    
    public static void c(final String s, final m m, final d d) {
        wk2.a.o.put(nm2.h.c(s), m);
        wk2.a.q.put(m, s);
        wk2.a.p.put(m, d);
    }
}

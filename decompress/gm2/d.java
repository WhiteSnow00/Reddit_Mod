// 
// Decompiled by Procyon v0.6.0
// 

package gm2;

import hm2.f;
import ok2.m;
import java.io.IOException;
import zl2.n;
import hm2.k;
import hm2.j;
import ok2.u0;
import rm2.c;
import z0.d1;
import am2.i;
import ok2.l;
import zl2.h;
import bl2.b;
import jl2.a;

public final class d
{
    public static b a(final a a) throws IOException {
        if (a instanceof dm2.b) {
            final dm2.b b = (dm2.b)a;
            return new b(e.b(b.f), rm2.a.a(b.g));
        }
        if (a instanceof fm2.b) {
            final fm2.b b2 = (fm2.b)a;
            return new b(new bl2.a(zl2.e.d, (l)new h(e.c(((bm2.a)b2).a()))), b2.b());
        }
        if (a instanceof cm2.b) {
            return new b(new bl2.a(zl2.e.e), rm2.a.a(((cm2.b)a).f));
        }
        if (a instanceof i) {
            final i i = (i)a;
            final d1 c = d1.C();
            c.K(1);
            c.A((c)i);
            return new b(new bl2.a(xk2.a.a), (l)new u0(c.z()));
        }
        if (a instanceof am2.c) {
            final am2.c c2 = (am2.c)a;
            final d1 c3 = d1.C();
            c3.K(c2.f);
            c3.A((c)c2);
            return new b(new bl2.a(xk2.a.a), (l)new u0(c3.z()));
        }
        if (a instanceof j) {
            final j j = (j)a;
            final byte[] b3 = k.b(j.k);
            final byte[] b4 = k.b(j.j);
            final byte[] encoded = j.getEncoded();
            if (encoded.length > b3.length + b4.length) {
                return new b(new bl2.a(uk2.a.a), (l)new u0(encoded));
            }
            return new b(new bl2.a(zl2.e.f, (l)new zl2.i(j.h.b, e.e(((bm2.a)j).a()))), (l)new n(b3, b4));
        }
        else {
            if (!(a instanceof hm2.h)) {
                throw new IOException("key parameters not recognized");
            }
            final hm2.h h = (hm2.h)a;
            final byte[] b5 = k.b(h.j);
            final byte[] b6 = k.b(h.i);
            final byte[] a2 = h.a();
            if (a2.length > b5.length + b6.length) {
                return new b(new bl2.a(uk2.a.b), (l)new u0(a2));
            }
            final m g = zl2.e.g;
            final f g2 = h.g;
            return new b(new bl2.a(g, (l)new zl2.j(g2.c, g2.d, e.e((String)((bm2.d)h).f))), (l)new zl2.l(k.b(h.j), k.b(h.i)));
        }
    }
}

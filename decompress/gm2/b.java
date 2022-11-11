// 
// Decompiled by Procyon v0.6.0
// 

package gm2;

import bm2.d;
import hm2.f;
import org.bouncycastle.pqc.crypto.xmss.BDSStateMap;
import zl2.j;
import java.io.IOException;
import zl2.m;
import org.bouncycastle.pqc.crypto.xmss.BDS;
import hm2.k;
import zl2.i;
import org.bouncycastle.pqc.crypto.xmss.g;
import rm2.c;
import z0.d1;
import zl2.h;
import ok2.l;
import ok2.u0;
import ok2.u;
import jl2.a;

public final class b
{
    public static xk2.b a(a z, final u u) throws IOException {
        if (z instanceof dm2.a) {
            final dm2.a a = (dm2.a)z;
            return new xk2.b(e.b(a.f), (l)new u0(rm2.a.a(a.g)), u, (byte[])null);
        }
        if (z instanceof fm2.a) {
            final fm2.a a2 = (fm2.a)z;
            return new xk2.b(new bl2.a(zl2.e.d, (l)new h(e.c(((bm2.a)a2).a()))), (l)new u0(a2.b()), (u)null, (byte[])null);
        }
        final boolean b = z instanceof cm2.a;
        int i = 0;
        if (b) {
            final cm2.a a3 = (cm2.a)z;
            final bl2.a a4 = new bl2.a(zl2.e.e);
            final short[] f = a3.f;
            short[] array;
            if (f == null) {
                array = null;
            }
            else {
                array = f.clone();
            }
            final byte[] array2 = new byte[array.length * 2];
            while (i != array.length) {
                final short n = array[i];
                final int n2 = i * 2;
                array2[n2] = (byte)n;
                array2[n2 + 1] = (byte)(n >>> 8);
                ++i;
            }
            return new xk2.b(a4, (l)new u0(array2), (u)null, (byte[])null);
        }
        if (z instanceof am2.h) {
            final am2.h h = (am2.h)z;
            final d1 c = d1.C();
            c.K(1);
            c.A((c)h);
            final byte[] z2 = c.z();
            final d1 c2 = d1.C();
            c2.K(1);
            c2.A((c)h.f());
            return new xk2.b(new bl2.a(xk2.a.a), (l)new u0(z2), u, c2.z());
        }
        if (z instanceof am2.b) {
            z = z;
            final d1 c3 = d1.C();
            c3.K(((am2.b)z).f);
            c3.A((c)z);
            final byte[] z3 = c3.z();
            final d1 c4 = d1.C();
            c4.K(((am2.b)z).f);
            synchronized (z) {
                final am2.c c5 = new am2.c(((am2.b)z).f, ((am2.b)z).h.get(0).f());
                monitorexit(z);
                c4.A((c)c5);
                z = (a)(Object)c4.z();
                return new xk2.b(new bl2.a(xk2.a.a), (l)new u0(z3), u, (byte[])(Object)z);
            }
        }
        if (z instanceof g) {
            final g g = (g)z;
            final bl2.a a5 = new bl2.a(zl2.e.f, (l)new i(g.h.b, e.e(((bm2.a)g).a())));
            final byte[] encoded = g.getEncoded();
            final hm2.i h2 = g.h;
            final int g2 = h2.g;
            final int b2 = h2.b;
            final int n3 = (int)k.a(4, encoded);
            if (k.h(b2, (long)n3)) {
                final byte[] f2 = k.f(4, g2, encoded);
                final int n4 = g2 + 4;
                final byte[] f3 = k.f(n4, g2, encoded);
                final int n5 = n4 + g2;
                final byte[] f4 = k.f(n5, g2, encoded);
                final int n6 = n5 + g2;
                final byte[] f5 = k.f(n6, g2, encoded);
                final int n7 = n6 + g2;
                final byte[] f6 = k.f(n7, encoded.length - n7, encoded);
                try {
                    final BDS bds = (BDS)k.e(f6, (Class)BDS.class);
                    m m;
                    if (bds.getMaxIndex() != (1 << b2) - 1) {
                        m = new m(n3, f2, f3, f4, f5, f6, bds.getMaxIndex());
                    }
                    else {
                        m = new m(n3, f2, f3, f4, f5, f6);
                    }
                    return new xk2.b(a5, (l)m, u, (byte[])null);
                }
                catch (final ClassNotFoundException ex) {
                    final StringBuilder r = a.r("cannot parse BDS: ");
                    r.append(ex.getMessage());
                    throw new IOException(r.toString());
                }
            }
            throw new IllegalArgumentException("index out of bounds");
        }
        if (z instanceof hm2.g) {
            final hm2.g g3 = (hm2.g)z;
            final ok2.m g4 = zl2.e.g;
            final f g5 = g3.g;
            final bl2.a a6 = new bl2.a(g4, (l)new j(g5.c, g5.d, e.e((String)((d)g3).f)));
            final byte[] encoded2 = g3.getEncoded();
            final f g6 = g3.g;
            final int g7 = g6.b.g;
            final int c6 = g6.c;
            int n8 = (c6 + 7) / 8;
            final long n9 = (int)k.a(n8, encoded2);
            if (k.h(c6, n9)) {
                n8 += 0;
                final byte[] f7 = k.f(n8, g7, encoded2);
                final int n10 = n8 + g7;
                final byte[] f8 = k.f(n10, g7, encoded2);
                final int n11 = n10 + g7;
                final byte[] f9 = k.f(n11, g7, encoded2);
                final int n12 = n11 + g7;
                final byte[] f10 = k.f(n12, g7, encoded2);
                final int n13 = n12 + g7;
                final byte[] f11 = k.f(n13, encoded2.length - n13, encoded2);
                try {
                    final BDSStateMap bdsStateMap = (BDSStateMap)k.e(f11, (Class)BDSStateMap.class);
                    zl2.k k;
                    if (bdsStateMap.getMaxIndex() != (1L << c6) - 1L) {
                        k = new zl2.k(n9, f7, f8, f9, f10, f11, bdsStateMap.getMaxIndex());
                    }
                    else {
                        k = new zl2.k(n9, f7, f8, f9, f10, f11);
                    }
                    return new xk2.b(a6, (l)k, u, (byte[])null);
                }
                catch (final ClassNotFoundException ex2) {
                    final StringBuilder r2 = a.r("cannot parse BDSStateMap: ");
                    r2.append(ex2.getMessage());
                    throw new IOException(r2.toString());
                }
            }
            throw new IllegalArgumentException("index out of bounds");
        }
        throw new IOException("key parameters not recognized");
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package gm2;

import ok2.l0;
import android.support.v4.media.c;
import org.bouncycastle.pqc.crypto.xmss.BDSStateMap;
import hm2.f;
import zl2.j;
import java.io.IOException;
import org.bouncycastle.pqc.crypto.xmss.g;
import org.bouncycastle.pqc.crypto.xmss.BDS;
import hm2.k;
import org.bouncycastle.pqc.crypto.xmss.g$a;
import ok2.r;
import zl2.m;
import zl2.i;
import zl2.h;
import ok2.q;
import ok2.n;
import xk2.b;

public final class a
{
    public static jl2.a a(final b b) throws IOException {
        final ok2.m f = b.g.f;
        final ok2.m d = qk2.a.d;
        final String f2 = f.f;
        final String f3 = d.f;
        final int length = f2.length();
        final int length2 = f3.length();
        final int n = 0;
        if (length > length2 && f2.charAt(f3.length()) == '.' && f2.startsWith(f3)) {
            return (jl2.a)new dm2.a((int)e.i.get(b.g.f), ok2.n.z((Object)b.l()).f);
        }
        if (((q)f).n((q)qk2.a.a)) {
            return (jl2.a)new fm2.a(e.d(h.k(b.g.g)), ok2.n.z((Object)b.l()).f);
        }
        if (((q)f).n((q)qk2.a.g)) {
            final byte[] f4 = ok2.n.z((Object)b.l()).f;
            final int n2 = f4.length / 2;
            final short[] array = new short[n2];
            for (int i = n; i != n2; ++i) {
                final int n3 = i * 2;
                array[i] = (short)((f4[n3 + 1] & 0xFF) << 8 | (f4[n3] & 0xFF));
            }
            return (jl2.a)new cm2.a(array);
        }
        if (!((q)f).n((q)xk2.a.a)) {
            final boolean n4 = ((q)f).n((q)qk2.a.b);
            final zl2.k k = null;
            final m m = null;
            if (n4) {
                final i j = i.k(b.g.g);
                final ok2.m f5 = j.h.f;
                final q l = b.l();
                m m2;
                if (l instanceof m) {
                    m2 = (m)l;
                }
                else {
                    m2 = m;
                    if (l != null) {
                        m2 = new m(r.z((Object)l));
                    }
                }
                try {
                    final g$a g$a = new g$a(new hm2.i(j.g, e.a(f5)));
                    g$a.b = m2.g;
                    g$a.d = hm2.k.b(rm2.a.a(m2.h));
                    g$a.e = hm2.k.b(rm2.a.a(m2.i));
                    g$a.f = hm2.k.b(rm2.a.a(m2.j));
                    g$a.g = hm2.k.b(rm2.a.a(m2.k));
                    if (m2.f != 0) {
                        g$a.c = m2.l;
                    }
                    if (rm2.a.a(m2.m) != null) {
                        g$a.h = ((BDS)hm2.k.e(rm2.a.a(m2.m), (Class)BDS.class)).withWOTSDigest(f5);
                    }
                    return (jl2.a)new g(g$a);
                }
                catch (final ClassNotFoundException ex) {
                    final StringBuilder r = a.r("ClassNotFoundException processing BDS state: ");
                    r.append(ex.getMessage());
                    throw new IOException(r.toString());
                }
            }
            if (((q)f).n((q)zl2.e.g)) {
                final j k2 = j.k(b.g.g);
                final ok2.m f6 = k2.i.f;
                try {
                    final q l2 = b.l();
                    zl2.k k3;
                    if (l2 instanceof zl2.k) {
                        k3 = (zl2.k)l2;
                    }
                    else {
                        k3 = k;
                        if (l2 != null) {
                            k3 = new zl2.k(r.z((Object)l2));
                        }
                    }
                    final hm2.g.a a = new hm2.g.a(new f(k2.g, k2.h, e.a(f6)));
                    a.b = k3.g;
                    a.d = hm2.k.b(rm2.a.a(k3.i));
                    a.e = hm2.k.b(rm2.a.a(k3.j));
                    a.f = hm2.k.b(rm2.a.a(k3.k));
                    a.g = hm2.k.b(rm2.a.a(k3.l));
                    if (k3.f != 0) {
                        a.c = k3.h;
                    }
                    if (rm2.a.a(k3.m) != null) {
                        a.a(((BDSStateMap)hm2.k.e(rm2.a.a(k3.m), (Class)BDSStateMap.class)).withWOTSDigest(f6));
                    }
                    return (jl2.a)new hm2.g(a);
                }
                catch (final ClassNotFoundException ex2) {
                    final StringBuilder r2 = a.r("ClassNotFoundException processing BDS state: ");
                    r2.append(ex2.getMessage());
                    throw new IOException(r2.toString());
                }
            }
            throw new RuntimeException("algorithm identifier in private key not recognised");
        }
        final byte[] f7 = ok2.n.z((Object)b.l()).f;
        final l0 j2 = b.j;
        if (c.S(0, f7) != 1) {
            return (jl2.a)am2.b.a((Object)rm2.a.c(f7.length, f7));
        }
        if (j2 != null) {
            final byte[] z = ((ok2.b)j2).z();
            final byte[] c = rm2.a.c(f7.length, f7);
            final byte[] c2 = rm2.a.c(z.length, z);
            final am2.h e = am2.h.e((Object)c);
            e.l = am2.i.a((Object)c2);
            return (jl2.a)e;
        }
        return (jl2.a)am2.h.e((Object)rm2.a.c(f7.length, f7));
    }
}

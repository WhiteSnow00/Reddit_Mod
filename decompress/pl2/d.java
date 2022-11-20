// 
// Decompiled by Procyon v0.6.0
// 

package pl2;

import java.util.Hashtable;
import android.support.v4.media.b;
import tl2.c;
import java.math.BigInteger;
import ul2.a;

public abstract class d
{
    public a a;
    public f b;
    public f c;
    public BigInteger d;
    public BigInteger e;
    public int f;
    public tl2.c g;
    public b h;
    
    public d(final a a) {
        this.f = 0;
        this.g = null;
        this.h = null;
        this.a = a;
    }
    
    public abstract d a();
    
    public b b(final g[] array, final int n) {
        final int n2 = this.k() + 7 >>> 3;
        final byte[] array2 = new byte[n * n2 * 2];
        int i = 0;
        int n3 = 0;
        while (i < n) {
            final g g = array[0 + i];
            final byte[] byteArray = g.b.t().toByteArray();
            final byte[] byteArray2 = g.c.t().toByteArray();
            final int length = byteArray.length;
            int n4 = 1;
            int n5;
            if (length > n2) {
                n5 = 1;
            }
            else {
                n5 = 0;
            }
            final int n6 = byteArray.length - n5;
            if (byteArray2.length <= n2) {
                n4 = 0;
            }
            final int n7 = byteArray2.length - n4;
            final int n8 = n3 + n2;
            System.arraycopy(byteArray, n5, array2, n8 - n6, n6);
            n3 = n8 + n2;
            System.arraycopy(byteArray2, n4, array2, n3 - n7, n7);
            ++i;
        }
        return new pl2.c(this, n, n2, array2);
    }
    
    public b c() {
        final tl2.c g = this.g;
        if (g instanceof tl2.c) {
            return new k(this, g);
        }
        return new r();
    }
    
    public g d(final BigInteger bigInteger, final BigInteger bigInteger2) {
        return this.e(this.j(bigInteger), this.j(bigInteger2));
    }
    
    public abstract g e(final f p0, final f p1);
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof d && this.i((d)o));
    }
    
    public abstract g f(final f p0, final f p1, final f[] p2);
    
    public final g g(final byte[] array) {
        final int n = (this.k() + 7) / 8;
        final byte b = array[0];
        g g;
        if (b != 0) {
            if (b != 2 && b != 3) {
                if (b != 4) {
                    if (b != 6 && b != 7) {
                        final StringBuilder t = a.t("Invalid point encoding 0x");
                        t.append(Integer.toString(b, 16));
                        throw new IllegalArgumentException(t.toString());
                    }
                    if (array.length != n * 2 + 1) {
                        throw new IllegalArgumentException("Incorrect length for hybrid encoding");
                    }
                    final BigInteger a = nm2.b.a(1, n, array);
                    final BigInteger a2 = nm2.b.a(n + 1, n, array);
                    if (a2.testBit(0) != (b == 7)) {
                        throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                    }
                    g = this.d(a, a2);
                    if (!g.i(false, true)) {
                        throw new IllegalArgumentException("Invalid point coordinates");
                    }
                }
                else {
                    if (array.length != n * 2 + 1) {
                        throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
                    }
                    g = this.d(nm2.b.a(1, n, array), nm2.b.a(n + 1, n, array));
                    if (!g.i(false, true)) {
                        throw new IllegalArgumentException("Invalid point coordinates");
                    }
                }
            }
            else {
                if (array.length != n + 1) {
                    throw new IllegalArgumentException("Incorrect length for compressed encoding");
                }
                g = this.h(b & 0x1, nm2.b.a(1, n, array));
                if (!g.i(true, true)) {
                    throw new IllegalArgumentException("Invalid point");
                }
            }
        }
        else {
            if (array.length != 1) {
                throw new IllegalArgumentException("Incorrect length for infinity encoding");
            }
            g = this.l();
        }
        if (b != 0 && g.j()) {
            throw new IllegalArgumentException("Invalid infinity encoding");
        }
        return g;
    }
    
    public abstract g h(final int p0, final BigInteger p1);
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ Integer.rotateLeft(this.b.t().hashCode(), 8) ^ Integer.rotateLeft(this.c.t().hashCode(), 16);
    }
    
    public final boolean i(final d d) {
        return this == d || (d != null && this.a.equals(d.a) && this.b.t().equals(d.b.t()) && this.c.t().equals(d.c.t()));
    }
    
    public abstract f j(final BigInteger p0);
    
    public abstract int k();
    
    public abstract g l();
    
    public g m(g m) {
        if (this == m.a) {
            return m;
        }
        if (m.j()) {
            return this.l();
        }
        m = m.m();
        return this.d(m.b.t(), m.g().t());
    }
    
    public final void n(final g[] array, int i, int n, f f) {
        if (i < 0 || n < 0 || i > array.length - n) {
            throw new IllegalArgumentException("invalid range specified for 'points'");
        }
        final int n2 = 0;
        for (int j = 0; j < n; ++j) {
            final g g = array[i + j];
            if (g != null && this != g.a) {
                throw new IllegalArgumentException("'points' entries must be null or on this curve");
            }
        }
        final int f2 = this.f;
        if (f2 != 0 && f2 != 5) {
            final f[] array2 = new f[n];
            final int[] array3 = new int[n];
            int n3 = 0;
            int n4 = 0;
            while (true) {
                final boolean b = true;
                if (n3 >= n) {
                    break;
                }
                final int n5 = i + n3;
                final g g2 = array[n5];
                int n6 = n4;
                Label_0231: {
                    if (g2 != null) {
                        if (f == null) {
                            final int e = g2.e();
                            int n7 = b ? 1 : 0;
                            if (e != 0) {
                                n7 = (b ? 1 : 0);
                                if (e != 5) {
                                    n7 = (b ? 1 : 0);
                                    if (!g2.j()) {
                                        if (g2.d[0].h()) {
                                            n7 = (b ? 1 : 0);
                                        }
                                        else {
                                            n7 = 0;
                                        }
                                    }
                                }
                            }
                            n6 = n4;
                            if (n7 != 0) {
                                break Label_0231;
                            }
                        }
                        array2[n4] = g2.h();
                        array3[n4] = n5;
                        n6 = n4 + 1;
                    }
                }
                ++n3;
                n4 = n6;
            }
            if (n4 == 0) {
                return;
            }
            final f[] array4 = new f[n4];
            array4[0] = array2[0];
            i = 0;
            while (++i < n4) {
                array4[i] = array4[i - 1].j(array2[0 + i]);
            }
            --i;
            if (f != null) {
                array4[i] = array4[i].j(f);
            }
            f f3;
            for (f = array4[i].g(); i > 0; i += 0, f3 = array2[i], array2[i] = array4[n].j(f), f = f.j(f3), i = n) {
                n = i - 1;
            }
            array2[0] = f;
            for (i = n2; i < n4; ++i) {
                n = array3[i];
                array[n] = array[n].n(array2[i]);
            }
        }
        else {
            if (f == null) {
                return;
            }
            throw new IllegalArgumentException("'iso' not valid for affine coordinates");
        }
    }
    
    public final n o(final g g, final String s, final m m) {
        if (g != null && this == g.a) {
            synchronized (g) {
                Hashtable e;
                if ((e = g.e) == null) {
                    e = new Hashtable(4);
                    g.e = e;
                }
                monitorexit(g);
                synchronized (e) {
                    final n n = e.get(s);
                    final n a = m.a(n);
                    if (a != n) {
                        e.put(s, a);
                    }
                    return a;
                }
            }
        }
        throw new IllegalArgumentException("'point' must be non-null and on this curve");
    }
    
    public boolean p(final int n) {
        return n == 0;
    }
    
    public final class c
    {
        public int a;
        public tl2.c b;
        public b c;
        public final d d;
        
        public c(final d d, final int a, final tl2.c b, final b c) {
            this.d = d;
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public final d a() {
            if (this.d.p(this.a)) {
                final d a = this.d.a();
                if (a != this.d) {
                    synchronized (a) {
                        a.f = this.a;
                        a.g = this.b;
                        a.h = this.c;
                        return a;
                    }
                }
                throw new IllegalStateException("implementation returned current curve");
            }
            throw new IllegalStateException("unsupported coordinate system");
        }
    }
    
    public static final class d extends d$a
    {
        public int j;
        public int k;
        public int l;
        public int m;
        public g.d n;
        
        public d(final int j, final int k, final int l, final int m, final BigInteger bigInteger, final BigInteger bigInteger2, final BigInteger d, final BigInteger e) {
            super(j, k, l, m);
            this.j = j;
            this.k = k;
            this.l = l;
            this.m = m;
            ((pl2.d)this).d = d;
            ((pl2.d)this).e = e;
            this.n = new g.d((pl2.d)this, null, null);
            ((pl2.d)this).b = this.j(bigInteger);
            ((pl2.d)this).c = this.j(bigInteger2);
            ((pl2.d)this).f = 6;
        }
        
        public d(final int j, final int k, final int l, final int m, final f b, final f c, final BigInteger d, final BigInteger e) {
            super(j, k, l, m);
            this.j = j;
            this.k = k;
            this.l = l;
            this.m = m;
            ((pl2.d)this).d = d;
            ((pl2.d)this).e = e;
            this.n = new g.d((pl2.d)this, null, null);
            ((pl2.d)this).b = b;
            ((pl2.d)this).c = c;
            ((pl2.d)this).f = 6;
        }
        
        public d(final int n, final int n2, final BigInteger bigInteger, final BigInteger bigInteger2, final BigInteger bigInteger3, final BigInteger bigInteger4) {
            this(n, n2, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
        }
        
        public final pl2.d a() {
            return (pl2.d)new d(this.j, this.k, this.l, this.m, ((pl2.d)this).b, ((pl2.d)this).c, ((pl2.d)this).d, ((pl2.d)this).e);
        }
        
        public final b b(final g[] array, final int n) {
            final int n2 = this.j + 63 >>> 6;
            final int l = this.l;
            int[] array2;
            if (l == 0 && this.m == 0) {
                array2 = new int[] { this.k };
            }
            else {
                array2 = new int[] { this.k, l, this.m };
            }
            final long[] array3 = new long[n * n2 * 2];
            int i = 0;
            int n3 = 0;
            while (i < n) {
                final g g = array[0 + i];
                final long[] f = ((f$c)g.b).i.f;
                System.arraycopy(f, 0, array3, n3, f.length);
                final int n4 = n3 + n2;
                final long[] f2 = ((f$c)g.c).i.f;
                System.arraycopy(f2, 0, array3, n4, f2.length);
                n3 = n4 + n2;
                ++i;
            }
            return new pl2.e(this, n, n2, array3, array2);
        }
        
        public final b c() {
            if (this.q()) {
                return new x();
            }
            return super.c();
        }
        
        public final g e(final f f, final f f2) {
            return (g)new g.d((pl2.d)this, f, f2);
        }
        
        public final g f(final f f, final f f2, final f[] array) {
            return (g)new g.d((pl2.d)this, f, f2, array);
        }
        
        public final f j(final BigInteger bigInteger) {
            return (f)new f$c(this.j, this.k, this.l, this.m, bigInteger);
        }
        
        public final int k() {
            return this.j;
        }
        
        public final g l() {
            return (g)this.n;
        }
        
        public final boolean p(final int n) {
            return n == 0 || n == 1 || n == 6;
        }
    }
    
    public static final class e extends d$b
    {
        public BigInteger i;
        public BigInteger j;
        public g.e k;
        
        public e(BigInteger subtract, final BigInteger bigInteger, final BigInteger bigInteger2, final BigInteger d, final BigInteger e) {
            super(subtract);
            this.i = subtract;
            final int bitLength = subtract.bitLength();
            if (bitLength >= 96 && subtract.shiftRight(bitLength - 64).longValue() == -1L) {
                subtract = pl2.b.b.shiftLeft(bitLength).subtract(subtract);
            }
            else {
                subtract = null;
            }
            this.j = subtract;
            this.k = new g.e((d)this, null, null);
            ((d)this).b = this.j(bigInteger);
            ((d)this).c = this.j(bigInteger2);
            ((d)this).d = d;
            ((d)this).e = e;
            ((d)this).f = 4;
        }
        
        public e(final BigInteger i, final BigInteger j, final f b, final f c, final BigInteger d, final BigInteger e) {
            super(i);
            this.i = i;
            this.j = j;
            this.k = new g.e((d)this, null, null);
            ((d)this).b = b;
            ((d)this).c = c;
            ((d)this).d = d;
            ((d)this).e = e;
            ((d)this).f = 4;
        }
        
        public final d a() {
            return (d)new e(this.i, this.j, ((d)this).b, ((d)this).c, ((d)this).d, ((d)this).e);
        }
        
        public final g e(final f f, final f f2) {
            return (g)new g.e((d)this, f, f2);
        }
        
        public final g f(final f f, final f f2, final f[] array) {
            return (g)new g.e((d)this, f, f2, array);
        }
        
        public final f j(final BigInteger bigInteger) {
            return (f)new f$d(this.i, this.j, bigInteger);
        }
        
        public final int k() {
            return this.i.bitLength();
        }
        
        public final g l() {
            return (g)this.k;
        }
        
        public final g m(final g g) {
            if (this != g.a && ((d)this).f == 2 && !g.j()) {
                final int f = g.a.f;
                if (f == 2 || f == 3 || f == 4) {
                    return (g)new g.e((d)this, this.j(g.b.t()), this.j(g.c.t()), new f[] { this.j(g.d[0].t()) });
                }
            }
            return super.m(g);
        }
        
        public final boolean p(final int n) {
            return n == 0 || n == 1 || n == 2 || n == 4;
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package lb;

import db.e;
import bd.c0;
import db.o;
import db.u;
import db.p$a;
import db.n;
import qb.a;
import java.util.Arrays;
import db.m;
import bd.t;
import db.p;

public final class b extends h
{
    public p n;
    public a o;
    
    public final long b(final t t) {
        final byte[] a = t.a;
        if (a[0] != -1) {
            return -1L;
        }
        final int n = (a[2] & 0xFF) >> 4;
        if (n == 6 || n == 7) {
            t.C(4);
            t.x();
        }
        final int b = m.b(n, t);
        t.B(0);
        return b;
    }
    
    public final boolean c(final t t, final long c, final h$a h$a) {
        final byte[] a = t.a;
        final p n = this.n;
        if (n == null) {
            final p n2 = new p(a, 17);
            this.n = n2;
            h$a.a = n2.c(Arrays.copyOfRange(a, 9, t.c), (qb.a)null);
            return true;
        }
        final byte b = a[0];
        if ((b & 0x7F) == 0x3) {
            final p$a a2 = db.n.a(t);
            final p n3 = new p(n.a, n.b, n.c, n.d, n.e, n.g, n.h, n.j, a2, n.l);
            this.n = n3;
            this.o = new a(n3, a2);
            return true;
        }
        if (b == -1) {
            final a o = this.o;
            if (o != null) {
                o.c = c;
                h$a.b = o;
            }
            h$a.a.getClass();
            return false;
        }
        return true;
    }
    
    public final void d(final boolean b) {
        super.d(b);
        if (b) {
            this.n = null;
            this.o = null;
        }
    }
    
    public static final class a implements f
    {
        public p a;
        public p$a b;
        public long c;
        public long d;
        
        public a(final p a, final p$a b) {
            this.a = a;
            this.b = b;
            this.c = -1L;
            this.d = -1L;
        }
        
        public final u a() {
            ah0.b.H(this.c != -1L);
            return (u)new o(this.a, this.c);
        }
        
        public final void b(final long n) {
            final long[] a = this.b.a;
            this.d = a[c0.f(a, n, true)];
        }
        
        public final long c(final e e) {
            final long d = this.d;
            if (d >= 0L) {
                final long n = -(d + 2L);
                this.d = -1L;
                return n;
            }
            return -1L;
        }
    }
}

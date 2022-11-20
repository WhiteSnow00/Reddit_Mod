// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import xd.a;
import ng2.e;

public final class q0<V extends i> implements m0<V>
{
    public final v a;
    public V b;
    public V c;
    public V d;
    public final float e;
    
    public q0(final v a) {
        ng2.e.f((Object)a, "floatDecaySpec");
        this.a = a;
        this.e = a.a();
    }
    
    public final float a() {
        return this.e;
    }
    
    public final V b(final long n, final V v, final V v2) {
        ng2.e.f((Object)v, "initialValue");
        ng2.e.f((Object)v2, "initialVelocity");
        if (this.c == null) {
            this.c = (V)xd.a.w0((i)v);
        }
        int i = 0;
        final i c = this.c;
        if (c == null) {
            ng2.e.n("velocityVector");
            throw null;
        }
        while (i < c.b()) {
            final i c2 = this.c;
            if (c2 == null) {
                ng2.e.n("velocityVector");
                throw null;
            }
            final v a = this.a;
            v.a(i);
            c2.e(a.d(v2.a(i), n), i);
            ++i;
        }
        final i c3 = this.c;
        if (c3 != null) {
            return (V)c3;
        }
        ng2.e.n("velocityVector");
        throw null;
    }
    
    public final V c(final long n, final V v, final V v2) {
        ng2.e.f((Object)v, "initialValue");
        ng2.e.f((Object)v2, "initialVelocity");
        if (this.b == null) {
            this.b = (V)xd.a.w0((i)v);
        }
        int i = 0;
        final i b = this.b;
        if (b == null) {
            ng2.e.n("valueVector");
            throw null;
        }
        while (i < b.b()) {
            final i b2 = this.b;
            if (b2 == null) {
                ng2.e.n("valueVector");
                throw null;
            }
            b2.e(this.a.e(v.a(i), v2.a(i), n), i);
            ++i;
        }
        final i b3 = this.b;
        if (b3 != null) {
            return (V)b3;
        }
        ng2.e.n("valueVector");
        throw null;
    }
    
    public final long d(final V v, final V v2) {
        ng2.e.f((Object)v, "initialValue");
        ng2.e.f((Object)v2, "initialVelocity");
        if (this.c == null) {
            this.c = (V)xd.a.w0((i)v);
        }
        int i = 0;
        final i c = this.c;
        if (c != null) {
            final int b = c.b();
            long max = 0L;
            while (i < b) {
                final v a = this.a;
                v.a(i);
                max = Math.max(max, a.b(v2.a(i)));
                ++i;
            }
            return max;
        }
        ng2.e.n("velocityVector");
        throw null;
    }
    
    public final V e(final V v, final V v2) {
        ng2.e.f((Object)v, "initialValue");
        ng2.e.f((Object)v2, "initialVelocity");
        if (this.d == null) {
            this.d = (V)xd.a.w0((i)v);
        }
        int i = 0;
        final i d = this.d;
        if (d == null) {
            ng2.e.n("targetVector");
            throw null;
        }
        while (i < d.b()) {
            final i d2 = this.d;
            if (d2 == null) {
                ng2.e.n("targetVector");
                throw null;
            }
            d2.e(this.a.c(v.a(i), v2.a(i)), i);
            ++i;
        }
        final i d3 = this.d;
        if (d3 != null) {
            return (V)d3;
        }
        ng2.e.n("targetVector");
        throw null;
    }
}

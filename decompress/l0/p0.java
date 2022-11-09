// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import ah2.f;

public final class p0<V extends i> implements l0<V>
{
    public final u a;
    public V b;
    public V c;
    public V d;
    public final float e;
    
    public p0(final u a) {
        f.f((Object)a, "floatDecaySpec");
        this.a = a;
        this.e = a.a();
    }
    
    @Override
    public final float a() {
        return this.e;
    }
    
    @Override
    public final V b(final long n, final V v, final V v2) {
        f.f((Object)v, "initialValue");
        f.f((Object)v2, "initialVelocity");
        if (this.c == null) {
            this.c = (V)v.c();
        }
        int i = 0;
        final i c = this.c;
        if (c == null) {
            f.n("velocityVector");
            throw null;
        }
        while (i < c.b()) {
            final i c2 = this.c;
            if (c2 == null) {
                f.n("velocityVector");
                throw null;
            }
            final u a = this.a;
            v.a(i);
            c2.e(a.d(v2.a(i), n), i);
            ++i;
        }
        final i c3 = this.c;
        if (c3 != null) {
            return (V)c3;
        }
        f.n("velocityVector");
        throw null;
    }
    
    @Override
    public final V c(final long n, final V v, final V v2) {
        f.f((Object)v, "initialValue");
        f.f((Object)v2, "initialVelocity");
        if (this.b == null) {
            this.b = (V)v.c();
        }
        int i = 0;
        final i b = this.b;
        if (b == null) {
            f.n("valueVector");
            throw null;
        }
        while (i < b.b()) {
            final i b2 = this.b;
            if (b2 == null) {
                f.n("valueVector");
                throw null;
            }
            b2.e(this.a.e(v.a(i), v2.a(i), n), i);
            ++i;
        }
        final i b3 = this.b;
        if (b3 != null) {
            return (V)b3;
        }
        f.n("valueVector");
        throw null;
    }
    
    public final long d(final V v, final V v2) {
        f.f((Object)v, "initialValue");
        f.f((Object)v2, "initialVelocity");
        if (this.c == null) {
            this.c = (V)v.c();
        }
        int i = 0;
        final i c = this.c;
        if (c != null) {
            final int b = c.b();
            long max = 0L;
            while (i < b) {
                final u a = this.a;
                v.a(i);
                max = Math.max(max, a.b(v2.a(i)));
                ++i;
            }
            return max;
        }
        f.n("velocityVector");
        throw null;
    }
    
    public final V e(final V v, final V v2) {
        f.f((Object)v, "initialValue");
        f.f((Object)v2, "initialVelocity");
        if (this.d == null) {
            this.d = (V)v.c();
        }
        int i = 0;
        final i d = this.d;
        if (d == null) {
            f.n("targetVector");
            throw null;
        }
        while (i < d.b()) {
            final i d2 = this.d;
            if (d2 == null) {
                f.n("targetVector");
                throw null;
            }
            d2.e(this.a.c(v.a(i), v2.a(i)), i);
            ++i;
        }
        final i d3 = this.d;
        if (d3 != null) {
            return (V)d3;
        }
        f.n("targetVector");
        throw null;
    }
}

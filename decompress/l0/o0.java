// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import java.util.Iterator;
import qg2.v;
import yl.a;
import ah2.f;

public final class o0<V extends i> implements n0<V>
{
    public final j f;
    public V g;
    public V h;
    public V i;
    
    public o0(final j f) {
        this.f = f;
    }
    
    public o0(final t t) {
        ah2.f.f((Object)t, "anim");
        this(new j() {
            @Override
            public final t get(final int n) {
                return t;
            }
        });
    }
    
    @Override
    public final long b(final V v, final V v2, final V v3) {
        ah2.f.f((Object)v, "initialValue");
        ah2.f.f((Object)v2, "targetValue");
        ah2.f.f((Object)v3, "initialVelocity");
        final Iterator<Object> iterator = ((Iterable<Object>)a.C1(0, v.b())).iterator();
        long max = 0L;
        while (iterator.hasNext()) {
            final int nextInt = ((v)iterator).nextInt();
            max = Math.max(max, this.f.get(nextInt).b(v.a(nextInt), v2.a(nextInt), v3.a(nextInt)));
        }
        return max;
    }
    
    @Override
    public final V c(final long n, final V v, final V v2, final V v3) {
        ah2.f.f((Object)v, "initialValue");
        ah2.f.f((Object)v2, "targetValue");
        ah2.f.f((Object)v3, "initialVelocity");
        if (this.g == null) {
            this.g = (V)v.c();
        }
        int i = 0;
        final i g = this.g;
        if (g == null) {
            ah2.f.n("valueVector");
            throw null;
        }
        while (i < g.b()) {
            final i g2 = this.g;
            if (g2 == null) {
                ah2.f.n("valueVector");
                throw null;
            }
            g2.e(this.f.get(i).c(v.a(i), v2.a(i), v3.a(i), n), i);
            ++i;
        }
        final i g3 = this.g;
        if (g3 != null) {
            return (V)g3;
        }
        ah2.f.n("valueVector");
        throw null;
    }
    
    @Override
    public final V d(final V v, final V v2, final V v3) {
        ah2.f.f((Object)v, "initialValue");
        ah2.f.f((Object)v2, "targetValue");
        ah2.f.f((Object)v3, "initialVelocity");
        if (this.i == null) {
            this.i = (V)v3.c();
        }
        int i = 0;
        final i j = this.i;
        if (j == null) {
            ah2.f.n("endVelocityVector");
            throw null;
        }
        while (i < j.b()) {
            final i k = this.i;
            if (k == null) {
                ah2.f.n("endVelocityVector");
                throw null;
            }
            k.e(this.f.get(i).e(v.a(i), v2.a(i), v3.a(i)), i);
            ++i;
        }
        final i l = this.i;
        if (l != null) {
            return (V)l;
        }
        ah2.f.n("endVelocityVector");
        throw null;
    }
    
    @Override
    public final V g(final long n, final V v, final V v2, final V v3) {
        ah2.f.f((Object)v, "initialValue");
        ah2.f.f((Object)v2, "targetValue");
        ah2.f.f((Object)v3, "initialVelocity");
        if (this.h == null) {
            this.h = (V)v3.c();
        }
        int i = 0;
        final i h = this.h;
        if (h == null) {
            ah2.f.n("velocityVector");
            throw null;
        }
        while (i < h.b()) {
            final i h2 = this.h;
            if (h2 == null) {
                ah2.f.n("velocityVector");
                throw null;
            }
            h2.e(this.f.get(i).d(v.a(i), v2.a(i), v3.a(i), n), i);
            ++i;
        }
        final i h3 = this.h;
        if (h3 != null) {
            return (V)h3;
        }
        ah2.f.n("velocityVector");
        throw null;
    }
}

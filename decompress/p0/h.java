// 
// Decompiled by Procyon v0.6.0
// 

package p0;

import j1.d;
import u2.a;
import u2.b;

public final class h implements g, e
{
    public final b a;
    public final long b;
    public final /* synthetic */ f c;
    
    public h(final b a, final long b) {
        this.a = a;
        this.b = b;
        this.c = f.a;
    }
    
    public final float a() {
        final b a = this.a;
        float q;
        if (u2.a.d(this.b)) {
            q = a.q(u2.a.h(this.b));
        }
        else {
            q = Float.POSITIVE_INFINITY;
        }
        return q;
    }
    
    public final float b() {
        final b a = this.a;
        float q;
        if (u2.a.c(this.b)) {
            q = a.q(u2.a.g(this.b));
        }
        else {
            q = Float.POSITIVE_INFINITY;
        }
        return q;
    }
    
    public final d c(final d d) {
        return this.c.c((d)j1.d.a.f);
    }
    
    public final long d() {
        return this.b;
    }
    
    public final d e(final d d, final j1.a a) {
        ah2.f.f((Object)d, "<this>");
        return this.c.e(d, a);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof h)) {
            return false;
        }
        final h h = (h)o;
        return ah2.f.a((Object)this.a, (Object)h.a) && u2.a.b(this.b, h.b);
    }
    
    public final float f() {
        return this.a.q(u2.a.i(this.b));
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.b) + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("BoxWithConstraintsScopeImpl(density=");
        k.append(this.a);
        k.append(", constraints=");
        k.append((Object)u2.a.k(this.b));
        k.append(')');
        return k.toString();
    }
}

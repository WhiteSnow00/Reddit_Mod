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
        float r;
        if (u2.a.d(this.b)) {
            r = a.r(u2.a.h(this.b));
        }
        else {
            r = Float.POSITIVE_INFINITY;
        }
        return r;
    }
    
    public final float b() {
        final b a = this.a;
        float r;
        if (u2.a.c(this.b)) {
            r = a.r(u2.a.g(this.b));
        }
        else {
            r = Float.POSITIVE_INFINITY;
        }
        return r;
    }
    
    public final d c(final d d) {
        return this.c.c((d)j1.d.a.f);
    }
    
    public final long d() {
        return this.b;
    }
    
    public final d e(final d d, final j1.a a) {
        sg2.e.f((Object)d, "<this>");
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
        return sg2.e.a((Object)this.a, (Object)h.a) && u2.a.b(this.b, h.b);
    }
    
    public final float f() {
        return this.a.r(u2.a.i(this.b));
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.b) + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("BoxWithConstraintsScopeImpl(density=");
        r.append(this.a);
        r.append(", constraints=");
        r.append((Object)u2.a.k(this.b));
        r.append(')');
        return r.toString();
    }
}

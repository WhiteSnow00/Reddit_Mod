// 
// Decompiled by Procyon v0.6.0
// 

package fc2;

import java.util.Iterator;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.ArrayList;

public final class f extends g implements Iterable<g>
{
    public final ArrayList f;
    
    public f() {
        this.f = new ArrayList();
    }
    
    public f(final int n) {
        this.f = new ArrayList(0);
    }
    
    public final String C() {
        if (this.f.size() == 1) {
            return this.f.get(0).C();
        }
        throw new IllegalStateException();
    }
    
    public final void F(final g g) {
        g f = g;
        if (g == null) {
            f = h.f;
        }
        this.f.add(f);
    }
    
    public final void I(final String s) {
        final ArrayList f = this.f;
        g f2;
        if (s == null) {
            f2 = h.f;
        }
        else {
            f2 = new k(s);
        }
        f.add(f2);
    }
    
    public final g J(final int n) {
        return this.f.get(n);
    }
    
    public final BigDecimal a() {
        if (this.f.size() == 1) {
            return this.f.get(0).a();
        }
        throw new IllegalStateException();
    }
    
    public final BigInteger c() {
        if (this.f.size() == 1) {
            return this.f.get(0).c();
        }
        throw new IllegalStateException();
    }
    
    public final boolean d() {
        if (this.f.size() == 1) {
            return this.f.get(0).d();
        }
        throw new IllegalStateException();
    }
    
    public final byte e() {
        if (this.f.size() == 1) {
            return this.f.get(0).e();
        }
        throw new IllegalStateException();
    }
    
    public final boolean equals(final Object o) {
        return o == this || (o instanceof f && ((f)o).f.equals(this.f));
    }
    
    public final int hashCode() {
        return this.f.hashCode();
    }
    
    public final char i() {
        if (this.f.size() == 1) {
            return this.f.get(0).i();
        }
        throw new IllegalStateException();
    }
    
    public final Iterator<g> iterator() {
        return this.f.iterator();
    }
    
    public final double k() {
        if (this.f.size() == 1) {
            return this.f.get(0).k();
        }
        throw new IllegalStateException();
    }
    
    public final float l() {
        if (this.f.size() == 1) {
            return this.f.get(0).l();
        }
        throw new IllegalStateException();
    }
    
    public final int m() {
        if (this.f.size() == 1) {
            return this.f.get(0).m();
        }
        throw new IllegalStateException();
    }
    
    public final int size() {
        return this.f.size();
    }
    
    public final long x() {
        if (this.f.size() == 1) {
            return this.f.get(0).x();
        }
        throw new IllegalStateException();
    }
    
    public final short z() {
        if (this.f.size() == 1) {
            return this.f.get(0).z();
        }
        throw new IllegalStateException();
    }
}

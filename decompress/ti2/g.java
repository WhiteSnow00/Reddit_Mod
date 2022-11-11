// 
// Decompiled by Procyon v0.6.0
// 

package ti2;

import fi2.d;
import vi2.h;
import hh2.e;

public abstract class g implements k0
{
    public int a;
    
    public abstract boolean c(final e p0);
    
    @Override
    public final boolean equals(final Object o) {
        final int n = 1;
        if (this == o) {
            return true;
        }
        if (!(o instanceof k0)) {
            return false;
        }
        if (o.hashCode() != this.hashCode()) {
            return false;
        }
        final k0 k0 = (k0)o;
        if (k0.getParameters().size() != ((k0)this).getParameters().size()) {
            return false;
        }
        final e f = this.f();
        final e f2 = k0.f();
        if (f2 == null) {
            return false;
        }
        if (!h.f((hh2.g)f) && !d.o((hh2.g)f)) {
            int n2;
            if (!h.f((hh2.g)f2) && !d.o((hh2.g)f2)) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            if (n2 != 0) {
                return this.c(f2);
            }
        }
        return false;
    }
    
    public abstract e f();
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        if (a != 0) {
            return a;
        }
        final e f = this.f();
        int a2;
        if (!h.f((hh2.g)f) && !d.o((hh2.g)f)) {
            a2 = d.g((hh2.g)f).hashCode();
        }
        else {
            a2 = System.identityHashCode(this);
        }
        return this.a = a2;
    }
}

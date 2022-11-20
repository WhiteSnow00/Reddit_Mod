// 
// Decompiled by Procyon v0.6.0
// 

package s6;

import java.util.List;
import java.util.Collections;
import c7.c;

public final class r<K, A> extends a<K, A>
{
    public final A i;
    
    public r(final c7.c<A> c, final A i) {
        super(Collections.emptyList());
        this.k(c);
        this.i = i;
    }
    
    @Override
    public final float c() {
        return 1.0f;
    }
    
    @Override
    public final A f() {
        final c7.c<A> e = super.e;
        final A i = this.i;
        final float d = super.d;
        return e.b(0.0f, 0.0f, i, i, d, d, d);
    }
    
    @Override
    public final A g(final c7.a<K> a, final float n) {
        return this.f();
    }
    
    @Override
    public final void i() {
        if (super.e != null) {
            super.i();
        }
    }
    
    @Override
    public final void j(final float d) {
        super.d = d;
    }
}

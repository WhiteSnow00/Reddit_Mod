// 
// Decompiled by Procyon v0.6.0
// 

package t6;

import java.util.List;
import java.util.Collections;
import d7.c;

public final class r<K, A> extends a<K, A>
{
    public final A i;
    
    public r(final d7.c<A> c, final A i) {
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
        final d7.c<A> e = (d7.c<A>)super.e;
        final A i = this.i;
        final float d = super.d;
        return (A)e.b(0.0f, 0.0f, (Object)i, (Object)i, d, d, d);
    }
    
    @Override
    public final A g(final d7.a<K> a, final float n) {
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

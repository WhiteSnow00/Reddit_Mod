// 
// Decompiled by Procyon v0.6.0
// 

package qj2;

import tg2.a;
import java.util.Iterator;

public final class f implements Iterator<e>, a
{
    public int f;
    public final /* synthetic */ e g;
    
    public f(final e g) {
        this.g = g;
        this.f = g.e();
    }
    
    @Override
    public final boolean hasNext() {
        return this.f > 0;
    }
    
    @Override
    public final Object next() {
        final e g = this.g;
        return g.d(g.e() - this.f--);
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

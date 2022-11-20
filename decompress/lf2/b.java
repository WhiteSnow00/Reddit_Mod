// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import af2.s;
import af2.l;
import af2.g;
import java.util.Iterator;

public final class b<T> implements Iterable<T>
{
    public final nt2.b<? extends T> f;
    
    public b(final nt2.b<? extends T> f) {
        this.f = f;
    }
    
    @Override
    public final Iterator<T> iterator() {
        final b.b$a b$a = new b.b$a();
        g.fromPublisher((nt2.b<?>)this.f).materialize().subscribe((l<? super af2.s<Object>>)b$a);
        return (Iterator<T>)b$a;
    }
}

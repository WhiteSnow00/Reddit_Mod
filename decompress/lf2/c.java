// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import af2.l;
import java.util.Iterator;
import af2.g;

public final class c<T> implements Iterable<T>
{
    public final g<T> f;
    public final T g;
    
    public c(final g<T> f, final T g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final Iterator<T> iterator() {
        final c.c$a c$a = new c.c$a((Object)this.g);
        this.f.subscribe((l<? super T>)c$a);
        return (Iterator<T>)new c.c$a.a(c$a);
    }
}

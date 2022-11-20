// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import af2.g;
import nt2.b;
import java.util.List;
import ff2.o;

public final class v0<T, R> implements o<List<b<? extends T>>, b<? extends R>>
{
    public final o<? super Object[], ? extends R> f;
    
    public v0(final o<? super Object[], ? extends R> f) {
        this.f = f;
    }
    
    public final Object apply(final Object o) throws Exception {
        return g.zipIterable((Iterable<? extends nt2.b<?>>)o, (ff2.o<? super Object[], ?>)this.f, false, g.bufferSize());
    }
}

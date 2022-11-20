// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import af2.g;
import ef2.a;
import java.util.concurrent.Callable;

public final class h0<T> implements Callable<a<T>>
{
    public final g<T> f;
    public final int g;
    
    public h0(final g<T> f, final int g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final Object call() throws Exception {
        return this.f.replay(this.g);
    }
}

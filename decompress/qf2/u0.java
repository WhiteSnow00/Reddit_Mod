// 
// Decompiled by Procyon v0.6.0
// 

package qf2;

import ff2.b0;
import java.util.concurrent.TimeUnit;
import ff2.g;
import jf2.a;
import java.util.concurrent.Callable;

public final class u0<T> implements Callable<a<T>>
{
    public final g<T> f;
    public final long g;
    public final TimeUnit h;
    public final b0 i;
    
    public u0(final g<T> f, final long g, final TimeUnit h, final b0 i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final Object call() throws Exception {
        return this.f.replay(this.g, this.h, this.i);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import af2.b0;
import java.util.concurrent.TimeUnit;
import af2.g;
import ef2.a;
import java.util.concurrent.Callable;

public final class i0<T> implements Callable<a<T>>
{
    public final g<T> f;
    public final int g;
    public final long h;
    public final TimeUnit i;
    public final b0 j;
    
    public i0(final int g, final long h, final g f, final b0 j, final TimeUnit i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final Object call() throws Exception {
        return this.f.replay(this.g, this.h, this.i, this.j);
    }
}

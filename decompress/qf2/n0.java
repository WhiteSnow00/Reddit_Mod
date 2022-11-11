// 
// Decompiled by Procyon v0.6.0
// 

package qf2;

import ff2.g;
import jf2.a;
import java.util.concurrent.Callable;

public final class n0<T> implements Callable<a<T>>
{
    public final g<T> f;
    
    public n0(final g<T> f) {
        this.f = f;
    }
    
    @Override
    public final Object call() throws Exception {
        return this.f.replay();
    }
}

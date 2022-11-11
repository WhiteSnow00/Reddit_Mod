// 
// Decompiled by Procyon v0.6.0
// 

package ej2;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.Future;

public final class k0 implements l0
{
    public final Future<?> f;
    
    public k0(final ScheduledFuture f) {
        this.f = f;
    }
    
    public final void dispose() {
        this.f.cancel(false);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("DisposableFutureHandle[");
        r.append(this.f);
        r.append(']');
        return r.toString();
    }
}

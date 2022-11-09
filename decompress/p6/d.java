// 
// Decompiled by Procyon v0.6.0
// 

package p6;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Callable;
import dg.k;

public final class d implements Runnable
{
    public final /* synthetic */ k f;
    public final /* synthetic */ Callable g;
    
    public d(final k f, final Callable g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        try {
            final k f = this.f;
            final Exception call = this.g.call();
            if (((e)f.f).c(call)) {
                return;
            }
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
        catch (final Exception call) {
            this.f.e(call);
        }
        catch (final CancellationException ex) {
            final e e = (e)this.f.f;
            synchronized (e.a) {
                boolean b;
                if (e.b) {
                    b = false;
                    monitorexit(e.a);
                }
                else {
                    e.b = true;
                    e.a.notifyAll();
                    e.b();
                    monitorexit(e.a);
                    b = true;
                }
                if (b) {
                    return;
                }
                throw new IllegalStateException("Cannot cancel a completed task.");
            }
        }
    }
}

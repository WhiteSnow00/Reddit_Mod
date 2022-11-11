// 
// Decompiled by Procyon v0.6.0
// 

package d6;

import androidx.work.impl.utils.futures.AbstractFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import c6.i;
import androidx.work.ListenableWorker$a;
import androidx.work.impl.utils.futures.a;

public final class l implements Runnable
{
    public final /* synthetic */ a f;
    public final /* synthetic */ String g;
    public final /* synthetic */ m h;
    
    public l(final m h, final a f, final String g) {
        this.h = h;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        try {
            try {
                final ListenableWorker$a m = (ListenableWorker$a)((AbstractFuture)this.f).get();
                if (m == null) {
                    i.c().b(d6.m.y, String.format("%s returned a null result. Treating it as a failure.", this.h.j.c), new Throwable[0]);
                }
                i.c().a(d6.m.y, String.format("%s returned a %s result.", this.h.j.c, m), new Throwable[0]);
                this.h.m = m;
            }
            finally {}
        }
        catch (final ExecutionException t) {
            goto Label_0112;
        }
        catch (final InterruptedException ex) {}
        catch (final CancellationException ex2) {
            i.c().d(m.y, String.format("%s was cancelled", this.g), ex2);
        }
        this.h.c();
        return;
        this.h.c();
    }
}

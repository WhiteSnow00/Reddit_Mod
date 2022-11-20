// 
// Decompiled by Procyon v0.6.0
// 

package c6;

import androidx.work.impl.utils.futures.AbstractFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import b6.j;
import androidx.work.ListenableWorker$a;
import androidx.work.impl.utils.futures.a;

public final class m implements Runnable
{
    public final a f;
    public final String g;
    public final n h;
    
    public m(final n h, final a f, final String g) {
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
                    j.c().b(n.y, String.format("%s returned a null result. Treating it as a failure.", this.h.j.c), new Throwable[0]);
                }
                j.c().a(n.y, String.format("%s returned a %s result.", this.h.j.c, m), new Throwable[0]);
                this.h.m = m;
            }
            finally {}
        }
        catch (final ExecutionException t) {
            goto Label_0112;
        }
        catch (final InterruptedException ex) {}
        catch (final CancellationException ex2) {
            j.c().d(n.y, String.format("%s was cancelled", this.g), new Throwable[] { ex2 });
        }
        this.h.c();
        return;
        this.h.c();
    }
}

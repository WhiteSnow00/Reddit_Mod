// 
// Decompiled by Procyon v0.6.0
// 

package c6;

import androidx.work.ListenableWorker$a;
import java.util.concurrent.Future;
import b6.j;
import androidx.work.impl.utils.futures.a;
import xg.c;

public final class l implements Runnable
{
    public final c f;
    public final a g;
    public final n h;
    
    public l(final n h, final a f, final a g) {
        this.h = h;
        this.f = (c)f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        try {
            ((Future<Object>)this.f).get();
            j.c().a(n.y, String.format("Starting work for %s", this.h.j.c), new Throwable[0]);
            final n h = this.h;
            h.w = (c<ListenableWorker$a>)h.k.startWork();
            this.g.k((c)this.h.w);
        }
        finally {
            final Throwable t;
            this.g.j(t);
        }
    }
}

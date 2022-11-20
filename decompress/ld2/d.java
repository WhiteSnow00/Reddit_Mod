// 
// Decompiled by Procyon v0.6.0
// 

package ld2;

import cg2.j;
import hd2.g;
import com.tonyodev.fetch2.fetch.ListenerCoordinator;

public final class d implements Runnable
{
    public final ListenerCoordinator f;
    public final g g;
    
    public d(final ListenerCoordinator f, final g g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        synchronized (this.f.a) {
            this.g.b();
            final j a = j.a;
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package o6;

import androidx.work.ListenableWorker$a$b;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import wg.c;

public final class a implements Runnable
{
    public final /* synthetic */ c f;
    public final /* synthetic */ ConstraintTrackingWorker g;
    
    public a(final ConstraintTrackingWorker g, final c f) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final void run() {
        synchronized (this.g.g) {
            if (this.g.h) {
                this.g.i.i((Object)new ListenableWorker$a$b());
            }
            else {
                this.g.i.k(this.f);
            }
        }
    }
}

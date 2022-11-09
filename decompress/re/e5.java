// 
// Decompiled by Procyon v0.6.0
// 

package re;

import u5.w;
import java.util.concurrent.atomic.AtomicReference;

public final class e5 implements Runnable
{
    public final /* synthetic */ AtomicReference f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ n5 i;
    
    public e5(final n5 i, final AtomicReference f, final String g, final String h) {
        this.i = i;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void run() {
        final l6 w = ((h4)((w)this.i).f).w();
        final AtomicReference f = this.f;
        final String g = this.g;
        final String h = this.h;
        ((k2)w).y();
        ((h3)w).z();
        w.K((Runnable)new i6(w, f, g, h, w.H(false)));
    }
}

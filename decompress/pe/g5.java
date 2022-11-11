// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import z0.d1;
import java.util.concurrent.atomic.AtomicReference;

public final class g5 implements Runnable
{
    public final /* synthetic */ AtomicReference f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ o5 i;
    
    public g5(final o5 i, final AtomicReference f, final String g, final String h) {
        this.i = i;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void run() {
        final l6 v = ((h4)((d1)this.i).f).v();
        final AtomicReference f = this.f;
        final String g = this.g;
        final String h = this.h;
        v.M();
        v.N();
        v.Y(new i6(v, f, g, h, v.V(false)));
    }
}

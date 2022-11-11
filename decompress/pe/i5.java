// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import z0.d1;
import java.util.concurrent.atomic.AtomicReference;

public final class i5 implements Runnable
{
    public final /* synthetic */ AtomicReference f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ o5 j;
    
    public i5(final o5 j, final AtomicReference f, final String g, final String h, final boolean i) {
        this.j = j;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final void run() {
        final l6 v = ((h4)((d1)this.j).f).v();
        final AtomicReference f = this.f;
        final String g = this.g;
        final String h = this.h;
        final boolean i = this.i;
        v.M();
        v.N();
        v.Y(new z5(v, f, g, h, v.V(false), i));
    }
}

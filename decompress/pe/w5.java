// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import z0.d1;

public final class w5 implements Runnable
{
    public final /* synthetic */ long f;
    public final /* synthetic */ y5 g;
    
    public w5(final y5 g, final long f) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final void run() {
        ((h4)((d1)this.g).f).k().P(this.f);
        this.g.j = null;
    }
}

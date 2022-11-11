// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import qd.a;
import lw0.b;

public final class h6 implements Runnable
{
    public final /* synthetic */ q7 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ c h;
    public final /* synthetic */ l6 i;
    
    public h6(final l6 i, final q7 f, final boolean g, final c h) {
        this.i = i;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void run() {
        final l6 i = this.i;
        final u2 j = i.i;
        if (j == null) {
            ((h4)i.f).h().k.a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        b.R((Object)this.f);
        final l6 k = this.i;
        a h;
        if (this.g) {
            h = null;
        }
        else {
            h = this.h;
        }
        k.Q(j, h, this.f);
        this.i.X();
    }
}

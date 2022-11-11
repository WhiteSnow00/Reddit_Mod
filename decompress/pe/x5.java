// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import z0.d1;
import com.android.billingclient.api.m0;

public final class x5 implements Runnable
{
    public final /* synthetic */ u5 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ y5 h;
    
    public x5(final y5 h, final u5 f, final long g) {
        this.h = h;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        this.h.S(this.f, false, this.g);
        final y5 h = this.h;
        h.j = null;
        final l6 v = ((h4)((d1)h).f).v();
        v.M();
        v.N();
        v.Y((Runnable)new m0((Object)v, (Object)null, 5));
    }
}

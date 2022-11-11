// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import z0.d1;

public final class m5 implements Runnable
{
    public final /* synthetic */ boolean f;
    public final /* synthetic */ o5 g;
    
    public m5(final o5 g, final boolean f) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final void run() {
        final boolean d = ((h4)((d1)this.g).f).d();
        final h4 h4 = (h4)((d1)this.g).f;
        final Boolean f = h4.F;
        final boolean b = true;
        final boolean b2 = f != null && h4.F;
        ((h4)((d1)this.g).f).F = this.f;
        if (b2 == this.f) {
            ((h4)((d1)this.g).f).h().s.b((Object)this.f, "Default data collection state already set to");
        }
        Label_0222: {
            if (((h4)((d1)this.g).f).d() != d) {
                final boolean d2 = ((h4)((d1)this.g).f).d();
                final h4 h5 = (h4)((d1)this.g).f;
                if (d2 == (h5.F != null && h5.F && b)) {
                    break Label_0222;
                }
            }
            ((h4)((d1)this.g).f).h().p.c((Object)this.f, "Default data collection is different than actual status", (Object)d);
        }
        this.g.e0();
    }
}

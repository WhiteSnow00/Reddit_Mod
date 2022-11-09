// 
// Decompiled by Procyon v0.6.0
// 

package re;

import u5.w;
import yd.a;

public final class a6 implements Runnable
{
    public final /* synthetic */ q7 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ j7 h;
    public final /* synthetic */ l6 i;
    
    public a6(final l6 i, final q7 f, final boolean g, final j7 h) {
        this.i = i;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void run() {
        final l6 i = this.i;
        final t2 j = i.i;
        if (j == null) {
            ((h4)((w)i).f).f().k.a("Discarding data. Failed to set user property");
            return;
        }
        a.S0((Object)this.f);
        final l6 k = this.i;
        Object h;
        if (this.g) {
            h = null;
        }
        else {
            h = this.h;
        }
        k.C(j, (sd.a)h, this.f);
        this.i.J();
    }
}

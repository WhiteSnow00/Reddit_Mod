// 
// Decompiled by Procyon v0.6.0
// 

package e6;

import c6.i;
import l6.q;

public final class a implements Runnable
{
    public final /* synthetic */ q f;
    public final /* synthetic */ b g;
    
    public a(final b g, final q f) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final void run() {
        i.c().a(b.d, String.format("Scheduling work %s", this.f.a), new Throwable[0]);
        this.g.a.a(this.f);
    }
}

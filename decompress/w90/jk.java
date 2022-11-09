// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import af2.e;
import rl0.c;
import pm0.b;
import nm0.a;
import javax.inject.Provider;

public final class jk
{
    public Provider<a> a;
    public Provider<b> b;
    
    public jk(final kl kl, final ap ap, final pm0.a a) {
        this.a = (Provider<a>)af2.c.b((Provider)new c(ap.g, ap.f, kl.T, ap.Q1, kl.w0, kl.l, ap.U0, kl.S0, kl.q2, kl.f0, kl.E, ap.K, kl.L0, kl.D2, kl.O0, kl.N0, kl.P, ap.u1, kl.R));
        this.b = (Provider<b>)af2.c.b((Provider)new w30.b(this.a, (Provider)e.a((Object)a), (Provider)kl.Y, 21));
    }
}

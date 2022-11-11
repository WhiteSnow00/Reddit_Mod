// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import v40.d;
import af2.c;
import an0.a;
import an0.b;
import javax.inject.Provider;
import af2.e;

public final class il
{
    public e a;
    public Provider<rm0.e> b;
    public Provider<b> c;
    
    public il(final kl kl, final ap ap, final a a) {
        this.a = e.a((Object)a);
        final Provider b = af2.c.b((Provider)new cx.b((Provider)ap.k, (Provider)kl.W, (Provider)kl.l, (Provider)kl.f0, (Provider)ap.U0, 7));
        this.b = (Provider<rm0.e>)b;
        this.c = (Provider<b>)af2.c.b((Provider)new d((Provider)this.a, b, (Provider)kl.Y, (Provider)kl.e, 4));
    }
}

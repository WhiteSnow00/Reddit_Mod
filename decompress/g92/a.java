// 
// Decompiled by Procyon v0.6.0
// 

package g92;

import r82.p0$b;
import r82.p0$c;
import r82.p0$a;
import r82.p0;
import javax.inject.Inject;
import ng2.e;
import ua2.d;
import ua2.j;
import ua2.g;
import za2.l;
import za2.f;

public final class a
{
    public final f a;
    public final l b;
    public final g c;
    public final j d;
    
    @Inject
    public a(final f a, final l b, final d c, final com.reddit.vault.d d) {
        e.f((Object)b, "preparedDeepLinkHandler");
        this.a = a;
        this.b = b;
        this.c = (g)c;
        this.d = (j)d;
    }
    
    public final void a(final p0 p) {
        e.f((Object)p, "completionAction");
        if (p instanceof p0$a) {
            this.b.Dw(((p0$a)p).f, this.a);
        }
        else if (p instanceof p0$c) {
            this.c.x(((p0$c)p).f);
        }
        else if (e.a((Object)p, (Object)p0$b.f)) {
            this.d.e6();
        }
    }
}

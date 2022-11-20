// 
// Decompiled by Procyon v0.6.0
// 

package m72;

import ff2.o;
import af2.c0;
import ff0.v0;
import javax.inject.Inject;
import ng2.e;
import xd0.e0;
import android.support.v4.media.b;

public final class i extends b
{
    public final e0 g;
    public final c h;
    
    @Inject
    public i(final e0 g, final c h) {
        e.f((Object)g, "repository");
        e.f((Object)h, "getConfig");
        this.g = g;
        this.h = h;
    }
    
    public final c0 f1(final v0 v0) {
        final i.i$a i$a = (i.i$a)v0;
        e.f((Object)i$a, "params");
        final c0 b = this.h.x1((v0)new c$a(i$a.b, i$a.c)).p((o)new i40.b(9, (Object)this, (Object)i$a)).B((o)new q61.b(6));
        e.e((Object)b, "getConfig.execute(\n     \u2026rorReturn { emptyList() }");
        return b;
    }
}

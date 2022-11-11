// 
// Decompiled by Procyon v0.6.0
// 

package o1;

import n1.c;
import sg2.e;
import wd.a;
import android.graphics.RenderEffect;

public final class h0
{
    public static final h0 a;
    
    static {
        a = new h0();
    }
    
    public final RenderEffect a(final g0 g0, final float n, final float n2, final int n3) {
        RenderEffect renderEffect;
        if (g0 == null) {
            renderEffect = RenderEffect.createBlurEffect(n, n2, wd.a.z0(n3));
            e.e((Object)renderEffect, "{\n            android.gr\u2026)\n            )\n        }");
        }
        else {
            RenderEffect a;
            if ((a = g0.a) == null) {
                a = g0.a();
                g0.a = a;
            }
            renderEffect = RenderEffect.createBlurEffect(n, n2, a, wd.a.z0(n3));
            e.e((Object)renderEffect, "{\n            android.gr\u2026)\n            )\n        }");
        }
        return renderEffect;
    }
    
    public final RenderEffect b(final g0 g0, final long n) {
        RenderEffect renderEffect;
        if (g0 == null) {
            renderEffect = RenderEffect.createOffsetEffect(c.c(n), c.d(n));
            e.e((Object)renderEffect, "{\n            android.gr\u2026et.x, offset.y)\n        }");
        }
        else {
            final float c = n1.c.c(n);
            final float d = n1.c.d(n);
            RenderEffect a;
            if ((a = g0.a) == null) {
                a = g0.a();
                g0.a = a;
            }
            renderEffect = RenderEffect.createOffsetEffect(c, d, a);
            e.e((Object)renderEffect, "{\n            android.gr\u2026)\n            )\n        }");
        }
        return renderEffect;
    }
}

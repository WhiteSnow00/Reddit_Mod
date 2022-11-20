// 
// Decompiled by Procyon v0.6.0
// 

package x0;

import z0.d1;
import mg2.q;
import o1.r;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.ElevationOverlayKt;
import oi2.d0;
import androidx.compose.runtime.ComposerKt;
import z0.d;

public final class b implements f
{
    public static final b a;
    
    static {
        a = new b();
    }
    
    public final long a(final long n, float n2, final d d, final int n3) {
        final q a = ComposerKt.a;
        final a l = d0.l(d);
        long k1 = n;
        if (Float.compare(n2, 0) > 0) {
            k1 = n;
            if (!l.i()) {
                final d1 a2 = ElevationOverlayKt.a;
                n2 = ((float)Math.log(n2 + 1) * 4.5f + 2.0f) / 100.0f;
                k1 = cg.d.k1(r.b(ColorsKt.b(n, d), n2), n);
            }
        }
        return k1;
    }
}

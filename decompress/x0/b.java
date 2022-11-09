// 
// Decompiled by Procyon v0.6.0
// 

package x0;

import z0.f1;
import at1.a;
import o1.r;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.ElevationOverlayKt;
import z0.d;

public final class b implements f
{
    public static final b a;
    
    static {
        a = new b();
    }
    
    @Override
    public final long a(final long n, float n2, final d d, final int n3) {
        final x0.a a = wq2.b.a(d);
        long c0 = n;
        if (Float.compare(n2, 0) > 0) {
            c0 = n;
            if (!a.i()) {
                final f1 a2 = ElevationOverlayKt.a;
                n2 = ((float)Math.log(n2 + 1) * 4.5f + 2.0f) / 100.0f;
                c0 = at1.a.c0(r.b(ColorsKt.b(n, d), n2), n);
            }
        }
        return c0;
    }
}

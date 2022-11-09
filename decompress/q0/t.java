// 
// Decompiled by Procyon v0.6.0
// 

package q0;

import mj2.c0;
import u2.a;
import androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$a;
import s0.f;

public final class t
{
    public final l a;
    public final f b;
    public final u c;
    public final long d;
    
    public t(final long n, final boolean b, final l a, final f b2, final LazyListKt$rememberLazyListMeasurePolicy$1$1$a c) {
        this.a = a;
        this.b = b2;
        this.c = (u)c;
        int g = Integer.MAX_VALUE;
        int h;
        if (b) {
            h = u2.a.h(n);
        }
        else {
            h = Integer.MAX_VALUE;
        }
        if (!b) {
            g = u2.a.g(n);
        }
        this.d = c0.b(h, g, 5);
    }
    
    public final s a(final int n) {
        return this.c.a(n, this.a.a(n), this.b.E(n, this.d));
    }
}

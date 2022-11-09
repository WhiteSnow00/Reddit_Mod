// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.saveable.b;
import z0.d;

public final class a
{
    public static final LazyGridState a(int n, int n2, final d d, final int n3) {
        d.A(29186956);
        if ((n3 & 0x1) != 0x0) {
            n = 0;
        }
        if ((n3 & 0x2) != 0x0) {
            n2 = 0;
        }
        final LazyGridState lazyGridState = (LazyGridState)b.a(new Object[0], LazyGridState.u, (zg2.a)new LazyGridStateKt$rememberLazyGridState$1(n, n2), d, 4);
        d.I();
        return lazyGridState;
    }
}

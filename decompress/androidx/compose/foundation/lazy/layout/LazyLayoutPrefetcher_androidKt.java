// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.layout;

import pg2.j;
import zg2.p;
import z0.r0;
import androidx.compose.runtime.ComposerImpl;
import s0.i;
import z0.d$a;
import z0.o0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import android.view.View;
import ah2.f;
import z0.d;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import s0.h;

public final class LazyLayoutPrefetcher_androidKt
{
    public static final void a(final h h, final a a, final SubcomposeLayoutState subcomposeLayoutState, final d d, final int n) {
        f.f((Object)h, "prefetchState");
        f.f((Object)a, "itemContentFactory");
        f.f((Object)subcomposeLayoutState, "subcomposeLayoutState");
        final ComposerImpl r = d.r(1113453182);
        final View view = (View)r.t((o0)AndroidCompositionLocals_androidKt.f);
        r.A(1618982084);
        final boolean l = r.l((Object)subcomposeLayoutState);
        final boolean i = r.l((Object)h);
        final boolean j = r.l((Object)view);
        final Object c0 = r.c0();
        if ((l | i | j) || c0 == d$a.a) {
            r.I0((Object)new i(h, subcomposeLayoutState, a, view));
        }
        r.R(false);
        final r0 u = r.U();
        if (u != null) {
            u.d = (p<? super d, ? super Integer, j>)new LazyLayoutPrefetcher_androidKt$LazyLayoutPrefetcher.LazyLayoutPrefetcher_androidKt$LazyLayoutPrefetcher$2(h, a, subcomposeLayoutState, n);
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.layout;

import rg2.p;
import z0.r0;
import androidx.compose.runtime.ComposerImpl;
import s0.i;
import z0.d$a;
import z0.o0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import android.view.View;
import sg2.e;
import z0.d;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import s0.h;

public final class LazyLayoutPrefetcher_androidKt
{
    public static final void a(final h h, final a a, final SubcomposeLayoutState subcomposeLayoutState, final d d, final int n) {
        e.f((Object)h, "prefetchState");
        e.f((Object)a, "itemContentFactory");
        e.f((Object)subcomposeLayoutState, "subcomposeLayoutState");
        final ComposerImpl s = d.s(1113453182);
        final View view = (View)s.u((o0)AndroidCompositionLocals_androidKt.f);
        s.A(1618982084);
        final boolean m = s.m((Object)subcomposeLayoutState);
        final boolean i = s.m((Object)h);
        final boolean j = s.m((Object)view);
        final Object c0 = s.c0();
        if ((m | i | j) || c0 == d$a.a) {
            s.I0((Object)new i(h, subcomposeLayoutState, a, view));
        }
        s.R(false);
        final r0 u = s.U();
        if (u != null) {
            u.d = (p)new LazyLayoutPrefetcher_androidKt$LazyLayoutPrefetcher$2(h, a, subcomposeLayoutState, n);
        }
    }
}

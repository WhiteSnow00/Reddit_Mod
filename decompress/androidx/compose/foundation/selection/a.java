// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.selection;

import h2.q;
import zg2.l;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import m0.k;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.ui.platform.InspectableValueKt;
import ah2.f;
import h2.g;
import y0.b;
import o0.j;
import j1.d;

public final class a
{
    public static final d a(final d d, final boolean b, final j j, final b b2, final boolean b3, final g g, final zg2.a a) {
        f.f((Object)d, "$this$selectable");
        f.f((Object)j, "interactionSource");
        f.f((Object)a, "onClick");
        return InspectableValueKt.a(d, InspectableValueKt.a, SemanticsModifierKt.b(ClickableKt.c((d)d.a.f, j, (k)b2, b3, null, g, a, 8), false, (l<? super q, pg2.j>)new SelectableKt$selectable$4$1(b)));
    }
}

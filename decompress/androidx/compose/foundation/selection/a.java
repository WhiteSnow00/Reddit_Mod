// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.selection;

import h2.q;
import rg2.l;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.ui.platform.InspectableValueKt;
import sg2.e;
import h2.g;
import y0.b;
import o0.j;
import j1.d;

public final class a
{
    public static final d a(final d d, final boolean b, final j j, final b b2, final boolean b3, final g g, final rg2.a a) {
        e.f((Object)d, "$this$selectable");
        e.f((Object)j, "interactionSource");
        e.f((Object)a, "onClick");
        return InspectableValueKt.a(d, InspectableValueKt.a, SemanticsModifierKt.b(ClickableKt.c((d)d.a.f, j, (m0.j)b2, b3, (String)null, g, a, 8), false, (l<? super q, hg2.j>)new SelectableKt$selectable$4$1(b)));
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.selection;

import rg2.q;
import androidx.compose.ui.ComposedModifierKt;
import rg2.a;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.platform.InspectableValueKt;
import sg2.e;
import j1.d;
import rg2.l;
import h2.g;
import o0.j;

public final class b
{
    public static final d a(final boolean b, final j j, final boolean b2, final g g, final l l) {
        final d.a f = d.a.f;
        e.f((Object)j, "interactionSource");
        e.f((Object)l, "onValueChange");
        final l a = InspectableValueKt.a;
        ToggleableState toggleableState;
        if (b) {
            toggleableState = ToggleableState.On;
        }
        else {
            toggleableState = ToggleableState.Off;
        }
        return InspectableValueKt.a((d)f, a, ComposedModifierKt.b((d)f, (q)new ToggleableKt$toggleableImpl$1((a)new ToggleableKt$toggleable$4$1(l, b), b2, j, (m0.j)null, g, toggleableState)));
    }
}

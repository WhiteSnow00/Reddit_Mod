// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.relocation;

import rg2.q;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import sg2.e;
import t0.f;
import j1.d;

public final class BringIntoViewResponderKt
{
    public static final d a(final d d, final f f) {
        e.f((Object)d, "<this>");
        e.f((Object)f, "responder");
        return ComposedModifierKt.a(d, InspectableValueKt.a, (q)new BringIntoViewResponderKt$bringIntoViewResponder$2(f));
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.relocation;

import zg2.q;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import t0.f;
import j1.d;

public final class BringIntoViewResponderKt
{
    public static final d a(final d d, final f f) {
        ah2.f.f((Object)d, "<this>");
        ah2.f.f((Object)f, "responder");
        return ComposedModifierKt.a(d, InspectableValueKt.a, (q)new BringIntoViewResponderKt$bringIntoViewResponder$2(f));
    }
}

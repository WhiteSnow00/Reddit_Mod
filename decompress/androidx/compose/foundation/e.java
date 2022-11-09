// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import zg2.q;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import ah2.f;
import j1.d;
import o0.j;

public final class e
{
    public static final d a(final j j, final d d, final boolean b) {
        f.f((Object)d, "<this>");
        f.f((Object)j, "interactionSource");
        return ComposedModifierKt.a(d, InspectableValueKt.a, (q)new HoverableKt$hoverable$2(j, b));
    }
}

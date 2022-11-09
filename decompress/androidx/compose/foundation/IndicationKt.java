// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import zg2.q;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import ah2.f;
import m0.k;
import o0.i;
import j1.d;
import zg2.a;
import androidx.compose.runtime.CompositionLocalKt;
import z0.f1;

public final class IndicationKt
{
    public static final f1 a;
    
    static {
        a = CompositionLocalKt.d((a)IndicationKt$LocalIndication.IndicationKt$LocalIndication$1.INSTANCE);
    }
    
    public static final d a(final d d, final i i, final k k) {
        f.f((Object)d, "<this>");
        f.f((Object)i, "interactionSource");
        return ComposedModifierKt.a(d, InspectableValueKt.a, (q)new IndicationKt$indication.IndicationKt$indication$2(k, i));
    }
}

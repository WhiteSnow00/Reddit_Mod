// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.semantics;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import ah2.f;
import pg2.j;
import h2.q;
import zg2.l;
import j1.d;

public final class SemanticsModifierKt
{
    public static final d a(final d d, final l<? super q, j> l) {
        f.f((Object)d, "<this>");
        f.f((Object)l, "properties");
        return ComposedModifierKt.a(d, InspectableValueKt.a, (zg2.q)new SemanticsModifierKt$clearAndSetSemantics.SemanticsModifierKt$clearAndSetSemantics$2((l)l));
    }
    
    public static final d b(final d d, final boolean b, final l<? super q, j> l) {
        f.f((Object)d, "<this>");
        f.f((Object)l, "properties");
        return ComposedModifierKt.a(d, InspectableValueKt.a, (zg2.q)new SemanticsModifierKt$semantics.SemanticsModifierKt$semantics$2(b, (l)l));
    }
}

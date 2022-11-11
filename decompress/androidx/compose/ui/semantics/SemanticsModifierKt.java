// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.semantics;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import sg2.e;
import hg2.j;
import h2.q;
import rg2.l;
import j1.d;

public final class SemanticsModifierKt
{
    public static final d a(final d d, final l<? super q, j> l) {
        e.f((Object)d, "<this>");
        e.f((Object)l, "properties");
        return ComposedModifierKt.a(d, InspectableValueKt.a, (rg2.q)new SemanticsModifierKt$clearAndSetSemantics$2((l)l));
    }
    
    public static final d b(final d d, final boolean b, final l<? super q, j> l) {
        e.f((Object)d, "<this>");
        e.f((Object)l, "properties");
        return ComposedModifierKt.a(d, InspectableValueKt.a, (rg2.q)new SemanticsModifierKt$semantics$2(b, (l)l));
    }
}

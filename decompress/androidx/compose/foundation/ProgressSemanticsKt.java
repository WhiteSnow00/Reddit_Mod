// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import gh2.e;
import pg2.j;
import h2.q;
import zg2.l;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import ah2.f;
import j1.d;

public final class ProgressSemanticsKt
{
    public static final d a(final d d) {
        f.f((Object)d, "<this>");
        return SemanticsModifierKt.b(d, true, (l<? super q, j>)ProgressSemanticsKt$progressSemantics.ProgressSemanticsKt$progressSemantics$2.INSTANCE);
    }
    
    public static final d b(final d d, final float n, final e<Float> e, final int n2) {
        f.f((Object)d, "<this>");
        f.f((Object)e, "valueRange");
        return SemanticsModifierKt.b(d, true, (l<? super q, j>)new ProgressSemanticsKt$progressSemantics.ProgressSemanticsKt$progressSemantics$1(n, (e)e, n2));
    }
}

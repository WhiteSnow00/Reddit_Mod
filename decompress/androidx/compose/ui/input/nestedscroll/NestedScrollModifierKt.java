// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.input.nestedscroll;

import mg2.q;
import mg2.l;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import ng2.e;
import y1.a;
import j1.d;

public final class NestedScrollModifierKt
{
    public static final d a(final d d, final a a, final NestedScrollDispatcher nestedScrollDispatcher) {
        e.f((Object)d, "<this>");
        e.f((Object)a, "connection");
        return ComposedModifierKt.a(d, (l)InspectableValueKt.a, (q)new NestedScrollModifierKt$nestedScroll.NestedScrollModifierKt$nestedScroll$2(nestedScrollDispatcher, a));
    }
}

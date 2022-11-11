// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import zg2.q;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import ah2.f;
import j1.d;
import yd.a;
import pg2.j;
import zg2.l;
import d2.e;

public final class FocusedBoundsKt
{
    public static final e<l<c2.l, j>> a;
    
    static {
        a = yd.a.Y1((zg2.a)FocusedBoundsKt$ModifierLocalFocusedBoundsObserver.FocusedBoundsKt$ModifierLocalFocusedBoundsObserver$1.INSTANCE);
    }
    
    public static final d a(final d d, final l<? super c2.l, j> l) {
        f.f((Object)d, "<this>");
        return ComposedModifierKt.a(d, InspectableValueKt.a, (q)new FocusedBoundsKt$onFocusedBoundsChanged.FocusedBoundsKt$onFocusedBoundsChanged$2((l)l));
    }
}

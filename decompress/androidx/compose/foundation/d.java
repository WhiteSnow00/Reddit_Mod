// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import zg2.q;
import androidx.compose.ui.ComposedModifierKt;
import d2.e;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.platform.p0;
import m1.j;
import m1.l;
import androidx.compose.ui.focus.FocusPropertiesKt;
import ah2.f;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.o0;

public final class d
{
    public static final o0 a;
    
    static {
        a = new o0(InspectableValueKt.a);
    }
    
    public static final j1.d a() {
        final o0 a = d.a;
        f.f((Object)a, "other");
        final FocusableKt$focusGroup$1 instance = FocusableKt$focusGroup$1.INSTANCE;
        final e a2 = FocusPropertiesKt.a;
        f.f((Object)instance, "scope");
        return FocusModifierKt.a(((j1.d)a).f0((j1.d)new l((zg2.l<? super j, pg2.j>)instance, (zg2.l<? super p0, pg2.j>)InspectableValueKt.a)));
    }
    
    public static final j1.d b(final o0.j j, final j1.d d, final boolean b) {
        f.f((Object)d, "<this>");
        return ComposedModifierKt.a(d, InspectableValueKt.a, (q)new FocusableKt$focusable$2(j, b));
    }
    
    public static final j1.d c(final o0.j j, final j1.d d, final boolean b) {
        f.f((Object)d, "<this>");
        return ComposedModifierKt.a(d, InspectableValueKt.a, (q)new FocusableKt$focusableInNonTouchMode$2(b, j));
    }
}

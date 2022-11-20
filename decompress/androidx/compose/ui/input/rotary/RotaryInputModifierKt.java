// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.input.rotary;

import cg2.j;
import androidx.compose.ui.platform.o0;
import androidx.compose.ui.platform.InspectableValueKt;
import ng2.e;
import j1.d;
import mg2.l;
import dg.l0;
import w1.a;
import d2.h;

public final class RotaryInputModifierKt
{
    public static final h<a<b2.a>> a;
    
    static {
        a = l0.M0((mg2.a)RotaryInputModifierKt$ModifierLocalRotaryScrollParent$1.INSTANCE);
    }
    
    public static final d a(final l l) {
        final d.a f = d.a.f;
        e.f((Object)l, "onRotaryScrollEvent");
        return InspectableValueKt.a((d)f, InspectableValueKt.a, (d)new a((l)new RotaryInputModifierKt$focusAwareCallback$1(l), (h)RotaryInputModifierKt.a));
    }
}

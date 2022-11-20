// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.input.pointer;

import mg2.q;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import ng2.e;
import cg2.j;
import gg2.c;
import z1.w;
import j1.d;
import z1.p;
import java.util.List;
import kotlin.collections.EmptyList;
import z1.l;

public final class SuspendingPointerInputFilterKt
{
    public static final l a;
    
    static {
        a = new l((List<p>)EmptyList.INSTANCE);
    }
    
    public static final d a(final d d, final Object o, final Object o2, final mg2.p<? super w, ? super c<? super j>, ?> p4) {
        e.f((Object)d, "<this>");
        e.f((Object)p4, "block");
        return ComposedModifierKt.a(d, (mg2.l)InspectableValueKt.a, (q)new SuspendingPointerInputFilterKt$pointerInput.SuspendingPointerInputFilterKt$pointerInput$4(o, o2, (mg2.p)p4));
    }
    
    public static final d b(final d d, final Object o, final mg2.p<? super w, ? super c<? super j>, ?> p3) {
        e.f((Object)d, "<this>");
        e.f((Object)p3, "block");
        return ComposedModifierKt.a(d, (mg2.l)InspectableValueKt.a, (q)new SuspendingPointerInputFilterKt$pointerInput.SuspendingPointerInputFilterKt$pointerInput$2(o, (mg2.p)p3));
    }
    
    public static final d c(final Object[] array, final mg2.p p2) {
        final d.a f = d.a.f;
        e.f((Object)p2, "block");
        return ComposedModifierKt.a((d)f, (mg2.l)InspectableValueKt.a, (q)new SuspendingPointerInputFilterKt$pointerInput$6(array, (mg2.p<? super w, ? super c<? super j>, ?>)p2));
    }
}

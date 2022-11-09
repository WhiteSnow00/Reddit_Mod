// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import o1.m0;
import o1.n;
import zg2.q;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import ah2.f;
import o1.l0;
import m0.e;
import j1.d;

public final class a
{
    public static final d a(final d d, final e e, final l0 l0) {
        f.f((Object)d, "<this>");
        f.f((Object)e, "border");
        f.f((Object)l0, "shape");
        final float a = e.a;
        final n b = e.b;
        f.f((Object)b, "brush");
        return ComposedModifierKt.a(d, InspectableValueKt.a, (q)new BorderKt$border$2(a, l0, b));
    }
    
    public static final d b(final d d, final float n, final long n2, final l0 l0) {
        f.f((Object)d, "$this$border");
        f.f((Object)l0, "shape");
        return ComposedModifierKt.a(d, InspectableValueKt.a, (q)new BorderKt$border$2(n, l0, new m0(n2)));
    }
    
    public static final long c(final float n, final long n2) {
        return at1.a.g(Math.max(0.0f, n1.a.b(n2) - n), Math.max(0.0f, n1.a.c(n2) - n));
    }
}

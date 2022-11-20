// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.layout;

import c2.w;
import c2.u;
import c2.x;
import u2.b;
import c2.l;
import ng2.e;
import c2.j;
import c2.k;
import j1.d;

public interface a extends b
{
    default int b(final k k, final j j, final int n) {
        e.f((Object)k, "<this>");
        return this.h((x)new l((u2.b)k, k.getLayoutDirection()), (u)new c(j, MeasuringIntrinsics$IntrinsicMinMax.Max, MeasuringIntrinsics$IntrinsicWidthHeight.Height), cg.d.J(n, 0, 13)).getHeight();
    }
    
    default int c(final k k, final j j, final int n) {
        e.f((Object)k, "<this>");
        return this.h((x)new l((u2.b)k, k.getLayoutDirection()), (u)new c(j, MeasuringIntrinsics$IntrinsicMinMax.Min, MeasuringIntrinsics$IntrinsicWidthHeight.Width), cg.d.J(0, n, 7)).getWidth();
    }
    
    default int f(final k k, final j j, final int n) {
        e.f((Object)k, "<this>");
        return this.h((x)new l((u2.b)k, k.getLayoutDirection()), (u)new c(j, MeasuringIntrinsics$IntrinsicMinMax.Min, MeasuringIntrinsics$IntrinsicWidthHeight.Height), cg.d.J(n, 0, 13)).getHeight();
    }
    
    default int g(final k k, final j j, final int n) {
        e.f((Object)k, "<this>");
        return this.h((x)new l((u2.b)k, k.getLayoutDirection()), (u)new c(j, MeasuringIntrinsics$IntrinsicMinMax.Max, MeasuringIntrinsics$IntrinsicWidthHeight.Width), cg.d.J(0, n, 7)).getWidth();
    }
    
    w h(final x p0, final u p1, final long p2);
}

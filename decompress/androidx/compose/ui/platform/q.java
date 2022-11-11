// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import c2.e0;
import e2.g;
import i2.n;
import java.util.List;
import android.graphics.Rect;
import androidx.compose.ui.node.LayoutNodeWrapper;
import android.graphics.Region$Op;
import n1.f;
import n1.b;
import h2.i;
import n1.d;
import java.util.LinkedHashMap;
import android.graphics.Region;
import java.util.ArrayList;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.Lifecycle;
import h2.j;
import h2.k;
import androidx.compose.ui.node.LayoutNode;
import wd.a;
import rg2.l;
import sg2.e;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsNode;

public final class q
{
    public static final boolean a(final SemanticsNode semanticsNode) {
        return SemanticsConfigurationKt.a(semanticsNode.f(), SemanticsProperties.i) == null;
    }
    
    public static final boolean b(final SemanticsNode semanticsNode) {
        if (!g(semanticsNode) || e.a((Object)SemanticsConfigurationKt.a(semanticsNode.e, SemanticsProperties.k), (Object)Boolean.TRUE)) {
            final LayoutNode e = e(semanticsNode.g, (l)AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1.INSTANCE);
            boolean b = false;
            if (e == null) {
                return b;
            }
            final k n = a.N(e);
            boolean a = false;
            Label_0085: {
                if (n != null) {
                    final j c = n.c();
                    if (c != null) {
                        a = sg2.e.a((Object)SemanticsConfigurationKt.a(c, SemanticsProperties.k), (Object)Boolean.TRUE);
                        break Label_0085;
                    }
                }
                a = false;
            }
            b = b;
            if (a) {
                return b;
            }
        }
        return true;
    }
    
    public static final rg2.a c(final AbstractComposeView abstractComposeView, final Lifecycle lifecycle) {
        if (lifecycle.b().compareTo(Lifecycle.State.DESTROYED) > 0) {
            final g1 g1 = new g1(abstractComposeView);
            lifecycle.a((p)g1);
            return (rg2.a)new ViewCompositionStrategy_androidKt$installForLifecycle$2(lifecycle, (o)g1);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot configure ");
        sb.append(abstractComposeView);
        sb.append(" to disposeComposition at Lifecycle ON_DESTROY: ");
        sb.append(lifecycle);
        sb.append("is already destroyed");
        throw new IllegalStateException(sb.toString().toString());
    }
    
    public static final y0 d(final int n, final ArrayList list) {
        e.f((Object)list, "<this>");
        for (int size = list.size(), i = 0; i < size; ++i) {
            if (((y0)list.get(i)).f == n) {
                return (y0)list.get(i);
            }
        }
        return null;
    }
    
    public static final LayoutNode e(LayoutNode layoutNode, final l l) {
        for (layoutNode = layoutNode.t(); layoutNode != null; layoutNode = layoutNode.t()) {
            if (l.invoke(layoutNode)) {
                return layoutNode;
            }
        }
        return null;
    }
    
    public static final void f(final Region region, SemanticsNode g, final LinkedHashMap linkedHashMap, final SemanticsNode semanticsNode) {
        final LayoutNode g2 = semanticsNode.g;
        final boolean z = g2.z;
        final boolean b = false;
        final boolean b2 = !z || !g2.B();
        if ((region.isEmpty() && semanticsNode.f != g.f) || (b2 && !semanticsNode.c)) {
            return;
        }
        k k;
        if (semanticsNode.e.g) {
            if ((k = a.M(semanticsNode.g)) == null) {
                k = semanticsNode.a;
            }
        }
        else {
            k = semanticsNode.a;
        }
        d d = null;
        Label_0394: {
            if (!((g)k).i) {
                d = n1.d.e;
            }
            else if (SemanticsConfigurationKt.a(((h2.l)((g)k).g).Q0(), i.b) == null) {
                d = yg.a.X((c2.l)((g)k).f);
            }
            else {
                LayoutNodeWrapper layoutNodeWrapper = ((g)k).f;
                if (!layoutNodeWrapper.isAttached()) {
                    d = n1.d.e;
                }
                else {
                    final c2.l w0 = yg.a.w0((c2.l)layoutNodeWrapper);
                    b w2;
                    if ((w2 = layoutNodeWrapper.w) == null) {
                        w2 = new b();
                        layoutNodeWrapper.w = w2;
                    }
                    final long f0 = layoutNodeWrapper.F0(layoutNodeWrapper.X0());
                    w2.a = -f.f(f0);
                    w2.b = -f.d(f0);
                    w2.c = f.f(f0) + ((e0)layoutNodeWrapper).X();
                    w2.d = f.d(f0) + ((e0)layoutNodeWrapper).S();
                    while (layoutNodeWrapper != w0) {
                        layoutNodeWrapper.k1(w2, false, true);
                        if (w2.b()) {
                            d = n1.d.e;
                            break Label_0394;
                        }
                        layoutNodeWrapper = layoutNodeWrapper.k;
                        e.c((Object)layoutNodeWrapper);
                    }
                    d = new d(w2.a, w2.b, w2.c, w2.d);
                }
            }
        }
        final Rect y0 = a.y0(d);
        final Region region2 = new Region();
        region2.set(y0);
        int f2;
        if ((f2 = semanticsNode.f) == g.f) {
            f2 = -1;
        }
        if (region2.op(region, region2, Region$Op.INTERSECT)) {
            final Rect bounds = region2.getBounds();
            e.e((Object)bounds, "region.bounds");
            linkedHashMap.put(f2, new z0(semanticsNode, bounds));
            final List e = semanticsNode.e(false);
            for (int n = e.size() - 1; -1 < n; --n) {
                f(region, g, linkedHashMap, (SemanticsNode)e.get(n));
            }
            region.op(y0, region, Region$Op.REVERSE_DIFFERENCE);
        }
        else if (semanticsNode.c) {
            g = semanticsNode.g();
            int n2 = b ? 1 : 0;
            if (g != null) {
                final LayoutNode g3 = g.g;
                n2 = (b ? 1 : 0);
                if (g3 != null) {
                    n2 = (b ? 1 : 0);
                    if (g3.z) {
                        n2 = 1;
                    }
                }
            }
            d d2;
            if (n2 != 0) {
                d2 = g.d();
            }
            else {
                d2 = new d(0.0f, 0.0f, 10.0f, 10.0f);
            }
            linkedHashMap.put(f2, new z0(semanticsNode, a.y0(d2)));
        }
        else if (f2 == -1) {
            final Rect bounds2 = region2.getBounds();
            e.e((Object)bounds2, "region.bounds");
            linkedHashMap.put(f2, new z0(semanticsNode, bounds2));
        }
    }
    
    public static final boolean g(final SemanticsNode semanticsNode) {
        final j e = semanticsNode.e;
        final androidx.compose.ui.semantics.a<h2.a<l<List<n>, Boolean>>> a = i.a;
        return e.c((androidx.compose.ui.semantics.a)i.h);
    }
}

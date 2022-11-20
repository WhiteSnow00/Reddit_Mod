// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.layout;

import z0.g0;
import z0.g;
import mg2.l;
import z0.c1;
import cg2.j;
import z0.s;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.runtime.Updater;
import z0.c;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.k1;
import androidx.compose.ui.unit.LayoutDirection;
import z0.m0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import u2.b;
import androidx.compose.ui.ComposedModifierKt;
import z0.p0;
import mg2.q;
import androidx.compose.runtime.ComposerImpl;
import c2.w;
import u2.a;
import c2.l0;
import z0.d$a;
import androidx.compose.runtime.ComposerKt;
import ng2.e;
import mg2.p;
import z0.d;

public final class SubcomposeLayoutKt
{
    public static final void a(final int n, final int n2, final d d, j1.d f, final p p5) {
        e.f((Object)p5, "measurePolicy");
        final ComposerImpl s = d.s(-1298353104);
        final int n3 = n2 & 0x1;
        int n4;
        if (n3 != 0) {
            n4 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n5;
            if (s.m((Object)f)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n4 = (n5 | n);
        }
        else {
            n4 = n;
        }
        int n6;
        if ((n2 & 0x2) != 0x0) {
            n6 = (n4 | 0x30);
        }
        else {
            n6 = n4;
            if ((n & 0x70) == 0x0) {
                int n7;
                if (s.m((Object)p5)) {
                    n7 = 32;
                }
                else {
                    n7 = 16;
                }
                n6 = (n4 | n7);
            }
        }
        if ((n6 & 0x5B) == 0x12 && s.d()) {
            s.j();
        }
        else {
            if (n3 != 0) {
                f = (j1.d)j1.d.a.f;
            }
            final q a = ComposerKt.a;
            s.A(-492369756);
            Object d2;
            if ((d2 = s.d0()) == d$a.a) {
                d2 = new SubcomposeLayoutState();
                s.J0(d2);
            }
            s.S(false);
            final SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState)d2;
            final int n8 = n6 << 3;
            b(subcomposeLayoutState, f, (p<? super l0, ? super a, ? extends w>)p5, (d)s, (n8 & 0x70) | 0x8 | (n8 & 0x380), 0);
        }
        final p0 v = s.V();
        if (v != null) {
            v.d = (p)new SubcomposeLayoutKt$SubcomposeLayout$2(f, p5, n, n2);
        }
    }
    
    public static final void b(final SubcomposeLayoutState subcomposeLayoutState, j1.d f, final p<? super l0, ? super a, ? extends w> p6, final d d, final int n, final int n2) {
        e.f((Object)subcomposeLayoutState, "state");
        e.f((Object)p6, "measurePolicy");
        final ComposerImpl s = d.s(-511989831);
        if ((n2 & 0x2) != 0x0) {
            f = (j1.d)j1.d.a.f;
        }
        final q a = ComposerKt.a;
        final g u = a01.a.U((d)s);
        final j1.d c = ComposedModifierKt.c((d)s, f);
        final b b = (b)s.u((m0)CompositionLocalsKt.e);
        final LayoutDirection layoutDirection = (LayoutDirection)s.u((m0)CompositionLocalsKt.k);
        final k1 k1 = (k1)s.u((m0)CompositionLocalsKt.o);
        final mg2.a s2 = LayoutNode.S;
        s.A(1886828752);
        if (s.a instanceof c) {
            s.y0();
            if (s.L) {
                s.b((mg2.a)new SubcomposeLayoutKt$SubcomposeLayout$$inlined$ComposeNode$1(s2));
            }
            else {
                s.f();
            }
            Updater.b((d)s, (Object)subcomposeLayoutState, (p)subcomposeLayoutState.c);
            Updater.b((d)s, (Object)u, (p)subcomposeLayoutState.d);
            Updater.b((d)s, (Object)p6, (p)subcomposeLayoutState.e);
            ComposeUiNode.M2.getClass();
            Updater.b((d)s, (Object)b, (p)ComposeUiNode.Companion.d);
            Updater.b((d)s, (Object)layoutDirection, (p)ComposeUiNode.Companion.f);
            Updater.b((d)s, (Object)k1, (p)ComposeUiNode.Companion.g);
            Updater.b((d)s, (Object)c, (p)ComposeUiNode.Companion.c);
            s.S(true);
            s.S(false);
            s.A(-607848778);
            if (!s.d()) {
                z0.s.h((mg2.a)new SubcomposeLayoutKt$SubcomposeLayout$4(subcomposeLayoutState), (d)s);
            }
            s.S(false);
            final g0 k2 = ah0.b.k1((Object)subcomposeLayoutState, (d)s);
            final j a2 = j.a;
            s.A(1157296644);
            final boolean m = s.m((Object)k2);
            final Object d2 = s.d0();
            Object o;
            if (m || (o = d2) == d$a.a) {
                o = new SubcomposeLayoutKt$SubcomposeLayout$5$1((c1)k2);
                s.J0(o);
            }
            s.S(false);
            z0.s.c(a2, (l)o, (d)s);
            final p0 v = s.V();
            if (v != null) {
                v.d = (p)new SubcomposeLayoutKt$SubcomposeLayout$6(subcomposeLayoutState, f, (p)p6, n, n2);
            }
            return;
        }
        a01.a.L();
        throw null;
    }
}

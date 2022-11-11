// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.viewinterop;

import z0.r0;
import z0.g;
import z0.d$a$a;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Updater;
import e2.s;
import e2.p;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.platform.CompositionLocalsKt;
import u2.b;
import androidx.compose.ui.ComposedModifierKt;
import h2.q;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import y1.a;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import v2.c;
import z0.d$a;
import z0.o0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import android.content.Context;
import sg2.e;
import z0.d;
import hg2.j;
import android.view.View;
import rg2.l;

public final class AndroidView_androidKt
{
    public static final l<View, j> a;
    
    static {
        a = (l)AndroidView_androidKt$NoOpUpdate.AndroidView_androidKt$NoOpUpdate$1.INSTANCE;
    }
    
    public static final void a(final int n, final int n2, final d d, final j1.d d2, final l l, final l i) {
        e.f((Object)l, "factory");
        final ComposerImpl s = d.s(-1783766393);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (s.m((Object)l)) {
                n4 = 4;
            }
            else {
                n4 = 2;
            }
            n3 = (n4 | n);
        }
        else {
            n3 = n;
        }
        final int n5 = n2 & 0x2;
        int n8 = 0;
        Label_0135: {
            int n6;
            if (n5 != 0) {
                n6 = (n3 | 0x30);
            }
            else {
                n6 = n3;
                if ((n & 0x70) == 0x0) {
                    int n7;
                    if (s.m((Object)d2)) {
                        n7 = 32;
                    }
                    else {
                        n7 = 16;
                    }
                    n8 = (n3 | n7);
                    break Label_0135;
                }
            }
            n8 = n6;
        }
        final int n9 = n2 & 0x4;
        int n10;
        if (n9 != 0) {
            n10 = (n8 | 0x180);
        }
        else {
            n10 = n8;
            if ((n & 0x380) == 0x0) {
                int n11;
                if (s.m((Object)i)) {
                    n11 = 256;
                }
                else {
                    n11 = 128;
                }
                n10 = (n8 | n11);
            }
        }
        Object f;
        l<View, j> a;
        if ((n10 & 0x2DB) == 0x92 && s.c()) {
            s.k();
            f = d2;
            a = i;
        }
        else {
            if (n5 != 0) {
                f = j1.d.a.f;
            }
            else {
                f = d2;
            }
            if (n9 != 0) {
                a = AndroidView_androidKt.a;
            }
            else {
                a = i;
            }
            final Context context = (Context)s.u((o0)AndroidCompositionLocals_androidKt.b);
            s.A(-492369756);
            final Object c0 = s.c0();
            final d$a$a a2 = d$a.a;
            Object o = c0;
            if (c0 == a2) {
                o = new c();
                s.I0(o);
            }
            s.R(false);
            final c c2 = (c)o;
            s.A(-492369756);
            Object c3;
            if ((c3 = s.c0()) == a2) {
                c3 = new NestedScrollDispatcher();
                s.I0(c3);
            }
            s.R(false);
            final NestedScrollDispatcher nestedScrollDispatcher = (NestedScrollDispatcher)c3;
            final j1.d c4 = ComposedModifierKt.c((d)s, SemanticsModifierKt.b(((j1.d)f).j0(NestedScrollModifierKt.a((j1.d)j1.d.a.f, (a)c2, nestedScrollDispatcher)), true, AndroidView_androidKt$AndroidView$modifierWithSemantics$1.INSTANCE));
            final b b = (b)s.u((o0)CompositionLocalsKt.e);
            final LayoutDirection layoutDirection = (LayoutDirection)s.u((o0)CompositionLocalsKt.k);
            final g w0 = bg.d.w0((d)s);
            final h1.b b2 = (h1.b)s.u((o0)SaveableStateRegistryKt.a);
            final String value = String.valueOf(s.L);
            s.A(-492369756);
            Object c5;
            if ((c5 = s.c0()) == a2) {
                c5 = new p();
                s.I0(c5);
            }
            s.R(false);
            final p p6 = (p)c5;
            final androidx.lifecycle.q q = (androidx.lifecycle.q)s.u((o0)AndroidCompositionLocals_androidKt.d);
            final m5.d d3 = (m5.d)s.u((o0)AndroidCompositionLocals_androidKt.e);
            final AndroidView_androidKt$AndroidView$1 androidView_androidKt$AndroidView$1 = new AndroidView_androidKt$AndroidView$1(context, w0, nestedScrollDispatcher, l, b2, value, p6);
            s.A(1886828752);
            if (!(s.a instanceof s)) {
                bg.d.k0();
                throw null;
            }
            s.x0();
            if (s.K) {
                s.E((rg2.a)new AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1((rg2.a)androidView_androidKt$AndroidView$1));
            }
            else {
                s.f();
            }
            Updater.b((d)s, c4, (rg2.p<? super Object, ? super j1.d, j>)new AndroidView_androidKt$AndroidView$2$1(p6));
            Updater.b((d)s, b, (rg2.p<? super Object, ? super b, j>)new AndroidView_androidKt$AndroidView$2$2(p6));
            Updater.b((d)s, q, (rg2.p<? super Object, ? super androidx.lifecycle.q, j>)new AndroidView_androidKt$AndroidView$2$3(p6));
            Updater.b((d)s, d3, (rg2.p<? super Object, ? super m5.d, j>)new AndroidView_androidKt$AndroidView$2$4(p6));
            Updater.b((d)s, a, (rg2.p<? super Object, ? super l<View, j>, j>)new AndroidView_androidKt$AndroidView$2$5(p6));
            Updater.b((d)s, layoutDirection, (rg2.p<? super Object, ? super LayoutDirection, j>)new AndroidView_androidKt$AndroidView$2$6(p6));
            s.R(true);
            s.R(false);
            if (b2 != null) {
                z0.s.b((Object)b2, (Object)value, (l)new AndroidView_androidKt$AndroidView$3(b2, value, p6), (d)s);
            }
        }
        final r0 u = s.U();
        if (u != null) {
            u.d = new AndroidView_androidKt$AndroidView$4(l, (j1.d)f, (l<Object, j>)a, n, n2);
        }
    }
}

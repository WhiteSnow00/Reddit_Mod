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
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import y1.a;
import z0.d$a;
import z0.o0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ah2.f;
import j1.d;
import android.content.Context;
import pg2.j;
import android.view.View;
import zg2.l;

public final class AndroidView_androidKt
{
    public static final l<View, j> a;
    
    static {
        a = (l)AndroidView_androidKt$NoOpUpdate.AndroidView_androidKt$NoOpUpdate$1.INSTANCE;
    }
    
    public static final <T extends View> void a(final l<? super Context, ? extends T> l, d f, l<? super T, j> a, final z0.d d, final int n, final int n2) {
        f.f((Object)l, "factory");
        final ComposerImpl r = d.r(-1783766393);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (r.l((Object)l)) {
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
        Label_0140: {
            int n6;
            if (n5 != 0) {
                n6 = (n3 | 0x30);
            }
            else {
                n6 = n3;
                if ((n & 0x70) == 0x0) {
                    int n7;
                    if (r.l((Object)f)) {
                        n7 = 32;
                    }
                    else {
                        n7 = 16;
                    }
                    n8 = (n3 | n7);
                    break Label_0140;
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
                if (r.l((Object)a)) {
                    n11 = 256;
                }
                else {
                    n11 = 128;
                }
                n10 = (n8 | n11);
            }
        }
        d d2;
        zg2.l<? super View, j> j;
        if ((n10 & 0x2DB) == 0x92 && r.b()) {
            r.j();
            final l<View, j> i = a;
            d2 = f;
            j = i;
        }
        else {
            if (n5 != 0) {
                f = (d)d.a.f;
            }
            if (n9 != 0) {
                a = AndroidView_androidKt.a;
            }
            final Context context = (Context)r.t((o0)AndroidCompositionLocals_androidKt.b);
            r.A(-492369756);
            final Object c0 = r.c0();
            final d$a$a a2 = d$a.a;
            y1.a a3;
            if ((a3 = (AndroidView_androidKt$a)c0) == a2) {
                a3 = new y1.a() {};
                r.I0((Object)a3);
            }
            r.R(false);
            final y1.a a4 = (y1.a)a3;
            r.A(-492369756);
            Object c2;
            if ((c2 = r.c0()) == a2) {
                c2 = new NestedScrollDispatcher();
                r.I0(c2);
            }
            r.R(false);
            final NestedScrollDispatcher nestedScrollDispatcher = (NestedScrollDispatcher)c2;
            final d c3 = ComposedModifierKt.c((z0.d)r, SemanticsModifierKt.b(f.f0(NestedScrollModifierKt.a((d)d.a.f, (y1.a)a4, nestedScrollDispatcher)), true, (l<? super q, j>)AndroidView_androidKt$AndroidView$modifierWithSemantics.AndroidView_androidKt$AndroidView$modifierWithSemantics$1.INSTANCE));
            final b b = (b)r.t((o0)CompositionLocalsKt.e);
            final LayoutDirection layoutDirection = (LayoutDirection)r.t((o0)CompositionLocalsKt.k);
            final g z0 = yl.a.Z0((z0.d)r);
            final h1.b b2 = (h1.b)r.t((o0)SaveableStateRegistryKt.a);
            final String value = String.valueOf(r.L);
            r.A(-492369756);
            Object c4;
            if ((c4 = r.c0()) == a2) {
                c4 = new p();
                r.I0(c4);
            }
            r.R(false);
            final p p6 = (p)c4;
            final androidx.lifecycle.q q = (androidx.lifecycle.q)r.t((o0)AndroidCompositionLocals_androidKt.d);
            final m5.d d3 = (m5.d)r.t((o0)AndroidCompositionLocals_androidKt.e);
            final AndroidView_androidKt$AndroidView.AndroidView_androidKt$AndroidView$1 androidView_androidKt$AndroidView$1 = new AndroidView_androidKt$AndroidView.AndroidView_androidKt$AndroidView$1(context, z0, nestedScrollDispatcher, (l)l, b2, value, p6);
            r.A(1886828752);
            if (!(r.a instanceof s)) {
                yl.a.B0();
                throw null;
            }
            r.x0();
            if (r.K) {
                r.i((zg2.a)new AndroidView_androidKt$AndroidView$$inlined$ComposeNode.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1((zg2.a)androidView_androidKt$AndroidView$1));
            }
            else {
                r.e();
            }
            Updater.b((z0.d)r, (Object)c3, (zg2.p)new AndroidView_androidKt$AndroidView$2.AndroidView_androidKt$AndroidView$2$1(p6));
            Updater.b((z0.d)r, (Object)b, (zg2.p)new AndroidView_androidKt$AndroidView$2.AndroidView_androidKt$AndroidView$2$2(p6));
            Updater.b((z0.d)r, (Object)q, (zg2.p)new AndroidView_androidKt$AndroidView$2.AndroidView_androidKt$AndroidView$2$3(p6));
            Updater.b((z0.d)r, (Object)d3, (zg2.p)new AndroidView_androidKt$AndroidView$2.AndroidView_androidKt$AndroidView$2$4(p6));
            Updater.b((z0.d)r, (Object)a, (zg2.p)new AndroidView_androidKt$AndroidView$2.AndroidView_androidKt$AndroidView$2$5(p6));
            Updater.b((z0.d)r, (Object)layoutDirection, (zg2.p)new AndroidView_androidKt$AndroidView$2.AndroidView_androidKt$AndroidView$2$6(p6));
            r.R(true);
            r.R(false);
            if (b2 != null) {
                z0.s.b(b2, value, (l)new AndroidView_androidKt$AndroidView.AndroidView_androidKt$AndroidView$3(b2, value, p6), (z0.d)r);
            }
            final l<View, j> k = a;
            d2 = f;
            j = k;
        }
        final r0 u = r.U();
        if (u != null) {
            u.d = (zg2.p<? super z0.d, ? super Integer, j>)new AndroidView_androidKt$AndroidView.AndroidView_androidKt$AndroidView$4((l)l, d2, (l)j, n, n2);
        }
    }
}

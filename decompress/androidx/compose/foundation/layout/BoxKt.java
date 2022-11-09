// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.layout;

import pg2.j;
import zg2.p;
import z0.d$a;
import c2.s;
import c2.r;
import c2.e0;
import z0.r0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Updater;
import z0.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.k1;
import androidx.compose.ui.unit.LayoutDirection;
import z0.o0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import u2.b;
import ah2.f;
import j1.d;
import j1.a;
import j1.a$a;

public final class BoxKt
{
    public static final BoxKt$boxMeasurePolicy$1 a;
    public static final BoxKt$EmptyBoxMeasurePolicy$1 b;
    
    static {
        a = new BoxKt$boxMeasurePolicy$1((a)a$a.a, false);
        b = BoxKt$EmptyBoxMeasurePolicy$1.a;
    }
    
    public static final void a(final d d, final z0.d d2, final int n) {
        f.f((Object)d, "modifier");
        final ComposerImpl r = d2.r(-211209833);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (r.l((Object)d)) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        if ((n3 & 0xB) == 0x2 && r.b()) {
            r.j();
        }
        else {
            final BoxKt$EmptyBoxMeasurePolicy$1 b = BoxKt.b;
            r.A(-1323940314);
            final b b2 = (b)r.t((o0)CompositionLocalsKt.e);
            final LayoutDirection layoutDirection = (LayoutDirection)r.t((o0)CompositionLocalsKt.k);
            final k1 k1 = (k1)r.t((o0)CompositionLocalsKt.o);
            ComposeUiNode.w2.getClass();
            final zg2.a b3 = ComposeUiNode$Companion.b;
            final ComposableLambdaImpl b4 = LayoutKt.b(d);
            final int n4 = (((n3 << 3 & 0x70) | 0x180) << 9 & 0x1C00) | 0x6;
            if (!(r.a instanceof c)) {
                yl.a.B0();
                throw null;
            }
            r.h();
            if (r.K) {
                r.i(b3);
            }
            else {
                r.e();
            }
            r.x = false;
            Updater.b((z0.d)r, (Object)b, ComposeUiNode$Companion.e);
            Updater.b((z0.d)r, (Object)b2, ComposeUiNode$Companion.d);
            Updater.b((z0.d)r, (Object)layoutDirection, ComposeUiNode$Companion.f);
            a40.f.v(n4 >> 3 & 0x70, b4, a.m(r, k1, ComposeUiNode$Companion.g, r), r, 2058660585);
            r.A(1021196736);
            if ((n4 >> 9 & 0xE & 0xB) == 0x2) {
                if (r.b()) {
                    r.j();
                }
            }
            d.x(r, false, false, true, false);
        }
        final r0 u = r.U();
        if (u != null) {
            u.d = (p<? super z0.d, ? super Integer, j>)new BoxKt$Box$3(d, n);
        }
    }
    
    public static final void b(final e0.a a, final e0 e0, final r r, final LayoutDirection layoutDirection, final int n, final int n2, a a2) {
        final Object c = r.c();
        p0.d d;
        if (c instanceof p0.d) {
            d = (p0.d)c;
        }
        else {
            d = null;
        }
        if (d != null) {
            final a g = d.g;
            if (g != null) {
                a2 = g;
            }
        }
        final long a3 = a2.a(yl.a.c(e0.f, e0.g), yl.a.c(n, n2), layoutDirection);
        final e0.a.a a4 = e0.a.a;
        a.getClass();
        e0.a.d(e0, a3, 0.0f);
    }
    
    public static final s c(final a a, final boolean b, final z0.d d) {
        f.f((Object)a, "alignment");
        d.A(56522820);
        Object a2;
        if (f.a((Object)a, (Object)a$a.a) && !b) {
            a2 = BoxKt.a;
        }
        else {
            d.A(511388516);
            final boolean l = d.l(a);
            final boolean i = d.l(b);
            final Object b2 = d.B();
            Object o;
            if ((i | l) || (o = b2) == d$a.a) {
                o = new BoxKt$boxMeasurePolicy$1(a, b);
                d.v(o);
            }
            d.I();
            a2 = o;
        }
        d.I();
        return (s)a2;
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import zg2.p;
import u2.g;
import o1.w;
import z0.r0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.k1;
import androidx.compose.ui.unit.LayoutDirection;
import z0.o0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import u2.b;
import pg2.j;
import h2.q;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import zg2.l;
import z0.d$a;
import j1.a$a;
import ah2.f;
import o1.s;
import c2.c;
import j1.a;
import j1.d;
import androidx.compose.ui.graphics.painter.Painter;

public final class ImageKt
{
    public static final void a(final Painter painter, final String s, d f, a e, c b, float n, s s2, final z0.d d, final int n2, final int n3) {
        f.f((Object)painter, "painter");
        final ComposerImpl r = d.r(1142754848);
        if ((n3 & 0x4) != 0x0) {
            f = (d)j1.d.a.f;
        }
        if ((n3 & 0x8) != 0x0) {
            e = (a)a$a.e;
        }
        if ((n3 & 0x10) != 0x0) {
            b = c.a.b;
        }
        if ((n3 & 0x20) != 0x0) {
            n = 1.0f;
        }
        if ((n3 & 0x40) != 0x0) {
            s2 = null;
        }
        r.A(-816794123);
        Object o2;
        if (s != null) {
            final d.a f2 = j1.d.a.f;
            r.A(1157296644);
            final boolean l = r.l((Object)s);
            final Object c0 = r.c0();
            Object o;
            if (l || (o = c0) == d$a.a) {
                o = new ImageKt$Image$semantics$1.ImageKt$Image$semantics$1$1(s);
                r.I0(o);
            }
            r.R(false);
            o2 = SemanticsModifierKt.b((d)f2, false, (l<? super q, j>)o);
        }
        else {
            o2 = j1.d.a.f;
        }
        r.R(false);
        final d p10 = a80.a.p0(at1.a.Y(f.f0((d)o2)), painter, e, b, n, s2, 2);
        final ImageKt$Image.ImageKt$Image$2 a = ImageKt$Image.ImageKt$Image$2.a;
        r.A(-1323940314);
        final b b2 = (b)r.t((o0)CompositionLocalsKt.e);
        final LayoutDirection layoutDirection = (LayoutDirection)r.t((o0)CompositionLocalsKt.k);
        final k1 k1 = (k1)r.t((o0)CompositionLocalsKt.o);
        ComposeUiNode.w2.getClass();
        final zg2.a b3 = ComposeUiNode$Companion.b;
        final ComposableLambdaImpl b4 = LayoutKt.b(p10);
        if (r.a instanceof z0.c) {
            r.h();
            if (r.K) {
                r.i(b3);
            }
            else {
                r.e();
            }
            r.x = false;
            Updater.b((z0.d)r, (Object)a, ComposeUiNode$Companion.e);
            Updater.b((z0.d)r, (Object)b2, ComposeUiNode$Companion.d);
            Updater.b((z0.d)r, (Object)layoutDirection, ComposeUiNode$Companion.f);
            b.p(0, b4, a.m(r, k1, ComposeUiNode$Companion.g, r), r, 2058660585, -2077995625);
            r.R(false);
            r.R(false);
            r.R(true);
            r.R(false);
            final r0 u = r.U();
            if (u != null) {
                u.d = (p<? super z0.d, ? super Integer, j>)new ImageKt$Image.ImageKt$Image$3(painter, s, f, e, b, n, s2, n2, n3);
            }
            return;
        }
        yl.a.B0();
        throw null;
    }
    
    public static final void b(final w w, final String s, d f, c.a.c$a$f b, final z0.d d, final int n, int n2) {
        f.f((Object)w, "bitmap");
        d.A(-1396260732);
        if ((n2 & 0x4) != 0x0) {
            f = (d)j1.d.a.f;
        }
        Object e;
        if ((n2 & 0x8) != 0x0) {
            e = a$a.e;
        }
        else {
            e = null;
        }
        if ((n2 & 0x10) != 0x0) {
            b = (c.a.c$a$f)c.a.b;
        }
        float n3;
        if ((n2 & 0x20) != 0x0) {
            n3 = 1.0f;
        }
        else {
            n3 = 0.0f;
        }
        if ((n2 & 0x80) != 0x0) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        d.A(1157296644);
        final boolean l = d.l(w);
        final Object b2 = d.B();
        r1.a a;
        if (l || (a = (r1.a)b2) == d$a.a) {
            a = new r1.a(w, g.b, yl.a.c(w.getWidth(), w.getHeight()));
            a.n = n2;
            d.v(a);
        }
        d.I();
        a(a, s, f, (a)e, b, n3, null, d, (n & 0x70) | 0x8 | (n & 0x380) | (n & 0x1C00) | (0xE000 & n) | (0x70000 & n) | (0x380000 & n), 0);
        d.I();
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text.selection;

import androidx.compose.ui.unit.LayoutDirection;
import o1.s;
import o1.r;
import mj2.c0;
import os.h;
import o1.w;
import kotlin.jvm.internal.Lambda;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import w2.e;
import w0.b;
import z0.d$a;
import u2.g;
import n1.c;
import pg2.j;
import zg2.p;
import z0.r0;
import androidx.compose.runtime.ComposerImpl;
import a80.a;
import zg2.q;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.foundation.layout.SizeKt;
import ah2.f;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import j1.d;

public final class AndroidSelectionHandles_androidKt
{
    public static final void a(final d d, final boolean b, final ResolvedTextDirection resolvedTextDirection, final boolean b2, final z0.d d2, final int n) {
        f.f((Object)d, "modifier");
        f.f((Object)resolvedTextDirection, "direction");
        final ComposerImpl r = d2.r(47957398);
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
        int n4 = n3;
        if ((n & 0x70) == 0x0) {
            int n5;
            if (r.m(b)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        int n6 = n4;
        if ((n & 0x380) == 0x0) {
            int n7;
            if (r.l((Object)resolvedTextDirection)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n4 | n7);
        }
        int n8 = n6;
        if ((n & 0x1C00) == 0x0) {
            int n9;
            if (r.m(b2)) {
                n9 = 2048;
            }
            else {
                n9 = 1024;
            }
            n8 = (n6 | n9);
        }
        if ((n8 & 0x16DB) == 0x492 && r.b()) {
            r.j();
        }
        else {
            final d t = SizeKt.t(d, w0.f.a, w0.f.b);
            f.f((Object)t, "<this>");
            a.g(ComposedModifierKt.b(t, (q)new AndroidSelectionHandles_androidKt$drawSelectionHandle$1(b, resolvedTextDirection, b2)), (z0.d)r, 0);
        }
        final r0 u = r.U();
        if (u != null) {
            u.d = (p<? super z0.d, ? super Integer, j>)new AndroidSelectionHandles_androidKt$DefaultSelectionHandle.AndroidSelectionHandles_androidKt$DefaultSelectionHandle$1(d, b, resolvedTextDirection, b2, n);
        }
    }
    
    public static final void b(final long n, final HandleReferencePoint handleReferencePoint, final p<? super z0.d, ? super Integer, j> p5, final z0.d d, final int n2) {
        f.f((Object)handleReferencePoint, "handleReferencePoint");
        f.f((Object)p5, "content");
        final ComposerImpl r = d.r(-1409050158);
        int n4;
        if ((n2 & 0xE) == 0x0) {
            int n3;
            if (r.K(n)) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n2);
        }
        else {
            n4 = n2;
        }
        int n5 = n4;
        if ((n2 & 0x70) == 0x0) {
            int n6;
            if (r.l((Object)handleReferencePoint)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n5 = (n4 | n6);
        }
        int n7 = n5;
        if ((n2 & 0x380) == 0x0) {
            int n8;
            if (r.l((Object)p5)) {
                n8 = 256;
            }
            else {
                n8 = 128;
            }
            n7 = (n5 | n8);
        }
        if ((n7 & 0x2DB) == 0x92 && r.b()) {
            r.j();
        }
        else {
            final long h = at1.a.h(at1.a.D1(c.c(n)), at1.a.D1(c.d(n)));
            final g g = new g(h);
            r.A(511388516);
            final boolean l = r.l((Object)handleReferencePoint);
            final boolean i = r.l((Object)g);
            final Object c0 = r.c0();
            b b;
            if ((i | l) || (b = (b)c0) == d$a.a) {
                b = new b(handleReferencePoint, h);
                r.I0((Object)b);
            }
            r.R(false);
            AndroidPopup_androidKt.a((w2.d)b, null, new e(false, false, true, 15), p5, (z0.d)r, n7 << 3 & 0x1C00, 2);
        }
        final r0 u = r.U();
        if (u != null) {
            u.d = (p<? super z0.d, ? super Integer, j>)new AndroidSelectionHandles_androidKt$HandlePopup.AndroidSelectionHandles_androidKt$HandlePopup$1(n, handleReferencePoint, (p)p5, n2);
        }
    }
    
    public static final void c(final long n, final boolean b, final ResolvedTextDirection resolvedTextDirection, final boolean b2, final d d, final p<? super z0.d, ? super Integer, j> p8, final z0.d d2, final int n2) {
        f.f((Object)resolvedTextDirection, "direction");
        f.f((Object)d, "modifier");
        final ComposerImpl r = d2.r(-616295642);
        int n4;
        if ((n2 & 0xE) == 0x0) {
            int n3;
            if (r.K(n)) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n2);
        }
        else {
            n4 = n2;
        }
        int n5 = n4;
        if ((n2 & 0x70) == 0x0) {
            int n6;
            if (r.m(b)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n5 = (n4 | n6);
        }
        int n7 = n5;
        if ((n2 & 0x380) == 0x0) {
            int n8;
            if (r.l((Object)resolvedTextDirection)) {
                n8 = 256;
            }
            else {
                n8 = 128;
            }
            n7 = (n5 | n8);
        }
        int n9 = n7;
        if ((n2 & 0x1C00) == 0x0) {
            int n10;
            if (r.m(b2)) {
                n10 = 2048;
            }
            else {
                n10 = 1024;
            }
            n9 = (n7 | n10);
        }
        int n11 = n9;
        if ((0xE000 & n2) == 0x0) {
            int n12;
            if (r.l((Object)d)) {
                n12 = 16384;
            }
            else {
                n12 = 8192;
            }
            n11 = (n9 | n12);
        }
        int n13 = n11;
        if ((0x70000 & n2) == 0x0) {
            int n14;
            if (r.l((Object)p8)) {
                n14 = 131072;
            }
            else {
                n14 = 65536;
            }
            n13 = (n11 | n14);
        }
        if ((n13 & 0x5B6DB) == 0x12492 && r.b()) {
            r.j();
        }
        else {
            final boolean b3 = true;
            int n15 = 0;
            Label_0389: {
                if (b) {
                    if (resolvedTextDirection == ResolvedTextDirection.Ltr) {
                        n15 = (b3 ? 1 : 0);
                        if (!b2) {
                            break Label_0389;
                        }
                    }
                    if (resolvedTextDirection == ResolvedTextDirection.Rtl && b2) {
                        n15 = (b3 ? 1 : 0);
                        break Label_0389;
                    }
                }
                else if ((resolvedTextDirection != ResolvedTextDirection.Ltr || b2) && (resolvedTextDirection != ResolvedTextDirection.Rtl || !b2)) {
                    n15 = (b3 ? 1 : 0);
                    break Label_0389;
                }
                n15 = 0;
            }
            HandleReferencePoint handleReferencePoint;
            if (n15 != 0) {
                handleReferencePoint = HandleReferencePoint.TopRight;
            }
            else {
                handleReferencePoint = HandleReferencePoint.TopLeft;
            }
            b(n, handleReferencePoint, (p<? super z0.d, ? super Integer, j>)at1.a.a0((z0.d)r, 732099485, (Lambda)new AndroidSelectionHandles_androidKt$SelectionHandle.AndroidSelectionHandles_androidKt$SelectionHandle$1((p)p8, d, b, n, n13, resolvedTextDirection, b2)), (z0.d)r, (n13 & 0xE) | 0x180);
        }
        final r0 u = r.U();
        if (u != null) {
            u.d = (p<? super z0.d, ? super Integer, j>)new AndroidSelectionHandles_androidKt$SelectionHandle.AndroidSelectionHandles_androidKt$SelectionHandle$2(n, b, resolvedTextDirection, b2, d, (p)p8, n2);
        }
    }
    
    public static final w d(final l1.b a, final float n) {
        f.f((Object)a, "<this>");
        final int n2 = (int)(float)Math.ceil(n) * 2;
        final w e = h.E;
        o1.p f = h.F;
        final q1.a g = h.G;
        Object o = null;
        Label_0089: {
            if (e != null && f != null && n2 <= e.getWidth()) {
                o = e;
                if (n2 <= e.getHeight()) {
                    break Label_0089;
                }
            }
            o = (h.E = (w)c0.e(n2, n2, 1, 24));
            f = (h.F = (o1.p)gn.a.B((o1.d)o));
        }
        q1.a a2;
        if ((a2 = g) == null) {
            a2 = (h.G = new q1.a());
        }
        final LayoutDirection layoutDirection = a.f.getLayoutDirection();
        final long f2 = a.f((float)((w)o).getWidth(), (float)((w)o).getHeight());
        final q1.a.a f3 = a2.f;
        final u2.b a3 = f3.a;
        final LayoutDirection b = f3.b;
        final o1.p c = f3.c;
        final long d = f3.d;
        f3.a = a;
        f3.a(layoutDirection);
        f3.c = f;
        f3.d = f2;
        f.save();
        q1.e.P0(a2, r.b, 0L, a2.b(), 0.0f, null, 58);
        q1.e.P0(a2, at1.a.f(4278190080L), n1.c.b, a.f(n, n), 0.0f, null, 120);
        q1.e.L(a2, at1.a.f(4278190080L), n, yd.a.y0(n, n), null, 120);
        f.restore();
        final q1.a.a f4 = a2.f;
        f4.getClass();
        ah2.f.f((Object)a3, "<set-?>");
        f4.a = a3;
        f4.a(b);
        ah2.f.f((Object)c, "<set-?>");
        f4.c = c;
        f4.d = d;
        return (w)o;
    }
}

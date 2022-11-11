// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text.selection;

import androidx.compose.ui.unit.LayoutDirection;
import o1.s;
import o1.r;
import o1.w;
import kotlin.jvm.internal.Lambda;
import rg2.a;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import z0.d$a;
import u2.g;
import lw0.b;
import n1.c;
import hg2.j;
import rg2.p;
import z0.r0;
import androidx.compose.runtime.ComposerImpl;
import lg.e0;
import rg2.q;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.foundation.layout.SizeKt;
import w0.f;
import sg2.e;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import j1.d;

public final class AndroidSelectionHandles_androidKt
{
    public static final void a(final d d, final boolean b, final ResolvedTextDirection resolvedTextDirection, final boolean b2, final z0.d d2, final int n) {
        e.f((Object)d, "modifier");
        e.f((Object)resolvedTextDirection, "direction");
        final ComposerImpl s = d2.s(47957398);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (s.m((Object)d)) {
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
            if (s.n(b)) {
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
            if (s.m((Object)resolvedTextDirection)) {
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
            if (s.n(b2)) {
                n9 = 2048;
            }
            else {
                n9 = 1024;
            }
            n8 = (n6 | n9);
        }
        if ((n8 & 0x16DB) == 0x492 && s.c()) {
            s.k();
        }
        else {
            final d t = SizeKt.t(d, f.a, f.b);
            e.f((Object)t, "<this>");
            e0.e(ComposedModifierKt.b(t, (q)new AndroidSelectionHandles_androidKt$drawSelectionHandle$1(b, resolvedTextDirection, b2)), (z0.d)s, 0);
        }
        final r0 u = s.U();
        if (u != null) {
            u.d = (p)new AndroidSelectionHandles_androidKt$DefaultSelectionHandle$1(d, b, resolvedTextDirection, b2, n);
        }
    }
    
    public static final void b(final long n, final HandleReferencePoint handleReferencePoint, final p<? super z0.d, ? super Integer, j> p5, final z0.d d, final int n2) {
        e.f((Object)handleReferencePoint, "handleReferencePoint");
        e.f((Object)p5, "content");
        final ComposerImpl s = d.s(-1409050158);
        int n4;
        if ((n2 & 0xE) == 0x0) {
            int n3;
            if (s.K(n)) {
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
            if (s.m((Object)handleReferencePoint)) {
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
            if (s.m((Object)p5)) {
                n8 = 256;
            }
            else {
                n8 = 128;
            }
            n7 = (n5 | n8);
        }
        if ((n7 & 0x2DB) == 0x92 && s.c()) {
            s.k();
        }
        else {
            final long j = a92.b.j(b.k2(c.c(n)), b.k2(c.d(n)));
            final g g = new g(j);
            s.A(511388516);
            final boolean m = s.m((Object)handleReferencePoint);
            final boolean i = s.m((Object)g);
            final Object c0 = s.c0();
            w0.b b;
            if ((i | m) || (b = (w0.b)c0) == d$a.a) {
                b = new w0.b(handleReferencePoint, j);
                s.I0((Object)b);
            }
            s.R(false);
            AndroidPopup_androidKt.a((w2.d)b, null, new w2.e(false, false, true, 15), p5, (z0.d)s, n7 << 3 & 0x1C00, 2);
        }
        final r0 u = s.U();
        if (u != null) {
            u.d = (p)new AndroidSelectionHandles_androidKt$HandlePopup$1(n, handleReferencePoint, (p)p5, n2);
        }
    }
    
    public static final void c(final long n, final boolean b, final ResolvedTextDirection resolvedTextDirection, final boolean b2, final d d, final p<? super z0.d, ? super Integer, j> p8, final z0.d d2, final int n2) {
        e.f((Object)resolvedTextDirection, "direction");
        e.f((Object)d, "modifier");
        final ComposerImpl s = d2.s(-616295642);
        int n4;
        if ((n2 & 0xE) == 0x0) {
            int n3;
            if (s.K(n)) {
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
            if (s.n(b)) {
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
            if (s.m((Object)resolvedTextDirection)) {
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
            if (s.n(b2)) {
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
            if (s.m((Object)d)) {
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
            if (s.m((Object)p8)) {
                n14 = 131072;
            }
            else {
                n14 = 65536;
            }
            n13 = (n11 | n14);
        }
        if ((n13 & 0x5B6DB) == 0x12492 && s.c()) {
            s.k();
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
            b(n, handleReferencePoint, (p<? super z0.d, ? super Integer, j>)aa1.a.R((z0.d)s, 732099485, (Lambda)new AndroidSelectionHandles_androidKt$SelectionHandle$1((p)p8, d, b, n, n13, resolvedTextDirection, b2)), (z0.d)s, (n13 & 0xE) | 0x180);
        }
        final r0 u = s.U();
        if (u != null) {
            u.d = (p)new AndroidSelectionHandles_androidKt$SelectionHandle$2(n, b, resolvedTextDirection, b2, d, (p)p8, n2);
        }
    }
    
    public static final w d(final l1.b a, final float n) {
        e.f((Object)a, "<this>");
        final int n2 = (int)(float)Math.ceil(n) * 2;
        final w t = nn0.a.t;
        o1.p u = nn0.a.u;
        final q1.a v = nn0.a.v;
        w w = null;
        Label_0089: {
            if (t != null && u != null && n2 <= t.getWidth()) {
                w = t;
                if (n2 <= t.getHeight()) {
                    break Label_0089;
                }
            }
            w = (nn0.a.t = bg.d.f(n2, n2, 1, 24));
            u = (nn0.a.u = yg.a.q((o1.d)w));
        }
        q1.a a2;
        if ((a2 = v) == null) {
            a2 = (nn0.a.v = new q1.a());
        }
        final LayoutDirection layoutDirection = a.f.getLayoutDirection();
        final long q = bg.d.q((float)w.getWidth(), (float)w.getHeight());
        final q1.a.a$a f = a2.f;
        final u2.b a3 = f.a;
        final LayoutDirection b = f.b;
        final o1.p c = f.c;
        final long d = f.d;
        f.a = (u2.b)a;
        f.a(layoutDirection);
        f.c = u;
        f.d = q;
        u.save();
        q1.e.P0((q1.e)a2, r.b, 0L, ((q1.e)a2).b(), 0.0f, (s)null, 58);
        q1.e.P0((q1.e)a2, aa1.a.e(4278190080L), n1.c.b, bg.d.q(n, n), 0.0f, (s)null, 120);
        q1.e.N((q1.e)a2, aa1.a.e(4278190080L), n, wd.a.f(n, n), (q1.f)null, 120);
        u.restore();
        final q1.a.a$a f2 = a2.f;
        f2.getClass();
        e.f((Object)a3, "<set-?>");
        f2.a = a3;
        f2.a(b);
        e.f((Object)c, "<set-?>");
        f2.c = c;
        f2.d = d;
        return w;
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material;

import androidx.compose.ui.unit.LayoutDirection;
import n1.f;
import androidx.compose.animation.core.InfiniteTransition$a;
import z0.d$a;
import l0.h0;
import androidx.compose.animation.core.InfiniteTransition;
import z0.e1;
import androidx.compose.animation.core.RepeatMode;
import l0.p;
import l0.q;
import aa1.a;
import l0.r$a;
import androidx.compose.animation.core.VectorConvertersKt;
import z0.r0;
import androidx.compose.runtime.ComposerImpl;
import q1.i;
import z0.o0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import u2.b;
import androidx.compose.foundation.layout.SizeKt;
import yg2.e;
import androidx.compose.foundation.ProgressSemanticsKt;
import pd.r;
import z0.d;
import x0.k;
import l0.l;

public final class ProgressIndicatorKt
{
    public static final float a;
    public static final float b;
    public static final float c;
    public static final l d;
    public static final l e;
    public static final l f;
    public static final l g;
    public static final l h;
    
    static {
        final float a2 = k.a;
        a = k.a;
        b = 240;
        c = 40;
        d = new l(0.2f, 0.0f, 0.8f, 1.0f);
        e = new l(0.4f, 0.0f, 1.0f, 1.0f);
        f = new l(0.0f, 0.0f, 0.65f, 1.0f);
        g = new l(0.1f, 0.0f, 0.45f, 1.0f);
        h = new l(0.4f, 0.0f, 0.2f, 1.0f);
    }
    
    public static final void a(final float n, float a, final int n2, final int n3, long e, final d d, j1.d f) {
        final ComposerImpl s = d.s(-409649739);
        int n4;
        if ((n3 & 0x1) != 0x0) {
            n4 = (n2 | 0x6);
        }
        else if ((n2 & 0xE) == 0x0) {
            int n5;
            if (s.o(n)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n4 = (n5 | n2);
        }
        else {
            n4 = n2;
        }
        final int n6 = n3 & 0x2;
        int n9 = 0;
        Label_0129: {
            int n7;
            if (n6 != 0) {
                n7 = (n4 | 0x30);
            }
            else {
                n7 = n4;
                if ((n2 & 0x70) == 0x0) {
                    int n8;
                    if (s.m((Object)f)) {
                        n8 = 32;
                    }
                    else {
                        n8 = 16;
                    }
                    n9 = (n4 | n8);
                    break Label_0129;
                }
            }
            n9 = n7;
        }
        if ((n2 & 0x380) == 0x0) {
            int n10;
            if ((n3 & 0x4) == 0x0 && s.K(e)) {
                n10 = 256;
            }
            else {
                n10 = 128;
            }
            n9 |= n10;
        }
        final int n11 = n3 & 0x8;
        int n12;
        if (n11 != 0) {
            n12 = (n9 | 0xC00);
        }
        else {
            n12 = n9;
            if ((n2 & 0x1C00) == 0x0) {
                int n13;
                if (s.o(a)) {
                    n13 = 2048;
                }
                else {
                    n13 = 1024;
                }
                n12 = (n9 | n13);
            }
        }
        j1.d d2;
        long n14;
        if ((n12 & 0x16DB) == 0x492 && s.c()) {
            s.k();
            d2 = f;
            n14 = e;
        }
        else {
            s.v0();
            if ((n2 & 0x1) != 0x0 && !s.Y()) {
                s.k();
                d2 = f;
                n14 = e;
            }
            else {
                if (n6 != 0) {
                    f = (j1.d)d.a.f;
                }
                if ((n3 & 0x4) != 0x0) {
                    e = r.u((d)s).e();
                }
                d2 = f;
                n14 = e;
                if (n11 != 0) {
                    a = k.a;
                    n14 = e;
                    d2 = f;
                }
            }
            s.S();
            androidx.compose.foundation.b.a(0, (d)s, SizeKt.s(ProgressSemanticsKt.b(d2, n, (e)new yg2.d(0.0f, 1.0f), 0), ProgressIndicatorKt.c), (rg2.l)new ProgressIndicatorKt$CircularProgressIndicator$1(n, n14, new i(((b)s.u((o0)CompositionLocalsKt.e)).M0(a), 0.0f, 0, 0, 26)));
        }
        final r0 u = s.U();
        if (u != null) {
            u.d = new ProgressIndicatorKt$CircularProgressIndicator$2(n, d2, n14, a, n2, n3);
        }
    }
    
    public static final void b(float a, final int n, final int n2, long e, final d d, j1.d d2) {
        final ComposerImpl s = d.s(-392089979);
        final int n3 = n2 & 0x1;
        int n4;
        if (n3 != 0) {
            n4 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n5;
            if (s.m((Object)d2)) {
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
        if ((n & 0x70) == 0x0) {
            int n6;
            if ((n2 & 0x2) == 0x0 && s.K(e)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n4 |= n6;
        }
        final int n7 = n2 & 0x4;
        int n8;
        if (n7 != 0) {
            n8 = (n4 | 0x180);
        }
        else {
            n8 = n4;
            if ((n & 0x380) == 0x0) {
                int n9;
                if (s.o(a)) {
                    n9 = 256;
                }
                else {
                    n9 = 128;
                }
                n8 = (n4 | n9);
            }
        }
        Object f = null;
        if ((n8 & 0x2DB) == 0x92 && s.c()) {
            s.k();
            f = d2;
        }
        else {
            s.v0();
            Label_0305: {
                long n10;
                if ((n & 0x1) != 0x0 && !s.Y()) {
                    s.k();
                    n10 = e;
                }
                else {
                    if (n3 != 0) {
                        f = d.a.f;
                    }
                    else {
                        f = d2;
                    }
                    if ((n2 & 0x2) != 0x0) {
                        e = r.u((d)s).e();
                    }
                    d2 = (j1.d)f;
                    n10 = e;
                    if (n7 != 0) {
                        a = k.a;
                        break Label_0305;
                    }
                }
                f = d2;
                e = n10;
            }
            s.S();
            final i i = new i(((b)s.u((o0)CompositionLocalsKt.e)).M0(a), 0.0f, 2, 0, 26);
            final InfiniteTransition c = androidx.compose.animation.core.d.c((d)s);
            final h0 b = VectorConvertersKt.b;
            final r$a a2 = r$a.a;
            androidx.compose.foundation.b.a(0, (d)s, SizeKt.s(ProgressSemanticsKt.a((j1.d)f), ProgressIndicatorKt.c), (rg2.l)new ProgressIndicatorKt$CircularProgressIndicator$3(a, e, i, (e1<Integer>)androidx.compose.animation.core.d.b(c, (Comparable)0, (Comparable)5, b, a.z0((p)a.p1(6660, 0, (q)a2, 2), (RepeatMode)null, 6), (d)s), (e1<Float>)androidx.compose.animation.core.d.a(c, 0.0f, 290.0f, a.z0((p)a.F0((rg2.l)ProgressIndicatorKt$CircularProgressIndicator$endAngle$2.INSTANCE), (RepeatMode)null, 6), (d)s, 4536), (e1<Float>)androidx.compose.animation.core.d.a(c, 0.0f, 290.0f, a.z0((p)a.F0((rg2.l)ProgressIndicatorKt$CircularProgressIndicator$startAngle$2.INSTANCE), (RepeatMode)null, 6), (d)s, 4536), (e1<Float>)androidx.compose.animation.core.d.a(c, 0.0f, 286.0f, a.z0((p)a.p1(1332, 0, (q)a2, 2), (RepeatMode)null, 6), (d)s, 4536)));
        }
        final r0 u = s.U();
        if (u != null) {
            u.d = new ProgressIndicatorKt$CircularProgressIndicator$4((j1.d)f, e, a, n, n2);
        }
    }
    
    public static final void c(final int n, final int n2, long e, long b, final d d, j1.d d2) {
        final ComposerImpl s = d.s(-819397058);
        final int n3 = n2 & 0x1;
        int n4;
        if (n3 != 0) {
            n4 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n5;
            if (s.m((Object)d2)) {
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
        if ((n & 0x70) == 0x0) {
            int n6;
            if ((n2 & 0x2) == 0x0 && s.K(e)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n4 |= n6;
        }
        if ((n & 0x380) == 0x0) {
            int n7;
            if ((n2 & 0x4) == 0x0 && s.K(b)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n4 |= n7;
        }
        Object f = null;
        if ((n4 & 0x2DB) == 0x92 && s.c()) {
            s.k();
            f = d2;
        }
        else {
            s.v0();
            Label_0289: {
                long n8;
                if ((n & 0x1) != 0x0 && !s.Y()) {
                    s.k();
                    n8 = e;
                }
                else {
                    if (n3 != 0) {
                        f = j1.d.a.f;
                    }
                    else {
                        f = d2;
                    }
                    if ((n2 & 0x2) != 0x0) {
                        e = r.u((d)s).e();
                    }
                    d2 = (j1.d)f;
                    n8 = e;
                    if ((n2 & 0x4) != 0x0) {
                        b = o1.r.b(e, 0.24f);
                        break Label_0289;
                    }
                }
                f = d2;
                e = n8;
            }
            s.S();
            final InfiniteTransition c = androidx.compose.animation.core.d.c((d)s);
            final InfiniteTransition$a a = androidx.compose.animation.core.d.a(c, 0.0f, 1.0f, aa1.a.z0((p)aa1.a.F0((rg2.l)ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2.INSTANCE), (RepeatMode)null, 6), (d)s, 4536);
            final InfiniteTransition$a a2 = androidx.compose.animation.core.d.a(c, 0.0f, 1.0f, aa1.a.z0((p)aa1.a.F0((rg2.l)ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2.INSTANCE), (RepeatMode)null, 6), (d)s, 4536);
            final InfiniteTransition$a a3 = androidx.compose.animation.core.d.a(c, 0.0f, 1.0f, aa1.a.z0((p)aa1.a.F0((rg2.l)ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$2.INSTANCE), (RepeatMode)null, 6), (d)s, 4536);
            final InfiniteTransition$a a4 = androidx.compose.animation.core.d.a(c, 0.0f, 1.0f, aa1.a.z0((p)aa1.a.F0((rg2.l)ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2.INSTANCE), (RepeatMode)null, 6), (d)s, 4536);
            final j1.d t = SizeKt.t(ProgressSemanticsKt.a((j1.d)f), ProgressIndicatorKt.b, ProgressIndicatorKt.a);
            final o1.r r = new o1.r(b);
            final o1.r r2 = new o1.r(e);
            s.A(-568225417);
            boolean b2;
            for (int i = (b2 = false) ? 1 : 0; i < 6; ++i) {
                b2 |= s.m((new Object[] { r, a, a2, r2, a3, a4 })[i]);
            }
            Object c2 = s.c0();
            if (b2 || c2 == d$a.a) {
                c2 = new ProgressIndicatorKt$LinearProgressIndicator$3$1(b, e, (e1<Float>)a, (e1<Float>)a2, (e1<Float>)a3, (e1<Float>)a4);
                s.I0(c2);
            }
            s.R(false);
            androidx.compose.foundation.b.a(0, (d)s, t, (rg2.l)c2);
        }
        final r0 u = s.U();
        if (u != null) {
            u.d = new ProgressIndicatorKt$LinearProgressIndicator$4((j1.d)f, e, b, n, n2);
        }
    }
    
    public static final void d(final float n, j1.d d, long e, long b, final d d2, final int n2, final int n3) {
        final ComposerImpl s = d2.s(-850309746);
        int n4;
        if ((n3 & 0x1) != 0x0) {
            n4 = (n2 | 0x6);
        }
        else if ((n2 & 0xE) == 0x0) {
            int n5;
            if (s.o(n)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n4 = (n5 | n2);
        }
        else {
            n4 = n2;
        }
        final int n6 = n3 & 0x2;
        int n9 = 0;
        Label_0136: {
            int n7;
            if (n6 != 0) {
                n7 = (n4 | 0x30);
            }
            else {
                n7 = n4;
                if ((n2 & 0x70) == 0x0) {
                    int n8;
                    if (s.m((Object)d)) {
                        n8 = 32;
                    }
                    else {
                        n8 = 16;
                    }
                    n9 = (n4 | n8);
                    break Label_0136;
                }
            }
            n9 = n7;
        }
        if ((n2 & 0x380) == 0x0) {
            int n10;
            if ((n3 & 0x4) == 0x0 && s.K(e)) {
                n10 = 256;
            }
            else {
                n10 = 128;
            }
            n9 |= n10;
        }
        if ((n2 & 0x1C00) == 0x0) {
            int n11;
            if ((n3 & 0x8) == 0x0 && s.K(b)) {
                n11 = 2048;
            }
            else {
                n11 = 1024;
            }
            n9 |= n11;
        }
        long n12;
        if ((n9 & 0x16DB) == 0x492 && s.c()) {
            s.k();
            n12 = e;
        }
        else {
            s.v0();
            if ((n2 & 0x1) != 0x0 && !s.Y()) {
                s.k();
                n12 = e;
            }
            else {
                Object f;
                if (n6 != 0) {
                    f = j1.d.a.f;
                }
                else {
                    f = d;
                }
                if ((n3 & 0x4) != 0x0) {
                    e = r.u((d)s).e();
                }
                d = (j1.d)f;
                n12 = e;
                if ((n3 & 0x8) != 0x0) {
                    b = o1.r.b(e, 0.24f);
                    n12 = e;
                    d = (j1.d)f;
                }
            }
            s.S();
            final j1.d t = SizeKt.t(ProgressSemanticsKt.b(d, n, (e)new yg2.d(0.0f, 1.0f), 0), ProgressIndicatorKt.b, ProgressIndicatorKt.a);
            final o1.r r = new o1.r(b);
            final o1.r r2 = new o1.r(n12);
            s.A(1618982084);
            final boolean m = s.m((Object)r);
            final boolean i = s.m((Object)n);
            final boolean j = s.m((Object)r2);
            final Object c0 = s.c0();
            Object o;
            if ((m | i | j) || (o = c0) == d$a.a) {
                o = new ProgressIndicatorKt$LinearProgressIndicator$1.ProgressIndicatorKt$LinearProgressIndicator$1$1(b, n, n12);
                s.I0(o);
            }
            s.R(false);
            androidx.compose.foundation.b.a(0, (d)s, t, (rg2.l)o);
        }
        final r0 u = s.U();
        if (u != null) {
            u.d = (rg2.p)new ProgressIndicatorKt$LinearProgressIndicator.ProgressIndicatorKt$LinearProgressIndicator$2(n, d, n12, b, n2, n3);
        }
    }
    
    public static final void e(final q1.e e, final float n, final float n2, final long n3, final i i) {
        final float a = i.a;
        final float n4 = 2;
        final float n5 = a / n4;
        final float n6 = n1.f.f(e.b()) - n4 * n5;
        q1.e.L0(e, n3, n, n2, wd.a.f(n5, n5), bg.d.q(n6, n6), 0.0f, (q1.f)i, 832);
    }
    
    public static final void f(final q1.e e, float n, final float n2, final long n3, final float n4) {
        final float f = n1.f.f(e.b());
        final float n5 = n1.f.d(e.b()) / 2;
        final boolean b = e.getLayoutDirection() == LayoutDirection.Ltr;
        float n6;
        if (b) {
            n6 = n;
        }
        else {
            n6 = 1.0f - n2;
        }
        if (b) {
            n = n2;
        }
        else {
            n = 1.0f - n;
        }
        q1.e.Y(e, n3, wd.a.f(n6 * f, n5), wd.a.f(n * f, n5), n4, 0, 0, 496);
    }
}

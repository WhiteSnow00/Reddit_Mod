// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material;

import lg.e0;
import androidx.compose.foundation.IndicationKt;
import o1.r;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import z0.r0;
import z0.l0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import java.util.Map;
import z0.d$a$a;
import z0.f1;
import androidx.compose.runtime.ComposerImpl;
import o0.i;
import z0.e1;
import p0.f;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.h1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import j1.a$a;
import x0.m;
import androidx.compose.foundation.gestures.Orientation;
import kotlin.Pair;
import rg2.q;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import h2.g;
import androidx.compose.ui.unit.LayoutDirection;
import z0.s;
import lg2.c;
import z0.h0;
import sg2.e;
import z0.o0;
import u2.b;
import androidx.compose.ui.platform.CompositionLocalsKt;
import ml0.a;
import al0.g7;
import z0.d$a;
import x0.p;
import j1.d;
import hg2.j;
import rg2.l;
import l0.r$a;
import l0.f0;

public final class SwitchKt
{
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float g;
    public static final float h;
    public static final f0<Float> i;
    public static final float j;
    public static final float k;
    
    static {
        final float f2 = a = 34;
        b = 14;
        final float g2 = c = 20;
        d = 24;
        e = 2;
        f = f2;
        g = g2;
        h = f2 - g2;
        i = new f0<Float>(100, null, 6);
        j = 1;
        k = 6;
    }
    
    public static final void a(final boolean b, final l<? super Boolean, j> l, d f, boolean b2, o0.j j, p p9, final z0.d d, final int n, final int n2) {
        final ComposerImpl s = d.s(25866825);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (s.n(b)) {
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
        int n5;
        if ((n2 & 0x2) != 0x0) {
            n5 = (n3 | 0x30);
        }
        else {
            n5 = n3;
            if ((n & 0x70) == 0x0) {
                int n6;
                if (s.m((Object)l)) {
                    n6 = 32;
                }
                else {
                    n6 = 16;
                }
                n5 = (n3 | n6);
            }
        }
        final int n7 = n2 & 0x4;
        int n10 = 0;
        Label_0195: {
            int n8;
            if (n7 != 0) {
                n8 = (n5 | 0x180);
            }
            else {
                n8 = n5;
                if ((n & 0x380) == 0x0) {
                    int n9;
                    if (s.m((Object)f)) {
                        n9 = 256;
                    }
                    else {
                        n9 = 128;
                    }
                    n10 = (n5 | n9);
                    break Label_0195;
                }
            }
            n10 = n8;
        }
        final int n11 = n2 & 0x8;
        int n14 = 0;
        Label_0267: {
            int n12;
            if (n11 != 0) {
                n12 = (n10 | 0xC00);
            }
            else {
                n12 = n10;
                if ((n & 0x1C00) == 0x0) {
                    int n13;
                    if (s.n(b2)) {
                        n13 = 2048;
                    }
                    else {
                        n13 = 1024;
                    }
                    n14 = (n10 | n13);
                    break Label_0267;
                }
            }
            n14 = n12;
        }
        final int n15 = n2 & 0x10;
        int n18 = 0;
        Label_0339: {
            int n16;
            if (n15 != 0) {
                n16 = (n14 | 0x6000);
            }
            else {
                n16 = n14;
                if ((0xE000 & n) == 0x0) {
                    int n17;
                    if (s.m((Object)j)) {
                        n17 = 16384;
                    }
                    else {
                        n17 = 8192;
                    }
                    n18 = (n14 | n17);
                    break Label_0339;
                }
            }
            n18 = n16;
        }
        if ((n & 0x70000) == 0x0) {
            int n19;
            if ((n2 & 0x20) == 0x0 && s.m((Object)p9)) {
                n19 = 131072;
            }
            else {
                n19 = 65536;
            }
            n18 |= n19;
        }
        p p10;
        o0.j i;
        if ((0x5B6DB & n18) == 0x12492 && s.c()) {
            s.k();
            p10 = p9;
            i = j;
        }
        else {
            s.v0();
            d d2;
            p p12;
            if ((n & 0x1) != 0x0 && !s.Y()) {
                s.k();
                int n20 = n18;
                if ((n2 & 0x20) != 0x0) {
                    n20 = (n18 & 0xFFF8FFFF);
                }
                n18 = n20;
                final p p11 = p9;
                i = j;
                d2 = f;
                p12 = p11;
            }
            else {
                if (n7 != 0) {
                    f = (d)j1.d.a.f;
                }
                if (n11 != 0) {
                    b2 = true;
                }
                if (n15 != 0) {
                    s.A(-492369756);
                    Object o;
                    if ((o = s.c0()) == d$a.a) {
                        o = g7.o(s);
                    }
                    s.R(false);
                    j = (o0.j)o;
                }
                if ((n2 & 0x20) != 0x0) {
                    p9 = (p)ml0.a.p(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, (z0.d)s, 1023);
                    n18 &= 0xFFF8FFFF;
                }
                final o0.j k = j;
                d2 = f;
                p12 = p9;
                i = k;
            }
            s.S();
            final f1 e = CompositionLocalsKt.e;
            final float m0 = ((b)s.u((o0)e)).M0(SwitchKt.h);
            final Boolean value = b;
            Object instance;
            if (l == null) {
                instance = SwitchKt$Switch$swipeableState.SwitchKt$Switch$swipeableState$1.INSTANCE;
            }
            else {
                instance = l;
            }
            final f0<Float> i2 = SwitchKt.i;
            sg2.e.f((Object)value, "value");
            sg2.e.f(instance, "onValueChange");
            s.A(1156387078);
            s.A(-492369756);
            final Object c0 = s.c0();
            final d$a$a a = d$a.a;
            Object o2 = c0;
            if (c0 == a) {
                o2 = new SwipeableState(value, (l0.d<Float>)i2, SwipeableKt$rememberSwipeableStateFor$swipeableState$1$1.INSTANCE);
                s.I0(o2);
            }
            s.R(false);
            final SwipeableState swipeableState = (SwipeableState)o2;
            s.A(-492369756);
            Object o3;
            if ((o3 = s.c0()) == a) {
                o3 = bg.d.t0((Object)Boolean.FALSE);
                s.I0(o3);
            }
            s.R(false);
            final h0 h0 = (h0)o3;
            z0.s.e((Object)value, h0.getValue(), (rg2.p)new SwipeableKt$rememberSwipeableStateFor$1((Object)value, swipeableState, (c)null), (z0.d)s);
            z0.s.c(swipeableState.d(), (l)new SwipeableKt$rememberSwipeableStateFor$2(value, swipeableState, (l<Object, j>)instance, (h0<Boolean>)h0), (z0.d)s);
            s.R(false);
            final f1 k2 = CompositionLocalsKt.k;
            final boolean b3 = s.u((o0)k2) == LayoutDirection.Rtl;
            Object o4;
            if (l != null) {
                o4 = androidx.compose.foundation.selection.b.a(b, i, b2, new g(2), l);
            }
            else {
                o4 = j1.d.a.f;
            }
            d d3;
            final d.a a2 = (d.a)(d3 = (d)j1.d.a.f);
            if (l != null) {
                final f1 a3 = TouchTargetKt.a;
                d3 = ComposedModifierKt.a((d)a2, InspectableValueKt.a, (q)TouchTargetKt$minimumTouchTargetSize$2.INSTANCE);
            }
            final d j2 = d2.j0(d3).j0((d)o4);
            final Pair pair = new Pair((Object)0.0f, (Object)Boolean.FALSE);
            final Pair pair2 = new Pair((Object)m0, (Object)Boolean.TRUE);
            boolean b4 = true;
            final Map x0 = kotlin.collections.c.X0(new Pair[] { pair, pair2 });
            final Orientation horizontal = Orientation.Horizontal;
            if (!b2 || l == null) {
                b4 = false;
            }
            final d p13 = SizeKt.p(aa1.a.N0(SizeKt.B(b.d(j2, swipeableState, x0, horizontal, b4, b3, i, (rg2.p)SwitchKt$Switch.SwitchKt$Switch$2.INSTANCE, null, 256), a$a.e, false, 2), SwitchKt.e), SwitchKt.f, SwitchKt.g);
            s.A(733328855);
            final c2.s c2 = BoxKt.c((j1.a)a$a.a, false, (z0.d)s);
            s.A(-1323940314);
            final b b5 = (b)s.u((o0)e);
            final LayoutDirection layoutDirection = (LayoutDirection)s.u((o0)k2);
            final h1 h2 = (h1)s.u((o0)CompositionLocalsKt.o);
            ComposeUiNode.u2.getClass();
            final rg2.a b6 = ComposeUiNode$Companion.b;
            final ComposableLambdaImpl b7 = LayoutKt.b(p13);
            if (!(s.a instanceof z0.c)) {
                bg.d.k0();
                throw null;
            }
            s.j();
            if (s.K) {
                s.E(b6);
            }
            else {
                s.f();
            }
            s.x = false;
            Updater.b((z0.d)s, c2, ComposeUiNode$Companion.e);
            Updater.b((z0.d)s, b5, ComposeUiNode$Companion.d);
            Updater.b((z0.d)s, layoutDirection, ComposeUiNode$Companion.f);
            a81.e.w(0, b7, d.v(s, h2, ComposeUiNode$Companion.g, s), s, 2058660585, -2137368960);
            final f a4 = f.a;
            s.A(1571176015);
            final l0 e2 = swipeableState.e;
            final int n21 = n18 << 3;
            final ComposerImpl composerImpl = s;
            b((p0.e)a4, b, b2, p12, (e1<Float>)e2, i, (z0.d)s, (n21 & 0x70) | 0x6 | (n18 >> 3 & 0x380) | (n18 >> 6 & 0x1C00) | (n21 & 0x70000));
            aw.b.r(composerImpl, false, false, false, true);
            composerImpl.R(false);
            composerImpl.R(false);
            p10 = p12;
            f = d2;
        }
        final r0 u = s.U();
        if (u != null) {
            u.d = (rg2.p)new SwitchKt$Switch.SwitchKt$Switch$4(b, (l)l, f, b2, i, p10, n, n2);
        }
    }
    
    public static final void b(final p0.e e, final boolean b, final boolean b2, final p p8, final e1<Float> e2, final i i, final z0.d d, final int n) {
        final ComposerImpl s = d.s(-1834839253);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (s.m((Object)e)) {
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
            if (s.n(b2)) {
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
            if (s.m((Object)p8)) {
                n9 = 2048;
            }
            else {
                n9 = 1024;
            }
            n8 = (n6 | n9);
        }
        int n10 = n8;
        if ((0xE000 & n) == 0x0) {
            int n11;
            if (s.m((Object)e2)) {
                n11 = 16384;
            }
            else {
                n11 = 8192;
            }
            n10 = (n8 | n11);
        }
        int n12 = n10;
        if ((0x70000 & n) == 0x0) {
            int n13;
            if (s.m((Object)i)) {
                n13 = 131072;
            }
            else {
                n13 = 65536;
            }
            n12 = (n10 | n13);
        }
        if ((n12 & 0x5B6DB) == 0x12492 && s.c()) {
            s.k();
        }
        else {
            s.A(-492369756);
            final Object c0 = s.c0();
            final d$a$a a = d$a.a;
            SnapshotStateList list;
            if ((list = (SnapshotStateList)c0) == a) {
                list = new SnapshotStateList();
                s.I0((Object)list);
            }
            s.R(false);
            final SnapshotStateList list2 = list;
            s.A(511388516);
            final boolean m = s.m((Object)i);
            final boolean j = s.m((Object)list2);
            final Object c2 = s.c0();
            Object o;
            if ((m | j) || (o = c2) == a) {
                o = new SwitchKt$SwitchImpl$1$1(i, list2, (c)null);
                s.I0(o);
            }
            s.R(false);
            z0.s.f((Object)i, (rg2.p)o, (z0.d)s);
            float n14;
            if (list2.isEmpty() ^ true) {
                n14 = SwitchKt.k;
            }
            else {
                n14 = SwitchKt.j;
            }
            final h0 a2 = p8.a(b2, b, (z0.d)s);
            final d.a f = j1.d.a.f;
            final d h = SizeKt.h(e.e((d)f, (j1.a)a$a.e));
            s.A(1157296644);
            final boolean k = s.m((Object)a2);
            final Object c3 = s.c0();
            Object o2;
            if (k || (o2 = c3) == a) {
                o2 = new SwitchKt$SwitchImpl$2.SwitchKt$SwitchImpl$2$1((e1)a2);
                s.I0(o2);
            }
            s.R(false);
            androidx.compose.foundation.b.a(0, (z0.d)s, h, (l)o2);
            final h0 b3 = p8.b(b2, b, (z0.d)s);
            final x0.f f2 = (x0.f)s.u((o0)ElevationOverlayKt.a);
            final float f3 = ((u2.d)s.u((o0)ElevationOverlayKt.b)).f;
            s.A(-539245361);
            long n15;
            if (r.c(((r)((e1)b3).getValue()).a, pd.r.u((z0.d)s).h()) && f2 != null) {
                n15 = f2.a(((r)((e1)b3).getValue()).a, f3 + n14, (z0.d)s, 0);
            }
            else {
                n15 = ((r)((e1)b3).getValue()).a;
            }
            s.R(false);
            final d e3 = e.e((d)f, (j1.a)a$a.d);
            s.A(1157296644);
            final boolean l = s.m((Object)e2);
            final Object c4 = s.c0();
            Object o3;
            if (l || (o3 = c4) == a) {
                o3 = new SwitchKt$SwitchImpl$3.SwitchKt$SwitchImpl$3$1((e1)e2);
                s.I0(o3);
            }
            s.R(false);
            final d o4 = SizeKt.o(IndicationKt.a(wd.a.k0(e3, (l)o3), i, (m0.j)y0.i.a(false, SwitchKt.d, 0L, (z0.d)s, 54, 4)), SwitchKt.c);
            final u0.e a3 = u0.f.a;
            e0.e(vl.a.s(androidx.compose.ui.draw.b.a(o4, n14, (o1.l0)a3, 24), n15, (o1.l0)a3), (z0.d)s, 0);
        }
        final r0 u = s.U();
        if (u != null) {
            u.d = (rg2.p)new SwitchKt$SwitchImpl.SwitchKt$SwitchImpl$4(e, b, b2, p8, (e1)e2, i, n);
        }
    }
}

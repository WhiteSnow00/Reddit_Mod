// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material;

import androidx.compose.animation.core.Transition$b;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import x0.r;
import p0.d0;
import rg2.p;
import androidx.compose.runtime.Updater;
import z0.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.h1;
import androidx.compose.ui.unit.LayoutDirection;
import z0.o0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import u2.b;
import androidx.compose.foundation.layout.a$d;
import androidx.compose.foundation.layout.RowKt;
import j1.a$a;
import androidx.compose.foundation.layout.SizeKt;
import h2.g;
import androidx.compose.foundation.ClickableKt;
import al0.g7;
import p0.c0;
import z0.r0;
import androidx.compose.animation.core.Transition$d;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.ComposerImpl;
import kotlin.jvm.internal.Lambda;
import aa1.a;
import cg.m0;
import rg2.l;
import z0.e1;
import z0.d$a;
import l0.g0;
import l0.s;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.TransitionKt;
import sg2.e;
import hg2.j;
import p0.i;
import rg2.q;
import j1.d;
import o1.q0;
import z0.h0;
import l0.z;

public final class MenuKt
{
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float g;
    
    static {
        final float d2 = a = 8;
        final float g2 = b = 48;
        c = 16;
        d = d2;
        e = 112;
        f = 280;
        g = g2;
    }
    
    public static final void a(final z<Boolean> z, final h0<q0> h0, d f, final q<? super i, ? super z0.d, ? super Integer, j> q, final z0.d d, final int n, final int n2) {
        sg2.e.f((Object)z, "expandedStates");
        sg2.e.f((Object)h0, "transformOriginState");
        sg2.e.f((Object)q, "content");
        final ComposerImpl s = d.s(1164283597);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (s.m((Object)z)) {
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
                if (s.m((Object)h0)) {
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
        Label_0213: {
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
                    break Label_0213;
                }
            }
            n10 = n8;
        }
        int n11;
        if ((n2 & 0x8) != 0x0) {
            n11 = (n10 | 0xC00);
        }
        else {
            n11 = n10;
            if ((n & 0x1C00) == 0x0) {
                int n12;
                if (s.m((Object)q)) {
                    n12 = 2048;
                }
                else {
                    n12 = 1024;
                }
                n11 = (n10 | n12);
            }
        }
        if ((n11 & 0x16DB) == 0x492 && s.c()) {
            s.k();
        }
        else {
            if (n7 != 0) {
                f = (d)j1.d.a.f;
            }
            final Transition e = TransitionKt.e((z)z, (z0.d)s);
            final MenuKt$DropdownMenuContent$scale$2 instance = MenuKt$DropdownMenuContent$scale$2.INSTANCE;
            s.A(1399891485);
            final l0.h0 a = VectorConvertersKt.a;
            s.A(1847725064);
            final boolean booleanValue = (boolean)e.b();
            s.A(-1958825495);
            float n13 = 0.8f;
            final float n14 = 1.0f;
            float n15;
            if (booleanValue) {
                n15 = 1.0f;
            }
            else {
                n15 = 0.8f;
            }
            s.R(false);
            final boolean booleanValue2 = (boolean)e.d();
            s.A(-1958825495);
            if (booleanValue2) {
                n13 = 1.0f;
            }
            s.R(false);
            final Transition$d c = TransitionKt.c(e, (Object)n15, (Object)n13, (s)((q<Transition$b, ComposerImpl, Integer, s>)instance).invoke(e.c(), s, Integer.valueOf(0)), (g0)a, "FloatAnimation", (z0.d)s);
            s.R(false);
            s.R(false);
            final MenuKt$DropdownMenuContent$alpha$2 instance2 = MenuKt$DropdownMenuContent$alpha$2.INSTANCE;
            s.A(1399891485);
            s.A(1847725064);
            final boolean booleanValue3 = (boolean)e.b();
            s.A(-1541356035);
            float n16;
            if (booleanValue3) {
                n16 = 1.0f;
            }
            else {
                n16 = 0.0f;
            }
            s.R(false);
            final boolean booleanValue4 = (boolean)e.d();
            s.A(-1541356035);
            float n17;
            if (booleanValue4) {
                n17 = n14;
            }
            else {
                n17 = 0.0f;
            }
            s.R(false);
            final Transition$d c2 = TransitionKt.c(e, (Object)n16, (Object)n17, (s)((q<Transition$b, ComposerImpl, Integer, s>)instance2).invoke(e.c(), s, Integer.valueOf(0)), (g0)a, "FloatAnimation", (z0.d)s);
            s.R(false);
            s.R(false);
            final d.a f2 = j1.d.a.f;
            s.A(1618982084);
            final boolean m = s.m((Object)c);
            final boolean i = s.m((Object)c2);
            final boolean j = s.m((Object)h0);
            final Object c3 = s.c0();
            Object o;
            if ((m | i | j) || (o = c3) == d$a.a) {
                o = new MenuKt$DropdownMenuContent$1$1((h0)h0, (e1)c, (e1)c2);
                s.I0(o);
            }
            s.R(false);
            yg.a.s(m0.G((d)f2, (l)o), (u0.e)null, 0L, MenuKt.a, aa1.a.R((z0.d)s, -242468534, (Lambda)new MenuKt$DropdownMenuContent$2(f, (q)q, n11)), (z0.d)s, 1769472, 30);
        }
        final r0 u = s.U();
        if (u != null) {
            u.d = (p)new MenuKt$DropdownMenuContent$3((z)z, (h0)h0, f, (q)q, n, n2);
        }
    }
    
    public static final void b(final rg2.a<j> a, d f, boolean b, p0.z a2, o0.j j, final q<? super c0, ? super z0.d, ? super Integer, j> q, final z0.d d, final int n, final int n2) {
        sg2.e.f((Object)a, "onClick");
        sg2.e.f((Object)q, "content");
        final ComposerImpl s = d.s(87134531);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (s.m((Object)a)) {
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
        Label_0148: {
            int n6;
            if (n5 != 0) {
                n6 = (n3 | 0x30);
            }
            else {
                n6 = n3;
                if ((n & 0x70) == 0x0) {
                    int n7;
                    if (s.m((Object)f)) {
                        n7 = 32;
                    }
                    else {
                        n7 = 16;
                    }
                    n8 = (n3 | n7);
                    break Label_0148;
                }
            }
            n8 = n6;
        }
        final int n9 = n2 & 0x4;
        int n12 = 0;
        Label_0219: {
            int n10;
            if (n9 != 0) {
                n10 = (n8 | 0x180);
            }
            else {
                n10 = n8;
                if ((n & 0x380) == 0x0) {
                    int n11;
                    if (s.n(b)) {
                        n11 = 256;
                    }
                    else {
                        n11 = 128;
                    }
                    n12 = (n8 | n11);
                    break Label_0219;
                }
            }
            n12 = n10;
        }
        final int n13 = n2 & 0x8;
        int n16 = 0;
        Label_0291: {
            int n14;
            if (n13 != 0) {
                n14 = (n12 | 0xC00);
            }
            else {
                n14 = n12;
                if ((n & 0x1C00) == 0x0) {
                    int n15;
                    if (s.m((Object)a2)) {
                        n15 = 2048;
                    }
                    else {
                        n15 = 1024;
                    }
                    n16 = (n12 | n15);
                    break Label_0291;
                }
            }
            n16 = n14;
        }
        final int n17 = n2 & 0x10;
        int n20 = 0;
        Label_0363: {
            int n18;
            if (n17 != 0) {
                n18 = (n16 | 0x6000);
            }
            else {
                n18 = n16;
                if ((0xE000 & n) == 0x0) {
                    int n19;
                    if (s.m((Object)j)) {
                        n19 = 16384;
                    }
                    else {
                        n19 = 8192;
                    }
                    n20 = (n16 | n19);
                    break Label_0363;
                }
            }
            n20 = n18;
        }
        int n22 = 0;
        Label_0418: {
            int n21;
            if ((n2 & 0x20) != 0x0) {
                n21 = 196608;
            }
            else {
                n22 = n20;
                if ((0x70000 & n) != 0x0) {
                    break Label_0418;
                }
                if (s.m((Object)q)) {
                    n21 = 131072;
                }
                else {
                    n21 = 65536;
                }
            }
            n22 = (n20 | n21);
        }
        if ((0x5B6DB & n22) == 0x12492 && s.c()) {
            s.k();
        }
        else {
            if (n5 != 0) {
                f = (d)d.a.f;
            }
            if (n9 != 0) {
                b = true;
            }
            if (n13 != 0) {
                a2 = (p0.z)x0.j.a;
            }
            if (n17 != 0) {
                s.A(-492369756);
                Object o;
                if ((o = s.c0()) == d$a.a) {
                    o = g7.o(s);
                }
                s.R(false);
                j = (o0.j)o;
            }
            final d m0 = a.M0(SizeKt.v(SizeKt.j(ClickableKt.c(f, j, (m0.j)y0.i.a(true, 0.0f, 0L, (z0.d)s, 6, 6), b, (String)null, (g)null, (rg2.a)a, 24)), MenuKt.e, MenuKt.g, MenuKt.f, 0.0f, 8), a2);
            final j1.b.b k = a$a.k;
            s.A(693286680);
            final c2.s a3 = RowKt.a((a$d)androidx.compose.foundation.layout.a.a, k, (z0.d)s);
            s.A(-1323940314);
            final b b2 = (b)s.u((o0)CompositionLocalsKt.e);
            final LayoutDirection layoutDirection = (LayoutDirection)s.u((o0)CompositionLocalsKt.k);
            final h1 h1 = (h1)s.u((o0)CompositionLocalsKt.o);
            ComposeUiNode.u2.getClass();
            final rg2.a b3 = ComposeUiNode$Companion.b;
            final ComposableLambdaImpl b4 = LayoutKt.b(m0);
            if (!(s.a instanceof c)) {
                bg.d.k0();
                throw null;
            }
            s.j();
            if (s.K) {
                s.E(b3);
            }
            else {
                s.f();
            }
            s.x = false;
            Updater.b((z0.d)s, a3, ComposeUiNode$Companion.e);
            Updater.b((z0.d)s, b2, ComposeUiNode$Companion.d);
            Updater.b((z0.d)s, layoutDirection, ComposeUiNode$Companion.f);
            a81.e.w(0, b4, d.v(s, h1, ComposeUiNode$Companion.g, s), s, 2058660585, -678309503);
            final d0 a4 = d0.a;
            s.A(1664959143);
            TextKt.a(((r)s.u((o0)TypographyKt.a)).g, (p<? super z0.d, ? super Integer, j>)a.R((z0.d)s, 1190489496, (Lambda)new MenuKt$DropdownMenuItemContent$2.MenuKt$DropdownMenuItemContent$2$1(b, (q)q, (c0)a4, 6, n22)), (z0.d)s, 48);
            s.R(false);
            s.R(false);
            s.R(false);
            s.R(true);
            s.R(false);
            s.R(false);
        }
        final r0 u = s.U();
        if (u != null) {
            u.d = (p)new MenuKt$DropdownMenuItemContent.MenuKt$DropdownMenuItemContent$3((rg2.a)a, f, b, a2, j, (q)q, n, n2);
        }
    }
}

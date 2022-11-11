// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material;

import z0.r0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import z0.f1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import z0.p0;
import c2.s;
import androidx.compose.runtime.Updater;
import z0.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.h1;
import androidx.compose.ui.unit.LayoutDirection;
import z0.o0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import al0.b;
import j1.a$a;
import androidx.compose.foundation.ClickableKt;
import h2.g;
import y0.i;
import rg2.q;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import al0.g7;
import z0.d$a;
import sg2.e;
import rg2.p;
import j1.d;
import hg2.j;
import rg2.a;

public final class IconButtonKt
{
    public static final float a;
    
    static {
        a = 24;
    }
    
    public static final void a(final a<j> a, d f, boolean b, o0.j j, final p<? super z0.d, ? super Integer, j> p8, final z0.d d, final int n, final int n2) {
        e.f((Object)a, "onClick");
        e.f((Object)p8, "content");
        final ComposerImpl s = d.s(-111063634);
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
                    if (s.m((Object)j)) {
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
        int n17;
        if ((n2 & 0x10) != 0x0) {
            n17 = (n16 | 0x6000);
        }
        else {
            n17 = n16;
            if ((0xE000 & n) == 0x0) {
                int n18;
                if (s.m((Object)p8)) {
                    n18 = 16384;
                }
                else {
                    n18 = 8192;
                }
                n17 = (n16 | n18);
            }
        }
        d d2;
        o0.j i;
        if ((0xB6DB & n17) == 0x2492 && s.c()) {
            s.k();
            d2 = f;
            i = j;
        }
        else {
            if (n5 != 0) {
                f = (d)d.a.f;
            }
            if (n9 != 0) {
                b = true;
            }
            if (n13 != 0) {
                s.A(-492369756);
                Object o;
                if ((o = s.c0()) == d$a.a) {
                    o = g7.o(s);
                }
                s.R(false);
                j = (o0.j)o;
            }
            final f1 a2 = TouchTargetKt.a;
            e.f((Object)f, "<this>");
            final d c = ClickableKt.c(ComposedModifierKt.a(f, InspectableValueKt.a, (q)TouchTargetKt$minimumTouchTargetSize$2.INSTANCE), j, (m0.j)y0.i.a(false, IconButtonKt.a, 0L, (z0.d)s, 54, 4), b, (String)null, new g(0), (a)a, 8);
            final s f2 = b.f(s, 733328855, a$a.e, false, s, -1323940314);
            final u2.b b2 = (u2.b)s.u((o0)CompositionLocalsKt.e);
            final LayoutDirection layoutDirection = (LayoutDirection)s.u((o0)CompositionLocalsKt.k);
            final h1 h1 = (h1)s.u((o0)CompositionLocalsKt.o);
            ComposeUiNode.u2.getClass();
            final a b3 = ComposeUiNode$Companion.b;
            final ComposableLambdaImpl b4 = LayoutKt.b(c);
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
            Updater.b((z0.d)s, f2, ComposeUiNode$Companion.e);
            Updater.b((z0.d)s, b2, ComposeUiNode$Companion.d);
            Updater.b((z0.d)s, layoutDirection, ComposeUiNode$Companion.f);
            a81.e.w(0, b4, d.v(s, h1, ComposeUiNode$Companion.g, s), s, 2058660585, -2137368960);
            s.A(-2146259096);
            float n19;
            if (b) {
                s.A(753555775);
                n19 = ((Number)s.u((o0)ContentAlphaKt.a)).floatValue();
            }
            else {
                s.A(753555801);
                n19 = nn0.a.u((z0.d)s, 6);
            }
            s.R(false);
            CompositionLocalKt.a((p0<?>[])new p0[] { ((o0)ContentAlphaKt.a).b((Object)n19) }, p8, (z0.d)s, (n17 >> 9 & 0x70) | 0x8);
            s.R(false);
            s.R(false);
            s.R(false);
            s.R(true);
            s.R(false);
            s.R(false);
            d2 = f;
            i = j;
        }
        final r0 u = s.U();
        if (u != null) {
            u.d = (p)new IconButtonKt$IconButton$3((a)a, d2, b, i, (p)p8, n, n2);
        }
    }
}

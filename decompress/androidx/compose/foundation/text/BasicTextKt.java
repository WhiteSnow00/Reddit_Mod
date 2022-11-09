// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text;

import z0.f1;
import androidx.compose.ui.ComposedModifierKt;
import z0.r0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import zg2.q;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.k1;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Lambda;
import v0.k;
import z0.d$a;
import androidx.compose.runtime.saveable.SaverKt;
import java.util.List;
import kotlin.Pair;
import i2.a$b;
import java.util.ArrayList;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import u2.b;
import z0.o0;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import w0.g;
import kotlin.collections.c;
import ah2.f;
import java.util.Map;
import pg2.j;
import i2.n;
import zg2.l;
import i2.p;
import j1.d;
import i2.a;

public final class BasicTextKt
{
    public static final void a(final a a, d f, p c, l<? super n, j> instance, int n, boolean b, int n2, Map<String, v0.a> n3, final z0.d d, final int n4, final int n5) {
        f.f((Object)a, "text");
        final ComposerImpl r = d.r(-648605928);
        int n6;
        if ((n5 & 0x1) != 0x0) {
            n6 = (n4 | 0x6);
        }
        else if ((n4 & 0xE) == 0x0) {
            int n7;
            if (r.l((Object)a)) {
                n7 = 4;
            }
            else {
                n7 = 2;
            }
            n6 = (n7 | n4);
        }
        else {
            n6 = n4;
        }
        final int n8 = n5 & 0x2;
        int n11 = 0;
        Label_0141: {
            int n9;
            if (n8 != 0) {
                n9 = (n6 | 0x30);
            }
            else {
                n9 = n6;
                if ((n4 & 0x70) == 0x0) {
                    int n10;
                    if (r.l((Object)f)) {
                        n10 = 32;
                    }
                    else {
                        n10 = 16;
                    }
                    n11 = (n6 | n10);
                    break Label_0141;
                }
            }
            n11 = n9;
        }
        final int n12 = n5 & 0x4;
        int n15 = 0;
        Label_0212: {
            int n13;
            if (n12 != 0) {
                n13 = (n11 | 0x180);
            }
            else {
                n13 = n11;
                if ((n4 & 0x380) == 0x0) {
                    int n14;
                    if (r.l((Object)c)) {
                        n14 = 256;
                    }
                    else {
                        n14 = 128;
                    }
                    n15 = (n11 | n14);
                    break Label_0212;
                }
            }
            n15 = n13;
        }
        final int n16 = n5 & 0x8;
        int n19 = 0;
        Label_0284: {
            int n17;
            if (n16 != 0) {
                n17 = (n15 | 0xC00);
            }
            else {
                n17 = n15;
                if ((n4 & 0x1C00) == 0x0) {
                    int n18;
                    if (r.l((Object)instance)) {
                        n18 = 2048;
                    }
                    else {
                        n18 = 1024;
                    }
                    n19 = (n15 | n18);
                    break Label_0284;
                }
            }
            n19 = n17;
        }
        final int n20 = n5 & 0x10;
        int n23 = 0;
        Label_0356: {
            int n21;
            if (n20 != 0) {
                n21 = (n19 | 0x6000);
            }
            else {
                n21 = n19;
                if ((0xE000 & n4) == 0x0) {
                    int n22;
                    if (r.p(n)) {
                        n22 = 16384;
                    }
                    else {
                        n22 = 8192;
                    }
                    n23 = (n19 | n22);
                    break Label_0356;
                }
            }
            n23 = n21;
        }
        final int n24 = n5 & 0x20;
        int n27 = 0;
        Label_0425: {
            int n25;
            if (n24 != 0) {
                n25 = (n23 | 0x30000);
            }
            else {
                n25 = n23;
                if ((0x70000 & n4) == 0x0) {
                    int n26;
                    if (r.m(b)) {
                        n26 = 131072;
                    }
                    else {
                        n26 = 65536;
                    }
                    n27 = (n23 | n26);
                    break Label_0425;
                }
            }
            n27 = n25;
        }
        final int n28 = n5 & 0x40;
        int n29;
        if (n28 != 0) {
            n29 = (n27 | 0x180000);
        }
        else {
            n29 = n27;
            if ((n4 & 0x380000) == 0x0) {
                int n30;
                if (r.p(n2)) {
                    n30 = 1048576;
                }
                else {
                    n30 = 524288;
                }
                n29 = (n27 | n30);
            }
        }
        final int n31 = n5 & 0x80;
        int n32 = n29;
        if (n31 != 0) {
            n32 = (n29 | 0x400000);
        }
        d d3;
        p p12;
        Object c2;
        Map<String, v0.a> map2;
        if (n31 == 128 && (0x16DB6DB & n32) == 0x492492 && r.b()) {
            r.j();
            final d d2 = f;
            final p p11 = c;
            final BasicTextKt$BasicText$4 basicTextKt$BasicText$4 = instance;
            final Map map = n3;
            d3 = d2;
            p12 = p11;
            c2 = basicTextKt$BasicText$4;
            map2 = map;
        }
        else {
            r.v0();
            int n34;
            if ((n4 & 0x1) != 0x0 && !r.Y()) {
                r.j();
                int n33 = n32;
                if (n31 != 0) {
                    n33 = (n32 & 0xFE3FFFFF);
                }
                final d d4 = f;
                final BasicTextKt$BasicText$4 basicTextKt$BasicText$5 = instance;
                n34 = n;
                p12 = c;
                map2 = n3;
                n = n33;
                d3 = d4;
                c2 = basicTextKt$BasicText$5;
            }
            else {
                if (n8 != 0) {
                    f = (d)d.a.f;
                }
                if (n12 != 0) {
                    c = p.c;
                }
                if (n16 != 0) {
                    instance = BasicTextKt$BasicText$4.INSTANCE;
                }
                if (n20 != 0) {
                    n = 1;
                }
                if (n24 != 0) {
                    b = true;
                }
                if (n28 != 0) {
                    n2 = Integer.MAX_VALUE;
                }
                if (n31 != 0) {
                    n3 = c.N1();
                    n32 &= 0xFE3FFFFF;
                }
                final Map map3 = n3;
                final int n35 = n32;
                n34 = n;
                c2 = instance;
                p12 = c;
                d3 = f;
                map2 = map3;
                n = n35;
            }
            r.S();
            int i = 0;
            if (n2 <= 0) {
                throw new IllegalArgumentException("maxLines should be greater than 0".toString());
            }
            final g g = (g)r.t((o0)SelectionRegistrarKt.a);
            final b b2 = (b)r.t((o0)CompositionLocalsKt.e);
            final n2.g.a a2 = (n2.g.a)r.t((o0)CompositionLocalsKt.h);
            final long b3 = ((w0.l)r.t((o0)TextSelectionColorsKt.a)).b;
            final Pair<List<a$b<i2.j>>, List<a$b<q<String, z0.d, Integer, j>>>> a3 = CoreTextKt.a;
            f.f((Object)map2, "inlineContent");
            Pair a4;
            if (map2.isEmpty()) {
                a4 = CoreTextKt.a;
            }
            else {
                final ArrayList b4 = a.b(0, a.length(), "androidx.compose.foundation.text.inlineContent");
                final ArrayList<a$b> list = new ArrayList<a$b>();
                final ArrayList<a$b> list2 = new ArrayList<a$b>();
                while (i < b4.size()) {
                    final a$b a$b = b4.get(i);
                    final v0.a a5 = map2.get(a$b.a);
                    if (a5 != null) {
                        list.add(new a$b((Object)a5.a, a$b.b, a$b.c));
                        list2.add(new a$b((Object)a5.b, a$b.b, a$b.c));
                    }
                    ++i;
                }
                a4 = new Pair((Object)list, (Object)list2);
            }
            final List list3 = (List)a4.component1();
            final List list4 = (List)a4.component2();
            final long longValue = ((Number)androidx.compose.runtime.saveable.b.a(new Object[] { a, g }, SaverKt.a((l)BasicTextKt$selectionIdSaver$2.INSTANCE, (zg2.p)new BasicTextKt$selectionIdSaver$1(g)), (zg2.a)new BasicTextKt$BasicText$selectableId$2(g), (z0.d)r, 4)).longValue();
            r.A(-492369756);
            Object c3 = r.c0();
            if (c3 == d$a.a) {
                c3 = new TextController(new TextState(new k(a, p12, n2, b, n34, b2, a2, list3), longValue));
                r.I0(c3);
            }
            r.R(false);
            final TextController textController = (TextController)c3;
            final TextState f2 = textController.f;
            if (!r.K) {
                textController.e(CoreTextKt.b(f2.a, a, p12, b2, a2, b, n34, n2, list3));
            }
            f2.getClass();
            f.f(c2, "<set-?>");
            f2.c = (l<? super n, j>)c2;
            textController.f(g);
            ComposableLambdaImpl composableLambdaImpl;
            if (list4.isEmpty()) {
                composableLambdaImpl = ComposableSingletons$BasicTextKt.a;
            }
            else {
                composableLambdaImpl = at1.a.a0((z0.d)r, 1892283635, (Lambda)new BasicTextKt$BasicText$6(a, list4, n));
            }
            final d f3 = d3.f0(textController.j.f0(textController.k).f0(textController.l));
            final TextController$measurePolicy$1 j = textController.i;
            r.A(-1323940314);
            final b b5 = (b)r.t((o0)CompositionLocalsKt.e);
            final LayoutDirection layoutDirection = (LayoutDirection)r.t((o0)CompositionLocalsKt.k);
            final k1 k1 = (k1)r.t((o0)CompositionLocalsKt.o);
            ComposeUiNode.w2.getClass();
            final zg2.a b6 = ComposeUiNode$Companion.b;
            final ComposableLambdaImpl b7 = LayoutKt.b(f3);
            if (!(r.a instanceof z0.c)) {
                yl.a.B0();
                throw null;
            }
            r.h();
            if (r.K) {
                r.i(b6);
            }
            else {
                r.e();
            }
            r.x = false;
            Updater.b((z0.d)r, (Object)j, ComposeUiNode$Companion.e);
            Updater.b((z0.d)r, (Object)b5, ComposeUiNode$Companion.d);
            Updater.b((z0.d)r, (Object)layoutDirection, ComposeUiNode$Companion.f);
            b7.invoke((Object)a.m(r, k1, ComposeUiNode$Companion.g, r), (Object)r, (Object)0);
            r.A(2058660585);
            composableLambdaImpl.invoke((Object)r, (Object)0);
            r.R(false);
            r.R(true);
            r.R(false);
            n = n34;
        }
        final r0 u = r.U();
        if (u != null) {
            u.d = (zg2.p<? super z0.d, ? super Integer, j>)new BasicTextKt$BasicText$7(a, d3, p12, (l)c2, n, b, n2, (Map)map2, n4, n5);
        }
    }
    
    public static final void b(final String s, final d d, final p p10, final l<? super n, j> l, int n, boolean b, int n2, final z0.d d2, final int n3, final int n4) {
        f.f((Object)s, "text");
        final ComposerImpl r = d2.r(1022429478);
        int n5;
        if ((n4 & 0x1) != 0x0) {
            n5 = (n3 | 0x6);
        }
        else if ((n3 & 0xE) == 0x0) {
            int n6;
            if (r.l((Object)s)) {
                n6 = 4;
            }
            else {
                n6 = 2;
            }
            n5 = (n6 | n3);
        }
        else {
            n5 = n3;
        }
        final int n7 = n4 & 0x2;
        int n10 = 0;
        Label_0142: {
            int n8;
            if (n7 != 0) {
                n8 = (n5 | 0x30);
            }
            else {
                n8 = n5;
                if ((n3 & 0x70) == 0x0) {
                    int n9;
                    if (r.l((Object)d)) {
                        n9 = 32;
                    }
                    else {
                        n9 = 16;
                    }
                    n10 = (n5 | n9);
                    break Label_0142;
                }
            }
            n10 = n8;
        }
        final int n11 = n4 & 0x4;
        int n14 = 0;
        Label_0213: {
            int n12;
            if (n11 != 0) {
                n12 = (n10 | 0x180);
            }
            else {
                n12 = n10;
                if ((n3 & 0x380) == 0x0) {
                    int n13;
                    if (r.l((Object)p10)) {
                        n13 = 256;
                    }
                    else {
                        n13 = 128;
                    }
                    n14 = (n10 | n13);
                    break Label_0213;
                }
            }
            n14 = n12;
        }
        final int n15 = n4 & 0x8;
        int n18 = 0;
        Label_0285: {
            int n16;
            if (n15 != 0) {
                n16 = (n14 | 0xC00);
            }
            else {
                n16 = n14;
                if ((n3 & 0x1C00) == 0x0) {
                    int n17;
                    if (r.l((Object)l)) {
                        n17 = 2048;
                    }
                    else {
                        n17 = 1024;
                    }
                    n18 = (n14 | n17);
                    break Label_0285;
                }
            }
            n18 = n16;
        }
        l<? super n, j> i = l;
        final int n19 = n4 & 0x10;
        int n22 = 0;
        Label_0360: {
            int n20;
            if (n19 != 0) {
                n20 = (n18 | 0x6000);
            }
            else {
                n20 = n18;
                if ((0xE000 & n3) == 0x0) {
                    int n21;
                    if (r.p(n)) {
                        n21 = 16384;
                    }
                    else {
                        n21 = 8192;
                    }
                    n22 = (n18 | n21);
                    break Label_0360;
                }
            }
            n22 = n20;
        }
        final int n23 = n4 & 0x20;
        int n26 = 0;
        Label_0429: {
            int n24;
            if (n23 != 0) {
                n24 = (n22 | 0x30000);
            }
            else {
                n24 = n22;
                if ((0x70000 & n3) == 0x0) {
                    int n25;
                    if (r.m(b)) {
                        n25 = 131072;
                    }
                    else {
                        n25 = 65536;
                    }
                    n26 = (n22 | n25);
                    break Label_0429;
                }
            }
            n26 = n24;
        }
        final int n27 = n4 & 0x40;
        int n28;
        if (n27 != 0) {
            n28 = (n26 | 0x180000);
        }
        else {
            n28 = n26;
            if ((n3 & 0x380000) == 0x0) {
                int n29;
                if (r.p(n2)) {
                    n29 = 1048576;
                }
                else {
                    n29 = 524288;
                }
                n28 = (n26 | n29);
            }
        }
        p p11;
        d d3;
        if ((n28 & 0x2DB6DB) == 0x92492 && r.b()) {
            r.j();
            p11 = p10;
            d3 = d;
        }
        else {
            Object f = d;
            if (n7 != 0) {
                f = j1.d.a.f;
            }
            p c = p10;
            if (n11 != 0) {
                c = p.c;
            }
            Object instance = i;
            if (n15 != 0) {
                instance = BasicTextKt$BasicText$1.INSTANCE;
            }
            if (n19 != 0) {
                n = 1;
            }
            if (n23 != 0) {
                b = true;
            }
            if (n27 != 0) {
                n2 = Integer.MAX_VALUE;
            }
            if (n2 <= 0) {
                throw new IllegalArgumentException("maxLines should be greater than 0".toString());
            }
            final g g = (g)r.t((o0)SelectionRegistrarKt.a);
            final f1 e = CompositionLocalsKt.e;
            final b b2 = (b)r.t((o0)e);
            final n2.g.a a = (n2.g.a)r.t((o0)CompositionLocalsKt.h);
            final long longValue = ((Number)androidx.compose.runtime.saveable.b.a(new Object[] { s, g }, SaverKt.a((l)BasicTextKt$selectionIdSaver$2.INSTANCE, (zg2.p)new BasicTextKt$selectionIdSaver$1(g)), (zg2.a)new BasicTextKt$BasicText$selectableId$1(g), (z0.d)r, 4)).longValue();
            r.A(-492369756);
            Object c2 = r.c0();
            if (c2 == d$a.a) {
                c2 = new TextController(new TextState(new k(new a(6, s, (List)null), c, n2, b, n, b2, a, 128), longValue));
                r.I0(c2);
            }
            r.R(false);
            final TextController textController = (TextController)c2;
            final TextState f2 = textController.f;
            if (!r.K) {
                final k a2 = f2.a;
                final Pair<List<a$b<i2.j>>, List<a$b<q<String, z0.d, Integer, j>>>> a3 = CoreTextKt.a;
                ah2.f.f((Object)a2, "current");
                ah2.f.f((Object)c, "style");
                ah2.f.f((Object)b2, "density");
                ah2.f.f((Object)a, "fontFamilyResolver");
                k k = null;
                Label_0996: {
                    if (ah2.f.a((Object)a2.a.f, (Object)s) && ah2.f.a((Object)a2.b, (Object)c) && a2.d == b && a2.e == n && a2.c == n2 && ah2.f.a((Object)a2.f, (Object)b2)) {
                        k = a2;
                        if (a2.g == a) {
                            break Label_0996;
                        }
                    }
                    k = new k(new a(6, s, (List)null), c, n2, b, n, b2, a, 128);
                }
                textController.e(k);
            }
            f2.getClass();
            ah2.f.f(instance, "<set-?>");
            f2.c = (l<? super n, j>)instance;
            textController.f(g);
            r.A(959239573);
            if (g != null) {
                final long b3 = ((w0.l)r.t((o0)TextSelectionColorsKt.a)).b;
            }
            r.R(false);
            final d f3 = ((d)f).f0(textController.j.f0(textController.k).f0(textController.l));
            final TextController$measurePolicy$1 j = textController.i;
            r.A(544976794);
            final b b4 = (b)r.t((o0)e);
            final LayoutDirection layoutDirection = (LayoutDirection)r.t((o0)CompositionLocalsKt.k);
            final k1 k2 = (k1)r.t((o0)CompositionLocalsKt.o);
            final d c3 = ComposedModifierKt.c((z0.d)r, f3);
            ComposeUiNode.w2.getClass();
            final zg2.a b5 = ComposeUiNode$Companion.b;
            r.A(1405779621);
            if (!(r.a instanceof z0.c)) {
                yl.a.B0();
                throw null;
            }
            r.h();
            if (r.K) {
                r.i((zg2.a)new BasicTextKt$BasicText_BpD7jsM$$inlined$Layout$1(b5));
            }
            else {
                r.e();
            }
            r.x = false;
            Updater.b((z0.d)r, (Object)j, ComposeUiNode$Companion.e);
            Updater.b((z0.d)r, (Object)b4, ComposeUiNode$Companion.d);
            Updater.b((z0.d)r, (Object)layoutDirection, ComposeUiNode$Companion.f);
            Updater.b((z0.d)r, (Object)k2, ComposeUiNode$Companion.g);
            Updater.b((z0.d)r, (Object)c3, ComposeUiNode$Companion.c);
            r.o();
            r.R(true);
            r.R(false);
            r.R(false);
            d3 = (d)f;
            p11 = c;
            i = (l<? super n, j>)instance;
        }
        final r0 u = r.U();
        if (u != null) {
            u.d = (zg2.p<? super z0.d, ? super Integer, j>)new BasicTextKt$BasicText$3(s, d3, p11, (l)i, n, b, n2, n3, n4);
        }
    }
}

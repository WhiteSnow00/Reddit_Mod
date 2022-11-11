// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text;

import z0.f1;
import androidx.compose.ui.ComposedModifierKt;
import z0.r0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.h1;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Lambda;
import z0.d$a;
import androidx.compose.runtime.saveable.SaverKt;
import java.util.List;
import kotlin.Pair;
import rg2.q;
import java.util.ArrayList;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import n2.g$a;
import androidx.compose.ui.platform.CompositionLocalsKt;
import u2.b;
import z0.o0;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import w0.g;
import kotlin.collections.c;
import sg2.e;
import java.util.Map;
import hg2.j;
import i2.n;
import rg2.l;
import i2.p;
import j1.d;
import i2.a;

public final class BasicTextKt
{
    public static final void a(final a a, d f, p c, l<? super n, j> instance, int n, boolean b, int n2, Map<String, v0.a> v0, final z0.d d, final int n3, final int n4) {
        e.f((Object)a, "text");
        final ComposerImpl s = d.s(-648605928);
        int n5;
        if ((n4 & 0x1) != 0x0) {
            n5 = (n3 | 0x6);
        }
        else if ((n3 & 0xE) == 0x0) {
            int n6;
            if (s.m((Object)a)) {
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
        Label_0141: {
            int n8;
            if (n7 != 0) {
                n8 = (n5 | 0x30);
            }
            else {
                n8 = n5;
                if ((n3 & 0x70) == 0x0) {
                    int n9;
                    if (s.m((Object)f)) {
                        n9 = 32;
                    }
                    else {
                        n9 = 16;
                    }
                    n10 = (n5 | n9);
                    break Label_0141;
                }
            }
            n10 = n8;
        }
        final int n11 = n4 & 0x4;
        int n14 = 0;
        Label_0212: {
            int n12;
            if (n11 != 0) {
                n12 = (n10 | 0x180);
            }
            else {
                n12 = n10;
                if ((n3 & 0x380) == 0x0) {
                    int n13;
                    if (s.m((Object)c)) {
                        n13 = 256;
                    }
                    else {
                        n13 = 128;
                    }
                    n14 = (n10 | n13);
                    break Label_0212;
                }
            }
            n14 = n12;
        }
        final int n15 = n4 & 0x8;
        int n18 = 0;
        Label_0284: {
            int n16;
            if (n15 != 0) {
                n16 = (n14 | 0xC00);
            }
            else {
                n16 = n14;
                if ((n3 & 0x1C00) == 0x0) {
                    int n17;
                    if (s.m((Object)instance)) {
                        n17 = 2048;
                    }
                    else {
                        n17 = 1024;
                    }
                    n18 = (n14 | n17);
                    break Label_0284;
                }
            }
            n18 = n16;
        }
        final int n19 = n4 & 0x10;
        int n22 = 0;
        Label_0356: {
            int n20;
            if (n19 != 0) {
                n20 = (n18 | 0x6000);
            }
            else {
                n20 = n18;
                if ((0xE000 & n3) == 0x0) {
                    int n21;
                    if (s.q(n)) {
                        n21 = 16384;
                    }
                    else {
                        n21 = 8192;
                    }
                    n22 = (n18 | n21);
                    break Label_0356;
                }
            }
            n22 = n20;
        }
        final int n23 = n4 & 0x20;
        int n26 = 0;
        Label_0425: {
            int n24;
            if (n23 != 0) {
                n24 = (n22 | 0x30000);
            }
            else {
                n24 = n22;
                if ((0x70000 & n3) == 0x0) {
                    int n25;
                    if (s.n(b)) {
                        n25 = 131072;
                    }
                    else {
                        n25 = 65536;
                    }
                    n26 = (n22 | n25);
                    break Label_0425;
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
                if (s.q(n2)) {
                    n29 = 1048576;
                }
                else {
                    n29 = 524288;
                }
                n28 = (n26 | n29);
            }
        }
        final int n30 = n4 & 0x80;
        int n31 = n28;
        if (n30 != 0) {
            n31 = (n28 | 0x400000);
        }
        p p11;
        d d3;
        Object c2;
        Map map2;
        if (n30 == 128 && (0x16DB6DB & n31) == 0x492492 && s.c()) {
            s.k();
            final d d2 = f;
            p11 = c;
            final Map map = v0;
            d3 = d2;
            c2 = instance;
            map2 = map;
        }
        else {
            s.v0();
            int n33;
            p p12;
            Map map3;
            if ((n3 & 0x1) != 0x0 && !s.Y()) {
                s.k();
                int n32 = n31;
                if (n30 != 0) {
                    n32 = (n31 & 0xFE3FFFFF);
                }
                final d d4 = f;
                final BasicTextKt$BasicText$4 basicTextKt$BasicText$4 = instance;
                n33 = n;
                p12 = c;
                map3 = v0;
                n = n32;
                d3 = d4;
                c2 = basicTextKt$BasicText$4;
            }
            else {
                if (n7 != 0) {
                    f = (d)d.a.f;
                }
                if (n11 != 0) {
                    c = p.c;
                }
                if (n15 != 0) {
                    instance = BasicTextKt$BasicText$4.INSTANCE;
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
                if (n30 != 0) {
                    v0 = c.V0();
                    n31 &= 0xFE3FFFFF;
                }
                final d d5 = f;
                map3 = v0;
                final int n34 = n31;
                n33 = n;
                c2 = instance;
                p12 = c;
                d3 = d5;
                n = n34;
            }
            s.S();
            int i = 0;
            if (n2 <= 0) {
                throw new IllegalArgumentException("maxLines should be greater than 0".toString());
            }
            final g g = (g)s.u((o0)SelectionRegistrarKt.a);
            final b b2 = (b)s.u((o0)CompositionLocalsKt.e);
            final g$a g$a = (g$a)s.u((o0)CompositionLocalsKt.h);
            final long b3 = ((w0.l)s.u((o0)TextSelectionColorsKt.a)).b;
            final Pair<List<a.b<i2.j>>, List<a.b<q<String, z0.d, Integer, j>>>> a2 = CoreTextKt.a;
            e.f((Object)map3, "inlineContent");
            Pair a3;
            if (map3.isEmpty()) {
                a3 = CoreTextKt.a;
            }
            else {
                final ArrayList b4 = a.b(0, a.length(), "androidx.compose.foundation.text.inlineContent");
                final ArrayList<a.b<i2.j>> list = new ArrayList<a.b<i2.j>>();
                final ArrayList<a.b<q>> list2 = new ArrayList<a.b<q>>();
                while (i < b4.size()) {
                    final a.b b5 = (a.b)b4.get(i);
                    final v0.a a4 = map3.get(b5.a);
                    if (a4 != null) {
                        list.add(new a.b<i2.j>(a4.a, b5.b, b5.c));
                        list2.add(new a.b<q>(a4.b, b5.b, b5.c));
                    }
                    ++i;
                }
                a3 = new Pair((Object)list, (Object)list2);
            }
            final List list3 = (List)a3.component1();
            final List list4 = (List)a3.component2();
            final long longValue = ((Number)androidx.compose.runtime.saveable.b.a(new Object[] { a, g }, SaverKt.a((l)BasicTextKt$selectionIdSaver$2.INSTANCE, (rg2.p)new BasicTextKt$selectionIdSaver$1(g)), (rg2.a)new BasicTextKt$BasicText$selectableId$2(g), (z0.d)s, 4)).longValue();
            s.A(-492369756);
            Object c3 = s.c0();
            if (c3 == d$a.a) {
                c3 = new TextController(new TextState(new v0.j(a, p12, n2, b, n33, b2, g$a, list3), longValue));
                s.I0(c3);
            }
            s.R(false);
            final TextController textController = (TextController)c3;
            final TextState f2 = textController.f;
            if (!s.K) {
                textController.c(CoreTextKt.b(f2.a, a, p12, b2, g$a, b, n33, n2, list3));
            }
            f2.getClass();
            e.f(c2, "<set-?>");
            f2.c = (l<? super n, j>)c2;
            textController.f(g);
            ComposableLambdaImpl composableLambdaImpl;
            if (list4.isEmpty()) {
                composableLambdaImpl = ComposableSingletons$BasicTextKt.a;
            }
            else {
                composableLambdaImpl = aa1.a.R((z0.d)s, 1892283635, (Lambda)new BasicTextKt$BasicText$6(a, list4, n));
            }
            final d j0 = d3.j0(textController.j.j0(textController.k).j0(textController.l));
            final TextController$measurePolicy$1 k = textController.i;
            s.A(-1323940314);
            final b b6 = (b)s.u((o0)CompositionLocalsKt.e);
            final LayoutDirection layoutDirection = (LayoutDirection)s.u((o0)CompositionLocalsKt.k);
            final h1 h1 = (h1)s.u((o0)CompositionLocalsKt.o);
            ComposeUiNode.u2.getClass();
            final rg2.a b7 = ComposeUiNode$Companion.b;
            final ComposableLambdaImpl b8 = LayoutKt.b(j0);
            if (!(s.a instanceof z0.c)) {
                bg.d.k0();
                throw null;
            }
            s.j();
            if (s.K) {
                s.E(b7);
            }
            else {
                s.f();
            }
            s.x = false;
            Updater.b((z0.d)s, k, ComposeUiNode$Companion.e);
            Updater.b((z0.d)s, b6, ComposeUiNode$Companion.d);
            Updater.b((z0.d)s, layoutDirection, ComposeUiNode$Companion.f);
            b8.invoke((Object)d.v(s, h1, ComposeUiNode$Companion.g, s), (Object)s, (Object)0);
            s.A(2058660585);
            composableLambdaImpl.invoke((Object)s, (Object)0);
            s.R(false);
            s.R(true);
            s.R(false);
            n = n33;
            final p p13 = p12;
            map2 = map3;
            p11 = p13;
        }
        final r0 u = s.U();
        if (u != null) {
            u.d = (rg2.p)new BasicTextKt$BasicText$7(a, d3, p11, (l)c2, n, b, n2, map2, n3, n4);
        }
    }
    
    public static final void b(final String s, final d d, final p p10, final l<? super n, j> l, int n, boolean b, int n2, final z0.d d2, final int n3, final int n4) {
        e.f((Object)s, "text");
        final ComposerImpl s2 = d2.s(1022429478);
        int n5;
        if ((n4 & 0x1) != 0x0) {
            n5 = (n3 | 0x6);
        }
        else if ((n3 & 0xE) == 0x0) {
            int n6;
            if (s2.m((Object)s)) {
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
                    if (s2.m((Object)d)) {
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
        Label_0216: {
            int n12;
            if (n11 != 0) {
                n12 = (n10 | 0x180);
            }
            else {
                n12 = n10;
                if ((n3 & 0x380) == 0x0) {
                    int n13;
                    if (s2.m((Object)p10)) {
                        n13 = 256;
                    }
                    else {
                        n13 = 128;
                    }
                    n14 = (n10 | n13);
                    break Label_0216;
                }
            }
            n14 = n12;
        }
        p c = p10;
        final int n15 = n4 & 0x8;
        int n18 = 0;
        Label_0290: {
            int n16;
            if (n15 != 0) {
                n16 = (n14 | 0xC00);
            }
            else {
                n16 = n14;
                if ((n3 & 0x1C00) == 0x0) {
                    int n17;
                    if (s2.m((Object)l)) {
                        n17 = 2048;
                    }
                    else {
                        n17 = 1024;
                    }
                    n18 = (n14 | n17);
                    break Label_0290;
                }
            }
            n18 = n16;
        }
        Object instance = l;
        final int n19 = n4 & 0x10;
        int n22 = 0;
        Label_0364: {
            int n20;
            if (n19 != 0) {
                n20 = (n18 | 0x6000);
            }
            else {
                n20 = n18;
                if ((0xE000 & n3) == 0x0) {
                    int n21;
                    if (s2.q(n)) {
                        n21 = 16384;
                    }
                    else {
                        n21 = 8192;
                    }
                    n22 = (n18 | n21);
                    break Label_0364;
                }
            }
            n22 = n20;
        }
        final int n23 = n4 & 0x20;
        int n26 = 0;
        Label_0433: {
            int n24;
            if (n23 != 0) {
                n24 = (n22 | 0x30000);
            }
            else {
                n24 = n22;
                if ((0x70000 & n3) == 0x0) {
                    int n25;
                    if (s2.n(b)) {
                        n25 = 131072;
                    }
                    else {
                        n25 = 65536;
                    }
                    n26 = (n22 | n25);
                    break Label_0433;
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
                if (s2.q(n2)) {
                    n29 = 1048576;
                }
                else {
                    n29 = 524288;
                }
                n28 = (n26 | n29);
            }
        }
        Object f;
        if ((n28 & 0x2DB6DB) == 0x92492 && s2.c()) {
            s2.k();
            f = d;
        }
        else {
            f = d;
            if (n7 != 0) {
                f = j1.d.a.f;
            }
            if (n11 != 0) {
                c = p.c;
            }
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
            final g g = (g)s2.u((o0)SelectionRegistrarKt.a);
            final f1 e = CompositionLocalsKt.e;
            final b b2 = (b)s2.u((o0)e);
            final g$a g$a = (g$a)s2.u((o0)CompositionLocalsKt.h);
            final long longValue = ((Number)androidx.compose.runtime.saveable.b.a(new Object[] { s, g }, SaverKt.a((l)BasicTextKt$selectionIdSaver$2.INSTANCE, (rg2.p)new BasicTextKt$selectionIdSaver$1(g)), (rg2.a)new BasicTextKt$BasicText$selectableId$1(g), (z0.d)s2, 4)).longValue();
            s2.A(-492369756);
            Object c2 = s2.c0();
            if (c2 == d$a.a) {
                c2 = new TextController(new TextState(new v0.j(new a(6, s, null), c, n2, b, n, b2, g$a, 128), longValue));
                s2.I0(c2);
            }
            s2.R(false);
            final TextController textController = (TextController)c2;
            final TextState f2 = textController.f;
            if (!s2.K) {
                final v0.j a = f2.a;
                final Pair<List<a.b<i2.j>>, List<a.b<q<String, z0.d, Integer, j>>>> a2 = CoreTextKt.a;
                sg2.e.f((Object)a, "current");
                sg2.e.f((Object)c, "style");
                sg2.e.f((Object)b2, "density");
                sg2.e.f((Object)g$a, "fontFamilyResolver");
                v0.j j = null;
                Label_0994: {
                    if (sg2.e.a((Object)a.a.f, (Object)s) && sg2.e.a((Object)a.b, (Object)c) && a.d == b && a.e == n && a.c == n2 && sg2.e.a((Object)a.f, (Object)b2)) {
                        j = a;
                        if (a.g == g$a) {
                            break Label_0994;
                        }
                    }
                    j = new v0.j(new a(6, s, null), c, n2, b, n, b2, g$a, 128);
                }
                textController.c(j);
            }
            f2.getClass();
            sg2.e.f(instance, "<set-?>");
            f2.c = (l<? super n, j>)instance;
            textController.f(g);
            s2.A(959239573);
            if (g != null) {
                final long b3 = ((w0.l)s2.u((o0)TextSelectionColorsKt.a)).b;
            }
            s2.R(false);
            final d j2 = ((d)f).j0(textController.j.j0(textController.k).j0(textController.l));
            final TextController$measurePolicy$1 i = textController.i;
            s2.A(544976794);
            final b b4 = (b)s2.u((o0)e);
            final LayoutDirection layoutDirection = (LayoutDirection)s2.u((o0)CompositionLocalsKt.k);
            final h1 h1 = (h1)s2.u((o0)CompositionLocalsKt.o);
            final d c3 = ComposedModifierKt.c((z0.d)s2, j2);
            ComposeUiNode.u2.getClass();
            final rg2.a b5 = ComposeUiNode$Companion.b;
            s2.A(1405779621);
            if (!(s2.a instanceof z0.c)) {
                bg.d.k0();
                throw null;
            }
            s2.j();
            if (s2.K) {
                s2.E((rg2.a)new BasicTextKt$BasicText_BpD7jsM$$inlined$Layout$1(b5));
            }
            else {
                s2.f();
            }
            s2.x = false;
            Updater.b((z0.d)s2, i, ComposeUiNode$Companion.e);
            Updater.b((z0.d)s2, b4, ComposeUiNode$Companion.d);
            Updater.b((z0.d)s2, layoutDirection, ComposeUiNode$Companion.f);
            Updater.b((z0.d)s2, h1, ComposeUiNode$Companion.g);
            Updater.b((z0.d)s2, c3, ComposeUiNode$Companion.c);
            s2.p();
            s2.R(true);
            s2.R(false);
            s2.R(false);
        }
        final r0 u = s2.U();
        if (u != null) {
            u.d = (rg2.p)new BasicTextKt$BasicText$3(s, (d)f, c, (l)instance, n, b, n2, n3, n4);
        }
    }
}

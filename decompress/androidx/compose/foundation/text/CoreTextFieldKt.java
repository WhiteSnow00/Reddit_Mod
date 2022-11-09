// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import java.util.concurrent.atomic.AtomicReference;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import w0.i;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.k1;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager$b;
import mj2.b0;
import z0.d$a$a;
import z0.r0;
import androidx.compose.runtime.ComposerImpl;
import kotlin.jvm.internal.Lambda;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;
import kotlin.coroutines.EmptyCoroutineContext;
import androidx.compose.ui.platform.d1;
import androidx.compose.ui.platform.f0;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import v0.s;
import o2.w;
import eg.n0;
import i2.a$b;
import java.util.List;
import kotlin.collections.EmptyList;
import z0.q0;
import o2.x;
import i2.o;
import o1.k0;
import p2.c;
import i2.k;
import t2.e;
import i2.a$a;
import zg2.a;
import z0.d$a;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import u2.b;
import z0.o0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import o2.u;
import m1.m;
import o1.m0;
import o1.r;
import ah2.f;
import zg2.q;
import v0.g;
import i2.n;
import o2.y;
import i2.p;
import j1.d;
import pg2.j;
import zg2.l;
import androidx.compose.ui.text.input.TextFieldValue;

public final class CoreTextFieldKt
{
    public static final void a(final TextFieldValue value, final l<? super TextFieldValue, j> n, final d d, final p p19, final y y, l<? super n, j> instance, final o0.j j, o1.n n2, boolean b, int n3, final o2.j i, final g g, boolean b2, boolean b3, final q<? super zg2.p<? super z0.d, ? super Integer, j>, ? super z0.d, ? super Integer, j> q, final z0.d d2, final int n4, final int n5, final int n6) {
        f.f((Object)value, "value");
        f.f((Object)n, "onValueChange");
        final ComposerImpl r = d2.r(109313709);
        int n7;
        if ((n6 & 0x1) != 0x0) {
            n7 = (n4 | 0x6);
        }
        else if ((n4 & 0xE) == 0x0) {
            int n8;
            if (r.l((Object)value)) {
                n8 = 4;
            }
            else {
                n8 = 2;
            }
            n7 = (n8 | n4);
        }
        else {
            n7 = n4;
        }
        int n9;
        if ((n6 & 0x2) != 0x0) {
            n9 = (n7 | 0x30);
        }
        else {
            n9 = n7;
            if ((n4 & 0x70) == 0x0) {
                int n10;
                if (r.l((Object)n)) {
                    n10 = 32;
                }
                else {
                    n10 = 16;
                }
                n9 = (n7 | n10);
            }
        }
        final int n11 = n6 & 0x4;
        int n14 = 0;
        Label_0207: {
            int n12;
            if (n11 != 0) {
                n12 = (n9 | 0x180);
            }
            else {
                n12 = n9;
                if ((n4 & 0x380) == 0x0) {
                    int n13;
                    if (r.l((Object)d)) {
                        n13 = 256;
                    }
                    else {
                        n13 = 128;
                    }
                    n14 = (n9 | n13);
                    break Label_0207;
                }
            }
            n14 = n12;
        }
        final int n15 = n6 & 0x8;
        int n18 = 0;
        Label_0279: {
            int n16;
            if (n15 != 0) {
                n16 = (n14 | 0xC00);
            }
            else {
                n16 = n14;
                if ((n4 & 0x1C00) == 0x0) {
                    int n17;
                    if (r.l((Object)p19)) {
                        n17 = 2048;
                    }
                    else {
                        n17 = 1024;
                    }
                    n18 = (n14 | n17);
                    break Label_0279;
                }
            }
            n18 = n16;
        }
        final int n19 = n6 & 0x10;
        final int n20 = 16384;
        int n21;
        if (n19 != 0) {
            n21 = (n18 | 0x6000);
        }
        else {
            n21 = n18;
            if ((n4 & 0xE000) == 0x0) {
                int n22;
                if (r.l((Object)y)) {
                    n22 = 16384;
                }
                else {
                    n22 = 8192;
                }
                n21 = (n18 | n22);
            }
        }
        final int n23 = n6 & 0x20;
        int n24;
        if (n23 != 0) {
            n24 = (n21 | 0x30000);
        }
        else {
            n24 = n21;
            if ((n4 & 0x70000) == 0x0) {
                int n25;
                if (r.l((Object)instance)) {
                    n25 = 131072;
                }
                else {
                    n25 = 65536;
                }
                n24 = (n21 | n25);
            }
        }
        final int n26 = n6 & 0x40;
        int n27;
        if (n26 != 0) {
            n27 = (n24 | 0x180000);
        }
        else {
            n27 = n24;
            if ((n4 & 0x380000) == 0x0) {
                int n28;
                if (r.l((Object)j)) {
                    n28 = 1048576;
                }
                else {
                    n28 = 524288;
                }
                n27 = (n24 | n28);
            }
        }
        if ((n4 & 0x1C00000) == 0x0) {
            int n29;
            if ((n6 & 0x80) == 0x0 && r.l((Object)n2)) {
                n29 = 8388608;
            }
            else {
                n29 = 4194304;
            }
            n27 |= n29;
        }
        final int n30 = n6 & 0x100;
        int n31;
        if (n30 != 0) {
            n31 = (n27 | 0x6000000);
        }
        else {
            n31 = n27;
            if ((n4 & 0xE000000) == 0x0) {
                int n32;
                if (r.m(b)) {
                    n32 = 67108864;
                }
                else {
                    n32 = 33554432;
                }
                n31 = (n27 | n32);
            }
        }
        final int n33 = n6 & 0x200;
        int n34;
        if (n33 != 0) {
            n34 = (n31 | 0x30000000);
        }
        else {
            n34 = n31;
            if ((n4 & 0x70000000) == 0x0) {
                int n35;
                if (r.p(n3)) {
                    n35 = 536870912;
                }
                else {
                    n35 = 268435456;
                }
                n34 = (n31 | n35);
            }
        }
        int n37;
        if ((n5 & 0xE) == 0x0) {
            int n36;
            if ((n6 & 0x400) == 0x0 && r.l((Object)i)) {
                n36 = 4;
            }
            else {
                n36 = 2;
            }
            n37 = (n5 | n36);
        }
        else {
            n37 = n5;
        }
        final int n38 = n6 & 0x800;
        int n39;
        if (n38 != 0) {
            n39 = (n37 | 0x30);
        }
        else {
            n39 = n37;
            if ((n5 & 0x70) == 0x0) {
                int n40;
                if (r.l((Object)g)) {
                    n40 = 32;
                }
                else {
                    n40 = 16;
                }
                n39 = (n37 | n40);
            }
        }
        final int n41 = n39;
        final int n42 = n6 & 0x1000;
        int n43;
        if (n42 != 0) {
            n43 = (n41 | 0x180);
        }
        else {
            n43 = n41;
            if ((n5 & 0x380) == 0x0) {
                int n44;
                if (r.m(b2)) {
                    n44 = 256;
                }
                else {
                    n44 = 128;
                }
                n43 = (n41 | n44);
            }
        }
        final int n45 = n6 & 0x2000;
        int n46;
        if (n45 != 0) {
            n46 = (n43 | 0xC00);
        }
        else {
            n46 = n43;
            if ((n5 & 0x1C00) == 0x0) {
                int n47;
                if (r.m(b3)) {
                    n47 = 2048;
                }
                else {
                    n47 = 1024;
                }
                n46 = (n43 | n47);
            }
        }
        final int n48 = n6 & 0x4000;
        int n49;
        if (n48 != 0) {
            n49 = (n46 | 0x6000);
        }
        else {
            n49 = n46;
            if ((n5 & 0xE000) == 0x0) {
                int n50;
                if (r.l((Object)q)) {
                    n50 = n20;
                }
                else {
                    n50 = 8192;
                }
                n49 = (n46 | n50);
            }
        }
        p p20;
        o0.j k;
        g g2;
        Object a;
        d d3;
        y f;
        Object o;
        o1.n n52;
        boolean b5;
        o2.j l;
        boolean b6;
        if ((n34 & 0x5B6DB6DB) == 0x12492492 && (0xB6DB & n49) == 0x2492 && r.b()) {
            r.j();
            p20 = p19;
            final CoreTextFieldKt$CoreTextField$1 coreTextFieldKt$CoreTextField$1 = instance;
            k = j;
            final o1.n n51 = n2;
            g2 = g;
            final boolean b4 = b2;
            a = q;
            d3 = d;
            f = y;
            o = coreTextFieldKt$CoreTextField$1;
            n52 = n51;
            b5 = b;
            l = i;
            b6 = b4;
        }
        else {
            r.v0();
            o0.j j2;
            o1.n n53;
            o2.j j3;
            g a2;
            p p21;
            if ((n4 & 0x1) != 0x0 && !r.Y()) {
                r.j();
                if ((n6 & 0x400) != 0x0) {
                    final l m = (l)instance;
                    j2 = j;
                    n53 = n2;
                    final boolean b7 = b;
                    j3 = i;
                    a2 = g;
                    b6 = b2;
                    a = q;
                    n49 &= 0xFFFFFFF1;
                    f = y;
                    p21 = p19;
                    d3 = d;
                    o = m;
                    b5 = b7;
                }
                else {
                    final l l2 = (l)instance;
                    j2 = j;
                    n53 = n2;
                    final boolean b8 = b;
                    j3 = i;
                    a2 = g;
                    b6 = b2;
                    a = q;
                    f = y;
                    p21 = p19;
                    d3 = d;
                    o = l2;
                    b5 = b8;
                }
            }
            else {
                Object f2;
                if (n11 != 0) {
                    f2 = j1.d.a.f;
                }
                else {
                    f2 = d;
                }
                p c;
                if (n15 != 0) {
                    c = p.c;
                }
                else {
                    c = p19;
                }
                Object a3;
                if (n19 != 0) {
                    a3 = o2.y.a.a;
                }
                else {
                    a3 = y;
                }
                if (n23 != 0) {
                    instance = CoreTextFieldKt$CoreTextField$1.INSTANCE;
                }
                o0.j j4;
                if (n26 != 0) {
                    j4 = null;
                }
                else {
                    j4 = j;
                }
                if ((n6 & 0x80) != 0x0) {
                    n2 = new m0(o1.r.l);
                }
                if (n30 != 0) {
                    b = true;
                }
                if (n33 != 0) {
                    n3 = Integer.MAX_VALUE;
                }
                o2.j f3;
                if ((n6 & 0x400) != 0x0) {
                    f3 = o2.j.f;
                    n49 &= 0xFFFFFFF1;
                }
                else {
                    f3 = i;
                }
                g g3;
                if (n38 != 0) {
                    g3 = g.g;
                }
                else {
                    g3 = g;
                }
                if (n42 != 0) {
                    b2 = true;
                }
                if (n45 != 0) {
                    b3 = false;
                }
                if (n48 != 0) {
                    a = ComposableSingletons$CoreTextFieldKt.a;
                }
                else {
                    a = q;
                }
                final boolean b9 = b;
                final l l3 = (l)instance;
                n53 = n2;
                final p p22 = c;
                a2 = g3;
                final o2.j j5 = f3;
                b6 = b2;
                b5 = b9;
                o = l3;
                d3 = (d)f2;
                p21 = p22;
                f = (y)a3;
                j2 = j4;
                j3 = j5;
            }
            r.S();
            final m j6 = new m();
            r.A(-55013392);
            u u;
            if (b6 && !b3) {
                u = (u)r.t((o0)CompositionLocalsKt.l);
            }
            else {
                u = null;
            }
            r.R(false);
            final b b10 = (b)r.t((o0)CompositionLocalsKt.e);
            final n2.g.a a4 = (n2.g.a)r.t((o0)CompositionLocalsKt.h);
            final long b11 = ((w0.l)r.t((o0)TextSelectionColorsKt.a)).b;
            final m1.d b12 = (m1.d)r.t((o0)CompositionLocalsKt.f);
            Orientation orientation;
            if (n3 == 1 && !b5 && j3.a) {
                orientation = Orientation.Horizontal;
            }
            else {
                orientation = Orientation.Vertical;
            }
            final h1.e f4 = TextFieldScrollerPosition.f;
            r.A(1157296644);
            final boolean l4 = r.l((Object)orientation);
            final Object c2 = r.c0();
            Object o2;
            if (l4 || (o2 = c2) == d$a.a) {
                o2 = new CoreTextFieldKt$CoreTextField$scrollerPosition$1$1(orientation);
                r.I0(o2);
            }
            r.R(false);
            final TextFieldScrollerPosition textFieldScrollerPosition = (TextFieldScrollerPosition)androidx.compose.runtime.saveable.b.a(new Object[] { orientation }, f4, (a)o2, (z0.d)r, 4);
            r.A(511388516);
            final boolean l5 = r.l((Object)value);
            final boolean l6 = r.l((Object)f);
            Object o3 = r.c0();
            if ((l5 | l6) || o3 == d$a.a) {
                o3 = f.a(value.a);
                final o c3 = value.c;
                if (c3 != null) {
                    final long a5 = c3.a;
                    ah2.f.f(o3, "transformed");
                    final a$a a$a = new a$a(((x)o3).a);
                    final k k2 = new k(0L, 0L, (n2.m)null, (n2.k)null, (n2.l)null, (n2.g)null, (String)null, 0L, (t2.a)null, (t2.g)null, (c)null, 0L, e.c, (k0)null, 12287);
                    final o2.m b13 = ((x)o3).b;
                    final int c4 = i2.o.c;
                    a$a.b(k2, b13.b((int)(a5 >> 32)), ((x)o3).b.b(i2.o.c(a5)));
                    o3 = new x(a$a.i(), ((x)o3).b);
                }
                r.I0(o3);
            }
            r.R(false);
            final x x = (x)o3;
            final i2.a a6 = x.a;
            final o2.m b14 = x.b;
            final r0 x2 = r.X();
            if (x2 == null) {
                throw new IllegalStateException("no recompose scope found".toString());
            }
            r.d((q0)x2);
            r.A(-492369756);
            final Object c5 = r.c0();
            final d$a$a a7 = d$a.a;
            TextFieldState textFieldState;
            if ((textFieldState = (TextFieldState)c5) == a7) {
                textFieldState = new TextFieldState(new v0.k(a6, p21, 0, b5, 0, b10, a4, 148), x2);
                r.I0((Object)textFieldState);
            }
            r.R(false);
            final TextFieldState d4 = textFieldState;
            d4.getClass();
            ah2.f.f((Object)a6, "visualText");
            ah2.f.f((Object)p21, "textStyle");
            ah2.f.f((Object)b10, "density");
            ah2.f.f((Object)a4, "fontFamilyResolver");
            ah2.f.f((Object)a2, "keyboardActions");
            ah2.f.f((Object)b12, "focusManager");
            d4.n = n;
            d4.q.c(b11);
            final v0.e m2 = d4.m;
            m2.getClass();
            m2.a = a2;
            m2.b = b12;
            d4.a = CoreTextKt.b(d4.a, a6, p21, b10, a4, b5, 1, Integer.MAX_VALUE, (List<a$b<i2.j>>)EmptyList.INSTANCE);
            final o2.e c6 = d4.c;
            final w d5 = d4.d;
            c6.getClass();
            final o c7 = value.c;
            final o2.f b15 = c6.b;
            final int d6 = b15.d;
            Object o4;
            if (d6 != -1) {
                o4 = new o(n0.j(d6, b15.e));
            }
            else {
                o4 = null;
            }
            final boolean a8 = ah2.f.a((Object)c7, o4);
            boolean b16 = false;
            boolean b17 = false;
            Label_2411: {
                if (!ah2.f.a((Object)c6.a.a, (Object)value.a)) {
                    c6.b = new o2.f(value.a, value.b);
                    b16 = true;
                }
                else {
                    if (!i2.o.a(c6.a.b, value.b)) {
                        c6.b.f(i2.o.f(value.b), i2.o.e(value.b));
                        b17 = true;
                        b16 = false;
                        break Label_2411;
                    }
                    b16 = false;
                }
                b17 = false;
            }
            final o c8 = value.c;
            if (c8 == null) {
                final o2.f b18 = c6.b;
                b18.d = -1;
                b18.e = -1;
            }
            else if (!i2.o.b(c8.a)) {
                c6.b.e(i2.o.f(value.c.a), i2.o.e(value.c.a));
            }
            p20 = p21;
            TextFieldValue a9;
            if (!b16 && (b17 || !(a8 ^ true))) {
                a9 = value;
            }
            else {
                final o2.f b19 = c6.b;
                b19.d = -1;
                b19.e = -1;
                a9 = TextFieldValue.a(value, null, 0L, 3);
            }
            final TextFieldValue a10 = c6.a;
            c6.a = a9;
            if (d5 != null && ah2.f.a((Object)d5.a.b.get(), (Object)d5)) {
                d5.b.b(a10, a9);
            }
            r.A(-492369756);
            Object c9 = r.c0();
            if (c9 == a7) {
                c9 = new s(0);
                r.I0(c9);
            }
            r.R(false);
            final s s = (s)c9;
            final long currentTimeMillis = System.currentTimeMillis();
            s.getClass();
            Label_2727: {
                if (!s.f) {
                    final Long e = s.e;
                    long longValue;
                    if (e != null) {
                        longValue = e;
                    }
                    else {
                        longValue = 0L;
                    }
                    if (currentTimeMillis <= longValue + 5000) {
                        break Label_2727;
                    }
                }
                s.e = currentTimeMillis;
                s.a(value);
            }
            r.A(-492369756);
            Object c10;
            if ((c10 = r.c0()) == a7) {
                c10 = new TextFieldSelectionManager(s);
                r.I0(c10);
            }
            r.R(false);
            final TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager)c10;
            textFieldSelectionManager.getClass();
            ah2.f.f((Object)b14, "<set-?>");
            textFieldSelectionManager.b = b14;
            ah2.f.f((Object)f, "<set-?>");
            textFieldSelectionManager.f = f;
            final l<TextFieldValue, j> o5 = d4.o;
            ah2.f.f((Object)o5, "<set-?>");
            textFieldSelectionManager.c = o5;
            textFieldSelectionManager.d = d4;
            ((SnapshotMutableStateImpl<TextFieldValue>)textFieldSelectionManager.e).setValue(value);
            textFieldSelectionManager.g = (f0)r.t((o0)CompositionLocalsKt.d);
            textFieldSelectionManager.h = (d1)r.t((o0)CompositionLocalsKt.m);
            textFieldSelectionManager.i = (u1.a)r.t((o0)CompositionLocalsKt.i);
            textFieldSelectionManager.j = j6;
            final boolean b20 = b3 ^ true;
            ((SnapshotMutableStateImpl<Boolean>)textFieldSelectionManager.k).setValue(Boolean.valueOf(b20));
            r.A(773894976);
            r.A(-492369756);
            Object o6;
            if ((o6 = r.c0()) == a7) {
                o6 = d.s(z0.s.i(EmptyCoroutineContext.INSTANCE, (z0.d)r), r);
            }
            r.R(false);
            final b0 f5 = ((z0.l)o6).f;
            r.R(false);
            r.A(-492369756);
            Object c11;
            if ((c11 = r.c0()) == a7) {
                c11 = new BringIntoViewRequesterImpl();
                r.I0(c11);
            }
            r.R(false);
            final t0.d d7 = (t0.d)c11;
            Object o7 = j1.d.a.f;
            final d b21 = androidx.compose.foundation.d.b(j2, FocusChangedModifierKt.a(FocusRequesterModifierKt.a((d)o7, j6), (l)new CoreTextFieldKt$CoreTextField$focusModifier$1(d4, u, value, j3, textFieldSelectionManager, f5, d7, b14)), b6);
            z0.s.c(d4, (l)new CoreTextFieldKt$CoreTextField$2(d4), (z0.d)r);
            final TextFieldSelectionManager$b r2 = textFieldSelectionManager.r;
            ah2.f.f((Object)r2, "observer");
            d b22;
            if (b6) {
                b22 = SuspendingPointerInputFilterKt.b((d)o7, (Object)r2, (zg2.p)new TextFieldGestureModifiersKt$longPressDragGestureFilter$1((v0.l)r2, null));
            }
            else {
                b22 = (d)o7;
            }
            final CoreTextFieldKt$CoreTextField$pointerModifier$1 coreTextFieldKt$CoreTextField$pointerModifier$1 = new CoreTextFieldKt$CoreTextField$pointerModifier$1(d4, j6, b3, textFieldSelectionManager, b14);
            d b23;
            if (b6) {
                b23 = ComposedModifierKt.b((d)o7, (q)new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1((l<? super n1.c, j>)coreTextFieldKt$CoreTextField$pointerModifier$1, j2));
            }
            else {
                b23 = (d)o7;
            }
            final d f6 = b23.f0(b22);
            final d a11 = DrawModifierKt.a((d)o7, (l)new CoreTextFieldKt$CoreTextField$drawModifier$1(d4, value, b14));
            final d n54 = at1.a.n1((d)o7, (l)new CoreTextFieldKt$CoreTextField$onPositionedModifier$1(d4, b6, textFieldSelectionManager));
            final d b24 = SemanticsModifierKt.b((d)o7, true, (l<? super h2.q, j>)new CoreTextFieldKt$CoreTextField$semanticsModifier$1(j3, x, value, b6, f instanceof o2.o, b3, d4, b14, textFieldSelectionManager, j6));
            final boolean b25 = b6 && !b3;
            final float a12 = v0.m.a;
            ah2.f.f((Object)n53, "cursorBrush");
            d b26;
            if (b25) {
                b26 = ComposedModifierKt.b((d)o7, (q)new TextFieldCursorKt$cursor$1(n53, d4, value, b14));
            }
            else {
                b26 = (d)o7;
            }
            z0.s.c(textFieldSelectionManager, (l)new CoreTextFieldKt$CoreTextField$3(textFieldSelectionManager), (z0.d)r);
            z0.s.c(j3, (l)new CoreTextFieldKt$CoreTextField$4(u, d4, value, j3), (z0.d)r);
            final l<TextFieldValue, j> o8 = d4.o;
            boolean b27 = true;
            if (n3 != 1) {
                b27 = false;
            }
            ah2.f.f((Object)o8, "onValueChange");
            final d b28 = ComposedModifierKt.b((d)o7, (q)new TextFieldKeyInputKt$textFieldKeyInput$2(d4, textFieldSelectionManager, value, b20, b27, b14, s, o8));
            final d f7 = d3.f0(b21);
            final CoreTextFieldKt$previewKeyEventToDeselectOnBack$1 coreTextFieldKt$previewKeyEventToDeselectOnBack$1 = new CoreTextFieldKt$previewKeyEventToDeselectOnBack$1(d4, textFieldSelectionManager);
            final d2.e a13 = KeyInputModifierKt.a;
            ah2.f.f((Object)f7, "<this>");
            final l a14 = InspectableValueKt.a;
            final d f8 = InspectableValueKt.a(f7, a14, (d)new x1.d(null, (l<? super x1.b, Boolean>)coreTextFieldKt$previewKeyEventToDeselectOnBack$1)).f0(b28);
            ah2.f.f((Object)f8, "<this>");
            ah2.f.f((Object)textFieldScrollerPosition, "scrollerPosition");
            final d n55 = at1.a.n1(ComposedModifierKt.a(f8, a14, (q)new TextFieldScrollKt$textFieldScrollable$2(textFieldScrollerPosition, b6, j2)).f0(f6).f0(b24), (l)new CoreTextFieldKt$CoreTextField$decorationBoxModifier$1(d4));
            final boolean b29 = b6 && d4.b();
            if (b29) {
                o7 = androidx.compose.foundation.text.selection.c.a(textFieldSelectionManager);
            }
            final CoreTextFieldKt$CoreTextField$5 coreTextFieldKt$CoreTextField$2 = new CoreTextFieldKt$CoreTextField$5((q)a, n49, n3, p20, textFieldScrollerPosition, value, f, b26, a11, n54, (d)o7, d7, d4, textFieldSelectionManager, b29, b3, (l)o);
            final z0.d d8 = (z0.d)r;
            b(n55, textFieldSelectionManager, (zg2.p<? super z0.d, ? super Integer, j>)at1.a.a0(d8, -1885146845, (Lambda)coreTextFieldKt$CoreTextField$2), d8, 448);
            final o1.n n56 = n53;
            final o0.j j7 = j2;
            g2 = a2;
            l = j3;
            n52 = n56;
            k = j7;
        }
        final r0 u2 = r.U();
        if (u2 != null) {
            u2.d = (zg2.p<? super z0.d, ? super Integer, j>)new CoreTextFieldKt$CoreTextField$6(value, (l)n, d3, p20, f, (l)o, k, n52, b5, n3, l, g2, b6, b3, (q)a, n4, n5, n6);
        }
    }
    
    public static final void b(final d d, final TextFieldSelectionManager textFieldSelectionManager, final zg2.p<? super z0.d, ? super Integer, j> p5, final z0.d d2, final int n) {
        final ComposerImpl r = d2.r(-20551815);
        final int n2 = (n & 0xE) | 0x180;
        r.A(733328855);
        final c2.s c = BoxKt.c((j1.a)j1.a$a.a, true, (z0.d)r);
        r.A(-1323940314);
        final b b = (b)r.t((o0)CompositionLocalsKt.e);
        final LayoutDirection layoutDirection = (LayoutDirection)r.t((o0)CompositionLocalsKt.k);
        final k1 k1 = (k1)r.t((o0)CompositionLocalsKt.o);
        ComposeUiNode.w2.getClass();
        final a b2 = ComposeUiNode$Companion.b;
        final ComposableLambdaImpl b3 = LayoutKt.b(d);
        final int n3 = ((n2 << 3 & 0x70) << 9 & 0x1C00) | 0x6;
        if (r.a instanceof z0.c) {
            r.h();
            if (r.K) {
                r.i(b2);
            }
            else {
                r.e();
            }
            r.x = false;
            Updater.b((z0.d)r, (Object)c, ComposeUiNode$Companion.e);
            Updater.b((z0.d)r, (Object)b, ComposeUiNode$Companion.d);
            Updater.b((z0.d)r, (Object)layoutDirection, ComposeUiNode$Companion.f);
            a40.f.v(n3 >> 3 & 0x70, b3, a.m(r, k1, ComposeUiNode$Companion.g, r), r, 2058660585);
            r.A(-2137368960);
            if ((n3 >> 9 & 0xE & 0xB) == 0x2 && r.b()) {
                r.j();
            }
            else {
                r.A(1524757375);
                if ((((n2 >> 6 & 0x70) | 0x6) & 0x51) == 0x10 && r.b()) {
                    r.j();
                }
                else {
                    ContextMenu_androidKt.a(textFieldSelectionManager, p5, (z0.d)r, (n >> 3 & 0x70) | 0x8);
                }
                r.R(false);
            }
            d.x(r, false, false, true, false);
            r.R(false);
            final r0 u = r.U();
            if (u != null) {
                u.d = (zg2.p<? super z0.d, ? super Integer, j>)new CoreTextFieldKt$CoreTextFieldRootBox$2(d, textFieldSelectionManager, (zg2.p)p5, n);
            }
            return;
        }
        yl.a.B0();
        throw null;
    }
    
    public static final void c(final TextFieldSelectionManager textFieldSelectionManager, final z0.d d, final int n) {
        f.f((Object)textFieldSelectionManager, "manager");
        final ComposerImpl r = d.r(-1436003720);
        final TextFieldState d2 = textFieldSelectionManager.d;
        boolean b = true;
        if (d2 == null || !(boolean)((SnapshotMutableStateImpl<Object>)d2.l).getValue()) {
            b = false;
        }
        if (b) {
            r.A(1157296644);
            final boolean l = r.l((Object)textFieldSelectionManager);
            final Object c0 = r.c0();
            Object o;
            if (l || (o = c0) == d$a.a) {
                o = new i(textFieldSelectionManager);
                r.I0(o);
            }
            r.R(false);
            final v0.l i = (v0.l)o;
            final b b2 = (b)r.t((o0)CompositionLocalsKt.e);
            f.f((Object)b2, "density");
            final o2.m b3 = textFieldSelectionManager.b;
            final long b4 = textFieldSelectionManager.j().b;
            final int c2 = i2.o.c;
            final int b5 = b3.b((int)(b4 >> 32));
            final TextFieldState d3 = textFieldSelectionManager.d;
            v0.r c3;
            if (d3 != null) {
                c3 = d3.c();
            }
            else {
                c3 = null;
            }
            f.c((Object)c3);
            final n a = c3.a;
            final n1.d c4 = a.c(yl.a.K(b5, 0, a.a.a.length()));
            final long y0 = yd.a.y0(b2.M0(v0.m.a) / 2 + c4.a, c4.d);
            final d b6 = SuspendingPointerInputFilterKt.b((d)j1.d.a.f, (Object)i, (zg2.p)new CoreTextFieldKt$TextFieldCursorHandle.CoreTextFieldKt$TextFieldCursorHandle$1(i, (tg2.c)null));
            final n1.c c5 = new n1.c(y0);
            r.A(1157296644);
            final boolean j = r.l((Object)c5);
            final Object c6 = r.c0();
            Object o2;
            if (j || (o2 = c6) == d$a.a) {
                o2 = new CoreTextFieldKt$TextFieldCursorHandle$2$1(y0);
                r.I0(o2);
            }
            r.R(false);
            AndroidCursorHandle_androidKt.a(y0, SemanticsModifierKt.b(b6, false, (l<? super h2.q, j>)o2), null, (z0.d)r, 384);
        }
        final r0 u = r.U();
        if (u != null) {
            u.d = (zg2.p<? super z0.d, ? super Integer, j>)new CoreTextFieldKt$TextFieldCursorHandle$3(textFieldSelectionManager, n);
        }
    }
    
    public static final void d(final TextFieldSelectionManager textFieldSelectionManager, final boolean b, final z0.d d, final int n) {
        final ComposerImpl r = d.r(626339208);
        if (b) {
            final TextFieldState d2 = textFieldSelectionManager.d;
            n a = null;
            Label_0043: {
                if (d2 != null) {
                    final v0.r c = d2.c();
                    if (c != null) {
                        a = c.a;
                        break Label_0043;
                    }
                }
                a = null;
            }
            if (a != null) {
                if (!o.b(textFieldSelectionManager.j().b)) {
                    final int b2 = textFieldSelectionManager.b.b((int)(textFieldSelectionManager.j().b >> 32));
                    final int b3 = textFieldSelectionManager.b.b(o.c(textFieldSelectionManager.j().b));
                    final ResolvedTextDirection a2 = a.a(b2);
                    final ResolvedTextDirection a3 = a.a(Math.max(b3 - 1, 0));
                    r.A(-498396421);
                    final TextFieldState d3 = textFieldSelectionManager.d;
                    if (d3 != null && (boolean)((SnapshotMutableStateImpl<Object>)d3.j).getValue()) {
                        TextFieldSelectionManagerKt.a(true, a2, textFieldSelectionManager, (z0.d)r, 518);
                    }
                    r.R(false);
                    final TextFieldState d4 = textFieldSelectionManager.d;
                    if (d4 != null && (boolean)((SnapshotMutableStateImpl<Object>)d4.k).getValue()) {
                        TextFieldSelectionManagerKt.a(false, a3, textFieldSelectionManager, (z0.d)r, 518);
                    }
                }
                final TextFieldState d5 = textFieldSelectionManager.d;
                if (d5 != null) {
                    if (f.a((Object)textFieldSelectionManager.q.a.f, (Object)textFieldSelectionManager.j().a.f) ^ true) {
                        d5.i = false;
                    }
                    if (d5.b()) {
                        if (d5.i) {
                            textFieldSelectionManager.n();
                        }
                        else {
                            textFieldSelectionManager.k();
                        }
                    }
                }
            }
        }
        else {
            textFieldSelectionManager.k();
        }
        final r0 u = r.U();
        if (u != null) {
            u.d = (zg2.p<? super z0.d, ? super Integer, j>)new CoreTextFieldKt$SelectionToolbarAndHandles$2(textFieldSelectionManager, b, n);
        }
    }
    
    public static final void e(final TextFieldState textFieldState) {
        final w d = textFieldState.d;
        Label_0104: {
            if (d != null) {
                final o2.e c = textFieldState.c;
                final l<TextFieldValue, j> o = textFieldState.o;
                f.f((Object)c, "editProcessor");
                f.f((Object)o, "onValueChange");
                o.invoke((Object)TextFieldValue.a(c.a, null, 0L, 3));
                final u a = d.a;
                a.getClass();
                final AtomicReference<w> b = a.b;
                while (true) {
                    while (!b.compareAndSet(d, null)) {
                        if (b.get() != d) {
                            final boolean b2 = false;
                            if (b2) {
                                a.a.a();
                            }
                            break Label_0104;
                        }
                    }
                    final boolean b2 = true;
                    continue;
                }
            }
        }
        textFieldState.d = null;
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import java.util.concurrent.atomic.AtomicReference;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import lg.e0;
import w0.i;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.h1;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.foundation.layout.BoxKt;
import j1.a$a;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager$b;
import ej2.b0;
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
import z0.s;
import kotlin.coroutines.EmptyCoroutineContext;
import androidx.compose.ui.platform.b1;
import androidx.compose.ui.platform.d0;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import o2.w;
import java.util.List;
import kotlin.collections.EmptyList;
import z0.q0;
import o2.x;
import i2.o;
import o1.k0;
import p2.c;
import n2.g;
import i2.k;
import rg2.a;
import z0.d$a;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import n2.g$a;
import u2.b;
import z0.o0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import o2.u;
import m1.m;
import o1.m0;
import o1.r;
import sg2.e;
import rg2.q;
import v0.f;
import i2.n;
import o2.y;
import i2.p;
import j1.d;
import hg2.j;
import rg2.l;
import androidx.compose.ui.text.input.TextFieldValue;

public final class CoreTextFieldKt
{
    public static final void a(final TextFieldValue value, final l<? super TextFieldValue, j> n, final d d, final p p19, final y y, l<? super n, j> instance, final o0.j j, final o1.n n2, boolean b, int n3, o2.j i, final f f, boolean b2, boolean b3, final q<? super rg2.p<? super z0.d, ? super Integer, j>, ? super z0.d, ? super Integer, j> q, final z0.d d2, final int n4, final int n5, final int n6) {
        e.f((Object)value, "value");
        e.f((Object)n, "onValueChange");
        final ComposerImpl s = d2.s(109313709);
        int n7;
        if ((n6 & 0x1) != 0x0) {
            n7 = (n4 | 0x6);
        }
        else if ((n4 & 0xE) == 0x0) {
            int n8;
            if (s.m((Object)value)) {
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
                if (s.m((Object)n)) {
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
                    if (s.m((Object)d)) {
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
                    if (s.m((Object)p19)) {
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
                if (s.m((Object)y)) {
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
                if (s.m((Object)instance)) {
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
                if (s.m((Object)j)) {
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
            if ((n6 & 0x80) == 0x0 && s.m((Object)n2)) {
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
                if (s.n(b)) {
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
                if (s.q(n3)) {
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
            if ((n6 & 0x400) == 0x0 && s.m((Object)i)) {
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
                if (s.m((Object)f)) {
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
                if (s.n(b2)) {
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
                if (s.n(b3)) {
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
                if (s.m((Object)q)) {
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
        o1.n n51;
        f a;
        d d3;
        y f2;
        Object o;
        int n52;
        q<? super rg2.p<? super z0.d, ? super Integer, j>, ? super z0.d, ? super Integer, j> q2;
        if ((n34 & 0x5B6DB6DB) == 0x12492492 && (0xB6DB & n49) == 0x2492 && s.c()) {
            s.k();
            p20 = p19;
            k = j;
            n51 = n2;
            a = f;
            d3 = d;
            f2 = y;
            o = instance;
            n52 = (b2 ? 1 : 0);
            q2 = q;
        }
        else {
            s.v0();
            o0.j l;
            o1.n n53;
            o2.j m;
            int n54;
            q<? super rg2.p<? super z0.d, ? super Integer, j>, ? super z0.d, ? super Integer, j> q3;
            p p21;
            boolean b5;
            if ((n4 & 0x1) != 0x0 && !s.Y()) {
                s.k();
                if ((n6 & 0x400) != 0x0) {
                    final CoreTextFieldKt$CoreTextField$1 coreTextFieldKt$CoreTextField$1 = instance;
                    l = j;
                    n53 = n2;
                    final boolean b4 = b;
                    m = i;
                    a = f;
                    n54 = (b2 ? 1 : 0);
                    q3 = q;
                    n49 &= 0xFFFFFFF1;
                    f2 = y;
                    p21 = p19;
                    d3 = d;
                    o = coreTextFieldKt$CoreTextField$1;
                    b5 = b4;
                }
                else {
                    final CoreTextFieldKt$CoreTextField$1 coreTextFieldKt$CoreTextField$2 = instance;
                    l = j;
                    n53 = n2;
                    final boolean b6 = b;
                    m = i;
                    a = f;
                    n54 = (b2 ? 1 : 0);
                    q3 = q;
                    f2 = y;
                    p21 = p19;
                    d3 = d;
                    o = coreTextFieldKt$CoreTextField$2;
                    b5 = b6;
                }
            }
            else {
                Object f3;
                if (n11 != 0) {
                    f3 = j1.d.a.f;
                }
                else {
                    f3 = d;
                }
                p c;
                if (n15 != 0) {
                    c = p.c;
                }
                else {
                    c = p19;
                }
                Object a2;
                if (n19 != 0) {
                    a2 = o2.y.a.a;
                }
                else {
                    a2 = y;
                }
                if (n23 != 0) {
                    instance = CoreTextFieldKt$CoreTextField$1.INSTANCE;
                }
                o0.j j2;
                if (n26 != 0) {
                    j2 = null;
                }
                else {
                    j2 = j;
                }
                o1.n n55;
                if ((n6 & 0x80) != 0x0) {
                    n55 = new m0(r.l);
                }
                else {
                    n55 = n2;
                }
                if (n30 != 0) {
                    b = true;
                }
                if (n33 != 0) {
                    n3 = Integer.MAX_VALUE;
                }
                o2.j f4;
                if ((n6 & 0x400) != 0x0) {
                    f4 = o2.j.f;
                    n49 &= 0xFFFFFFF1;
                }
                else {
                    f4 = i;
                }
                f g;
                if (n38 != 0) {
                    g = f.g;
                }
                else {
                    g = f;
                }
                if (n42 != 0) {
                    b2 = true;
                }
                if (n45 != 0) {
                    b3 = false;
                }
                Object a3;
                if (n48 != 0) {
                    a3 = ComposableSingletons$CoreTextFieldKt.a;
                }
                else {
                    a3 = q;
                }
                final CoreTextFieldKt$CoreTextField$1 coreTextFieldKt$CoreTextField$3 = instance;
                n53 = n55;
                final p p22 = c;
                a = g;
                final o2.j j3 = f4;
                f2 = (y)a2;
                final boolean b7 = b2;
                l = j2;
                q3 = (q<? super rg2.p<? super z0.d, ? super Integer, j>, ? super z0.d, ? super Integer, j>)a3;
                b5 = b;
                o = coreTextFieldKt$CoreTextField$3;
                d3 = (d)f3;
                p21 = p22;
                m = j3;
                n54 = (b7 ? 1 : 0);
            }
            s.S();
            final m j4 = new m();
            s.A(-55013392);
            u u;
            if (n54 && !b3) {
                u = (u)s.u((o0)CompositionLocalsKt.l);
            }
            else {
                u = null;
            }
            s.R(false);
            final b b8 = (b)s.u((o0)CompositionLocalsKt.e);
            final g$a g$a = (g$a)s.u((o0)CompositionLocalsKt.h);
            final long b9 = ((w0.l)s.u((o0)TextSelectionColorsKt.a)).b;
            final m1.d b10 = (m1.d)s.u((o0)CompositionLocalsKt.f);
            Orientation orientation;
            if (n3 == 1 && !b5 && m.a) {
                orientation = Orientation.Horizontal;
            }
            else {
                orientation = Orientation.Vertical;
            }
            final h1.e f5 = TextFieldScrollerPosition.f;
            s.A(1157296644);
            final boolean m2 = s.m((Object)orientation);
            final Object c2 = s.c0();
            Object o2;
            if (m2 || (o2 = c2) == d$a.a) {
                o2 = new CoreTextFieldKt$CoreTextField$scrollerPosition$1$1(orientation);
                s.I0(o2);
            }
            s.R(false);
            final TextFieldScrollerPosition textFieldScrollerPosition = (TextFieldScrollerPosition)androidx.compose.runtime.saveable.b.a(new Object[] { orientation }, f5, (a)o2, (z0.d)s, 4);
            s.A(511388516);
            final boolean m3 = s.m((Object)value);
            final boolean m4 = s.m((Object)f2);
            Object o3 = s.c0();
            if ((m3 | m4) || o3 == d$a.a) {
                o3 = f2.c(value.a);
                final o c3 = value.c;
                if (c3 != null) {
                    final long a4 = c3.a;
                    e.f(o3, "transformed");
                    final i2.a.a a5 = new i2.a.a(((x)o3).a);
                    final k k2 = new k(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t2.e.c, null, 12287);
                    final o2.m b11 = ((x)o3).b;
                    final int c4 = i2.o.c;
                    a5.b(k2, b11.b((int)(a4 >> 32)), ((x)o3).b.b(i2.o.c(a4)));
                    o3 = new x(a5.i(), ((x)o3).b);
                }
                s.I0(o3);
            }
            s.R(false);
            final x x = (x)o3;
            final i2.a a6 = x.a;
            final o2.m b12 = x.b;
            final r0 x2 = s.X();
            if (x2 == null) {
                throw new IllegalStateException("no recompose scope found".toString());
            }
            s.e((q0)x2);
            s.A(-492369756);
            final Object c5 = s.c0();
            final d$a$a a7 = d$a.a;
            TextFieldState textFieldState;
            if ((textFieldState = (TextFieldState)c5) == a7) {
                textFieldState = new TextFieldState(new v0.j(a6, p21, 0, b5, 0, b8, g$a, 148), (q0)x2);
                s.I0((Object)textFieldState);
            }
            s.R(false);
            final TextFieldState d4 = textFieldState;
            d4.getClass();
            e.f((Object)a6, "visualText");
            e.f((Object)p21, "textStyle");
            e.f((Object)b8, "density");
            e.f((Object)g$a, "fontFamilyResolver");
            e.f((Object)a, "keyboardActions");
            e.f((Object)b10, "focusManager");
            d4.n = n;
            d4.q.c(b9);
            final v0.d m5 = d4.m;
            m5.getClass();
            m5.a = a;
            m5.b = b10;
            d4.a = CoreTextKt.b(d4.a, a6, p21, b8, g$a, b5, 1, Integer.MAX_VALUE, (List<i2.a.b<i2.j>>)EmptyList.INSTANCE);
            final o2.e c6 = d4.c;
            final w d5 = d4.d;
            c6.getClass();
            final o c7 = value.c;
            final o2.f b13 = c6.b;
            final int d6 = b13.d;
            Object o4;
            if (d6 != -1) {
                o4 = new o(wd.a.i(d6, b13.e));
            }
            else {
                o4 = null;
            }
            final boolean a8 = e.a((Object)c7, o4);
            int n56 = 0;
            boolean b15 = false;
            Label_2407: {
                boolean b14;
                if (!e.a((Object)c6.a.a, (Object)value.a)) {
                    c6.b = new o2.f(value.a, value.b);
                    b14 = true;
                }
                else {
                    if (!i2.o.a(c6.a.b, value.b)) {
                        c6.b.f(i2.o.f(value.b), i2.o.e(value.b));
                        n56 = 1;
                        b15 = false;
                        break Label_2407;
                    }
                    b14 = false;
                }
                final int n57 = 0;
                b15 = b14;
                n56 = n57;
            }
            final o c8 = value.c;
            if (c8 == null) {
                final o2.f b16 = c6.b;
                b16.d = -1;
                b16.e = -1;
            }
            else if (!i2.o.b(c8.a)) {
                c6.b.e(i2.o.f(value.c.a), i2.o.e(value.c.a));
            }
            p20 = p21;
            TextFieldValue a9;
            if (!b15 && (n56 != 0 || !(a8 ^ true))) {
                a9 = value;
            }
            else {
                final o2.f b17 = c6.b;
                b17.d = -1;
                b17.e = -1;
                a9 = TextFieldValue.a(value, null, 0L, 3);
            }
            final TextFieldValue a10 = c6.a;
            c6.a = a9;
            if (d5 != null && e.a((Object)d5.a.b.get(), (Object)d5)) {
                d5.b.b(a10, a9);
            }
            s.A(-492369756);
            Object c9 = s.c0();
            if (c9 == a7) {
                c9 = new v0.r(0);
                s.I0(c9);
            }
            s.R(false);
            final v0.r r = (v0.r)c9;
            final long currentTimeMillis = System.currentTimeMillis();
            r.getClass();
            Label_2723: {
                if (!r.f) {
                    final Long e = r.e;
                    long longValue;
                    if (e != null) {
                        longValue = e;
                    }
                    else {
                        longValue = 0L;
                    }
                    if (currentTimeMillis <= longValue + 5000) {
                        break Label_2723;
                    }
                }
                r.e = currentTimeMillis;
                r.a(value);
            }
            s.A(-492369756);
            Object c10;
            if ((c10 = s.c0()) == a7) {
                c10 = new TextFieldSelectionManager(r);
                s.I0(c10);
            }
            s.R(false);
            final TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager)c10;
            textFieldSelectionManager.getClass();
            e.f((Object)b12, "<set-?>");
            textFieldSelectionManager.b = b12;
            e.f((Object)f2, "<set-?>");
            textFieldSelectionManager.f = f2;
            final l<TextFieldValue, j> o5 = d4.o;
            e.f((Object)o5, "<set-?>");
            textFieldSelectionManager.c = o5;
            textFieldSelectionManager.d = d4;
            ((SnapshotMutableStateImpl)textFieldSelectionManager.e).setValue((Object)value);
            textFieldSelectionManager.g = (d0)s.u((o0)CompositionLocalsKt.d);
            textFieldSelectionManager.h = (b1)s.u((o0)CompositionLocalsKt.m);
            textFieldSelectionManager.i = (u1.a)s.u((o0)CompositionLocalsKt.i);
            textFieldSelectionManager.j = j4;
            final boolean b18 = b3 ^ true;
            ((SnapshotMutableStateImpl)textFieldSelectionManager.k).setValue((Object)b18);
            s.A(773894976);
            s.A(-492369756);
            Object o6;
            if ((o6 = s.c0()) == a7) {
                o6 = android.support.v4.media.a.o(z0.s.i(EmptyCoroutineContext.INSTANCE, (z0.d)s), s);
            }
            s.R(false);
            final b0 f6 = ((z0.l)o6).f;
            s.R(false);
            s.A(-492369756);
            Object c11;
            if ((c11 = s.c0()) == a7) {
                c11 = new BringIntoViewRequesterImpl();
                s.I0(c11);
            }
            s.R(false);
            final t0.d d7 = (t0.d)c11;
            Object o7 = j1.d.a.f;
            final d b19 = androidx.compose.foundation.d.b(l, FocusChangedModifierKt.a(FocusRequesterModifierKt.a((d)o7, j4), (l)new CoreTextFieldKt$CoreTextField$focusModifier$1(d4, u, value, m, textFieldSelectionManager, f6, d7, b12)), (boolean)(n54 != 0));
            z0.s.c((Object)d4, (l)new CoreTextFieldKt$CoreTextField$2(d4), (z0.d)s);
            final TextFieldSelectionManager$b r2 = textFieldSelectionManager.r;
            e.f((Object)r2, "observer");
            d b20;
            if (n54 != 0) {
                b20 = SuspendingPointerInputFilterKt.b((d)o7, (Object)r2, (rg2.p)new TextFieldGestureModifiersKt$longPressDragGestureFilter$1((v0.k)r2, (lg2.c)null));
            }
            else {
                b20 = (d)o7;
            }
            final CoreTextFieldKt$CoreTextField$pointerModifier$1 coreTextFieldKt$CoreTextField$pointerModifier$1 = new CoreTextFieldKt$CoreTextField$pointerModifier$1(d4, j4, b3, textFieldSelectionManager, b12);
            d b21;
            if (n54 != 0) {
                b21 = ComposedModifierKt.b((d)o7, (q)new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1((l)coreTextFieldKt$CoreTextField$pointerModifier$1, l));
            }
            else {
                b21 = (d)o7;
            }
            final d j5 = b21.j0(b20);
            final d a11 = DrawModifierKt.a((d)o7, (l)new CoreTextFieldKt$CoreTextField$drawModifier$1(d4, value, b12));
            final d k3 = aa1.a.K0((d)o7, (l)new CoreTextFieldKt$CoreTextField$onPositionedModifier$1(d4, (boolean)(n54 != 0), textFieldSelectionManager));
            final d b22 = SemanticsModifierKt.b((d)o7, true, (l<? super h2.q, j>)new CoreTextFieldKt$CoreTextField$semanticsModifier$1(m, x, value, (boolean)(n54 != 0), f2 instanceof o2.o, b3, d4, b12, textFieldSelectionManager, j4));
            final boolean b23 = n54 && !b3;
            final float a12 = v0.l.a;
            e.f((Object)n53, "cursorBrush");
            d b24;
            if (b23) {
                b24 = ComposedModifierKt.b((d)o7, (q)new TextFieldCursorKt$cursor$1(n53, d4, value, b12));
            }
            else {
                b24 = (d)o7;
            }
            z0.s.c((Object)textFieldSelectionManager, (l)new CoreTextFieldKt$CoreTextField$3(textFieldSelectionManager), (z0.d)s);
            z0.s.c((Object)m, (l)new CoreTextFieldKt$CoreTextField$4(u, d4, value, m), (z0.d)s);
            final l<TextFieldValue, j> o8 = d4.o;
            boolean b25 = true;
            if (n3 != 1) {
                b25 = false;
            }
            e.f((Object)o8, "onValueChange");
            final d b26 = ComposedModifierKt.b((d)o7, (q)new TextFieldKeyInputKt$textFieldKeyInput$2(d4, textFieldSelectionManager, value, b18, b25, b12, r, (l)o8));
            final d j6 = d3.j0(b19);
            final CoreTextFieldKt$previewKeyEventToDeselectOnBack$1 coreTextFieldKt$previewKeyEventToDeselectOnBack$1 = new CoreTextFieldKt$previewKeyEventToDeselectOnBack$1(d4, textFieldSelectionManager);
            final d2.e a13 = KeyInputModifierKt.a;
            e.f((Object)j6, "<this>");
            final l a14 = InspectableValueKt.a;
            final d j7 = InspectableValueKt.a(j6, a14, (d)new x1.d(null, (l<? super x1.b, Boolean>)coreTextFieldKt$previewKeyEventToDeselectOnBack$1)).j0(b26);
            e.f((Object)j7, "<this>");
            e.f((Object)textFieldScrollerPosition, "scrollerPosition");
            final d k4 = aa1.a.K0(ComposedModifierKt.a(j7, a14, (q)new TextFieldScrollKt$textFieldScrollable$2(textFieldScrollerPosition, (boolean)(n54 != 0), l)).j0(j5).j0(b22), (l)new CoreTextFieldKt$CoreTextField$decorationBoxModifier$1(d4));
            final boolean b27 = n54 && d4.b();
            if (b27) {
                o7 = androidx.compose.foundation.text.selection.c.a(textFieldSelectionManager);
            }
            final CoreTextFieldKt$CoreTextField$5 coreTextFieldKt$CoreTextField$4 = new CoreTextFieldKt$CoreTextField$5((q)q3, n49, n3, p20, textFieldScrollerPosition, value, f2, b24, a11, k3, (d)o7, d7, d4, textFieldSelectionManager, b27, b3, (l)o);
            final z0.d d8 = (z0.d)s;
            b(k4, textFieldSelectionManager, (rg2.p<? super z0.d, ? super Integer, j>)aa1.a.R(d8, -1885146845, (Lambda)coreTextFieldKt$CoreTextField$4), d8, 448);
            final o1.n n58 = n53;
            final o0.j j8 = l;
            q2 = q3;
            n52 = n54;
            i = m;
            b = b5;
            n51 = n58;
            k = j8;
        }
        final r0 u2 = s.U();
        if (u2 != null) {
            u2.d = (rg2.p)new CoreTextFieldKt$CoreTextField$6(value, (l)n, d3, p20, f2, (l)o, k, n51, b, n3, i, a, (boolean)(n52 != 0), b3, (q)q2, n4, n5, n6);
        }
    }
    
    public static final void b(final d d, final TextFieldSelectionManager textFieldSelectionManager, final rg2.p<? super z0.d, ? super Integer, j> p5, final z0.d d2, final int n) {
        final ComposerImpl s = d2.s(-20551815);
        final int n2 = (n & 0xE) | 0x180;
        s.A(733328855);
        final c2.s c = BoxKt.c((j1.a)a$a.a, true, (z0.d)s);
        s.A(-1323940314);
        final b b = (b)s.u((o0)CompositionLocalsKt.e);
        final LayoutDirection layoutDirection = (LayoutDirection)s.u((o0)CompositionLocalsKt.k);
        final h1 h1 = (h1)s.u((o0)CompositionLocalsKt.o);
        ComposeUiNode.u2.getClass();
        final a b2 = ComposeUiNode$Companion.b;
        final ComposableLambdaImpl b3 = LayoutKt.b(d);
        final int n3 = ((n2 << 3 & 0x70) << 9 & 0x1C00) | 0x6;
        if (s.a instanceof z0.c) {
            s.j();
            if (s.K) {
                s.E(b2);
            }
            else {
                s.f();
            }
            s.x = false;
            Updater.b((z0.d)s, c, ComposeUiNode$Companion.e);
            Updater.b((z0.d)s, b, ComposeUiNode$Companion.d);
            Updater.b((z0.d)s, layoutDirection, ComposeUiNode$Companion.f);
            al0.b.m(n3 >> 3 & 0x70, b3, d.v(s, h1, ComposeUiNode$Companion.g, s), s, 2058660585);
            s.A(-2137368960);
            if ((n3 >> 9 & 0xE & 0xB) == 0x2 && s.c()) {
                s.k();
            }
            else {
                s.A(1524757375);
                if ((((n2 >> 6 & 0x70) | 0x6) & 0x51) == 0x10 && s.c()) {
                    s.k();
                }
                else {
                    ContextMenu_androidKt.a(textFieldSelectionManager, p5, (z0.d)s, (n >> 3 & 0x70) | 0x8);
                }
                s.R(false);
            }
            aw.b.r(s, false, false, true, false);
            s.R(false);
            final r0 u = s.U();
            if (u != null) {
                u.d = (rg2.p)new CoreTextFieldKt$CoreTextFieldRootBox$2(d, textFieldSelectionManager, (rg2.p)p5, n);
            }
            return;
        }
        bg.d.k0();
        throw null;
    }
    
    public static final void c(final TextFieldSelectionManager textFieldSelectionManager, final z0.d d, final int n) {
        e.f((Object)textFieldSelectionManager, "manager");
        final ComposerImpl s = d.s(-1436003720);
        final TextFieldState d2 = textFieldSelectionManager.d;
        boolean b = true;
        if (d2 == null || !(boolean)((SnapshotMutableStateImpl)d2.l).getValue()) {
            b = false;
        }
        if (b) {
            s.A(1157296644);
            final boolean m = s.m((Object)textFieldSelectionManager);
            final Object c0 = s.c0();
            Object o;
            if (m || (o = c0) == d$a.a) {
                o = new i(textFieldSelectionManager);
                s.I0(o);
            }
            s.R(false);
            final v0.k k = (v0.k)o;
            final b b2 = (b)s.u((o0)CompositionLocalsKt.e);
            e.f((Object)b2, "density");
            final o2.m b3 = textFieldSelectionManager.b;
            final long b4 = textFieldSelectionManager.j().b;
            final int c2 = i2.o.c;
            final int b5 = b3.b((int)(b4 >> 32));
            final TextFieldState d3 = textFieldSelectionManager.d;
            v0.q c3;
            if (d3 != null) {
                c3 = d3.c();
            }
            else {
                c3 = null;
            }
            e.c((Object)c3);
            final n a = c3.a;
            final n1.d c4 = a.c(e0.v(b5, 0, a.a.a.length()));
            final long f = wd.a.f(b2.M0(v0.l.a) / 2 + c4.a, c4.d);
            final d b6 = SuspendingPointerInputFilterKt.b((d)j1.d.a.f, (Object)k, (rg2.p)new CoreTextFieldKt$TextFieldCursorHandle$1(k, (lg2.c)null));
            final n1.c c5 = new n1.c(f);
            s.A(1157296644);
            final boolean i = s.m((Object)c5);
            final Object c6 = s.c0();
            Object o2;
            if (i || (o2 = c6) == d$a.a) {
                o2 = new CoreTextFieldKt$TextFieldCursorHandle$2$1(f);
                s.I0(o2);
            }
            s.R(false);
            AndroidCursorHandle_androidKt.a(f, SemanticsModifierKt.b(b6, false, (l<? super h2.q, j>)o2), null, (z0.d)s, 384);
        }
        final r0 u = s.U();
        if (u != null) {
            u.d = (rg2.p)new CoreTextFieldKt$TextFieldCursorHandle$3(textFieldSelectionManager, n);
        }
    }
    
    public static final void d(final TextFieldSelectionManager textFieldSelectionManager, final boolean b, final z0.d d, final int n) {
        final ComposerImpl s = d.s(626339208);
        if (b) {
            final TextFieldState d2 = textFieldSelectionManager.d;
            n a = null;
            Label_0043: {
                if (d2 != null) {
                    final v0.q c = d2.c();
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
                    s.A(-498396421);
                    final TextFieldState d3 = textFieldSelectionManager.d;
                    if (d3 != null && (boolean)((SnapshotMutableStateImpl)d3.j).getValue()) {
                        TextFieldSelectionManagerKt.a(true, a2, textFieldSelectionManager, (z0.d)s, 518);
                    }
                    s.R(false);
                    final TextFieldState d4 = textFieldSelectionManager.d;
                    if (d4 != null && (boolean)((SnapshotMutableStateImpl)d4.k).getValue()) {
                        TextFieldSelectionManagerKt.a(false, a3, textFieldSelectionManager, (z0.d)s, 518);
                    }
                }
                final TextFieldState d5 = textFieldSelectionManager.d;
                if (d5 != null) {
                    if (e.a((Object)textFieldSelectionManager.q.a.f, (Object)textFieldSelectionManager.j().a.f) ^ true) {
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
        final r0 u = s.U();
        if (u != null) {
            u.d = (rg2.p)new CoreTextFieldKt$SelectionToolbarAndHandles$2(textFieldSelectionManager, b, n);
        }
    }
    
    public static final void e(final TextFieldState textFieldState) {
        final w d = textFieldState.d;
        Label_0104: {
            if (d != null) {
                final o2.e c = textFieldState.c;
                final l<TextFieldValue, j> o = textFieldState.o;
                e.f((Object)c, "editProcessor");
                e.f((Object)o, "onValueChange");
                o.invoke(TextFieldValue.a(c.a, null, 0L, 3));
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

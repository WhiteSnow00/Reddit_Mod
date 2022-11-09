// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import zg2.p;
import tg2.c;
import z0.e1;
import n0.h;
import o0.i;
import x1.b;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import zg2.q;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import zg2.a;
import h2.g;
import m0.k;
import z0.r0;
import androidx.compose.runtime.ComposerImpl;
import z0.s;
import zg2.l;
import z0.d$a;
import ah2.f;
import z0.d;
import o0.m;
import z0.h0;
import o0.j;

public final class ClickableKt
{
    public static final void a(final j j, final h0<m> h0, final d d, final int n) {
        f.f((Object)j, "interactionSource");
        f.f((Object)h0, "pressedInteraction");
        final ComposerImpl r = d.r(1761107222);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (r.l((Object)j)) {
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
            if (r.l((Object)h0)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        if ((n4 & 0x5B) == 0x12 && r.b()) {
            r.j();
        }
        else {
            r.A(511388516);
            final boolean l = r.l((Object)h0);
            final boolean i = r.l((Object)j);
            final Object c0 = r.c0();
            Object o;
            if ((l | i) || (o = c0) == d$a.a) {
                o = new ClickableKt$PressedInteractionSourceDisposableEffect$1.ClickableKt$PressedInteractionSourceDisposableEffect$1$1((h0)h0, j);
                r.I0(o);
            }
            r.R(false);
            s.c(j, (l)o, (d)r);
        }
        final r0 u = r.U();
        if (u != null) {
            u.d = (p<? super d, ? super Integer, pg2.j>)new ClickableKt$PressedInteractionSourceDisposableEffect.ClickableKt$PressedInteractionSourceDisposableEffect$2(j, (h0)h0, n);
        }
    }
    
    public static final j1.d b(final j1.d d, final j j, final k k, final boolean b, final String s, final g g, final a<pg2.j> a) {
        f.f((Object)d, "$this$clickable");
        f.f((Object)j, "interactionSource");
        f.f((Object)a, "onClick");
        return ComposedModifierKt.a(d, InspectableValueKt.a, (q)new ClickableKt$clickable.ClickableKt$clickable$4((a)a, b, j, k, s, g));
    }
    
    public static j1.d d(final j1.d d, boolean b, String s, g g, final a a, final int n) {
        if ((n & 0x1) != 0x0) {
            b = true;
        }
        if ((n & 0x2) != 0x0) {
            s = null;
        }
        if ((n & 0x4) != 0x0) {
            g = null;
        }
        f.f((Object)d, "$this$clickable");
        f.f((Object)a, "onClick");
        return ComposedModifierKt.a(d, InspectableValueKt.a, (q)new ClickableKt$clickable$2(b, s, g, (a<pg2.j>)a));
    }
    
    public static final j1.d e(final j1.d d, final j j, final k k, final boolean b, final String s, final g g, final String s2, final a<pg2.j> a, final a<pg2.j> a2, final a<pg2.j> a3) {
        f.f((Object)d, "$this$combinedClickable");
        f.f((Object)j, "interactionSource");
        f.f((Object)a3, "onClick");
        return ComposedModifierKt.a(d, InspectableValueKt.a, (q)new ClickableKt$combinedClickable.ClickableKt$combinedClickable$4((a)a3, (a)a, (a)a2, b, j, k, s, g, s2));
    }
    
    public static j1.d f(final j1.d d, boolean b, g g, a a, final a a2, final int n) {
        if ((n & 0x1) != 0x0) {
            b = true;
        }
        if ((n & 0x4) != 0x0) {
            g = null;
        }
        if ((n & 0x10) != 0x0) {
            a = null;
        }
        f.f((Object)d, "$this$combinedClickable");
        f.f((Object)a2, "onClick");
        return ComposedModifierKt.a(d, InspectableValueKt.a, (q)new ClickableKt$combinedClickable$2(b, null, g, null, (a<pg2.j>)a, null, (a<pg2.j>)a2));
    }
    
    public static final j1.d g(j1.d b, final j1.d d, final j j, final k k, final boolean b2, final String s, final g g, final String s2, final a<pg2.j> a, final a<pg2.j> a2) {
        f.f((Object)d, "gestureModifiers");
        f.f((Object)j, "interactionSource");
        f.f((Object)a2, "onClick");
        b = SemanticsModifierKt.b(b, true, (l<? super h2.q, pg2.j>)new ClickableKt$genericClickableWithoutGesture$clickSemantics$1(g, s, a, s2, b2, a2));
        final ClickableKt$genericClickableWithoutGesture$detectClickFromKey$1 clickableKt$genericClickableWithoutGesture$detectClickFromKey$1 = new ClickableKt$genericClickableWithoutGesture$detectClickFromKey$1(b2, a2);
        final d2.e a3 = KeyInputModifierKt.a;
        f.f((Object)b, "<this>");
        return d.c(j, e.a(j, IndicationKt.a(InspectableValueKt.a(b, InspectableValueKt.a, (j1.d)new x1.d((l<? super b, Boolean>)clickableKt$genericClickableWithoutGesture$detectClickFromKey$1, null)), (i)j, k), b2), b2).f0(d);
    }
    
    public static final Object h(final h h, final long n, final j j, final h0<m> h2, final e1<? extends a<Boolean>> e1, final c<? super pg2.j> c) {
        final Object e2 = mj2.g.e((p)new ClickableKt$handlePressInteraction$2(h, n, j, (h0)h2, (e1)e1, (c)null), (c)c);
        if (e2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return e2;
        }
        return pg2.j.a;
    }
}

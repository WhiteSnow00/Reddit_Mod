// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devplatform.features.formbuilder.composables;

import z0.r0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import z0.f1;
import c2.s;
import zg2.q;
import androidx.compose.runtime.ComposerImpl;
import com.reddit.ui.compose.ds.SwitchKt;
import i2.p;
import t2.e;
import n2.m;
import n2.k;
import com.reddit.ui.compose.ds.TextKt;
import u32.w;
import androidx.compose.foundation.layout.BoxKt;
import p0.d0;
import androidx.compose.runtime.Updater;
import z0.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.k1;
import androidx.compose.ui.unit.LayoutDirection;
import z0.o0;
import u2.b;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.foundation.layout.RowKt;
import j1.a$a;
import h2.g;
import androidx.compose.foundation.ClickableKt;
import z0.d$a;
import at1.a;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposerKt;
import ah2.f;
import pg2.j;
import zg2.l;
import a90.d;

public final class BooleanFieldKt
{
    public static final void a(final d d, final String s, final l<? super String, j> l, final z0.d d2, final int n) {
        f.f((Object)d, "field");
        f.f((Object)s, "value");
        f.f((Object)l, "onValueChange");
        final ComposerImpl r = d2.r(1464649249);
        final q a = ComposerKt.a;
        final boolean boolean1 = Boolean.parseBoolean(s);
        final j1.d.a f = j1.d.a.f;
        final j1.d t1 = at1.a.t1(SizeKt.i((j1.d)f, 1.0f), 0.0f, (float)12, 0.0f, (float)20, 5);
        r.A(511388516);
        final boolean i = r.l((Object)l);
        final boolean j = r.l((Object)boolean1);
        final Object c0 = r.c0();
        Object o;
        if ((j | i) || (o = c0) == d$a.a) {
            o = new BooleanFieldKt$BooleanField$1$1((l)l, boolean1);
            r.I0(o);
        }
        r.R(false);
        final j1.d d3 = ClickableKt.d(t1, false, null, null, (zg2.a)o, 7);
        final j1.b.b k = a$a.k;
        r.A(693286680);
        final s a2 = RowKt.a((androidx.compose.foundation.layout.a.d)androidx.compose.foundation.layout.a.a, k, (z0.d)r);
        r.A(-1323940314);
        final f1 e = CompositionLocalsKt.e;
        final b b = (b)r.t((o0)e);
        final f1 m = CompositionLocalsKt.k;
        final LayoutDirection layoutDirection = (LayoutDirection)r.t((o0)m);
        final f1 o2 = CompositionLocalsKt.o;
        final k1 k2 = (k1)r.t((o0)o2);
        ComposeUiNode.w2.getClass();
        final zg2.a b2 = ComposeUiNode$Companion.b;
        final ComposableLambdaImpl b3 = LayoutKt.b(d3);
        if (!(r.a instanceof c)) {
            yl.a.B0();
            throw null;
        }
        r.h();
        if (r.K) {
            r.i(b2);
        }
        else {
            r.e();
        }
        r.x = false;
        final zg2.p e2 = ComposeUiNode$Companion.e;
        Updater.b((z0.d)r, (Object)a2, e2);
        final zg2.p d4 = ComposeUiNode$Companion.d;
        Updater.b((z0.d)r, (Object)b, d4);
        final zg2.p f2 = ComposeUiNode$Companion.f;
        Updater.b((z0.d)r, (Object)layoutDirection, f2);
        final zg2.p g = ComposeUiNode$Companion.g;
        b.p(0, b3, a.m(r, k2, g, r), r, 2058660585, -678309503);
        final j1.d a3 = d0.a.a(1.0f, at1.a.t1((j1.d)f, (float)16, 0.0f, 0.0f, (float)4, 6), true);
        r.A(733328855);
        final s c2 = BoxKt.c((j1.a)a$a.a, false, (z0.d)r);
        r.A(-1323940314);
        final b b4 = (b)r.t((o0)e);
        final LayoutDirection layoutDirection2 = (LayoutDirection)r.t((o0)m);
        final k1 k3 = (k1)r.t((o0)o2);
        final ComposableLambdaImpl b5 = LayoutKt.b(a3);
        if (r.a instanceof c) {
            r.h();
            if (r.K) {
                r.i(b2);
            }
            else {
                r.e();
            }
            r.x = false;
            b.p(0, b5, a2.b.s(r, c2, e2, r, b4, d4, r, layoutDirection2, f2, r, k3, g, r), r, 2058660585, -2137368960);
            final String prompt = d.getPrompt();
            ah2.f.e((Object)prompt, "field.prompt");
            TextKt.c(prompt, (j1.d)null, w.a((z0.d)r).b.k(), 0L, (k)null, (m)null, (n2.g)null, 0L, (e)null, (t2.d)null, 0L, 0, false, 0, (l)null, (p)null, (z0.d)r, 0, 0, 65530);
            d.x(r, false, false, true, false);
            r.R(false);
            r.A(511388516);
            final boolean l2 = r.l((Object)l);
            final boolean l3 = r.l((Object)boolean1);
            Object c3 = r.c0();
            if ((l3 | l2) || c3 == d$a.a) {
                c3 = new BooleanFieldKt$BooleanField$2$2$1((l)l, boolean1);
                r.I0(c3);
            }
            r.R(false);
            SwitchKt.a(boolean1, (l)c3, (j1.d)null, false, (o0.j)null, (z0.d)r, 0, 28);
            d.x(r, false, false, true, false);
            r.R(false);
            final r0 u = r.U();
            if (u != null) {
                u.d = (zg2.p<? super z0.d, ? super Integer, j>)new BooleanFieldKt$BooleanField$3(d, s, (l)l, n);
            }
            return;
        }
        yl.a.B0();
        throw null;
    }
}

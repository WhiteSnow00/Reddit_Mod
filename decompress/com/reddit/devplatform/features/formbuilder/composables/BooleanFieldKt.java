// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devplatform.features.formbuilder.composables;

import z0.p0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import z0.d1;
import c2.v;
import mg2.q;
import androidx.compose.runtime.ComposerImpl;
import com.reddit.ui.compose.ds.SwitchKt;
import t2.f;
import n2.o;
import n2.k;
import com.reddit.ui.compose.ds.TextKt;
import g32.w;
import androidx.compose.foundation.layout.BoxKt;
import p0.d0;
import mg2.p;
import androidx.compose.runtime.Updater;
import z0.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.k1;
import androidx.compose.ui.unit.LayoutDirection;
import z0.m0;
import u2.b;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.foundation.layout.a$d;
import androidx.compose.foundation.layout.RowKt;
import j1.a$a;
import h2.g;
import androidx.compose.foundation.ClickableKt;
import z0.d$a;
import vl.a;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposerKt;
import ng2.e;
import cg2.j;
import mg2.l;
import s80.d;

public final class BooleanFieldKt
{
    public static final void a(final d d, final String s, final l<? super String, j> l, final z0.d d2, final int n) {
        e.f((Object)d, "field");
        e.f((Object)s, "value");
        e.f((Object)l, "onValueChange");
        final ComposerImpl s2 = d2.s(1464649249);
        final q a = ComposerKt.a;
        final boolean boolean1 = Boolean.parseBoolean(s);
        final j1.d.a f = j1.d.a.f;
        final j1.d s3 = vl.a.S2(SizeKt.i((j1.d)f, 1.0f), 0.0f, (float)12, 0.0f, (float)20, 5);
        s2.A(511388516);
        final boolean m = s2.m((Object)l);
        final boolean i = s2.m((Object)boolean1);
        final Object d3 = s2.d0();
        Object o;
        if ((i | m) || (o = d3) == d$a.a) {
            o = new BooleanFieldKt$BooleanField$1$1((l)l, boolean1);
            s2.J0(o);
        }
        s2.S(false);
        final j1.d d4 = ClickableKt.d(s3, false, (String)null, (g)null, (mg2.a)o, 7);
        final j1.b.b k = a$a.k;
        s2.A(693286680);
        final v a2 = RowKt.a((a$d)androidx.compose.foundation.layout.a.a, k, (z0.d)s2);
        s2.A(-1323940314);
        final d1 e = CompositionLocalsKt.e;
        final b b = (b)s2.u((m0)e);
        final d1 j = CompositionLocalsKt.k;
        final LayoutDirection layoutDirection = (LayoutDirection)s2.u((m0)j);
        final d1 o2 = CompositionLocalsKt.o;
        final k1 k2 = (k1)s2.u((m0)o2);
        ComposeUiNode.M2.getClass();
        final mg2.a<ComposeUiNode> b2 = ComposeUiNode.Companion.b;
        final ComposableLambdaImpl b3 = LayoutKt.b(d4);
        if (!(s2.a instanceof c)) {
            a01.a.L();
            throw null;
        }
        s2.i();
        if (s2.L) {
            s2.b((mg2.a)b2);
        }
        else {
            s2.f();
        }
        s2.x = false;
        final p<ComposeUiNode, v, j> e2 = ComposeUiNode.Companion.e;
        Updater.b((z0.d)s2, (Object)a2, (p)e2);
        final p<ComposeUiNode, b, j> d5 = ComposeUiNode.Companion.d;
        Updater.b((z0.d)s2, (Object)b, (p)d5);
        final p<ComposeUiNode, LayoutDirection, j> f2 = ComposeUiNode.Companion.f;
        Updater.b((z0.d)s2, (Object)layoutDirection, (p)f2);
        final p<ComposeUiNode, k1, j> g = ComposeUiNode.Companion.g;
        a.w(0, b3, android.support.v4.media.a.u(s2, k2, (p)g, s2), s2, 2058660585, -678309503);
        final j1.d a3 = d0.a.a(1.0f, vl.a.S2((j1.d)f, (float)16, 0.0f, 0.0f, (float)4, 6), true);
        s2.A(733328855);
        final v c = BoxKt.c((j1.a)a$a.a, false, (z0.d)s2);
        s2.A(-1323940314);
        final b b4 = (b)s2.u((m0)e);
        final LayoutDirection layoutDirection2 = (LayoutDirection)s2.u((m0)j);
        final k1 k3 = (k1)s2.u((m0)o2);
        final ComposableLambdaImpl b5 = LayoutKt.b(a3);
        if (s2.a instanceof c) {
            s2.i();
            if (s2.L) {
                s2.b((mg2.a)b2);
            }
            else {
                s2.f();
            }
            s2.x = false;
            a.w(0, b5, android.support.v4.media.a.v(s2, c, (p)e2, s2, b4, (p)d5, s2, layoutDirection2, (p)f2, s2, k3, (p)g, s2), s2, 2058660585, -2137368960);
            final String prompt = d.getPrompt();
            ng2.e.e((Object)prompt, "field.prompt");
            TextKt.c(prompt, (j1.d)null, w.a((z0.d)s2).b.k(), 0L, (k)null, (o)null, (n2.g)null, 0L, (t2.g)null, (f)null, 0L, 0, false, 0, (l)null, (i2.p)null, (z0.d)s2, 0, 0, 65530);
            b.u(s2, false, false, true, false);
            s2.S(false);
            s2.A(511388516);
            final boolean m2 = s2.m((Object)l);
            final boolean m3 = s2.m((Object)boolean1);
            Object d6 = s2.d0();
            if ((m3 | m2) || d6 == d$a.a) {
                d6 = new BooleanFieldKt$BooleanField$2$2$1((l)l, boolean1);
                s2.J0(d6);
            }
            s2.S(false);
            SwitchKt.a(boolean1, (l)d6, (j1.d)null, false, (o0.j)null, (z0.d)s2, 0, 28);
            b.u(s2, false, false, true, false);
            s2.S(false);
            final p0 v = s2.V();
            if (v != null) {
                v.d = (p)new BooleanFieldKt$BooleanField$3(d, s, (l)l, n);
            }
            return;
        }
        a01.a.L();
        throw null;
    }
}

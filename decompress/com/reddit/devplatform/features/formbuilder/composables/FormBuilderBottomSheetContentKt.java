// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devplatform.features.formbuilder.composables;

import z0.p0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import c2.v;
import z0.d$a$a;
import mg2.q;
import androidx.compose.runtime.ComposerImpl;
import com.reddit.ui.compose.ds.ButtonSize;
import com.reddit.ui.compose.ds.ButtonKt;
import g32.f$g;
import androidx.compose.foundation.layout.SizeKt;
import j1.a$b;
import p0.z;
import com.reddit.ui.compose.components.gridview.LazyListState;
import com.reddit.ui.compose.components.gridview.LazyDslKt;
import t2.f;
import n2.g;
import n2.k;
import com.reddit.ui.compose.ds.TextKt;
import g32.w;
import mg2.p;
import androidx.compose.runtime.Updater;
import z0.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.k1;
import androidx.compose.ui.unit.LayoutDirection;
import z0.m0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import u2.b;
import androidx.compose.foundation.layout.a$k;
import androidx.compose.foundation.layout.ColumnKt;
import j1.a$a;
import vl.a;
import i1.o;
import z0.d$a;
import androidx.compose.runtime.ComposerKt;
import ng2.e;
import z0.d;
import cg2.j;
import java.util.Map;
import mg2.l;
import com.reddit.devvit.actor.user_configurable.UserConfigurableOuterClass$ConfigForm;

public final class FormBuilderBottomSheetContentKt
{
    public static final void a(final String s, final UserConfigurableOuterClass$ConfigForm userConfigurableOuterClass$ConfigForm, final l<? super Map<String, String>, j> l, final d d, final int n) {
        e.f((Object)s, "formDescription");
        e.f((Object)userConfigurableOuterClass$ConfigForm, "configForm");
        e.f((Object)l, "onOkClicked");
        final ComposerImpl s2 = d.s(1890646669);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (s2.m((Object)s)) {
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
            if (s2.m((Object)userConfigurableOuterClass$ConfigForm)) {
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
            if (s2.m((Object)l)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n4 | n7);
        }
        if ((n6 & 0x2DB) == 0x92 && s2.d()) {
            s2.j();
        }
        else {
            final q a = ComposerKt.a;
            s2.A(-492369756);
            final Object d2 = s2.d0();
            final d$a$a a2 = d$a.a;
            o o;
            if ((o = (o)d2) == a2) {
                o = new o();
                s2.J0((Object)o);
            }
            s2.S(false);
            final o o2 = o;
            final j1.d.a f = j1.d.a.f;
            final float n8 = 16;
            final j1.d k = a01.a.K(a01.a.Q(vl.a.O2((j1.d)f, n8)));
            s2.A(-483455358);
            final v a3 = ColumnKt.a((a$k)androidx.compose.foundation.layout.a.c, a$a.m, (d)s2);
            s2.A(-1323940314);
            final b b = (b)s2.u((m0)CompositionLocalsKt.e);
            final LayoutDirection layoutDirection = (LayoutDirection)s2.u((m0)CompositionLocalsKt.k);
            final k1 k2 = (k1)s2.u((m0)CompositionLocalsKt.o);
            ComposeUiNode.M2.getClass();
            final mg2.a<ComposeUiNode> b2 = ComposeUiNode.Companion.b;
            final ComposableLambdaImpl b3 = LayoutKt.b(k);
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
            Updater.b((d)s2, (Object)a3, (p)ComposeUiNode.Companion.e);
            Updater.b((d)s2, (Object)b, (p)ComposeUiNode.Companion.d);
            Updater.b((d)s2, (Object)layoutDirection, (p)ComposeUiNode.Companion.f);
            a.w(0, b3, android.support.v4.media.a.u(s2, k2, (p)ComposeUiNode.Companion.g, s2), s2, 2058660585, -1163856341);
            final float n9 = 8;
            TextKt.c(s, vl.a.S2((j1.d)f, 0.0f, 0.0f, 0.0f, n9, 7), 0L, 0L, (k)null, (n2.o)null, (g)null, 0L, (t2.g)null, (f)null, 0L, 0, false, 0, (l)null, w.b((d)s2).o, (d)s2, (n6 & 0xE) | 0x30, 0, 32764);
            s2.A(511388516);
            final boolean m = s2.m((Object)userConfigurableOuterClass$ConfigForm);
            final boolean i = s2.m((Object)o2);
            final Object d3 = s2.d0();
            Object o3;
            if ((m | i) || (o3 = d3) == a2) {
                o3 = new FormBuilderBottomSheetContentKt$FormBuilderBottomSheetContent$1$1$1(userConfigurableOuterClass$ConfigForm, o2);
                s2.J0(o3);
            }
            s2.S(false);
            LazyDslKt.a((j1.d)null, (LazyListState)null, (z)null, false, (a$k)null, (a$b)null, (n0.d)null, (l)o3, (d)s2, 0, 127);
            final j1.d j = SizeKt.j(vl.a.S2((j1.d)f, 0.0f, n8, 0.0f, n9, 5));
            final f$g a4 = f$g.a;
            s2.A(511388516);
            final boolean m2 = s2.m((Object)l);
            final boolean m3 = s2.m((Object)o2);
            final Object d4 = s2.d0();
            Object o4;
            if ((m2 | m3) || (o4 = d4) == a2) {
                o4 = new FormBuilderBottomSheetContentKt$FormBuilderBottomSheetContent$1$2$1((l)l, o2);
                s2.J0(o4);
            }
            s2.S(false);
            ButtonKt.a((mg2.a)o4, j, (p)ComposableSingletons$FormBuilderBottomSheetContentKt.a, (p)null, false, false, (p)null, (o0.j)null, (g32.f)a4, (ButtonSize)null, (d)s2, 134218160, 760);
            b.u(s2, false, false, true, false);
            s2.S(false);
        }
        final p0 v = s2.V();
        if (v != null) {
            v.d = (p)new FormBuilderBottomSheetContentKt$FormBuilderBottomSheetContent$2(s, userConfigurableOuterClass$ConfigForm, (l)l, n);
        }
    }
}

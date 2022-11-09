// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devplatform.features.formbuilder.composables;

import z0.r0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import c2.s;
import z0.d$a$a;
import zg2.q;
import androidx.compose.runtime.ComposerImpl;
import com.reddit.ui.compose.ds.ButtonSize;
import zg2.p;
import com.reddit.ui.compose.ds.ButtonKt;
import u32.f$g;
import androidx.compose.foundation.layout.SizeKt;
import j1.a$b;
import p0.z;
import com.reddit.ui.compose.components.gridview.LazyListState;
import com.reddit.ui.compose.components.gridview.LazyDslKt;
import t2.e;
import n2.g;
import n2.m;
import n2.k;
import com.reddit.ui.compose.ds.TextKt;
import u32.w;
import androidx.compose.runtime.Updater;
import z0.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.k1;
import androidx.compose.ui.unit.LayoutDirection;
import z0.o0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import u2.b;
import androidx.compose.foundation.layout.ColumnKt;
import j1.a$a;
import at1.a;
import i1.o;
import z0.d$a;
import androidx.compose.runtime.ComposerKt;
import ah2.f;
import z0.d;
import pg2.j;
import java.util.Map;
import zg2.l;
import com.reddit.devvit.actor.user_configurable.UserConfigurableOuterClass$ConfigForm;

public final class FormBuilderBottomSheetContentKt
{
    public static final void a(final String s, final UserConfigurableOuterClass$ConfigForm userConfigurableOuterClass$ConfigForm, final l<? super Map<String, String>, j> l, final d d, final int n) {
        f.f((Object)s, "formDescription");
        f.f((Object)userConfigurableOuterClass$ConfigForm, "configForm");
        f.f((Object)l, "onOkClicked");
        final ComposerImpl r = d.r(1890646669);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (r.l((Object)s)) {
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
            if (r.l((Object)userConfigurableOuterClass$ConfigForm)) {
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
            if (r.l((Object)l)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n4 | n7);
        }
        if ((n6 & 0x2DB) == 0x92 && r.b()) {
            r.j();
        }
        else {
            final q a = ComposerKt.a;
            r.A(-492369756);
            final Object c0 = r.c0();
            final d$a$a a2 = d$a.a;
            o o;
            if ((o = (o)c0) == a2) {
                o = new o();
                r.I0((Object)o);
            }
            r.R(false);
            final o o2 = o;
            final j1.d.a f = j1.d.a.f;
            final float n8 = 16;
            final j1.d r2 = gn.a.r1(gn.a.H1(at1.a.p1((j1.d)f, n8)));
            r.A(-483455358);
            final s a3 = ColumnKt.a((androidx.compose.foundation.layout.a.k)androidx.compose.foundation.layout.a.c, a$a.m, (d)r);
            r.A(-1323940314);
            final b b = (b)r.t((o0)CompositionLocalsKt.e);
            final LayoutDirection layoutDirection = (LayoutDirection)r.t((o0)CompositionLocalsKt.k);
            final k1 k1 = (k1)r.t((o0)CompositionLocalsKt.o);
            ComposeUiNode.w2.getClass();
            final zg2.a b2 = ComposeUiNode$Companion.b;
            final ComposableLambdaImpl b3 = LayoutKt.b(r2);
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
            Updater.b((d)r, (Object)a3, ComposeUiNode$Companion.e);
            Updater.b((d)r, (Object)b, ComposeUiNode$Companion.d);
            Updater.b((d)r, (Object)layoutDirection, ComposeUiNode$Companion.f);
            b.p(0, b3, a.m(r, k1, ComposeUiNode$Companion.g, r), r, 2058660585, -1163856341);
            final float n9 = 8;
            TextKt.c(s, at1.a.t1((j1.d)f, 0.0f, 0.0f, 0.0f, n9, 7), 0L, 0L, (k)null, (m)null, (g)null, 0L, (e)null, (t2.d)null, 0L, 0, false, 0, (l)null, w.b((d)r).o, (d)r, (n6 & 0xE) | 0x30, 0, 32764);
            final ComposerImpl composerImpl = r;
            composerImpl.A(511388516);
            final boolean i = composerImpl.l((Object)userConfigurableOuterClass$ConfigForm);
            final boolean j = composerImpl.l((Object)o2);
            final Object c2 = composerImpl.c0();
            Object o3;
            if ((i | j) || (o3 = c2) == a2) {
                o3 = new FormBuilderBottomSheetContentKt$FormBuilderBottomSheetContent$1$1$1(userConfigurableOuterClass$ConfigForm, o2);
                composerImpl.I0(o3);
            }
            composerImpl.R(false);
            LazyDslKt.a((j1.d)null, (LazyListState)null, (z)null, false, (androidx.compose.foundation.layout.a.k)null, (a$b)null, (n0.d)null, (l)o3, (d)composerImpl, 0, 127);
            final j1.d m = SizeKt.j(at1.a.t1((j1.d)f, 0.0f, n8, 0.0f, n9, 5));
            final f$g a4 = f$g.a;
            composerImpl.A(511388516);
            final boolean l2 = composerImpl.l((Object)l);
            final boolean l3 = composerImpl.l((Object)o2);
            final Object c3 = composerImpl.c0();
            Object o4;
            if ((l2 | l3) || (o4 = c3) == a2) {
                o4 = new FormBuilderBottomSheetContentKt$FormBuilderBottomSheetContent$1$2$1((l)l, o2);
                composerImpl.I0(o4);
            }
            composerImpl.R(false);
            ButtonKt.a((zg2.a)o4, m, (p)ComposableSingletons$FormBuilderBottomSheetContentKt.a, (p)null, false, false, (p)null, (o0.j)null, (u32.f)a4, (ButtonSize)null, (d)composerImpl, 134218160, 760);
            d.x(composerImpl, false, false, true, false);
            composerImpl.R(false);
        }
        final r0 u = r.U();
        if (u != null) {
            u.d = (p<? super d, ? super Integer, j>)new FormBuilderBottomSheetContentKt$FormBuilderBottomSheetContent$2(s, userConfigurableOuterClass$ConfigForm, (l)l, n);
        }
    }
}

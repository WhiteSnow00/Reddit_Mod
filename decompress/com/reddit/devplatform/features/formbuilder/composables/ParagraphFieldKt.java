// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devplatform.features.formbuilder.composables;

import z0.p0;
import mg2.q;
import androidx.compose.runtime.ComposerImpl;
import v0.f;
import v0.g;
import o2.x;
import com.reddit.ui.compose.ds.TextAreaBackground;
import com.reddit.ui.compose.ds.TextInputStatus;
import mg2.p;
import g32.d0;
import g32.e0;
import com.reddit.ui.compose.ds.TextInputKt;
import g32.d0$c;
import g32.e0$b;
import kotlin.jvm.internal.Lambda;
import g32.w;
import vl.a;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposerKt;
import ng2.e;
import cg2.j;
import mg2.l;
import s80.d;

public final class ParagraphFieldKt
{
    public static final void a(final d d, final String s, final l<? super String, j> l, final z0.d d2, final int n) {
        e.f((Object)d, "field");
        e.f((Object)s, "value");
        e.f((Object)l, "onValueChange");
        final ComposerImpl s2 = d2.s(-551890975);
        final q a = ComposerKt.a;
        final j1.d e = SizeKt.e(vl.a.S2(SizeKt.i((j1.d)j1.d.a.f, 1.0f), 0.0f, 0.0f, 0.0f, (float)4, 7), 0.0f, u2.j.c(w.b((z0.d)s2).n.b.c) * 2 + u2.j.c(w.b((z0.d)s2).p.b.c) + 36, 1);
        final e0$b e0$b = new e0$b(xd.a.C((z0.d)s2, -273352014, (Lambda)new ParagraphFieldKt$ParagraphField$1(d)));
        final d0$c a2 = d0$c.a;
        final int n2 = n >> 3;
        TextInputKt.b(s, (l)l, (String)null, (e0)e0$b, e, false, (d0)a2, (p)null, (TextInputStatus)null, (p)null, (Integer)null, (TextAreaBackground)null, (x)null, (g)null, (f)null, (o0.j)null, (z0.d)s2, (n2 & 0xE) | 0x200180 | (n2 & 0x70) | 0x0, 0, 65440);
        final p0 v = s2.V();
        if (v != null) {
            v.d = (p)new ParagraphFieldKt$ParagraphField$2(d, s, (l)l, n);
        }
    }
}

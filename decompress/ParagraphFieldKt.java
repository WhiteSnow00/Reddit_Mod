// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devplatform.features.formbuilder.composables;

import z0.r0;
import zg2.q;
import androidx.compose.runtime.ComposerImpl;
import v0.g;
import v0.h;
import o2.y;
import com.reddit.ui.compose.ds.TextAreaBackground;
import com.reddit.ui.compose.ds.TextInputStatus;
import zg2.p;
import u32.d0;
import u32.e0;
import com.reddit.ui.compose.ds.TextInputKt;
import u32.d0$c;
import u32.e0$b;
import kotlin.jvm.internal.Lambda;
import u32.w;
import at1.a;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposerKt;
import ah2.f;
import pg2.j;
import zg2.l;
import a90.d;

public final class ParagraphFieldKt
{
    public static final void a(final d d, final String s, final l<? super String, j> l, final z0.d d2, final int n) {
        f.f((Object)d, "field");
        f.f((Object)s, "value");
        f.f((Object)l, "onValueChange");
        final ComposerImpl r = d2.r(-551890975);
        final q a = ComposerKt.a;
        final j1.d e = SizeKt.e(at1.a.t1(SizeKt.i((j1.d)j1.d.a.f, 1.0f), 0.0f, 0.0f, 0.0f, (float)4, 7), 0.0f, u2.j.c(w.b((z0.d)r).n.b.c) * 2 + u2.j.c(w.b((z0.d)r).p.b.c) + 36, 1);
        final e0$b e0$b = new e0$b(at1.a.a0((z0.d)r, -273352014, (Lambda)new ParagraphFieldKt$ParagraphField$1(d)));
        final d0$c a2 = d0$c.a;
        final int n2 = n >> 3;
        TextInputKt.b(s, (l)l, (String)null, (e0)e0$b, e, false, (d0)a2, (p)null, (TextInputStatus)null, (p)null, (Integer)null, (TextAreaBackground)null, (y)null, (h)null, (g)null, (o0.j)null, (z0.d)r, (n2 & 0xE) | 0x200180 | (n2 & 0x70) | 0x0, 0, 65440);
        final r0 u = r.U();
        if (u != null) {
            u.d = (p<? super z0.d, ? super Integer, j>)new ParagraphFieldKt$ParagraphField$2(d, s, (l)l, n);
        }
    }
}

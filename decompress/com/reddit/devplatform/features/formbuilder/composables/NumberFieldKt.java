// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devplatform.features.formbuilder.composables;

import z0.p0;
import mg2.q;
import androidx.compose.runtime.ComposerImpl;
import v0.f;
import o2.x;
import com.reddit.ui.compose.ds.TextInputStatus;
import g32.f0;
import mg2.p;
import com.reddit.ui.compose.ds.AndroidTextInputKt;
import v0.g;
import g32.f0$b;
import kotlin.jvm.internal.Lambda;
import vl.a;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposerKt;
import ng2.e;
import cg2.j;
import mg2.l;
import s80.d;

public final class NumberFieldKt
{
    public static final void a(final d d, final String s, final l<? super String, j> l, final z0.d d2, final int n) {
        e.f((Object)d, "field");
        e.f((Object)s, "value");
        e.f((Object)l, "onValueChange");
        final ComposerImpl s2 = d2.s(-1500780409);
        final q a = ComposerKt.a;
        final j1.d s3 = vl.a.S2(SizeKt.i((j1.d)j1.d.a.f, 1.0f), 0.0f, 0.0f, 0.0f, (float)4, 7);
        final f0$b f0$b = new f0$b("", xd.a.C((z0.d)s2, 1895361721, (Lambda)new NumberFieldKt$NumberField$1(d)));
        final g g = new g(0, 3, 0, 11);
        final int n2 = n >> 3;
        AndroidTextInputKt.c(s, (l)l, s3, false, (p)null, (p)null, (p)null, (f0)f0$b, (p)null, (p)null, (TextInputStatus)null, (x)null, g, (f)null, (o0.j)null, (z0.d)s2, (n2 & 0xE) | 0x361B6180 | (n2 & 0x70) | 0x0, 0, 27656);
        final p0 v = s2.V();
        if (v != null) {
            v.d = (p)new NumberFieldKt$NumberField$2(d, s, (l)l, n);
        }
    }
}

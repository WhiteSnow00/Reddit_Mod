// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devplatform.features.formbuilder.composables;

import z0.r0;
import zg2.q;
import androidx.compose.runtime.ComposerImpl;
import v0.g;
import o2.y;
import com.reddit.ui.compose.ds.TextInputStatus;
import u32.f0;
import zg2.p;
import com.reddit.ui.compose.ds.AndroidTextInputKt;
import v0.h;
import u32.f0$b;
import kotlin.jvm.internal.Lambda;
import at1.a;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposerKt;
import ah2.f;
import pg2.j;
import zg2.l;
import a90.d;

public final class NumberFieldKt
{
    public static final void a(final d d, final String s, final l<? super String, j> l, final z0.d d2, final int n) {
        f.f((Object)d, "field");
        f.f((Object)s, "value");
        f.f((Object)l, "onValueChange");
        final ComposerImpl r = d2.r(-1500780409);
        final q a = ComposerKt.a;
        final j1.d t1 = at1.a.t1(SizeKt.i((j1.d)j1.d.a.f, 1.0f), 0.0f, 0.0f, 0.0f, (float)4, 7);
        final f0$b f0$b = new f0$b("", at1.a.a0((z0.d)r, 1895361721, (Lambda)new NumberFieldKt$NumberField$1(d)));
        final h h = new h(0, 3, 0, 11);
        final int n2 = n >> 3;
        AndroidTextInputKt.c(s, (l)l, t1, false, (p)null, (p)null, (p)null, (f0)f0$b, (p)null, (p)null, (TextInputStatus)null, (y)null, h, (g)null, (o0.j)null, (z0.d)r, (n2 & 0xE) | 0x361B6180 | (n2 & 0x70) | 0x0, 0, 27656);
        final r0 u = r.U();
        if (u != null) {
            u.d = (p<? super z0.d, ? super Integer, j>)new NumberFieldKt$NumberField$2(d, s, (l)l, n);
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.accompanist.insets;

import pg2.j;
import z0.r0;
import androidx.compose.runtime.ComposerImpl;
import kotlin.jvm.internal.Lambda;
import z0.p0;
import zg2.l;
import z0.s;
import da.h;
import z0.d$a;
import z0.o0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import android.view.View;
import ah2.f;
import zg2.p;
import z0.d;
import zg2.a;
import androidx.compose.runtime.CompositionLocalKt;
import z0.f1;

public final class WindowInsetsKt
{
    public static final f1 a;
    
    static {
        a = CompositionLocalKt.d((a)WindowInsetsKt$LocalWindowInsets$1.INSTANCE);
    }
    
    public static final void a(final int n, final int n2, final d d, final p p4, boolean b, boolean b2) {
        f.f((Object)p4, "content");
        final ComposerImpl r = d.r(-184522253);
        final int n3 = n2 & 0x1;
        int n4;
        if (n3 != 0) {
            n4 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n5;
            if (r.m(b)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n4 = (n5 | n);
        }
        else {
            n4 = n;
        }
        final int n6 = n2 & 0x2;
        int n7;
        if (n6 != 0) {
            n7 = (n4 | 0x30);
        }
        else {
            n7 = n4;
            if ((n & 0x70) == 0x0) {
                int n8;
                if (r.m(b2)) {
                    n8 = 32;
                }
                else {
                    n8 = 16;
                }
                n7 = (n4 | n8);
            }
        }
        int n9;
        if ((n2 & 0x4) != 0x0) {
            n9 = (n7 | 0x180);
        }
        else {
            n9 = n7;
            if ((n & 0x380) == 0x0) {
                int n10;
                if (r.l((Object)p4)) {
                    n10 = 256;
                }
                else {
                    n10 = 128;
                }
                n9 = (n7 | n10);
            }
        }
        if ((n9 & 0x2DB) == 0x92 && r.b()) {
            r.j();
        }
        else {
            if (n3 != 0) {
                b = true;
            }
            if (n6 != 0) {
                b2 = true;
            }
            final View view = (View)r.t((o0)AndroidCompositionLocals_androidKt.f);
            r.A(-492369756);
            Object c0;
            if ((c0 = r.c0()) == d$a.a) {
                c0 = new h();
                r.I0(c0);
            }
            r.R(false);
            final h h = (h)c0;
            s.c(view, (l)new WindowInsetsKt$ProvideWindowInsets$1(view, h, b, b2), (d)r);
            CompositionLocalKt.a(new p0[] { WindowInsetsKt.a.b(h) }, (p)at1.a.a0((d)r, -1033208141, (Lambda)new WindowInsetsKt$ProvideWindowInsets$2(p4, n9)), (d)r, 56);
        }
        final r0 u = r.U();
        if (u != null) {
            u.d = (p<? super d, ? super Integer, j>)new WindowInsetsKt$ProvideWindowInsets$3(b, b2, p4, n, n2);
        }
    }
}

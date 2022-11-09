// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.layout;

import z0.r0;
import z0.d$a$a;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import z0.h0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import pg2.j;
import c2.j0;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import s0.e;
import z0.e1;
import z0.d$a;
import androidx.compose.runtime.saveable.c;
import c2.t;
import u2.a;
import s0.f;
import zg2.p;
import s0.h;
import s0.d;

public final class LazyLayoutKt
{
    public static final void a(final d d, j1.d f, h h, final p<? super f, ? super a, ? extends t> p7, final z0.d d2, final int n, final int n2) {
        ah2.f.f((Object)d, "itemProvider");
        ah2.f.f((Object)p7, "measurePolicy");
        final ComposerImpl r = d2.r(852831187);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (r.l((Object)d)) {
                n4 = 4;
            }
            else {
                n4 = 2;
            }
            n3 = (n4 | n);
        }
        else {
            n3 = n;
        }
        final int n5 = n2 & 0x2;
        int n8 = 0;
        Label_0147: {
            int n6;
            if (n5 != 0) {
                n6 = (n3 | 0x30);
            }
            else {
                n6 = n3;
                if ((n & 0x70) == 0x0) {
                    int n7;
                    if (r.l((Object)f)) {
                        n7 = 32;
                    }
                    else {
                        n7 = 16;
                    }
                    n8 = (n3 | n7);
                    break Label_0147;
                }
            }
            n8 = n6;
        }
        final int n9 = n2 & 0x4;
        int n12 = 0;
        Label_0218: {
            int n10;
            if (n9 != 0) {
                n10 = (n8 | 0x180);
            }
            else {
                n10 = n8;
                if ((n & 0x380) == 0x0) {
                    int n11;
                    if (r.l((Object)h)) {
                        n11 = 256;
                    }
                    else {
                        n11 = 128;
                    }
                    n12 = (n8 | n11);
                    break Label_0218;
                }
            }
            n12 = n10;
        }
        int n13;
        if ((n2 & 0x8) != 0x0) {
            n13 = (n12 | 0xC00);
        }
        else {
            n13 = n12;
            if ((n & 0x1C00) == 0x0) {
                int n14;
                if (r.l((Object)p7)) {
                    n14 = 2048;
                }
                else {
                    n14 = 1024;
                }
                n13 = (n12 | n14);
            }
        }
        h h2;
        j1.d d4;
        if ((n13 & 0x16DB) == 0x492 && r.b()) {
            r.j();
            final j1.d d3 = f;
            h2 = h;
            d4 = d3;
        }
        else {
            if (n5 != 0) {
                f = (j1.d)j1.d.a.f;
            }
            if (n9 != 0) {
                h = null;
            }
            final h0 v0 = a80.a.v0(d, (z0.d)r);
            final SaveableStateHolderImpl a = c.a((z0.d)r);
            r.A(-492369756);
            final Object c0 = r.c0();
            final d$a$a a2 = d$a.a;
            androidx.compose.foundation.lazy.layout.a a3;
            if ((a3 = (androidx.compose.foundation.lazy.layout.a)c0) == a2) {
                a3 = new androidx.compose.foundation.lazy.layout.a(a, (zg2.a)new LazyLayoutKt$LazyLayout$itemContentFactory$1.LazyLayoutKt$LazyLayout$itemContentFactory$1$1((e1)v0));
                r.I0((Object)a3);
            }
            r.R(false);
            final androidx.compose.foundation.lazy.layout.a a4 = a3;
            r.A(-492369756);
            Object c2;
            if ((c2 = r.c0()) == a2) {
                c2 = new SubcomposeLayoutState((j0)new e(a4));
                r.I0(c2);
            }
            r.R(false);
            final SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState)c2;
            r.A(617316839);
            if (h != null) {
                LazyLayoutPrefetcher_androidKt.a(h, a4, subcomposeLayoutState, (z0.d)r, (n13 >> 6 & 0xE) | 0x40 | 0x200);
                final j a5 = j.a;
            }
            r.R(false);
            r.A(511388516);
            final boolean l = r.l((Object)a4);
            final boolean i = r.l((Object)p7);
            final Object c3 = r.c0();
            Object o;
            if ((l | i) || (o = c3) == a2) {
                o = new LazyLayoutKt$LazyLayout$2.LazyLayoutKt$LazyLayout$2$1(a4, (p)p7);
                r.I0(o);
            }
            r.R(false);
            SubcomposeLayoutKt.b(subcomposeLayoutState, f, (p)o, (z0.d)r, (n13 & 0x70) | 0x8, 0);
            final j1.d d5 = f;
            h2 = h;
            d4 = d5;
        }
        final r0 u = r.U();
        if (u != null) {
            u.d = (p<? super z0.d, ? super Integer, j>)new LazyLayoutKt$LazyLayout.LazyLayoutKt$LazyLayout$3(d, d4, h2, (p)p7, n, n2);
        }
    }
}

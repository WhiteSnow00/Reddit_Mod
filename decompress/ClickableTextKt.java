// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text;

import z0.r0;
import z0.d$a$a;
import androidx.compose.runtime.ComposerImpl;
import java.util.Map;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import lg2.c;
import z0.h0;
import z0.d$a;
import sg2.e;
import hg2.j;
import i2.n;
import rg2.l;
import i2.p;
import j1.d;
import i2.a;

public final class ClickableTextKt
{
    public static final void a(final a a, d f, p c, boolean b, int n, int n2, l<? super n, j> instance, final l<? super Integer, j> l, final z0.d d, final int n3, final int n4) {
        e.f((Object)a, "text");
        e.f((Object)l, "onClick");
        final ComposerImpl s = d.s(-246609449);
        int n5;
        if ((n4 & 0x1) != 0x0) {
            n5 = (n3 | 0x6);
        }
        else if ((n3 & 0xE) == 0x0) {
            int n6;
            if (s.m((Object)a)) {
                n6 = 4;
            }
            else {
                n6 = 2;
            }
            n5 = (n6 | n3);
        }
        else {
            n5 = n3;
        }
        final int n7 = n4 & 0x2;
        int n10 = 0;
        Label_0148: {
            int n8;
            if (n7 != 0) {
                n8 = (n5 | 0x30);
            }
            else {
                n8 = n5;
                if ((n3 & 0x70) == 0x0) {
                    int n9;
                    if (s.m((Object)f)) {
                        n9 = 32;
                    }
                    else {
                        n9 = 16;
                    }
                    n10 = (n5 | n9);
                    break Label_0148;
                }
            }
            n10 = n8;
        }
        final int n11 = n4 & 0x4;
        int n14 = 0;
        Label_0219: {
            int n12;
            if (n11 != 0) {
                n12 = (n10 | 0x180);
            }
            else {
                n12 = n10;
                if ((n3 & 0x380) == 0x0) {
                    int n13;
                    if (s.m((Object)c)) {
                        n13 = 256;
                    }
                    else {
                        n13 = 128;
                    }
                    n14 = (n10 | n13);
                    break Label_0219;
                }
            }
            n14 = n12;
        }
        final int n15 = n4 & 0x8;
        int n18 = 0;
        Label_0291: {
            int n16;
            if (n15 != 0) {
                n16 = (n14 | 0xC00);
            }
            else {
                n16 = n14;
                if ((n3 & 0x1C00) == 0x0) {
                    int n17;
                    if (s.n(b)) {
                        n17 = 2048;
                    }
                    else {
                        n17 = 1024;
                    }
                    n18 = (n14 | n17);
                    break Label_0291;
                }
            }
            n18 = n16;
        }
        final int n19 = n4 & 0x10;
        int n20;
        if (n19 != 0) {
            n20 = (n18 | 0x6000);
        }
        else {
            n20 = n18;
            if ((n3 & 0xE000) == 0x0) {
                int n21;
                if (s.q(n)) {
                    n21 = 16384;
                }
                else {
                    n21 = 8192;
                }
                n20 = (n18 | n21);
            }
        }
        final int n22 = n;
        final int n23 = n4 & 0x20;
        if (n23 != 0) {
            n = (n20 | 0x30000);
        }
        else {
            n = n20;
            if ((n3 & 0x70000) == 0x0) {
                if (s.q(n2)) {
                    n = 131072;
                }
                else {
                    n = 65536;
                }
                n |= n20;
            }
        }
        final int n24 = n2;
        final int n25 = n4 & 0x40;
        if (n25 != 0) {
            n2 = (n | 0x180000);
        }
        else {
            n2 = n;
            if ((n3 & 0x380000) == 0x0) {
                if (s.m((Object)instance)) {
                    n2 = 1048576;
                }
                else {
                    n2 = 524288;
                }
                n2 |= n;
            }
        }
        int n26 = 0;
        Label_0547: {
            if ((n4 & 0x80) != 0x0) {
                n = 12582912;
            }
            else {
                n26 = n2;
                if ((0x1C00000 & n3) != 0x0) {
                    break Label_0547;
                }
                if (s.m((Object)l)) {
                    n = 8388608;
                }
                else {
                    n = 4194304;
                }
            }
            n26 = (n2 | n);
        }
        if ((0x16DB6DB & n26) == 0x492492 && s.c()) {
            s.k();
            n = n22;
            n2 = n24;
        }
        else {
            if (n7 != 0) {
                f = (d)d.a.f;
            }
            if (n11 != 0) {
                c = p.c;
            }
            if (n15 != 0) {
                b = true;
            }
            if (n19 != 0) {
                n = 1;
            }
            else {
                n = n22;
            }
            if (n23 != 0) {
                n2 = Integer.MAX_VALUE;
            }
            else {
                n2 = n24;
            }
            if (n25 != 0) {
                instance = ClickableTextKt$ClickableText$1.INSTANCE;
            }
            s.A(-492369756);
            final Object c2 = s.c0();
            final d$a$a a2 = d$a.a;
            Object t0;
            if ((t0 = c2) == a2) {
                t0 = bg.d.t0((Object)null);
                s.I0(t0);
            }
            s.R(false);
            final h0 h0 = (h0)t0;
            final d.a f2 = d.a.f;
            s.A(511388516);
            final boolean m = s.m((Object)h0);
            final boolean i = s.m((Object)l);
            final Object c3 = s.c0();
            Object o;
            if ((m | i) || (o = c3) == a2) {
                o = new ClickableTextKt$ClickableText$pressIndicator$1$1(h0, (l)l, (c)null);
                s.I0(o);
            }
            s.R(false);
            final d j0 = f.j0(SuspendingPointerInputFilterKt.b((d)f2, (Object)l, (rg2.p)o));
            s.A(511388516);
            final boolean k = s.m((Object)h0);
            final boolean m2 = s.m((Object)instance);
            final Object c4 = s.c0();
            Object o2;
            if ((k | m2) || (o2 = c4) == a2) {
                o2 = new ClickableTextKt$ClickableText$2$1(h0, (l)instance);
                s.I0(o2);
            }
            s.R(false);
            BasicTextKt.a(a, j0, c, (l<? super n, j>)o2, n, b, n2, null, (z0.d)s, (n26 & 0xE) | (n26 & 0x380) | (0xE000 & n26) | (n26 << 6 & 0x70000) | (n26 << 3 & 0x380000), 128);
        }
        final r0 u = s.U();
        if (u != null) {
            u.d = (rg2.p)new ClickableTextKt$ClickableText$3(a, f, c, b, n, n2, (l)instance, (l)l, n3, n4);
        }
    }
}

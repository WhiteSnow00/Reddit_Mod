// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text;

import z0.r0;
import z0.d$a$a;
import androidx.compose.runtime.ComposerImpl;
import java.util.Map;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import tg2.c;
import z0.h0;
import z0.d$a;
import ah2.f;
import pg2.j;
import i2.n;
import zg2.l;
import i2.p;
import j1.d;
import i2.a;

public final class ClickableTextKt
{
    public static final void a(final a a, d f, p c, boolean b, int n, int n2, l<? super n, j> instance, final l<? super Integer, j> l, final z0.d d, final int n3, final int n4) {
        f.f((Object)a, "text");
        f.f((Object)l, "onClick");
        final ComposerImpl r = d.r(-246609449);
        int n5;
        if ((n4 & 0x1) != 0x0) {
            n5 = (n3 | 0x6);
        }
        else if ((n3 & 0xE) == 0x0) {
            int n6;
            if (r.l((Object)a)) {
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
                    if (r.l((Object)f)) {
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
                    if (r.l((Object)c)) {
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
                    if (r.m(b)) {
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
                if (r.p(n)) {
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
        int n24;
        if (n23 != 0) {
            n24 = (n20 | 0x30000);
        }
        else {
            n24 = n20;
            if ((n3 & 0x70000) == 0x0) {
                if (r.p(n2)) {
                    n = 131072;
                }
                else {
                    n = 65536;
                }
                n24 = (n20 | n);
            }
        }
        final int n25 = n4 & 0x40;
        if (n25 != 0) {
            n = (n24 | 0x180000);
        }
        else {
            n = n24;
            if ((n3 & 0x380000) == 0x0) {
                if (r.l((Object)instance)) {
                    n = 1048576;
                }
                else {
                    n = 524288;
                }
                n |= n24;
            }
        }
        int n27 = 0;
        Label_0543: {
            int n26;
            if ((n4 & 0x80) != 0x0) {
                n26 = 12582912;
            }
            else {
                n27 = n;
                if ((0x1C00000 & n3) != 0x0) {
                    break Label_0543;
                }
                if (r.l((Object)l)) {
                    n26 = 8388608;
                }
                else {
                    n26 = 4194304;
                }
            }
            n27 = (n | n26);
        }
        l<? super n, j> i;
        p p12;
        if ((0x16DB6DB & n27) == 0x492492 && r.b()) {
            r.j();
            final p p11 = c;
            i = (l<? super n, j>)instance;
            n = n22;
            p12 = p11;
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
            if (n25 != 0) {
                instance = ClickableTextKt$ClickableText$1.INSTANCE;
            }
            r.A(-492369756);
            final Object c2 = r.c0();
            final d$a$a a2 = d$a.a;
            Object n28;
            if ((n28 = c2) == a2) {
                n28 = a80.a.n0(null);
                r.I0(n28);
            }
            r.R(false);
            final h0 h0 = (h0)n28;
            final d.a f2 = d.a.f;
            r.A(511388516);
            final boolean j = r.l((Object)h0);
            final boolean k = r.l((Object)l);
            final Object c3 = r.c0();
            Object o;
            if ((j | k) || (o = c3) == a2) {
                o = new ClickableTextKt$ClickableText$pressIndicator$1.ClickableTextKt$ClickableText$pressIndicator$1$1(h0, (l)l, (c)null);
                r.I0(o);
            }
            r.R(false);
            final d f3 = f.f0(SuspendingPointerInputFilterKt.b((d)f2, (Object)l, (zg2.p)o));
            r.A(511388516);
            final boolean m = r.l((Object)h0);
            final boolean l2 = r.l((Object)instance);
            final Object c4 = r.c0();
            Object o2;
            if ((m | l2) || (o2 = c4) == a2) {
                o2 = new ClickableTextKt$ClickableText$2$1(h0, (l)instance);
                r.I0(o2);
            }
            r.R(false);
            BasicTextKt.a(a, f3, c, (l<? super n, j>)o2, n, b, n2, null, (z0.d)r, (n27 & 0xE) | (n27 & 0x380) | (0xE000 & n27) | (n27 << 6 & 0x70000) | (n27 << 3 & 0x380000), 128);
            final l<? super n, j> l3 = (l<? super n, j>)instance;
            p12 = c;
            i = l3;
        }
        final r0 u = r.U();
        if (u != null) {
            u.d = (zg2.p<? super z0.d, ? super Integer, j>)new ClickableTextKt$ClickableText$3(a, f, p12, b, n, n2, (l)i, (l)l, n3, n4);
        }
    }
}

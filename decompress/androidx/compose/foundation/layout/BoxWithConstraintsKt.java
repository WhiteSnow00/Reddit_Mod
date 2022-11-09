// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.layout;

import z0.r0;
import c2.s;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import zg2.p;
import z0.d$a;
import j1.a$a;
import ah2.f;
import pg2.j;
import p0.g;
import zg2.q;
import j1.a;
import j1.d;

public final class BoxWithConstraintsKt
{
    public static final void a(d f, a a, boolean b, final q<? super g, ? super z0.d, ? super Integer, j> q, final z0.d d, final int n, final int n2) {
        f.f((Object)q, "content");
        final ComposerImpl r = d.r(1781813501);
        final int n3 = n2 & 0x1;
        int n4;
        if (n3 != 0) {
            n4 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n5;
            if (r.l((Object)f)) {
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
        int n9 = 0;
        Label_0145: {
            int n7;
            if (n6 != 0) {
                n7 = (n4 | 0x30);
            }
            else {
                n7 = n4;
                if ((n & 0x70) == 0x0) {
                    int n8;
                    if (r.l((Object)a)) {
                        n8 = 32;
                    }
                    else {
                        n8 = 16;
                    }
                    n9 = (n4 | n8);
                    break Label_0145;
                }
            }
            n9 = n7;
        }
        final int n10 = n2 & 0x4;
        int n13 = 0;
        Label_0216: {
            int n11;
            if (n10 != 0) {
                n11 = (n9 | 0x180);
            }
            else {
                n11 = n9;
                if ((n & 0x380) == 0x0) {
                    int n12;
                    if (r.m(b)) {
                        n12 = 256;
                    }
                    else {
                        n12 = 128;
                    }
                    n13 = (n9 | n12);
                    break Label_0216;
                }
            }
            n13 = n11;
        }
        int n14;
        if ((n2 & 0x8) != 0x0) {
            n14 = (n13 | 0xC00);
        }
        else {
            n14 = n13;
            if ((n & 0x1C00) == 0x0) {
                int n15;
                if (r.l((Object)q)) {
                    n15 = 2048;
                }
                else {
                    n15 = 1024;
                }
                n14 = (n13 | n15);
            }
        }
        if ((n14 & 0x16DB) == 0x492 && r.b()) {
            r.j();
        }
        else {
            if (n3 != 0) {
                f = (d)d.a.f;
            }
            if (n6 != 0) {
                a = (a)a$a.a;
            }
            if (n10 != 0) {
                b = false;
            }
            final s c = BoxKt.c(a, b, (z0.d)r);
            r.A(511388516);
            final boolean l = r.l((Object)q);
            final boolean i = r.l((Object)c);
            final Object c2 = r.c0();
            Object o;
            if ((l | i) || (o = c2) == d$a.a) {
                o = new BoxWithConstraintsKt$BoxWithConstraints$1$1(c, (q)q, n14);
                r.I0(o);
            }
            r.R(false);
            SubcomposeLayoutKt.a(n14 & 0xE, 0, (z0.d)r, f, (p)o);
        }
        final r0 u = r.U();
        if (u != null) {
            u.d = (p<? super z0.d, ? super Integer, j>)new BoxWithConstraintsKt$BoxWithConstraints$2(f, a, b, (q)q, n, n2);
        }
    }
}

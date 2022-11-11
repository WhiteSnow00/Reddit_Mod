// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text;

import lg.e0;
import t2.c;
import t2.h;
import t2.f;
import kotlin.NoWhenBranchMatchedException;
import t2.d;
import i2.i;
import o1.k0;
import o1.r;
import p2.c$a;
import n2.g;
import n2.k;
import n2.m;
import ej2.c0;
import androidx.compose.ui.text.style.TextDrawStyle;
import i2.l;
import sg2.e;
import androidx.compose.ui.unit.LayoutDirection;
import i2.p;

public final class a
{
    public static final p a(final p p2, final LayoutDirection layoutDirection) {
        e.f((Object)p2, "style");
        e.f((Object)layoutDirection, "direction");
        final i2.k a = p2.a;
        final int e = l.e;
        sg2.e.f((Object)a, "style");
        final TextDrawStyle b = a.a.b((a<? extends TextDrawStyle>)SpanStyleKt$resolveSpanStyleDefaults$1.INSTANCE);
        long n;
        if (c0.A3(a.b)) {
            n = l.a;
        }
        else {
            n = a.b;
        }
        m m;
        if ((m = a.c) == null) {
            m = n2.m.m;
        }
        final k d = a.d;
        int a2;
        if (d != null) {
            a2 = d.a;
        }
        else {
            a2 = 0;
        }
        final k k = new k(a2);
        final n2.l e2 = a.e;
        int a3;
        if (e2 != null) {
            a3 = e2.a;
        }
        else {
            a3 = 1;
        }
        final n2.l l = new n2.l(a3);
        Object o;
        if ((o = a.f) == null) {
            o = g.f;
        }
        String g;
        if ((g = a.g) == null) {
            g = "";
        }
        long n2;
        if (c0.A3(a.h)) {
            n2 = i2.l.b;
        }
        else {
            n2 = a.h;
        }
        final t2.a i = a.i;
        float a4;
        if (i != null) {
            a4 = i.a;
        }
        else {
            a4 = 0.0f;
        }
        final t2.a a5 = new t2.a(a4);
        t2.g g2;
        if ((g2 = a.j) == null) {
            g2 = t2.g.c;
        }
        p2.c c;
        if ((c = a.k) == null) {
            c = c$a.a();
        }
        long n3 = a.l;
        if (n3 == r.l) {
            n3 = i2.l.c;
        }
        t2.e e3;
        if ((e3 = a.m) == null) {
            e3 = t2.e.b;
        }
        k0 k2;
        if ((k2 = a.n) == null) {
            k2 = k0.d;
        }
        final i2.k j = new i2.k(b, n, m, k, l, (g)o, g, n2, a5, g2, c, n3, e3, k2);
        final i2.h b2 = p2.b;
        final int b3 = i2.i.b;
        sg2.e.f((Object)b2, "style");
        final d a6 = b2.a;
        int a7;
        if (a6 != null) {
            a7 = a6.a;
        }
        else {
            a7 = 5;
        }
        final d d2 = new d(a7);
        final f b4 = b2.b;
        boolean b5 = false;
        Label_0476: {
            if (b4 != null) {
                if (b4.a == 3) {
                    b5 = true;
                    break Label_0476;
                }
            }
            b5 = false;
        }
        int a8;
        if (b5) {
            final int n4 = androidx.compose.ui.text.a.a.a[layoutDirection.ordinal()];
            if (n4 != 1) {
                if (n4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                a8 = 5;
            }
            else {
                a8 = 4;
            }
        }
        else if (b4 == null) {
            final int n5 = androidx.compose.ui.text.a.a.a[layoutDirection.ordinal()];
            if (n5 != 1) {
                if (n5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                a8 = 2;
            }
            else {
                a8 = 1;
            }
        }
        else {
            a8 = b4.a;
        }
        final f f = new f(a8);
        long n6;
        if (c0.A3(b2.c)) {
            n6 = i2.i.a;
        }
        else {
            n6 = b2.c;
        }
        h h;
        if ((h = b2.d) == null) {
            h = t2.h.c;
        }
        b2.getClass();
        final i2.h h2 = new i2.h(d2, f, n6, h, null);
        p2.getClass();
        return new p(j, h2, null);
    }
}

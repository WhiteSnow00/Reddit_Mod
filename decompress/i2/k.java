// 
// Decompiled by Procyon v0.6.0
// 

package i2;

import al0.f0;
import hg2.i;
import ej2.c0;
import u2.j;
import o1.r;
import o1.k0;
import t2.e;
import p2.c;
import t2.a;
import n2.g;
import n2.l;
import n2.m;
import androidx.compose.ui.text.style.TextDrawStyle;

public final class k
{
    public final TextDrawStyle a;
    public final long b;
    public final m c;
    public final n2.k d;
    public final l e;
    public final g f;
    public final String g;
    public final long h;
    public final a i;
    public final t2.g j;
    public final c k;
    public final long l;
    public final e m;
    public final k0 n;
    
    public k(final long n, final long n2, final m m, final n2.k k, final l l, final g g, final String s, final long n3, final a a, final t2.g g2, final c c, final long n4, final e e, final k0 k2) {
        this(TextDrawStyle.a.a(n), n2, m, k, l, g, s, n3, a, g2, c, n4, e, k2);
    }
    
    public k(long l, long c, m m, n2.k k, l i, g g, String s, long c2, a a, t2.g g2, c c3, long j, e e, k0 k2, final int n) {
        if ((n & 0x1) != 0x0) {
            l = r.l;
        }
        if ((n & 0x2) != 0x0) {
            c = u2.j.c;
        }
        if ((n & 0x4) != 0x0) {
            m = null;
        }
        if ((n & 0x8) != 0x0) {
            k = null;
        }
        if ((n & 0x10) != 0x0) {
            i = null;
        }
        if ((n & 0x20) != 0x0) {
            g = null;
        }
        if ((n & 0x40) != 0x0) {
            s = null;
        }
        if ((n & 0x80) != 0x0) {
            c2 = u2.j.c;
        }
        if ((n & 0x100) != 0x0) {
            a = null;
        }
        if ((n & 0x200) != 0x0) {
            g2 = null;
        }
        if ((n & 0x400) != 0x0) {
            c3 = null;
        }
        if ((n & 0x800) != 0x0) {
            j = r.l;
        }
        if ((n & 0x1000) != 0x0) {
            e = null;
        }
        if ((n & 0x2000) != 0x0) {
            k2 = null;
        }
        this(l, c, m, k, i, g, s, c2, a, g2, c3, j, e, k2);
    }
    
    public k(final TextDrawStyle a, final long b, final m c, final n2.k d, final l e, final g f, final String g, final long h, final a i, final t2.g j, final c k, final long l, final e m, final k0 n) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
    }
    
    public static k a(final k k, long b, final int n) {
        if ((n & 0x1) != 0x0) {
            b = k.b();
        }
        long l = 0L;
        long b2;
        if ((n & 0x2) != 0x0) {
            b2 = k.b;
        }
        else {
            b2 = 0L;
        }
        m c;
        if ((n & 0x4) != 0x0) {
            c = k.c;
        }
        else {
            c = null;
        }
        n2.k d;
        if ((n & 0x8) != 0x0) {
            d = k.d;
        }
        else {
            d = null;
        }
        l e;
        if ((n & 0x10) != 0x0) {
            e = k.e;
        }
        else {
            e = null;
        }
        g f;
        if ((n & 0x20) != 0x0) {
            f = k.f;
        }
        else {
            f = null;
        }
        String g;
        if ((n & 0x40) != 0x0) {
            g = k.g;
        }
        else {
            g = null;
        }
        long h;
        if ((n & 0x80) != 0x0) {
            h = k.h;
        }
        else {
            h = 0L;
        }
        a i;
        if ((n & 0x100) != 0x0) {
            i = k.i;
        }
        else {
            i = null;
        }
        t2.g j;
        if ((n & 0x200) != 0x0) {
            j = k.j;
        }
        else {
            j = null;
        }
        c m;
        if ((n & 0x400) != 0x0) {
            m = k.k;
        }
        else {
            m = null;
        }
        if ((n & 0x800) != 0x0) {
            l = k.l;
        }
        e m2;
        if ((n & 0x1000) != 0x0) {
            m2 = k.m;
        }
        else {
            m2 = null;
        }
        k0 n2;
        if ((n & 0x2000) != 0x0) {
            n2 = k.n;
        }
        else {
            n2 = null;
        }
        TextDrawStyle textDrawStyle;
        if (r.c(b, k.b())) {
            textDrawStyle = k.a;
        }
        else {
            textDrawStyle = TextDrawStyle.a.a(b);
        }
        return new k(textDrawStyle, b2, c, d, e, f, g, h, i, j, m, l, m2, n2);
    }
    
    public final long b() {
        return this.a.a();
    }
    
    public final boolean c(final k k) {
        sg2.e.f((Object)k, "other");
        return this == k || (u2.j.a(this.b, k.b) && sg2.e.a((Object)this.c, (Object)k.c) && sg2.e.a((Object)this.d, (Object)k.d) && sg2.e.a((Object)this.e, (Object)k.e) && sg2.e.a((Object)this.f, (Object)k.f) && sg2.e.a((Object)this.g, (Object)k.g) && u2.j.a(this.h, k.h) && sg2.e.a((Object)this.i, (Object)k.i) && sg2.e.a((Object)this.j, (Object)k.j) && sg2.e.a((Object)this.k, (Object)k.k) && r.c(this.l, k.l) && sg2.e.a((Object)null, (Object)null));
    }
    
    public final k d(final k k) {
        if (k == null) {
            return this;
        }
        final TextDrawStyle c = this.a.c(k.a);
        g g;
        if ((g = k.f) == null) {
            g = this.f;
        }
        long n;
        if (!c0.A3(k.b)) {
            n = k.b;
        }
        else {
            n = this.b;
        }
        m m;
        if ((m = k.c) == null) {
            m = this.c;
        }
        n2.k i;
        if ((i = k.d) == null) {
            i = this.d;
        }
        l l;
        if ((l = k.e) == null) {
            l = this.e;
        }
        String s;
        if ((s = k.g) == null) {
            s = this.g;
        }
        long n2;
        if (!c0.A3(k.h)) {
            n2 = k.h;
        }
        else {
            n2 = this.h;
        }
        a a;
        if ((a = k.i) == null) {
            a = this.i;
        }
        t2.g g2;
        if ((g2 = k.j) == null) {
            g2 = this.j;
        }
        c c2;
        if ((c2 = k.k) == null) {
            c2 = this.k;
        }
        long n3 = k.l;
        if (n3 == r.l) {
            n3 = this.l;
        }
        e e;
        if ((e = k.m) == null) {
            e = this.m;
        }
        k0 k2;
        if ((k2 = k.n) == null) {
            k2 = this.n;
        }
        return new k(c, n, m, i, l, g, s, n2, a, g2, c2, n3, e, k2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof k)) {
            return false;
        }
        final k k = (k)o;
        if (this.c(k)) {
            boolean b2 = false;
            Label_0086: {
                if (sg2.e.a((Object)this.a, (Object)k.a)) {
                    if (sg2.e.a((Object)this.m, (Object)k.m)) {
                        if (sg2.e.a((Object)this.n, (Object)k.n)) {
                            b2 = true;
                            break Label_0086;
                        }
                    }
                }
                b2 = false;
            }
            if (b2) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    @Override
    public final int hashCode() {
        final long b = this.b();
        final int m = r.m;
        final int a = hg2.i.a(b);
        this.a.d();
        final long b2 = this.b;
        final u2.k[] b3 = u2.j.b;
        final int b4 = b.b(b2, (a * 31 + 0) * 31, 31);
        final m c = this.c;
        int f;
        if (c != null) {
            f = c.f;
        }
        else {
            f = 0;
        }
        final n2.k d = this.d;
        int hashCode;
        if (d != null) {
            hashCode = Integer.hashCode(d.a);
        }
        else {
            hashCode = 0;
        }
        final l e = this.e;
        int hashCode2;
        if (e != null) {
            hashCode2 = Integer.hashCode(e.a);
        }
        else {
            hashCode2 = 0;
        }
        final g f2 = this.f;
        int hashCode3;
        if (f2 != null) {
            hashCode3 = f2.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final String g = this.g;
        int hashCode4;
        if (g != null) {
            hashCode4 = g.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final int b5 = b.b(this.h, (((((b4 + f) * 31 + hashCode) * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31, 31);
        final a i = this.i;
        int hashCode5;
        if (i != null) {
            hashCode5 = Float.hashCode(i.a);
        }
        else {
            hashCode5 = 0;
        }
        final t2.g j = this.j;
        int hashCode6;
        if (j != null) {
            hashCode6 = j.hashCode();
        }
        else {
            hashCode6 = 0;
        }
        final c k = this.k;
        int hashCode7;
        if (k != null) {
            hashCode7 = k.hashCode();
        }
        else {
            hashCode7 = 0;
        }
        final int d2 = al0.a.d(this.l, (((b5 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31, 31);
        final e l = this.m;
        int a2;
        if (l != null) {
            a2 = l.a;
        }
        else {
            a2 = 0;
        }
        final k0 n = this.n;
        int hashCode8;
        if (n != null) {
            hashCode8 = n.hashCode();
        }
        else {
            hashCode8 = 0;
        }
        return f0.a((d2 + a2) * 31, hashCode8, 31, 0);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("SpanStyle(color=");
        r.append((Object)o1.r.i(this.b()));
        r.append(", brush=");
        this.a.d();
        r.append((Object)null);
        r.append(", fontSize=");
        r.append((Object)u2.j.d(this.b));
        r.append(", fontWeight=");
        r.append(this.c);
        r.append(", fontStyle=");
        r.append(this.d);
        r.append(", fontSynthesis=");
        r.append(this.e);
        r.append(", fontFamily=");
        r.append(this.f);
        r.append(", fontFeatureSettings=");
        r.append(this.g);
        r.append(", letterSpacing=");
        r.append((Object)u2.j.d(this.h));
        r.append(", baselineShift=");
        r.append(this.i);
        r.append(", textGeometricTransform=");
        r.append(this.j);
        r.append(", localeList=");
        r.append(this.k);
        r.append(", background=");
        android.support.v4.media.a.q(this.l, r, ", textDecoration=");
        r.append(this.m);
        r.append(", shadow=");
        r.append(this.n);
        r.append(", platformStyle=");
        r.append((Object)null);
        r.append(')');
        return r.toString();
    }
}

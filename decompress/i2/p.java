// 
// Decompiled by Procyon v0.6.0
// 

package i2;

import lg.e0;
import t2.f;
import o1.k0;
import p2.c;
import t2.a;
import n2.l;
import androidx.compose.ui.text.style.TextDrawStyle;
import u2.j;
import o1.r;
import t2.d;
import t2.e;
import n2.g;
import n2.m;

public final class p
{
    public static final p c;
    public final k a;
    public final h b;
    
    static {
        c = new p(0L, 0L, null, null, null, 0L, null, null, 0L, 262143);
    }
    
    public p(long l, long c, m m, n2.k k, g g, long c2, e e, d d, long c3, final int n) {
        if ((n & 0x1) != 0x0) {
            l = r.l;
        }
        if ((n & 0x2) != 0x0) {
            c = j.c;
        }
        if ((n & 0x4) != 0x0) {
            m = null;
        }
        if ((n & 0x8) != 0x0) {
            k = null;
        }
        if ((n & 0x20) != 0x0) {
            g = null;
        }
        if ((n & 0x80) != 0x0) {
            c2 = j.c;
        }
        long i;
        if ((n & 0x800) != 0x0) {
            i = r.l;
        }
        else {
            i = 0L;
        }
        if ((n & 0x1000) != 0x0) {
            e = null;
        }
        if ((n & 0x4000) != 0x0) {
            d = null;
        }
        if ((n & 0x10000) != 0x0) {
            c3 = j.c;
        }
        this(new k(TextDrawStyle.a.a(l), c, m, k, null, g, null, c2, null, null, null, i, e, null), new h(d, null, c3, null, null), null);
    }
    
    public p(final k k, final h h) {
        sg2.e.f((Object)k, "spanStyle");
        this(k, h, null);
    }
    
    public p(final k a, final h b, final e0 e0) {
        sg2.e.f((Object)a, "spanStyle");
        this.a = a;
        this.b = b;
    }
    
    public static p a(final p p10, long b, long b2, m c, g f, e m, k0 n, d a, long c2, final int n2) {
        if ((n2 & 0x1) != 0x0) {
            b = p10.a.b();
        }
        if ((n2 & 0x2) != 0x0) {
            b2 = p10.a.b;
        }
        if ((n2 & 0x4) != 0x0) {
            c = p10.a.c;
        }
        n2.k d;
        if ((n2 & 0x8) != 0x0) {
            d = p10.a.d;
        }
        else {
            d = null;
        }
        l e;
        if ((n2 & 0x10) != 0x0) {
            e = p10.a.e;
        }
        else {
            e = null;
        }
        if ((n2 & 0x20) != 0x0) {
            f = p10.a.f;
        }
        String g;
        if ((n2 & 0x40) != 0x0) {
            g = p10.a.g;
        }
        else {
            g = null;
        }
        long h;
        if ((n2 & 0x80) != 0x0) {
            h = p10.a.h;
        }
        else {
            h = 0L;
        }
        a i;
        if ((n2 & 0x100) != 0x0) {
            i = p10.a.i;
        }
        else {
            i = null;
        }
        t2.g j;
        if ((n2 & 0x200) != 0x0) {
            j = p10.a.j;
        }
        else {
            j = null;
        }
        c k;
        if ((n2 & 0x400) != 0x0) {
            k = p10.a.k;
        }
        else {
            k = null;
        }
        long l;
        if ((n2 & 0x800) != 0x0) {
            l = p10.a.l;
        }
        else {
            l = 0L;
        }
        if ((n2 & 0x1000) != 0x0) {
            m = p10.a.m;
        }
        if ((n2 & 0x2000) != 0x0) {
            n = p10.a.n;
        }
        if ((n2 & 0x4000) != 0x0) {
            a = p10.b.a;
        }
        f b3;
        if ((0x8000 & n2) != 0x0) {
            b3 = p10.b.b;
        }
        else {
            b3 = null;
        }
        if ((0x10000 & n2) != 0x0) {
            c2 = p10.b.c;
        }
        t2.h d2;
        if ((n2 & 0x20000) != 0x0) {
            d2 = p10.b.d;
        }
        else {
            d2 = null;
        }
        TextDrawStyle textDrawStyle;
        if (r.c(b, p10.a.b())) {
            textDrawStyle = p10.a.a;
        }
        else {
            textDrawStyle = TextDrawStyle.a.a(b);
        }
        p10.a.getClass();
        final k k2 = new k(textDrawStyle, b2, c, d, e, f, g, h, i, j, k, l, m, n);
        p10.b.getClass();
        p10.b.getClass();
        final h h2 = new h(a, b3, c2, d2, null);
        p10.getClass();
        return new p(k2, h2, null);
    }
    
    public final p b(final p p) {
        if (p != null && !sg2.e.a((Object)p, (Object)p.c)) {
            return new p(this.a.d(p.a), this.b.a(p.b));
        }
        return this;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof p)) {
            return false;
        }
        final k a = this.a;
        final p p = (p)o;
        if (!sg2.e.a((Object)a, (Object)p.a)) {
            return false;
        }
        if (!sg2.e.a((Object)this.b, (Object)p.b)) {
            return false;
        }
        p.getClass();
        return sg2.e.a((Object)null, (Object)null);
    }
    
    @Override
    public final int hashCode() {
        return (this.b.hashCode() + this.a.hashCode() * 31) * 31 + 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("TextStyle(color=");
        r.append((Object)o1.r.i(this.a.b()));
        r.append(", brush=");
        this.a.a.d();
        r.append((Object)null);
        r.append(", fontSize=");
        r.append((Object)j.d(this.a.b));
        r.append(", fontWeight=");
        r.append(this.a.c);
        r.append(", fontStyle=");
        r.append(this.a.d);
        r.append(", fontSynthesis=");
        r.append(this.a.e);
        r.append(", fontFamily=");
        r.append(this.a.f);
        r.append(", fontFeatureSettings=");
        r.append(this.a.g);
        r.append(", letterSpacing=");
        r.append((Object)j.d(this.a.h));
        r.append(", baselineShift=");
        r.append(this.a.i);
        r.append(", textGeometricTransform=");
        r.append(this.a.j);
        r.append(", localeList=");
        r.append(this.a.k);
        r.append(", background=");
        android.support.v4.media.a.q(this.a.l, r, ", textDecoration=");
        r.append(this.a.m);
        r.append(", shadow=");
        r.append(this.a.n);
        r.append(", textAlign=");
        r.append(this.b.a);
        r.append(", textDirection=");
        r.append(this.b.b);
        r.append(", lineHeight=");
        r.append((Object)j.d(this.b.c));
        r.append(", textIndent=");
        r.append(this.b.d);
        r.append(", platformStyle=");
        r.append((Object)null);
        r.append("lineHeightStyle=");
        this.b.getClass();
        r.append((Object)null);
        r.append(')');
        return r.toString();
    }
}

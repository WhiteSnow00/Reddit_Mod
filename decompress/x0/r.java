// 
// Decompiled by Procyon v0.6.0
// 

package x0;

import al0.a;
import androidx.compose.material.TypographyKt;
import t2.d;
import t2.e;
import n2.k;
import n2.m;
import ej2.c0;
import n2.g;
import i2.p;

public final class r
{
    public final p a;
    public final p b;
    public final p c;
    public final p d;
    public final p e;
    public final p f;
    public final p g;
    public final p h;
    public final p i;
    public final p j;
    public final p k;
    public final p l;
    public final p m;
    
    public r(p a, p a2, p a3, p a4, p a5, p a6, final int n) {
        Object f;
        if ((n & 0x1) != 0x0) {
            f = n2.g.f;
        }
        else {
            f = null;
        }
        if ((n & 0x2) != 0x0) {
            a = new p(0L, c0.m3(96), n2.m.l, null, null, c0.l3(-1.5), null, null, 0L, 262009);
        }
        if ((n & 0x4) != 0x0) {
            a2 = new p(0L, c0.m3(60), n2.m.l, null, null, c0.l3(-0.5), null, null, 0L, 262009);
        }
        if ((n & 0x8) != 0x0) {
            a3 = new p(0L, c0.m3(48), n2.m.m, null, null, c0.m3(0), null, null, 0L, 262009);
        }
        if ((n & 0x10) != 0x0) {
            a4 = new p(0L, c0.m3(34), n2.m.m, null, null, c0.l3(0.25), null, null, 0L, 262009);
        }
        if ((n & 0x20) != 0x0) {
            a5 = new p(0L, c0.m3(24), n2.m.m, null, null, c0.m3(0), null, null, 0L, 262009);
        }
        p p7;
        if ((n & 0x40) != 0x0) {
            p7 = new p(0L, c0.m3(20), n2.m.n, null, null, c0.l3(0.15), null, null, 0L, 262009);
        }
        else {
            p7 = null;
        }
        p p8;
        if ((n & 0x80) != 0x0) {
            p8 = new p(0L, c0.m3(16), n2.m.m, null, null, c0.l3(0.15), null, null, 0L, 262009);
        }
        else {
            p8 = null;
        }
        p p9;
        if ((n & 0x100) != 0x0) {
            p9 = new p(0L, c0.m3(14), n2.m.n, null, null, c0.l3(0.1), null, null, 0L, 262009);
        }
        else {
            p9 = null;
        }
        if ((n & 0x200) != 0x0) {
            a6 = new p(0L, c0.m3(16), n2.m.m, null, null, c0.l3(0.5), null, null, 0L, 262009);
        }
        p p10;
        if ((n & 0x400) != 0x0) {
            p10 = new p(0L, c0.m3(14), n2.m.m, null, null, c0.l3(0.25), null, null, 0L, 262009);
        }
        else {
            p10 = null;
        }
        p p11;
        if ((n & 0x800) != 0x0) {
            p11 = new p(0L, c0.m3(14), n2.m.n, null, null, c0.l3(1.25), null, null, 0L, 262009);
        }
        else {
            p11 = null;
        }
        p p12;
        if ((n & 0x1000) != 0x0) {
            p12 = new p(0L, c0.m3(12), n2.m.m, null, null, c0.l3(0.4), null, null, 0L, 262009);
        }
        else {
            p12 = null;
        }
        p p13;
        if ((n & 0x2000) != 0x0) {
            p13 = new p(0L, c0.m3(10), n2.m.m, null, null, c0.l3(1.5), null, null, 0L, 262009);
        }
        else {
            p13 = null;
        }
        sg2.e.f(f, "defaultFontFamily");
        sg2.e.f((Object)a, "h1");
        sg2.e.f((Object)a2, "h2");
        sg2.e.f((Object)a3, "h3");
        sg2.e.f((Object)a4, "h4");
        sg2.e.f((Object)a5, "h5");
        sg2.e.f((Object)p7, "h6");
        sg2.e.f((Object)p8, "subtitle1");
        sg2.e.f((Object)p9, "subtitle2");
        sg2.e.f((Object)a6, "body1");
        sg2.e.f((Object)p10, "body2");
        sg2.e.f((Object)p11, "button");
        sg2.e.f((Object)p12, "caption");
        sg2.e.f((Object)p13, "overline");
        a = TypographyKt.a(a, (g)f);
        a2 = TypographyKt.a(a2, (g)f);
        a3 = TypographyKt.a(a3, (g)f);
        a4 = TypographyKt.a(a4, (g)f);
        a5 = TypographyKt.a(a5, (g)f);
        final p a7 = TypographyKt.a(p7, (g)f);
        final p a8 = TypographyKt.a(p8, (g)f);
        final p a9 = TypographyKt.a(p9, (g)f);
        a6 = TypographyKt.a(a6, (g)f);
        final p a10 = TypographyKt.a(p10, (g)f);
        final p a11 = TypographyKt.a(p11, (g)f);
        final p a12 = TypographyKt.a(p12, (g)f);
        final p a13 = TypographyKt.a(p13, (g)f);
        this.a = a;
        this.b = a2;
        this.c = a3;
        this.d = a4;
        this.e = a5;
        this.f = a7;
        this.g = a8;
        this.h = a9;
        this.i = a6;
        this.j = a10;
        this.k = a11;
        this.l = a12;
        this.m = a13;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof r)) {
            return false;
        }
        final p a = this.a;
        final r r = (r)o;
        return sg2.e.a((Object)a, (Object)r.a) && sg2.e.a((Object)this.b, (Object)r.b) && sg2.e.a((Object)this.c, (Object)r.c) && sg2.e.a((Object)this.d, (Object)r.d) && sg2.e.a((Object)this.e, (Object)r.e) && sg2.e.a((Object)this.f, (Object)r.f) && sg2.e.a((Object)this.g, (Object)r.g) && sg2.e.a((Object)this.h, (Object)r.h) && sg2.e.a((Object)this.i, (Object)r.i) && sg2.e.a((Object)this.j, (Object)r.j) && sg2.e.a((Object)this.k, (Object)r.k) && sg2.e.a((Object)this.l, (Object)r.l) && sg2.e.a((Object)this.m, (Object)r.m);
    }
    
    @Override
    public final int hashCode() {
        return this.m.hashCode() + al0.a.e(this.l, al0.a.e(this.k, al0.a.e(this.j, al0.a.e(this.i, al0.a.e(this.h, al0.a.e(this.g, al0.a.e(this.f, al0.a.e(this.e, al0.a.e(this.d, al0.a.e(this.c, al0.a.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("Typography(h1=");
        r.append(this.a);
        r.append(", h2=");
        r.append(this.b);
        r.append(", h3=");
        r.append(this.c);
        r.append(", h4=");
        r.append(this.d);
        r.append(", h5=");
        r.append(this.e);
        r.append(", h6=");
        r.append(this.f);
        r.append(", subtitle1=");
        r.append(this.g);
        r.append(", subtitle2=");
        r.append(this.h);
        r.append(", body1=");
        r.append(this.i);
        r.append(", body2=");
        r.append(this.j);
        r.append(", button=");
        r.append(this.k);
        r.append(", caption=");
        r.append(this.l);
        r.append(", overline=");
        r.append(this.m);
        r.append(')');
        return r.toString();
    }
}

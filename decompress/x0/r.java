// 
// Decompiled by Procyon v0.6.0
// 

package x0;

import androidx.compose.material.TypographyKt;
import ah2.f;
import t2.d;
import t2.e;
import n2.k;
import n2.m;
import mj2.c0;
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
        n2.d f;
        if ((n & 0x1) != 0x0) {
            f = n2.g.f;
        }
        else {
            f = null;
        }
        if ((n & 0x2) != 0x0) {
            a = new p(0L, c0.G(96), n2.m.l, (k)null, (g)null, c0.F(-1.5), (e)null, (d)null, 0L, 262009);
        }
        if ((n & 0x4) != 0x0) {
            a2 = new p(0L, c0.G(60), n2.m.l, (k)null, (g)null, c0.F(-0.5), (e)null, (d)null, 0L, 262009);
        }
        if ((n & 0x8) != 0x0) {
            a3 = new p(0L, c0.G(48), n2.m.m, (k)null, (g)null, c0.G(0), (e)null, (d)null, 0L, 262009);
        }
        if ((n & 0x10) != 0x0) {
            a4 = new p(0L, c0.G(34), n2.m.m, (k)null, (g)null, c0.F(0.25), (e)null, (d)null, 0L, 262009);
        }
        if ((n & 0x20) != 0x0) {
            a5 = new p(0L, c0.G(24), n2.m.m, (k)null, (g)null, c0.G(0), (e)null, (d)null, 0L, 262009);
        }
        p p7;
        if ((n & 0x40) != 0x0) {
            p7 = new p(0L, c0.G(20), n2.m.n, (k)null, (g)null, c0.F(0.15), (e)null, (d)null, 0L, 262009);
        }
        else {
            p7 = null;
        }
        p p8;
        if ((n & 0x80) != 0x0) {
            p8 = new p(0L, c0.G(16), n2.m.m, (k)null, (g)null, c0.F(0.15), (e)null, (d)null, 0L, 262009);
        }
        else {
            p8 = null;
        }
        p p9;
        if ((n & 0x100) != 0x0) {
            p9 = new p(0L, c0.G(14), n2.m.n, (k)null, (g)null, c0.F(0.1), (e)null, (d)null, 0L, 262009);
        }
        else {
            p9 = null;
        }
        if ((n & 0x200) != 0x0) {
            a6 = new p(0L, c0.G(16), n2.m.m, (k)null, (g)null, c0.F(0.5), (e)null, (d)null, 0L, 262009);
        }
        p p10;
        if ((n & 0x400) != 0x0) {
            p10 = new p(0L, c0.G(14), n2.m.m, (k)null, (g)null, c0.F(0.25), (e)null, (d)null, 0L, 262009);
        }
        else {
            p10 = null;
        }
        p p11;
        if ((n & 0x800) != 0x0) {
            p11 = new p(0L, c0.G(14), n2.m.n, (k)null, (g)null, c0.F(1.25), (e)null, (d)null, 0L, 262009);
        }
        else {
            p11 = null;
        }
        p p12;
        if ((n & 0x1000) != 0x0) {
            p12 = new p(0L, c0.G(12), n2.m.m, (k)null, (g)null, c0.F(0.4), (e)null, (d)null, 0L, 262009);
        }
        else {
            p12 = null;
        }
        p p13;
        if ((n & 0x2000) != 0x0) {
            p13 = new p(0L, c0.G(10), n2.m.m, (k)null, (g)null, c0.F(1.5), (e)null, (d)null, 0L, 262009);
        }
        else {
            p13 = null;
        }
        ah2.f.f((Object)f, "defaultFontFamily");
        ah2.f.f((Object)a, "h1");
        ah2.f.f((Object)a2, "h2");
        ah2.f.f((Object)a3, "h3");
        ah2.f.f((Object)a4, "h4");
        ah2.f.f((Object)a5, "h5");
        ah2.f.f((Object)p7, "h6");
        ah2.f.f((Object)p8, "subtitle1");
        ah2.f.f((Object)p9, "subtitle2");
        ah2.f.f((Object)a6, "body1");
        ah2.f.f((Object)p10, "body2");
        ah2.f.f((Object)p11, "button");
        ah2.f.f((Object)p12, "caption");
        ah2.f.f((Object)p13, "overline");
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
        return ah2.f.a((Object)a, (Object)r.a) && ah2.f.a((Object)this.b, (Object)r.b) && ah2.f.a((Object)this.c, (Object)r.c) && ah2.f.a((Object)this.d, (Object)r.d) && ah2.f.a((Object)this.e, (Object)r.e) && ah2.f.a((Object)this.f, (Object)r.f) && ah2.f.a((Object)this.g, (Object)r.g) && ah2.f.a((Object)this.h, (Object)r.h) && ah2.f.a((Object)this.i, (Object)r.i) && ah2.f.a((Object)this.j, (Object)r.j) && ah2.f.a((Object)this.k, (Object)r.k) && ah2.f.a((Object)this.l, (Object)r.l) && ah2.f.a((Object)this.m, (Object)r.m);
    }
    
    @Override
    public final int hashCode() {
        return this.m.hashCode() + ak0.m.e(this.l, ak0.m.e(this.k, ak0.m.e(this.j, ak0.m.e(this.i, ak0.m.e(this.h, ak0.m.e(this.g, ak0.m.e(this.f, ak0.m.e(this.e, ak0.m.e(this.d, ak0.m.e(this.c, ak0.m.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("Typography(h1=");
        k.append(this.a);
        k.append(", h2=");
        k.append(this.b);
        k.append(", h3=");
        k.append(this.c);
        k.append(", h4=");
        k.append(this.d);
        k.append(", h5=");
        k.append(this.e);
        k.append(", h6=");
        k.append(this.f);
        k.append(", subtitle1=");
        k.append(this.g);
        k.append(", subtitle2=");
        k.append(this.h);
        k.append(", body1=");
        k.append(this.i);
        k.append(", body2=");
        k.append(this.j);
        k.append(", button=");
        k.append(this.k);
        k.append(", caption=");
        k.append(this.l);
        k.append(", overline=");
        k.append(this.m);
        k.append(')');
        return k.toString();
    }
}

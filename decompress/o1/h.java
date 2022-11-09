// 
// Decompiled by Procyon v0.6.0
// 

package o1;

import android.graphics.Path$Op;
import n1.c;
import n1.a;
import n1.e;
import android.graphics.Path$Direction;
import n1.d;
import ah2.f;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Path;

public final class h implements b0
{
    public final Path a;
    public final RectF b;
    public final float[] c;
    public final Matrix d;
    
    public h() {
        this(0);
    }
    
    public h(final Path a) {
        f.f((Object)a, "internalPath");
        this.a = a;
        this.b = new RectF();
        this.c = new float[8];
        this.d = new Matrix();
    }
    
    public static void n(final d d) {
        if (!(Float.isNaN(d.a) ^ true)) {
            throw new IllegalStateException("Rect.left is NaN".toString());
        }
        if (!(Float.isNaN(d.b) ^ true)) {
            throw new IllegalStateException("Rect.top is NaN".toString());
        }
        if (!(Float.isNaN(d.c) ^ true)) {
            throw new IllegalStateException("Rect.right is NaN".toString());
        }
        if (Float.isNaN(d.d) ^ true) {
            return;
        }
        throw new IllegalStateException("Rect.bottom is NaN".toString());
    }
    
    public final void a(final float n, final float n2) {
        this.a.moveTo(n, n2);
    }
    
    public final void b(final float n, final float n2) {
        this.a.lineTo(n, n2);
    }
    
    public final void c(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.a.cubicTo(n, n2, n3, n4, n5, n6);
    }
    
    public final void close() {
        this.a.close();
    }
    
    public final void d(final float n, final float n2) {
        this.a.rMoveTo(n, n2);
    }
    
    public final void e(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.a.rCubicTo(n, n2, n3, n4, n5, n6);
    }
    
    public final void f(final float n, final float n2, final float n3, final float n4) {
        this.a.rQuadTo(n, n2, n3, n4);
    }
    
    public final void g(final d d) {
        f.f((Object)d, "rect");
        n(d);
        this.b.set(new RectF(d.a, d.b, d.c, d.d));
        this.a.addRect(this.b, Path$Direction.CCW);
    }
    
    public final d getBounds() {
        this.a.computeBounds(this.b, true);
        final RectF b = this.b;
        return new d(b.left, b.top, b.right, b.bottom);
    }
    
    public final void h(final e e) {
        f.f((Object)e, "roundRect");
        this.b.set(e.a, e.b, e.c, e.d);
        this.c[0] = n1.a.b(e.e);
        this.c[1] = n1.a.c(e.e);
        this.c[2] = n1.a.b(e.f);
        this.c[3] = n1.a.c(e.f);
        this.c[4] = n1.a.b(e.g);
        this.c[5] = n1.a.c(e.g);
        this.c[6] = n1.a.b(e.h);
        this.c[7] = n1.a.c(e.h);
        this.a.addRoundRect(this.b, this.c, Path$Direction.CCW);
    }
    
    public final void i(final long n) {
        this.d.reset();
        this.d.setTranslate(n1.c.c(n), n1.c.d(n));
        this.a.transform(this.d);
    }
    
    public final boolean j(final b0 b0, final b0 b2, final int n) {
        f.f((Object)b0, "path1");
        f.f((Object)b2, "path2");
        final int n2 = 0;
        Path$Op path$Op;
        if (n == 0) {
            path$Op = Path$Op.DIFFERENCE;
        }
        else if (n == 1) {
            path$Op = Path$Op.INTERSECT;
        }
        else if (n == 4) {
            path$Op = Path$Op.REVERSE_DIFFERENCE;
        }
        else {
            int n3 = n2;
            if (n == 2) {
                n3 = 1;
            }
            if (n3 != 0) {
                path$Op = Path$Op.UNION;
            }
            else {
                path$Op = Path$Op.XOR;
            }
        }
        final Path a = this.a;
        if (!(b0 instanceof h)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        final Path a2 = ((h)b0).a;
        if (b2 instanceof h) {
            return a.op(a2, ((h)b2).a, path$Op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
    
    public final boolean k() {
        return this.a.isConvex();
    }
    
    public final void l(final float n, final float n2, final float n3, final float n4) {
        this.a.quadTo(n, n2, n3, n4);
    }
    
    public final void m(final float n, final float n2) {
        this.a.rLineTo(n, n2);
    }
    
    public final void o(final b0 b0, final long n) {
        f.f((Object)b0, "path");
        final Path a = this.a;
        if (b0 instanceof h) {
            a.addPath(((h)b0).a, n1.c.c(n), n1.c.d(n));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
    
    public final void p(final d d, final float n, final float n2) {
        this.b.set(d.a, d.b, d.c, d.d);
        this.a.arcTo(this.b, n, n2, false);
    }
    
    public final boolean q() {
        return this.a.isEmpty();
    }
    
    public final void reset() {
        this.a.reset();
    }
}

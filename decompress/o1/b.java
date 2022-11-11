// 
// Decompiled by Procyon v0.6.0
// 

package o1;

import android.graphics.Bitmap;
import hg2.j;
import u2.i;
import u2.g;
import android.graphics.Matrix;
import android.graphics.Path;
import ml0.a;
import android.graphics.Region$Op;
import java.util.ArrayList;
import sg2.e;
import n1.d;
import android.graphics.Rect;
import android.graphics.Canvas;

public final class b implements p
{
    public Canvas a;
    public final Rect b;
    public final Rect c;
    
    public b() {
        this.a = o1.c.a;
        this.b = new Rect();
        this.c = new Rect();
    }
    
    @Override
    public final void a(final d d, final a0 a0) {
        this.a.saveLayer(d.a, d.b, d.c, d.d, a0.e(), 31);
    }
    
    @Override
    public final void b(final b0 b0, final a0 a0) {
        e.f((Object)b0, "path");
        final Canvas a2 = this.a;
        if (b0 instanceof h) {
            a2.drawPath(((h)b0).a, a0.e());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
    
    @Override
    public final void c(final float n, final long n2, final a0 a0) {
        this.a.drawCircle(n1.c.c(n2), n1.c.d(n2), n, a0.e());
    }
    
    @Override
    public final void d(final a0 a0, final ArrayList list) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            final long a2 = list.get(i).a;
            this.a.drawPoint(n1.c.c(a2), n1.c.d(a2), a0.e());
        }
    }
    
    @Override
    public final void e(final float n, final float n2, final float n3, final float n4, int n5) {
        final Canvas a = this.a;
        if (n5 == 0) {
            n5 = 1;
        }
        else {
            n5 = 0;
        }
        Region$Op region$Op;
        if (n5 != 0) {
            region$Op = Region$Op.DIFFERENCE;
        }
        else {
            region$Op = Region$Op.INTERSECT;
        }
        a.clipRect(n, n2, n3, n4, region$Op);
    }
    
    @Override
    public final void f(final float n, final float n2) {
        this.a.translate(n, n2);
    }
    
    @Override
    public final void g() {
        ml0.a.x(this.a, false);
    }
    
    @Override
    public final void h(final b0 b0, int n) {
        e.f((Object)b0, "path");
        final Canvas a = this.a;
        if (b0 instanceof h) {
            final Path a2 = ((h)b0).a;
            if (n == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            Region$Op region$Op;
            if (n != 0) {
                region$Op = Region$Op.DIFFERENCE;
            }
            else {
                region$Op = Region$Op.INTERSECT;
            }
            a.clipPath(a2, region$Op);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
    
    @Override
    public final void i(final w w, final long n, final a0 a0) {
        e.f((Object)w, "image");
        this.a.drawBitmap(o1.e.a(w), n1.c.c(n), n1.c.d(n), a0.e());
    }
    
    @Override
    public final void j(final float n, final float n2) {
        this.a.scale(n, n2);
    }
    
    @Override
    public final void k() {
        ml0.a.x(this.a, true);
    }
    
    @Override
    public final void l(final float n) {
        this.a.rotate(n);
    }
    
    @Override
    public final void o(final float[] values) {
        int i = 0;
    Label_0074:
        while (true) {
            while (i < 4) {
                for (int j = 0; j < 4; ++j) {
                    float n;
                    if (i == j) {
                        n = 1.0f;
                    }
                    else {
                        n = 0.0f;
                    }
                    if (values[i * 4 + j] != n) {
                        final boolean b = false;
                        break Label_0074;
                    }
                }
                ++i;
                continue;
                boolean b = false;
                if (!b) {
                    final Matrix matrix = new Matrix();
                    final float n2 = values[2];
                    if (n2 != 0.0f || values[6] != 0.0f || values[10] != 1.0f || values[14] != 0.0f || values[8] != 0.0f || values[9] != 0.0f || values[11] != 0.0f) {
                        throw new IllegalArgumentException("Android does not support arbitrary transforms".toString());
                    }
                    final float n3 = values[0];
                    final float n4 = values[1];
                    final float n5 = values[3];
                    final float n6 = values[4];
                    final float n7 = values[5];
                    final float n8 = values[6];
                    final float n9 = values[7];
                    final float n10 = values[8];
                    final float n11 = values[12];
                    final float n12 = values[13];
                    final float n13 = values[15];
                    values[0] = n3;
                    values[1] = n6;
                    values[2] = n11;
                    values[3] = n4;
                    values[4] = n7;
                    values[5] = n12;
                    values[6] = n5;
                    values[7] = n9;
                    values[8] = n13;
                    matrix.setValues(values);
                    values[0] = n3;
                    values[1] = n4;
                    values[2] = n2;
                    values[3] = n5;
                    values[4] = n6;
                    values[5] = n7;
                    values[6] = n8;
                    values[7] = n9;
                    values[8] = n10;
                    this.a.concat(matrix);
                }
                return;
            }
            final boolean b = true;
            continue Label_0074;
        }
    }
    
    @Override
    public final void p(final float n, final float n2, final float n3, final float n4, final a0 a0) {
        e.f((Object)a0, "paint");
        this.a.drawRect(n, n2, n3, n4, a0.e());
    }
    
    @Override
    public final void q(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final a0 a0) {
        this.a.drawRoundRect(n, n2, n3, n4, n5, n6, a0.e());
    }
    
    @Override
    public final void restore() {
        this.a.restore();
    }
    
    @Override
    public final void s(final w w, final long n, final long n2, final long n3, final long n4, final a0 a0) {
        e.f((Object)w, "image");
        final Canvas a2 = this.a;
        final Bitmap a3 = o1.e.a(w);
        final Rect b = this.b;
        final int c = g.c;
        final int left = (int)(n >> 32);
        b.left = left;
        b.top = g.b(n);
        b.right = left + (int)(n2 >> 32);
        b.bottom = i.b(n2) + g.b(n);
        final j a4 = j.a;
        final Rect c2 = this.c;
        final int left2 = (int)(n3 >> 32);
        c2.left = left2;
        c2.top = g.b(n3);
        c2.right = left2 + (int)(n4 >> 32);
        c2.bottom = i.b(n4) + g.b(n3);
        a2.drawBitmap(a3, b, c2, a0.e());
    }
    
    @Override
    public final void save() {
        this.a.save();
    }
    
    @Override
    public final void t(final long n, final long n2, final a0 a0) {
        this.a.drawLine(n1.c.c(n), n1.c.d(n), n1.c.c(n2), n1.c.d(n2), a0.e());
    }
    
    @Override
    public final void u(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final a0 a0) {
        this.a.drawArc(n, n2, n3, n4, n5, n6, false, a0.e());
    }
    
    public final Canvas v() {
        return this.a;
    }
    
    public final void w(final Canvas a) {
        e.f((Object)a, "<set-?>");
        this.a = a;
    }
}

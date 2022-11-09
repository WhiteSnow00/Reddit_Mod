// 
// Decompiled by Procyon v0.6.0
// 

package com.airbnb.lottie.model.layer;

import java.util.Iterator;
import c7.g$a;
import c7.g;
import android.graphics.Canvas;
import android.graphics.Matrix;
import t6.r;
import q6.g0;
import z6.d;
import z6.e;
import c7.c;
import j0.f;
import q6.h;
import java.util.List;
import com.airbnb.lottie.LottieDrawable;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;

public final class b extends a
{
    public t6.a<Float, Float> C;
    public final ArrayList D;
    public final RectF E;
    public final RectF F;
    public final Paint G;
    public boolean H;
    
    public b(final LottieDrawable lottieDrawable, final Layer layer, final List<Layer> list, final h h) {
        super(lottieDrawable, layer);
        this.D = new ArrayList();
        this.E = new RectF();
        this.F = new RectF();
        this.G = new Paint();
        this.H = true;
        final x6.b s = layer.s;
        if (s != null) {
            this.d(this.C = s.b());
            this.C.a((t6.a.a)this);
        }
        else {
            this.C = null;
        }
        final f f = new f(h.i.size());
        int n = list.size() - 1;
        a a = null;
        int i;
        while (true) {
            i = 0;
            if (n < 0) {
                break;
            }
            final Layer layer2 = list.get(n);
            Object s2 = null;
            switch (a$a.a[((Enum)layer2.e).ordinal()]) {
                default: {
                    final StringBuilder k = a.k("Unknown layer type ");
                    k.append(layer2.e);
                    c7.c.b(k.toString());
                    s2 = null;
                    break;
                }
                case 6: {
                    s2 = new z6.f(lottieDrawable, layer2);
                    break;
                }
                case 5: {
                    s2 = new z6.c(lottieDrawable, layer2);
                    break;
                }
                case 4: {
                    s2 = new z6.b(lottieDrawable, layer2);
                    break;
                }
                case 3: {
                    s2 = new z6.e(lottieDrawable, layer2);
                    break;
                }
                case 2: {
                    s2 = new b(lottieDrawable, layer2, h.c.get(layer2.g), h);
                    break;
                }
                case 1: {
                    s2 = new z6.d(lottieDrawable, layer2, this);
                    break;
                }
            }
            if (s2 == null) {
                s2 = a;
            }
            else {
                f.g(((a)s2).p.d, s2);
                if (a != null) {
                    a.s = (a)s2;
                    s2 = null;
                }
                else {
                    this.D.add(0, s2);
                    final int n2 = b$a.a[((Enum)layer2.u).ordinal()];
                    if (n2 != 1 && n2 != 2) {
                        s2 = a;
                    }
                }
            }
            --n;
            a = (a)s2;
        }
        while (i < f.h()) {
            final a a2 = (a)f.e(f.f(i), (Long)null);
            if (a2 != null) {
                final a t = (a)f.e(a2.p.f, (Long)null);
                if (t != null) {
                    a2.t = t;
                }
            }
            ++i;
        }
    }
    
    @Override
    public final void a(final d7.c c, final Object o) {
        super.a(c, o);
        if (o == g0.E) {
            if (c == null) {
                final t6.a<Float, Float> c2 = this.C;
                if (c2 != null) {
                    c2.k(null);
                }
            }
            else {
                (this.C = new r<Float, Float>((d7.c<Float>)c, null)).a((t6.a.a)this);
                this.d(this.C);
            }
        }
    }
    
    @Override
    public final void c(final RectF rectF, final Matrix matrix, final boolean b) {
        super.c(rectF, matrix, b);
        for (int i = this.D.size() - 1; i >= 0; --i) {
            this.E.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((a)this.D.get(i)).c(this.E, super.n, true);
            rectF.union(this.E);
        }
    }
    
    @Override
    public final void l(final Canvas canvas, final Matrix matrix, int alpha) {
        final RectF f = this.F;
        final Layer p3 = super.p;
        f.set(0.0f, 0.0f, (float)p3.o, (float)p3.p);
        matrix.mapRect(this.F);
        final boolean b = super.o.x && this.D.size() > 1 && alpha != 255;
        if (b) {
            this.G.setAlpha(alpha);
            final RectF f2 = this.F;
            final Paint g = this.G;
            final g$a a = c7.g.a;
            canvas.saveLayer(f2, g);
            os.h.c();
        }
        else {
            canvas.save();
        }
        if (b) {
            alpha = 255;
        }
        for (int i = this.D.size() - 1; i >= 0; --i) {
            if ((!this.H && "__container".equals(super.p.c)) || this.F.isEmpty() || canvas.clipRect(this.F)) {
                ((a)this.D.get(i)).e(canvas, matrix, alpha);
            }
        }
        canvas.restore();
        os.h.c();
    }
    
    @Override
    public final void q(final w6.d d, final int n, final ArrayList list, final w6.d d2) {
        for (int i = 0; i < this.D.size(); ++i) {
            ((a)this.D.get(i)).i(d, n, list, d2);
        }
    }
    
    @Override
    public final void r(final boolean b) {
        super.r(b);
        final Iterator iterator = this.D.iterator();
        while (iterator.hasNext()) {
            ((a)iterator.next()).r(b);
        }
    }
    
    @Override
    public final void s(float l) {
        super.s(l);
        final t6.a<Float, Float> c = this.C;
        if (c != null) {
            final h f = super.o.f;
            l = f.l;
            l = (c.f() * super.p.b.m - super.p.b.k) / (l - f.k + 0.01f);
        }
        float n = l;
        if (this.C == null) {
            final Layer p = super.p;
            final float n2 = p.n;
            final h b = p.b;
            n = l - n2 / (b.l - b.k);
        }
        final Layer p2 = super.p;
        l = n;
        if (p2.m != 0.0f) {
            l = n;
            if (!"__container".equals(p2.c)) {
                l = n / super.p.m;
            }
        }
        int size = this.D.size();
        while (--size >= 0) {
            ((a)this.D.get(size)).s(l);
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.airbnb.lottie.model.layer;

import android.graphics.PointF;
import q6.j0;
import j0.h$a;
import b7.j;
import u5.w;
import java.util.Collections;
import c7.g$a;
import android.graphics.Paint$Style;
import com.airbnb.lottie.model.content.Mask$MaskMode;
import android.os.Build$VERSION;
import android.graphics.Paint;
import c7.g;
import com.airbnb.lottie.model.content.Mask;
import android.graphics.Canvas;
import d7.c;
import java.util.Iterator;
import x6.i;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import a2.b;
import android.graphics.PorterDuff$Mode;
import t6.q;
import java.util.ArrayList;
import java.util.List;
import t6.h;
import com.airbnb.lottie.LottieDrawable;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.BlurMaskFilter;
import w6.e;
import s6.d;

public abstract class a implements s6.d, t6.a.a, w6.e
{
    public float A;
    public BlurMaskFilter B;
    public final Path a;
    public final Matrix b;
    public final Matrix c;
    public final r6.a d;
    public final r6.a e;
    public final r6.a f;
    public final r6.a g;
    public final r6.a h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final RectF l;
    public final RectF m;
    public final Matrix n;
    public final LottieDrawable o;
    public final Layer p;
    public h q;
    public t6.d r;
    public a s;
    public a t;
    public List<a> u;
    public final ArrayList v;
    public final q w;
    public boolean x;
    public boolean y;
    public r6.a z;
    
    public a(final LottieDrawable o, final Layer p2) {
        this.a = new Path();
        this.b = new Matrix();
        this.c = new Matrix();
        boolean x = true;
        this.d = new r6.a(1);
        this.e = new r6.a(PorterDuff$Mode.DST_IN, 0);
        this.f = new r6.a(PorterDuff$Mode.DST_OUT, 0);
        final r6.a g = new r6.a(1);
        this.g = g;
        this.h = new r6.a(PorterDuff$Mode.CLEAR);
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new Matrix();
        this.v = new ArrayList();
        this.x = true;
        this.A = 0.0f;
        this.o = o;
        this.p = p2;
        a2.b.j(new StringBuilder(), p2.c, "#draw");
        if (p2.u == Layer$MatteType.INVERT) {
            g.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
        }
        else {
            g.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.DST_IN));
        }
        final i i = p2.i;
        i.getClass();
        (this.w = new q(i)).b(this);
        final List h = p2.h;
        if (h != null && !h.isEmpty()) {
            final h q = new h(p2.h);
            this.q = q;
            final Iterator iterator = q.a.iterator();
            while (iterator.hasNext()) {
                ((t6.a)iterator.next()).a((t6.a.a)this);
            }
            for (final t6.a a : this.q.b) {
                this.d(a);
                a.a((t6.a.a)this);
            }
        }
        if (!this.p.t.isEmpty()) {
            final t6.d r = new t6.d(this.p.t);
            this.r = r;
            ((t6.a)r).b = true;
            ((t6.a)r).a((t6.a.a)new z6.a(this));
            if (((t6.a<K, Float>)this.r).f() != 1.0f) {
                x = false;
            }
            if (x != this.x) {
                this.x = x;
                this.o.invalidateSelf();
            }
            this.d((t6.a<?, ?>)this.r);
        }
        else if (!this.x) {
            this.x = true;
            this.o.invalidateSelf();
        }
    }
    
    public void a(final d7.c c, final Object o) {
        this.w.c(c, o);
    }
    
    public void c(final RectF rectF, final Matrix matrix, final boolean b) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        this.j();
        this.n.set(matrix);
        if (b) {
            final List<a> u = this.u;
            if (u != null) {
                int size = u.size();
                while (--size >= 0) {
                    this.n.preConcat(this.u.get(size).w.d());
                }
            }
            else {
                final a t = this.t;
                if (t != null) {
                    this.n.preConcat(t.w.d());
                }
            }
        }
        this.n.preConcat(this.w.d());
    }
    
    public final void d(final t6.a<?, ?> a) {
        if (a == null) {
            return;
        }
        this.v.add(a);
    }
    
    public final void e(final Canvas canvas, final Matrix matrix, int i) {
        if (this.x && !this.p.v) {
            this.j();
            this.b.reset();
            this.b.set(matrix);
            for (int j = this.u.size() - 1; j >= 0; --j) {
                this.b.preConcat(this.u.get(j).w.d());
            }
            os.h.c();
            final t6.a<Integer, Integer> k = this.w.j;
            int intValue;
            if (k == null) {
                intValue = 100;
            }
            else {
                intValue = k.f();
            }
            final int n = (int)(i / 255.0f * intValue / 100.0f * 255.0f);
            if (this.s != null) {
                i = 1;
            }
            else {
                i = 0;
            }
            if (i == 0) {
                final h q = this.q;
                if (q != null && !q.a.isEmpty()) {
                    i = 1;
                }
                else {
                    i = 0;
                }
                if (i == 0) {
                    this.b.preConcat(this.w.d());
                    this.l(canvas, this.b, n);
                    os.h.c();
                    os.h.c();
                    this.o();
                    return;
                }
            }
            this.c(this.i, this.b, false);
            final RectF l = this.i;
            if (this.s != null) {
                i = 1;
            }
            else {
                i = 0;
            }
            if (i != 0) {
                if (this.p.u != Layer$MatteType.INVERT) {
                    this.l.set(0.0f, 0.0f, 0.0f, 0.0f);
                    this.s.c(this.l, matrix, true);
                    if (!l.intersect(this.l)) {
                        l.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                }
            }
            this.b.preConcat(this.w.d());
            final RectF m = this.i;
            final Matrix b = this.b;
            this.k.set(0.0f, 0.0f, 0.0f, 0.0f);
            final h q2 = this.q;
            if (q2 != null && !q2.a.isEmpty()) {
                i = 1;
            }
            else {
                i = 0;
            }
            Label_0695: {
                if (i != 0) {
                    int size;
                    Mask mask;
                    Path path;
                    int n2;
                    RectF k2;
                    for (size = this.q.c.size(), i = 0; i < size; ++i) {
                        mask = this.q.c.get(i);
                        path = this.q.a.get(i).f();
                        if (path != null) {
                            this.a.set(path);
                            this.a.transform(b);
                            n2 = a$a.b[((Enum)mask.a).ordinal()];
                            if (n2 == 1 || n2 == 2) {
                                break Label_0695;
                            }
                            if (n2 == 3 || n2 == 4) {
                                if (mask.d) {
                                    break Label_0695;
                                }
                            }
                            this.a.computeBounds(this.m, false);
                            if (i == 0) {
                                this.k.set(this.m);
                            }
                            else {
                                k2 = this.k;
                                k2.set(Math.min(k2.left, this.m.left), Math.min(this.k.top, this.m.top), Math.max(this.k.right, this.m.right), Math.max(this.k.bottom, this.m.bottom));
                            }
                        }
                    }
                    if (!m.intersect(this.k)) {
                        m.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                }
            }
            this.j.set(0.0f, 0.0f, (float)canvas.getWidth(), (float)canvas.getHeight());
            canvas.getMatrix(this.c);
            if (!this.c.isIdentity()) {
                final Matrix c = this.c;
                c.invert(c);
                this.c.mapRect(this.j);
            }
            if (!this.i.intersect(this.j)) {
                this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            os.h.c();
            if (this.i.width() >= 1.0f && this.i.height() >= 1.0f) {
                this.d.setAlpha(255);
                final RectF i2 = this.i;
                final r6.a d = this.d;
                final g$a a = c7.g.a;
                canvas.saveLayer(i2, (Paint)d);
                os.h.c();
                os.h.c();
                this.k(canvas);
                this.l(canvas, this.b, n);
                os.h.c();
                final h q3 = this.q;
                if (q3 != null && !q3.a.isEmpty()) {
                    i = 1;
                }
                else {
                    i = 0;
                }
                if (i != 0) {
                    final Matrix b2 = this.b;
                    canvas.saveLayer(this.i, (Paint)this.e);
                    os.h.c();
                    if (Build$VERSION.SDK_INT < 28) {
                        this.k(canvas);
                    }
                    os.h.c();
                    Mask mask2;
                    t6.a a2;
                    t6.a a3;
                    int n3;
                    RectF i3;
                    r6.a d2;
                    g$a a4;
                    RectF i4;
                    r6.a e;
                    g$a a5;
                    RectF i5;
                    r6.a e2;
                    g$a a6;
                    RectF i6;
                    r6.a f;
                    g$a a7;
                    int n4;
                    boolean b3 = false;
                    for (i = 0; i < this.q.c.size(); ++i) {
                        mask2 = this.q.c.get(i);
                        a2 = this.q.a.get(i);
                        a3 = this.q.b.get(i);
                        n3 = a$a.b[((Enum)mask2.a).ordinal()];
                        if (n3 != 1) {
                            if (n3 != 2) {
                                if (n3 != 3) {
                                    if (n3 == 4) {
                                        if (mask2.d) {
                                            i3 = this.i;
                                            d2 = this.d;
                                            a4 = c7.g.a;
                                            canvas.saveLayer(i3, (Paint)d2);
                                            os.h.c();
                                            canvas.drawRect(this.i, (Paint)this.d);
                                            this.a.set((Path)a2.f());
                                            this.a.transform(b2);
                                            this.d.setAlpha((int)((int)a3.f() * 2.55f));
                                            canvas.drawPath(this.a, (Paint)this.f);
                                            canvas.restore();
                                        }
                                        else {
                                            this.a.set((Path)a2.f());
                                            this.a.transform(b2);
                                            this.d.setAlpha((int)((int)a3.f() * 2.55f));
                                            canvas.drawPath(this.a, (Paint)this.d);
                                        }
                                    }
                                }
                                else if (mask2.d) {
                                    i4 = this.i;
                                    e = this.e;
                                    a5 = c7.g.a;
                                    canvas.saveLayer(i4, (Paint)e);
                                    os.h.c();
                                    canvas.drawRect(this.i, (Paint)this.d);
                                    this.f.setAlpha((int)((int)a3.f() * 2.55f));
                                    this.a.set((Path)a2.f());
                                    this.a.transform(b2);
                                    canvas.drawPath(this.a, (Paint)this.f);
                                    canvas.restore();
                                }
                                else {
                                    i5 = this.i;
                                    e2 = this.e;
                                    a6 = c7.g.a;
                                    canvas.saveLayer(i5, (Paint)e2);
                                    os.h.c();
                                    this.a.set((Path)a2.f());
                                    this.a.transform(b2);
                                    this.d.setAlpha((int)((int)a3.f() * 2.55f));
                                    canvas.drawPath(this.a, (Paint)this.d);
                                    canvas.restore();
                                }
                            }
                            else {
                                if (i == 0) {
                                    this.d.setColor(-16777216);
                                    this.d.setAlpha(255);
                                    canvas.drawRect(this.i, (Paint)this.d);
                                }
                                if (mask2.d) {
                                    i6 = this.i;
                                    f = this.f;
                                    a7 = c7.g.a;
                                    canvas.saveLayer(i6, (Paint)f);
                                    os.h.c();
                                    canvas.drawRect(this.i, (Paint)this.d);
                                    this.f.setAlpha((int)((int)a3.f() * 2.55f));
                                    this.a.set((Path)a2.f());
                                    this.a.transform(b2);
                                    canvas.drawPath(this.a, (Paint)this.f);
                                    canvas.restore();
                                }
                                else {
                                    this.a.set((Path)a2.f());
                                    this.a.transform(b2);
                                    canvas.drawPath(this.a, (Paint)this.f);
                                }
                            }
                        }
                        else {
                            Label_1742: {
                                Label_1727: {
                                    if (!this.q.a.isEmpty()) {
                                        for (n4 = 0; n4 < this.q.c.size(); ++n4) {
                                            if (((Mask)this.q.c.get(n4)).a != Mask$MaskMode.MASK_MODE_NONE) {
                                                break Label_1727;
                                            }
                                        }
                                        b3 = true;
                                        break Label_1742;
                                    }
                                }
                                b3 = false;
                            }
                            if (b3) {
                                this.d.setAlpha(255);
                                canvas.drawRect(this.i, (Paint)this.d);
                            }
                        }
                    }
                    canvas.restore();
                    os.h.c();
                }
                if (this.s != null) {
                    i = 1;
                }
                else {
                    i = 0;
                }
                if (i != 0) {
                    canvas.saveLayer(this.i, (Paint)this.g);
                    os.h.c();
                    os.h.c();
                    this.k(canvas);
                    this.s.e(canvas, matrix, n);
                    canvas.restore();
                    os.h.c();
                    os.h.c();
                }
                canvas.restore();
                os.h.c();
            }
            if (this.y) {
                final r6.a z = this.z;
                if (z != null) {
                    z.setStyle(Paint$Style.STROKE);
                    this.z.setColor(-251901);
                    this.z.setStrokeWidth(4.0f);
                    canvas.drawRect(this.i, (Paint)this.z);
                    this.z.setStyle(Paint$Style.FILL);
                    this.z.setColor(1357638635);
                    canvas.drawRect(this.i, (Paint)this.z);
                }
            }
            os.h.c();
            this.o();
            return;
        }
        os.h.c();
    }
    
    public final void g() {
        this.o.invalidateSelf();
    }
    
    public final String getName() {
        return this.p.c;
    }
    
    public final void h(final List<s6.b> list, final List<s6.b> list2) {
    }
    
    public final void i(final w6.d d, final int n, final ArrayList list, final w6.d d2) {
        final a s = this.s;
        if (s != null) {
            final String c = s.p.c;
            d2.getClass();
            final w6.d d3 = new w6.d(d2);
            d3.a.add(c);
            if (d.a(n, this.s.p.c)) {
                final a s2 = this.s;
                final w6.d d4 = new w6.d(d3);
                d4.b = (w6.e)s2;
                list.add(d4);
            }
            if (d.d(n, this.p.c)) {
                this.s.q(d, d.b(n, this.s.p.c) + n, list, d3);
            }
        }
        if (!d.c(n, this.p.c)) {
            return;
        }
        w6.d d5 = d2;
        if (!"__container".equals(this.p.c)) {
            final String c2 = this.p.c;
            d2.getClass();
            d5 = new w6.d(d2);
            d5.a.add(c2);
            if (d.a(n, this.p.c)) {
                final w6.d d6 = new w6.d(d5);
                d6.b = (w6.e)this;
                list.add(d6);
            }
        }
        if (d.d(n, this.p.c)) {
            this.q(d, d.b(n, this.p.c) + n, list, d5);
        }
    }
    
    public final void j() {
        if (this.u != null) {
            return;
        }
        if (this.t == null) {
            this.u = Collections.emptyList();
            return;
        }
        this.u = new ArrayList<a>();
        for (a a = this.t; a != null; a = a.t) {
            this.u.add(a);
        }
    }
    
    public final void k(final Canvas canvas) {
        final RectF i = this.i;
        canvas.drawRect(i.left - 1.0f, i.top - 1.0f, i.right + 1.0f, i.bottom + 1.0f, (Paint)this.h);
        os.h.c();
    }
    
    public abstract void l(final Canvas p0, final Matrix p1, final int p2);
    
    public w m() {
        return this.p.w;
    }
    
    public j n() {
        return this.p.x;
    }
    
    public final void o() {
        final j0 a = this.o.f.a;
        final String c = this.p.c;
        if (a.a) {
            c7.e e;
            if ((e = a.c.get(c)) == null) {
                e = new c7.e();
                a.c.put(c, e);
            }
            final int a2 = e.a + 1;
            if ((e.a = a2) == Integer.MAX_VALUE) {
                e.a = a2 / 2;
            }
            if (c.equals("__container")) {
                final Iterator iterator = a.b.iterator();
                while (true) {
                    final h$a h$a = (h$a)iterator;
                    if (!h$a.hasNext()) {
                        break;
                    }
                    ((j0.a)h$a.next()).a();
                }
            }
        }
    }
    
    public final void p(final t6.a<?, ?> a) {
        this.v.remove(a);
    }
    
    public void q(final w6.d d, final int n, final ArrayList list, final w6.d d2) {
    }
    
    public void r(final boolean y) {
        if (y && this.z == null) {
            this.z = new r6.a();
        }
        this.y = y;
    }
    
    public void s(final float n) {
        final q w = this.w;
        final t6.a<Integer, Integer> j = w.j;
        if (j != null) {
            j.j(n);
        }
        final t6.a<?, Float> m = w.m;
        if (m != null) {
            m.j(n);
        }
        final t6.a<?, Float> n2 = w.n;
        if (n2 != null) {
            n2.j(n);
        }
        final t6.a<PointF, PointF> f = w.f;
        if (f != null) {
            f.j(n);
        }
        final t6.a<?, PointF> g = w.g;
        if (g != null) {
            g.j(n);
        }
        final t6.a<d7.d, d7.d> h = w.h;
        if (h != null) {
            h.j(n);
        }
        final t6.a<Float, Float> i = w.i;
        if (i != null) {
            i.j(n);
        }
        final t6.d k = w.k;
        if (k != null) {
            ((t6.a)k).j(n);
        }
        final t6.d l = w.l;
        if (l != null) {
            ((t6.a)l).j(n);
        }
        final h q = this.q;
        final int n3 = 0;
        if (q != null) {
            for (int n4 = 0; n4 < this.q.a.size(); ++n4) {
                ((t6.a)this.q.a.get(n4)).j(n);
            }
        }
        final t6.d r = this.r;
        if (r != null) {
            ((t6.a)r).j(n);
        }
        final a s = this.s;
        int n5 = n3;
        if (s != null) {
            s.s(n);
            n5 = n3;
        }
        while (n5 < this.v.size()) {
            ((t6.a)this.v.get(n5)).j(n);
            ++n5;
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.floatingactionbutton;

import android.widget.ImageView;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.InsetDrawable;
import mj2.c0;
import vf.n;
import java.util.Iterator;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.util.Property;
import android.animation.TypeEvaluator;
import android.os.Build$VERSION;
import android.animation.ObjectAnimator;
import android.view.View;
import android.animation.AnimatorSet;
import android.graphics.Matrix$ScaleToFit;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import qf.e;
import android.graphics.Rect;
import uf.b;
import android.animation.Animator$AnimatorListener;
import java.util.ArrayList;
import android.animation.Animator;
import ze.g;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.Drawable;
import vf.f;
import vf.j;
import pf.c;
import android.graphics.Matrix;
import android.graphics.RectF;
import t4.a;

public class d
{
    public static final a E;
    public static final int[] F;
    public static final int[] G;
    public static final int[] H;
    public static final int[] I;
    public static final int[] J;
    public static final int[] K;
    public final RectF A;
    public final RectF B;
    public final Matrix C;
    public pf.c D;
    public j a;
    public vf.f b;
    public Drawable c;
    public pf.a d;
    public LayerDrawable e;
    public boolean f;
    public boolean g;
    public float h;
    public float i;
    public float j;
    public int k;
    public ze.g l;
    public ze.g m;
    public Animator n;
    public ze.g o;
    public ze.g p;
    public float q;
    public float r;
    public int s;
    public int t;
    public ArrayList<Animator$AnimatorListener> u;
    public ArrayList<Animator$AnimatorListener> v;
    public ArrayList<e> w;
    public final FloatingActionButton x;
    public final uf.b y;
    public final Rect z;
    
    static {
        E = ze.a.c;
        F = new int[] { 16842919, 16842910 };
        G = new int[] { 16843623, 16842908, 16842910 };
        H = new int[] { 16842908, 16842910 };
        I = new int[] { 16843623, 16842910 };
        J = new int[] { 16842910 };
        K = new int[0];
    }
    
    public d(final FloatingActionButton x, final FloatingActionButton.b y) {
        this.g = true;
        this.r = 1.0f;
        this.t = 0;
        this.z = new Rect();
        this.A = new RectF();
        this.B = new RectF();
        this.C = new Matrix();
        this.x = x;
        this.y = y;
        final qf.e e = new qf.e();
        final int[] f = com.google.android.material.floatingactionbutton.d.F;
        final d d = (d)this;
        e.a(f, c((h)new d(d)));
        e.a(com.google.android.material.floatingactionbutton.d.G, c((h)new c(d)));
        e.a(com.google.android.material.floatingactionbutton.d.H, c((h)new c(d)));
        e.a(com.google.android.material.floatingactionbutton.d.I, c((h)new c(d)));
        e.a(com.google.android.material.floatingactionbutton.d.J, c((h)new g(d)));
        e.a(com.google.android.material.floatingactionbutton.d.K, c((h)new b(d)));
        this.q = ((View)x).getRotation();
    }
    
    public static ValueAnimator c(final h h) {
        final ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator((TimeInterpolator)d.E);
        valueAnimator.setDuration(100L);
        ((Animator)valueAnimator).addListener((Animator$AnimatorListener)h);
        valueAnimator.addUpdateListener((ValueAnimator$AnimatorUpdateListener)h);
        valueAnimator.setFloatValues(new float[] { 0.0f, 1.0f });
        return valueAnimator;
    }
    
    public final void a(final float n, final Matrix matrix) {
        matrix.reset();
        final Drawable drawable = ((ImageView)this.x).getDrawable();
        if (drawable != null && this.s != 0) {
            final RectF a = this.A;
            final RectF b = this.B;
            a.set(0.0f, 0.0f, (float)drawable.getIntrinsicWidth(), (float)drawable.getIntrinsicHeight());
            final float n2 = (float)this.s;
            b.set(0.0f, 0.0f, n2, n2);
            matrix.setRectToRect(a, b, Matrix$ScaleToFit.CENTER);
            final float n3 = this.s / 2.0f;
            matrix.postScale(n, n, n3, n3);
        }
    }
    
    public final AnimatorSet b(final ze.g g, final float n, final float n2, final float n3) {
        final ArrayList list = new ArrayList();
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)this.x, View.ALPHA, new float[] { n });
        g.d("opacity").a((Animator)ofFloat);
        list.add(ofFloat);
        final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)this.x, View.SCALE_X, new float[] { n2 });
        g.d("scale").a((Animator)ofFloat2);
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT == 26) {
            ((ValueAnimator)ofFloat2).setEvaluator((TypeEvaluator)new pf.b());
        }
        list.add(ofFloat2);
        final ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((Object)this.x, View.SCALE_Y, new float[] { n2 });
        g.d("scale").a((Animator)ofFloat3);
        if (sdk_INT == 26) {
            ((ValueAnimator)ofFloat3).setEvaluator((TypeEvaluator)new pf.b());
        }
        list.add(ofFloat3);
        this.a(n3, this.C);
        final ObjectAnimator ofObject = ObjectAnimator.ofObject((Object)this.x, (Property)new ze.e(), (TypeEvaluator)new ze.f() {
            public final Object evaluate(final float r, final Object o, final Object o2) {
                final Matrix matrix = (Matrix)o;
                final Matrix matrix2 = (Matrix)o2;
                com.google.android.material.floatingactionbutton.d.this.r = r;
                matrix.getValues(super.a);
                matrix2.getValues(super.b);
                for (int i = 0; i < 9; ++i) {
                    final float[] b = super.b;
                    final float n = b[i];
                    final float n2 = super.a[i];
                    b[i] = d.c(n, n2, r, n2);
                }
                super.c.setValues(super.b);
                return super.c;
            }
        }, (Object[])new Matrix[] { new Matrix(this.C) });
        g.d("iconScale").a((Animator)ofObject);
        list.add(ofObject);
        final AnimatorSet set = new AnimatorSet();
        mk2.e.J(set, list);
        return set;
    }
    
    public float d() {
        throw null;
    }
    
    public void e(final Rect rect) {
        int n;
        if (this.f) {
            n = (this.k - this.x.getSizeDimension()) / 2;
        }
        else {
            n = 0;
        }
        float n2;
        if (this.g) {
            n2 = this.d() + this.j;
        }
        else {
            n2 = 0.0f;
        }
        final int max = Math.max(n, (int)Math.ceil(n2));
        final int max2 = Math.max(n, (int)Math.ceil(n2 * 1.5f));
        rect.set(max, max2, max, max2);
    }
    
    public void f(final ColorStateList list, final PorterDuff$Mode porterDuff$Mode, final ColorStateList list2, final int n) {
        throw null;
    }
    
    public void g() {
        throw null;
    }
    
    public void h() {
        throw null;
    }
    
    public void i(final int[] array) {
        throw null;
    }
    
    public void j(final float n, final float n2, final float n3) {
        throw null;
    }
    
    public final void k() {
        final ArrayList<e> w = this.w;
        if (w != null) {
            final Iterator<e> iterator = w.iterator();
            while (iterator.hasNext()) {
                iterator.next().b();
            }
        }
    }
    
    public void l(final ColorStateList list) {
        final Drawable c = this.c;
        if (c != null) {
            r3.a.b.h(c, tf.a.b(list));
        }
    }
    
    public final void m(final j j) {
        this.a = j;
        final vf.f b = this.b;
        if (b != null) {
            b.setShapeAppearanceModel(j);
        }
        final Drawable c = this.c;
        if (c instanceof n) {
            ((n)c).setShapeAppearanceModel(j);
        }
        final pf.a d = this.d;
        if (d != null) {
            d.o = j;
            d.invalidateSelf();
        }
    }
    
    public boolean n() {
        throw null;
    }
    
    public void o() {
        throw null;
    }
    
    public final void p() {
        final Rect z = this.z;
        this.e(z);
        c0.s((Object)this.e, "Didn't initialize content background");
        if (this.n()) {
            FloatingActionButton.c(((FloatingActionButton.b)this.y).a, (Drawable)new InsetDrawable((Drawable)this.e, z.left, z.top, z.right, z.bottom));
        }
        else {
            final uf.b y = this.y;
            final LayerDrawable e = this.e;
            final FloatingActionButton.b b = (FloatingActionButton.b)y;
            if (e != null) {
                FloatingActionButton.c(b.a, (Drawable)e);
            }
            else {
                b.getClass();
            }
        }
        final uf.b y2 = this.y;
        final int left = z.left;
        final int top = z.top;
        final int right = z.right;
        final int bottom = z.bottom;
        final FloatingActionButton.b b2 = (FloatingActionButton.b)y2;
        b2.a.r.set(left, top, right, bottom);
        final FloatingActionButton a = b2.a;
        final int o = a.o;
        ((View)a).setPadding(left + o, top + o, right + o, bottom + o);
    }
    
    public final class b extends h
    {
        public b(final d d) {
            super(d);
        }
        
        @Override
        public final float a() {
            return 0.0f;
        }
    }
    
    public final class c extends h
    {
        public c() {
            super(e);
        }
        
        @Override
        public final float a() {
            final d e = d.this;
            return e.h + e.i;
        }
    }
    
    public final class d extends h
    {
        public d() {
            super(e);
        }
        
        @Override
        public final float a() {
            final com.google.android.material.floatingactionbutton.d e = com.google.android.material.floatingactionbutton.d.this;
            return e.h + e.j;
        }
    }
    
    public interface e
    {
        void a();
        
        void b();
    }
    
    public interface f
    {
    }
    
    public final class g extends h
    {
        public g() {
            super(e);
        }
        
        @Override
        public final float a() {
            return d.this.h;
        }
    }
    
    public abstract class h extends AnimatorListenerAdapter implements ValueAnimator$AnimatorUpdateListener
    {
        public boolean a;
        public float b;
        public float c;
        
        public abstract float a();
        
        public final void onAnimationEnd(final Animator animator) {
            final d d = com.google.android.material.floatingactionbutton.d.this;
            final float n = (float)(int)this.c;
            final vf.f b = d.b;
            if (b != null) {
                b.k(n);
            }
            this.a = false;
        }
        
        public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
            if (!this.a) {
                final vf.f b = com.google.android.material.floatingactionbutton.d.this.b;
                float n;
                if (b == null) {
                    n = 0.0f;
                }
                else {
                    n = b.f.n;
                }
                this.b = n;
                this.c = this.a();
                this.a = true;
            }
            final d d = com.google.android.material.floatingactionbutton.d.this;
            final float b2 = this.b;
            final float n2 = (float)(int)(valueAnimator.getAnimatedFraction() * (this.c - b2) + b2);
            final vf.f b3 = d.b;
            if (b3 != null) {
                b3.k(n2);
            }
        }
    }
}

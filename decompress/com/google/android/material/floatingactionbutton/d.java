// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.floatingactionbutton;

import android.widget.ImageView;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.InsetDrawable;
import ej2.c0;
import tf.n;
import r3.a$b;
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
import of.e;
import android.graphics.Rect;
import sf.b;
import android.animation.Animator$AnimatorListener;
import java.util.ArrayList;
import android.animation.Animator;
import xe.g;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.Drawable;
import tf.f;
import tf.j;
import nf.c;
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
    public c D;
    public j a;
    public tf.f b;
    public Drawable c;
    public nf.a d;
    public LayerDrawable e;
    public boolean f;
    public boolean g;
    public float h;
    public float i;
    public float j;
    public int k;
    public g l;
    public g m;
    public Animator n;
    public g o;
    public g p;
    public float q;
    public float r;
    public int s;
    public int t;
    public ArrayList<Animator$AnimatorListener> u;
    public ArrayList<Animator$AnimatorListener> v;
    public ArrayList<e> w;
    public final FloatingActionButton x;
    public final b y;
    public final Rect z;
    
    static {
        E = xe.a.c;
        F = new int[] { 16842919, 16842910 };
        G = new int[] { 16843623, 16842908, 16842910 };
        H = new int[] { 16842908, 16842910 };
        I = new int[] { 16843623, 16842910 };
        J = new int[] { 16842910 };
        K = new int[0];
    }
    
    public d(final FloatingActionButton x, final FloatingActionButton$b y) {
        this.g = true;
        this.r = 1.0f;
        this.t = 0;
        this.z = new Rect();
        this.A = new RectF();
        this.B = new RectF();
        this.C = new Matrix();
        this.x = x;
        this.y = (b)y;
        final of.e e = new of.e();
        final int[] f = com.google.android.material.floatingactionbutton.d.F;
        final nf.d d = (nf.d)this;
        e.a(f, c((h)new d.d$d(d)));
        e.a(com.google.android.material.floatingactionbutton.d.G, c((h)new d.d$c(d)));
        e.a(com.google.android.material.floatingactionbutton.d.H, c((h)new d.d$c(d)));
        e.a(com.google.android.material.floatingactionbutton.d.I, c((h)new d.d$c(d)));
        e.a(com.google.android.material.floatingactionbutton.d.J, c((h)new d.d$g(d)));
        e.a(com.google.android.material.floatingactionbutton.d.K, c((h)new d.d$b(d)));
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
    
    public final AnimatorSet b(final g g, final float n, final float n2, final float n3) {
        final ArrayList list = new ArrayList();
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)this.x, View.ALPHA, new float[] { n });
        g.d("opacity").a((Animator)ofFloat);
        list.add(ofFloat);
        final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)this.x, View.SCALE_X, new float[] { n2 });
        g.d("scale").a((Animator)ofFloat2);
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT == 26) {
            ((ValueAnimator)ofFloat2).setEvaluator((TypeEvaluator)new nf.b());
        }
        list.add(ofFloat2);
        final ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((Object)this.x, View.SCALE_Y, new float[] { n2 });
        g.d("scale").a((Animator)ofFloat3);
        if (sdk_INT == 26) {
            ((ValueAnimator)ofFloat3).setEvaluator((TypeEvaluator)new nf.b());
        }
        list.add(ofFloat3);
        this.a(n3, this.C);
        final ObjectAnimator ofObject = ObjectAnimator.ofObject((Object)this.x, (Property)new xe.e(), (TypeEvaluator)new d$a(this), (Object[])new Matrix[] { new Matrix(this.C) });
        g.d("iconScale").a((Animator)ofObject);
        list.add(ofObject);
        final AnimatorSet set = new AnimatorSet();
        lw0.b.Q1(set, list);
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
            a$b.h(c, rf.a.b(list));
        }
    }
    
    public final void m(final j j) {
        this.a = j;
        final tf.f b = this.b;
        if (b != null) {
            b.setShapeAppearanceModel(j);
        }
        final Drawable c = this.c;
        if (c instanceof n) {
            ((n)c).setShapeAppearanceModel(j);
        }
        final nf.a d = this.d;
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
        c0.J2((Object)this.e, "Didn't initialize content background");
        if (this.n()) {
            FloatingActionButton.c(((FloatingActionButton$b)this.y).a, (Drawable)new InsetDrawable((Drawable)this.e, z.left, z.top, z.right, z.bottom));
        }
        else {
            final b y = this.y;
            final LayerDrawable e = this.e;
            final FloatingActionButton$b floatingActionButton$b = (FloatingActionButton$b)y;
            if (e != null) {
                FloatingActionButton.c(floatingActionButton$b.a, (Drawable)e);
            }
            else {
                floatingActionButton$b.getClass();
            }
        }
        final b y2 = this.y;
        final int left = z.left;
        final int top = z.top;
        final int right = z.right;
        final int bottom = z.bottom;
        final FloatingActionButton$b floatingActionButton$b2 = (FloatingActionButton$b)y2;
        floatingActionButton$b2.a.r.set(left, top, right, bottom);
        final FloatingActionButton a = floatingActionButton$b2.a;
        final int o = a.o;
        ((View)a).setPadding(left + o, top + o, right + o, bottom + o);
    }
    
    public interface e
    {
        void a();
        
        void b();
    }
    
    public interface f
    {
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
            final tf.f b = d.b;
            if (b != null) {
                b.k(n);
            }
            this.a = false;
        }
        
        public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
            if (!this.a) {
                final tf.f b = com.google.android.material.floatingactionbutton.d.this.b;
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
            final tf.f b3 = d.b;
            if (b3 != null) {
                b3.k(n2);
            }
        }
    }
}

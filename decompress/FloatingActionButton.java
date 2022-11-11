// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.floatingactionbutton;

import android.view.ViewGroup$MarginLayoutParams;
import android.os.BaseBundle;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.appbar.AppBarLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$f;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewTreeObserver;
import vf.f;
import android.view.ViewTreeObserver$OnPreDrawListener;
import a4.u1;
import df.b$a;
import android.graphics.ColorFilter;
import androidx.appcompat.widget.i;
import java.util.Iterator;
import android.animation.AnimatorSet;
import java.util.WeakHashMap;
import android.animation.Animator;
import android.view.View;
import a4.p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout$c;
import android.content.res.Resources;
import df.e;
import android.animation.Animator$AnimatorListener;
import java.util.ArrayList;
import android.view.View$MeasureSpec;
import android.graphics.drawable.Drawable;
import android.graphics.Matrix;
import vf.h;
import android.content.res.TypedArray;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import qf.j;
import sf.c;
import qf.g;
import pj2.u;
import android.util.AttributeSet;
import android.content.Context;
import pf.d;
import of.b;
import androidx.appcompat.widget.m;
import android.graphics.Rect;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import androidx.coordinatorlayout.widget.CoordinatorLayout$b;
import vf.n;
import of.a;
import qf.k;

public class FloatingActionButton extends k implements of.a, n, CoordinatorLayout$b
{
    public ColorStateList g;
    public PorterDuff$Mode h;
    public ColorStateList i;
    public PorterDuff$Mode j;
    public ColorStateList k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public final Rect r;
    public final Rect s;
    public final m t;
    public final of.b u;
    public d v;
    
    public FloatingActionButton(final Context context, final AttributeSet set) {
        this(context, set, 2130969013);
    }
    
    public FloatingActionButton(final Context context, final AttributeSet set, int p3) {
        super(ag.a.a(context, set, p3, 2132018070), set, p3);
        this.r = new Rect();
        this.s = new Rect();
        final Context context2 = ((View)this).getContext();
        final TypedArray d = qf.g.d(context2, set, pj2.u.y, p3, 2132018070, new int[0]);
        this.g = sf.c.a(context2, d, 1);
        this.h = qf.j.c(d.getInt(2, -1), (PorterDuff$Mode)null);
        this.k = sf.c.a(context2, d, 19);
        this.m = d.getInt(7, -1);
        this.n = d.getDimensionPixelSize(6, 0);
        this.l = d.getDimensionPixelSize(3, 0);
        final float dimension = d.getDimension(4, 0.0f);
        final float dimension2 = d.getDimension(9, 0.0f);
        final float dimension3 = d.getDimension(18, 0.0f);
        this.q = d.getBoolean(23, false);
        final int dimensionPixelSize = ((View)this).getResources().getDimensionPixelSize(2131166262);
        this.p = d.getDimensionPixelSize(17, 0);
        final ze.g a = ze.g.a(context2, d, 22);
        final ze.g a2 = ze.g.a(context2, d, 8);
        final h m = vf.j.m;
        final TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(set, pj2.u.K, p3, 2132018070);
        final int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        final int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        final vf.j j = new vf.j(vf.j.a(context2, resourceId, resourceId2, (vf.c)m));
        final boolean boolean1 = d.getBoolean(5, false);
        ((View)this).setEnabled(d.getBoolean(0, true));
        d.recycle();
        (this.t = new m((ImageView)this)).b(set, p3);
        this.u = new of.b(this);
        this.getImpl().m(j);
        this.getImpl().f(this.g, this.h, this.k, this.l);
        this.getImpl().k = dimensionPixelSize;
        final com.google.android.material.floatingactionbutton.d impl = this.getImpl();
        if (impl.h != dimension) {
            impl.j(impl.h = dimension, impl.i, impl.j);
        }
        final com.google.android.material.floatingactionbutton.d impl2 = this.getImpl();
        if (impl2.i != dimension2) {
            impl2.i = dimension2;
            impl2.j(impl2.h, dimension2, impl2.j);
        }
        final com.google.android.material.floatingactionbutton.d impl3 = this.getImpl();
        if (impl3.j != dimension3) {
            impl3.j = dimension3;
            impl3.j(impl3.h, impl3.i, dimension3);
        }
        final com.google.android.material.floatingactionbutton.d impl4 = this.getImpl();
        p3 = this.p;
        if (impl4.s != p3) {
            impl4.s = p3;
            final float r = impl4.r;
            impl4.r = r;
            final Matrix c = impl4.C;
            impl4.a(r, c);
            ((ImageView)impl4.x).setImageMatrix(c);
        }
        this.getImpl().o = a;
        this.getImpl().p = a2;
        this.getImpl().f = boolean1;
        ((ImageView)this).setScaleType(ImageView$ScaleType.MATRIX);
    }
    
    private com.google.android.material.floatingactionbutton.d getImpl() {
        if (this.v == null) {
            this.v = new d(this, new b());
        }
        return (com.google.android.material.floatingactionbutton.d)this.v;
    }
    
    public static int m(int min, int size) {
        final int mode = View$MeasureSpec.getMode(size);
        size = View$MeasureSpec.getSize(size);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    throw new IllegalArgumentException();
                }
                min = size;
            }
        }
        else {
            min = Math.min(min, size);
        }
        return min;
    }
    
    public final boolean a() {
        return this.u.b;
    }
    
    public final void d() {
        final com.google.android.material.floatingactionbutton.d impl = this.getImpl();
        if (impl.v == null) {
            impl.v = new ArrayList<Animator$AnimatorListener>();
        }
        impl.v.add(null);
    }
    
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.getImpl().i(((View)this).getDrawableState());
    }
    
    public final void e(final e e) {
        final com.google.android.material.floatingactionbutton.d impl = this.getImpl();
        if (impl.u == null) {
            impl.u = new ArrayList<Animator$AnimatorListener>();
        }
        impl.u.add((Animator$AnimatorListener)e);
    }
    
    public final void f() {
        final com.google.android.material.floatingactionbutton.d impl = this.getImpl();
        final c c = new c();
        if (impl.w == null) {
            impl.w = new ArrayList<com.google.android.material.floatingactionbutton.d.e>();
        }
        impl.w.add((com.google.android.material.floatingactionbutton.d.e)c);
    }
    
    public final int g(int n) {
        final int n2 = this.n;
        if (n2 != 0) {
            return n2;
        }
        final Resources resources = ((View)this).getResources();
        if (n == -1) {
            if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
                n = this.g(1);
            }
            else {
                n = this.g(0);
            }
            return n;
        }
        if (n != 1) {
            return resources.getDimensionPixelSize(2131165626);
        }
        return resources.getDimensionPixelSize(2131165625);
    }
    
    public ColorStateList getBackgroundTintList() {
        return this.g;
    }
    
    public PorterDuff$Mode getBackgroundTintMode() {
        return this.h;
    }
    
    public CoordinatorLayout$c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }
    
    public float getCompatElevation() {
        return this.getImpl().d();
    }
    
    public float getCompatHoveredFocusedTranslationZ() {
        return this.getImpl().i;
    }
    
    public float getCompatPressedTranslationZ() {
        return this.getImpl().j;
    }
    
    public Drawable getContentBackground() {
        return (Drawable)this.getImpl().e;
    }
    
    public int getCustomSize() {
        return this.n;
    }
    
    public int getExpandedComponentIdHint() {
        return this.u.c;
    }
    
    public ze.g getHideMotionSpec() {
        return this.getImpl().p;
    }
    
    @Deprecated
    public int getRippleColor() {
        final ColorStateList k = this.k;
        int defaultColor;
        if (k != null) {
            defaultColor = k.getDefaultColor();
        }
        else {
            defaultColor = 0;
        }
        return defaultColor;
    }
    
    public ColorStateList getRippleColorStateList() {
        return this.k;
    }
    
    public vf.j getShapeAppearanceModel() {
        final vf.j a = this.getImpl().a;
        a.getClass();
        return a;
    }
    
    public ze.g getShowMotionSpec() {
        return this.getImpl().o;
    }
    
    public int getSize() {
        return this.m;
    }
    
    public int getSizeDimension() {
        return this.g(this.m);
    }
    
    public ColorStateList getSupportBackgroundTintList() {
        return this.getBackgroundTintList();
    }
    
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        return this.getBackgroundTintMode();
    }
    
    public ColorStateList getSupportImageTintList() {
        return this.i;
    }
    
    public PorterDuff$Mode getSupportImageTintMode() {
        return this.j;
    }
    
    public boolean getUseCompatPadding() {
        return this.q;
    }
    
    public final void h(final df.b b, final boolean b2) {
        final com.google.android.material.floatingactionbutton.d impl = this.getImpl();
        com.google.android.material.floatingactionbutton.a a;
        if (b == null) {
            a = null;
        }
        else {
            a = new com.google.android.material.floatingactionbutton.a(this, (a)b);
        }
        final int visibility = ((View)impl.x).getVisibility();
        final int n = 1;
        if ((visibility != 0) ? (impl.t == 2) : (impl.t != 1)) {
            final Animator n2 = impl.n;
            if (n2 != null) {
                n2.cancel();
            }
            final FloatingActionButton x = impl.x;
            final WeakHashMap a2 = p0.a;
            int n3;
            if (p0.g.c((View)x) && !((View)impl.x).isInEditMode()) {
                n3 = n;
            }
            else {
                n3 = 0;
            }
            if (n3 != 0) {
                ze.g g = impl.p;
                if (g == null) {
                    if (impl.m == null) {
                        impl.m = ze.g.b(2130837506, ((View)impl.x).getContext());
                    }
                    g = impl.m;
                    g.getClass();
                }
                final AnimatorSet b3 = impl.b(g, 0.0f, 0.0f, 0.0f);
                ((Animator)b3).addListener((Animator$AnimatorListener)new com.google.android.material.floatingactionbutton.b(impl, b2, a));
                final ArrayList<Animator$AnimatorListener> v = impl.v;
                if (v != null) {
                    final Iterator<Animator$AnimatorListener> iterator = v.iterator();
                    while (iterator.hasNext()) {
                        ((Animator)b3).addListener((Animator$AnimatorListener)iterator.next());
                    }
                }
                b3.start();
            }
            else {
                final FloatingActionButton x2 = impl.x;
                int n4;
                if (b2) {
                    n4 = 8;
                }
                else {
                    n4 = 4;
                }
                x2.b(n4, b2);
                if (a != null) {
                    a.a.a(a.b);
                }
            }
        }
    }
    
    public final boolean i() {
        final com.google.android.material.floatingactionbutton.d impl = this.getImpl();
        final int visibility = ((View)impl.x).getVisibility();
        boolean b = false;
        if (visibility == 0) {
            if (impl.t != 1) {
                return b;
            }
        }
        else if (impl.t == 2) {
            return b;
        }
        b = true;
        return b;
    }
    
    public final boolean j() {
        final com.google.android.material.floatingactionbutton.d impl = this.getImpl();
        final int visibility = ((View)impl.x).getVisibility();
        boolean b = false;
        if (visibility != 0) {
            if (impl.t != 2) {
                return b;
            }
        }
        else if (impl.t == 1) {
            return b;
        }
        b = true;
        return b;
    }
    
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.getImpl().g();
    }
    
    public final void k(final Rect rect) {
        final int left = rect.left;
        final Rect r = this.r;
        rect.left = left + r.left;
        rect.top += r.top;
        rect.right -= r.right;
        rect.bottom -= r.bottom;
    }
    
    public final void l() {
        final Drawable drawable = ((ImageView)this).getDrawable();
        if (drawable == null) {
            return;
        }
        final ColorStateList i = this.i;
        if (i == null) {
            drawable.clearColorFilter();
            return;
        }
        final int colorForState = i.getColorForState(((View)this).getDrawableState(), 0);
        PorterDuff$Mode porterDuff$Mode;
        if ((porterDuff$Mode = this.j) == null) {
            porterDuff$Mode = PorterDuff$Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter((ColorFilter)androidx.appcompat.widget.i.c(colorForState, porterDuff$Mode));
    }
    
    public final void n(final b$a b$a, final boolean b) {
        final com.google.android.material.floatingactionbutton.d impl = this.getImpl();
        com.google.android.material.floatingactionbutton.a a;
        if (b$a == null) {
            a = null;
        }
        else {
            a = new com.google.android.material.floatingactionbutton.a(this, (a)b$a);
        }
        final int visibility = ((View)impl.x).getVisibility();
        final int n = 1;
        if ((visibility == 0) ? (impl.t == 1) : (impl.t != 2)) {
            final Animator n2 = impl.n;
            if (n2 != null) {
                n2.cancel();
            }
            final FloatingActionButton x = impl.x;
            final WeakHashMap a2 = p0.a;
            int n3;
            if (p0.g.c((View)x) && !((View)impl.x).isInEditMode()) {
                n3 = n;
            }
            else {
                n3 = 0;
            }
            if (n3 != 0) {
                if (((View)impl.x).getVisibility() != 0) {
                    ((View)impl.x).setAlpha(0.0f);
                    impl.x.setScaleY(0.0f);
                    impl.x.setScaleX(0.0f);
                    impl.r = 0.0f;
                    final Matrix c = impl.C;
                    impl.a(0.0f, c);
                    ((ImageView)impl.x).setImageMatrix(c);
                }
                ze.g g = impl.o;
                if (g == null) {
                    if (impl.l == null) {
                        impl.l = ze.g.b(2130837507, ((View)impl.x).getContext());
                    }
                    g = impl.l;
                    g.getClass();
                }
                final AnimatorSet b2 = impl.b(g, 1.0f, 1.0f, 1.0f);
                ((Animator)b2).addListener((Animator$AnimatorListener)new com.google.android.material.floatingactionbutton.c(impl, b, a));
                final ArrayList<Animator$AnimatorListener> u = impl.u;
                if (u != null) {
                    final Iterator<Animator$AnimatorListener> iterator = u.iterator();
                    while (iterator.hasNext()) {
                        ((Animator)b2).addListener((Animator$AnimatorListener)iterator.next());
                    }
                }
                b2.start();
            }
            else {
                impl.x.b(0, b);
                ((View)impl.x).setAlpha(1.0f);
                impl.x.setScaleY(1.0f);
                impl.x.setScaleX(1.0f);
                impl.r = 1.0f;
                final Matrix c2 = impl.C;
                impl.a(1.0f, c2);
                ((ImageView)impl.x).setImageMatrix(c2);
                if (a != null) {
                    a.a.b();
                }
            }
        }
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final com.google.android.material.floatingactionbutton.d impl = this.getImpl();
        final f b = impl.b;
        if (b != null) {
            u1.c1((View)impl.x, b);
        }
        if (impl instanceof d ^ true) {
            final ViewTreeObserver viewTreeObserver = ((View)impl.x).getViewTreeObserver();
            if (impl.D == null) {
                impl.D = new pf.c(impl);
            }
            viewTreeObserver.addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)impl.D);
        }
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final com.google.android.material.floatingactionbutton.d impl = this.getImpl();
        final ViewTreeObserver viewTreeObserver = ((View)impl.x).getViewTreeObserver();
        final pf.c d = impl.D;
        if (d != null) {
            viewTreeObserver.removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)d);
            impl.D = null;
        }
    }
    
    public final void onMeasure(int min, final int n) {
        final int sizeDimension = this.getSizeDimension();
        this.o = (sizeDimension - this.p) / 2;
        this.getImpl().p();
        min = Math.min(m(sizeDimension, min), m(sizeDimension, n));
        final Rect r = this.r;
        ((View)this).setMeasuredDimension(r.left + min + r.right, min + r.top + r.bottom);
    }
    
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof xf.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final xf.a a = (xf.a)parcelable;
        super.onRestoreInstanceState(a.f);
        final of.b u = this.u;
        final Object orDefault = a.h.getOrDefault((Object)"expandableWidgetHelper", (Object)null);
        orDefault.getClass();
        final Bundle bundle = (Bundle)orDefault;
        u.getClass();
        u.b = ((BaseBundle)bundle).getBoolean("expanded", false);
        u.c = ((BaseBundle)bundle).getInt("expandedComponentIdHint", 0);
        if (u.b) {
            final ViewParent parent = u.a.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout)parent).c(u.a);
            }
        }
    }
    
    public final Parcelable onSaveInstanceState() {
        Object onSaveInstanceState;
        if ((onSaveInstanceState = super.onSaveInstanceState()) == null) {
            onSaveInstanceState = new Bundle();
        }
        final xf.a a = new xf.a((Parcelable)onSaveInstanceState);
        final j0.i<String, Bundle> h = a.h;
        final of.b u = this.u;
        u.getClass();
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putBoolean("expanded", u.b);
        ((BaseBundle)bundle).putInt("expandedComponentIdHint", u.c);
        h.put((Object)"expandableWidgetHelper", (Object)bundle);
        return (Parcelable)a;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            final Rect s = this.s;
            final WeakHashMap a = p0.a;
            boolean b;
            if (p0.g.c((View)this)) {
                s.set(0, 0, ((View)this).getWidth(), ((View)this).getHeight());
                this.k(s);
                b = true;
            }
            else {
                b = false;
            }
            if (b && !this.s.contains((int)motionEvent.getX(), (int)motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public void setBackgroundColor(final int n) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }
    
    public void setBackgroundDrawable(final Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }
    
    public void setBackgroundResource(final int n) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }
    
    public void setBackgroundTintList(final ColorStateList p) {
        if (this.g != p) {
            this.g = p;
            final com.google.android.material.floatingactionbutton.d impl = this.getImpl();
            final f b = impl.b;
            if (b != null) {
                b.setTintList(p);
            }
            final pf.a d = impl.d;
            if (d != null) {
                if (p != null) {
                    d.m = p.getColorForState(d.getState(), d.m);
                }
                d.p = p;
                d.n = true;
                d.invalidateSelf();
            }
        }
    }
    
    public void setBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        if (this.h != porterDuff$Mode) {
            this.h = porterDuff$Mode;
            final f b = this.getImpl().b;
            if (b != null) {
                b.setTintMode(porterDuff$Mode);
            }
        }
    }
    
    public void setCompatElevation(final float h) {
        final com.google.android.material.floatingactionbutton.d impl = this.getImpl();
        if (impl.h != h) {
            impl.j(impl.h = h, impl.i, impl.j);
        }
    }
    
    public void setCompatElevationResource(final int n) {
        this.setCompatElevation(((View)this).getResources().getDimension(n));
    }
    
    public void setCompatHoveredFocusedTranslationZ(final float i) {
        final com.google.android.material.floatingactionbutton.d impl = this.getImpl();
        if (impl.i != i) {
            impl.i = i;
            impl.j(impl.h, i, impl.j);
        }
    }
    
    public void setCompatHoveredFocusedTranslationZResource(final int n) {
        this.setCompatHoveredFocusedTranslationZ(((View)this).getResources().getDimension(n));
    }
    
    public void setCompatPressedTranslationZ(final float j) {
        final com.google.android.material.floatingactionbutton.d impl = this.getImpl();
        if (impl.j != j) {
            impl.j = j;
            impl.j(impl.h, impl.i, j);
        }
    }
    
    public void setCompatPressedTranslationZResource(final int n) {
        this.setCompatPressedTranslationZ(((View)this).getResources().getDimension(n));
    }
    
    public void setCustomSize(final int n) {
        if (n >= 0) {
            if (n != this.n) {
                this.n = n;
                ((View)this).requestLayout();
            }
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }
    
    public void setElevation(final float elevation) {
        super.setElevation(elevation);
        final f b = this.getImpl().b;
        if (b != null) {
            b.k(elevation);
        }
    }
    
    public void setEnsureMinTouchTargetSize(final boolean f) {
        if (f != this.getImpl().f) {
            this.getImpl().f = f;
            ((View)this).requestLayout();
        }
    }
    
    public void setExpandedComponentIdHint(final int c) {
        this.u.c = c;
    }
    
    public void setHideMotionSpec(final ze.g p) {
        this.getImpl().p = p;
    }
    
    public void setHideMotionSpecResource(final int n) {
        this.setHideMotionSpec(ze.g.b(n, ((View)this).getContext()));
    }
    
    public void setImageDrawable(final Drawable imageDrawable) {
        if (((ImageView)this).getDrawable() != imageDrawable) {
            super.setImageDrawable(imageDrawable);
            final com.google.android.material.floatingactionbutton.d impl = this.getImpl();
            final float r = impl.r;
            impl.r = r;
            final Matrix c = impl.C;
            impl.a(r, c);
            ((ImageView)impl.x).setImageMatrix(c);
            if (this.i != null) {
                this.l();
            }
        }
    }
    
    public void setImageResource(final int n) {
        this.t.c(n);
        this.l();
    }
    
    public void setRippleColor(final int n) {
        this.setRippleColor(ColorStateList.valueOf(n));
    }
    
    public void setRippleColor(final ColorStateList k) {
        if (this.k != k) {
            this.k = k;
            this.getImpl().l(this.k);
        }
    }
    
    public void setScaleX(final float scaleX) {
        super.setScaleX(scaleX);
        final ArrayList<com.google.android.material.floatingactionbutton.d.e> w = this.getImpl().w;
        if (w != null) {
            final Iterator<com.google.android.material.floatingactionbutton.d.e> iterator = w.iterator();
            while (iterator.hasNext()) {
                ((com.google.android.material.floatingactionbutton.d.e)iterator.next()).a();
            }
        }
    }
    
    public void setScaleY(final float scaleY) {
        super.setScaleY(scaleY);
        final ArrayList<com.google.android.material.floatingactionbutton.d.e> w = this.getImpl().w;
        if (w != null) {
            final Iterator<com.google.android.material.floatingactionbutton.d.e> iterator = w.iterator();
            while (iterator.hasNext()) {
                ((com.google.android.material.floatingactionbutton.d.e)iterator.next()).a();
            }
        }
    }
    
    public void setShadowPaddingEnabled(final boolean g) {
        final com.google.android.material.floatingactionbutton.d impl = this.getImpl();
        impl.g = g;
        impl.p();
    }
    
    public void setShapeAppearanceModel(final vf.j j) {
        this.getImpl().m(j);
    }
    
    public void setShowMotionSpec(final ze.g o) {
        this.getImpl().o = o;
    }
    
    public void setShowMotionSpecResource(final int n) {
        this.setShowMotionSpec(ze.g.b(n, ((View)this).getContext()));
    }
    
    public void setSize(final int m) {
        this.n = 0;
        if (m != this.m) {
            this.m = m;
            ((View)this).requestLayout();
        }
    }
    
    public void setSupportBackgroundTintList(final ColorStateList backgroundTintList) {
        this.setBackgroundTintList(backgroundTintList);
    }
    
    public void setSupportBackgroundTintMode(final PorterDuff$Mode backgroundTintMode) {
        this.setBackgroundTintMode(backgroundTintMode);
    }
    
    public void setSupportImageTintList(final ColorStateList i) {
        if (this.i != i) {
            this.i = i;
            this.l();
        }
    }
    
    public void setSupportImageTintMode(final PorterDuff$Mode j) {
        if (this.j != j) {
            this.j = j;
            this.l();
        }
    }
    
    public void setTranslationX(final float translationX) {
        super.setTranslationX(translationX);
        this.getImpl().k();
    }
    
    public void setTranslationY(final float translationY) {
        super.setTranslationY(translationY);
        this.getImpl().k();
    }
    
    public void setTranslationZ(final float translationZ) {
        super.setTranslationZ(translationZ);
        this.getImpl().k();
    }
    
    public void setUseCompatPadding(final boolean q) {
        if (this.q != q) {
            this.q = q;
            this.getImpl().h();
        }
    }
    
    public void setVisibility(final int visibility) {
        super.setVisibility(visibility);
    }
    
    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout$c<T>
    {
        public Rect a;
        public boolean b;
        
        public BaseBehavior() {
            this.b = true;
        }
        
        public BaseBehavior(final Context context, final AttributeSet set) {
            super(context, set);
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, u.z);
            this.b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
        
        public final boolean a(final View view, final Rect rect) {
            final FloatingActionButton floatingActionButton = (FloatingActionButton)view;
            final Rect r = floatingActionButton.r;
            rect.set(((View)floatingActionButton).getLeft() + r.left, ((View)floatingActionButton).getTop() + r.top, ((View)floatingActionButton).getRight() - r.right, ((View)floatingActionButton).getBottom() - r.bottom);
            return true;
        }
        
        public final void c(final CoordinatorLayout$f coordinatorLayout$f) {
            if (coordinatorLayout$f.h == 0) {
                coordinatorLayout$f.h = 80;
            }
        }
        
        public final boolean d(final CoordinatorLayout coordinatorLayout, final View view, final View view2) {
            final FloatingActionButton floatingActionButton = (FloatingActionButton)view;
            if (view2 instanceof AppBarLayout) {
                this.w(coordinatorLayout, (AppBarLayout)view2, floatingActionButton);
            }
            else {
                final ViewGroup$LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout$f && ((CoordinatorLayout$f)layoutParams).a instanceof BottomSheetBehavior) {
                    this.x(view2, floatingActionButton);
                }
            }
            return false;
        }
        
        public final boolean h(final CoordinatorLayout coordinatorLayout, final View view, int right) {
            final FloatingActionButton floatingActionButton = (FloatingActionButton)view;
            final ArrayList e = coordinatorLayout.e((View)floatingActionButton);
            final int size = e.size();
            final int n = 0;
            for (int i = 0; i < size; ++i) {
                final View view2 = (View)e.get(i);
                if (view2 instanceof AppBarLayout) {
                    if (this.w(coordinatorLayout, (AppBarLayout)view2, floatingActionButton)) {
                        break;
                    }
                }
                else {
                    final ViewGroup$LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout$f && ((CoordinatorLayout$f)layoutParams).a instanceof BottomSheetBehavior && this.x(view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.r(right, (View)floatingActionButton);
            final Rect r = floatingActionButton.r;
            if (r != null && r.centerX() > 0 && r.centerY() > 0) {
                final CoordinatorLayout$f coordinatorLayout$f = (CoordinatorLayout$f)((View)floatingActionButton).getLayoutParams();
                if (((View)floatingActionButton).getRight() >= ((View)coordinatorLayout).getWidth() - ((ViewGroup$MarginLayoutParams)coordinatorLayout$f).rightMargin) {
                    right = r.right;
                }
                else if (((View)floatingActionButton).getLeft() <= ((ViewGroup$MarginLayoutParams)coordinatorLayout$f).leftMargin) {
                    right = -r.left;
                }
                else {
                    right = 0;
                }
                int bottom;
                if (((View)floatingActionButton).getBottom() >= ((View)coordinatorLayout).getHeight() - ((ViewGroup$MarginLayoutParams)coordinatorLayout$f).bottomMargin) {
                    bottom = r.bottom;
                }
                else {
                    bottom = n;
                    if (((View)floatingActionButton).getTop() <= ((ViewGroup$MarginLayoutParams)coordinatorLayout$f).topMargin) {
                        bottom = -r.top;
                    }
                }
                if (bottom != 0) {
                    final WeakHashMap a = p0.a;
                    ((View)floatingActionButton).offsetTopAndBottom(bottom);
                }
                if (right != 0) {
                    final WeakHashMap a2 = p0.a;
                    ((View)floatingActionButton).offsetLeftAndRight(right);
                }
            }
            return true;
        }
        
        public final boolean v(final View view, final FloatingActionButton floatingActionButton) {
            final CoordinatorLayout$f coordinatorLayout$f = (CoordinatorLayout$f)((View)floatingActionButton).getLayoutParams();
            return this.b && coordinatorLayout$f.f == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }
        
        public final boolean w(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, final FloatingActionButton floatingActionButton) {
            if (!this.v((View)appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            final Rect a = this.a;
            qf.b.a((ViewGroup)coordinatorLayout, (View)appBarLayout, a);
            if (a.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.h(null, false);
            }
            else {
                floatingActionButton.n(null, false);
            }
            return true;
        }
        
        public final boolean x(final View view, final FloatingActionButton floatingActionButton) {
            if (!this.v(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < ((View)floatingActionButton).getHeight() / 2 + ((ViewGroup$MarginLayoutParams)((View)floatingActionButton).getLayoutParams()).topMargin) {
                floatingActionButton.h(null, false);
            }
            else {
                floatingActionButton.n(null, false);
            }
            return true;
        }
    }
    
    public static class Behavior extends BaseBehavior<FloatingActionButton>
    {
        public Behavior() {
        }
        
        public Behavior(final Context context, final AttributeSet set) {
            super(context, set);
        }
    }
    
    public abstract static class a
    {
        public void a(final FloatingActionButton floatingActionButton) {
        }
        
        public void b() {
        }
    }
    
    public final class b implements uf.b
    {
    }
    
    public final class c<T extends FloatingActionButton> implements e
    {
        public c(final FloatingActionButton floatingActionButton) {
        }
        
        @Override
        public final void a() {
            throw null;
        }
        
        @Override
        public final void b() {
            throw null;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (!(o instanceof c)) {
                return false;
            }
            o.getClass();
            throw null;
        }
        
        @Override
        public final int hashCode() {
            throw null;
        }
    }
}

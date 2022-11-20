// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.appbar;

import a4.l0$e;
import android.graphics.drawable.Drawable$Callback;
import a4.l0$g;
import cg.d;
import android.view.View$MeasureSpec;
import px0.c;
import android.view.ViewGroup;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import java.util.WeakHashMap;
import android.content.res.TypedArray;
import a4.b0;
import a4.l0$i;
import android.content.res.ColorStateList;
import uf.f;
import android.graphics.drawable.ColorDrawable;
import a4.l0$d;
import a4.l0;
import oy0.b;
import android.animation.AnimatorInflater;
import pf.g;
import ze.h;
import android.view.ViewOutlineProvider;
import android.os.Build$VERSION;
import zf.a;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import a4.r1;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.widget.LinearLayout;

public class AppBarLayout extends LinearLayout implements b
{
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public int k;
    public r1 l;
    public ArrayList m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public WeakReference<View> r;
    public ValueAnimator s;
    public int[] t;
    public Drawable u;
    
    public AppBarLayout(Context context, final AttributeSet set) {
        super(a.a(context, set, 2130968640, 2132018068), set, 2130968640);
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.k = 0;
        context = ((View)this).getContext();
        this.setOrientation(1);
        final int sdk_INT = Build$VERSION.SDK_INT;
        ((View)this).setOutlineProvider(ViewOutlineProvider.BOUNDS);
        final Context context2 = ((View)this).getContext();
        Object o = pf.g.d(context2, set, ze.h.a, 2130968640, 2132018068, new int[0]);
        try {
            if (((TypedArray)o).hasValue(0)) {
                ((View)this).setStateListAnimator(AnimatorInflater.loadStateListAnimator(context2, ((TypedArray)o).getResourceId(0, 0)));
            }
            ((TypedArray)o).recycle();
            final TypedArray d = pf.g.d(context, set, oy0.b.w, 2130968640, 2132018068, new int[0]);
            o = d.getDrawable(0);
            final WeakHashMap a = l0.a;
            l0$d.q((View)this, (Drawable)o);
            if (((View)this).getBackground() instanceof ColorDrawable) {
                o = ((View)this).getBackground();
                final f f = new f();
                f.l(ColorStateList.valueOf(((ColorDrawable)o).getColor()));
                f.i(context);
                l0$d.q((View)this, (Drawable)f);
            }
            if (d.hasValue(4)) {
                this.f(d.getBoolean(4, false), false, false);
            }
            if (d.hasValue(3)) {
                ze.h.a((View)this, (float)d.getDimensionPixelSize(3, 0));
            }
            if (sdk_INT >= 26) {
                if (d.hasValue(2)) {
                    this.setKeyboardNavigationCluster(d.getBoolean(2, false));
                }
                if (d.hasValue(1)) {
                    ((ViewGroup)this).setTouchscreenBlocksFocus(d.getBoolean(1, false));
                }
            }
            this.p = d.getBoolean(5, false);
            this.q = d.getResourceId(6, -1);
            this.setStatusBarForeground(d.getDrawable(7));
            d.recycle();
            l0$i.u((View)this, (b0)new ze.a(this));
        }
        finally {
            ((TypedArray)o).recycle();
        }
    }
    
    public static AppBarLayout.AppBarLayout$b c(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof LinearLayout$LayoutParams) {
            return new AppBarLayout.AppBarLayout$b((LinearLayout$LayoutParams)viewGroup$LayoutParams);
        }
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            return new AppBarLayout.AppBarLayout$b((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        return new AppBarLayout.AppBarLayout$b(viewGroup$LayoutParams);
    }
    
    public final void b(final c c) {
        if (this.m == null) {
            this.m = new ArrayList();
        }
        if (c != null && !this.m.contains(c)) {
            this.m.add(c);
        }
    }
    
    public final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof AppBarLayout.AppBarLayout$b;
    }
    
    public final void d(final int f) {
        this.f = f;
        if (!((View)this).willNotDraw()) {
            final WeakHashMap a = l0.a;
            l0$d.k((View)this);
        }
        final ArrayList m = this.m;
        if (m != null) {
            for (int i = 0; i < m.size(); ++i) {
                final AppBarLayout$a appBarLayout$a = this.m.get(i);
                if (appBarLayout$a != null) {
                    appBarLayout$a.a(this, f);
                }
            }
        }
    }
    
    public final void draw(final Canvas canvas) {
        super.draw(canvas);
        if (this.u != null && this.getTopInset() > 0) {
            final int save = canvas.save();
            canvas.translate(0.0f, (float)(-this.f));
            this.u.draw(canvas);
            canvas.restoreToCount(save);
        }
    }
    
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        final int[] drawableState = ((View)this).getDrawableState();
        final Drawable u = this.u;
        if (u != null && u.isStateful() && u.setState(drawableState)) {
            ((View)this).invalidateDrawable(u);
        }
    }
    
    public void e(final boolean b, final boolean b2) {
        this.f(b, b2, true);
    }
    
    public final void f(final boolean b, final boolean b2, final boolean b3) {
        int n;
        if (b) {
            n = 1;
        }
        else {
            n = 2;
        }
        int n2 = 0;
        int n3;
        if (b2) {
            n3 = 4;
        }
        else {
            n3 = 0;
        }
        if (b3) {
            n2 = 8;
        }
        this.k = (n | n3 | n2);
        ((View)this).requestLayout();
    }
    
    public final boolean g(final boolean o) {
        if (this.o != o) {
            this.o = o;
            ((View)this).refreshDrawableState();
            if (this.p && ((View)this).getBackground() instanceof f) {
                final f f = (f)((View)this).getBackground();
                float dimension = ((View)this).getResources().getDimension(2131165605);
                float n;
                if (o) {
                    n = 0.0f;
                }
                else {
                    n = dimension;
                }
                if (!o) {
                    dimension = 0.0f;
                }
                final ValueAnimator s = this.s;
                if (s != null) {
                    s.cancel();
                }
                (this.s = ValueAnimator.ofFloat(new float[] { n, dimension })).setDuration((long)((View)this).getResources().getInteger(2131492866));
                this.s.setInterpolator((TimeInterpolator)ye.a.a);
                this.s.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ze.b(f));
                this.s.start();
            }
            return true;
        }
        return false;
    }
    
    public final ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new AppBarLayout.AppBarLayout$b();
    }
    
    public final LinearLayout$LayoutParams generateDefaultLayoutParams() {
        return (LinearLayout$LayoutParams)new AppBarLayout.AppBarLayout$b();
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new AppBarLayout.AppBarLayout$b(((View)this).getContext(), set);
    }
    
    public final /* bridge */ ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)c(viewGroup$LayoutParams);
    }
    
    public final LinearLayout$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (LinearLayout$LayoutParams)new AppBarLayout.AppBarLayout$b(((View)this).getContext(), set);
    }
    
    public final /* bridge */ LinearLayout$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (LinearLayout$LayoutParams)c(viewGroup$LayoutParams);
    }
    
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        return (CoordinatorLayout.c<AppBarLayout>)new Behavior();
    }
    
    public int getDownNestedPreScrollRange() {
        final int h = this.h;
        if (h != -1) {
            return h;
        }
        int i = ((ViewGroup)this).getChildCount() - 1;
        int n = 0;
        while (i >= 0) {
            final View child = ((ViewGroup)this).getChildAt(i);
            final AppBarLayout.AppBarLayout$b appBarLayout$b = (AppBarLayout.AppBarLayout$b)child.getLayoutParams();
            final int measuredHeight = child.getMeasuredHeight();
            final int a = appBarLayout$b.a;
            int n4;
            if ((a & 0x5) == 0x5) {
                final int n2 = ((LinearLayout$LayoutParams)appBarLayout$b).topMargin + ((LinearLayout$LayoutParams)appBarLayout$b).bottomMargin;
                int n3 = 0;
                Label_0130: {
                    int d;
                    if ((a & 0x8) != 0x0) {
                        final WeakHashMap a2 = l0.a;
                        d = l0$d.d(child);
                    }
                    else {
                        if ((a & 0x2) == 0x0) {
                            n3 = n2 + measuredHeight;
                            break Label_0130;
                        }
                        final WeakHashMap a3 = l0.a;
                        d = measuredHeight - l0$d.d(child);
                    }
                    n3 = d + n2;
                }
                int min = n3;
                if (i == 0) {
                    final WeakHashMap a4 = l0.a;
                    min = n3;
                    if (l0$d.b(child)) {
                        min = Math.min(n3, measuredHeight - this.getTopInset());
                    }
                }
                n4 = n + min;
            }
            else if ((n4 = n) > 0) {
                break;
            }
            --i;
            n = n4;
        }
        return this.h = Math.max(0, n);
    }
    
    public int getDownNestedScrollRange() {
        final int i = this.i;
        if (i != -1) {
            return i;
        }
        final int childCount = ((ViewGroup)this).getChildCount();
        int n = 0;
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n2;
            if (n >= childCount) {
                break;
            }
            final View child = ((ViewGroup)this).getChildAt(n);
            final AppBarLayout.AppBarLayout$b appBarLayout$b = (AppBarLayout.AppBarLayout$b)child.getLayoutParams();
            final int measuredHeight = child.getMeasuredHeight();
            final int topMargin = ((LinearLayout$LayoutParams)appBarLayout$b).topMargin;
            final int bottomMargin = ((LinearLayout$LayoutParams)appBarLayout$b).bottomMargin;
            final int a = appBarLayout$b.a;
            n3 = n2;
            if ((a & 0x1) == 0x0) {
                break;
            }
            n2 += topMargin + bottomMargin + measuredHeight;
            if ((a & 0x2) != 0x0) {
                final WeakHashMap a2 = l0.a;
                n3 = n2 - l0$d.d(child);
                break;
            }
            ++n;
        }
        return this.i = Math.max(0, n3);
    }
    
    public int getLiftOnScrollTargetViewId() {
        return this.q;
    }
    
    public final int getMinimumHeightForVisibleOverlappingContent() {
        final int topInset = this.getTopInset();
        final WeakHashMap a = l0.a;
        int n = l0$d.d((View)this);
        if (n == 0) {
            final int childCount = ((ViewGroup)this).getChildCount();
            if (childCount >= 1) {
                n = l0$d.d(((ViewGroup)this).getChildAt(childCount - 1));
            }
            else {
                n = 0;
            }
            if (n == 0) {
                return ((View)this).getHeight() / 3;
            }
        }
        return n * 2 + topInset;
    }
    
    public int getPendingAction() {
        return this.k;
    }
    
    public Drawable getStatusBarForeground() {
        return this.u;
    }
    
    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }
    
    public final int getTopInset() {
        final r1 l = this.l;
        int f;
        if (l != null) {
            f = l.f();
        }
        else {
            f = 0;
        }
        return f;
    }
    
    public final int getTotalScrollRange() {
        final int g = this.g;
        if (g != -1) {
            return g;
        }
        final int childCount = ((ViewGroup)this).getChildCount();
        int n = 0;
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n2;
            if (n >= childCount) {
                break;
            }
            final View child = ((ViewGroup)this).getChildAt(n);
            final AppBarLayout.AppBarLayout$b appBarLayout$b = (AppBarLayout.AppBarLayout$b)child.getLayoutParams();
            final int measuredHeight = child.getMeasuredHeight();
            final int a = appBarLayout$b.a;
            n3 = n2;
            if ((a & 0x1) == 0x0) {
                break;
            }
            final int n4 = n2 += measuredHeight + ((LinearLayout$LayoutParams)appBarLayout$b).topMargin + ((LinearLayout$LayoutParams)appBarLayout$b).bottomMargin;
            if (n == 0) {
                final WeakHashMap a2 = l0.a;
                n2 = n4;
                if (l0$d.b(child)) {
                    n2 = n4 - this.getTopInset();
                }
            }
            if ((a & 0x2) != 0x0) {
                final WeakHashMap a3 = l0.a;
                n3 = n2 - l0$d.d(child);
                break;
            }
            ++n;
        }
        return this.g = Math.max(0, n3);
    }
    
    public int getUpNestedPreScrollRange() {
        return this.getTotalScrollRange();
    }
    
    public final boolean h(View view) {
        final WeakReference<View> r = this.r;
        final View view2 = null;
        if (r == null) {
            final int q = this.q;
            if (q != -1) {
                View viewById;
                if (view != null) {
                    viewById = view.findViewById(q);
                }
                else {
                    viewById = null;
                }
                View viewById2 = viewById;
                if (viewById == null) {
                    viewById2 = viewById;
                    if (((View)this).getParent() instanceof ViewGroup) {
                        viewById2 = ((View)((View)this).getParent()).findViewById(this.q);
                    }
                }
                if (viewById2 != null) {
                    this.r = new WeakReference<View>(viewById2);
                }
            }
        }
        final WeakReference<View> r2 = this.r;
        View view3 = view2;
        if (r2 != null) {
            view3 = r2.get();
        }
        if (view3 != null) {
            view = view3;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }
    
    public final boolean i() {
        final int childCount = ((ViewGroup)this).getChildCount();
        boolean b2;
        final boolean b = b2 = false;
        if (childCount > 0) {
            final View child = ((ViewGroup)this).getChildAt(0);
            b2 = b;
            if (child.getVisibility() != 8) {
                final WeakHashMap a = l0.a;
                b2 = b;
                if (!l0$d.b(child)) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final Drawable background = ((View)this).getBackground();
        if (background instanceof f) {
            px0.c.P2((View)this, (f)background);
        }
    }
    
    public final int[] onCreateDrawableState(int n) {
        if (this.t == null) {
            this.t = new int[4];
        }
        final int[] t = this.t;
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + t.length);
        final boolean n2 = this.n;
        if (n2) {
            n = 2130969825;
        }
        else {
            n = -2130969825;
        }
        t[0] = n;
        if (n2 && this.o) {
            n = 2130969826;
        }
        else {
            n = -2130969826;
        }
        t[1] = n;
        if (n2) {
            n = 2130969823;
        }
        else {
            n = -2130969823;
        }
        t[2] = n;
        if (n2 && this.o) {
            n = 2130969822;
        }
        else {
            n = -2130969822;
        }
        t[3] = n;
        return View.mergeDrawableStates(onCreateDrawableState, t);
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final WeakReference<View> r = this.r;
        if (r != null) {
            r.clear();
        }
        this.r = null;
    }
    
    public void onLayout(final boolean b, int i, int n, int childCount, final int n2) {
        super.onLayout(b, i, n, childCount, n2);
        final WeakHashMap a = l0.a;
        final boolean b2 = l0$d.b((View)this);
        final boolean b3 = true;
        if (b2 && this.i()) {
            n = this.getTopInset();
            for (i = ((ViewGroup)this).getChildCount() - 1; i >= 0; --i) {
                ((ViewGroup)this).getChildAt(i).offsetTopAndBottom(n);
            }
        }
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = false;
        for (n = ((ViewGroup)this).getChildCount(), i = 0; i < n; ++i) {
            if (((AppBarLayout.AppBarLayout$b)((ViewGroup)this).getChildAt(i).getLayoutParams()).b != null) {
                this.j = true;
                break;
            }
        }
        final Drawable u = this.u;
        if (u != null) {
            u.setBounds(0, 0, ((View)this).getWidth(), this.getTopInset());
        }
        boolean n3 = b3;
        Label_0244: {
            if (!this.p) {
                while (true) {
                    for (childCount = ((ViewGroup)this).getChildCount(), i = 0; i < childCount; ++i) {
                        n = ((AppBarLayout.AppBarLayout$b)((ViewGroup)this).getChildAt(i).getLayoutParams()).a;
                        if ((n & 0x1) == 0x1 && (n & 0xA) != 0x0) {
                            n = 1;
                        }
                        else {
                            n = 0;
                        }
                        if (n != 0) {
                            i = 1;
                            n3 = (i != 0 && b3);
                            break Label_0244;
                        }
                    }
                    i = 0;
                    continue;
                }
            }
        }
        if (this.n != n3) {
            this.n = n3;
            ((View)this).refreshDrawableState();
        }
    }
    
    public final void onMeasure(int n, final int n2) {
        super.onMeasure(n, n2);
        final int mode = View$MeasureSpec.getMode(n2);
        if (mode != 1073741824) {
            final WeakHashMap a = l0.a;
            if (l0$d.b((View)this) && this.i()) {
                n = ((View)this).getMeasuredHeight();
                if (mode != Integer.MIN_VALUE) {
                    if (mode == 0) {
                        n += this.getTopInset();
                    }
                }
                else {
                    n = ((View)this).getMeasuredHeight();
                    n = d.h1(this.getTopInset() + n, 0, View$MeasureSpec.getSize(n2));
                }
                ((View)this).setMeasuredDimension(((View)this).getMeasuredWidth(), n);
            }
        }
        this.g = -1;
        this.h = -1;
        this.i = -1;
    }
    
    public void setElevation(final float elevation) {
        super.setElevation(elevation);
        final Drawable background = ((View)this).getBackground();
        if (background instanceof f) {
            ((f)background).k(elevation);
        }
    }
    
    public void setExpanded(final boolean b) {
        final WeakHashMap a = l0.a;
        this.e(b, l0$g.c((View)this));
    }
    
    public void setLiftOnScroll(final boolean p) {
        this.p = p;
    }
    
    public void setLiftOnScrollTargetViewId(final int q) {
        this.q = q;
        final WeakReference<View> r = this.r;
        if (r != null) {
            r.clear();
        }
        this.r = null;
    }
    
    public void setOrientation(final int orientation) {
        if (orientation == 1) {
            super.setOrientation(orientation);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }
    
    public void setStatusBarForeground(Drawable u) {
        final Drawable u2 = this.u;
        if (u2 != u) {
            Drawable mutate = null;
            if (u2 != null) {
                u2.setCallback((Drawable$Callback)null);
            }
            if (u != null) {
                mutate = u.mutate();
            }
            this.u = mutate;
            final int n = 0;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.u.setState(((View)this).getDrawableState());
                }
                final Drawable u3 = this.u;
                final WeakHashMap a = l0.a;
                r3.a.c.b(u3, l0$e.d((View)this));
                u = this.u;
                u.setVisible(((View)this).getVisibility() == 0, false);
                this.u.setCallback((Drawable$Callback)this);
            }
            int n2 = n;
            if (this.u != null) {
                n2 = n;
                if (this.getTopInset() > 0) {
                    n2 = 1;
                }
            }
            ((View)this).setWillNotDraw((boolean)((n2 ^ 0x1) != 0x0));
            final WeakHashMap a2 = l0.a;
            l0$d.k((View)this);
        }
    }
    
    public void setStatusBarForegroundColor(final int n) {
        this.setStatusBarForeground((Drawable)new ColorDrawable(n));
    }
    
    public void setStatusBarForegroundResource(final int n) {
        this.setStatusBarForeground(vl.a.U1(((View)this).getContext(), n));
    }
    
    @Deprecated
    public void setTargetElevation(final float n) {
        ze.h.a((View)this, n);
    }
    
    public void setVisibility(final int visibility) {
        super.setVisibility(visibility);
        final boolean b = visibility == 0;
        final Drawable u = this.u;
        if (u != null) {
            u.setVisible(b, false);
        }
    }
    
    public final boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.u;
    }
    
    public static class Behavior extends AppBarLayout$BaseBehavior<AppBarLayout>
    {
        public Behavior() {
        }
        
        public Behavior(final Context context, final AttributeSet set) {
            super(context, set);
        }
        
        public abstract static class a extends AppBarLayout$BaseBehavior$a<AppBarLayout>
        {
        }
    }
    
    public interface c extends AppBarLayout$a<AppBarLayout>
    {
    }
}

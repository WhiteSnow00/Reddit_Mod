// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.tabs;

import android.animation.Animator;
import android.widget.FrameLayout;
import android.text.Layout;
import b4.c$a;
import b4.c$c;
import androidx.appcompat.widget.d1;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.drawable.RippleDrawable;
import android.util.StateSet;
import android.view.View$OnLayoutChangeListener;
import android.view.LayoutInflater;
import android.graphics.Rect;
import java.lang.ref.WeakReference;
import a4.q0$k;
import a4.k0;
import android.widget.ImageView;
import r3.a$b;
import android.graphics.drawable.GradientDrawable;
import android.graphics.Paint;
import android.widget.LinearLayout;
import android.animation.Animator$AnimatorListener;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager$i;
import androidx.viewpager.widget.ViewPager$j;
import android.view.ViewGroup;
import android.view.View$MeasureSpec;
import b4.c$b;
import android.view.accessibility.AccessibilityNodeInfo;
import android.graphics.Canvas;
import android.view.ViewParent;
import bg.d;
import android.database.DataSetObserver;
import java.util.Iterator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.util.Log;
import a4.q0$e;
import a4.q0$g;
import android.widget.LinearLayout$LayoutParams;
import android.text.TextUtils;
import android.content.res.Resources;
import a4.t1;
import java.util.WeakHashMap;
import android.content.res.TypedArray;
import of.j;
import a4.a0;
import qf.c;
import a4.q0$d;
import a4.q0$i;
import a4.q0;
import android.graphics.drawable.ColorDrawable;
import pd.r;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import z3.f;
import androidx.viewpager.widget.a;
import androidx.viewpager.widget.ViewPager;
import android.animation.ValueAnimator;
import java.util.ArrayList;
import z3.g;
import androidx.viewpager.widget.ViewPager$e;
import android.widget.HorizontalScrollView;

@ViewPager$e
public class TabLayout extends HorizontalScrollView
{
    public static final z3.g T;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public c I;
    public final ArrayList<c> J;
    public TabLayout.TabLayout$j K;
    public ValueAnimator L;
    public ViewPager M;
    public a N;
    public e O;
    public TabLayout.TabLayout$h P;
    public TabLayout.TabLayout$b Q;
    public boolean R;
    public final z3.f S;
    public final ArrayList<g> f;
    public g g;
    public final RectF h;
    public final f i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public ColorStateList o;
    public ColorStateList p;
    public ColorStateList q;
    public Drawable r;
    public PorterDuff$Mode s;
    public float t;
    public float u;
    public final int v;
    public int w;
    public final int x;
    public final int y;
    public final int z;
    
    static {
        T = new z3.g(16);
    }
    
    public TabLayout(final Context context, final AttributeSet set) {
        this(context, set, 2130969889);
    }
    
    public TabLayout(Context context, final AttributeSet set, int n) {
        super(yf.a.a(context, set, n, 2132018074), set, n);
        this.f = new ArrayList<g>();
        this.h = new RectF();
        this.w = Integer.MAX_VALUE;
        this.J = new ArrayList<c>();
        this.S = new z3.f(12);
        context = ((View)this).getContext();
        ((View)this).setHorizontalScrollBarEnabled(false);
        final f i = new f(context);
        super.addView((View)(this.i = i), 0, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -1));
        final TypedArray d = of.g.d(context, set, pd.r.R, n, 2132018074, new int[] { 22 });
        if (((View)this).getBackground() instanceof ColorDrawable) {
            final ColorDrawable colorDrawable = (ColorDrawable)((View)this).getBackground();
            final tf.f f = new tf.f();
            f.l(ColorStateList.valueOf(colorDrawable.getColor()));
            f.i(context);
            final WeakHashMap<View, t1> a = q0.a;
            f.k(q0$i.i((View)this));
            q0$d.q((View)this, (Drawable)f);
        }
        n = d.getDimensionPixelSize(10, -1);
        if (i.f != n) {
            i.f = n;
            final WeakHashMap<View, t1> a2 = q0.a;
            q0$d.k((View)i);
        }
        n = d.getColor(7, 0);
        if (i.g.getColor() != n) {
            i.g.setColor(n);
            final WeakHashMap<View, t1> a3 = q0.a;
            q0$d.k((View)i);
        }
        this.setSelectedTabIndicator(qf.c.c(context, d, 5));
        this.setSelectedTabIndicatorGravity(d.getInt(9, 0));
        this.setTabIndicatorFullWidth(d.getBoolean(8, true));
        n = d.getDimensionPixelSize(15, 0);
        this.m = n;
        this.l = n;
        this.k = n;
        this.j = n;
        this.j = d.getDimensionPixelSize(18, n);
        this.k = d.getDimensionPixelSize(19, this.k);
        this.l = d.getDimensionPixelSize(17, this.l);
        this.m = d.getDimensionPixelSize(16, this.m);
        n = d.getResourceId(22, 2132017735);
        this.n = n;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(n, a0.H);
        try {
            this.t = (float)obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.o = qf.c.a(context, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (d.hasValue(23)) {
                this.o = qf.c.a(context, d, 23);
            }
            if (d.hasValue(21)) {
                n = d.getColor(21, 0);
                this.o = new ColorStateList(new int[][] { HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET }, new int[] { n, this.o.getDefaultColor() });
            }
            this.p = qf.c.a(context, d, 3);
            this.s = of.j.c(d.getInt(4, -1), (PorterDuff$Mode)null);
            this.q = qf.c.a(context, d, 20);
            this.C = d.getInt(6, 300);
            this.x = d.getDimensionPixelSize(13, -1);
            this.y = d.getDimensionPixelSize(12, -1);
            this.v = d.getResourceId(0, 0);
            this.A = d.getDimensionPixelSize(1, 0);
            this.E = d.getInt(14, 1);
            this.B = d.getInt(2, 0);
            this.F = d.getBoolean(11, false);
            this.H = d.getBoolean(24, false);
            d.recycle();
            final Resources resources = ((View)this).getResources();
            this.u = (float)resources.getDimensionPixelSize(2131165649);
            this.z = resources.getDimensionPixelSize(2131165647);
            this.f();
        }
        finally {
            obtainStyledAttributes.recycle();
        }
    }
    
    private int getDefaultHeight() {
        final int size = this.f.size();
        final int n = 0;
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n;
            if (n2 >= size) {
                break;
            }
            final g g = this.f.get(n2);
            if (g != null && g.a != null && !TextUtils.isEmpty(g.b)) {
                n3 = 1;
                break;
            }
            ++n2;
        }
        int n4;
        if (n3 != 0 && !this.F) {
            n4 = 72;
        }
        else {
            n4 = 48;
        }
        return n4;
    }
    
    private int getTabMinWidth() {
        final int x = this.x;
        if (x != -1) {
            return x;
        }
        final int e = this.E;
        int z;
        if (e != 0 && e != 2) {
            z = 0;
        }
        else {
            z = this.z;
        }
        return z;
    }
    
    private int getTabScrollRange() {
        return Math.max(0, ((View)this.i).getWidth() - ((View)this).getWidth() - ((View)this).getPaddingLeft() - ((View)this).getPaddingRight());
    }
    
    private void setSelectedTabView(final int n) {
        final int childCount = ((ViewGroup)this.i).getChildCount();
        if (n < childCount) {
            for (int i = 0; i < childCount; ++i) {
                final View child = ((ViewGroup)this.i).getChildAt(i);
                final boolean b = true;
                child.setSelected(i == n);
                child.setActivated(i == n && b);
            }
        }
    }
    
    @Deprecated
    public final void a(final c c) {
        if (!this.J.contains(c)) {
            this.J.add(c);
        }
    }
    
    public final void addView(final View view) {
        this.d(view);
    }
    
    public final void addView(final View view, final int n) {
        this.d(view);
    }
    
    public final void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.d(view);
    }
    
    public final void addView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.d(view);
    }
    
    public final void b(final g g) {
        this.c(g, this.f.size(), this.f.isEmpty());
    }
    
    public void c(final g g, int d, final boolean b) {
        if (g.g == this) {
            g.d = d;
            this.f.add(d, g);
            while (++d < this.f.size()) {
                this.f.get(d).d = d;
            }
            final i h = g.h;
            h.setSelected(false);
            ((View)h).setActivated(false);
            final f i = this.i;
            d = g.d;
            final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-2, -1);
            if (this.E == 1 && this.B == 0) {
                linearLayout$LayoutParams.width = 0;
                linearLayout$LayoutParams.weight = 1.0f;
            }
            else {
                linearLayout$LayoutParams.width = -2;
                linearLayout$LayoutParams.weight = 0.0f;
            }
            ((ViewGroup)i).addView((View)h, d, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
            if (b) {
                g.a();
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }
    
    public final void d(final View view) {
        if (view instanceof wf.a) {
            final wf.a a = (wf.a)view;
            final g j = this.j();
            a.getClass();
            if (!TextUtils.isEmpty(a.getContentDescription())) {
                j.c = a.getContentDescription();
                final i h = j.h;
                if (h != null) {
                    h.e();
                }
            }
            this.b(j);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }
    
    public final void e(final int n) {
        if (n == -1) {
            return;
        }
        Label_0174: {
            if (((View)this).getWindowToken() != null) {
                final WeakHashMap<View, t1> a = q0.a;
                if (q0$g.c((View)this)) {
                    final f i = this.i;
                    final int childCount = ((ViewGroup)i).getChildCount();
                    int j = 0;
                    while (true) {
                        while (j < childCount) {
                            if (((ViewGroup)i).getChildAt(j).getWidth() <= 0) {
                                final boolean b = true;
                                if (b) {
                                    break Label_0174;
                                }
                                final int scrollX = ((View)this).getScrollX();
                                final int g = this.g(0.0f, n);
                                if (scrollX != g) {
                                    this.h();
                                    this.L.setIntValues(new int[] { scrollX, g });
                                    this.L.start();
                                }
                                final f k = this.i;
                                final int c = this.C;
                                final ValueAnimator m = k.m;
                                if (m != null && m.isRunning()) {
                                    k.m.cancel();
                                }
                                k.c(n, c, true);
                                return;
                            }
                            else {
                                ++j;
                            }
                        }
                        final boolean b = false;
                        continue;
                    }
                }
            }
        }
        this.o(n, 0.0f, true, true);
    }
    
    public final void f() {
        final int e = this.E;
        int max;
        if (e != 0 && e != 2) {
            max = 0;
        }
        else {
            max = Math.max(0, this.A - this.j);
        }
        final f i = this.i;
        final WeakHashMap<View, t1> a = q0.a;
        q0$e.k((View)i, max, 0, 0, 0);
        final int e2 = this.E;
        Label_0157: {
            if (e2 != 0) {
                if (e2 == 1 || e2 == 2) {
                    if (this.B == 2) {
                        Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                    }
                    this.i.setGravity(1);
                }
            }
            else {
                final int b = this.B;
                if (b != 0) {
                    if (b == 1) {
                        this.i.setGravity(1);
                        break Label_0157;
                    }
                    if (b != 2) {
                        break Label_0157;
                    }
                }
                else {
                    Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
                }
                this.i.setGravity(8388611);
            }
        }
        this.q(true);
    }
    
    public final int g(final float n, int width) {
        final int e = this.E;
        int width2 = 0;
        if (e != 0 && e != 2) {
            return 0;
        }
        final View child = ((ViewGroup)this.i).getChildAt(width);
        View child2;
        if (++width < ((ViewGroup)this.i).getChildCount()) {
            child2 = ((ViewGroup)this.i).getChildAt(width);
        }
        else {
            child2 = null;
        }
        if (child != null) {
            width = child.getWidth();
        }
        else {
            width = 0;
        }
        if (child2 != null) {
            width2 = child2.getWidth();
        }
        final int n2 = width / 2 + child.getLeft() - ((View)this).getWidth() / 2;
        width = (int)((width + width2) * 0.5f * n);
        final WeakHashMap<View, t1> a = q0.a;
        if (q0$e.d((View)this) == 0) {
            width += n2;
        }
        else {
            width = n2 - width;
        }
        return width;
    }
    
    public final FrameLayout$LayoutParams generateLayoutParams(final AttributeSet set) {
        return ((FrameLayout)this).generateDefaultLayoutParams();
    }
    
    public int getSelectedTabPosition() {
        final g g = this.g;
        int d;
        if (g != null) {
            d = g.d;
        }
        else {
            d = -1;
        }
        return d;
    }
    
    public int getTabCount() {
        return this.f.size();
    }
    
    public int getTabGravity() {
        return this.B;
    }
    
    public ColorStateList getTabIconTint() {
        return this.p;
    }
    
    public int getTabIndicatorGravity() {
        return this.D;
    }
    
    public int getTabMaxWidth() {
        return this.w;
    }
    
    public int getTabMode() {
        return this.E;
    }
    
    public ColorStateList getTabRippleColor() {
        return this.q;
    }
    
    public Drawable getTabSelectedIndicator() {
        return this.r;
    }
    
    public ColorStateList getTabTextColors() {
        return this.o;
    }
    
    public final void h() {
        if (this.L == null) {
            (this.L = new ValueAnimator()).setInterpolator((TimeInterpolator)xe.a.b);
            this.L.setDuration((long)this.C);
            this.L.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener() {
                public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
                    ((View)TabLayout.this).scrollTo((int)valueAnimator.getAnimatedValue(), 0);
                }
            });
        }
    }
    
    public final g i(final int n) {
        g g;
        if (n >= 0 && n < this.getTabCount()) {
            g = this.f.get(n);
        }
        else {
            g = null;
        }
        return g;
    }
    
    public final g j() {
        g tab;
        if ((tab = (g)TabLayout.T.a()) == null) {
            tab = new g();
        }
        tab.g = this;
        final z3.f s = this.S;
        Object o;
        if (s != null) {
            o = s.a();
        }
        else {
            o = null;
        }
        Object h = o;
        if (o == null) {
            h = new i(((View)this).getContext());
        }
        ((i)h).setTab(tab);
        ((View)h).setFocusable(true);
        ((View)h).setMinimumWidth(this.getTabMinWidth());
        if (TextUtils.isEmpty(tab.c)) {
            ((View)h).setContentDescription(tab.b);
        }
        else {
            ((View)h).setContentDescription(tab.c);
        }
        tab.h = (i)h;
        return tab;
    }
    
    public final void k() {
        this.l();
        final a n = this.N;
        if (n != null) {
            final int count = n.getCount();
            for (int i = 0; i < count; ++i) {
                final g j = this.j();
                j.b(this.N.getPageTitle(i));
                this.c(j, this.f.size(), false);
            }
            final ViewPager m = this.M;
            if (m != null && count > 0) {
                final int currentItem = m.getCurrentItem();
                if (currentItem != this.getSelectedTabPosition() && currentItem < this.getTabCount()) {
                    this.m(this.i(currentItem), true);
                }
            }
        }
    }
    
    public final void l() {
        for (int i = ((ViewGroup)this.i).getChildCount() - 1; i >= 0; --i) {
            final i j = (i)((ViewGroup)this.i).getChildAt(i);
            ((ViewGroup)this.i).removeViewAt(i);
            if (j != null) {
                j.setTab(null);
                j.setSelected(false);
                this.S.b((Object)j);
            }
            ((View)this).requestLayout();
        }
        final Iterator<g> iterator = this.f.iterator();
        while (iterator.hasNext()) {
            final g g = iterator.next();
            iterator.remove();
            g.g = null;
            g.h = null;
            g.a = null;
            g.b = null;
            g.c = null;
            g.d = -1;
            g.e = null;
            TabLayout.T.b((Object)g);
        }
        this.g = null;
    }
    
    public final void m(final g g, final boolean b) {
        final g g2 = this.g;
        if (g2 == g) {
            if (g2 != null) {
                for (int i = this.J.size() - 1; i >= 0; --i) {
                    this.J.get(i).i(g);
                }
                this.e(g.d);
            }
        }
        else {
            int d;
            if (g != null) {
                d = g.d;
            }
            else {
                d = -1;
            }
            if (b) {
                if ((g2 == null || g2.d == -1) && d != -1) {
                    this.o(d, 0.0f, true, true);
                }
                else {
                    this.e(d);
                }
                if (d != -1) {
                    this.setSelectedTabView(d);
                }
            }
            this.g = g;
            if (g2 != null) {
                for (int j = this.J.size() - 1; j >= 0; --j) {
                    this.J.get(j).h(g2);
                }
            }
            if (g != null) {
                for (int k = this.J.size() - 1; k >= 0; --k) {
                    this.J.get(k).a(g);
                }
            }
        }
    }
    
    public final void n(final a n, final boolean b) {
        final a n2 = this.N;
        if (n2 != null) {
            final e o = this.O;
            if (o != null) {
                n2.unregisterDataSetObserver((DataSetObserver)o);
            }
        }
        this.N = n;
        if (b && n != null) {
            if (this.O == null) {
                this.O = new e();
            }
            n.registerDataSetObserver((DataSetObserver)this.O);
        }
        this.k();
    }
    
    public final void o(final int i, final float j, final boolean b, final boolean b2) {
        final int round = Math.round(i + j);
        if (round >= 0) {
            if (round < ((ViewGroup)this.i).getChildCount()) {
                if (b2) {
                    final f k = this.i;
                    final ValueAnimator m = k.m;
                    if (m != null && m.isRunning()) {
                        k.m.cancel();
                    }
                    k.i = i;
                    k.j = j;
                    k.b();
                }
                final ValueAnimator l = this.L;
                if (l != null && l.isRunning()) {
                    this.L.cancel();
                }
                ((View)this).scrollTo(this.g(j, i), 0);
                if (b) {
                    this.setSelectedTabView(round);
                }
            }
        }
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final Drawable background = ((View)this).getBackground();
        if (background instanceof tf.f) {
            d.D0((View)this, (tf.f)background);
        }
        if (this.M == null) {
            final ViewParent parent = ((View)this).getParent();
            if (parent instanceof ViewPager) {
                this.p((ViewPager)parent, true);
            }
        }
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.R) {
            this.setupWithViewPager(null);
            this.R = false;
        }
    }
    
    public final void onDraw(final Canvas canvas) {
        for (int i = 0; i < ((ViewGroup)this.i).getChildCount(); ++i) {
            final View child = ((ViewGroup)this.i).getChildAt(i);
            if (child instanceof i) {
                final i j = (i)child;
                final Drawable n = j.n;
                if (n != null) {
                    n.setBounds(((View)j).getLeft(), ((View)j).getTop(), ((View)j).getRight(), ((View)j).getBottom());
                    j.n.draw(canvas);
                }
            }
        }
        super.onDraw(canvas);
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new b4.c(accessibilityNodeInfo).o(c$b.a(1, this.getTabCount(), 1, false));
    }
    
    public final void onMeasure(int n, int w) {
        final int round = Math.round(of.j.a(this.getDefaultHeight(), ((View)this).getContext()));
        final int mode = View$MeasureSpec.getMode(w);
        final int n2 = 0;
        int measureSpec;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                measureSpec = w;
            }
            else {
                w = ((View)this).getPaddingTop();
                measureSpec = View$MeasureSpec.makeMeasureSpec(((View)this).getPaddingBottom() + (w + round), 1073741824);
            }
        }
        else {
            measureSpec = w;
            if (((ViewGroup)this).getChildCount() == 1) {
                measureSpec = w;
                if (View$MeasureSpec.getSize(w) >= round) {
                    ((ViewGroup)this).getChildAt(0).setMinimumHeight(round);
                    measureSpec = w;
                }
            }
        }
        final int size = View$MeasureSpec.getSize(n);
        if (View$MeasureSpec.getMode(n) != 0) {
            w = this.y;
            if (w <= 0) {
                w = (int)(size - of.j.a(56, ((View)this).getContext()));
            }
            this.w = w;
        }
        super.onMeasure(n, measureSpec);
        if (((ViewGroup)this).getChildCount() == 1) {
            final View child = ((ViewGroup)this).getChildAt(0);
            n = this.E;
            Label_0234: {
                while (true) {
                    Label_0217: {
                        if (n == 0) {
                            break Label_0217;
                        }
                        if (n != 1) {
                            if (n != 2) {
                                n = n2;
                                break Label_0234;
                            }
                            break Label_0217;
                        }
                        else {
                            n = n2;
                            if (child.getMeasuredWidth() == ((View)this).getMeasuredWidth()) {
                                break Label_0234;
                            }
                        }
                        n = 1;
                        break Label_0234;
                    }
                    n = n2;
                    if (child.getMeasuredWidth() < ((View)this).getMeasuredWidth()) {
                        continue;
                    }
                    break;
                }
            }
            if (n != 0) {
                n = ((View)this).getPaddingTop();
                n = ViewGroup.getChildMeasureSpec(measureSpec, ((View)this).getPaddingBottom() + n, child.getLayoutParams().height);
                child.measure(View$MeasureSpec.makeMeasureSpec(((View)this).getMeasuredWidth(), 1073741824), n);
            }
        }
    }
    
    public final void p(final ViewPager m, final boolean r) {
        final ViewPager i = this.M;
        if (i != null) {
            final TabLayout.TabLayout$h p2 = this.P;
            if (p2 != null) {
                i.removeOnPageChangeListener((ViewPager$j)p2);
            }
            final TabLayout.TabLayout$b q = this.Q;
            if (q != null) {
                this.M.removeOnAdapterChangeListener((ViewPager$i)q);
            }
        }
        final TabLayout.TabLayout$j k = this.K;
        if (k != null) {
            this.J.remove(k);
            this.K = null;
        }
        if (m != null) {
            this.M = m;
            if (this.P == null) {
                this.P = new TabLayout.TabLayout$h(this);
            }
            final TabLayout.TabLayout$h p3 = this.P;
            p3.h = 0;
            p3.g = 0;
            m.addOnPageChangeListener((ViewPager$j)p3);
            this.a((c)(this.K = new TabLayout.TabLayout$j(m)));
            final a adapter = m.getAdapter();
            if (adapter != null) {
                this.n(adapter, true);
            }
            if (this.Q == null) {
                this.Q = new TabLayout.TabLayout$b(this);
            }
            final TabLayout.TabLayout$b q2 = this.Q;
            q2.a = true;
            m.addOnAdapterChangeListener((ViewPager$i)q2);
            this.o(m.getCurrentItem(), 0.0f, true, true);
        }
        else {
            this.M = null;
            this.n(null, false);
        }
        this.R = r;
    }
    
    public final void q(final boolean b) {
        for (int i = 0; i < ((ViewGroup)this.i).getChildCount(); ++i) {
            final View child = ((ViewGroup)this.i).getChildAt(i);
            child.setMinimumWidth(this.getTabMinWidth());
            final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)child.getLayoutParams();
            if (this.E == 1 && this.B == 0) {
                linearLayout$LayoutParams.width = 0;
                linearLayout$LayoutParams.weight = 1.0f;
            }
            else {
                linearLayout$LayoutParams.width = -2;
                linearLayout$LayoutParams.weight = 0.0f;
            }
            if (b) {
                child.requestLayout();
            }
        }
    }
    
    public void setElevation(final float elevation) {
        super.setElevation(elevation);
        final Drawable background = ((View)this).getBackground();
        if (background instanceof tf.f) {
            ((tf.f)background).k(elevation);
        }
    }
    
    public void setInlineLabel(final boolean f) {
        if (this.F != f) {
            this.F = f;
            for (int i = 0; i < ((ViewGroup)this.i).getChildCount(); ++i) {
                final View child = ((ViewGroup)this.i).getChildAt(i);
                if (child instanceof i) {
                    final i j = (i)child;
                    j.setOrientation((int)((j.p.F ^ true) ? 1 : 0));
                    final TextView l = j.l;
                    if (l == null && j.m == null) {
                        j.g(j.g, j.h);
                    }
                    else {
                        j.g(l, j.m);
                    }
                }
            }
            this.f();
        }
    }
    
    public void setInlineLabelResource(final int n) {
        this.setInlineLabel(((View)this).getResources().getBoolean(n));
    }
    
    @Deprecated
    public void setOnTabSelectedListener(final c i) {
        final c j = this.I;
        if (j != null) {
            this.J.remove(j);
        }
        if ((this.I = i) != null) {
            this.a(i);
        }
    }
    
    @Deprecated
    public void setOnTabSelectedListener(final TabLayout.TabLayout$d onTabSelectedListener) {
        this.setOnTabSelectedListener((c)onTabSelectedListener);
    }
    
    public void setScrollAnimatorListener(final Animator$AnimatorListener animator$AnimatorListener) {
        this.h();
        ((Animator)this.L).addListener(animator$AnimatorListener);
    }
    
    public void setSelectedTabIndicator(final int n) {
        if (n != 0) {
            this.setSelectedTabIndicator(wd.a.L(((View)this).getContext(), n));
        }
        else {
            this.setSelectedTabIndicator(null);
        }
    }
    
    public void setSelectedTabIndicator(final Drawable r) {
        if (this.r != r) {
            this.r = r;
            final f i = this.i;
            final WeakHashMap<View, t1> a = q0.a;
            q0$d.k((View)i);
        }
    }
    
    public void setSelectedTabIndicatorColor(final int color) {
        final f i = this.i;
        if (i.g.getColor() != color) {
            i.g.setColor(color);
            final WeakHashMap<View, t1> a = q0.a;
            q0$d.k((View)i);
        }
    }
    
    public void setSelectedTabIndicatorGravity(final int d) {
        if (this.D != d) {
            this.D = d;
            final f i = this.i;
            final WeakHashMap<View, t1> a = q0.a;
            q0$d.k((View)i);
        }
    }
    
    @Deprecated
    public void setSelectedTabIndicatorHeight(final int f) {
        final f i = this.i;
        if (i.f != f) {
            i.f = f;
            final WeakHashMap<View, t1> a = q0.a;
            q0$d.k((View)i);
        }
    }
    
    public void setTabGravity(final int b) {
        if (this.B != b) {
            this.B = b;
            this.f();
        }
    }
    
    public void setTabIconTint(final ColorStateList p) {
        if (this.p != p) {
            this.p = p;
            for (int size = this.f.size(), i = 0; i < size; ++i) {
                final i h = this.f.get(i).h;
                if (h != null) {
                    h.e();
                }
            }
        }
    }
    
    public void setTabIconTintResource(final int n) {
        this.setTabIconTint(n3.a.getColorStateList(((View)this).getContext(), n));
    }
    
    public void setTabIndicatorFullWidth(final boolean g) {
        this.G = g;
        final f i = this.i;
        final WeakHashMap<View, t1> a = q0.a;
        q0$d.k((View)i);
    }
    
    public void setTabMode(final int e) {
        if (e != this.E) {
            this.E = e;
            this.f();
        }
    }
    
    public void setTabRippleColor(final ColorStateList q) {
        if (this.q != q) {
            this.q = q;
            for (int i = 0; i < ((ViewGroup)this.i).getChildCount(); ++i) {
                final View child = ((ViewGroup)this.i).getChildAt(i);
                if (child instanceof i) {
                    final i j = (i)child;
                    final Context context = ((View)this).getContext();
                    final int q2 = TabLayout.i.q;
                    j.f(context);
                }
            }
        }
    }
    
    public void setTabRippleColorResource(final int n) {
        this.setTabRippleColor(n3.a.getColorStateList(((View)this).getContext(), n));
    }
    
    public void setTabTextColors(final ColorStateList o) {
        if (this.o != o) {
            this.o = o;
            for (int size = this.f.size(), i = 0; i < size; ++i) {
                final i h = this.f.get(i).h;
                if (h != null) {
                    h.e();
                }
            }
        }
    }
    
    @Deprecated
    public void setTabsFromPagerAdapter(final a a) {
        this.n(a, false);
    }
    
    public void setUnboundedRipple(final boolean h) {
        if (this.H != h) {
            this.H = h;
            for (int i = 0; i < ((ViewGroup)this.i).getChildCount(); ++i) {
                final View child = ((ViewGroup)this.i).getChildAt(i);
                if (child instanceof i) {
                    final i j = (i)child;
                    final Context context = ((View)this).getContext();
                    final int q = TabLayout.i.q;
                    j.f(context);
                }
            }
        }
    }
    
    public void setUnboundedRippleResource(final int n) {
        this.setUnboundedRipple(((View)this).getResources().getBoolean(n));
    }
    
    public void setupWithViewPager(final ViewPager viewPager) {
        this.p(viewPager, false);
    }
    
    public final boolean shouldDelayChildPressedState() {
        return this.getTabScrollRange() > 0;
    }
    
    @Deprecated
    public interface c<T extends g>
    {
        void a(final T p0);
        
        void h(final T p0);
        
        void i(final T p0);
    }
    
    public final class e extends DataSetObserver
    {
        public final void onChanged() {
            TabLayout.this.k();
        }
        
        public final void onInvalidated() {
            TabLayout.this.k();
        }
    }
    
    public final class f extends LinearLayout
    {
        public int f;
        public final Paint g;
        public final GradientDrawable h;
        public int i;
        public float j;
        public int k;
        public int l;
        public ValueAnimator m;
        public int n;
        public int o;
        
        public f(final Context context) {
            super(context);
            this.i = -1;
            this.k = -1;
            this.l = -1;
            this.n = -1;
            this.o = -1;
            ((View)this).setWillNotDraw(false);
            this.g = new Paint();
            this.h = new GradientDrawable();
        }
        
        public final void a(final i i, final RectF rectF) {
            final int a = i.getContentWidth();
            final int n = (int)of.j.a(24, ((View)this).getContext());
            int n2 = a;
            if (a < n) {
                n2 = n;
            }
            final int n3 = (((View)i).getRight() + ((View)i).getLeft()) / 2;
            final int n4 = n2 / 2;
            rectF.set((float)(n3 - n4), 0.0f, (float)(n3 + n4), 0.0f);
        }
        
        public final void b() {
            final View child = ((ViewGroup)this).getChildAt(this.i);
            int k = -1;
            int l;
            if (child != null && child.getWidth() > 0) {
                final int left = child.getLeft();
                final int right = child.getRight();
                final TabLayout p = TabLayout.this;
                k = left;
                l = right;
                if (!p.G) {
                    k = left;
                    l = right;
                    if (child instanceof i) {
                        this.a((i)child, p.h);
                        final RectF h = TabLayout.this.h;
                        k = (int)h.left;
                        l = (int)h.right;
                    }
                }
                if (this.j > 0.0f && this.i < ((ViewGroup)this).getChildCount() - 1) {
                    final View child2 = ((ViewGroup)this).getChildAt(this.i + 1);
                    final int left2 = child2.getLeft();
                    final int right2 = child2.getRight();
                    final TabLayout p2 = TabLayout.this;
                    int n = left2;
                    int n2 = right2;
                    if (!p2.G) {
                        n = left2;
                        n2 = right2;
                        if (child2 instanceof i) {
                            this.a((i)child2, p2.h);
                            final RectF h2 = TabLayout.this.h;
                            n = (int)h2.left;
                            n2 = (int)h2.right;
                        }
                    }
                    final float j = this.j;
                    final float n3 = (float)n;
                    final float n4 = 1.0f - j;
                    k = (int)(k * n4 + n3 * j);
                    l = (int)(n4 * l + n2 * j);
                }
            }
            else {
                l = -1;
            }
            if (k != this.k || l != this.l) {
                this.k = k;
                this.l = l;
                final WeakHashMap<View, t1> a = q0.a;
                q0$d.k((View)this);
            }
        }
        
        public final void c(final int n, final int n2, final boolean b) {
            final View child = ((ViewGroup)this).getChildAt(n);
            if (child == null) {
                this.b();
                return;
            }
            final int left = child.getLeft();
            final int right = child.getRight();
            final TabLayout p3 = TabLayout.this;
            int n3 = left;
            int n4 = right;
            if (!p3.G) {
                n3 = left;
                n4 = right;
                if (child instanceof i) {
                    this.a((i)child, p3.h);
                    final RectF h = TabLayout.this.h;
                    n3 = (int)h.left;
                    n4 = (int)h.right;
                }
            }
            final int k = this.k;
            final int l = this.l;
            if (k == n3 && l == n4) {
                return;
            }
            if (b) {
                this.n = k;
                this.o = l;
            }
            final com.google.android.material.tabs.a a = new com.google.android.material.tabs.a(this, n3, n4);
            if (b) {
                final ValueAnimator m = new ValueAnimator();
                (this.m = m).setInterpolator((TimeInterpolator)xe.a.b);
                m.setDuration((long)n2);
                m.setFloatValues(new float[] { 0.0f, 1.0f });
                m.addUpdateListener((ValueAnimator$AnimatorUpdateListener)a);
                ((Animator)m).addListener((Animator$AnimatorListener)new b(this, n));
                m.start();
            }
            else {
                this.m.removeAllUpdateListeners();
                this.m.addUpdateListener((ValueAnimator$AnimatorUpdateListener)a);
            }
        }
        
        public final void draw(final Canvas canvas) {
            final Drawable r = TabLayout.this.r;
            final int n = 0;
            int n2;
            if (r != null) {
                n2 = r.getIntrinsicHeight();
            }
            else {
                n2 = 0;
            }
            final int f = this.f;
            if (f >= 0) {
                n2 = f;
            }
            final int d = TabLayout.this.D;
            int n3;
            if (d != 0) {
                if (d != 1) {
                    n3 = n;
                    if (d != 2) {
                        if (d != 3) {
                            n2 = 0;
                            n3 = n;
                        }
                        else {
                            n2 = ((View)this).getHeight();
                            n3 = n;
                        }
                    }
                }
                else {
                    n3 = (((View)this).getHeight() - n2) / 2;
                    n2 = (((View)this).getHeight() + n2) / 2;
                }
            }
            else {
                n3 = ((View)this).getHeight() - n2;
                n2 = ((View)this).getHeight();
            }
            final int k = this.k;
            if (k >= 0 && this.l > k) {
                Object o = TabLayout.this.r;
                if (o == null) {
                    o = this.h;
                }
                final Drawable mutate = ((Drawable)o).mutate();
                mutate.setBounds(this.k, n3, this.l, n2);
                final Paint g = this.g;
                if (g != null) {
                    a$b.g(mutate, g.getColor());
                }
                mutate.draw(canvas);
            }
            super.draw(canvas);
        }
        
        public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
            super.onLayout(b, n, n2, n3, n4);
            final ValueAnimator m = this.m;
            if (m != null && m.isRunning()) {
                this.c(this.i, -1, false);
            }
            else {
                this.b();
            }
        }
        
        public final void onMeasure(final int n, final int n2) {
            super.onMeasure(n, n2);
            if (View$MeasureSpec.getMode(n) != 1073741824) {
                return;
            }
            final TabLayout p2 = TabLayout.this;
            final int b = p2.B;
            final int n3 = 1;
            if (b == 1 || p2.E == 2) {
                final int childCount = ((ViewGroup)this).getChildCount();
                final int n4 = 0;
                int width;
                int max;
                for (int i = width = 0; i < childCount; ++i, width = max) {
                    final View child = ((ViewGroup)this).getChildAt(i);
                    max = width;
                    if (child.getVisibility() == 0) {
                        max = Math.max(width, child.getMeasuredWidth());
                    }
                }
                if (width <= 0) {
                    return;
                }
                int n5;
                if (width * childCount <= ((View)this).getMeasuredWidth() - (int)of.j.a(16, ((View)this).getContext()) * 2) {
                    n5 = 0;
                    for (int j = n4; j < childCount; ++j) {
                        final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)((ViewGroup)this).getChildAt(j).getLayoutParams();
                        if (linearLayout$LayoutParams.width != width || linearLayout$LayoutParams.weight != 0.0f) {
                            linearLayout$LayoutParams.width = width;
                            linearLayout$LayoutParams.weight = 0.0f;
                            n5 = 1;
                        }
                    }
                }
                else {
                    final TabLayout p3 = TabLayout.this;
                    p3.B = 0;
                    p3.q(false);
                    n5 = n3;
                }
                if (n5 != 0) {
                    super.onMeasure(n, n2);
                }
            }
        }
        
        public final void onRtlPropertiesChanged(final int n) {
            super.onRtlPropertiesChanged(n);
        }
    }
    
    public static final class g
    {
        public Drawable a;
        public CharSequence b;
        public CharSequence c;
        public int d;
        public View e;
        public int f;
        public TabLayout g;
        public i h;
        
        public g() {
            this.d = -1;
            this.f = 1;
        }
        
        public final void a() {
            final TabLayout g = this.g;
            if (g != null) {
                g.m(this, true);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        
        public final void b(final CharSequence charSequence) {
            if (TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(charSequence)) {
                ((View)this.h).setContentDescription(charSequence);
            }
            this.b = charSequence;
            final i h = this.h;
            if (h != null) {
                h.e();
            }
        }
    }
    
    public final class i extends LinearLayout
    {
        public static final /* synthetic */ int q = 0;
        public g f;
        public TextView g;
        public ImageView h;
        public View i;
        public ze.a j;
        public View k;
        public TextView l;
        public ImageView m;
        public Drawable n;
        public int o;
        public final /* synthetic */ TabLayout p;
        
        public i(final Context context) {
            super(context);
            this.o = 2;
            this.f(context);
            final int j = TabLayout.this.j;
            final int k = TabLayout.this.k;
            final int l = TabLayout.this.l;
            final int m = TabLayout.this.m;
            final WeakHashMap<View, t1> a = q0.a;
            q0$e.k((View)this, j, k, l, m);
            this.setGravity(17);
            this.setOrientation((int)((TabLayout.this.F ^ true) ? 1 : 0));
            ((View)this).setClickable(true);
            q0$k.d((View)this, k0.b(((View)this).getContext(), 1002));
        }
        
        private ze.a getBadge() {
            return this.j;
        }
        
        private int getContentWidth() {
            final TextView g = this.g;
            int i = 0;
            final ImageView h = this.h;
            final View k = this.k;
            int n = 0;
            int n3;
            int n2 = n3 = n;
            while (i < 3) {
                final View view = (new View[] { (View)g, (View)h, k })[i];
                int n4 = n;
                int n5 = n3;
                int n6 = n2;
                if (view != null) {
                    n4 = n;
                    n5 = n3;
                    n6 = n2;
                    if (view.getVisibility() == 0) {
                        if (n2 != 0) {
                            n5 = Math.min(n3, view.getLeft());
                        }
                        else {
                            n5 = view.getLeft();
                        }
                        int n7;
                        if (n2 != 0) {
                            n7 = Math.max(n, view.getRight());
                        }
                        else {
                            n7 = view.getRight();
                        }
                        n6 = 1;
                        n4 = n7;
                    }
                }
                ++i;
                n = n4;
                n3 = n5;
                n2 = n6;
            }
            return n - n3;
        }
        
        private ze.a getOrCreateBadge() {
            if (this.j == null) {
                final Context context = ((View)this).getContext();
                final ze.a j = new ze.a(context);
                final TypedArray d = of.g.d(context, (AttributeSet)null, pd.r.r, 2130968687, 2132018088, new int[0]);
                final int int1 = d.getInt(4, 4);
                final ze.a.a m = j.m;
                if (m.j != int1) {
                    m.j = int1;
                    j.p = (int)Math.pow(10.0, int1 - 1.0) - 1;
                    j.h.d = true;
                    j.f();
                    ((Drawable)j).invalidateSelf();
                }
                if (d.hasValue(5)) {
                    final int max = Math.max(0, d.getInt(5, 0));
                    final ze.a.a i = j.m;
                    if (i.i != max) {
                        i.i = max;
                        j.h.d = true;
                        j.f();
                        ((Drawable)j).invalidateSelf();
                    }
                }
                final int defaultColor = qf.c.a(context, d, 0).getDefaultColor();
                j.m.f = defaultColor;
                final ColorStateList value = ColorStateList.valueOf(defaultColor);
                final tf.f g = j.g;
                if (g.f.c != value) {
                    g.l(value);
                    ((Drawable)j).invalidateSelf();
                }
                if (d.hasValue(2)) {
                    final int defaultColor2 = qf.c.a(context, d, 2).getDefaultColor();
                    if (((Paint)j.h.a).getColor() != (j.m.g = defaultColor2)) {
                        ((Paint)j.h.a).setColor(defaultColor2);
                        ((Drawable)j).invalidateSelf();
                    }
                }
                final int int2 = d.getInt(1, 8388661);
                final ze.a.a k = j.m;
                if (k.n != int2) {
                    k.n = int2;
                    final WeakReference t = j.t;
                    if (t != null && t.get() != null) {
                        final View view = (View)j.t.get();
                        final WeakReference u = j.u;
                        ViewGroup viewGroup;
                        if (u != null) {
                            viewGroup = (ViewGroup)u.get();
                        }
                        else {
                            viewGroup = null;
                        }
                        j.t = new WeakReference(view);
                        j.u = new WeakReference(viewGroup);
                        j.f();
                        ((Drawable)j).invalidateSelf();
                    }
                }
                j.m.o = d.getDimensionPixelOffset(3, 0);
                j.f();
                j.m.p = d.getDimensionPixelOffset(6, 0);
                j.f();
                d.recycle();
                this.j = j;
            }
            this.c();
            final ze.a l = this.j;
            if (l != null) {
                return l;
            }
            throw new IllegalStateException("Unable to create badge");
        }
        
        public final void b() {
            if (this.j == null) {
                return;
            }
            ((ViewGroup)this).setClipChildren(true);
            ((ViewGroup)this).setClipToPadding(true);
            final ViewGroup viewGroup = (ViewGroup)((View)this).getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            final View i = this.i;
            if (i != null) {
                final ze.a j = this.j;
                if (j != null) {
                    i.getOverlay().remove((Drawable)j);
                }
                this.i = null;
            }
        }
        
        public final void c() {
            final ze.a j = this.j;
            final int n = 1;
            final int n2 = 1;
            if (j == null) {
                return;
            }
            if (this.k != null) {
                this.b();
            }
            else {
                final ImageView h = this.h;
                if (h != null) {
                    final g f = this.f;
                    if (f != null && f.a != null) {
                        if (this.i == h) {
                            this.d((View)h);
                            return;
                        }
                        this.b();
                        final ImageView h2 = this.h;
                        int n3;
                        if (this.j != null) {
                            n3 = n2;
                        }
                        else {
                            n3 = 0;
                        }
                        if (n3 == 0) {
                            return;
                        }
                        if (h2 != null) {
                            ((ViewGroup)this).setClipChildren(false);
                            ((ViewGroup)this).setClipToPadding(false);
                            final ViewGroup viewGroup = (ViewGroup)((View)this).getParent();
                            if (viewGroup != null) {
                                viewGroup.setClipChildren(false);
                                viewGroup.setClipToPadding(false);
                            }
                            final ze.a i = this.j;
                            final Rect bounds = new Rect();
                            ((View)h2).getDrawingRect(bounds);
                            ((Drawable)i).setBounds(bounds);
                            i.t = new WeakReference((T)h2);
                            i.u = new WeakReference(null);
                            i.f();
                            ((Drawable)i).invalidateSelf();
                            ((View)h2).getOverlay().add((Drawable)i);
                            this.i = (View)h2;
                        }
                        return;
                    }
                }
                final TextView g = this.g;
                if (g != null) {
                    final g f2 = this.f;
                    if (f2 != null && f2.f == 1) {
                        if (this.i == g) {
                            this.d((View)g);
                            return;
                        }
                        this.b();
                        final TextView g2 = this.g;
                        int n4;
                        if (this.j != null) {
                            n4 = n;
                        }
                        else {
                            n4 = 0;
                        }
                        if (n4 == 0) {
                            return;
                        }
                        if (g2 != null) {
                            ((ViewGroup)this).setClipChildren(false);
                            ((ViewGroup)this).setClipToPadding(false);
                            final ViewGroup viewGroup2 = (ViewGroup)((View)this).getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.setClipChildren(false);
                                viewGroup2.setClipToPadding(false);
                            }
                            final ze.a k = this.j;
                            final Rect bounds2 = new Rect();
                            ((View)g2).getDrawingRect(bounds2);
                            ((Drawable)k).setBounds(bounds2);
                            k.t = new WeakReference((T)g2);
                            k.u = new WeakReference(null);
                            k.f();
                            ((Drawable)k).invalidateSelf();
                            ((View)g2).getOverlay().add((Drawable)k);
                            this.i = (View)g2;
                        }
                        return;
                    }
                }
                this.b();
            }
        }
        
        public final void d(final View view) {
            final ze.a j = this.j;
            if (j != null && view == this.i) {
                final Rect bounds = new Rect();
                view.getDrawingRect(bounds);
                ((Drawable)j).setBounds(bounds);
                j.t = new WeakReference((T)view);
                j.u = new WeakReference(null);
                j.f();
                ((Drawable)j).invalidateSelf();
            }
        }
        
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            final int[] drawableState = ((View)this).getDrawableState();
            final Drawable n = this.n;
            int n2 = 0;
            if (n != null) {
                n2 = n2;
                if (n.isStateful()) {
                    n2 = ((false | this.n.setState(drawableState)) ? 1 : 0);
                }
            }
            if (n2 != 0) {
                ((View)this).invalidate();
                ((View)TabLayout.this).invalidate();
            }
        }
        
        public final void e() {
            final g f = this.f;
            final Drawable drawable = null;
            View e;
            if (f != null) {
                e = f.e;
            }
            else {
                e = null;
            }
            if (e != null) {
                final ViewParent parent = e.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup)parent).removeView(e);
                    }
                    ((ViewGroup)this).addView(e);
                }
                this.k = e;
                final TextView g = this.g;
                if (g != null) {
                    ((View)g).setVisibility(8);
                }
                final ImageView h = this.h;
                if (h != null) {
                    h.setVisibility(8);
                    this.h.setImageDrawable((Drawable)null);
                }
                final TextView l = (TextView)e.findViewById(16908308);
                if ((this.l = l) != null) {
                    this.o = e4.j.a.b(l);
                }
                this.m = (ImageView)e.findViewById(16908294);
            }
            else {
                final View k = this.k;
                if (k != null) {
                    ((ViewGroup)this).removeView(k);
                    this.k = null;
                }
                this.l = null;
                this.m = null;
            }
            final View i = this.k;
            final boolean b = false;
            if (i == null) {
                if (this.h == null) {
                    ((ViewGroup)this).addView((View)(this.h = (ImageView)LayoutInflater.from(((View)this).getContext()).inflate(2131624183, (ViewGroup)this, false)), 0);
                }
                Drawable mutate = drawable;
                if (f != null) {
                    final Drawable a = f.a;
                    mutate = drawable;
                    if (a != null) {
                        mutate = a.mutate();
                    }
                }
                if (mutate != null) {
                    a$b.h(mutate, TabLayout.this.p);
                    final PorterDuff$Mode s = TabLayout.this.s;
                    if (s != null) {
                        a$b.i(mutate, s);
                    }
                }
                if (this.g == null) {
                    ((ViewGroup)this).addView((View)(this.g = (TextView)LayoutInflater.from(((View)this).getContext()).inflate(2131624184, (ViewGroup)this, false)));
                    this.o = e4.j.a.b(this.g);
                }
                this.g.setTextAppearance(TabLayout.this.n);
                final ColorStateList o = TabLayout.this.o;
                if (o != null) {
                    this.g.setTextColor(o);
                }
                this.g(this.g, this.h);
                this.c();
                final ImageView h2 = this.h;
                if (h2 != null) {
                    ((View)h2).addOnLayoutChangeListener((View$OnLayoutChangeListener)new com.google.android.material.tabs.c(this, (View)h2));
                }
                final TextView g2 = this.g;
                if (g2 != null) {
                    ((View)g2).addOnLayoutChangeListener((View$OnLayoutChangeListener)new com.google.android.material.tabs.c(this, (View)g2));
                }
            }
            else {
                final TextView j = this.l;
                if (j != null || this.m != null) {
                    this.g(j, this.m);
                }
            }
            if (f != null && !TextUtils.isEmpty(f.c)) {
                ((View)this).setContentDescription(f.c);
            }
            boolean selected = b;
            if (f != null) {
                final TabLayout g3 = f.g;
                if (g3 == null) {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
                final boolean b2 = g3.getSelectedTabPosition() == f.d;
                selected = b;
                if (b2) {
                    selected = true;
                }
            }
            this.setSelected(selected);
        }
        
        public final void f(final Context context) {
            final int v = TabLayout.this.v;
            final GradientDrawable gradientDrawable = null;
            if (v != 0) {
                final Drawable l = wd.a.L(context, v);
                this.n = l;
                if (l != null && l.isStateful()) {
                    this.n.setState(((View)this).getDrawableState());
                }
            }
            else {
                this.n = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            Object o = gradientDrawable2;
            if (TabLayout.this.q != null) {
                Object o2 = new GradientDrawable();
                ((GradientDrawable)o2).setCornerRadius(1.0E-5f);
                ((GradientDrawable)o2).setColor(-1);
                final ColorStateList q = TabLayout.this.q;
                final ColorStateList list = new ColorStateList(new int[][] { rf.a.c, StateSet.NOTHING }, new int[] { rf.a.a(q, rf.a.b), rf.a.a(q, rf.a.a) });
                final boolean h = TabLayout.this.H;
                if (h) {
                    gradientDrawable2 = null;
                }
                if (h) {
                    o2 = gradientDrawable;
                }
                o = new RippleDrawable(list, (Drawable)gradientDrawable2, (Drawable)o2);
            }
            final WeakHashMap<View, t1> a = q0.a;
            q0$d.q((View)this, (Drawable)o);
            ((View)TabLayout.this).invalidate();
        }
        
        public final void g(final TextView textView, final ImageView imageView) {
            final g f = this.f;
            final CharSequence charSequence = null;
            Drawable mutate = null;
            Label_0031: {
                if (f != null) {
                    final Drawable a = f.a;
                    if (a != null) {
                        mutate = a.mutate();
                        break Label_0031;
                    }
                }
                mutate = null;
            }
            final g f2 = this.f;
            CharSequence b;
            if (f2 != null) {
                b = f2.b;
            }
            else {
                b = null;
            }
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    ((View)this).setVisibility(0);
                }
                else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable((Drawable)null);
                }
            }
            final boolean b2 = TextUtils.isEmpty(b) ^ true;
            if (textView != null) {
                if (b2) {
                    textView.setText(b);
                    if (this.f.f == 1) {
                        ((View)textView).setVisibility(0);
                    }
                    else {
                        ((View)textView).setVisibility(8);
                    }
                    ((View)this).setVisibility(0);
                }
                else {
                    ((View)textView).setVisibility(8);
                    textView.setText((CharSequence)null);
                }
            }
            if (imageView != null) {
                final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)((View)imageView).getLayoutParams();
                int bottomMargin;
                if (b2 && ((View)imageView).getVisibility() == 0) {
                    bottomMargin = (int)of.j.a(8, ((View)this).getContext());
                }
                else {
                    bottomMargin = 0;
                }
                if (TabLayout.this.F) {
                    if (bottomMargin != a4.j.b(viewGroup$MarginLayoutParams)) {
                        a4.j.g(viewGroup$MarginLayoutParams, bottomMargin);
                        viewGroup$MarginLayoutParams.bottomMargin = 0;
                        ((View)imageView).setLayoutParams((ViewGroup$LayoutParams)viewGroup$MarginLayoutParams);
                        ((View)imageView).requestLayout();
                    }
                }
                else if (bottomMargin != viewGroup$MarginLayoutParams.bottomMargin) {
                    viewGroup$MarginLayoutParams.bottomMargin = bottomMargin;
                    a4.j.g(viewGroup$MarginLayoutParams, 0);
                    ((View)imageView).setLayoutParams((ViewGroup$LayoutParams)viewGroup$MarginLayoutParams);
                    ((View)imageView).requestLayout();
                }
            }
            final g f3 = this.f;
            CharSequence c;
            if (f3 != null) {
                c = f3.c;
            }
            else {
                c = null;
            }
            if (b2) {
                c = charSequence;
            }
            d1.a((View)this, c);
        }
        
        public g getTab() {
            return this.f;
        }
        
        public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            final ze.a j = this.j;
            if (j != null && ((Drawable)j).isVisible()) {
                final CharSequence contentDescription = ((View)this).getContentDescription();
                final StringBuilder sb = new StringBuilder();
                sb.append((Object)contentDescription);
                sb.append(", ");
                sb.append((Object)this.j.c());
                accessibilityNodeInfo.setContentDescription((CharSequence)sb.toString());
            }
            final b4.c c = new b4.c(accessibilityNodeInfo);
            c.p(c$c.a(0, 1, this.f.d, 1, false, ((View)this).isSelected()));
            if (((View)this).isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                c.k(c$a.g);
            }
            c.s("Tab");
        }
        
        public final void onMeasure(int maxLines, final int n) {
            final int size = View$MeasureSpec.getSize(maxLines);
            final int mode = View$MeasureSpec.getMode(maxLines);
            final int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            int measureSpec = maxLines;
            Label_0057: {
                if (tabMaxWidth > 0) {
                    if (mode != 0) {
                        measureSpec = maxLines;
                        if (size <= tabMaxWidth) {
                            break Label_0057;
                        }
                    }
                    measureSpec = View$MeasureSpec.makeMeasureSpec(TabLayout.this.w, Integer.MIN_VALUE);
                }
            }
            super.onMeasure(measureSpec, n);
            if (this.g != null) {
                final float t = TabLayout.this.t;
                final int o = this.o;
                final ImageView h = this.h;
                final boolean b = true;
                float u;
                if (h != null && ((View)h).getVisibility() == 0) {
                    maxLines = 1;
                    u = t;
                }
                else {
                    final TextView g = this.g;
                    u = t;
                    maxLines = o;
                    if (g != null) {
                        u = t;
                        maxLines = o;
                        if (g.getLineCount() > 1) {
                            u = TabLayout.this.u;
                            maxLines = o;
                        }
                    }
                }
                final float textSize = this.g.getTextSize();
                final int lineCount = this.g.getLineCount();
                final int b2 = e4.j.a.b(this.g);
                final float n2 = fcmpl(u, textSize);
                if (n2 != 0 || (b2 >= 0 && maxLines != b2)) {
                    int n3 = b ? 1 : 0;
                    Label_0304: {
                        if (TabLayout.this.E == 1) {
                            n3 = (b ? 1 : 0);
                            if (n2 > 0) {
                                n3 = (b ? 1 : 0);
                                if (lineCount == 1) {
                                    final Layout layout = this.g.getLayout();
                                    if (layout != null) {
                                        final float lineWidth = layout.getLineWidth(0);
                                        n3 = (b ? 1 : 0);
                                        if (u / ((Paint)layout.getPaint()).getTextSize() * lineWidth <= ((View)this).getMeasuredWidth() - ((View)this).getPaddingLeft() - ((View)this).getPaddingRight()) {
                                            break Label_0304;
                                        }
                                    }
                                    n3 = 0;
                                }
                            }
                        }
                    }
                    if (n3 != 0) {
                        this.g.setTextSize(0, u);
                        this.g.setMaxLines(maxLines);
                        super.onMeasure(measureSpec, n);
                    }
                }
            }
        }
        
        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f != null) {
                if (!performClick) {
                    ((View)this).playSoundEffect(0);
                }
                this.f.a();
                performClick = true;
            }
            return performClick;
        }
        
        public void setSelected(final boolean b) {
            if (((View)this).isSelected() != b) {}
            super.setSelected(b);
            final TextView g = this.g;
            if (g != null) {
                g.setSelected(b);
            }
            final ImageView h = this.h;
            if (h != null) {
                h.setSelected(b);
            }
            final View k = this.k;
            if (k != null) {
                k.setSelected(b);
            }
        }
        
        public void setTab(final g f) {
            if (f != this.f) {
                this.f = f;
                this.e();
            }
        }
    }
}

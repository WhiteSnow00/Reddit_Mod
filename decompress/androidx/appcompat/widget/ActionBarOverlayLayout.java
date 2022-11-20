// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.view.ViewGroup$MarginLayoutParams;
import android.view.Window$Callback;
import android.content.res.TypedArray;
import k.h;
import a4.r1$b;
import q3.f;
import a4.l0$d;
import a4.l0$h;
import android.content.res.Configuration;
import java.util.WeakHashMap;
import a4.l0$i;
import a4.l0;
import android.view.WindowInsets;
import android.view.View;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import h.f$d;
import androidx.appcompat.view.menu.MenuBuilder;
import android.widget.FrameLayout;
import android.util.AttributeSet;
import android.content.Context;
import a4.r1;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import a4.a0;
import android.view.ViewPropertyAnimator;
import android.widget.OverScroller;
import a4.z;
import a4.y;
import android.view.ViewGroup;

public class ActionBarOverlayLayout extends ViewGroup implements b0, y, z
{
    public static final int[] G;
    public OverScroller A;
    public ViewPropertyAnimator B;
    public final ActionBarOverlayLayout$a C;
    public final ActionBarOverlayLayout$b D;
    public final ActionBarOverlayLayout$c E;
    public final a0 F;
    public int f;
    public int g;
    public ContentFrameLayout h;
    public ActionBarContainer i;
    public c0 j;
    public Drawable k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public final Rect s;
    public final Rect t;
    public final Rect u;
    public r1 v;
    public r1 w;
    public r1 x;
    public r1 y;
    public ActionBarOverlayLayout.ActionBarOverlayLayout$d z;
    
    static {
        G = new int[] { 2130968581, 16842841 };
    }
    
    public ActionBarOverlayLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.g = 0;
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        final r1 b = r1.b;
        this.v = b;
        this.w = b;
        this.x = b;
        this.y = b;
        this.C = new ActionBarOverlayLayout$a(this);
        this.D = new ActionBarOverlayLayout$b(this);
        this.E = new ActionBarOverlayLayout$c(this);
        this.r(context);
        this.F = new a0();
    }
    
    public static boolean p(final FrameLayout frameLayout, final Rect rect, final boolean b) {
        final ActionBarOverlayLayout.ActionBarOverlayLayout$e actionBarOverlayLayout$e = (ActionBarOverlayLayout.ActionBarOverlayLayout$e)((View)frameLayout).getLayoutParams();
        final int leftMargin = ((ViewGroup$MarginLayoutParams)actionBarOverlayLayout$e).leftMargin;
        final int left = rect.left;
        final boolean b2 = true;
        boolean b3;
        if (leftMargin != left) {
            ((ViewGroup$MarginLayoutParams)actionBarOverlayLayout$e).leftMargin = left;
            b3 = true;
        }
        else {
            b3 = false;
        }
        final int topMargin = ((ViewGroup$MarginLayoutParams)actionBarOverlayLayout$e).topMargin;
        final int top = rect.top;
        if (topMargin != top) {
            ((ViewGroup$MarginLayoutParams)actionBarOverlayLayout$e).topMargin = top;
            b3 = true;
        }
        final int rightMargin = ((ViewGroup$MarginLayoutParams)actionBarOverlayLayout$e).rightMargin;
        final int right = rect.right;
        if (rightMargin != right) {
            ((ViewGroup$MarginLayoutParams)actionBarOverlayLayout$e).rightMargin = right;
            b3 = true;
        }
        if (b) {
            final int bottomMargin = ((ViewGroup$MarginLayoutParams)actionBarOverlayLayout$e).bottomMargin;
            final int bottom = rect.bottom;
            if (bottomMargin != bottom) {
                ((ViewGroup$MarginLayoutParams)actionBarOverlayLayout$e).bottomMargin = bottom;
                b3 = b2;
            }
        }
        return b3;
    }
    
    public final void a(final MenuBuilder menuBuilder, final f$d f$d) {
        this.s();
        this.j.a(menuBuilder, f$d);
    }
    
    public final boolean b() {
        this.s();
        return this.j.b();
    }
    
    public final boolean c() {
        this.s();
        return this.j.c();
    }
    
    public final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof ActionBarOverlayLayout.ActionBarOverlayLayout$e;
    }
    
    public final boolean d() {
        this.s();
        return this.j.d();
    }
    
    public final void draw(final Canvas canvas) {
        super.draw(canvas);
        if (this.k != null && !this.l) {
            int n;
            if (((View)this.i).getVisibility() == 0) {
                n = (int)(((View)this.i).getTranslationY() + ((View)this.i).getBottom() + 0.5f);
            }
            else {
                n = 0;
            }
            this.k.setBounds(0, n, ((View)this).getWidth(), this.k.getIntrinsicHeight() + n);
            this.k.draw(canvas);
        }
    }
    
    public final boolean e() {
        this.s();
        return this.j.e();
    }
    
    public final void f() {
        this.s();
        this.j.f();
    }
    
    public final boolean fitSystemWindows(final Rect rect) {
        return super.fitSystemWindows(rect);
    }
    
    public final boolean g() {
        this.s();
        return this.j.g();
    }
    
    public final ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new ActionBarOverlayLayout.ActionBarOverlayLayout$e();
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new ActionBarOverlayLayout.ActionBarOverlayLayout$e(((View)this).getContext(), set);
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new ActionBarOverlayLayout.ActionBarOverlayLayout$e(viewGroup$LayoutParams);
    }
    
    public int getActionBarHideOffset() {
        final ActionBarContainer i = this.i;
        int n;
        if (i != null) {
            n = -(int)((View)i).getTranslationY();
        }
        else {
            n = 0;
        }
        return n;
    }
    
    public int getNestedScrollAxes() {
        final a0 f = this.F;
        return f.b | f.a;
    }
    
    public CharSequence getTitle() {
        this.s();
        return this.j.getTitle();
    }
    
    public final void h(final int n, final View view) {
        if (n == 0) {
            this.onStopNestedScroll(view);
        }
    }
    
    public final void i(final View view, final View view2, final int n, final int n2) {
        if (n2 == 0) {
            this.onNestedScrollAccepted(view, view2, n);
        }
    }
    
    public final void j(final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (n5 == 0) {
            this.onNestedScroll(view, n, n2, n3, n4);
        }
    }
    
    public final void k(final int n) {
        this.s();
        if (n != 2) {
            if (n != 5) {
                if (n == 109) {
                    this.setOverlayMode(true);
                }
            }
            else {
                this.j.s();
            }
        }
        else {
            this.j.k();
        }
    }
    
    public final void l(final View view, final int n, final int n2, final int[] array, final int n3) {
        if (n3 == 0) {
            this.onNestedPreScroll(view, n, n2, array);
        }
    }
    
    public final void m() {
        this.s();
        this.j.m();
    }
    
    public final void n(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
        this.j(view, n, n2, n3, n4, n5);
    }
    
    public final boolean o(final View view, final View view2, final int n, final int n2) {
        return n2 == 0 && this.onStartNestedScroll(view, view2, n);
    }
    
    public final WindowInsets onApplyWindowInsets(final WindowInsets windowInsets) {
        this.s();
        final r1 j = r1.j((View)this, windowInsets);
        int p = p((FrameLayout)this.i, new Rect(j.d(), j.f(), j.e(), j.c()), false) ? 1 : 0;
        final Rect s = this.s;
        final WeakHashMap a = l0.a;
        l0$i.b((View)this, j, s);
        final Rect s2 = this.s;
        final r1 m = j.a.m(s2.left, s2.top, s2.right, s2.bottom);
        this.v = m;
        final boolean equals = this.w.equals((Object)m);
        final int n = 1;
        if (!equals) {
            this.w = this.v;
            p = 1;
        }
        if (!this.t.equals((Object)this.s)) {
            this.t.set(this.s);
            p = n;
        }
        if (p != 0) {
            ((View)this).requestLayout();
        }
        return j.a.a().a.c().a.b().i();
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.r(((View)this).getContext());
        final WeakHashMap a = l0.a;
        l0$h.c((View)this);
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.q();
    }
    
    public final void onLayout(final boolean b, int i, int paddingLeft, int paddingTop, int childCount) {
        childCount = this.getChildCount();
        paddingLeft = ((View)this).getPaddingLeft();
        paddingTop = ((View)this).getPaddingTop();
        View child;
        ActionBarOverlayLayout.ActionBarOverlayLayout$e actionBarOverlayLayout$e;
        int measuredWidth;
        int measuredHeight;
        int n;
        int n2;
        for (i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                actionBarOverlayLayout$e = (ActionBarOverlayLayout.ActionBarOverlayLayout$e)child.getLayoutParams();
                measuredWidth = child.getMeasuredWidth();
                measuredHeight = child.getMeasuredHeight();
                n = ((ViewGroup$MarginLayoutParams)actionBarOverlayLayout$e).leftMargin + paddingLeft;
                n2 = ((ViewGroup$MarginLayoutParams)actionBarOverlayLayout$e).topMargin + paddingTop;
                child.layout(n, n2, measuredWidth + n, measuredHeight + n2);
            }
        }
    }
    
    public final void onMeasure(final int n, final int n2) {
        this.s();
        this.measureChildWithMargins((View)this.i, n, 0, n2, 0);
        final ActionBarOverlayLayout.ActionBarOverlayLayout$e actionBarOverlayLayout$e = (ActionBarOverlayLayout.ActionBarOverlayLayout$e)((View)this.i).getLayoutParams();
        final int max = Math.max(0, ((View)this.i).getMeasuredWidth() + ((ViewGroup$MarginLayoutParams)actionBarOverlayLayout$e).leftMargin + ((ViewGroup$MarginLayoutParams)actionBarOverlayLayout$e).rightMargin);
        final int max2 = Math.max(0, ((View)this.i).getMeasuredHeight() + ((ViewGroup$MarginLayoutParams)actionBarOverlayLayout$e).topMargin + ((ViewGroup$MarginLayoutParams)actionBarOverlayLayout$e).bottomMargin);
        final int combineMeasuredStates = View.combineMeasuredStates(0, ((View)this.i).getMeasuredState());
        final WeakHashMap a = l0.a;
        final boolean b = (l0$d.g((View)this) & 0x100) != 0x0;
        int n4;
        if (b) {
            final int n3 = n4 = this.f;
            if (this.n) {
                n4 = n3;
                if (this.i.getTabContainer() != null) {
                    n4 = n3 + this.f;
                }
            }
        }
        else if (((View)this.i).getVisibility() != 8) {
            n4 = ((View)this.i).getMeasuredHeight();
        }
        else {
            n4 = 0;
        }
        this.u.set(this.s);
        final r1 v = this.v;
        this.x = v;
        if (!this.m && !b) {
            final Rect u = this.u;
            u.top += n4;
            u.bottom += 0;
            this.x = v.a.m(0, n4, 0, 0);
        }
        else {
            final f b2 = q3.f.b(v.d(), this.x.f() + n4, this.x.e(), this.x.c() + 0);
            final r1$b r1$b = new r1$b(this.x);
            r1$b.a.g(b2);
            this.x = r1$b.a();
        }
        p(this.h, this.u, true);
        if (!this.y.equals((Object)this.x)) {
            final r1 x = this.x;
            this.y = x;
            l0.b((View)this.h, x);
        }
        this.measureChildWithMargins((View)this.h, n, 0, n2, 0);
        final ActionBarOverlayLayout.ActionBarOverlayLayout$e actionBarOverlayLayout$e2 = (ActionBarOverlayLayout.ActionBarOverlayLayout$e)((View)this.h).getLayoutParams();
        final int max3 = Math.max(max, ((View)this.h).getMeasuredWidth() + ((ViewGroup$MarginLayoutParams)actionBarOverlayLayout$e2).leftMargin + ((ViewGroup$MarginLayoutParams)actionBarOverlayLayout$e2).rightMargin);
        final int max4 = Math.max(max2, ((View)this.h).getMeasuredHeight() + ((ViewGroup$MarginLayoutParams)actionBarOverlayLayout$e2).topMargin + ((ViewGroup$MarginLayoutParams)actionBarOverlayLayout$e2).bottomMargin);
        final int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, ((View)this.h).getMeasuredState());
        ((View)this).setMeasuredDimension(View.resolveSizeAndState(Math.max(((View)this).getPaddingRight() + ((View)this).getPaddingLeft() + max3, ((View)this).getSuggestedMinimumWidth()), n, combineMeasuredStates2), View.resolveSizeAndState(Math.max(((View)this).getPaddingBottom() + ((View)this).getPaddingTop() + max4, ((View)this).getSuggestedMinimumHeight()), n2, combineMeasuredStates2 << 16));
    }
    
    public final boolean onNestedFling(final View view, final float n, final float n2, final boolean b) {
        final boolean o = this.o;
        boolean b2 = false;
        if (o && b) {
            this.A.fling(0, 0, 0, (int)n2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (this.A.getFinalY() > ((View)this.i).getHeight()) {
                b2 = true;
            }
            if (b2) {
                this.q();
                this.E.run();
            }
            else {
                this.q();
                this.D.run();
            }
            return this.p = true;
        }
        return false;
    }
    
    public final boolean onNestedPreFling(final View view, final float n, final float n2) {
        return false;
    }
    
    public final void onNestedPreScroll(final View view, final int n, final int n2, final int[] array) {
    }
    
    public final void onNestedScroll(final View view, int q, final int n, final int n2, final int n3) {
        q = this.q + n;
        this.setActionBarHideOffset(this.q = q);
    }
    
    public final void onNestedScrollAccepted(final View view, final View view2, final int n) {
        this.F.a(n, 0);
        this.q = this.getActionBarHideOffset();
        this.q();
        final ActionBarOverlayLayout.ActionBarOverlayLayout$d z = this.z;
        if (z != null) {
            final h.y y = (h.y)z;
            final h u = y.u;
            if (u != null) {
                u.a();
                y.u = null;
            }
        }
    }
    
    public final boolean onStartNestedScroll(final View view, final View view2, final int n) {
        return (n & 0x2) != 0x0 && ((View)this.i).getVisibility() == 0 && this.o;
    }
    
    public final void onStopNestedScroll(final View view) {
        if (this.o && !this.p) {
            if (this.q <= ((View)this.i).getHeight()) {
                this.q();
                ((View)this).postDelayed((Runnable)this.D, 600L);
            }
            else {
                this.q();
                ((View)this).postDelayed((Runnable)this.E, 600L);
            }
        }
    }
    
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(final int r) {
        super.onWindowSystemUiVisibilityChanged(r);
        this.s();
        final int r2 = this.r;
        this.r = r;
        final boolean b = (r & 0x4) == 0x0;
        final boolean b2 = (r & 0x100) != 0x0;
        final ActionBarOverlayLayout.ActionBarOverlayLayout$d z = this.z;
        if (z != null) {
            ((h.y)z).p = (b2 ^ true);
            if (!b && b2) {
                final h.y y = (h.y)z;
                if (!y.r) {
                    y.C(y.r = true);
                }
            }
            else {
                final h.y y2 = (h.y)z;
                if (y2.r) {
                    y2.r = false;
                    y2.C(true);
                }
            }
        }
        if (((r2 ^ r) & 0x100) != 0x0 && this.z != null) {
            final WeakHashMap a = l0.a;
            l0$h.c((View)this);
        }
    }
    
    public final void onWindowVisibilityChanged(final int n) {
        super.onWindowVisibilityChanged(n);
        this.g = n;
        final ActionBarOverlayLayout.ActionBarOverlayLayout$d z = this.z;
        if (z != null) {
            ((h.y)z).o = n;
        }
    }
    
    public final void q() {
        ((View)this).removeCallbacks((Runnable)this.D);
        ((View)this).removeCallbacks((Runnable)this.E);
        final ViewPropertyAnimator b = this.B;
        if (b != null) {
            b.cancel();
        }
    }
    
    public final void r(final Context context) {
        final TypedArray obtainStyledAttributes = ((View)this).getContext().getTheme().obtainStyledAttributes(ActionBarOverlayLayout.G);
        final boolean b = false;
        this.f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        final Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.k = drawable;
        ((View)this).setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        boolean l = b;
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            l = true;
        }
        this.l = l;
        this.A = new OverScroller(context);
    }
    
    public final void s() {
        if (this.h == null) {
            this.h = (ContentFrameLayout)((View)this).findViewById(2131427432);
            this.i = (ActionBarContainer)((View)this).findViewById(2131427433);
            final View viewById = ((View)this).findViewById(2131427431);
            c0 wrapper;
            if (viewById instanceof c0) {
                wrapper = (c0)viewById;
            }
            else {
                if (!(viewById instanceof Toolbar)) {
                    final StringBuilder t = a.t("Can't make a decor toolbar out of ");
                    t.append(((Toolbar)viewById).getClass().getSimpleName());
                    throw new IllegalStateException(t.toString());
                }
                wrapper = ((Toolbar)viewById).getWrapper();
            }
            this.j = wrapper;
        }
    }
    
    public void setActionBarHideOffset(int max) {
        this.q();
        max = Math.max(0, Math.min(max, ((View)this.i).getHeight()));
        ((View)this.i).setTranslationY((float)(-max));
    }
    
    public void setActionBarVisibilityCallback(ActionBarOverlayLayout.ActionBarOverlayLayout$d z) {
        this.z = z;
        if (((View)this).getWindowToken() != null) {
            z = this.z;
            ((h.y)z).o = this.g;
            final int r = this.r;
            if (r != 0) {
                this.onWindowSystemUiVisibilityChanged(r);
                final WeakHashMap a = l0.a;
                l0$h.c((View)this);
            }
        }
    }
    
    public void setHasNonEmbeddedTabs(final boolean n) {
        this.n = n;
    }
    
    public void setHideOnContentScrollEnabled(final boolean o) {
        if (o != this.o && !(this.o = o)) {
            this.q();
            this.setActionBarHideOffset(0);
        }
    }
    
    public void setIcon(final int icon) {
        this.s();
        this.j.setIcon(icon);
    }
    
    public void setIcon(final Drawable icon) {
        this.s();
        this.j.setIcon(icon);
    }
    
    public void setLogo(final int n) {
        this.s();
        this.j.u(n);
    }
    
    public void setOverlayMode(final boolean m) {
        this.m = m;
        this.l = (m && ((View)this).getContext().getApplicationInfo().targetSdkVersion < 19);
    }
    
    public void setShowingForActionMode(final boolean b) {
    }
    
    public void setUiOptions(final int n) {
    }
    
    public void setWindowCallback(final Window$Callback windowCallback) {
        this.s();
        this.j.setWindowCallback(windowCallback);
    }
    
    public void setWindowTitle(final CharSequence windowTitle) {
        this.s();
        this.j.setWindowTitle(windowTitle);
    }
    
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

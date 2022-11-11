// 
// Decompiled by Procyon v0.6.0
// 

package androidx.swiperefreshlayout.widget;

import android.view.AbsSavedState;
import android.view.animation.Animation$AnimationListener;
import android.view.ViewParent;
import java.util.WeakHashMap;
import a4.p0;
import android.os.Parcelable;
import android.view.View$MeasureSpec;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.widget.ListView;
import android.content.res.TypedArray;
import android.util.DisplayMetrics;
import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import r5.a;
import android.view.animation.DecelerateInterpolator;
import a4.b0;
import a4.e0;
import android.view.View;
import r5.g;
import r5.f;
import r5.e;
import r5.d;
import a4.a0;
import a4.c0;
import a4.d0;
import android.view.ViewGroup;

public class SwipeRefreshLayout extends ViewGroup implements d0, c0, a0
{
    public static final int[] P;
    public int A;
    public int B;
    public int C;
    public int D;
    public d E;
    public e F;
    public f G;
    public g H;
    public g I;
    public boolean J;
    public int K;
    public boolean L;
    public SwipeRefreshLayout$a M;
    public final SwipeRefreshLayout$c N;
    public final SwipeRefreshLayout$d O;
    public View f;
    public SwipeRefreshLayout.SwipeRefreshLayout$f g;
    public boolean h;
    public int i;
    public float j;
    public float k;
    public final e0 l;
    public final b0 m;
    public final int[] n;
    public final int[] o;
    public final int[] p;
    public boolean q;
    public int r;
    public int s;
    public float t;
    public float u;
    public boolean v;
    public int w;
    public final DecelerateInterpolator x;
    public a y;
    public int z;
    
    static {
        P = new int[] { 16842766 };
    }
    
    public SwipeRefreshLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.h = false;
        this.j = -1.0f;
        this.n = new int[2];
        this.o = new int[2];
        this.p = new int[2];
        this.w = -1;
        this.z = -1;
        this.M = new SwipeRefreshLayout$a(this);
        this.N = new SwipeRefreshLayout$c(this);
        this.O = new SwipeRefreshLayout$d(this);
        this.i = ViewConfiguration.get(context).getScaledTouchSlop();
        this.r = ((View)this).getResources().getInteger(17694721);
        ((View)this).setWillNotDraw(false);
        this.x = new DecelerateInterpolator(2.0f);
        final DisplayMetrics displayMetrics = ((View)this).getResources().getDisplayMetrics();
        this.K = (int)(displayMetrics.density * 40.0f);
        this.y = new a(((View)this).getContext());
        (this.E = new d(((View)this).getContext())).c(1);
        this.y.setImageDrawable((Drawable)this.E);
        ((View)this.y).setVisibility(8);
        this.addView((View)this.y);
        this.setChildrenDrawingOrderEnabled(true);
        final int c = (int)(displayMetrics.density * 64.0f);
        this.C = c;
        this.j = (float)c;
        this.l = new e0();
        this.m = new b0((View)this);
        this.setNestedScrollingEnabled(true);
        final int n = -this.K;
        this.s = n;
        this.B = n;
        this.e(1.0f);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, SwipeRefreshLayout.P);
        this.setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }
    
    private void setColorViewAlpha(final int n) {
        ((View)this.y).getBackground().setAlpha(n);
        this.E.setAlpha(n);
    }
    
    public final boolean a() {
        final View f = this.f;
        if (f instanceof ListView) {
            return e4.g.a((ListView)f, -1);
        }
        return f.canScrollVertically(-1);
    }
    
    public final void b() {
        if (this.f == null) {
            for (int i = 0; i < this.getChildCount(); ++i) {
                final View child = this.getChildAt(i);
                if (!child.equals(this.y)) {
                    this.f = child;
                    break;
                }
            }
        }
    }
    
    public final void c(final float n) {
        if (n > this.j) {
            this.g(true, true);
        }
        else {
            this.h = false;
            final d e = this.E;
            final d.a f = e.f;
            f.e = 0.0f;
            f.f = 0.0f;
            e.invalidateSelf();
            final SwipeRefreshLayout$b f2 = new SwipeRefreshLayout$b(this);
            this.A = this.s;
            ((Animation)this.O).reset();
            ((Animation)this.O).setDuration(200L);
            ((Animation)this.O).setInterpolator((Interpolator)this.x);
            final a y = this.y;
            y.f = (Animation$AnimationListener)f2;
            ((View)y).clearAnimation();
            ((View)this.y).startAnimation((Animation)this.O);
            final d e2 = this.E;
            final d.a f3 = e2.f;
            if (f3.n) {
                f3.n = false;
            }
            e2.invalidateSelf();
        }
    }
    
    public final void d(float n) {
        final d e = this.E;
        final d.a f = e.f;
        final boolean n2 = f.n;
        final int n3 = 1;
        final int n4 = 1;
        if (!n2) {
            f.n = true;
        }
        e.invalidateSelf();
        final float min = Math.min(1.0f, Math.abs(n / this.j));
        final float n5 = (float)Math.max(min - 0.4, 0.0) * 5.0f / 3.0f;
        final float abs = Math.abs(n);
        final float j = this.j;
        int n6 = this.D;
        if (n6 <= 0) {
            n6 = this.C;
        }
        final float n7 = (float)n6;
        final double n8 = Math.max(0.0f, Math.min(abs - j, n7 * 2.0f) / n7) / 4.0f;
        final float n9 = (float)(n8 - Math.pow(n8, 2.0)) * 2.0f;
        final int b = this.B;
        final int n10 = (int)(n7 * min + n7 * n9 * 2.0f);
        if (((View)this.y).getVisibility() != 0) {
            ((View)this.y).setVisibility(0);
        }
        ((View)this.y).setScaleX(1.0f);
        ((View)this.y).setScaleY(1.0f);
        if (n < this.j) {
            if (this.E.f.t > 76) {
                final g h = this.H;
                int n11;
                if (h != null && h.hasStarted() && !h.hasEnded()) {
                    n11 = n4;
                }
                else {
                    n11 = 0;
                }
                if (n11 == 0) {
                    final g h2 = new g(this, this.E.f.t, 76);
                    h2.setDuration(300L);
                    final a y = this.y;
                    y.f = null;
                    ((View)y).clearAnimation();
                    ((View)this.y).startAnimation((Animation)h2);
                    this.H = h2;
                }
            }
        }
        else if (this.E.f.t < 255) {
            final g i = this.I;
            int n12;
            if (i != null && i.hasStarted() && !i.hasEnded()) {
                n12 = n3;
            }
            else {
                n12 = 0;
            }
            if (n12 == 0) {
                final g k = new g(this, this.E.f.t, 255);
                k.setDuration(300L);
                final a y2 = this.y;
                y2.f = null;
                ((View)y2).clearAnimation();
                ((View)this.y).startAnimation((Animation)k);
                this.I = k;
            }
        }
        final d e2 = this.E;
        n = Math.min(0.8f, n5 * 0.8f);
        final d.a f2 = e2.f;
        f2.e = 0.0f;
        f2.f = n;
        e2.invalidateSelf();
        final d e3 = this.E;
        n = Math.min(1.0f, n5);
        final d.a f3 = e3.f;
        if (n != f3.p) {
            f3.p = n;
        }
        e3.invalidateSelf();
        final d e4 = this.E;
        e4.f.g = (n9 * 2.0f + (n5 * 0.4f - 0.25f)) * 0.5f;
        e4.invalidateSelf();
        this.setTargetOffsetTopAndBottom(b + n10 - this.s);
    }
    
    public final boolean dispatchNestedFling(final float n, final float n2, final boolean b) {
        return this.m.a(n, n2, b);
    }
    
    public final boolean dispatchNestedPreFling(final float n, final float n2) {
        return this.m.b(n, n2);
    }
    
    public final boolean dispatchNestedPreScroll(final int n, final int n2, final int[] array, final int[] array2) {
        return this.m.c(n, n2, array, array2, 0);
    }
    
    public final boolean dispatchNestedScroll(final int n, final int n2, final int n3, final int n4, final int[] array) {
        return this.m.e(n, n2, n3, n4, array);
    }
    
    public final void e(final float n) {
        final int a = this.A;
        this.setTargetOffsetTopAndBottom(a + (int)((this.B - a) * n) - ((View)this.y).getTop());
    }
    
    public final void f() {
        ((View)this.y).clearAnimation();
        this.E.stop();
        ((View)this.y).setVisibility(8);
        this.setColorViewAlpha(255);
        this.setTargetOffsetTopAndBottom(this.B - this.s);
        this.s = ((View)this.y).getTop();
    }
    
    public final void g(final boolean h, final boolean j) {
        if (this.h != h) {
            this.J = j;
            this.b();
            this.h = h;
            if (h) {
                final int s = this.s;
                final SwipeRefreshLayout$a m = this.M;
                this.A = s;
                ((Animation)this.N).reset();
                ((Animation)this.N).setDuration(200L);
                ((Animation)this.N).setInterpolator((Interpolator)this.x);
                if (m != null) {
                    this.y.f = (Animation$AnimationListener)m;
                }
                ((View)this.y).clearAnimation();
                ((View)this.y).startAnimation((Animation)this.N);
            }
            else {
                final SwipeRefreshLayout$a i = this.M;
                (this.G = new f(this)).setDuration(150L);
                final a y = this.y;
                y.f = (Animation$AnimationListener)i;
                ((View)y).clearAnimation();
                ((View)this.y).startAnimation((Animation)this.G);
            }
        }
    }
    
    public final int getChildDrawingOrder(int n, final int n2) {
        final int z = this.z;
        if (z < 0) {
            return n2;
        }
        if (n2 == n - 1) {
            return z;
        }
        if ((n = n2) >= z) {
            n = n2 + 1;
        }
        return n;
    }
    
    public int getNestedScrollAxes() {
        final e0 l = this.l;
        return l.b | l.a;
    }
    
    public int getProgressCircleDiameter() {
        return this.K;
    }
    
    public int getProgressViewEndOffset() {
        return this.C;
    }
    
    public int getProgressViewStartOffset() {
        return this.B;
    }
    
    public final void h(final int n, final View view) {
        if (n == 0) {
            this.onStopNestedScroll(view);
        }
    }
    
    public final boolean hasNestedScrollingParent() {
        return this.m.h(0);
    }
    
    public final void i(final View view, final View view2, final int n, final int n2) {
        if (n2 == 0) {
            this.onNestedScrollAccepted(view, view2, n);
        }
    }
    
    public final boolean isNestedScrollingEnabled() {
        return this.m.d;
    }
    
    public final void j(final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
        this.n(view, n, n2, n3, n4, n5, this.p);
    }
    
    public final void k(final float n) {
        final float u = this.u;
        final int i = this.i;
        if (n - u > i && !this.v) {
            this.t = u + i;
            this.v = true;
            this.E.setAlpha(76);
        }
    }
    
    public final void l(final View view, final int n, final int n2, final int[] array, final int n3) {
        if (n3 == 0) {
            this.onNestedPreScroll(view, n, n2, array);
        }
    }
    
    public final void n(final View view, int n, int n2, final int n3, final int n4, final int n5, final int[] array) {
        if (n5 != 0) {
            return;
        }
        final int n6 = array[1];
        final int[] o = this.o;
        if (n5 == 0) {
            this.m.d(n, n2, n3, n4, o, n5, array);
        }
        n2 = n4 - (array[1] - n6);
        if (n2 == 0) {
            n = n4 + this.o[1];
        }
        else {
            n = n2;
        }
        if (n < 0 && !this.a()) {
            this.d(this.k += Math.abs(n));
            array[1] += n2;
        }
    }
    
    public final boolean o(final View view, final View view2, final int n, final int n2) {
        return n2 == 0 && this.onStartNestedScroll(view, view2, n);
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f();
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        this.b();
        final int actionMasked = motionEvent.getActionMasked();
        final boolean enabled = ((View)this).isEnabled();
        int n = 0;
        if (enabled && !this.a() && !this.h && !this.q) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 6) {
                                return this.v;
                            }
                            final int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == this.w) {
                                if (actionIndex == 0) {
                                    n = 1;
                                }
                                this.w = motionEvent.getPointerId(n);
                                return this.v;
                            }
                            return this.v;
                        }
                    }
                    else {
                        final int w = this.w;
                        if (w == -1) {
                            Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                            return false;
                        }
                        final int pointerIndex = motionEvent.findPointerIndex(w);
                        if (pointerIndex < 0) {
                            return false;
                        }
                        this.k(motionEvent.getY(pointerIndex));
                        return this.v;
                    }
                }
                this.v = false;
                this.w = -1;
            }
            else {
                this.setTargetOffsetTopAndBottom(this.B - ((View)this.y).getTop());
                final int pointerId = motionEvent.getPointerId(0);
                this.w = pointerId;
                this.v = false;
                final int pointerIndex2 = motionEvent.findPointerIndex(pointerId);
                if (pointerIndex2 < 0) {
                    return false;
                }
                this.u = motionEvent.getY(pointerIndex2);
            }
            return this.v;
        }
        return false;
    }
    
    public final void onLayout(final boolean b, int measuredWidth, int n, int n2, int paddingTop) {
        measuredWidth = ((View)this).getMeasuredWidth();
        n = ((View)this).getMeasuredHeight();
        if (this.getChildCount() == 0) {
            return;
        }
        if (this.f == null) {
            this.b();
        }
        final View f = this.f;
        if (f == null) {
            return;
        }
        n2 = ((View)this).getPaddingLeft();
        paddingTop = ((View)this).getPaddingTop();
        f.layout(n2, paddingTop, measuredWidth - ((View)this).getPaddingLeft() - ((View)this).getPaddingRight() + n2, n - ((View)this).getPaddingTop() - ((View)this).getPaddingBottom() + paddingTop);
        n2 = ((View)this.y).getMeasuredWidth();
        n = ((View)this.y).getMeasuredHeight();
        final a y = this.y;
        measuredWidth /= 2;
        paddingTop = n2 / 2;
        n2 = this.s;
        ((View)y).layout(measuredWidth - paddingTop, n2, measuredWidth + paddingTop, n + n2);
    }
    
    public final void onMeasure(int i, final int n) {
        super.onMeasure(i, n);
        if (this.f == null) {
            this.b();
        }
        final View f = this.f;
        if (f == null) {
            return;
        }
        f.measure(View$MeasureSpec.makeMeasureSpec(((View)this).getMeasuredWidth() - ((View)this).getPaddingLeft() - ((View)this).getPaddingRight(), 1073741824), View$MeasureSpec.makeMeasureSpec(((View)this).getMeasuredHeight() - ((View)this).getPaddingTop() - ((View)this).getPaddingBottom(), 1073741824));
        ((View)this.y).measure(View$MeasureSpec.makeMeasureSpec(this.K, 1073741824), View$MeasureSpec.makeMeasureSpec(this.K, 1073741824));
        this.z = -1;
        for (i = 0; i < this.getChildCount(); ++i) {
            if (this.getChildAt(i) == this.y) {
                this.z = i;
                break;
            }
        }
    }
    
    public final boolean onNestedFling(final View view, final float n, final float n2, final boolean b) {
        return this.dispatchNestedFling(n, n2, b);
    }
    
    public final boolean onNestedPreFling(final View view, final float n, final float n2) {
        return this.dispatchNestedPreFling(n, n2);
    }
    
    public final void onNestedPreScroll(final View view, final int n, final int n2, final int[] array) {
        if (n2 > 0) {
            final float k = this.k;
            if (k > 0.0f) {
                final float n3 = (float)n2;
                if (n3 > k) {
                    array[1] = (int)k;
                    this.k = 0.0f;
                }
                else {
                    this.k = k - n3;
                    array[1] = n2;
                }
                this.d(this.k);
            }
        }
        final int[] n4 = this.n;
        if (this.dispatchNestedPreScroll(n - array[0], n2 - array[1], n4, null)) {
            array[0] += n4[0];
            array[1] += n4[1];
        }
    }
    
    public final void onNestedScroll(final View view, final int n, final int n2, final int n3, final int n4) {
        this.n(view, n, n2, n3, n4, 0, this.p);
    }
    
    public final void onNestedScrollAccepted(final View view, final View view2, final int n) {
        this.l.a(n, 0);
        this.startNestedScroll(n & 0x2);
        this.k = 0.0f;
        this.q = true;
    }
    
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        final SwipeRefreshLayout.SwipeRefreshLayout$g swipeRefreshLayout$g = (SwipeRefreshLayout.SwipeRefreshLayout$g)parcelable;
        super.onRestoreInstanceState(((AbsSavedState)swipeRefreshLayout$g).getSuperState());
        this.setRefreshing(swipeRefreshLayout$g.f);
    }
    
    public final Parcelable onSaveInstanceState() {
        return (Parcelable)new SwipeRefreshLayout.SwipeRefreshLayout$g(super.onSaveInstanceState(), this.h);
    }
    
    public final boolean onStartNestedScroll(final View view, final View view2, final int n) {
        return ((View)this).isEnabled() && !this.h && (n & 0x2) != 0x0;
    }
    
    public final void onStopNestedScroll(final View view) {
        this.l.a = 0;
        this.q = false;
        final float k = this.k;
        if (k > 0.0f) {
            this.c(k);
            this.k = 0.0f;
        }
        this.stopNestedScroll();
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final boolean enabled = ((View)this).isEnabled();
        int n = 0;
        if (enabled && !this.a() && !this.h && !this.q) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3) {
                            return false;
                        }
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                final int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == this.w) {
                                    if (actionIndex == 0) {
                                        n = 1;
                                    }
                                    this.w = motionEvent.getPointerId(n);
                                }
                            }
                        }
                        else {
                            final int actionIndex2 = motionEvent.getActionIndex();
                            if (actionIndex2 < 0) {
                                Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                return false;
                            }
                            this.w = motionEvent.getPointerId(actionIndex2);
                        }
                    }
                    else {
                        final int pointerIndex = motionEvent.findPointerIndex(this.w);
                        if (pointerIndex < 0) {
                            Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                            return false;
                        }
                        final float y = motionEvent.getY(pointerIndex);
                        this.k(y);
                        if (this.v) {
                            final float n2 = (y - this.t) * 0.5f;
                            if (n2 <= 0.0f) {
                                return false;
                            }
                            ((View)this).getParent().requestDisallowInterceptTouchEvent(true);
                            this.d(n2);
                        }
                    }
                }
                else {
                    final int pointerIndex2 = motionEvent.findPointerIndex(this.w);
                    if (pointerIndex2 < 0) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                        return false;
                    }
                    if (this.v) {
                        final float y2 = motionEvent.getY(pointerIndex2);
                        final float t = this.t;
                        this.v = false;
                        this.c((y2 - t) * 0.5f);
                    }
                    this.w = -1;
                    return false;
                }
            }
            else {
                this.w = motionEvent.getPointerId(0);
                this.v = false;
            }
            return true;
        }
        return false;
    }
    
    public final void requestDisallowInterceptTouchEvent(final boolean b) {
        final View f = this.f;
        if (f != null) {
            final WeakHashMap a = p0.a;
            if (!p0.i.p(f)) {
                if (this.L) {
                    return;
                }
                final ViewParent parent = ((View)this).getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(b);
                }
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(b);
    }
    
    public void setAnimationProgress(final float n) {
        ((View)this.y).setScaleX(n);
        ((View)this.y).setScaleY(n);
    }
    
    @Deprecated
    public void setColorScheme(final int... colorSchemeResources) {
        this.setColorSchemeResources(colorSchemeResources);
    }
    
    public void setColorSchemeColors(final int... i) {
        this.b();
        final d e = this.E;
        final d.a f = e.f;
        f.i = i;
        f.a(0);
        e.f.a(0);
        e.invalidateSelf();
    }
    
    public void setColorSchemeResources(final int... array) {
        final Context context = ((View)this).getContext();
        final int[] colorSchemeColors = new int[array.length];
        for (int i = 0; i < array.length; ++i) {
            colorSchemeColors[i] = n3.a.getColor(context, array[i]);
        }
        this.setColorSchemeColors(colorSchemeColors);
    }
    
    public void setDistanceToTriggerSync(final int n) {
        this.j = (float)n;
    }
    
    public void setEnabled(final boolean enabled) {
        super.setEnabled(enabled);
        if (!enabled) {
            this.f();
        }
    }
    
    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(final boolean l) {
        this.L = l;
    }
    
    public void setNestedScrollingEnabled(final boolean b) {
        this.m.i(b);
    }
    
    public void setOnChildScrollUpCallback(final SwipeRefreshLayout.SwipeRefreshLayout$e swipeRefreshLayout$e) {
    }
    
    public void setOnRefreshListener(final SwipeRefreshLayout.SwipeRefreshLayout$f g) {
        this.g = g;
    }
    
    @Deprecated
    public void setProgressBackgroundColor(final int progressBackgroundColorSchemeResource) {
        this.setProgressBackgroundColorSchemeResource(progressBackgroundColorSchemeResource);
    }
    
    public void setProgressBackgroundColorSchemeColor(final int backgroundColor) {
        this.y.setBackgroundColor(backgroundColor);
    }
    
    public void setProgressBackgroundColorSchemeResource(final int n) {
        this.setProgressBackgroundColorSchemeColor(n3.a.getColor(((View)this).getContext(), n));
    }
    
    public void setRefreshing(final boolean h) {
        if (h && this.h != h) {
            this.h = h;
            this.setTargetOffsetTopAndBottom(this.C + this.B - this.s);
            this.J = false;
            final SwipeRefreshLayout$a m = this.M;
            ((View)this.y).setVisibility(0);
            this.E.setAlpha(255);
            (this.F = new e(this)).setDuration((long)this.r);
            if (m != null) {
                this.y.f = (Animation$AnimationListener)m;
            }
            ((View)this.y).clearAnimation();
            ((View)this.y).startAnimation((Animation)this.F);
        }
        else {
            this.g(h, false);
        }
    }
    
    public void setSize(final int n) {
        if (n != 0 && n != 1) {
            return;
        }
        final DisplayMetrics displayMetrics = ((View)this).getResources().getDisplayMetrics();
        if (n == 0) {
            this.K = (int)(displayMetrics.density * 56.0f);
        }
        else {
            this.K = (int)(displayMetrics.density * 40.0f);
        }
        this.y.setImageDrawable((Drawable)null);
        this.E.c(n);
        this.y.setImageDrawable((Drawable)this.E);
    }
    
    public void setSlingshotDistance(final int d) {
        this.D = d;
    }
    
    public void setTargetOffsetTopAndBottom(final int n) {
        ((View)this.y).bringToFront();
        final a y = this.y;
        final WeakHashMap a = p0.a;
        ((View)y).offsetTopAndBottom(n);
        this.s = ((View)this.y).getTop();
    }
    
    public final boolean startNestedScroll(final int n) {
        return this.m.j(n, 0);
    }
    
    public final void stopNestedScroll() {
        this.m.k(0);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.bottomsheet;

import android.view.AbsSavedState;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import android.view.View$OnAttachStateChangeListener;
import pf.i;
import a4.l0$h;
import a4.b0;
import a4.l0$i;
import pf.h;
import pf.j$b;
import a4.l0$e;
import android.os.Build$VERSION;
import android.view.MotionEvent;
import b4.g;
import b4.c$a;
import a4.l0$d;
import java.util.WeakHashMap;
import android.view.ViewParent;
import a4.l0$g;
import a4.l0;
import android.util.Log;
import android.view.ViewGroup$LayoutParams;
import android.util.TypedValue;
import android.content.res.TypedArray;
import android.view.ViewConfiguration;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import ef.a;
import android.content.res.ColorStateList;
import oy0.b;
import android.util.AttributeSet;
import android.content.Context;
import cg.d;
import i4.c$c;
import i4.c;
import android.animation.ValueAnimator;
import uf.j;
import uf.f;
import java.util.HashMap;
import android.view.VelocityTracker;
import java.util.ArrayList;
import java.lang.ref.WeakReference;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;

public class BottomSheetBehavior<V extends View> extends c<V>
{
    public boolean A;
    public int B;
    public boolean C;
    public int D;
    public int E;
    public int F;
    public WeakReference<V> G;
    public WeakReference<View> H;
    public final ArrayList<BottomSheetBehavior.BottomSheetBehavior$c> I;
    public VelocityTracker J;
    public int K;
    public int L;
    public boolean M;
    public HashMap N;
    public final BottomSheetBehavior$b O;
    public int a;
    public boolean b;
    public float c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public boolean h;
    public f i;
    public int j;
    public boolean k;
    public j l;
    public boolean m;
    public BottomSheetBehavior.BottomSheetBehavior$e n;
    public ValueAnimator o;
    public int p;
    public int q;
    public int r;
    public float s;
    public int t;
    public float u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public i4.c z;
    
    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.n = null;
        this.s = 0.5f;
        this.u = -1.0f;
        this.x = true;
        this.y = 4;
        this.I = new ArrayList<BottomSheetBehavior.BottomSheetBehavior$c>();
        this.O = new c$c(this) {
            public final BottomSheetBehavior a;
            
            public final int a(final View view, final int n) {
                return view.getLeft();
            }
            
            public final int b(final View view, final int n) {
                final int b = this.a.B();
                final BottomSheetBehavior a = this.a;
                int n2;
                if (a.v) {
                    n2 = a.F;
                }
                else {
                    n2 = a.t;
                }
                return cg.d.h1(n, b, n2);
            }
            
            public final int d(final View view) {
                final BottomSheetBehavior a = this.a;
                if (a.v) {
                    return a.F;
                }
                return a.t;
            }
            
            public final void h(final int n) {
                if (n == 1) {
                    final BottomSheetBehavior a = this.a;
                    if (a.x) {
                        a.G(1);
                    }
                }
            }
            
            public final void i(final View view, final int n, final int n2) {
                this.a.y(n2);
            }
            
            public final void j(final View view, final float n, final float n2) {
                int n3 = 4;
                int n4 = 0;
                Label_0540: {
                    Label_0524: {
                        Label_0473: {
                            if (n2 < 0.0f) {
                                final BottomSheetBehavior a = this.a;
                                if (a.b) {
                                    n4 = a.q;
                                }
                                else {
                                    final int top = view.getTop();
                                    final BottomSheetBehavior a2 = this.a;
                                    n4 = a2.r;
                                    if (top > n4) {
                                        break Label_0524;
                                    }
                                    n4 = a2.p;
                                }
                            }
                            else {
                                final BottomSheetBehavior a3 = this.a;
                                if (a3.v && a3.J(view, n2)) {
                                    if (Math.abs(n) >= Math.abs(n2) || n2 <= 500.0f) {
                                        final int top2 = view.getTop();
                                        final BottomSheetBehavior a4 = this.a;
                                        if (top2 <= (a4.B() + a4.F) / 2) {
                                            final BottomSheetBehavior a5 = this.a;
                                            if (a5.b) {
                                                n4 = a5.q;
                                                break Label_0473;
                                            }
                                            if (Math.abs(view.getTop() - this.a.p) < Math.abs(view.getTop() - this.a.r)) {
                                                n4 = this.a.p;
                                                break Label_0473;
                                            }
                                            n4 = this.a.r;
                                            break Label_0524;
                                        }
                                    }
                                    n4 = this.a.F;
                                    n3 = 5;
                                    break Label_0540;
                                }
                                if (n2 != 0.0f && Math.abs(n) <= Math.abs(n2)) {
                                    final BottomSheetBehavior a6 = this.a;
                                    if (a6.b) {
                                        n4 = a6.t;
                                        break Label_0540;
                                    }
                                    final int top3 = view.getTop();
                                    if (Math.abs(top3 - this.a.r) < Math.abs(top3 - this.a.t)) {
                                        n4 = this.a.r;
                                        break Label_0524;
                                    }
                                    n4 = this.a.t;
                                    break Label_0540;
                                }
                                else {
                                    final int top4 = view.getTop();
                                    final BottomSheetBehavior a7 = this.a;
                                    if (a7.b) {
                                        if (Math.abs(top4 - a7.q) >= Math.abs(top4 - this.a.t)) {
                                            n4 = this.a.t;
                                            break Label_0540;
                                        }
                                        n4 = this.a.q;
                                    }
                                    else {
                                        final int r = a7.r;
                                        if (top4 < r) {
                                            if (top4 >= Math.abs(top4 - a7.t)) {
                                                n4 = this.a.r;
                                                break Label_0524;
                                            }
                                            n4 = this.a.p;
                                        }
                                        else {
                                            if (Math.abs(top4 - r) < Math.abs(top4 - this.a.t)) {
                                                n4 = this.a.r;
                                                break Label_0524;
                                            }
                                            n4 = this.a.t;
                                            break Label_0540;
                                        }
                                    }
                                }
                            }
                        }
                        n3 = 3;
                        break Label_0540;
                    }
                    n3 = 6;
                }
                this.a.K(view, n3, n4, true);
            }
            
            public final boolean k(final int n, final View view) {
                final BottomSheetBehavior a = this.a;
                final int y = a.y;
                boolean b = true;
                if (y == 1) {
                    return false;
                }
                if (a.M) {
                    return false;
                }
                if (y == 3 && a.K == n) {
                    final WeakReference<View> h = a.H;
                    View view2;
                    if (h != null) {
                        view2 = h.get();
                    }
                    else {
                        view2 = null;
                    }
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                final WeakReference<V> g = this.a.G;
                if (g == null || g.get() != view) {
                    b = false;
                }
                return b;
            }
        };
    }
    
    public BottomSheetBehavior(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = 0;
        this.b = true;
        this.n = null;
        this.s = 0.5f;
        this.u = -1.0f;
        this.x = true;
        this.y = 4;
        this.I = new ArrayList<BottomSheetBehavior.BottomSheetBehavior$c>();
        this.O = new c$c(this) {
            public final BottomSheetBehavior a;
            
            public final int a(final View view, final int n) {
                return view.getLeft();
            }
            
            public final int b(final View view, final int n) {
                final int b = this.a.B();
                final BottomSheetBehavior a = this.a;
                int n2;
                if (a.v) {
                    n2 = a.F;
                }
                else {
                    n2 = a.t;
                }
                return cg.d.h1(n, b, n2);
            }
            
            public final int d(final View view) {
                final BottomSheetBehavior a = this.a;
                if (a.v) {
                    return a.F;
                }
                return a.t;
            }
            
            public final void h(final int n) {
                if (n == 1) {
                    final BottomSheetBehavior a = this.a;
                    if (a.x) {
                        a.G(1);
                    }
                }
            }
            
            public final void i(final View view, final int n, final int n2) {
                this.a.y(n2);
            }
            
            public final void j(final View view, final float n, final float n2) {
                int n3 = 4;
                int n4 = 0;
                Label_0540: {
                    Label_0524: {
                        Label_0473: {
                            if (n2 < 0.0f) {
                                final BottomSheetBehavior a = this.a;
                                if (a.b) {
                                    n4 = a.q;
                                }
                                else {
                                    final int top = view.getTop();
                                    final BottomSheetBehavior a2 = this.a;
                                    n4 = a2.r;
                                    if (top > n4) {
                                        break Label_0524;
                                    }
                                    n4 = a2.p;
                                }
                            }
                            else {
                                final BottomSheetBehavior a3 = this.a;
                                if (a3.v && a3.J(view, n2)) {
                                    if (Math.abs(n) >= Math.abs(n2) || n2 <= 500.0f) {
                                        final int top2 = view.getTop();
                                        final BottomSheetBehavior a4 = this.a;
                                        if (top2 <= (a4.B() + a4.F) / 2) {
                                            final BottomSheetBehavior a5 = this.a;
                                            if (a5.b) {
                                                n4 = a5.q;
                                                break Label_0473;
                                            }
                                            if (Math.abs(view.getTop() - this.a.p) < Math.abs(view.getTop() - this.a.r)) {
                                                n4 = this.a.p;
                                                break Label_0473;
                                            }
                                            n4 = this.a.r;
                                            break Label_0524;
                                        }
                                    }
                                    n4 = this.a.F;
                                    n3 = 5;
                                    break Label_0540;
                                }
                                if (n2 != 0.0f && Math.abs(n) <= Math.abs(n2)) {
                                    final BottomSheetBehavior a6 = this.a;
                                    if (a6.b) {
                                        n4 = a6.t;
                                        break Label_0540;
                                    }
                                    final int top3 = view.getTop();
                                    if (Math.abs(top3 - this.a.r) < Math.abs(top3 - this.a.t)) {
                                        n4 = this.a.r;
                                        break Label_0524;
                                    }
                                    n4 = this.a.t;
                                    break Label_0540;
                                }
                                else {
                                    final int top4 = view.getTop();
                                    final BottomSheetBehavior a7 = this.a;
                                    if (a7.b) {
                                        if (Math.abs(top4 - a7.q) >= Math.abs(top4 - this.a.t)) {
                                            n4 = this.a.t;
                                            break Label_0540;
                                        }
                                        n4 = this.a.q;
                                    }
                                    else {
                                        final int r = a7.r;
                                        if (top4 < r) {
                                            if (top4 >= Math.abs(top4 - a7.t)) {
                                                n4 = this.a.r;
                                                break Label_0524;
                                            }
                                            n4 = this.a.p;
                                        }
                                        else {
                                            if (Math.abs(top4 - r) < Math.abs(top4 - this.a.t)) {
                                                n4 = this.a.r;
                                                break Label_0524;
                                            }
                                            n4 = this.a.t;
                                            break Label_0540;
                                        }
                                    }
                                }
                            }
                        }
                        n3 = 3;
                        break Label_0540;
                    }
                    n3 = 6;
                }
                this.a.K(view, n3, n4, true);
            }
            
            public final boolean k(final int n, final View view) {
                final BottomSheetBehavior a = this.a;
                final int y = a.y;
                boolean b = true;
                if (y == 1) {
                    return false;
                }
                if (a.M) {
                    return false;
                }
                if (y == 3 && a.K == n) {
                    final WeakReference<View> h = a.H;
                    View view2;
                    if (h != null) {
                        view2 = h.get();
                    }
                    else {
                        view2 = null;
                    }
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                final WeakReference<V> g = this.a.G;
                if (g == null || g.get() != view) {
                    b = false;
                }
                return b;
            }
        };
        this.g = context.getResources().getDimensionPixelSize(2131166271);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, oy0.b.z);
        this.h = obtainStyledAttributes.hasValue(11);
        final boolean hasValue = obtainStyledAttributes.hasValue(1);
        if (hasValue) {
            this.x(context, set, hasValue, rf.c.a(context, obtainStyledAttributes, 1));
        }
        else {
            this.x(context, set, hasValue, null);
        }
        (this.o = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f })).setDuration(500L);
        this.o.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new a(this));
        this.u = obtainStyledAttributes.getDimension(0, -1.0f);
        final TypedValue peekValue = obtainStyledAttributes.peekValue(7);
        Label_0240: {
            if (peekValue != null) {
                final int data = peekValue.data;
                if (data == -1) {
                    this.E(data);
                    break Label_0240;
                }
            }
            this.E(obtainStyledAttributes.getDimensionPixelSize(7, -1));
        }
        this.D(obtainStyledAttributes.getBoolean(6, false));
        this.k = obtainStyledAttributes.getBoolean(10, false);
        final boolean boolean1 = obtainStyledAttributes.getBoolean(4, true);
        if (this.b != boolean1) {
            this.b = boolean1;
            if (this.G != null) {
                this.v();
            }
            int y;
            if (this.b && this.y == 6) {
                y = 3;
            }
            else {
                y = this.y;
            }
            this.G(y);
            this.L();
        }
        this.w = obtainStyledAttributes.getBoolean(9, false);
        this.x = obtainStyledAttributes.getBoolean(2, true);
        this.a = obtainStyledAttributes.getInt(8, 0);
        final float float1 = obtainStyledAttributes.getFloat(5, 0.5f);
        if (float1 > 0.0f && float1 < 1.0f) {
            this.s = float1;
            if (this.G != null) {
                this.r = (int)((1.0f - float1) * this.F);
            }
            final TypedValue peekValue2 = obtainStyledAttributes.peekValue(3);
            if (peekValue2 != null && peekValue2.type == 16) {
                final int data2 = peekValue2.data;
                if (data2 < 0) {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
                this.p = data2;
            }
            else {
                final int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
                if (dimensionPixelOffset < 0) {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
                this.p = dimensionPixelOffset;
            }
            obtainStyledAttributes.recycle();
            this.c = (float)ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
    
    public static <V extends View> BottomSheetBehavior<V> A(final V v) {
        final ViewGroup$LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        final c a = ((CoordinatorLayout.f)layoutParams).a;
        if (a instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior<V>)a;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }
    
    public final int B() {
        int n;
        if (this.b) {
            n = this.q;
        }
        else {
            n = this.p;
        }
        return n;
    }
    
    @Deprecated
    public final void C(final BottomSheetBehavior.BottomSheetBehavior$c bottomSheetBehavior$c) {
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.I.clear();
        this.I.add(bottomSheetBehavior$c);
    }
    
    public final void D(final boolean v) {
        if (this.v != v) {
            this.v = v;
            if (!v && this.y == 5) {
                this.F(4);
            }
            this.L();
        }
    }
    
    public final void E(int n) {
        final int n2 = 1;
        Label_0063: {
            if (n == -1) {
                if (!this.e) {
                    this.e = true;
                    n = n2;
                    break Label_0063;
                }
            }
            else if (this.e || this.d != n) {
                this.e = false;
                this.d = Math.max(0, n);
                n = n2;
                break Label_0063;
            }
            n = 0;
        }
        if (n != 0) {
            this.O();
        }
    }
    
    public final void F(final int y) {
        if (y == this.y) {
            return;
        }
        if (this.G == null) {
            if (y == 4 || y == 3 || y == 6 || (this.v && y == 5)) {
                this.y = y;
            }
            return;
        }
        this.I(y);
    }
    
    public final void G(final int y) {
        if (this.y == y) {
            return;
        }
        this.y = y;
        final WeakReference<V> g = this.G;
        if (g == null) {
            return;
        }
        final View view = g.get();
        if (view == null) {
            return;
        }
        int i = 0;
        if (y == 3) {
            this.N(true);
        }
        else if (y == 6 || y == 5 || y == 4) {
            this.N(false);
        }
        this.M(y);
        while (i < this.I.size()) {
            this.I.get(i).onStateChanged(view, y);
            ++i;
        }
        this.L();
    }
    
    public final void H(int n, final View view) {
        int n2 = 0;
        Label_0084: {
            if (n == 4) {
                n2 = this.t;
            }
            else if (n == 6) {
                final int r = this.r;
                if (this.b) {
                    n2 = this.q;
                    if (r <= n2) {
                        n = 3;
                        break Label_0084;
                    }
                }
                n2 = r;
            }
            else if (n == 3) {
                n2 = this.B();
            }
            else {
                if (!this.v || n != 5) {
                    throw new IllegalArgumentException(d.h("Illegal state argument: ", n));
                }
                n2 = this.F;
            }
        }
        this.K(view, n, n2, false);
    }
    
    public final void I(final int n) {
        final View view = this.G.get();
        if (view == null) {
            return;
        }
        final ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            final WeakHashMap a = l0.a;
            if (l0$g.b(view)) {
                view.post((Runnable)new BottomSheetBehavior$a(this, view, n));
                return;
            }
        }
        this.H(n, view);
    }
    
    public final boolean J(final View view, final float n) {
        final boolean w = this.w;
        boolean b = true;
        if (w) {
            return true;
        }
        if (view.getTop() < this.t) {
            return false;
        }
        if (Math.abs(n * 0.1f + view.getTop() - this.t) / this.w() <= 0.5f) {
            b = false;
        }
        return b;
    }
    
    public final void K(final View view, final int n, int n2, final boolean b) {
        final i4.c z = this.z;
        if (z != null && (b ? z.q(view.getLeft(), n2) : z.s(view, view.getLeft(), n2))) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (n2 != 0) {
            this.G(2);
            this.M(n);
            if (this.n == null) {
                this.n = new BottomSheetBehavior.BottomSheetBehavior$e(this, view, n);
            }
            final BottomSheetBehavior.BottomSheetBehavior$e n3 = this.n;
            if (!n3.g) {
                n3.h = n;
                final WeakHashMap a = l0.a;
                l0$d.m(view, (Runnable)n3);
                this.n.g = true;
            }
            else {
                n3.h = n;
            }
        }
        else {
            this.G(n);
        }
    }
    
    public final void L() {
        final WeakReference<V> g = this.G;
        if (g == null) {
            return;
        }
        final View view = g.get();
        if (view == null) {
            return;
        }
        l0.i(524288, view);
        l0.f(0, view);
        l0.i(262144, view);
        l0.f(0, view);
        l0.i(1048576, view);
        l0.f(0, view);
        if (this.v && this.y != 5) {
            l0.j(view, c$a.n, (g)new ef.c(this, 5));
        }
        final int y = this.y;
        int n = 6;
        if (y != 3) {
            if (y != 4) {
                if (y == 6) {
                    l0.j(view, c$a.m, (g)new ef.c(this, 4));
                    l0.j(view, c$a.l, (g)new ef.c(this, 3));
                }
            }
            else {
                if (this.b) {
                    n = 3;
                }
                l0.j(view, c$a.l, (g)new ef.c(this, n));
            }
        }
        else {
            if (this.b) {
                n = 4;
            }
            l0.j(view, c$a.m, (g)new ef.c(this, n));
        }
    }
    
    public final void M(final int n) {
        if (n == 2) {
            return;
        }
        final boolean m = n == 3;
        if (this.m != m) {
            this.m = m;
            if (this.i != null) {
                final ValueAnimator o = this.o;
                if (o != null) {
                    if (o.isRunning()) {
                        this.o.reverse();
                    }
                    else {
                        float n2;
                        if (m) {
                            n2 = 0.0f;
                        }
                        else {
                            n2 = 1.0f;
                        }
                        this.o.setFloatValues(new float[] { 1.0f - n2, n2 });
                        this.o.start();
                    }
                }
            }
        }
    }
    
    public final void N(final boolean b) {
        final WeakReference<V> g = this.G;
        if (g == null) {
            return;
        }
        final ViewParent parent = g.get().getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        final CoordinatorLayout coordinatorLayout = (CoordinatorLayout)parent;
        final int childCount = ((ViewGroup)coordinatorLayout).getChildCount();
        if (b) {
            if (this.N != null) {
                return;
            }
            this.N = new HashMap(childCount);
        }
        for (int i = 0; i < childCount; ++i) {
            final View child = ((ViewGroup)coordinatorLayout).getChildAt(i);
            if (child != this.G.get()) {
                if (b) {
                    this.N.put(child, child.getImportantForAccessibility());
                }
            }
        }
        if (!b) {
            this.N = null;
        }
    }
    
    public final void O() {
        if (this.G != null) {
            this.v();
            if (this.y == 4) {
                final View view = this.G.get();
                if (view != null) {
                    view.requestLayout();
                }
            }
        }
    }
    
    @Override
    public final void c(final CoordinatorLayout.f f) {
        this.G = null;
        this.z = null;
    }
    
    @Override
    public final void f() {
        this.G = null;
        this.z = null;
    }
    
    @Override
    public final boolean g(final CoordinatorLayout coordinatorLayout, final V v, final MotionEvent motionEvent) {
        final boolean shown = v.isShown();
        final boolean b = false;
        if (shown && this.x) {
            final int actionMasked = motionEvent.getActionMasked();
            final View view = null;
            if (actionMasked == 0) {
                this.K = -1;
                final VelocityTracker j = this.J;
                if (j != null) {
                    j.recycle();
                    this.J = null;
                }
            }
            if (this.J == null) {
                this.J = VelocityTracker.obtain();
            }
            this.J.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.M = false;
                    this.K = -1;
                    if (this.A) {
                        return this.A = false;
                    }
                }
            }
            else {
                final int n = (int)motionEvent.getX();
                this.L = (int)motionEvent.getY();
                if (this.y != 2) {
                    final WeakReference<View> h = this.H;
                    View view2;
                    if (h != null) {
                        view2 = h.get();
                    }
                    else {
                        view2 = null;
                    }
                    if (view2 != null && coordinatorLayout.p(view2, n, this.L)) {
                        this.K = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.M = true;
                    }
                }
                this.A = (this.K == -1 && !coordinatorLayout.p((View)v, n, this.L));
            }
            if (!this.A) {
                final i4.c z = this.z;
                if (z != null && z.r(motionEvent)) {
                    return true;
                }
            }
            final WeakReference<View> h2 = this.H;
            View view3 = view;
            if (h2 != null) {
                view3 = h2.get();
            }
            boolean b2 = b;
            if (actionMasked == 2) {
                b2 = b;
                if (view3 != null) {
                    b2 = b;
                    if (!this.A) {
                        b2 = b;
                        if (this.y != 1) {
                            b2 = b;
                            if (!coordinatorLayout.p(view3, (int)motionEvent.getX(), (int)motionEvent.getY())) {
                                b2 = b;
                                if (this.z != null) {
                                    b2 = b;
                                    if (Math.abs(this.L - motionEvent.getY()) > this.z.b) {
                                        b2 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return b2;
        }
        this.A = true;
        return false;
    }
    
    @Override
    public final boolean h(final CoordinatorLayout coordinatorLayout, final V v, int d) {
        final WeakHashMap a = l0.a;
        if (l0$d.b((View)coordinatorLayout) && !l0$d.b((View)v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.G == null) {
            this.f = ((View)coordinatorLayout).getResources().getDimensionPixelSize(2131165619);
            if (Build$VERSION.SDK_INT >= 29 && !this.k && !this.e) {
                l0$i.u((View)v, (b0)new h(new ef.b(this), new j$b(l0$e.f((View)v), v.getPaddingTop(), l0$e.e((View)v), v.getPaddingBottom())));
                if (l0$g.b((View)v)) {
                    l0$h.c((View)v);
                }
                else {
                    v.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new i());
                }
            }
            this.G = new WeakReference<V>(v);
            if (this.h) {
                final f i = this.i;
                if (i != null) {
                    l0$d.q((View)v, (Drawable)i);
                }
            }
            final f j = this.i;
            if (j != null) {
                float n;
                if ((n = this.u) == -1.0f) {
                    n = l0$i.i((View)v);
                }
                j.k(n);
                final boolean m = this.y == 3;
                this.m = m;
                final f k = this.i;
                float n2;
                if (m) {
                    n2 = 0.0f;
                }
                else {
                    n2 = 1.0f;
                }
                k.m(n2);
            }
            this.L();
            if (l0$d.c((View)v) == 0) {
                l0$d.s((View)v, 1);
            }
        }
        if (this.z == null) {
            this.z = new i4.c(((View)coordinatorLayout).getContext(), (ViewGroup)coordinatorLayout, (c$c)this.O);
        }
        final int top = v.getTop();
        coordinatorLayout.r(d, (View)v);
        this.E = ((View)coordinatorLayout).getWidth();
        this.F = ((View)coordinatorLayout).getHeight();
        d = v.getHeight();
        this.D = d;
        this.q = Math.max(0, this.F - d);
        this.r = (int)((1.0f - this.s) * this.F);
        this.v();
        d = this.y;
        if (d == 3) {
            v.offsetTopAndBottom(this.B());
        }
        else if (d == 6) {
            v.offsetTopAndBottom(this.r);
        }
        else if (this.v && d == 5) {
            v.offsetTopAndBottom(this.F);
        }
        else if (d == 4) {
            v.offsetTopAndBottom(this.t);
        }
        else if (d == 1 || d == 2) {
            v.offsetTopAndBottom(top - v.getTop());
        }
        this.H = new WeakReference<View>(this.z(v));
        return true;
    }
    
    @Override
    public final boolean j(final CoordinatorLayout coordinatorLayout, final View view, final View view2) {
        final WeakReference<View> h = this.H;
        return h != null && view2 == h.get() && this.y != 3;
    }
    
    @Override
    public final void k(final CoordinatorLayout coordinatorLayout, final V v, final View view, int t, final int b, final int[] array, int top) {
        if (top == 1) {
            return;
        }
        final WeakReference<View> h = this.H;
        View view2;
        if (h != null) {
            view2 = h.get();
        }
        else {
            view2 = null;
        }
        if (view != view2) {
            return;
        }
        top = v.getTop();
        final int n = top - b;
        if (b > 0) {
            if (n < this.B()) {
                t = top - this.B();
                array[1] = t;
                t = -t;
                final WeakHashMap a = l0.a;
                v.offsetTopAndBottom(t);
                this.G(3);
            }
            else {
                if (!this.x) {
                    return;
                }
                array[1] = b;
                t = -b;
                final WeakHashMap a2 = l0.a;
                v.offsetTopAndBottom(t);
                this.G(1);
            }
        }
        else if (b < 0 && !view.canScrollVertically(-1)) {
            t = this.t;
            if (n > t && !this.v) {
                t = top - t;
                array[1] = t;
                t = -t;
                final WeakHashMap a3 = l0.a;
                v.offsetTopAndBottom(t);
                this.G(4);
            }
            else {
                if (!this.x) {
                    return;
                }
                array[1] = b;
                t = -b;
                final WeakHashMap a4 = l0.a;
                v.offsetTopAndBottom(t);
                this.G(1);
            }
        }
        this.y(v.getTop());
        this.B = b;
        this.C = true;
    }
    
    @Override
    public final void m(final CoordinatorLayout coordinatorLayout, final View view, final int n, final int n2, final int n3, final int[] array) {
    }
    
    @Override
    public final void o(final CoordinatorLayout coordinatorLayout, final V v, final Parcelable parcelable) {
        final d d = (d)parcelable;
        final int a = this.a;
        if (a != 0) {
            if (a == -1 || (a & 0x1) == 0x1) {
                this.d = d.i;
            }
            if (a == -1 || (a & 0x2) == 0x2) {
                this.b = d.j;
            }
            if (a == -1 || (a & 0x4) == 0x4) {
                this.v = d.k;
            }
            if (a == -1 || (a & 0x8) == 0x8) {
                this.w = d.l;
            }
        }
        final int h = d.h;
        if (h != 1 && h != 2) {
            this.y = h;
        }
        else {
            this.y = 4;
        }
    }
    
    @Override
    public final Parcelable p(final View view, final CoordinatorLayout coordinatorLayout) {
        return (Parcelable)new d(View$BaseSavedState.EMPTY_STATE, this);
    }
    
    @Override
    public final boolean r(final CoordinatorLayout coordinatorLayout, final V v, final View view, final View view2, final int n, final int n2) {
        boolean b = false;
        this.B = 0;
        this.C = false;
        if ((n & 0x2) != 0x0) {
            b = true;
        }
        return b;
    }
    
    @Override
    public final void t(final CoordinatorLayout coordinatorLayout, final V v, final View view, int n) {
        final int top = v.getTop();
        n = this.B();
        int n2 = 3;
        if (top == n) {
            this.G(3);
            return;
        }
        final WeakReference<View> h = this.H;
        if (h != null && view == h.get()) {
            if (this.C) {
                Label_0390: {
                    Label_0374: {
                        if (this.B <= 0) {
                            if (this.v) {
                                final VelocityTracker j = this.J;
                                float yVelocity;
                                if (j == null) {
                                    yVelocity = 0.0f;
                                }
                                else {
                                    j.computeCurrentVelocity(1000, this.c);
                                    yVelocity = this.J.getYVelocity(this.K);
                                }
                                if (this.J(v, yVelocity)) {
                                    n = this.F;
                                    n2 = 5;
                                    break Label_0390;
                                }
                            }
                            if (this.B == 0) {
                                final int top2 = v.getTop();
                                if (this.b) {
                                    if (Math.abs(top2 - this.q) < Math.abs(top2 - this.t)) {
                                        n = this.q;
                                        break Label_0390;
                                    }
                                    n = this.t;
                                }
                                else {
                                    n = this.r;
                                    if (top2 < n) {
                                        if (top2 < Math.abs(top2 - this.t)) {
                                            n = this.p;
                                            break Label_0390;
                                        }
                                        n = this.r;
                                        break Label_0374;
                                    }
                                    else {
                                        if (Math.abs(top2 - n) < Math.abs(top2 - this.t)) {
                                            n = this.r;
                                            break Label_0374;
                                        }
                                        n = this.t;
                                    }
                                }
                            }
                            else if (this.b) {
                                n = this.t;
                            }
                            else {
                                n = v.getTop();
                                if (Math.abs(n - this.r) < Math.abs(n - this.t)) {
                                    n = this.r;
                                    break Label_0374;
                                }
                                n = this.t;
                            }
                            n2 = 4;
                            break Label_0390;
                        }
                        if (this.b) {
                            n = this.q;
                            break Label_0390;
                        }
                        final int top3 = v.getTop();
                        n = this.r;
                        if (top3 <= n) {
                            n = this.p;
                            break Label_0390;
                        }
                    }
                    n2 = 6;
                }
                this.K(v, n2, n, false);
                this.C = false;
            }
        }
    }
    
    @Override
    public final boolean u(final CoordinatorLayout coordinatorLayout, final V v, final MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        final int actionMasked = motionEvent.getActionMasked();
        if (this.y == 1 && actionMasked == 0) {
            return true;
        }
        final i4.c z = this.z;
        if (z != null) {
            z.k(motionEvent);
        }
        if (actionMasked == 0) {
            this.K = -1;
            final VelocityTracker j = this.J;
            if (j != null) {
                j.recycle();
                this.J = null;
            }
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        if (this.z != null && actionMasked == 2 && !this.A) {
            final float abs = Math.abs(this.L - motionEvent.getY());
            final i4.c z2 = this.z;
            if (abs > z2.b) {
                z2.b(motionEvent.getPointerId(motionEvent.getActionIndex()), (View)v);
            }
        }
        return this.A ^ true;
    }
    
    public final void v() {
        final int w = this.w();
        if (this.b) {
            this.t = Math.max(this.F - w, this.q);
        }
        else {
            this.t = this.F - w;
        }
    }
    
    public final int w() {
        if (this.e) {
            return Math.min(Math.max(this.f, this.F - this.E * 9 / 16), this.D);
        }
        if (!this.k) {
            final int j = this.j;
            if (j > 0) {
                return Math.max(this.d, j + this.g);
            }
        }
        return this.d;
    }
    
    public final void x(final Context context, final AttributeSet set, final boolean b, final ColorStateList list) {
        if (this.h) {
            final uf.a a = new uf.a((float)0);
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, b.S, 2130968716, 2132018070);
            final int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            final int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            obtainStyledAttributes.recycle();
            this.l = new j(uf.j.a(context, resourceId, resourceId2, (uf.c)a));
            (this.i = new f(this.l)).i(context);
            if (b && list != null) {
                this.i.l(list);
            }
            else {
                final TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
    }
    
    public final void y(int i) {
        final View view = this.G.get();
        if (view != null && !this.I.isEmpty()) {
            final int t = this.t;
            float n;
            float n2;
            if (i <= t && t != this.B()) {
                final int t2 = this.t;
                n = (float)(t2 - i);
                n2 = (float)(t2 - this.B());
            }
            else {
                final int t3 = this.t;
                n = (float)(t3 - i);
                n2 = (float)(this.F - t3);
            }
            final float n3 = n / n2;
            for (i = 0; i < this.I.size(); ++i) {
                this.I.get(i).onSlide(view, n3);
            }
        }
    }
    
    public final View z(final View view) {
        final WeakHashMap a = l0.a;
        if (l0$i.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            for (int i = 0; i < viewGroup.getChildCount(); ++i) {
                final View z = this.z(viewGroup.getChildAt(i));
                if (z != null) {
                    return z;
                }
            }
        }
        return null;
    }
    
    public static final class d extends h4.a
    {
        public static final Parcelable$Creator<d> CREATOR;
        public final int h;
        public int i;
        public boolean j;
        public boolean k;
        public boolean l;
        
        static {
            CREATOR = (Parcelable$Creator)new BottomSheetBehavior$d$a();
        }
        
        public d(final Parcel parcel, final ClassLoader classLoader) {
            super(parcel, classLoader);
            this.h = parcel.readInt();
            this.i = parcel.readInt();
            final int int1 = parcel.readInt();
            final boolean b = false;
            this.j = (int1 == 1);
            this.k = (parcel.readInt() == 1);
            boolean l = b;
            if (parcel.readInt() == 1) {
                l = true;
            }
            this.l = l;
        }
        
        public d(final AbsSavedState absSavedState, final BottomSheetBehavior bottomSheetBehavior) {
            super((Parcelable)absSavedState);
            this.h = bottomSheetBehavior.y;
            this.i = bottomSheetBehavior.d;
            this.j = bottomSheetBehavior.b;
            this.k = bottomSheetBehavior.v;
            this.l = bottomSheetBehavior.w;
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeParcelable(super.f, n);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt((int)(this.j ? 1 : 0));
            parcel.writeInt((int)(this.k ? 1 : 0));
            parcel.writeInt((int)(this.l ? 1 : 0));
        }
    }
}

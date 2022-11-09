// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import android.view.animation.Interpolator;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.util.DisplayMetrics;
import android.content.Context;
import android.view.View;

public class g0 extends k0
{
    public e0 d;
    public d0 e;
    
    public final int[] c(final RecyclerView.o o, final View view) {
        final int[] array = new int[2];
        if (o.canScrollHorizontally()) {
            array[0] = this.h(view, this.j(o));
        }
        else {
            array[0] = 0;
        }
        if (o.canScrollVertically()) {
            array[1] = this.h(view, this.k(o));
        }
        else {
            array[1] = 0;
        }
        return array;
    }
    
    public final RecyclerView.a0 d(final RecyclerView.o o) {
        if (!(o instanceof RecyclerView.a0.b)) {
            return null;
        }
        return (RecyclerView.a0)new x(((View)super.a).getContext()) {
            public final float calculateSpeedPerPixel(final DisplayMetrics displayMetrics) {
                return 100.0f / displayMetrics.densityDpi;
            }
            
            public final int calculateTimeForScrolling(final int n) {
                return Math.min(100, super.calculateTimeForScrolling(n));
            }
            
            public final void onTargetFound(final View view, final RecyclerView.b0 b0, final RecyclerView.a0.a a) {
                final g0 d = g0.this;
                final int[] c = d.c(d.a.getLayoutManager(), view);
                final int a2 = c[0];
                final int b2 = c[1];
                final int calculateTimeForDeceleration = this.calculateTimeForDeceleration(Math.max(Math.abs(a2), Math.abs(b2)));
                if (calculateTimeForDeceleration > 0) {
                    final DecelerateInterpolator mDecelerateInterpolator = super.mDecelerateInterpolator;
                    a.a = a2;
                    a.b = b2;
                    a.c = calculateTimeForDeceleration;
                    a.e = (Interpolator)mDecelerateInterpolator;
                    a.f = true;
                }
            }
        };
    }
    
    public View e(final RecyclerView.o o) {
        if (o.canScrollVertically()) {
            return this.i(o, this.k(o));
        }
        if (o.canScrollHorizontally()) {
            return this.i(o, this.j(o));
        }
        return null;
    }
    
    public int f(final RecyclerView.o o, int n, int n2) {
        final int itemCount = o.getItemCount();
        if (itemCount == 0) {
            return -1;
        }
        final boolean canScrollVertically = o.canScrollVertically();
        View view = null;
        f0 f0;
        if (canScrollVertically) {
            f0 = this.k(o);
        }
        else if (o.canScrollHorizontally()) {
            f0 = this.j(o);
        }
        else {
            f0 = null;
        }
        if (f0 == null) {
            return -1;
        }
        final int childCount = o.getChildCount();
        final int n3 = 0;
        int n4 = Integer.MAX_VALUE;
        int i = 0;
        int n5 = Integer.MIN_VALUE;
        View view2 = null;
        while (i < childCount) {
            final View child = o.getChildAt(i);
            View view3;
            int n6;
            if (child == null) {
                view3 = view;
                n6 = n4;
            }
            else {
                final int h = this.h(child, f0);
                View view4 = view2;
                int n7 = n5;
                if (h <= 0) {
                    view4 = view2;
                    if (h > (n7 = n5)) {
                        view4 = child;
                        n7 = h;
                    }
                }
                view3 = view;
                view2 = view4;
                n5 = n7;
                n6 = n4;
                if (h >= 0) {
                    view3 = view;
                    view2 = view4;
                    n5 = n7;
                    if (h < (n6 = n4)) {
                        n6 = h;
                        n5 = n7;
                        view2 = view4;
                        view3 = child;
                    }
                }
            }
            ++i;
            view = view3;
            n4 = n6;
        }
        final boolean canScrollHorizontally = o.canScrollHorizontally();
        int n8 = 1;
        n = ((canScrollHorizontally ? (n > 0) : (n2 > 0)) ? 1 : 0);
        if (n != 0 && view != null) {
            return o.getPosition(view);
        }
        if (n == 0 && view2 != null) {
            return o.getPosition(view2);
        }
        if (n != 0) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        final int position = o.getPosition(view);
        final int itemCount2 = o.getItemCount();
        n2 = n3;
        Label_0385: {
            if (o instanceof RecyclerView.a0.b) {
                final PointF computeScrollVectorForPosition = ((RecyclerView.a0.b)o).computeScrollVectorForPosition(itemCount2 - 1);
                n2 = n3;
                if (computeScrollVectorForPosition != null) {
                    if (computeScrollVectorForPosition.x >= 0.0f) {
                        n2 = n3;
                        if (computeScrollVectorForPosition.y >= 0.0f) {
                            break Label_0385;
                        }
                    }
                    n2 = 1;
                }
            }
        }
        if (n2 == n) {
            n8 = -1;
        }
        n = position + n8;
        if (n >= 0 && n < itemCount) {
            return n;
        }
        return -1;
    }
    
    public final int h(final View view, final f0 f0) {
        return f0.c(view) / 2 + f0.e(view) - (f0.l() / 2 + f0.k());
    }
    
    public final View i(final RecyclerView.o o, final f0 f0) {
        final int childCount = o.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        final int k = f0.k();
        final int n = f0.l() / 2;
        int n2 = Integer.MAX_VALUE;
        int n3;
        for (int i = 0; i < childCount; ++i, n2 = n3) {
            final View child = o.getChildAt(i);
            final int abs = Math.abs(f0.c(child) / 2 + f0.e(child) - (n + k));
            if (abs < (n3 = n2)) {
                view = child;
                n3 = abs;
            }
        }
        return view;
    }
    
    public final f0 j(final RecyclerView.o o) {
        final d0 e = this.e;
        if (e == null || ((f0)e).a != o) {
            this.e = new d0(o);
        }
        return (f0)this.e;
    }
    
    public final f0 k(final RecyclerView.o o) {
        final e0 d = this.d;
        if (d == null || ((f0)d).a != o) {
            this.d = new e0(o);
        }
        return (f0)this.d;
    }
}

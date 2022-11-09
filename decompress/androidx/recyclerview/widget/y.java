// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;

public class y extends k0
{
    public e0 d;
    public d0 e;
    
    public int[] c(final RecyclerView.o o, final View view) {
        final int[] array = new int[2];
        if (o.canScrollHorizontally()) {
            final f0 j = this.j(o);
            array[0] = j.c(view) / 2 + j.e(view) - (j.l() / 2 + j.k());
        }
        else {
            array[0] = 0;
        }
        if (o.canScrollVertically()) {
            final f0 k = this.k(o);
            array[1] = k.c(view) / 2 + k.e(view) - (k.l() / 2 + k.k());
        }
        else {
            array[1] = 0;
        }
        return array;
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
    
    public final int f(final RecyclerView.o o, int h, int h2) {
        if (!(o instanceof RecyclerView.a0.b)) {
            return -1;
        }
        final int itemCount = o.getItemCount();
        if (itemCount == 0) {
            return -1;
        }
        final View e = this.e(o);
        if (e == null) {
            return -1;
        }
        final int position = o.getPosition(e);
        if (position == -1) {
            return -1;
        }
        final RecyclerView.a0.b b = (RecyclerView.a0.b)o;
        final int n = itemCount - 1;
        final PointF computeScrollVectorForPosition = b.computeScrollVectorForPosition(n);
        if (computeScrollVectorForPosition == null) {
            return -1;
        }
        final boolean canScrollHorizontally = o.canScrollHorizontally();
        final int n2 = 0;
        if (canScrollHorizontally) {
            final int n3 = h = this.h(o, this.j(o), h, 0);
            if (computeScrollVectorForPosition.x < 0.0f) {
                h = -n3;
            }
        }
        else {
            h = 0;
        }
        if (o.canScrollVertically()) {
            final int n4 = h2 = this.h(o, this.k(o), 0, h2);
            if (computeScrollVectorForPosition.y < 0.0f) {
                h2 = -n4;
            }
        }
        else {
            h2 = 0;
        }
        if (o.canScrollVertically()) {
            h = h2;
        }
        if (h == 0) {
            return -1;
        }
        h += position;
        if (h < 0) {
            h = n2;
        }
        if (h >= itemCount) {
            h = n;
        }
        return h;
    }
    
    public final int h(final RecyclerView.o o, final f0 f0, int n, int min) {
        final int[] array = new int[2];
        super.b.fling(0, 0, n, min, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        array[0] = super.b.getFinalX();
        array[1] = super.b.getFinalY();
        final int childCount = o.getChildCount();
        final float n2 = 1.0f;
        float n3;
        if (childCount == 0) {
            n3 = n2;
        }
        else {
            View view = null;
            int i = 0;
            int n4 = Integer.MIN_VALUE;
            n = Integer.MAX_VALUE;
            View view2 = null;
            while (i < childCount) {
                final View child = o.getChildAt(i);
                final int position = o.getPosition(child);
                View view3;
                int n5;
                if (position == -1) {
                    view3 = view;
                    n5 = n4;
                }
                else {
                    if (position < (min = n)) {
                        view = child;
                        min = position;
                    }
                    view3 = view;
                    n = min;
                    if (position > (n5 = n4)) {
                        n5 = position;
                        n = min;
                        view2 = child;
                        view3 = view;
                    }
                }
                ++i;
                view = view3;
                n4 = n5;
            }
            n3 = n2;
            if (view != null) {
                if (view2 == null) {
                    n3 = n2;
                }
                else {
                    min = Math.min(f0.e(view), f0.e(view2));
                    min = Math.max(f0.b(view), f0.b(view2)) - min;
                    if (min == 0) {
                        n3 = n2;
                    }
                    else {
                        n3 = min * 1.0f / (n4 - n + 1);
                    }
                }
            }
        }
        if (n3 <= 0.0f) {
            return 0;
        }
        if (Math.abs(array[0]) > Math.abs(array[1])) {
            n = array[0];
        }
        else {
            n = array[1];
        }
        return Math.round(n / n3);
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

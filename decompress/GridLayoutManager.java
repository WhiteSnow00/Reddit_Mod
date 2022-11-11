// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import b4.c$c;
import android.widget.GridView;
import b4.c;
import java.util.Arrays;
import android.view.View$MeasureSpec;
import ak0.m;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import ak0.n;
import android.util.Log;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.util.SparseIntArray;
import android.view.View;

public class GridLayoutManager extends LinearLayoutManager
{
    public boolean e;
    public int f;
    public int[] g;
    public View[] h;
    public final SparseIntArray i;
    public final SparseIntArray j;
    public c k;
    public final Rect l;
    
    public GridLayoutManager(final Context context, final int n) {
        super(context);
        this.e = false;
        this.f = -1;
        this.i = new SparseIntArray();
        this.j = new SparseIntArray();
        this.k = (c)new GridLayoutManager.GridLayoutManager$a();
        this.l = new Rect();
        this.g(n);
    }
    
    public GridLayoutManager(final Context context, final int n, final int n2) {
        super(context, n2, false);
        this.e = false;
        this.f = -1;
        this.i = new SparseIntArray();
        this.j = new SparseIntArray();
        this.k = (c)new GridLayoutManager.GridLayoutManager$a();
        this.l = new Rect();
        this.g(n);
    }
    
    public GridLayoutManager(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.e = false;
        this.f = -1;
        this.i = new SparseIntArray();
        this.j = new SparseIntArray();
        this.k = (c)new GridLayoutManager.GridLayoutManager$a();
        this.l = new Rect();
        this.g(RecyclerView.o.getProperties(context, set, n, n2).b);
    }
    
    public final void a(int n) {
        final int[] g = this.g;
        final int f = this.f;
        int i = 1;
        int[] g2 = null;
        Label_0045: {
            if (g != null && g.length == f + 1) {
                g2 = g;
                if (g[g.length - 1] == n) {
                    break Label_0045;
                }
            }
            g2 = new int[f + 1];
        }
        final int n2 = 0;
        g2[0] = 0;
        final int n3 = n / f;
        final int n4 = n % f;
        int n5 = 0;
        n = n2;
        while (i <= f) {
            n += n4;
            int n6;
            if (n > 0 && f - n < n4) {
                n6 = n3 + 1;
                n -= f;
            }
            else {
                n6 = n3;
            }
            n5 += n6;
            g2[i] = n5;
            ++i;
        }
        this.g = g2;
    }
    
    public final int b(final int n, final int n2) {
        if (super.mOrientation == 1 && this.isLayoutRTL()) {
            final int[] g = this.g;
            final int f = this.f;
            return g[f - n] - g[f - n - n2];
        }
        final int[] g2 = this.g;
        return g2[n2 + n] - g2[n];
    }
    
    public final int c(final int n, final RecyclerView.v v, final RecyclerView.b0 b0) {
        if (!b0.g) {
            return this.k.b(n, this.f);
        }
        final int b2 = v.b(n);
        if (b2 == -1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot find span size for pre layout position. ");
            sb.append(n);
            Log.w("GridLayoutManager", sb.toString());
            return 0;
        }
        return this.k.b(b2, this.f);
    }
    
    public final boolean checkLayoutParams(final RecyclerView.p p) {
        return p instanceof GridLayoutManager.GridLayoutManager$b;
    }
    
    public final void collectPrefetchPositionsForLayoutState(final RecyclerView.b0 b0, final LinearLayoutManager.c c, final RecyclerView.o.c c2) {
        int f = this.f;
        for (int i = 0; i < this.f; ++i) {
            final int d = c.d;
            if (d < 0 || d >= b0.b() || f <= 0) {
                break;
            }
            final int d2 = c.d;
            ((q$b)c2).a(d2, Math.max(0, c.g));
            f -= this.k.d(d2);
            c.d += c.e;
        }
    }
    
    public final int computeHorizontalScrollOffset(final RecyclerView.b0 b0) {
        return super.computeHorizontalScrollOffset(b0);
    }
    
    public final int computeHorizontalScrollRange(final RecyclerView.b0 b0) {
        return super.computeHorizontalScrollRange(b0);
    }
    
    public final int computeVerticalScrollOffset(final RecyclerView.b0 b0) {
        return super.computeVerticalScrollOffset(b0);
    }
    
    public final int computeVerticalScrollRange(final RecyclerView.b0 b0) {
        return super.computeVerticalScrollRange(b0);
    }
    
    public final int d(final int n, final RecyclerView.v v, final RecyclerView.b0 b0) {
        if (!b0.g) {
            return this.k.a(n, this.f);
        }
        final int value = this.j.get(n, -1);
        if (value != -1) {
            return value;
        }
        final int b2 = v.b(n);
        if (b2 == -1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
            sb.append(n);
            Log.w("GridLayoutManager", sb.toString());
            return 0;
        }
        return this.k.a(b2, this.f);
    }
    
    public final int e(final int n, final RecyclerView.v v, final RecyclerView.b0 b0) {
        if (!b0.g) {
            return this.k.d(n);
        }
        final int value = this.i.get(n, -1);
        if (value != -1) {
            return value;
        }
        final int b2 = v.b(n);
        if (b2 == -1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
            sb.append(n);
            Log.w("GridLayoutManager", sb.toString());
            return 1;
        }
        return this.k.d(b2);
    }
    
    public final void f(final View view, int n, final boolean b) {
        final GridLayoutManager.GridLayoutManager$b gridLayoutManager$b = (GridLayoutManager.GridLayoutManager$b)view.getLayoutParams();
        final Rect g = ((RecyclerView.p)gridLayoutManager$b).g;
        final int n2 = g.top + g.bottom + ((ViewGroup$MarginLayoutParams)gridLayoutManager$b).topMargin + ((ViewGroup$MarginLayoutParams)gridLayoutManager$b).bottomMargin;
        final int n3 = g.left + g.right + ((ViewGroup$MarginLayoutParams)gridLayoutManager$b).leftMargin + ((ViewGroup$MarginLayoutParams)gridLayoutManager$b).rightMargin;
        final int b2 = this.b(gridLayoutManager$b.j, gridLayoutManager$b.k);
        int n4;
        if (super.mOrientation == 1) {
            n4 = RecyclerView.o.getChildMeasureSpec(b2, n, n3, ((ViewGroup$MarginLayoutParams)gridLayoutManager$b).width, false);
            n = RecyclerView.o.getChildMeasureSpec(super.mOrientationHelper.l(), ((RecyclerView.o)this).getHeightMode(), n2, ((ViewGroup$MarginLayoutParams)gridLayoutManager$b).height, true);
        }
        else {
            n = RecyclerView.o.getChildMeasureSpec(b2, n, n2, ((ViewGroup$MarginLayoutParams)gridLayoutManager$b).height, false);
            n4 = RecyclerView.o.getChildMeasureSpec(super.mOrientationHelper.l(), ((RecyclerView.o)this).getWidthMode(), n3, ((ViewGroup$MarginLayoutParams)gridLayoutManager$b).width, true);
        }
        final RecyclerView.p p3 = (RecyclerView.p)view.getLayoutParams();
        boolean b3;
        if (b) {
            b3 = ((RecyclerView.o)this).shouldReMeasureChild(view, n4, n, p3);
        }
        else {
            b3 = ((RecyclerView.o)this).shouldMeasureChild(view, n4, n, p3);
        }
        if (b3) {
            view.measure(n4, n);
        }
    }
    
    public final View findReferenceChild(final RecyclerView.v v, final RecyclerView.b0 b0, final boolean b2, final boolean b3) {
        final int childCount = ((RecyclerView.o)this).getChildCount();
        int n = -1;
        int n2 = 1;
        int i;
        if (b3) {
            i = ((RecyclerView.o)this).getChildCount() - 1;
            n2 = -1;
        }
        else {
            n = childCount;
            i = 0;
        }
        final int b4 = b0.b();
        this.ensureLayoutState();
        final int k = super.mOrientationHelper.k();
        final int g = super.mOrientationHelper.g();
        View view = null;
        View view2 = null;
        while (i != n) {
            final View child = ((RecyclerView.o)this).getChildAt(i);
            final int position = ((RecyclerView.o)this).getPosition(child);
            View view3 = view;
            View view4 = view2;
            if (position >= 0) {
                view3 = view;
                view4 = view2;
                if (position < b4) {
                    if (this.d(position, v, b0) != 0) {
                        view3 = view;
                        view4 = view2;
                    }
                    else if (((RecyclerView.p)child.getLayoutParams()).e()) {
                        view3 = view;
                        if ((view4 = view2) == null) {
                            view4 = child;
                            view3 = view;
                        }
                    }
                    else {
                        if (super.mOrientationHelper.e(child) < g && super.mOrientationHelper.b(child) >= k) {
                            return child;
                        }
                        view3 = view;
                        view4 = view2;
                        if (view == null) {
                            view3 = child;
                            view4 = view2;
                        }
                    }
                }
            }
            i += n2;
            view = view3;
            view2 = view4;
        }
        if (view == null) {
            view = view2;
        }
        return view;
    }
    
    public final void g(final int f) {
        if (f == this.f) {
            return;
        }
        this.e = true;
        if (f >= 1) {
            this.f = f;
            this.k.e();
            ((RecyclerView.o)this).requestLayout();
            return;
        }
        throw new IllegalArgumentException(n.k("Span count should be at least 1. Provided ", f));
    }
    
    public final RecyclerView.p generateDefaultLayoutParams() {
        if (super.mOrientation == 0) {
            return (RecyclerView.p)new GridLayoutManager.GridLayoutManager$b(-2, -1);
        }
        return (RecyclerView.p)new GridLayoutManager.GridLayoutManager$b(-1, -2);
    }
    
    public final RecyclerView.p generateLayoutParams(final Context context, final AttributeSet set) {
        return (RecyclerView.p)new GridLayoutManager.GridLayoutManager$b(context, set);
    }
    
    public final RecyclerView.p generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            return (RecyclerView.p)new GridLayoutManager.GridLayoutManager$b((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        return (RecyclerView.p)new GridLayoutManager.GridLayoutManager$b(viewGroup$LayoutParams);
    }
    
    public final int getColumnCountForAccessibility(final RecyclerView.v v, final RecyclerView.b0 b0) {
        if (super.mOrientation == 1) {
            return this.f;
        }
        if (b0.b() < 1) {
            return 0;
        }
        return this.c(b0.b() - 1, v, b0) + 1;
    }
    
    public final int getRowCountForAccessibility(final RecyclerView.v v, final RecyclerView.b0 b0) {
        if (super.mOrientation == 0) {
            return this.f;
        }
        if (b0.b() < 1) {
            return 0;
        }
        return this.c(b0.b() - 1, v, b0) + 1;
    }
    
    public final void h() {
        int n;
        int n2;
        if (this.getOrientation() == 1) {
            n = ((RecyclerView.o)this).getWidth() - ((RecyclerView.o)this).getPaddingRight();
            n2 = ((RecyclerView.o)this).getPaddingLeft();
        }
        else {
            n = ((RecyclerView.o)this).getHeight() - ((RecyclerView.o)this).getPaddingBottom();
            n2 = ((RecyclerView.o)this).getPaddingTop();
        }
        this.a(n - n2);
    }
    
    public final void layoutChunk(final RecyclerView.v v, final RecyclerView.b0 b0, final LinearLayoutManager.c c, final LinearLayoutManager.b b2) {
        final int j = super.mOrientationHelper.j();
        final boolean b3 = j != 1073741824;
        int n;
        if (((RecyclerView.o)this).getChildCount() > 0) {
            n = this.g[this.f];
        }
        else {
            n = 0;
        }
        if (b3) {
            this.h();
        }
        final boolean b4 = c.e == 1;
        int f = this.f;
        if (!b4) {
            f = this.d(c.d, v, b0) + this.e(c.d, v, b0);
        }
        int i;
        for (i = 0; i < this.f; ++i) {
            final int d = c.d;
            if (d < 0 || d >= b0.b() || f <= 0) {
                break;
            }
            final int d2 = c.d;
            final int e = this.e(d2, v, b0);
            if (e > this.f) {
                throw new IllegalArgumentException(d.l(m.r("Item at position ", d2, " requires ", e, " spans but GridLayoutManager has only "), this.f, " spans."));
            }
            f -= e;
            if (f < 0) {
                break;
            }
            final View b5 = c.b(v);
            if (b5 == null) {
                break;
            }
            this.h[i] = b5;
        }
        if (i == 0) {
            b2.b = true;
            return;
        }
        int n2;
        int n3;
        int k;
        if (b4) {
            n2 = 1;
            n3 = i;
            k = 0;
        }
        else {
            k = i - 1;
            n3 = -1;
            n2 = -1;
        }
        int l = 0;
        while (k != n3) {
            final View view = this.h[k];
            final GridLayoutManager.GridLayoutManager$b gridLayoutManager$b = (GridLayoutManager.GridLayoutManager$b)view.getLayoutParams();
            final int e2 = this.e(((RecyclerView.o)this).getPosition(view), v, b0);
            gridLayoutManager$b.k = e2;
            gridLayoutManager$b.j = l;
            l += e2;
            k += n2;
        }
        float n4 = 0.0f;
        int n5 = 0;
        int n6 = 0;
        while (n5 < i) {
            final View view2 = this.h[n5];
            if (c.k == null) {
                if (b4) {
                    ((RecyclerView.o)this).addView(view2);
                }
                else {
                    ((RecyclerView.o)this).addView(view2, 0);
                }
            }
            else if (b4) {
                ((RecyclerView.o)this).addDisappearingView(view2);
            }
            else {
                ((RecyclerView.o)this).addDisappearingView(view2, 0);
            }
            ((RecyclerView.o)this).calculateItemDecorationsForChild(view2, this.l);
            this.f(view2, j, false);
            final int c2 = super.mOrientationHelper.c(view2);
            int n7 = n6;
            if (c2 > n6) {
                n7 = c2;
            }
            final float n8 = super.mOrientationHelper.d(view2) * 1.0f / ((GridLayoutManager.GridLayoutManager$b)view2.getLayoutParams()).k;
            float n9 = n4;
            if (n8 > n4) {
                n9 = n8;
            }
            ++n5;
            n4 = n9;
            n6 = n7;
        }
        int a = n6;
        if (b3) {
            this.a(Math.max(Math.round(n4 * this.f), n));
            int n10 = 0;
            int n11 = 0;
            while (true) {
                a = n10;
                if (n11 >= i) {
                    break;
                }
                final View view3 = this.h[n11];
                this.f(view3, 1073741824, true);
                final int c3 = super.mOrientationHelper.c(view3);
                int n12;
                if (c3 > (n12 = n10)) {
                    n12 = c3;
                }
                ++n11;
                n10 = n12;
            }
        }
        for (int n13 = 0; n13 < i; ++n13) {
            final View view4 = this.h[n13];
            if (super.mOrientationHelper.c(view4) != a) {
                final GridLayoutManager.GridLayoutManager$b gridLayoutManager$b2 = (GridLayoutManager.GridLayoutManager$b)view4.getLayoutParams();
                final Rect g = ((RecyclerView.p)gridLayoutManager$b2).g;
                final int n14 = g.top + g.bottom + ((ViewGroup$MarginLayoutParams)gridLayoutManager$b2).topMargin + ((ViewGroup$MarginLayoutParams)gridLayoutManager$b2).bottomMargin;
                final int n15 = g.left + g.right + ((ViewGroup$MarginLayoutParams)gridLayoutManager$b2).leftMargin + ((ViewGroup$MarginLayoutParams)gridLayoutManager$b2).rightMargin;
                final int b6 = this.b(gridLayoutManager$b2.j, gridLayoutManager$b2.k);
                int n16;
                int n17;
                if (super.mOrientation == 1) {
                    n16 = RecyclerView.o.getChildMeasureSpec(b6, 1073741824, n15, ((ViewGroup$MarginLayoutParams)gridLayoutManager$b2).width, false);
                    n17 = View$MeasureSpec.makeMeasureSpec(a - n14, 1073741824);
                }
                else {
                    n16 = View$MeasureSpec.makeMeasureSpec(a - n15, 1073741824);
                    n17 = RecyclerView.o.getChildMeasureSpec(b6, 1073741824, n14, ((ViewGroup$MarginLayoutParams)gridLayoutManager$b2).height, false);
                }
                if (((RecyclerView.o)this).shouldReMeasureChild(view4, n16, n17, (RecyclerView.p)view4.getLayoutParams())) {
                    view4.measure(n16, n17);
                }
            }
        }
        final int n18 = 0;
        b2.a = a;
        int n19;
        int n21;
        int n22;
        int n23;
        int n24;
        if (super.mOrientation == 1) {
            int b7;
            int b8;
            if (c.f == -1) {
                b7 = c.b;
                b8 = b7 - a;
            }
            else {
                b7 = a + (b8 = c.b);
            }
            n19 = 0;
            final int n20 = b8;
            n21 = b7;
            n22 = n19;
            n23 = n20;
            n24 = n18;
        }
        else {
            int b10;
            if (c.f == -1) {
                final int b9 = c.b;
                final int n25 = b9 - a;
                n22 = b9;
                b10 = n25;
            }
            else {
                n22 = a + (b10 = c.b);
            }
            final int n26 = 0;
            n19 = b10;
            n21 = n26;
            n24 = n18;
            n23 = n26;
        }
        while (n24 < i) {
            final View view5 = this.h[n24];
            final GridLayoutManager.GridLayoutManager$b gridLayoutManager$b3 = (GridLayoutManager.GridLayoutManager$b)view5.getLayoutParams();
            int n31;
            int n32;
            if (super.mOrientation == 1) {
                int n27;
                int n28;
                if (this.isLayoutRTL()) {
                    n27 = ((RecyclerView.o)this).getPaddingLeft() + this.g[this.f - gridLayoutManager$b3.j];
                    n28 = n27 - super.mOrientationHelper.d(view5);
                }
                else {
                    n28 = this.g[gridLayoutManager$b3.j] + ((RecyclerView.o)this).getPaddingLeft();
                    n27 = super.mOrientationHelper.d(view5) + n28;
                }
                final int n29 = n28;
                final int n30 = n23;
                n31 = n21;
                n22 = n27;
                n19 = n29;
                n32 = n30;
            }
            else {
                final int n33 = ((RecyclerView.o)this).getPaddingTop() + this.g[gridLayoutManager$b3.j];
                final int d3 = super.mOrientationHelper.d(view5);
                n32 = n33;
                n31 = d3 + n33;
            }
            ((RecyclerView.o)this).layoutDecoratedWithMargins(view5, n19, n32, n22, n31);
            if (((RecyclerView.p)gridLayoutManager$b3).e() || ((RecyclerView.p)gridLayoutManager$b3).d()) {
                b2.c = true;
            }
            b2.d |= view5.hasFocusable();
            final int n34 = n24 + 1;
            final int n35 = n32;
            n21 = n31;
            n23 = n35;
            n24 = n34;
        }
        Arrays.fill(this.h, null);
    }
    
    public final void onAnchorReady(final RecyclerView.v v, final RecyclerView.b0 b0, final LinearLayoutManager.a a, int i) {
        super.onAnchorReady(v, b0, a, i);
        this.h();
        if (b0.b() > 0 && !b0.g) {
            final boolean b2 = i == 1;
            i = this.d(a.b, v, b0);
            if (b2) {
                while (i > 0) {
                    i = a.b;
                    if (i <= 0) {
                        break;
                    }
                    --i;
                    a.b = i;
                    i = this.d(i, v, b0);
                }
            }
            else {
                int b3;
                int j;
                int n;
                int d;
                for (b3 = b0.b(), j = a.b; j < b3 - 1; j = n, i = d) {
                    n = j + 1;
                    d = this.d(n, v, b0);
                    if (d <= i) {
                        break;
                    }
                }
                a.b = j;
            }
        }
        final View[] h = this.h;
        if (h == null || h.length != this.f) {
            this.h = new View[this.f];
        }
    }
    
    public final View onFocusSearchFailed(View view, int n, final RecyclerView.v v, final RecyclerView.b0 b0) {
        final View containingItemView = ((RecyclerView.o)this).findContainingItemView(view);
        View view2 = null;
        if (containingItemView == null) {
            return null;
        }
        final GridLayoutManager.GridLayoutManager$b gridLayoutManager$b = (GridLayoutManager.GridLayoutManager$b)containingItemView.getLayoutParams();
        final int j = gridLayoutManager$b.j;
        final int n2 = gridLayoutManager$b.k + j;
        if (super.onFocusSearchFailed(view, n, v, b0) == null) {
            return null;
        }
        if (this.convertFocusDirectionToLayoutDirection(n) == 1 != super.mShouldReverseLayout) {
            n = 1;
        }
        else {
            n = 0;
        }
        int n3;
        int childCount;
        if (n != 0) {
            n = ((RecyclerView.o)this).getChildCount() - 1;
            childCount = (n3 = -1);
        }
        else {
            childCount = ((RecyclerView.o)this).getChildCount();
            n3 = 1;
            n = 0;
        }
        final boolean b2 = super.mOrientation == 1 && this.isLayoutRTL();
        final int c = this.c(n, v, b0);
        int k;
        int i = k = -1;
        final int n4 = 0;
        final int n5 = 0;
        int l = n;
        view = null;
        n = n5;
        final int n6 = childCount;
        int n7 = n4;
        while (l != n6) {
            final int c2 = this.c(l, v, b0);
            final View child = ((RecyclerView.o)this).getChildAt(l);
            if (child == containingItemView) {
                break;
            }
            if (child.hasFocusable() && c2 != c) {
                if (view2 != null) {
                    break;
                }
            }
            else {
                final GridLayoutManager.GridLayoutManager$b gridLayoutManager$b2 = (GridLayoutManager.GridLayoutManager$b)child.getLayoutParams();
                final int m = gridLayoutManager$b2.j;
                final int n8 = gridLayoutManager$b2.k + m;
                if (child.hasFocusable() && m == j && n8 == n2) {
                    return child;
                }
                int n12 = 0;
                Label_0483: {
                    Label_0326: {
                        if ((child.hasFocusable() || view2 != null) && (child.hasFocusable() || view != null)) {
                            final int n9 = Math.min(n8, n2) - Math.max(m, j);
                            if (child.hasFocusable()) {
                                if (n9 > n7 || (n9 == n7 && b2 == m > i)) {
                                    break Label_0326;
                                }
                            }
                            else if (view2 == null) {
                                final int n10 = 1;
                                final boolean b3 = true;
                                if (((RecyclerView.o)this).isViewPartiallyVisible(child, false, true)) {
                                    final int n11 = n;
                                    if (n9 > n11) {
                                        n12 = n10;
                                        break Label_0483;
                                    }
                                    if (n9 == n11) {
                                        if (b2 == (m > k && b3)) {
                                            break Label_0326;
                                        }
                                    }
                                }
                            }
                            n12 = 0;
                            break Label_0483;
                        }
                    }
                    n12 = 1;
                }
                if (n12 != 0) {
                    if (child.hasFocusable()) {
                        i = gridLayoutManager$b2.j;
                        final int min = Math.min(n8, n2);
                        final int max = Math.max(m, j);
                        view2 = child;
                        n7 = min - max;
                    }
                    else {
                        k = gridLayoutManager$b2.j;
                        n = Math.min(n8, n2) - Math.max(m, j);
                        view = child;
                    }
                }
            }
            l += n3;
        }
        if (view2 == null) {
            view2 = view;
        }
        return view2;
    }
    
    public final void onInitializeAccessibilityNodeInfo(final RecyclerView.v v, final RecyclerView.b0 b0, final b4.c c) {
        super.onInitializeAccessibilityNodeInfo(v, b0, c);
        c.n((CharSequence)GridView.class.getName());
    }
    
    public final void onInitializeAccessibilityNodeInfoForItem(final RecyclerView.v v, final RecyclerView.b0 b0, final View view, final b4.c c) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof GridLayoutManager.GridLayoutManager$b)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, c);
            return;
        }
        final GridLayoutManager.GridLayoutManager$b gridLayoutManager$b = (GridLayoutManager.GridLayoutManager$b)layoutParams;
        final int c2 = this.c(((RecyclerView.p)gridLayoutManager$b).c(), v, b0);
        if (super.mOrientation == 0) {
            c.p(c$c.a(gridLayoutManager$b.j, gridLayoutManager$b.k, c2, 1, false, false));
        }
        else {
            c.p(c$c.a(c2, 1, gridLayoutManager$b.j, gridLayoutManager$b.k, false, false));
        }
    }
    
    public final void onItemsAdded(final RecyclerView recyclerView, final int n, final int n2) {
        this.k.e();
        this.k.b.clear();
    }
    
    public final void onItemsChanged(final RecyclerView recyclerView) {
        this.k.e();
        this.k.b.clear();
    }
    
    public final void onItemsMoved(final RecyclerView recyclerView, final int n, final int n2, final int n3) {
        this.k.e();
        this.k.b.clear();
    }
    
    public final void onItemsRemoved(final RecyclerView recyclerView, final int n, final int n2) {
        this.k.e();
        this.k.b.clear();
    }
    
    public final void onItemsUpdated(final RecyclerView recyclerView, final int n, final int n2, final Object o) {
        this.k.e();
        this.k.b.clear();
    }
    
    public void onLayoutChildren(final RecyclerView.v v, final RecyclerView.b0 b0) {
        if (b0.g) {
            for (int childCount = ((RecyclerView.o)this).getChildCount(), i = 0; i < childCount; ++i) {
                final GridLayoutManager.GridLayoutManager$b gridLayoutManager$b = (GridLayoutManager.GridLayoutManager$b)((RecyclerView.o)this).getChildAt(i).getLayoutParams();
                final int c = ((RecyclerView.p)gridLayoutManager$b).c();
                this.i.put(c, gridLayoutManager$b.k);
                this.j.put(c, gridLayoutManager$b.j);
            }
        }
        super.onLayoutChildren(v, b0);
        this.i.clear();
        this.j.clear();
    }
    
    public final void onLayoutCompleted(final RecyclerView.b0 b0) {
        super.onLayoutCompleted(b0);
        this.e = false;
    }
    
    public final int scrollHorizontallyBy(final int n, final RecyclerView.v v, final RecyclerView.b0 b0) {
        this.h();
        final View[] h = this.h;
        if (h == null || h.length != this.f) {
            this.h = new View[this.f];
        }
        return super.scrollHorizontallyBy(n, v, b0);
    }
    
    public final int scrollVerticallyBy(final int n, final RecyclerView.v v, final RecyclerView.b0 b0) {
        this.h();
        final View[] h = this.h;
        if (h == null || h.length != this.f) {
            this.h = new View[this.f];
        }
        return super.scrollVerticallyBy(n, v, b0);
    }
    
    public final void setMeasuredDimension(final Rect rect, int n, int n2) {
        if (this.g == null) {
            super.setMeasuredDimension(rect, n, n2);
        }
        final int n3 = ((RecyclerView.o)this).getPaddingRight() + ((RecyclerView.o)this).getPaddingLeft();
        final int n4 = ((RecyclerView.o)this).getPaddingBottom() + ((RecyclerView.o)this).getPaddingTop();
        if (super.mOrientation == 1) {
            n2 = RecyclerView.o.chooseSize(n2, rect.height() + n4, ((RecyclerView.o)this).getMinimumHeight());
            final int[] g = this.g;
            n = RecyclerView.o.chooseSize(n, g[g.length - 1] + n3, ((RecyclerView.o)this).getMinimumWidth());
        }
        else {
            n = RecyclerView.o.chooseSize(n, rect.width() + n3, ((RecyclerView.o)this).getMinimumWidth());
            final int[] g2 = this.g;
            n2 = RecyclerView.o.chooseSize(n2, g2[g2.length - 1] + n4, ((RecyclerView.o)this).getMinimumHeight());
        }
        ((RecyclerView.o)this).setMeasuredDimension(n, n2);
    }
    
    public final void setStackFromEnd(final boolean b) {
        if (!b) {
            super.setStackFromEnd(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }
    
    public final boolean supportsPredictiveItemAnimations() {
        return super.mPendingSavedState == null && !this.e;
    }
    
    public abstract static class c
    {
        public final SparseIntArray a;
        public final SparseIntArray b;
        public boolean c;
        
        public c() {
            this.a = new SparseIntArray();
            this.b = new SparseIntArray();
            this.c = false;
        }
        
        public final int a(final int n, int c) {
            if (!this.c) {
                return this.c(n, c);
            }
            final int value = this.a.get(n, -1);
            if (value != -1) {
                return value;
            }
            c = this.c(n, c);
            this.a.put(n, c);
            return c;
        }
        
        public final int b(int n, final int n2) {
            final int d = this.d(n);
            int i = 0;
            int n4;
            int n3 = n4 = i;
            while (i < n) {
                final int d2 = this.d(i);
                final int n5 = n3 + d2;
                int n6;
                if (n5 == n2) {
                    n6 = n4 + 1;
                    n3 = 0;
                }
                else {
                    n3 = n5;
                    n6 = n4;
                    if (n5 > n2) {
                        n6 = n4 + 1;
                        n3 = d2;
                    }
                }
                ++i;
                n4 = n6;
            }
            n = n4;
            if (n3 + d > n2) {
                n = n4 + 1;
            }
            return n;
        }
        
        public int c(final int n, final int n2) {
            final int d = this.d(n);
            if (d == n2) {
                return 0;
            }
            while (true) {
                c c = null;
                int n7 = 0;
                Label_0244: {
                    if (this.c) {
                        final SparseIntArray a = this.a;
                        final int size = a.size();
                        final int n3 = -1;
                        int n4 = size - 1;
                        int i = 0;
                        while (i <= n4) {
                            final int n5 = i + n4 >>> 1;
                            if (a.keyAt(n5) < n) {
                                i = n5 + 1;
                            }
                            else {
                                n4 = n5 - 1;
                            }
                        }
                        --i;
                        int key = n3;
                        if (i >= 0) {
                            key = n3;
                            if (i < a.size()) {
                                key = a.keyAt(i);
                            }
                        }
                        if (key >= 0) {
                            final int n6 = this.d(key) + this.a.get(key);
                            c = this;
                            n7 = key;
                            break Label_0244;
                        }
                    }
                    final c c2 = this;
                    final int n8;
                    int n6 = n8 = 0;
                    if (n8 < n) {
                        final int d2 = c2.d(n8);
                        final int n9 = n6 + d2;
                        if (n9 == n2) {
                            n6 = 0;
                            c = c2;
                            n7 = n8;
                        }
                        else {
                            n6 = n9;
                            c = c2;
                            n7 = n8;
                            if (n9 > n2) {
                                n6 = d2;
                                n7 = n8;
                                c = c2;
                            }
                        }
                    }
                    else {
                        if (d + n6 <= n2) {
                            return n6;
                        }
                        return 0;
                    }
                }
                int n8 = n7 + 1;
                final c c2 = c;
                continue;
            }
        }
        
        public abstract int d(final int p0);
        
        public final void e() {
            this.a.clear();
        }
    }
}

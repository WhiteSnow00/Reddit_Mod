// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.flexbox;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import fd.b;
import androidx.recyclerview.widget.x;
import android.os.Parcelable;
import android.graphics.PointF;
import androidx.recyclerview.widget.e0;
import androidx.recyclerview.widget.d0;
import android.view.View$MeasureSpec;
import androidx.recyclerview.widget.RecyclerView.o;
import android.util.AttributeSet;
import java.util.ArrayList;
import android.content.Context;
import android.util.SparseArray;
import androidx.recyclerview.widget.f0;
import fd.c;
import java.util.List;
import android.view.View;
import android.graphics.Rect;
import fd.a;
import androidx.recyclerview.widget.RecyclerView;

public class FlexboxLayoutManager extends o implements a, a0.b
{
    public static final Rect D;
    public View A;
    public int B;
    public a$a C;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public List<fd.c> l;
    public final com.google.android.flexbox.a m;
    public RecyclerView.v n;
    public RecyclerView.b0 o;
    public FlexboxLayoutManager.FlexboxLayoutManager$c p;
    public FlexboxLayoutManager.FlexboxLayoutManager$a q;
    public f0 r;
    public f0 s;
    public FlexboxLayoutManager.FlexboxLayoutManager$d t;
    public int u;
    public int v;
    public int w;
    public int x;
    public SparseArray<View> y;
    public final Context z;
    
    static {
        D = new Rect();
    }
    
    public FlexboxLayoutManager(final Context z) {
        this.i = -1;
        this.l = new ArrayList<fd.c>();
        this.m = new com.google.android.flexbox.a((a)this);
        this.q = new FlexboxLayoutManager.FlexboxLayoutManager$a(this);
        this.u = -1;
        this.v = Integer.MIN_VALUE;
        this.w = Integer.MIN_VALUE;
        this.x = Integer.MIN_VALUE;
        this.y = (SparseArray<View>)new SparseArray();
        this.B = -1;
        this.C = new a$a();
        this.u(0);
        this.v();
        this.t(4);
        this.z = z;
    }
    
    public FlexboxLayoutManager(final Context z, final AttributeSet set, int a, final int n) {
        this.i = -1;
        this.l = new ArrayList<fd.c>();
        this.m = new com.google.android.flexbox.a((a)this);
        this.q = new FlexboxLayoutManager.FlexboxLayoutManager$a(this);
        this.u = -1;
        this.v = Integer.MIN_VALUE;
        this.w = Integer.MIN_VALUE;
        this.x = Integer.MIN_VALUE;
        this.y = (SparseArray<View>)new SparseArray();
        this.B = -1;
        this.C = new a$a();
        final d properties = RecyclerView.o.getProperties(z, set, a, n);
        a = properties.a;
        if (a != 0) {
            if (a == 1) {
                if (properties.c) {
                    this.u(3);
                }
                else {
                    this.u(2);
                }
            }
        }
        else if (properties.c) {
            this.u(1);
        }
        else {
            this.u(0);
        }
        this.v();
        this.t(4);
        this.z = z;
    }
    
    public static boolean isMeasurementUpToDate(final int n, int size, final int n2) {
        final int mode = View$MeasureSpec.getMode(size);
        size = View$MeasureSpec.getSize(size);
        final boolean b = false;
        boolean b2 = false;
        if (n2 > 0 && n != n2) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            boolean b3 = b;
            if (size >= n) {
                b3 = true;
            }
            return b3;
        }
        if (mode == 0) {
            return true;
        }
        if (mode != 1073741824) {
            return false;
        }
        if (size == n) {
            b2 = true;
        }
        return b2;
    }
    
    private boolean shouldMeasureChild(final View view, final int n, final int n2, final RecyclerView.p p4) {
        return view.isLayoutRequested() || !((RecyclerView.o)this).isMeasurementCacheEnabled() || !isMeasurementUpToDate(view.getWidth(), n, p4.width) || !isMeasurementUpToDate(view.getHeight(), n2, p4.height);
    }
    
    public final void a() {
        if (this.r != null) {
            return;
        }
        if (this.q()) {
            if (this.f == 0) {
                this.r = (f0)new d0((o)this);
                this.s = (f0)new e0((o)this);
            }
            else {
                this.r = (f0)new e0((o)this);
                this.s = (f0)new d0((o)this);
            }
        }
        else if (this.f == 0) {
            this.r = (f0)new e0((o)this);
            this.s = (f0)new d0((o)this);
        }
        else {
            this.r = (f0)new d0((o)this);
            this.s = (f0)new e0((o)this);
        }
    }
    
    public final int b(final RecyclerView.v v, final RecyclerView.b0 b0, final FlexboxLayoutManager.FlexboxLayoutManager$c flexboxLayoutManager$c) {
        final int f = flexboxLayoutManager$c.f;
        if (f != Integer.MIN_VALUE) {
            final int a = flexboxLayoutManager$c.a;
            if (a < 0) {
                flexboxLayoutManager$c.f = f + a;
            }
            this.r(v, flexboxLayoutManager$c);
        }
        int a2 = flexboxLayoutManager$c.a;
        final boolean q = this.q();
        int n = 0;
        fd.c c2;
        for (int n2 = a2; n2 > 0 || this.p.b; n2 -= c2.c) {
            final List<fd.c> l = this.l;
            final int d = flexboxLayoutManager$c.d;
            boolean b2 = false;
            Label_0137: {
                if (d >= 0 && d < b0.b()) {
                    final int c = flexboxLayoutManager$c.c;
                    if (c >= 0 && c < l.size()) {
                        b2 = true;
                        break Label_0137;
                    }
                }
                b2 = false;
            }
            if (!b2) {
                break;
            }
            c2 = this.l.get(flexboxLayoutManager$c.c);
            flexboxLayoutManager$c.d = c2.k;
            int c3;
            if (this.q()) {
                final int paddingLeft = ((RecyclerView.o)this).getPaddingLeft();
                final int paddingRight = ((RecyclerView.o)this).getPaddingRight();
                final int width = ((RecyclerView.o)this).getWidth();
                int e = flexboxLayoutManager$c.e;
                if (flexboxLayoutManager$c.i == -1) {
                    e -= c2.c;
                }
                final int d2 = flexboxLayoutManager$c.d;
                final int g = this.g;
                float n5 = 0.0f;
                float n7 = 0.0f;
                float n8 = 0.0f;
                Label_0566: {
                    if (g != 0) {
                        if (g != 1) {
                            if (g != 2) {
                                if (g == 3) {
                                    final float n3 = (float)paddingLeft;
                                    final int d3 = c2.d;
                                    float n4;
                                    if (d3 != 1) {
                                        n4 = (float)(d3 - 1);
                                    }
                                    else {
                                        n4 = 1.0f;
                                    }
                                    n5 = (width - c2.a) / n4;
                                    final float n6 = (float)(width - paddingRight);
                                    n7 = n3;
                                    n8 = n6;
                                    break Label_0566;
                                }
                                if (g == 4) {
                                    final int d4 = c2.d;
                                    if (d4 != 0) {
                                        n5 = (width - c2.a) / (float)d4;
                                    }
                                    else {
                                        n5 = 0.0f;
                                    }
                                    final float n9 = (float)paddingLeft;
                                    final float n10 = n5 / 2.0f;
                                    n7 = n9 + n10;
                                    n8 = width - paddingRight - n10;
                                    break Label_0566;
                                }
                                if (g == 5) {
                                    final int d5 = c2.d;
                                    if (d5 != 0) {
                                        n5 = (width - c2.a) / (float)(d5 + 1);
                                    }
                                    else {
                                        n5 = 0.0f;
                                    }
                                    n7 = paddingLeft + n5;
                                    n8 = width - paddingRight - n5;
                                    break Label_0566;
                                }
                                final StringBuilder k = a.k("Invalid justifyContent is set: ");
                                k.append(this.g);
                                throw new IllegalStateException(k.toString());
                            }
                            else {
                                final float n11 = (float)paddingLeft;
                                final float n12 = (width - c2.a) / 2.0f;
                                n7 = n11 + n12;
                                n8 = width - paddingRight - n12;
                            }
                        }
                        else {
                            final int a3 = c2.a;
                            n7 = (float)(width - a3 + paddingRight);
                            n8 = (float)(a3 - paddingLeft);
                        }
                    }
                    else {
                        n7 = (float)paddingLeft;
                        n8 = (float)(width - paddingRight);
                    }
                    n5 = 0.0f;
                }
                final float n13 = (float)this.q.d;
                final float n14 = n7 - n13;
                float n15 = n8 - n13;
                final float max = Math.max(n5, 0.0f);
                final int d6 = c2.d;
                int n16 = 0;
                int i = d2;
                float n17 = n14;
                while (i < d2 + d6) {
                    final View j = this.l(i);
                    if (j != null) {
                        if (flexboxLayoutManager$c.i == 1) {
                            ((RecyclerView.o)this).calculateItemDecorationsForChild(j, FlexboxLayoutManager.D);
                            ((RecyclerView.o)this).addView(j);
                        }
                        else {
                            ((RecyclerView.o)this).calculateItemDecorationsForChild(j, FlexboxLayoutManager.D);
                            ((RecyclerView.o)this).addView(j, n16);
                            ++n16;
                        }
                        final long n18 = this.m.d[i];
                        final int n19 = (int)n18;
                        final int n20 = (int)(n18 >> 32);
                        final b b3 = (b)j.getLayoutParams();
                        if (this.shouldMeasureChild(j, n19, n20, b3)) {
                            j.measure(n19, n20);
                        }
                        final float n21 = n17 + (((RecyclerView.o)this).getLeftDecorationWidth(j) + b3.leftMargin);
                        final float n22 = n15 - (((RecyclerView.o)this).getRightDecorationWidth(j) + b3.rightMargin);
                        final int n23 = ((RecyclerView.o)this).getTopDecorationHeight(j) + e;
                        if (this.j) {
                            this.m.l(j, c2, Math.round(n22) - j.getMeasuredWidth(), n23, Math.round(n22), j.getMeasuredHeight() + n23);
                        }
                        else {
                            final View view = j;
                            this.m.l(view, c2, Math.round(n21), n23, view.getMeasuredWidth() + Math.round(n21), view.getMeasuredHeight() + n23);
                        }
                        final float n24 = (float)(((RecyclerView.o)this).getRightDecorationWidth(j) + (j.getMeasuredWidth() + b3.rightMargin));
                        n15 = n22 - (((RecyclerView.o)this).getLeftDecorationWidth(j) + (j.getMeasuredWidth() + b3.leftMargin) + max);
                        n17 = n24 + max + n21;
                    }
                    ++i;
                }
                flexboxLayoutManager$c.c += this.p.i;
                c3 = c2.c;
            }
            else {
                final int n25 = a2;
                final int paddingTop = ((RecyclerView.o)this).getPaddingTop();
                final int paddingBottom = ((RecyclerView.o)this).getPaddingBottom();
                final int height = ((RecyclerView.o)this).getHeight();
                final int e2 = flexboxLayoutManager$c.e;
                int n26;
                int n27;
                if (flexboxLayoutManager$c.i == -1) {
                    final int c4 = c2.c;
                    n26 = e2 + c4;
                    n27 = e2 - c4;
                }
                else {
                    n26 = e2;
                    n27 = e2;
                }
                final int d7 = flexboxLayoutManager$c.d;
                final int g2 = this.g;
                float n30 = 0.0f;
                float n32 = 0.0f;
                float n33 = 0.0f;
                Label_1424: {
                    if (g2 != 0) {
                        if (g2 != 1) {
                            if (g2 != 2) {
                                if (g2 == 3) {
                                    final float n28 = (float)paddingTop;
                                    final int d8 = c2.d;
                                    float n29;
                                    if (d8 != 1) {
                                        n29 = (float)(d8 - 1);
                                    }
                                    else {
                                        n29 = 1.0f;
                                    }
                                    n30 = (height - c2.a) / n29;
                                    final float n31 = (float)(height - paddingBottom);
                                    n32 = n28;
                                    n33 = n31;
                                    break Label_1424;
                                }
                                if (g2 == 4) {
                                    final int d9 = c2.d;
                                    if (d9 != 0) {
                                        n30 = (height - c2.a) / (float)d9;
                                    }
                                    else {
                                        n30 = 0.0f;
                                    }
                                    final float n34 = (float)paddingTop;
                                    final float n35 = n30 / 2.0f;
                                    n32 = n34 + n35;
                                    n33 = height - paddingBottom - n35;
                                    break Label_1424;
                                }
                                if (g2 == 5) {
                                    final int d10 = c2.d;
                                    if (d10 != 0) {
                                        n30 = (height - c2.a) / (float)(d10 + 1);
                                    }
                                    else {
                                        n30 = 0.0f;
                                    }
                                    n32 = paddingTop + n30;
                                    n33 = height - paddingBottom - n30;
                                    break Label_1424;
                                }
                                final StringBuilder m = a.k("Invalid justifyContent is set: ");
                                m.append(this.g);
                                throw new IllegalStateException(m.toString());
                            }
                            else {
                                final float n36 = (float)paddingTop;
                                final float n37 = (height - c2.a) / 2.0f;
                                n32 = n36 + n37;
                                n33 = height - paddingBottom - n37;
                            }
                        }
                        else {
                            final int a4 = c2.a;
                            n32 = (float)(height - a4 + paddingBottom);
                            n33 = (float)(a4 - paddingTop);
                        }
                    }
                    else {
                        n32 = (float)paddingTop;
                        n33 = (float)(height - paddingBottom);
                    }
                    n30 = 0.0f;
                }
                final float n38 = (float)this.q.d;
                final float n39 = n32 - n38;
                float n40 = n33 - n38;
                final float max2 = Math.max(n30, 0.0f);
                final int d11 = c2.d;
                int n41 = 0;
                int n42 = d7;
                float n43 = n39;
                while (n42 < d7 + d11) {
                    final View l2 = this.l(n42);
                    if (l2 != null) {
                        final long n44 = this.m.d[n42];
                        final int n45 = (int)n44;
                        final int n46 = (int)(n44 >> 32);
                        final b b4 = (b)l2.getLayoutParams();
                        if (this.shouldMeasureChild(l2, n45, n46, b4)) {
                            l2.measure(n45, n46);
                        }
                        final float n47 = n43 + (((RecyclerView.o)this).getTopDecorationHeight(l2) + b4.topMargin);
                        final float n48 = n40 - (((RecyclerView.o)this).getBottomDecorationHeight(l2) + b4.rightMargin);
                        if (flexboxLayoutManager$c.i == 1) {
                            ((RecyclerView.o)this).calculateItemDecorationsForChild(l2, FlexboxLayoutManager.D);
                            ((RecyclerView.o)this).addView(l2);
                        }
                        else {
                            ((RecyclerView.o)this).calculateItemDecorationsForChild(l2, FlexboxLayoutManager.D);
                            ((RecyclerView.o)this).addView(l2, n41);
                            ++n41;
                        }
                        final int n49 = ((RecyclerView.o)this).getLeftDecorationWidth(l2) + n27;
                        final int n50 = n26 - ((RecyclerView.o)this).getRightDecorationWidth(l2);
                        final boolean j2 = this.j;
                        if (j2) {
                            if (this.k) {
                                this.m.m(l2, c2, j2, n50 - l2.getMeasuredWidth(), Math.round(n48) - l2.getMeasuredHeight(), n50, Math.round(n48));
                            }
                            else {
                                final View view2 = l2;
                                this.m.m(view2, c2, j2, n50 - view2.getMeasuredWidth(), Math.round(n47), n50, view2.getMeasuredHeight() + Math.round(n47));
                            }
                        }
                        else {
                            final View view3 = l2;
                            if (this.k) {
                                this.m.m(view3, c2, j2, n49, Math.round(n48) - view3.getMeasuredHeight(), view3.getMeasuredWidth() + n49, Math.round(n48));
                            }
                            else {
                                this.m.m(view3, c2, j2, n49, Math.round(n47), view3.getMeasuredWidth() + n49, view3.getMeasuredHeight() + Math.round(n47));
                            }
                        }
                        final float n51 = (float)(((RecyclerView.o)this).getBottomDecorationHeight(l2) + (l2.getMeasuredHeight() + b4.topMargin));
                        n40 = n48 - (((RecyclerView.o)this).getTopDecorationHeight(l2) + (l2.getMeasuredHeight() + b4.bottomMargin) + max2);
                        n43 = n51 + max2 + n47;
                    }
                    ++n42;
                }
                flexboxLayoutManager$c.c += this.p.i;
                final int c5 = c2.c;
                a2 = n25;
                c3 = c5;
            }
            n += c3;
            if (!q && this.j) {
                flexboxLayoutManager$c.e -= c2.c * flexboxLayoutManager$c.i;
            }
            else {
                flexboxLayoutManager$c.e += c2.c * flexboxLayoutManager$c.i;
            }
        }
        final int a5 = flexboxLayoutManager$c.a - n;
        flexboxLayoutManager$c.a = a5;
        final int f2 = flexboxLayoutManager$c.f;
        if (f2 != Integer.MIN_VALUE) {
            final int f3 = f2 + n;
            flexboxLayoutManager$c.f = f3;
            if (a5 < 0) {
                flexboxLayoutManager$c.f = f3 + a5;
            }
            this.r(v, flexboxLayoutManager$c);
        }
        return a2 - flexboxLayoutManager$c.a;
    }
    
    public final View c(int position) {
        final View h = this.h(0, ((RecyclerView.o)this).getChildCount(), position);
        if (h == null) {
            return null;
        }
        position = ((RecyclerView.o)this).getPosition(h);
        position = this.m.c[position];
        if (position == -1) {
            return null;
        }
        return this.d(h, this.l.get(position));
    }
    
    @Override
    public final boolean canScrollHorizontally() {
        if (this.f == 0) {
            return this.q();
        }
        final boolean q = this.q();
        boolean b = false;
        if (q) {
            final int width = ((RecyclerView.o)this).getWidth();
            final View a = this.A;
            int width2;
            if (a != null) {
                width2 = a.getWidth();
            }
            else {
                width2 = 0;
            }
            if (width <= width2) {
                return b;
            }
        }
        b = true;
        return b;
    }
    
    @Override
    public final boolean canScrollVertically() {
        final int f = this.f;
        final boolean b = true;
        if (f == 0) {
            return this.q() ^ true;
        }
        boolean b2 = b;
        if (!this.q()) {
            final int height = ((RecyclerView.o)this).getHeight();
            final View a = this.A;
            int height2;
            if (a != null) {
                height2 = a.getHeight();
            }
            else {
                height2 = 0;
            }
            b2 = (height > height2 && b);
        }
        return b2;
    }
    
    @Override
    public final boolean checkLayoutParams(final RecyclerView.p p) {
        return p instanceof b;
    }
    
    @Override
    public final int computeHorizontalScrollExtent(final RecyclerView.b0 b0) {
        return this.computeScrollExtent(b0);
    }
    
    @Override
    public final int computeHorizontalScrollOffset(final RecyclerView.b0 b0) {
        return this.computeScrollOffset(b0);
    }
    
    @Override
    public final int computeHorizontalScrollRange(final RecyclerView.b0 b0) {
        return this.computeScrollRange(b0);
    }
    
    public final int computeScrollExtent(final RecyclerView.b0 b0) {
        if (((RecyclerView.o)this).getChildCount() == 0) {
            return 0;
        }
        final int b2 = b0.b();
        this.a();
        final View c = this.c(b2);
        final View e = this.e(b2);
        if (b0.b() != 0 && c != null && e != null) {
            return Math.min(this.r.l(), this.r.b(e) - this.r.e(c));
        }
        return 0;
    }
    
    public final int computeScrollOffset(final RecyclerView.b0 b0) {
        if (((RecyclerView.o)this).getChildCount() == 0) {
            return 0;
        }
        final int b2 = b0.b();
        final View c = this.c(b2);
        final View e = this.e(b2);
        if (b0.b() != 0 && c != null) {
            if (e != null) {
                final int position = ((RecyclerView.o)this).getPosition(c);
                final int position2 = ((RecyclerView.o)this).getPosition(e);
                final int abs = Math.abs(this.r.b(e) - this.r.e(c));
                final int[] c2 = this.m.c;
                final int n = c2[position];
                if (n != 0) {
                    if (n != -1) {
                        return Math.round(n * (abs / (float)(c2[position2] - n + 1)) + (this.r.k() - this.r.e(c)));
                    }
                }
            }
        }
        return 0;
    }
    
    public final int computeScrollRange(final RecyclerView.b0 b0) {
        if (((RecyclerView.o)this).getChildCount() == 0) {
            return 0;
        }
        final int b2 = b0.b();
        final View c = this.c(b2);
        final View e = this.e(b2);
        if (b0.b() != 0 && c != null && e != null) {
            final View g = this.g(0, ((RecyclerView.o)this).getChildCount());
            int position = -1;
            int position2;
            if (g == null) {
                position2 = -1;
            }
            else {
                position2 = ((RecyclerView.o)this).getPosition(g);
            }
            final View g2 = this.g(((RecyclerView.o)this).getChildCount() - 1, -1);
            if (g2 != null) {
                position = ((RecyclerView.o)this).getPosition(g2);
            }
            return (int)(Math.abs(this.r.b(e) - this.r.e(c)) / (float)(position - position2 + 1) * b0.b());
        }
        return 0;
    }
    
    public final PointF computeScrollVectorForPosition(int n) {
        if (((RecyclerView.o)this).getChildCount() == 0) {
            return null;
        }
        final View child = ((RecyclerView.o)this).getChildAt(0);
        if (child == null) {
            return null;
        }
        if (n < ((RecyclerView.o)this).getPosition(child)) {
            n = -1;
        }
        else {
            n = 1;
        }
        if (this.q()) {
            return new PointF(0.0f, (float)n);
        }
        return new PointF((float)n, 0.0f);
    }
    
    @Override
    public final int computeVerticalScrollExtent(final RecyclerView.b0 b0) {
        return this.computeScrollExtent(b0);
    }
    
    @Override
    public final int computeVerticalScrollOffset(final RecyclerView.b0 b0) {
        return this.computeScrollOffset(b0);
    }
    
    @Override
    public final int computeVerticalScrollRange(final RecyclerView.b0 b0) {
        return this.computeScrollRange(b0);
    }
    
    public final View d(View view, final fd.c c) {
        final boolean q = this.q();
        final int d = c.d;
        int i = 1;
        View view2 = view;
        while (i < d) {
            final View child = ((RecyclerView.o)this).getChildAt(i);
            view = view2;
            Label_0114: {
                if (child != null) {
                    if (child.getVisibility() == 8) {
                        view = view2;
                    }
                    else {
                        if (this.j && !q) {
                            view = view2;
                            if (this.r.b(view2) >= this.r.b(child)) {
                                break Label_0114;
                            }
                        }
                        else {
                            view = view2;
                            if (this.r.e(view2) <= this.r.e(child)) {
                                break Label_0114;
                            }
                        }
                        view = child;
                    }
                }
            }
            ++i;
            view2 = view;
        }
        return view2;
    }
    
    public final View e(int position) {
        final View h = this.h(((RecyclerView.o)this).getChildCount() - 1, -1, position);
        if (h == null) {
            return null;
        }
        position = ((RecyclerView.o)this).getPosition(h);
        position = this.m.c[position];
        return this.f(h, this.l.get(position));
    }
    
    public final View f(View view, final fd.c c) {
        final boolean q = this.q();
        int i = ((RecyclerView.o)this).getChildCount() - 2;
        final int childCount = ((RecyclerView.o)this).getChildCount();
        final int d = c.d;
        View view2 = view;
        while (i > childCount - d - 1) {
            final View child = ((RecyclerView.o)this).getChildAt(i);
            view = view2;
            Label_0130: {
                if (child != null) {
                    if (child.getVisibility() == 8) {
                        view = view2;
                    }
                    else {
                        if (this.j && !q) {
                            view = view2;
                            if (this.r.e(view2) <= this.r.e(child)) {
                                break Label_0130;
                            }
                        }
                        else {
                            view = view2;
                            if (this.r.b(view2) >= this.r.b(child)) {
                                break Label_0130;
                            }
                        }
                        view = child;
                    }
                }
            }
            --i;
            view2 = view;
        }
        return view2;
    }
    
    public final int fixLayoutEndGap(int n, final RecyclerView.v v, final RecyclerView.b0 b0, final boolean b2) {
        int o;
        if (!this.q() && this.j) {
            final int n2 = n - this.r.k();
            if (n2 <= 0) {
                return 0;
            }
            o = this.o(n2, v, b0);
        }
        else {
            final int n3 = this.r.g() - n;
            if (n3 <= 0) {
                return 0;
            }
            o = -this.o(-n3, v, b0);
        }
        if (b2) {
            n = this.r.g() - (n + o);
            if (n > 0) {
                this.r.p(n);
                return n + o;
            }
        }
        return o;
    }
    
    public final int fixLayoutStartGap(int n, final RecyclerView.v v, final RecyclerView.b0 b0, final boolean b2) {
        int o;
        if (!this.q() && this.j) {
            final int n2 = this.r.g() - n;
            if (n2 <= 0) {
                return 0;
            }
            o = this.o(-n2, v, b0);
        }
        else {
            final int n3 = n - this.r.k();
            if (n3 <= 0) {
                return 0;
            }
            o = -this.o(n3, v, b0);
        }
        int n4 = o;
        if (b2) {
            n = n + o - this.r.k();
            n4 = o;
            if (n > 0) {
                this.r.p(-n);
                n4 = o - n;
            }
        }
        return n4;
    }
    
    public final View g(int i, final int n) {
        int n2;
        if (n > i) {
            n2 = 1;
        }
        else {
            n2 = -1;
        }
        while (i != n) {
            final View child = ((RecyclerView.o)this).getChildAt(i);
            final int paddingLeft = ((RecyclerView.o)this).getPaddingLeft();
            final int paddingTop = ((RecyclerView.o)this).getPaddingTop();
            final int width = ((RecyclerView.o)this).getWidth();
            final int paddingRight = ((RecyclerView.o)this).getPaddingRight();
            final int height = ((RecyclerView.o)this).getHeight();
            final int paddingBottom = ((RecyclerView.o)this).getPaddingBottom();
            final RecyclerView.p p2 = (RecyclerView.p)child.getLayoutParams();
            final int decoratedLeft = ((RecyclerView.o)this).getDecoratedLeft(child);
            final int leftMargin = p2.leftMargin;
            final RecyclerView.p p3 = (RecyclerView.p)child.getLayoutParams();
            final int decoratedTop = ((RecyclerView.o)this).getDecoratedTop(child);
            final int topMargin = p3.topMargin;
            final RecyclerView.p p4 = (RecyclerView.p)child.getLayoutParams();
            final int decoratedRight = ((RecyclerView.o)this).getDecoratedRight(child);
            final int rightMargin = p4.rightMargin;
            final RecyclerView.p p5 = (RecyclerView.p)child.getLayoutParams();
            final int decoratedBottom = ((RecyclerView.o)this).getDecoratedBottom(child);
            final int bottomMargin = p5.bottomMargin;
            final boolean b = false;
            final boolean b2 = decoratedLeft - leftMargin >= width - paddingRight || decoratedRight + rightMargin >= paddingLeft;
            final boolean b3 = decoratedTop - topMargin >= height - paddingBottom || decoratedBottom + bottomMargin >= paddingTop;
            int n3 = b ? 1 : 0;
            if (b2) {
                n3 = (b ? 1 : 0);
                if (b3) {
                    n3 = 1;
                }
            }
            if (n3 != 0) {
                return child;
            }
            i += n2;
        }
        return null;
    }
    
    @Override
    public final RecyclerView.p generateDefaultLayoutParams() {
        return new b();
    }
    
    @Override
    public final RecyclerView.p generateLayoutParams(final Context context, final AttributeSet set) {
        return new b(context, set);
    }
    
    public final View h(int i, final int n, final int n2) {
        this.a();
        if (this.p == null) {
            this.p = new FlexboxLayoutManager.FlexboxLayoutManager$c();
        }
        final int k = this.r.k();
        final int g = this.r.g();
        int n3;
        if (n > i) {
            n3 = 1;
        }
        else {
            n3 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != n) {
            final View child = ((RecyclerView.o)this).getChildAt(i);
            View view3;
            View view4;
            if (child == null) {
                view3 = view;
                view4 = view2;
            }
            else {
                final int position = ((RecyclerView.o)this).getPosition(child);
                view3 = view;
                view4 = view2;
                if (position >= 0) {
                    view3 = view;
                    view4 = view2;
                    if (position < n2) {
                        if (((RecyclerView.p)child.getLayoutParams()).e()) {
                            view3 = view;
                            if ((view4 = view2) == null) {
                                view4 = child;
                                view3 = view;
                            }
                        }
                        else {
                            if (this.r.e(child) >= k && this.r.b(child) <= g) {
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
            }
            i += n3;
            view = view3;
            view2 = view4;
        }
        if (view != null) {
            view2 = view;
        }
        return view2;
    }
    
    public final int i(final int n, final int n2) {
        return RecyclerView.o.getChildMeasureSpec(((RecyclerView.o)this).getHeight(), ((RecyclerView.o)this).getHeightMode(), n, n2, this.canScrollVertically());
    }
    
    @Override
    public final boolean isAutoMeasureEnabled() {
        return true;
    }
    
    public final int j(final int n, final int n2) {
        return RecyclerView.o.getChildMeasureSpec(((RecyclerView.o)this).getWidth(), ((RecyclerView.o)this).getWidthMode(), n, n2, this.canScrollHorizontally());
    }
    
    public final int k(final View view) {
        int n;
        int n2;
        if (this.q()) {
            n = ((RecyclerView.o)this).getTopDecorationHeight(view);
            n2 = ((RecyclerView.o)this).getBottomDecorationHeight(view);
        }
        else {
            n = ((RecyclerView.o)this).getLeftDecorationWidth(view);
            n2 = ((RecyclerView.o)this).getRightDecorationWidth(view);
        }
        return n2 + n;
    }
    
    public final View l(final int n) {
        final View view = (View)this.y.get(n);
        if (view != null) {
            return view;
        }
        return this.n.l(n, Long.MAX_VALUE).itemView;
    }
    
    public final int m() {
        return this.o.b();
    }
    
    public final int n() {
        final int size = this.l.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        while (i < this.l.size()) {
            max = Math.max(max, this.l.get(i).a);
            ++i;
        }
        return max;
    }
    
    public final int o(int g, final RecyclerView.v v, final RecyclerView.b0 b0) {
        if (((RecyclerView.o)this).getChildCount() == 0 || g == 0) {
            return 0;
        }
        this.a();
        this.p.j = true;
        final boolean b2 = !this.q() && this.j;
        final int i = (b2 ? (g < 0) : (g > 0)) ? 1 : -1;
        final int abs = Math.abs(g);
        this.p.i = i;
        final boolean q = this.q();
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(((RecyclerView.o)this).getWidth(), ((RecyclerView.o)this).getWidthMode());
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(((RecyclerView.o)this).getHeight(), ((RecyclerView.o)this).getHeightMode());
        final boolean b3 = !q && this.j;
        Label_0884: {
            if (i == 1) {
                final View child = ((RecyclerView.o)this).getChildAt(((RecyclerView.o)this).getChildCount() - 1);
                if (child == null) {
                    break Label_0884;
                }
                this.p.e = this.r.b(child);
                int position = ((RecyclerView.o)this).getPosition(child);
                final View f = this.f(child, this.l.get(this.m.c[position]));
                final FlexboxLayoutManager.FlexboxLayoutManager$c p3 = this.p;
                p3.h = 1;
                ++position;
                p3.d = position;
                final int[] c = this.m.c;
                if (c.length <= position) {
                    p3.c = -1;
                }
                else {
                    p3.c = c[position];
                }
                if (b3) {
                    p3.e = this.r.e(f);
                    this.p.f = this.r.k() + -this.r.e(f);
                    final FlexboxLayoutManager.FlexboxLayoutManager$c p4 = this.p;
                    p4.f = Math.max(p4.f, 0);
                }
                else {
                    p3.e = this.r.b(f);
                    this.p.f = this.r.b(f) - this.r.g();
                }
                final int c2 = this.p.c;
                if ((c2 == -1 || c2 > this.l.size() - 1) && this.p.d <= this.m()) {
                    final FlexboxLayoutManager.FlexboxLayoutManager$c p5 = this.p;
                    final int n = abs - p5.f;
                    final a$a c3 = this.C;
                    c3.a = null;
                    if (n > 0) {
                        if (q) {
                            this.m.b(c3, measureSpec, measureSpec2, n, p5.d, -1, (List)this.l);
                        }
                        else {
                            this.m.b(c3, measureSpec2, measureSpec, n, p5.d, -1, (List)this.l);
                        }
                        this.m.e(measureSpec, measureSpec2, this.p.d);
                        this.m.q(this.p.d);
                    }
                }
            }
            else {
                final View child2 = ((RecyclerView.o)this).getChildAt(0);
                if (child2 == null) {
                    break Label_0884;
                }
                this.p.e = this.r.e(child2);
                final int position2 = ((RecyclerView.o)this).getPosition(child2);
                final View d = this.d(child2, this.l.get(this.m.c[position2]));
                final FlexboxLayoutManager.FlexboxLayoutManager$c p6 = this.p;
                p6.h = 1;
                int c4;
                if ((c4 = this.m.c[position2]) == -1) {
                    c4 = 0;
                }
                if (c4 > 0) {
                    this.p.d = position2 - this.l.get(c4 - 1).d;
                }
                else {
                    p6.d = -1;
                }
                final FlexboxLayoutManager.FlexboxLayoutManager$c p7 = this.p;
                if (c4 > 0) {
                    --c4;
                }
                else {
                    c4 = 0;
                }
                p7.c = c4;
                if (b3) {
                    p7.e = this.r.b(d);
                    this.p.f = this.r.b(d) - this.r.g();
                    final FlexboxLayoutManager.FlexboxLayoutManager$c p8 = this.p;
                    p8.f = Math.max(p8.f, 0);
                }
                else {
                    p7.e = this.r.e(d);
                    this.p.f = this.r.k() + -this.r.e(d);
                }
            }
            final FlexboxLayoutManager.FlexboxLayoutManager$c p9 = this.p;
            p9.a = abs - p9.f;
        }
        final FlexboxLayoutManager.FlexboxLayoutManager$c p10 = this.p;
        final int n2 = this.b(v, b0, p10) + p10.f;
        if (n2 < 0) {
            return 0;
        }
        if (b2) {
            if (abs > n2) {
                g = -i * n2;
            }
        }
        else if (abs > n2) {
            g = i * n2;
        }
        this.r.p(-g);
        return this.p.g = g;
    }
    
    @Override
    public final void onAdapterChanged(final RecyclerView.Adapter adapter, final RecyclerView.Adapter adapter2) {
        ((RecyclerView.o)this).removeAllViews();
    }
    
    @Override
    public final void onAttachedToWindow(final RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.A = (View)((View)recyclerView).getParent();
    }
    
    @Override
    public final void onDetachedFromWindow(final RecyclerView recyclerView, final RecyclerView.v v) {
        super.onDetachedFromWindow(recyclerView, v);
    }
    
    @Override
    public final void onItemsAdded(final RecyclerView recyclerView, final int n, final int n2) {
        super.onItemsAdded(recyclerView, n, n2);
        this.w(n);
    }
    
    @Override
    public final void onItemsMoved(final RecyclerView recyclerView, final int n, final int n2, final int n3) {
        super.onItemsMoved(recyclerView, n, n2, n3);
        this.w(Math.min(n, n2));
    }
    
    @Override
    public final void onItemsRemoved(final RecyclerView recyclerView, final int n, final int n2) {
        super.onItemsRemoved(recyclerView, n, n2);
        this.w(n);
    }
    
    @Override
    public final void onItemsUpdated(final RecyclerView recyclerView, final int n, final int n2) {
        super.onItemsUpdated(recyclerView, n, n2);
        this.w(n);
    }
    
    @Override
    public final void onItemsUpdated(final RecyclerView recyclerView, final int n, final int n2, final Object o) {
        super.onItemsUpdated(recyclerView, n, n2, o);
        this.w(n);
    }
    
    @Override
    public final void onLayoutChildren(final RecyclerView.v n, final RecyclerView.b0 o) {
        this.n = n;
        this.o = o;
        final int b = o.b();
        if (b == 0 && o.g) {
            return;
        }
        final int layoutDirection = ((RecyclerView.o)this).getLayoutDirection();
        final int e = this.e;
        if (e != 0) {
            if (e != 1) {
                if (e != 2) {
                    if (e != 3) {
                        this.j = false;
                        this.k = false;
                    }
                    else {
                        final boolean j = layoutDirection == 1;
                        this.j = j;
                        if (this.f == 2) {
                            this.j = (j ^ true);
                        }
                        this.k = true;
                    }
                }
                else {
                    final boolean i = layoutDirection == 1;
                    this.j = i;
                    if (this.f == 2) {
                        this.j = (i ^ true);
                    }
                    this.k = false;
                }
            }
            else {
                this.j = (layoutDirection != 1);
                this.k = (this.f == 2);
            }
        }
        else {
            this.j = (layoutDirection == 1);
            this.k = (this.f == 2);
        }
        this.a();
        if (this.p == null) {
            this.p = new FlexboxLayoutManager.FlexboxLayoutManager$c();
        }
        this.m.g(b);
        this.m.h(b);
        this.m.f(b);
        this.p.j = false;
        final FlexboxLayoutManager.FlexboxLayoutManager$d t = this.t;
        if (t != null) {
            final int f = t.f;
            if (f >= 0 && f < b) {
                this.u = f;
            }
        }
        final FlexboxLayoutManager.FlexboxLayoutManager$a q = this.q;
        if (!q.f || this.u != -1 || t != null) {
            FlexboxLayoutManager.FlexboxLayoutManager$a.b(q);
            final FlexboxLayoutManager.FlexboxLayoutManager$a q2 = this.q;
            final FlexboxLayoutManager.FlexboxLayoutManager$d t2 = this.t;
            boolean b3 = false;
            Label_0872: {
                if (!o.g) {
                    final int u = this.u;
                    if (u != -1) {
                        if (u >= 0 && u < o.b()) {
                            final int u2 = this.u;
                            q2.a = u2;
                            q2.b = this.m.c[u2];
                            final FlexboxLayoutManager.FlexboxLayoutManager$d t3 = this.t;
                            Label_0852: {
                                if (t3 != null) {
                                    final int b2 = o.b();
                                    final int f2 = t3.f;
                                    if (f2 >= 0 && f2 < b2) {
                                        q2.c = this.r.k() + t2.g;
                                        q2.g = true;
                                        q2.b = -1;
                                        break Label_0852;
                                    }
                                }
                                if (this.v == Integer.MIN_VALUE) {
                                    final View viewByPosition = ((RecyclerView.o)this).findViewByPosition(this.u);
                                    if (viewByPosition != null) {
                                        if (this.r.c(viewByPosition) > this.r.l()) {
                                            FlexboxLayoutManager.FlexboxLayoutManager$a.a(q2);
                                        }
                                        else if (this.r.e(viewByPosition) - this.r.k() < 0) {
                                            q2.c = this.r.k();
                                            q2.e = false;
                                        }
                                        else if (this.r.g() - this.r.b(viewByPosition) < 0) {
                                            q2.c = this.r.g();
                                            q2.e = true;
                                        }
                                        else {
                                            int e2;
                                            if (q2.e) {
                                                e2 = this.r.m() + this.r.b(viewByPosition);
                                            }
                                            else {
                                                e2 = this.r.e(viewByPosition);
                                            }
                                            q2.c = e2;
                                        }
                                    }
                                    else {
                                        if (((RecyclerView.o)this).getChildCount() > 0) {
                                            final View child = ((RecyclerView.o)this).getChildAt(0);
                                            if (child != null) {
                                                q2.e = (this.u < ((RecyclerView.o)this).getPosition(child));
                                            }
                                        }
                                        FlexboxLayoutManager.FlexboxLayoutManager$a.a(q2);
                                    }
                                }
                                else if (!this.q() && this.j) {
                                    q2.c = this.v - this.r.h();
                                }
                                else {
                                    q2.c = this.r.k() + this.v;
                                }
                            }
                            b3 = true;
                            break Label_0872;
                        }
                        this.u = -1;
                        this.v = Integer.MIN_VALUE;
                    }
                }
                b3 = false;
            }
            if (!b3) {
                boolean b6 = false;
                Label_1316: {
                    if (((RecyclerView.o)this).getChildCount() != 0) {
                        View view;
                        if (q2.e) {
                            view = this.e(o.b());
                        }
                        else {
                            view = this.c(o.b());
                        }
                        if (view != null) {
                            final FlexboxLayoutManager h = q2.h;
                            f0 f3;
                            if (h.f == 0) {
                                f3 = h.s;
                            }
                            else {
                                f3 = h.r;
                            }
                            if (!h.q() && q2.h.j) {
                                if (q2.e) {
                                    q2.c = f3.m() + f3.e(view);
                                }
                                else {
                                    q2.c = f3.b(view);
                                }
                            }
                            else if (q2.e) {
                                q2.c = f3.m() + f3.b(view);
                            }
                            else {
                                q2.c = f3.e(view);
                            }
                            int position = ((RecyclerView.o)q2.h).getPosition(view);
                            q2.a = position;
                            q2.g = false;
                            final FlexboxLayoutManager h2 = q2.h;
                            final int[] c = h2.m.c;
                            if (position == -1) {
                                position = 0;
                            }
                            int b4 = c[position];
                            if (b4 == -1) {
                                b4 = 0;
                            }
                            q2.b = b4;
                            final int size = h2.l.size();
                            final int b5 = q2.b;
                            if (size > b5) {
                                q2.a = q2.h.l.get(b5).k;
                            }
                            if (!o.g && ((RecyclerView.o)this).supportsPredictiveItemAnimations() && (this.r.e(view) >= this.r.g() || this.r.b(view) < this.r.k())) {
                                int c2;
                                if (q2.e) {
                                    c2 = this.r.g();
                                }
                                else {
                                    c2 = this.r.k();
                                }
                                q2.c = c2;
                            }
                            b6 = true;
                            break Label_1316;
                        }
                    }
                    b6 = false;
                }
                if (!b6) {
                    FlexboxLayoutManager.FlexboxLayoutManager$a.a(q2);
                    q2.a = 0;
                    q2.b = 0;
                }
            }
            this.q.f = true;
        }
        ((RecyclerView.o)this).detachAndScrapAttachedViews(n);
        final FlexboxLayoutManager.FlexboxLayoutManager$a q3 = this.q;
        if (q3.e) {
            this.y(q3, false, true);
        }
        else {
            this.x(q3, false, true);
        }
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(((RecyclerView.o)this).getWidth(), ((RecyclerView.o)this).getWidthMode());
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(((RecyclerView.o)this).getHeight(), ((RecyclerView.o)this).getHeightMode());
        final int width = ((RecyclerView.o)this).getWidth();
        final int height = ((RecyclerView.o)this).getHeight();
        boolean b8;
        int n2;
        if (this.q()) {
            final int w = this.w;
            final boolean b7 = w != Integer.MIN_VALUE && w != width;
            final FlexboxLayoutManager.FlexboxLayoutManager$c p2 = this.p;
            if (p2.b) {
                final int heightPixels = this.z.getResources().getDisplayMetrics().heightPixels;
                b8 = b7;
                n2 = heightPixels;
            }
            else {
                final int a = p2.a;
                b8 = b7;
                n2 = a;
            }
        }
        else {
            final int x = this.x;
            b8 = (x != Integer.MIN_VALUE && x != height);
            final FlexboxLayoutManager.FlexboxLayoutManager$c p3 = this.p;
            if (p3.b) {
                n2 = this.z.getResources().getDisplayMetrics().widthPixels;
            }
            else {
                n2 = p3.a;
            }
        }
        this.w = width;
        this.x = height;
        final int b9 = this.B;
        if (b9 == -1 && (this.u != -1 || b8)) {
            if (!this.q.e) {
                this.l.clear();
                this.C.a = null;
                if (this.q()) {
                    this.m.b(this.C, measureSpec, measureSpec2, n2, 0, this.q.a, (List)this.l);
                }
                else {
                    this.m.b(this.C, measureSpec2, measureSpec, n2, 0, this.q.a, (List)this.l);
                }
                this.l = this.C.a;
                this.m.e(measureSpec, measureSpec2, 0);
                this.m.q(0);
                final FlexboxLayoutManager.FlexboxLayoutManager$a q4 = this.q;
                final int n3 = this.m.c[q4.a];
                q4.b = n3;
                this.p.c = n3;
            }
        }
        else {
            int n4;
            if (b9 != -1) {
                n4 = Math.min(b9, this.q.a);
            }
            else {
                n4 = this.q.a;
            }
            this.C.a = null;
            if (this.q()) {
                if (this.l.size() > 0) {
                    this.m.d(n4, (List)this.l);
                    this.m.b(this.C, measureSpec, measureSpec2, n2, n4, this.q.a, (List)this.l);
                }
                else {
                    this.m.f(b);
                    this.m.b(this.C, measureSpec, measureSpec2, n2, 0, -1, (List)this.l);
                }
            }
            else if (this.l.size() > 0) {
                this.m.d(n4, (List)this.l);
                this.m.b(this.C, measureSpec2, measureSpec, n2, n4, this.q.a, (List)this.l);
            }
            else {
                this.m.f(b);
                this.m.b(this.C, measureSpec2, measureSpec, n2, 0, -1, (List)this.l);
            }
            this.l = this.C.a;
            this.m.e(measureSpec, measureSpec2, n4);
            this.m.q(n4);
        }
        this.b(n, o, this.p);
        final FlexboxLayoutManager.FlexboxLayoutManager$a q5 = this.q;
        int n5;
        int n6;
        if (q5.e) {
            n5 = this.p.e;
            this.x(q5, true, false);
            this.b(n, o, this.p);
            n6 = this.p.e;
        }
        else {
            n6 = this.p.e;
            this.y(q5, true, false);
            this.b(n, o, this.p);
            n5 = this.p.e;
        }
        if (((RecyclerView.o)this).getChildCount() > 0) {
            if (this.q.e) {
                this.fixLayoutStartGap(this.fixLayoutEndGap(n6, n, o, true) + n5, n, o, false);
            }
            else {
                this.fixLayoutEndGap(this.fixLayoutStartGap(n5, n, o, true) + n6, n, o, false);
            }
        }
    }
    
    @Override
    public final void onLayoutCompleted(final RecyclerView.b0 b0) {
        super.onLayoutCompleted(b0);
        this.t = null;
        this.u = -1;
        this.v = Integer.MIN_VALUE;
        this.B = -1;
        FlexboxLayoutManager.FlexboxLayoutManager$a.b(this.q);
        this.y.clear();
    }
    
    @Override
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        if (parcelable instanceof FlexboxLayoutManager.FlexboxLayoutManager$d) {
            this.t = (FlexboxLayoutManager.FlexboxLayoutManager$d)parcelable;
            ((RecyclerView.o)this).requestLayout();
        }
    }
    
    @Override
    public final Parcelable onSaveInstanceState() {
        final FlexboxLayoutManager.FlexboxLayoutManager$d t = this.t;
        if (t != null) {
            return (Parcelable)new FlexboxLayoutManager.FlexboxLayoutManager$d(t);
        }
        final FlexboxLayoutManager.FlexboxLayoutManager$d flexboxLayoutManager$d = new FlexboxLayoutManager.FlexboxLayoutManager$d();
        if (((RecyclerView.o)this).getChildCount() > 0) {
            final View child = ((RecyclerView.o)this).getChildAt(0);
            flexboxLayoutManager$d.f = ((RecyclerView.o)this).getPosition(child);
            flexboxLayoutManager$d.g = this.r.e(child) - this.r.k();
        }
        else {
            flexboxLayoutManager$d.f = -1;
        }
        return (Parcelable)flexboxLayoutManager$d;
    }
    
    public final int p(final int n) {
        final int childCount = ((RecyclerView.o)this).getChildCount();
        boolean b = false;
        if (childCount != 0 && n != 0) {
            this.a();
            final boolean q = this.q();
            final View a = this.A;
            int n2;
            if (q) {
                n2 = a.getWidth();
            }
            else {
                n2 = a.getHeight();
            }
            int n3;
            if (q) {
                n3 = ((RecyclerView.o)this).getWidth();
            }
            else {
                n3 = ((RecyclerView.o)this).getHeight();
            }
            if (((RecyclerView.o)this).getLayoutDirection() == 1) {
                b = true;
            }
            int d2;
            if (b) {
                final int abs = Math.abs(n);
                if (n < 0) {
                    return -Math.min(n3 + this.q.d - n2, abs);
                }
                final int d = this.q.d;
                final int min = n;
                if (d + n <= 0) {
                    return min;
                }
                d2 = d;
            }
            else {
                if (n > 0) {
                    return Math.min(n3 - this.q.d - n2, n);
                }
                if ((d2 = this.q.d) + n >= 0) {
                    return n;
                }
            }
            return -d2;
        }
        return 0;
    }
    
    public final boolean q() {
        final int e = this.e;
        boolean b = true;
        if (e != 0) {
            b = (e == 1 && b);
        }
        return b;
    }
    
    public final void r(final RecyclerView.v v, final FlexboxLayoutManager.FlexboxLayoutManager$c flexboxLayoutManager$c) {
        if (!flexboxLayoutManager$c.j) {
            return;
        }
        final int i = flexboxLayoutManager$c.i;
        int n = -1;
        if (i == -1) {
            if (flexboxLayoutManager$c.f >= 0) {
                int childCount = ((RecyclerView.o)this).getChildCount();
                if (childCount != 0) {
                    final int n2 = childCount - 1;
                    final View child = ((RecyclerView.o)this).getChildAt(n2);
                    if (child != null) {
                        int n3 = this.m.c[((RecyclerView.o)this).getPosition(child)];
                        if (n3 != -1) {
                            fd.c c = this.l.get(n3);
                            int n4 = n2;
                            int n5;
                            int j;
                            while (true) {
                                n5 = childCount;
                                j = n2;
                                if (n4 < 0) {
                                    break;
                                }
                                final View child2 = ((RecyclerView.o)this).getChildAt(n4);
                                fd.c c2;
                                int n6;
                                if (child2 == null) {
                                    c2 = c;
                                    n6 = n3;
                                }
                                else {
                                    final int f = flexboxLayoutManager$c.f;
                                    final boolean b = (!this.q() && this.j) ? (this.r.b(child2) <= f) : (this.r.e(child2) >= this.r.f() - f);
                                    n5 = childCount;
                                    j = n2;
                                    if (!b) {
                                        break;
                                    }
                                    c2 = c;
                                    n6 = n3;
                                    if (c.k == ((RecyclerView.o)this).getPosition(child2)) {
                                        if (n3 <= 0) {
                                            n5 = n4;
                                            j = n2;
                                            break;
                                        }
                                        n6 = n3 + flexboxLayoutManager$c.i;
                                        c2 = this.l.get(n6);
                                        childCount = n4;
                                    }
                                }
                                --n4;
                                c = c2;
                                n3 = n6;
                            }
                            while (j >= n5) {
                                ((RecyclerView.o)this).removeAndRecycleViewAt(j, v);
                                --j;
                            }
                        }
                    }
                }
            }
        }
        else if (flexboxLayoutManager$c.f >= 0) {
            final int childCount2 = ((RecyclerView.o)this).getChildCount();
            if (childCount2 != 0) {
                final View child3 = ((RecyclerView.o)this).getChildAt(0);
                if (child3 != null) {
                    int n7 = this.m.c[((RecyclerView.o)this).getPosition(child3)];
                    if (n7 != -1) {
                        fd.c c3 = this.l.get(n7);
                        int n8 = 0;
                        int k;
                        while (true) {
                            k = n;
                            if (n8 >= childCount2) {
                                break;
                            }
                            final View child4 = ((RecyclerView.o)this).getChildAt(n8);
                            int n9;
                            fd.c c4;
                            if (child4 == null) {
                                n9 = n7;
                                c4 = c3;
                            }
                            else {
                                final int f2 = flexboxLayoutManager$c.f;
                                final boolean b2 = (!this.q() && this.j) ? (this.r.f() - this.r.e(child4) <= f2) : (this.r.b(child4) <= f2);
                                k = n;
                                if (!b2) {
                                    break;
                                }
                                n9 = n7;
                                c4 = c3;
                                if (c3.l == ((RecyclerView.o)this).getPosition(child4)) {
                                    if (n7 >= this.l.size() - 1) {
                                        k = n8;
                                        break;
                                    }
                                    n9 = n7 + flexboxLayoutManager$c.i;
                                    c4 = this.l.get(n9);
                                    n = n8;
                                }
                            }
                            ++n8;
                            n7 = n9;
                            c3 = c4;
                        }
                        while (k >= 0) {
                            ((RecyclerView.o)this).removeAndRecycleViewAt(k, v);
                            --k;
                        }
                    }
                }
            }
        }
    }
    
    public final void s() {
        int n;
        if (this.q()) {
            n = ((RecyclerView.o)this).getHeightMode();
        }
        else {
            n = ((RecyclerView.o)this).getWidthMode();
        }
        this.p.b = (n == 0 || n == Integer.MIN_VALUE);
    }
    
    @Override
    public final int scrollHorizontallyBy(int n, final RecyclerView.v v, final RecyclerView.b0 b0) {
        if (this.q() && this.f != 0) {
            n = this.p(n);
            final FlexboxLayoutManager.FlexboxLayoutManager$a q = this.q;
            q.d += n;
            this.s.p(-n);
            return n;
        }
        n = this.o(n, v, b0);
        this.y.clear();
        return n;
    }
    
    @Override
    public final void scrollToPosition(final int u) {
        this.u = u;
        this.v = Integer.MIN_VALUE;
        final FlexboxLayoutManager.FlexboxLayoutManager$d t = this.t;
        if (t != null) {
            t.f = -1;
        }
        ((RecyclerView.o)this).requestLayout();
    }
    
    @Override
    public final int scrollVerticallyBy(int n, final RecyclerView.v v, final RecyclerView.b0 b0) {
        if (!this.q() && (this.f != 0 || this.q())) {
            n = this.p(n);
            final FlexboxLayoutManager.FlexboxLayoutManager$a q = this.q;
            q.d += n;
            this.s.p(-n);
            return n;
        }
        n = this.o(n, v, b0);
        this.y.clear();
        return n;
    }
    
    @Override
    public final void smoothScrollToPosition(final RecyclerView recyclerView, final RecyclerView.b0 b0, final int targetPosition) {
        final x x = new x(((View)recyclerView).getContext());
        ((RecyclerView.a0)x).setTargetPosition(targetPosition);
        ((RecyclerView.o)this).startSmoothScroll((a0)x);
    }
    
    public final void t(final int h) {
        final int h2 = this.h;
        if (h2 != h) {
            if (h2 == 4 || h == 4) {
                ((RecyclerView.o)this).removeAllViews();
                this.l.clear();
                FlexboxLayoutManager.FlexboxLayoutManager$a.b(this.q);
                this.q.d = 0;
            }
            this.h = h;
            ((RecyclerView.o)this).requestLayout();
        }
    }
    
    public final void u(final int e) {
        if (this.e != e) {
            ((RecyclerView.o)this).removeAllViews();
            this.e = e;
            this.r = null;
            this.s = null;
            this.l.clear();
            FlexboxLayoutManager.FlexboxLayoutManager$a.b(this.q);
            this.q.d = 0;
            ((RecyclerView.o)this).requestLayout();
        }
    }
    
    public final void v() {
        final int f = this.f;
        if (f != 1) {
            if (f == 0) {
                ((RecyclerView.o)this).removeAllViews();
                this.l.clear();
                FlexboxLayoutManager.FlexboxLayoutManager$a.b(this.q);
                this.q.d = 0;
            }
            this.f = 1;
            this.r = null;
            this.s = null;
            ((RecyclerView.o)this).requestLayout();
        }
    }
    
    public final void w(int b) {
        final int childCount = ((RecyclerView.o)this).getChildCount();
        int position = -1;
        final View g = this.g(childCount - 1, -1);
        if (g != null) {
            position = ((RecyclerView.o)this).getPosition(g);
        }
        if (b >= position) {
            return;
        }
        final int childCount2 = ((RecyclerView.o)this).getChildCount();
        this.m.g(childCount2);
        this.m.h(childCount2);
        this.m.f(childCount2);
        if (b >= this.m.c.length) {
            return;
        }
        this.B = b;
        final View child = ((RecyclerView.o)this).getChildAt(0);
        if (child == null) {
            return;
        }
        this.u = ((RecyclerView.o)this).getPosition(child);
        if (!this.q() && this.j) {
            b = this.r.b(child);
            this.v = this.r.h() + b;
        }
        else {
            this.v = this.r.e(child) - this.r.k();
        }
    }
    
    public final void x(final FlexboxLayoutManager.FlexboxLayoutManager$a flexboxLayoutManager$a, final boolean b, final boolean b2) {
        if (b2) {
            this.s();
        }
        else {
            this.p.b = false;
        }
        if (!this.q() && this.j) {
            this.p.a = flexboxLayoutManager$a.c - ((RecyclerView.o)this).getPaddingRight();
        }
        else {
            this.p.a = this.r.g() - flexboxLayoutManager$a.c;
        }
        final FlexboxLayoutManager.FlexboxLayoutManager$c p3 = this.p;
        p3.d = flexboxLayoutManager$a.a;
        p3.h = 1;
        p3.i = 1;
        p3.e = flexboxLayoutManager$a.c;
        p3.f = Integer.MIN_VALUE;
        p3.c = flexboxLayoutManager$a.b;
        if (b && this.l.size() > 1) {
            final int b3 = flexboxLayoutManager$a.b;
            if (b3 >= 0 && b3 < this.l.size() - 1) {
                final fd.c c = this.l.get(flexboxLayoutManager$a.b);
                final FlexboxLayoutManager.FlexboxLayoutManager$c p4 = this.p;
                ++p4.c;
                p4.d += c.d;
            }
        }
    }
    
    public final void y(final FlexboxLayoutManager.FlexboxLayoutManager$a flexboxLayoutManager$a, final boolean b, final boolean b2) {
        if (b2) {
            this.s();
        }
        else {
            this.p.b = false;
        }
        if (!this.q() && this.j) {
            this.p.a = this.A.getWidth() - flexboxLayoutManager$a.c - this.r.k();
        }
        else {
            this.p.a = flexboxLayoutManager$a.c - this.r.k();
        }
        final FlexboxLayoutManager.FlexboxLayoutManager$c p3 = this.p;
        p3.d = flexboxLayoutManager$a.a;
        p3.h = 1;
        p3.i = -1;
        p3.e = flexboxLayoutManager$a.c;
        p3.f = Integer.MIN_VALUE;
        final int b3 = flexboxLayoutManager$a.b;
        p3.c = b3;
        if (b && b3 > 0) {
            final int size = this.l.size();
            final int b4 = flexboxLayoutManager$a.b;
            if (size > b4) {
                final fd.c c = this.l.get(b4);
                final FlexboxLayoutManager.FlexboxLayoutManager$c p4 = this.p;
                --p4.c;
                p4.d -= c.d;
            }
        }
    }
    
    public final void z(final int n, final View view) {
        this.y.put(n, (Object)view);
    }
    
    public static final class b extends p implements fd.b
    {
        public static final Parcelable$Creator<b> CREATOR;
        public float j;
        public float k;
        public int l;
        public float m;
        public int n;
        public int o;
        public int p;
        public int q;
        public boolean r;
        
        static {
            CREATOR = (Parcelable$Creator)new FlexboxLayoutManager$b$a();
        }
        
        public b() {
            super(-2, -2);
            this.j = 0.0f;
            this.k = 1.0f;
            this.l = -1;
            this.m = -1.0f;
            this.p = 16777215;
            this.q = 16777215;
        }
        
        public b(final Context context, final AttributeSet set) {
            super(context, set);
            this.j = 0.0f;
            this.k = 1.0f;
            this.l = -1;
            this.m = -1.0f;
            this.p = 16777215;
            this.q = 16777215;
        }
        
        public b(final Parcel parcel) {
            super(-2, -2);
            this.j = 0.0f;
            this.k = 1.0f;
            this.l = -1;
            this.m = -1.0f;
            this.p = 16777215;
            this.q = 16777215;
            this.j = parcel.readFloat();
            this.k = parcel.readFloat();
            this.l = parcel.readInt();
            this.m = parcel.readFloat();
            this.n = parcel.readInt();
            this.o = parcel.readInt();
            this.p = parcel.readInt();
            this.q = parcel.readInt();
            this.r = (parcel.readByte() != 0);
            super.bottomMargin = parcel.readInt();
            super.leftMargin = parcel.readInt();
            super.rightMargin = parcel.readInt();
            super.topMargin = parcel.readInt();
            super.height = parcel.readInt();
            super.width = parcel.readInt();
        }
        
        public final boolean B0() {
            return this.r;
        }
        
        public final int D0() {
            return this.p;
        }
        
        public final int E() {
            return this.n;
        }
        
        public final int G() {
            return super.topMargin;
        }
        
        public final void M0(final int n) {
            this.n = n;
        }
        
        public final int N0() {
            return super.leftMargin;
        }
        
        public final int S0() {
            return super.rightMargin;
        }
        
        public final int U() {
            return super.bottomMargin;
        }
        
        public final int V0() {
            return this.o;
        }
        
        public final int W0() {
            return this.q;
        }
        
        public final int describeContents() {
            return 0;
        }
        
        public final int getHeight() {
            return super.height;
        }
        
        public final int getWidth() {
            return super.width;
        }
        
        public final int m0() {
            return this.l;
        }
        
        public final float n0() {
            return this.k;
        }
        
        public final void u0(final int o) {
            this.o = o;
        }
        
        public final float w0() {
            return this.j;
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeFloat(this.j);
            parcel.writeFloat(this.k);
            parcel.writeInt(this.l);
            parcel.writeFloat(this.m);
            parcel.writeInt(this.n);
            parcel.writeInt(this.o);
            parcel.writeInt(this.p);
            parcel.writeInt(this.q);
            parcel.writeByte((byte)(byte)(this.r ? 1 : 0));
            parcel.writeInt(super.bottomMargin);
            parcel.writeInt(super.leftMargin);
            parcel.writeInt(super.rightMargin);
            parcel.writeInt(super.topMargin);
            parcel.writeInt(super.height);
            parcel.writeInt(super.width);
        }
        
        public final float y0() {
            return this.m;
        }
    }
}

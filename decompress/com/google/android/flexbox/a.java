// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.flexbox;

import java.util.Iterator;
import a4.j;
import android.view.ViewGroup$MarginLayoutParams;
import java.util.Arrays;
import android.graphics.drawable.Drawable;
import android.view.View;
import ed.b;
import android.widget.CompoundButton;
import java.util.ArrayList;
import android.view.View$MeasureSpec;
import ed.c;
import java.util.List;

public final class a
{
    public final a a;
    public boolean[] b;
    public int[] c;
    public long[] d;
    public long[] e;
    
    public a(final a a) {
        this.a = a;
    }
    
    public final void a(final List<c> list, final c c, final int l, final int i) {
        c.i = i;
        this.a.getClass();
        c.l = l;
        list.add(c);
    }
    
    public final void b(final a a, int n, int n2, final int n3, int k, final int n4, final List<c> list) {
        final boolean q = ((FlexboxLayoutManager)this.a).q();
        final int mode = View$MeasureSpec.getMode(n);
        final int size = View$MeasureSpec.getSize(n);
        ArrayList a2;
        if (list == null) {
            a2 = new ArrayList();
        }
        else {
            a2 = (ArrayList)list;
        }
        a.a = a2;
        if (n4 == -1) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (q) {
            n = this.a.getPaddingStart();
        }
        else {
            n = this.a.getPaddingTop();
        }
        int n5;
        if (q) {
            n5 = this.a.getPaddingEnd();
        }
        else {
            n5 = this.a.getPaddingBottom();
        }
        int n6;
        if (q) {
            n6 = this.a.getPaddingTop();
        }
        else {
            n6 = this.a.getPaddingStart();
        }
        int n7;
        if (q) {
            n7 = this.a.getPaddingBottom();
        }
        else {
            n7 = this.a.getPaddingEnd();
        }
        c c = new c();
        c.k = k;
        final int n8 = n + n5;
        c.a = n8;
        final int m = ((FlexboxLayoutManager)this.a).m();
        n = 0;
        int n9 = 0;
        int n10 = Integer.MIN_VALUE;
        int i = k;
        final int n11 = n6;
        k = n2;
        final ArrayList list2 = a2;
        View l;
        int n12;
        int e;
        int d;
        CompoundButton compoundButton;
        b b;
        int d2;
        int t0;
        Drawable a3;
        int minimumHeight;
        int n13;
        b b2;
        int round;
        a a4;
        int n14;
        a a5;
        a a6;
        int combineMeasuredStates;
        int a7;
        int n15;
        int n16;
        int n17;
        FlexboxLayoutManager flexboxLayoutManager;
        int j;
        int n18;
        int n19;
        boolean b3 = false;
        a a8;
        a a9;
        int[] c2;
        int a10;
        int n20;
        int n21;
        int n22;
        FlexboxLayoutManager flexboxLayoutManager2;
        int n23;
        int n24;
        int n25;
        int n26;
        int n27;
        int max;
        int h;
        boolean b4;
        int size2;
        int n28;
        int n29;
        for (n2 = size; i < m; ++i, n = k, k = n2, n2 = n, n = n28) {
            l = ((FlexboxLayoutManager)this.a).l(i);
            if (l == null) {
                if (i == m - 1 && c.d - c.e != 0) {
                    this.a(list2, c, i, n);
                }
            }
            else {
                n12 = k;
                if (l.getVisibility() == 8) {
                    e = c.e + 1;
                    c.e = e;
                    d = c.d + 1;
                    c.d = d;
                    if (i == m - 1 && d - e != 0) {
                        this.a(list2, c, i, n);
                    }
                }
                else {
                    if (l instanceof CompoundButton) {
                        compoundButton = (CompoundButton)l;
                        b = (b)((View)compoundButton).getLayoutParams();
                        d2 = b.D();
                        t0 = b.T0();
                        a3 = e4.c.a(compoundButton);
                        if (a3 == null) {
                            k = 0;
                        }
                        else {
                            k = a3.getMinimumWidth();
                        }
                        if (a3 == null) {
                            minimumHeight = 0;
                        }
                        else {
                            minimumHeight = a3.getMinimumHeight();
                        }
                        n13 = d2;
                        if (d2 == -1) {
                            n13 = k;
                        }
                        b.L0(n13);
                        if ((k = t0) == -1) {
                            k = minimumHeight;
                        }
                        b.x0(k);
                    }
                    b2 = (b)l.getLayoutParams();
                    if (b2.o0() == 4) {
                        c.j.add(i);
                    }
                    if (q) {
                        k = b2.getWidth();
                    }
                    else {
                        k = b2.getHeight();
                    }
                    round = k;
                    if (b2.A0() != -1.0f) {
                        round = k;
                        if (mode == 1073741824) {
                            round = Math.round(b2.A0() * n2);
                        }
                    }
                    if (q) {
                        a4 = this.a;
                        k = b2.M0();
                        n14 = ((FlexboxLayoutManager)a4).j(b2.Q0() + (k + n8), round);
                        a5 = this.a;
                        k = b2.F();
                        k = ((FlexboxLayoutManager)a5).i(b2.U() + (k + (n11 + n7)) + n, b2.getHeight());
                        l.measure(n14, k);
                        this.r(l, i, n14, k);
                    }
                    else {
                        a6 = this.a;
                        k = b2.M0();
                        k = ((FlexboxLayoutManager)a6).j(b2.Q0() + (k + (n11 + n7)) + n, b2.getWidth());
                        n14 = ((FlexboxLayoutManager)this.a).i(b2.U() + (b2.F() + n8), round);
                        l.measure(k, n14);
                        this.r(l, i, k, n14);
                    }
                    ((FlexboxLayoutManager)this.a).z(i, l);
                    this.c(i, l);
                    combineMeasuredStates = View.combineMeasuredStates(n9, l.getMeasuredState());
                    a7 = c.a;
                    if (q) {
                        k = l.getMeasuredWidth();
                    }
                    else {
                        k = l.getMeasuredHeight();
                    }
                    if (q) {
                        n15 = b2.M0();
                    }
                    else {
                        n15 = b2.F();
                    }
                    if (q) {
                        n16 = b2.Q0();
                    }
                    else {
                        n16 = b2.U();
                    }
                    n17 = n16 + (n15 + k);
                    k = list2.size();
                    Label_1217: {
                        Label_1092: {
                            if (((FlexboxLayoutManager)this.a).f != 0) {
                                if (!b2.D0()) {
                                    if (mode == 0) {
                                        break Label_1092;
                                    }
                                    flexboxLayoutManager = (FlexboxLayoutManager)this.a;
                                    j = flexboxLayoutManager.i;
                                    if (j != -1 && j <= k + 1) {
                                        break Label_1092;
                                    }
                                    if (flexboxLayoutManager.q()) {
                                        n18 = flexboxLayoutManager.getLeftDecorationWidth(l);
                                        k = flexboxLayoutManager.getRightDecorationWidth(l);
                                    }
                                    else {
                                        n18 = flexboxLayoutManager.getTopDecorationHeight(l);
                                        k = flexboxLayoutManager.getBottomDecorationHeight(l);
                                    }
                                    n19 = k + n18;
                                    k = n17;
                                    if (n19 > 0) {
                                        k = n17 + n19;
                                    }
                                    if (n2 >= a7 + k) {
                                        break Label_1092;
                                    }
                                }
                                b3 = true;
                                break Label_1217;
                            }
                        }
                        b3 = false;
                    }
                    k = n2;
                    if (b3) {
                        if (c.d - c.e > 0) {
                            if (i > 0) {
                                n2 = i - 1;
                            }
                            else {
                                n2 = 0;
                            }
                            this.a(list2, c, n2, n);
                            n += c.c;
                        }
                        if (q) {
                            if (b2.getHeight() == -1) {
                                a8 = this.a;
                                n2 = a8.getPaddingTop();
                                l.measure(n14, ((FlexboxLayoutManager)a8).i(b2.U() + (b2.F() + (this.a.getPaddingBottom() + n2)) + n, b2.getHeight()));
                                this.c(i, l);
                            }
                        }
                        else if (b2.getWidth() == -1) {
                            a9 = this.a;
                            n2 = a9.getPaddingLeft();
                            l.measure(((FlexboxLayoutManager)a9).j(b2.Q0() + (b2.M0() + (this.a.getPaddingRight() + n2)) + n, b2.getWidth()), n14);
                            this.c(i, l);
                        }
                        c = new c();
                        c.d = 1;
                        c.a = n8;
                        c.k = i;
                        n2 = Integer.MIN_VALUE;
                    }
                    else {
                        ++c.d;
                        n2 = n10;
                    }
                    c.m |= (b2.z0() != 0.0f);
                    c.n |= (b2.q0() != 0.0f);
                    c2 = this.c;
                    if (c2 != null) {
                        c2[i] = list2.size();
                    }
                    a10 = c.a;
                    if (q) {
                        n20 = l.getMeasuredWidth();
                    }
                    else {
                        n20 = l.getMeasuredHeight();
                    }
                    if (q) {
                        n21 = b2.M0();
                    }
                    else {
                        n21 = b2.F();
                    }
                    if (q) {
                        n22 = b2.Q0();
                    }
                    else {
                        n22 = b2.U();
                    }
                    c.a = n22 + (n21 + n20) + a10;
                    c.f += b2.z0();
                    c.g += b2.q0();
                    flexboxLayoutManager2 = (FlexboxLayoutManager)this.a;
                    flexboxLayoutManager2.calculateItemDecorationsForChild(l, FlexboxLayoutManager.D);
                    if (flexboxLayoutManager2.q()) {
                        n23 = flexboxLayoutManager2.getRightDecorationWidth(l) + flexboxLayoutManager2.getLeftDecorationWidth(l);
                        c.a += n23;
                        c.b += n23;
                    }
                    else {
                        n24 = flexboxLayoutManager2.getBottomDecorationHeight(l) + flexboxLayoutManager2.getTopDecorationHeight(l);
                        c.a += n24;
                        c.b += n24;
                    }
                    if (q) {
                        n25 = l.getMeasuredHeight();
                    }
                    else {
                        n25 = l.getMeasuredWidth();
                    }
                    if (q) {
                        n26 = b2.F();
                    }
                    else {
                        n26 = b2.M0();
                    }
                    if (q) {
                        n27 = b2.U();
                    }
                    else {
                        n27 = b2.Q0();
                    }
                    max = Math.max(n2, ((FlexboxLayoutManager)this.a).k(l) + (n27 + (n26 + n25)));
                    c.c = Math.max(c.c, max);
                    if (q) {
                        if (((FlexboxLayoutManager)this.a).f != 2) {
                            h = c.h;
                            n2 = l.getBaseline();
                            c.h = Math.max(h, b2.F() + n2);
                        }
                        else {
                            n2 = c.h;
                            c.h = Math.max(n2, b2.U() + (l.getMeasuredHeight() - l.getBaseline()));
                        }
                    }
                    b4 = (i == m - 1 && c.d - c.e != 0);
                    n2 = n;
                    if (b4) {
                        this.a(list2, c, i, n);
                        n2 = n + c.c;
                    }
                    Label_2239: {
                        if (n4 != -1 && list2.size() > 0) {
                            size2 = list2.size();
                            n = 1;
                            if (((c)list2.get(size2 - 1)).l >= n4 && i >= n4 && n12 == 0) {
                                n2 = -c.c;
                                break Label_2239;
                            }
                        }
                        n = n12;
                    }
                    if (n2 > n3 && n != 0) {
                        break;
                    }
                    n9 = combineMeasuredStates;
                    n10 = max;
                    n28 = n2;
                    n2 = n;
                    continue;
                }
            }
            n29 = n2;
            n2 = k;
            k = n29;
            n28 = n;
        }
    }
    
    public final void c(final int n, final View view) {
        final b b = (b)view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        final int measuredHeight = view.getMeasuredHeight();
        final int d = b.D();
        int n2 = 1;
        int n4 = 0;
        Label_0085: {
            int n3;
            if (measuredWidth < d) {
                n3 = b.D();
            }
            else {
                if (measuredWidth <= b.F0()) {
                    n4 = 0;
                    break Label_0085;
                }
                n3 = b.F0();
            }
            final int n5 = 1;
            measuredWidth = n3;
            n4 = n5;
        }
        int n6;
        if (measuredHeight < b.T0()) {
            n6 = b.T0();
        }
        else if (measuredHeight > b.U0()) {
            n6 = b.U0();
        }
        else {
            n2 = n4;
            n6 = measuredHeight;
        }
        if (n2 != 0) {
            final int measureSpec = View$MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(n6, 1073741824);
            view.measure(measureSpec, measureSpec2);
            this.r(view, n, measureSpec, measureSpec2);
            ((FlexboxLayoutManager)this.a).z(n, view);
        }
    }
    
    public final void d(final int n, final List list) {
        int n2;
        if ((n2 = this.c[n]) == -1) {
            n2 = 0;
        }
        if (list.size() > n2) {
            list.subList(n2, list.size()).clear();
        }
        final int[] c = this.c;
        final int n3 = c.length - 1;
        if (n > n3) {
            Arrays.fill(c, -1);
        }
        else {
            Arrays.fill(c, n, n3, -1);
        }
        final long[] d = this.d;
        final int n4 = d.length - 1;
        if (n > n4) {
            Arrays.fill(d, 0L);
        }
        else {
            Arrays.fill(d, n, n4, 0L);
        }
    }
    
    public final void e(final int n, final int n2, int size) {
        final int m = ((FlexboxLayoutManager)this.a).m();
        final boolean[] b = this.b;
        final int n3 = 0;
        if (b == null) {
            this.b = new boolean[Math.max(m, 10)];
        }
        else if (b.length < m) {
            this.b = new boolean[Math.max(b.length * 2, m)];
        }
        else {
            Arrays.fill(b, false);
        }
        if (size >= ((FlexboxLayoutManager)this.a).m()) {
            return;
        }
        final a a = this.a;
        final int e = ((FlexboxLayoutManager)a).e;
        final int e2 = ((FlexboxLayoutManager)a).e;
        int n5;
        int n6;
        int n7;
        if (e2 != 0 && e2 != 1) {
            if (e2 != 2 && e2 != 3) {
                throw new IllegalArgumentException(d.h("Invalid flex direction: ", e));
            }
            final int mode = View$MeasureSpec.getMode(n2);
            int n4 = View$MeasureSpec.getSize(n2);
            if (mode != 1073741824) {
                n4 = ((FlexboxLayoutManager)this.a).n();
            }
            n5 = this.a.getPaddingTop();
            n6 = this.a.getPaddingBottom();
            n7 = n4;
        }
        else {
            final int mode2 = View$MeasureSpec.getMode(n);
            int n8 = View$MeasureSpec.getSize(n);
            final int n9 = ((FlexboxLayoutManager)this.a).n();
            if (mode2 != 1073741824) {
                n8 = Math.min(n9, n8);
            }
            n5 = this.a.getPaddingLeft();
            n6 = this.a.getPaddingRight();
            n7 = n8;
        }
        final int n10 = n6 + n5;
        final int[] c = this.c;
        int i = n3;
        if (c != null) {
            i = c[size];
        }
        final List<c> l = ((FlexboxLayoutManager)this.a).l;
        c c2;
        int a2;
        for (size = l.size(); i < size; ++i) {
            c2 = l.get(i);
            a2 = c2.a;
            if (a2 < n7 && c2.m) {
                this.i(n, n2, c2, n7, n10, false);
            }
            else if (a2 > n7 && c2.n) {
                this.n(n, n2, c2, n7, n10, false);
            }
        }
    }
    
    public final void f(int max) {
        final int[] c = this.c;
        if (c == null) {
            this.c = new int[Math.max(max, 10)];
        }
        else if (c.length < max) {
            max = Math.max(c.length * 2, max);
            this.c = Arrays.copyOf(this.c, max);
        }
    }
    
    public final void g(int max) {
        final long[] d = this.d;
        if (d == null) {
            this.d = new long[Math.max(max, 10)];
        }
        else if (d.length < max) {
            max = Math.max(d.length * 2, max);
            this.d = Arrays.copyOf(this.d, max);
        }
    }
    
    public final void h(int max) {
        final long[] e = this.e;
        if (e == null) {
            this.e = new long[Math.max(max, 10)];
        }
        else if (e.length < max) {
            max = Math.max(e.length * 2, max);
            this.e = Arrays.copyOf(this.e, max);
        }
    }
    
    public final void i(final int n, final int n2, final c c, final int n3, final int n4, final boolean b) {
        final float f = c.f;
        if (f > 0.0f) {
            int a = c.a;
            if (n3 >= a) {
                final float n5 = (n3 - a) / f;
                c.a = n4 + c.b;
                if (!b) {
                    c.c = Integer.MIN_VALUE;
                }
                int i = 0;
                int n7;
                int n6 = n7 = 0;
                float n8 = 0.0f;
                while (i < c.d) {
                    final int n9 = c.k + i;
                    final View l = ((FlexboxLayoutManager)this.a).l(n9);
                    if (l != null) {
                        if (l.getVisibility() != 8) {
                            final b b2 = (b)l.getLayoutParams();
                            final int e = ((FlexboxLayoutManager)this.a).e;
                            int max2;
                            if (e != 0 && e != 1) {
                                int n10 = l.getMeasuredHeight();
                                final long[] e2 = this.e;
                                if (e2 != null) {
                                    n10 = (int)(e2[n9] >> 32);
                                }
                                int n11 = l.getMeasuredWidth();
                                final long[] e3 = this.e;
                                if (e3 != null) {
                                    n11 = (int)e3[n9];
                                }
                                if (!this.b[n9] && b2.z0() > 0.0f) {
                                    final float n12 = b2.z0() * n5 + n10;
                                    float n13 = n8;
                                    float n14 = n12;
                                    if (i == c.d - 1) {
                                        n14 = n12 + n8;
                                        n13 = 0.0f;
                                    }
                                    int n15 = Math.round(n14);
                                    Label_0410: {
                                        if (n15 > b2.U0()) {
                                            n15 = b2.U0();
                                            this.b[n9] = true;
                                            c.f -= b2.z0();
                                            n6 = 1;
                                            n8 = n13;
                                        }
                                        else {
                                            n8 = n14 - n15 + n13;
                                            final double n16 = n8;
                                            double n17;
                                            if (n16 > 1.0) {
                                                ++n15;
                                                n17 = n16 - 1.0;
                                            }
                                            else {
                                                if (n16 >= -1.0) {
                                                    break Label_0410;
                                                }
                                                --n15;
                                                n17 = n16 + 1.0;
                                            }
                                            n8 = (float)n17;
                                        }
                                    }
                                    final int k = this.k(n, b2, c.i);
                                    final int measureSpec = View$MeasureSpec.makeMeasureSpec(n15, 1073741824);
                                    l.measure(k, measureSpec);
                                    n11 = l.getMeasuredWidth();
                                    n10 = l.getMeasuredHeight();
                                    this.r(l, n9, k, measureSpec);
                                    ((FlexboxLayoutManager)this.a).z(n9, l);
                                }
                                final int max = Math.max(n7, ((FlexboxLayoutManager)this.a).k(l) + (b2.Q0() + (b2.M0() + n11)));
                                c.a += b2.U() + (b2.F() + n10);
                                max2 = max;
                            }
                            else {
                                final int measuredWidth = l.getMeasuredWidth();
                                final long[] e4 = this.e;
                                final int n18 = a;
                                int measuredWidth2 = measuredWidth;
                                if (e4 != null) {
                                    measuredWidth2 = (int)e4[n9];
                                }
                                int n19 = l.getMeasuredHeight();
                                final long[] e5 = this.e;
                                if (e5 != null) {
                                    n19 = (int)(e5[n9] >> 32);
                                }
                                if (!this.b[n9] && b2.z0() > 0.0f) {
                                    final float n20 = b2.z0() * n5 + measuredWidth2;
                                    float n21 = n8;
                                    float n22 = n20;
                                    if (i == c.d - 1) {
                                        n22 = n20 + n8;
                                        n21 = 0.0f;
                                    }
                                    final int round = Math.round(n22);
                                    int f2 = 0;
                                    Label_0836: {
                                        if (round > b2.F0()) {
                                            f2 = b2.F0();
                                            this.b[n9] = true;
                                            c.f -= b2.z0();
                                            n6 = 1;
                                            n8 = n21;
                                        }
                                        else {
                                            n8 = n22 - round + n21;
                                            final double n23 = n8;
                                            double n24;
                                            if (n23 > 1.0) {
                                                f2 = round + 1;
                                                n24 = n23 - 1.0;
                                            }
                                            else {
                                                f2 = round;
                                                if (n23 >= -1.0) {
                                                    break Label_0836;
                                                }
                                                f2 = round - 1;
                                                n24 = n23 + 1.0;
                                            }
                                            n8 = (float)n24;
                                        }
                                    }
                                    final int j = this.j(n2, b2, c.i);
                                    final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(f2, 1073741824);
                                    l.measure(measureSpec2, j);
                                    measuredWidth2 = l.getMeasuredWidth();
                                    n19 = l.getMeasuredHeight();
                                    this.r(l, n9, measureSpec2, j);
                                    ((FlexboxLayoutManager)this.a).z(n9, l);
                                }
                                max2 = Math.max(n7, ((FlexboxLayoutManager)this.a).k(l) + (b2.U() + (b2.F() + n19)));
                                c.a += b2.Q0() + (b2.M0() + measuredWidth2);
                                a = n18;
                            }
                            c.c = Math.max(c.c, max2);
                            n7 = max2;
                        }
                    }
                    ++i;
                }
                if (n6 != 0 && a != c.a) {
                    this.i(n, n2, c, n3, n4, true);
                }
            }
        }
    }
    
    public final int j(int n, final b b, int i) {
        final a a = this.a;
        final int paddingTop = a.getPaddingTop();
        final int paddingBottom = this.a.getPaddingBottom();
        final int f = b.F();
        n = b.U();
        i = ((FlexboxLayoutManager)a).i(n + (f + (paddingBottom + paddingTop)) + i, b.getHeight());
        final int size = View$MeasureSpec.getSize(i);
        if (size > b.U0()) {
            n = View$MeasureSpec.makeMeasureSpec(b.U0(), View$MeasureSpec.getMode(i));
        }
        else {
            n = i;
            if (size < b.T0()) {
                n = View$MeasureSpec.makeMeasureSpec(b.T0(), View$MeasureSpec.getMode(i));
            }
        }
        return n;
    }
    
    public final int k(int n, final b b, int j) {
        final a a = this.a;
        final int paddingLeft = a.getPaddingLeft();
        final int paddingRight = this.a.getPaddingRight();
        final int m0 = b.M0();
        final int q0 = b.Q0();
        n = b.getWidth();
        j = ((FlexboxLayoutManager)a).j(q0 + (m0 + (paddingRight + paddingLeft)) + j, n);
        final int size = View$MeasureSpec.getSize(j);
        if (size > b.F0()) {
            n = View$MeasureSpec.makeMeasureSpec(b.F0(), View$MeasureSpec.getMode(j));
        }
        else {
            n = j;
            if (size < b.D()) {
                n = View$MeasureSpec.makeMeasureSpec(b.D(), View$MeasureSpec.getMode(j));
            }
        }
        return n;
    }
    
    public final void l(final View view, final c c, final int n, int n2, final int n3, int measuredHeight) {
        final b b = (b)view.getLayoutParams();
        int n4 = ((FlexboxLayoutManager)this.a).h;
        if (b.o0() != -1) {
            n4 = b.o0();
        }
        final int c2 = c.c;
        if (n4 != 0) {
            if (n4 != 1) {
                if (n4 != 2) {
                    if (n4 != 3) {
                        if (n4 != 4) {
                            return;
                        }
                    }
                    else {
                        if (((FlexboxLayoutManager)this.a).f != 2) {
                            final int max = Math.max(c.h - view.getBaseline(), b.F());
                            view.layout(n, n2 + max, n3, measuredHeight + max);
                            return;
                        }
                        final int max2 = Math.max(view.getBaseline() + (c.h - view.getMeasuredHeight()), b.U());
                        view.layout(n, n2 - max2, n3, measuredHeight - max2);
                        return;
                    }
                }
                else {
                    measuredHeight = view.getMeasuredHeight();
                    measuredHeight = (b.F() + (c2 - measuredHeight) - b.U()) / 2;
                    if (((FlexboxLayoutManager)this.a).f != 2) {
                        n2 += measuredHeight;
                        view.layout(n, n2, n3, view.getMeasuredHeight() + n2);
                        return;
                    }
                    n2 -= measuredHeight;
                    view.layout(n, n2, n3, view.getMeasuredHeight() + n2);
                    return;
                }
            }
            else {
                if (((FlexboxLayoutManager)this.a).f != 2) {
                    n2 += c2;
                    view.layout(n, n2 - view.getMeasuredHeight() - b.U(), n3, n2 - b.U());
                    return;
                }
                view.layout(n, b.F() + (view.getMeasuredHeight() + (n2 - c2)), n3, b.F() + (view.getMeasuredHeight() + (measuredHeight - c2)));
                return;
            }
        }
        if (((FlexboxLayoutManager)this.a).f != 2) {
            view.layout(n, b.F() + n2, n3, b.F() + measuredHeight);
        }
        else {
            view.layout(n, n2 - b.U(), n3, measuredHeight - b.U());
        }
    }
    
    public final void m(final View view, final c c, final boolean b, final int n, final int n2, final int n3, final int n4) {
        final b b2 = (b)view.getLayoutParams();
        int n5 = ((FlexboxLayoutManager)this.a).h;
        if (b2.o0() != -1) {
            n5 = b2.o0();
        }
        final int c2 = c.c;
        if (n5 != 0) {
            if (n5 != 1) {
                if (n5 != 2) {
                    if (n5 != 3 && n5 != 4) {
                        return;
                    }
                }
                else {
                    final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
                    final int n6 = (j.c(viewGroup$MarginLayoutParams) + (c2 - view.getMeasuredWidth()) - j.b(viewGroup$MarginLayoutParams)) / 2;
                    if (!b) {
                        view.layout(n + n6, n2, n3 + n6, n4);
                        return;
                    }
                    view.layout(n - n6, n2, n3 - n6, n4);
                    return;
                }
            }
            else {
                if (!b) {
                    view.layout(n + c2 - view.getMeasuredWidth() - b2.Q0(), n2, n3 + c2 - view.getMeasuredWidth() - b2.Q0(), n4);
                    return;
                }
                view.layout(b2.M0() + (view.getMeasuredWidth() + (n - c2)), n2, b2.M0() + (view.getMeasuredWidth() + (n3 - c2)), n4);
                return;
            }
        }
        if (!b) {
            view.layout(b2.M0() + n, n2, b2.M0() + n3, n4);
        }
        else {
            view.layout(n - b2.Q0(), n2, n3 - b2.Q0(), n4);
        }
    }
    
    public final void n(final int n, final int n2, final c c, final int n3, final int n4, final boolean b) {
        final int a = c.a;
        final float g = c.g;
        if (g > 0.0f) {
            if (n3 <= a) {
                final float n5 = (a - n3) / g;
                c.a = n4 + c.b;
                if (!b) {
                    c.c = Integer.MIN_VALUE;
                }
                int i = 0;
                int n7;
                int n6 = n7 = 0;
                float n8 = 0.0f;
                while (i < c.d) {
                    final int n9 = c.k + i;
                    final View l = ((FlexboxLayoutManager)this.a).l(n9);
                    if (l != null) {
                        if (l.getVisibility() != 8) {
                            final b b2 = (b)l.getLayoutParams();
                            final int e = ((FlexboxLayoutManager)this.a).e;
                            int n18;
                            if (e != 0 && e != 1) {
                                int n10 = l.getMeasuredHeight();
                                final long[] e2 = this.e;
                                if (e2 != null) {
                                    n10 = (int)(e2[n9] >> 32);
                                }
                                int n11 = l.getMeasuredWidth();
                                final long[] e3 = this.e;
                                if (e3 != null) {
                                    n11 = (int)e3[n9];
                                }
                                if (!this.b[n9] && b2.q0() > 0.0f) {
                                    final float n12 = n10 - b2.q0() * n5;
                                    float n13 = n8;
                                    float n14 = n12;
                                    if (i == c.d - 1) {
                                        n14 = n12 + n8;
                                        n13 = 0.0f;
                                    }
                                    final int round = Math.round(n14);
                                    int t0;
                                    if (round < b2.T0()) {
                                        t0 = b2.T0();
                                        this.b[n9] = true;
                                        c.g -= b2.q0();
                                        n6 = 1;
                                    }
                                    else {
                                        final float n15 = n14 - round + n13;
                                        final double n16 = n15;
                                        float n17;
                                        if (n16 > 1.0) {
                                            t0 = round + 1;
                                            n17 = n15 - 1.0f;
                                        }
                                        else {
                                            n17 = n15;
                                            t0 = round;
                                            if (n16 < -1.0) {
                                                t0 = round - 1;
                                                n17 = n15 + 1.0f;
                                            }
                                        }
                                        n13 = n17;
                                    }
                                    final int k = this.k(n, b2, c.i);
                                    final int measureSpec = View$MeasureSpec.makeMeasureSpec(t0, 1073741824);
                                    l.measure(k, measureSpec);
                                    n11 = l.getMeasuredWidth();
                                    n10 = l.getMeasuredHeight();
                                    this.r(l, n9, k, measureSpec);
                                    ((FlexboxLayoutManager)this.a).z(n9, l);
                                    n8 = n13;
                                }
                                final int max = Math.max(n7, ((FlexboxLayoutManager)this.a).k(l) + (b2.Q0() + (b2.M0() + n11)));
                                c.a += b2.U() + (b2.F() + n10);
                                n18 = max;
                            }
                            else {
                                int n19 = l.getMeasuredWidth();
                                final long[] e4 = this.e;
                                if (e4 != null) {
                                    n19 = (int)e4[n9];
                                }
                                int n20 = l.getMeasuredHeight();
                                final long[] e5 = this.e;
                                if (e5 != null) {
                                    n20 = (int)(e5[n9] >> 32);
                                }
                                if (!this.b[n9] && b2.q0() > 0.0f) {
                                    float n22;
                                    final float n21 = n22 = n19 - b2.q0() * n5;
                                    float n23 = n8;
                                    if (i == c.d - 1) {
                                        n22 = n21 + n8;
                                        n23 = 0.0f;
                                    }
                                    final int round2 = Math.round(n22);
                                    int d;
                                    if (round2 < b2.D()) {
                                        d = b2.D();
                                        this.b[n9] = true;
                                        c.g -= b2.q0();
                                        n6 = 1;
                                        n8 = n23;
                                    }
                                    else {
                                        final float n24 = n22 - round2 + n23;
                                        final double n25 = n24;
                                        if (n25 > 1.0) {
                                            d = round2 + 1;
                                            n8 = n24 - 1.0f;
                                        }
                                        else {
                                            n8 = n24;
                                            d = round2;
                                            if (n25 < -1.0) {
                                                d = round2 - 1;
                                                n8 = n24 + 1.0f;
                                            }
                                        }
                                    }
                                    final int j = this.j(n2, b2, c.i);
                                    final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(d, 1073741824);
                                    l.measure(measureSpec2, j);
                                    n19 = l.getMeasuredWidth();
                                    n20 = l.getMeasuredHeight();
                                    this.r(l, n9, measureSpec2, j);
                                    ((FlexboxLayoutManager)this.a).z(n9, l);
                                }
                                final int max2 = Math.max(n7, ((FlexboxLayoutManager)this.a).k(l) + (b2.U() + (b2.F() + n20)));
                                c.a += b2.Q0() + (b2.M0() + n19);
                                n18 = max2;
                            }
                            c.c = Math.max(c.c, n18);
                            n7 = n18;
                        }
                    }
                    ++i;
                }
                if (n6 != 0 && a != c.a) {
                    this.n(n, n2, c, n3, n4, true);
                }
            }
        }
    }
    
    public final void o(final View view, int n, final int n2) {
        final b b = (b)view.getLayoutParams();
        final int min = Math.min(Math.max(n - b.M0() - b.Q0() - ((FlexboxLayoutManager)this.a).k(view), b.D()), b.F0());
        final long[] e = this.e;
        if (e != null) {
            n = (int)(e[n2] >> 32);
        }
        else {
            n = view.getMeasuredHeight();
        }
        n = View$MeasureSpec.makeMeasureSpec(n, 1073741824);
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(measureSpec, n);
        this.r(view, n2, measureSpec, n);
        ((FlexboxLayoutManager)this.a).z(n2, view);
    }
    
    public final void p(final View view, int n, final int n2) {
        final b b = (b)view.getLayoutParams();
        final int min = Math.min(Math.max(n - b.F() - b.U() - ((FlexboxLayoutManager)this.a).k(view), b.T0()), b.U0());
        final long[] e = this.e;
        if (e != null) {
            n = (int)e[n2];
        }
        else {
            n = view.getMeasuredWidth();
        }
        n = View$MeasureSpec.makeMeasureSpec(n, 1073741824);
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(n, measureSpec);
        this.r(view, n2, n, measureSpec);
        ((FlexboxLayoutManager)this.a).z(n2, view);
    }
    
    public final void q(int i) {
        if (i >= ((FlexboxLayoutManager)this.a).m()) {
            return;
        }
        final FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager)this.a;
        final int e = flexboxLayoutManager.e;
        if (flexboxLayoutManager.h == 4) {
            final int[] c = this.c;
            if (c != null) {
                i = c[i];
            }
            else {
                i = 0;
            }
            for (List<c> l = flexboxLayoutManager.l; i < l.size(); ++i) {
                final c c2 = l.get(i);
                for (int d = c2.d, j = 0; j < d; ++j) {
                    final int n = c2.k + j;
                    if (j < ((FlexboxLayoutManager)this.a).m()) {
                        final View k = ((FlexboxLayoutManager)this.a).l(n);
                        if (k != null) {
                            if (k.getVisibility() != 8) {
                                final b b = (b)k.getLayoutParams();
                                if (b.o0() == -1 || b.o0() == 4) {
                                    if (e != 0 && e != 1) {
                                        if (e != 2 && e != 3) {
                                            throw new IllegalArgumentException(d.h("Invalid flex direction: ", e));
                                        }
                                        this.o(k, c2.c, n);
                                    }
                                    else {
                                        this.p(k, c2.c, n);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        else {
            for (final c c3 : flexboxLayoutManager.l) {
                for (final Integer n2 : c3.j) {
                    final a a = this.a;
                    i = n2;
                    final View m = ((FlexboxLayoutManager)a).l(i);
                    if (e != 0 && e != 1) {
                        if (e != 2 && e != 3) {
                            throw new IllegalArgumentException(d.h("Invalid flex direction: ", e));
                        }
                        this.o(m, c3.c, n2);
                    }
                    else {
                        this.p(m, c3.c, n2);
                    }
                }
            }
        }
    }
    
    public final void r(final View view, final int n, int measuredWidth, final int n2) {
        final long[] d = this.d;
        if (d != null) {
            d[n] = (((long)measuredWidth & 0xFFFFFFFFL) | (long)n2 << 32);
        }
        final long[] e = this.e;
        if (e != null) {
            measuredWidth = view.getMeasuredWidth();
            e[n] = (((long)measuredWidth & 0xFFFFFFFFL) | (long)view.getMeasuredHeight() << 32);
        }
    }
    
    public static final class a
    {
        public List<c> a;
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package androidx.viewpager2.widget;

import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.util.Locale;
import java.util.Comparator;
import java.util.Arrays;
import z5.a;
import z5.b;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public final class d extends t
{
    public ViewPager2$e f;
    public final ViewPager2 g;
    public final RecyclerView h;
    public final LinearLayoutManager i;
    public int j;
    public int k;
    public d.d$a l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    
    public d(final ViewPager2 g) {
        this.g = g;
        final ViewPager2.i o = g.o;
        this.h = o;
        this.i = (LinearLayoutManager)o.getLayoutManager();
        this.l = new d.d$a();
        this.b();
    }
    
    public final void a(final int k) {
        if (this.j == 3 && this.k == 0) {
            return;
        }
        if (this.k == k) {
            return;
        }
        this.k = k;
        final ViewPager2$e f = this.f;
        if (f != null) {
            f.a(k);
        }
    }
    
    public final void b() {
        this.j = 0;
        this.k = 0;
        final d.d$a l = this.l;
        l.a = -1;
        l.b = 0.0f;
        l.c = 0;
        this.m = -1;
        this.n = -1;
        this.o = false;
        this.p = false;
        this.r = false;
        this.q = false;
    }
    
    public final void c() {
        final d.d$a l = this.l;
        final int firstVisibleItemPosition = this.i.findFirstVisibleItemPosition();
        l.a = firstVisibleItemPosition;
        float b = 0.0f;
        if (firstVisibleItemPosition == -1) {
            l.a = -1;
            l.b = 0.0f;
            l.c = 0;
            return;
        }
        final View viewByPosition = this.i.findViewByPosition(firstVisibleItemPosition);
        if (viewByPosition == null) {
            l.a = -1;
            l.b = 0.0f;
            l.c = 0;
            return;
        }
        final int leftDecorationWidth = ((RecyclerView.o)this.i).getLeftDecorationWidth(viewByPosition);
        final int rightDecorationWidth = ((RecyclerView.o)this.i).getRightDecorationWidth(viewByPosition);
        final int topDecorationHeight = ((RecyclerView.o)this.i).getTopDecorationHeight(viewByPosition);
        final int bottomDecorationHeight = ((RecyclerView.o)this.i).getBottomDecorationHeight(viewByPosition);
        final ViewGroup$LayoutParams layoutParams = viewByPosition.getLayoutParams();
        int n = leftDecorationWidth;
        int n2 = rightDecorationWidth;
        int n3 = topDecorationHeight;
        int n4 = bottomDecorationHeight;
        if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
            n = leftDecorationWidth + viewGroup$MarginLayoutParams.leftMargin;
            n2 = rightDecorationWidth + viewGroup$MarginLayoutParams.rightMargin;
            n3 = topDecorationHeight + viewGroup$MarginLayoutParams.topMargin;
            n4 = bottomDecorationHeight + viewGroup$MarginLayoutParams.bottomMargin;
        }
        final int n5 = viewByPosition.getHeight() + n3 + n4;
        final int width = viewByPosition.getWidth();
        int n9;
        int n10;
        if (this.i.getOrientation() == 0) {
            final int n6 = viewByPosition.getLeft() - n - ((View)this.h).getPaddingLeft();
            final boolean b2 = ((RecyclerView.o)this.g.l).getLayoutDirection() == 1;
            int n7 = n6;
            if (b2) {
                n7 = -n6;
            }
            final int n8 = width + n + n2;
            n9 = n7;
            n10 = n8;
        }
        else {
            n9 = viewByPosition.getTop() - n3 - ((View)this.h).getPaddingTop();
            n10 = n5;
        }
        final int c = -n9;
        l.c = c;
        if (c >= 0) {
            if (n10 != 0) {
                b = c / (float)n10;
            }
            l.b = b;
            return;
        }
        final LinearLayoutManager i = this.i;
        final b b3 = new b(i);
        final int childCount = ((RecyclerView.o)i).getChildCount();
        boolean b6 = false;
        Label_0670: {
            if (childCount != 0) {
                final boolean b4 = b3.a.getOrientation() == 0;
                final int[][] array = new int[childCount][2];
                for (int j = 0; j < childCount; ++j) {
                    final View child = ((RecyclerView.o)b3.a).getChildAt(j);
                    if (child == null) {
                        throw new IllegalStateException("null view contained in the view hierarchy");
                    }
                    final ViewGroup$LayoutParams layoutParams2 = child.getLayoutParams();
                    ViewGroup$MarginLayoutParams b5;
                    if (layoutParams2 instanceof ViewGroup$MarginLayoutParams) {
                        b5 = (ViewGroup$MarginLayoutParams)layoutParams2;
                    }
                    else {
                        b5 = z5.b.b;
                    }
                    final int[] array2 = array[j];
                    int n11;
                    int n12;
                    if (b4) {
                        n11 = child.getLeft();
                        n12 = b5.leftMargin;
                    }
                    else {
                        n11 = child.getTop();
                        n12 = b5.topMargin;
                    }
                    array2[0] = n11 - n12;
                    final int[] array3 = array[j];
                    int n13;
                    int n14;
                    if (b4) {
                        n13 = child.getRight();
                        n14 = b5.rightMargin;
                    }
                    else {
                        n13 = child.getBottom();
                        n14 = b5.bottomMargin;
                    }
                    array3[1] = n13 + n14;
                }
                Arrays.sort(array, new a());
                while (true) {
                    for (int k = 1; k < childCount; ++k) {
                        if (array[k - 1][1] != array[k][0]) {
                            b6 = false;
                            break Label_0670;
                        }
                    }
                    final int[] array4 = array[0];
                    final int n15 = array4[1];
                    final int n16 = array4[0];
                    if (n16 > 0) {
                        continue;
                    }
                    if (array[childCount - 1][1] < n15 - n16) {
                        continue;
                    }
                    break;
                }
            }
            b6 = true;
        }
        boolean b8 = false;
        Label_0743: {
            Label_0741: {
                if (!b6 || ((RecyclerView.o)b3.a).getChildCount() <= 1) {
                    final int childCount2 = ((RecyclerView.o)b3.a).getChildCount();
                    int n17 = 0;
                    while (true) {
                        while (n17 < childCount2) {
                            if (z5.b.a(((RecyclerView.o)b3.a).getChildAt(n17))) {
                                final boolean b7 = true;
                                if (b7) {
                                    b8 = true;
                                    break Label_0743;
                                }
                                break Label_0741;
                            }
                            else {
                                ++n17;
                            }
                        }
                        final boolean b7 = false;
                        continue;
                    }
                }
            }
            b8 = false;
        }
        if (b8) {
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
        throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", l.c));
    }
    
    @Override
    public final void onScrollStateChanged(final RecyclerView recyclerView, int m) {
        final int j = this.j;
        final boolean b = true;
        if ((j != 1 || this.k != 1) && m == 1) {
            this.r = false;
            this.j = 1;
            m = this.n;
            if (m != -1) {
                this.m = m;
                this.n = -1;
            }
            else if (this.m == -1) {
                this.m = this.i.findFirstVisibleItemPosition();
            }
            this.a(1);
            return;
        }
        if ((j == 1 || j == 4) && m == 2) {
            if (this.p) {
                this.a(2);
                this.o = true;
            }
            return;
        }
        if ((j == 1 || j == 4) && m == 0) {
            this.c();
            int n;
            if (!this.p) {
                final int a = this.l.a;
                n = (b ? 1 : 0);
                if (a != -1) {
                    final ViewPager2$e f = this.f;
                    n = (b ? 1 : 0);
                    if (f != null) {
                        f.b(a, 0.0f, 0);
                        n = (b ? 1 : 0);
                    }
                }
            }
            else {
                final d.d$a l = this.l;
                if (l.c == 0) {
                    final int i = this.m;
                    final int a2 = l.a;
                    n = (b ? 1 : 0);
                    if (i != a2) {
                        final ViewPager2$e f2 = this.f;
                        n = (b ? 1 : 0);
                        if (f2 != null) {
                            f2.c(a2);
                            n = (b ? 1 : 0);
                        }
                    }
                }
                else {
                    n = 0;
                }
            }
            if (n != 0) {
                this.a(0);
                this.b();
            }
        }
        if (this.j == 2 && m == 0 && this.q) {
            this.c();
            final d.d$a k = this.l;
            if (k.c == 0) {
                m = this.n;
                final int a3 = k.a;
                if (m != a3) {
                    if ((m = a3) == -1) {
                        m = 0;
                    }
                    final ViewPager2$e f3 = this.f;
                    if (f3 != null) {
                        f3.c(m);
                    }
                }
                this.a(0);
                this.b();
            }
        }
    }
    
    @Override
    public final void onScrolled(final RecyclerView recyclerView, int n, int n2) {
        this.p = true;
        this.c();
        if (this.o) {
            this.o = false;
            Label_0076: {
                Label_0074: {
                    if (n2 <= 0) {
                        if (n2 == 0) {
                            if (n < 0) {
                                n = 1;
                            }
                            else {
                                n = 0;
                            }
                            if (((RecyclerView.o)this.g.l).getLayoutDirection() == 1) {
                                n2 = 1;
                            }
                            else {
                                n2 = 0;
                            }
                            if (n == n2) {
                                break Label_0074;
                            }
                        }
                        n = 0;
                        break Label_0076;
                    }
                }
                n = 1;
            }
            Label_0110: {
                if (n != 0) {
                    final d.d$a l = this.l;
                    if (l.c != 0) {
                        n = l.a + 1;
                        break Label_0110;
                    }
                }
                n = this.l.a;
            }
            this.n = n;
            if (this.m != n) {
                final ViewPager2$e f = this.f;
                if (f != null) {
                    f.c(n);
                }
            }
        }
        else if (this.j == 0) {
            n2 = this.l.a;
            if ((n = n2) == -1) {
                n = 0;
            }
            final ViewPager2$e f2 = this.f;
            if (f2 != null) {
                f2.c(n);
            }
        }
        final d.d$a i = this.l;
        n2 = i.a;
        if ((n = n2) == -1) {
            n = 0;
        }
        final float b = i.b;
        n2 = i.c;
        final ViewPager2$e f3 = this.f;
        if (f3 != null) {
            f3.b(n, b, n2);
        }
        final d.d$a j = this.l;
        n2 = j.a;
        n = this.n;
        if ((n2 == n || n == -1) && j.c == 0 && this.k != 1) {
            this.a(0);
            this.b();
        }
    }
}

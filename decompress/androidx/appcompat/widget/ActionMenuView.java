// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.widget.ImageView;
import androidx.appcompat.view.menu.a;
import java.util.Iterator;
import a4.z;
import android.view.ViewDebug$ExportedProperty;
import android.view.ContextThemeWrapper;
import androidx.appcompat.view.menu.ActionMenuItemView;
import android.view.ViewGroup;
import android.view.View$MeasureSpec;
import a40.f;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import androidx.appcompat.view.menu.i;
import android.view.Menu;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.MenuItem;
import androidx.appcompat.view.menu.g;
import android.view.ViewGroup$LayoutParams;
import android.util.AttributeSet;
import androidx.appcompat.view.menu.MenuBuilder$a;
import androidx.appcompat.view.menu.i$a;
import android.content.Context;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.MenuBuilder$b;

public class ActionMenuView extends LinearLayoutCompat implements MenuBuilder$b, j
{
    public MenuBuilder f;
    public Context g;
    public int h;
    public boolean i;
    public androidx.appcompat.widget.c j;
    public i$a k;
    public MenuBuilder$a l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public ActionMenuView$e q;
    
    public ActionMenuView() {
        throw null;
    }
    
    public ActionMenuView(final Context g, final AttributeSet set) {
        super(g, set);
        this.setBaselineAligned(false);
        final float density = g.getResources().getDisplayMetrics().density;
        this.o = (int)(56.0f * density);
        this.p = (int)(density * 4.0f);
        this.g = g;
        this.h = 0;
    }
    
    public static c d(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams != null) {
            c c;
            if (viewGroup$LayoutParams instanceof c) {
                c = new c((c)viewGroup$LayoutParams);
            }
            else {
                c = new c(viewGroup$LayoutParams);
            }
            if (c.gravity <= 0) {
                c.gravity = 16;
            }
            return c;
        }
        final c c2 = new c();
        c2.gravity = 16;
        return c2;
    }
    
    public final void a(final MenuBuilder f) {
        this.f = f;
    }
    
    public final boolean c(final g g) {
        return this.f.performItemAction((MenuItem)g, 0);
    }
    
    @Override
    public final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof c;
    }
    
    public final boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        return false;
    }
    
    public final boolean e(final int n) {
        final boolean b = false;
        if (n == 0) {
            return false;
        }
        final View child = this.getChildAt(n - 1);
        final View child2 = this.getChildAt(n);
        boolean b2 = b;
        if (n < this.getChildCount()) {
            b2 = b;
            if (child instanceof ActionMenuView.ActionMenuView$a) {
                b2 = (false | ((ActionMenuView.ActionMenuView$a)child).d());
            }
        }
        boolean b3 = b2;
        if (n > 0) {
            b3 = b2;
            if (child2 instanceof ActionMenuView.ActionMenuView$a) {
                b3 = (b2 | ((ActionMenuView.ActionMenuView$a)child2).e());
            }
        }
        return b3;
    }
    
    public final ViewGroup$LayoutParams generateDefaultLayoutParams() {
        final c c = new c();
        c.gravity = 16;
        return (ViewGroup$LayoutParams)c;
    }
    
    @Override
    public final a generateDefaultLayoutParams() {
        final c c = new c();
        c.gravity = 16;
        return c;
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new c(((View)this).getContext(), set);
    }
    
    @Override
    public final a generateLayoutParams(final AttributeSet set) {
        return new c(((View)this).getContext(), set);
    }
    
    public Menu getMenu() {
        if (this.f == null) {
            final Context context = ((View)this).getContext();
            (this.f = new MenuBuilder(context)).setCallback((MenuBuilder.MenuBuilder$a)new d());
            final androidx.appcompat.widget.c j = new androidx.appcompat.widget.c(context);
            this.j = j;
            j.r = true;
            j.s = true;
            Object k = this.k;
            if (k == null) {
                k = new b();
            }
            ((androidx.appcompat.view.menu.a)j).j = (i$a)k;
            this.f.addMenuPresenter((i)j, this.g);
            final androidx.appcompat.widget.c i = this.j;
            ((androidx.appcompat.view.menu.a)i).m = (j)this;
            this.f = ((androidx.appcompat.view.menu.a)i).h;
        }
        return (Menu)this.f;
    }
    
    public Drawable getOverflowIcon() {
        this.getMenu();
        final androidx.appcompat.widget.c j = this.j;
        final androidx.appcompat.widget.c.d o = j.o;
        Drawable drawable;
        if (o != null) {
            drawable = ((ImageView)o).getDrawable();
        }
        else if (j.q) {
            drawable = j.p;
        }
        else {
            drawable = null;
        }
        return drawable;
    }
    
    public int getPopupTheme() {
        return this.h;
    }
    
    public int getWindowAnimations() {
        return 0;
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final androidx.appcompat.widget.c j = this.j;
        if (j != null) {
            j.k();
            if (this.j.m()) {
                this.j.h();
                this.j.n();
            }
        }
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final androidx.appcompat.widget.c j = this.j;
        if (j != null) {
            j.h();
            final androidx.appcompat.widget.c.a z = j.z;
            if (z != null && z.b()) {
                ((l.f)z.j).dismiss();
            }
        }
    }
    
    @Override
    public final void onLayout(final boolean b, int i, int n, int j, int n2) {
        if (!this.m) {
            super.onLayout(b, i, n, j, n2);
            return;
        }
        final int childCount = this.getChildCount();
        final int n3 = (n2 - n) / 2;
        final int dividerWidth = this.getDividerWidth();
        final int n4 = j - i;
        i = n4 - ((View)this).getPaddingRight() - ((View)this).getPaddingLeft();
        final boolean a = i1.a((View)this);
        j = 0;
        n2 = 0;
        n = 0;
        while (j < childCount) {
            final View child = this.getChildAt(j);
            if (child.getVisibility() != 8) {
                final c c = (c)child.getLayoutParams();
                if (c.a) {
                    final int n5 = n2 = child.getMeasuredWidth();
                    if (this.e(j)) {
                        n2 = n5 + dividerWidth;
                    }
                    final int measuredHeight = child.getMeasuredHeight();
                    int n6;
                    int n7;
                    if (a) {
                        n6 = ((View)this).getPaddingLeft() + c.leftMargin;
                        n7 = n6 + n2;
                    }
                    else {
                        n7 = ((View)this).getWidth() - ((View)this).getPaddingRight() - c.rightMargin;
                        n6 = n7 - n2;
                    }
                    final int n8 = n3 - measuredHeight / 2;
                    child.layout(n6, n8, n7, measuredHeight + n8);
                    i -= n2;
                    n2 = 1;
                }
                else {
                    i -= child.getMeasuredWidth() + c.leftMargin + c.rightMargin;
                    this.e(j);
                    ++n;
                }
            }
            ++j;
        }
        if (childCount == 1 && n2 == 0) {
            final View child2 = this.getChildAt(0);
            i = child2.getMeasuredWidth();
            n = child2.getMeasuredHeight();
            j = n4 / 2 - i / 2;
            n2 = n3 - n / 2;
            child2.layout(j, n2, i + j, n + n2);
            return;
        }
        n -= (n2 ^ 0x1);
        if (n > 0) {
            i /= n;
        }
        else {
            i = 0;
        }
        j = 0;
        n = 0;
        n2 = Math.max(0, i);
        if (a) {
            j = ((View)this).getWidth() - ((View)this).getPaddingRight();
            View child3;
            c c2;
            int measuredWidth;
            int n9;
            for (i = n; i < childCount; ++i, j = n) {
                child3 = this.getChildAt(i);
                c2 = (c)child3.getLayoutParams();
                n = j;
                if (child3.getVisibility() != 8) {
                    if (c2.a) {
                        n = j;
                    }
                    else {
                        n = j - c2.rightMargin;
                        measuredWidth = child3.getMeasuredWidth();
                        j = child3.getMeasuredHeight();
                        n9 = n3 - j / 2;
                        child3.layout(n - measuredWidth, n9, n, j + n9);
                        n -= measuredWidth + c2.leftMargin + n2;
                    }
                }
            }
        }
        else {
            n = ((View)this).getPaddingLeft();
            View child4;
            c c3;
            int measuredWidth2;
            int n10;
            for (i = j; i < childCount; ++i, n = j) {
                child4 = this.getChildAt(i);
                c3 = (c)child4.getLayoutParams();
                j = n;
                if (child4.getVisibility() != 8) {
                    if (c3.a) {
                        j = n;
                    }
                    else {
                        n += c3.leftMargin;
                        measuredWidth2 = child4.getMeasuredWidth();
                        j = child4.getMeasuredHeight();
                        n10 = n3 - j / 2;
                        child4.layout(n, n10, n + measuredWidth2, j + n10);
                        j = a40.f.f(measuredWidth2, c3.rightMargin, n2, n);
                    }
                }
            }
        }
    }
    
    @Override
    public final void onMeasure(int i, int n) {
        final boolean m = this.m;
        int j;
        if (View$MeasureSpec.getMode(i) == 1073741824) {
            j = 1;
        }
        else {
            j = 0;
        }
        this.m = (j != 0);
        if ((m ? 1 : 0) != j) {
            this.n = 0;
        }
        final int size = View$MeasureSpec.getSize(i);
        if (this.m) {
            final MenuBuilder f = this.f;
            if (f != null && size != this.n) {
                this.n = size;
                f.onItemsChanged(true);
            }
        }
        final int childCount = this.getChildCount();
        if (this.m && childCount > 0) {
            final int mode = View$MeasureSpec.getMode(n);
            i = View$MeasureSpec.getSize(i);
            final int size2 = View$MeasureSpec.getSize(n);
            final int paddingLeft = ((View)this).getPaddingLeft();
            final int paddingRight = ((View)this).getPaddingRight();
            final int n2 = ((View)this).getPaddingBottom() + ((View)this).getPaddingTop();
            final int childMeasureSpec = ViewGroup.getChildMeasureSpec(n, n2, -2);
            final int n3 = i - (paddingRight + paddingLeft);
            i = this.o;
            final int n4 = n3 / i;
            if (n4 == 0) {
                ((View)this).setMeasuredDimension(n3, 0);
            }
            else {
                final int n5 = n3 % i / n4 + i;
                final int childCount2 = this.getChildCount();
                final int n6 = i = 0;
                final int n7;
                n = (n7 = i);
                int n9;
                int n8 = n9 = n7;
                long n10 = 0L;
                int k = n7;
                int max = n;
                int n11 = i;
                i = n4;
                n = size2;
                int max2 = n6;
                while (k < childCount2) {
                    final View child = this.getChildAt(k);
                    if (child.getVisibility() != 8) {
                        final boolean b = child instanceof ActionMenuItemView;
                        final int n12 = n11 + 1;
                        if (b) {
                            final int p2 = this.p;
                            child.setPadding(p2, 0, p2, 0);
                        }
                        final c c = (c)child.getLayoutParams();
                        c.f = false;
                        c.c = 0;
                        c.b = 0;
                        c.d = false;
                        c.leftMargin = 0;
                        c.rightMargin = 0;
                        c.e = (b && ((ActionMenuItemView)child).c());
                        int n13;
                        if (c.a) {
                            n13 = 1;
                        }
                        else {
                            n13 = i;
                        }
                        final c c2 = (c)child.getLayoutParams();
                        final int measureSpec = View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(childMeasureSpec) - n2, View$MeasureSpec.getMode(childMeasureSpec));
                        ActionMenuItemView actionMenuItemView;
                        if (b) {
                            actionMenuItemView = (ActionMenuItemView)child;
                        }
                        else {
                            actionMenuItemView = null;
                        }
                        final boolean b2 = actionMenuItemView != null && actionMenuItemView.c();
                        int b3;
                        if (n13 > 0 && (!b2 || n13 >= 2)) {
                            child.measure(View$MeasureSpec.makeMeasureSpec(n13 * n5, Integer.MIN_VALUE), measureSpec);
                            final int measuredWidth = child.getMeasuredWidth();
                            int n15;
                            final int n14 = n15 = measuredWidth / n5;
                            if (measuredWidth % n5 != 0) {
                                n15 = n14 + 1;
                            }
                            b3 = n15;
                            if (b2 && (b3 = n15) < 2) {
                                b3 = 2;
                            }
                        }
                        else {
                            b3 = 0;
                        }
                        c2.d = (!c2.a && b2);
                        c2.b = b3;
                        child.measure(View$MeasureSpec.makeMeasureSpec(n5 * b3, 1073741824), measureSpec);
                        max = Math.max(max, b3);
                        int n16 = n9;
                        if (c.d) {
                            n16 = n9 + 1;
                        }
                        if (c.a) {
                            n8 = 1;
                        }
                        i -= b3;
                        max2 = Math.max(max2, child.getMeasuredHeight());
                        long n17 = n10;
                        if (b3 == 1) {
                            n17 = (n10 | (long)(1 << k));
                        }
                        n11 = n12;
                        n9 = n16;
                        n10 = n17;
                    }
                    ++k;
                }
                final boolean b4 = n8 != 0 && n11 == 2;
                final int n18 = 0;
                int n19 = i;
                final int n20 = childCount2;
                final int n21 = childMeasureSpec;
                i = n18;
                long n22;
                while (true) {
                    n22 = n10;
                    if (n9 <= 0) {
                        break;
                    }
                    n22 = n10;
                    if (n19 <= 0) {
                        break;
                    }
                    int n23 = Integer.MAX_VALUE;
                    int n24 = 0;
                    int l = 0;
                    long n25 = 0L;
                    while (l < n20) {
                        final c c3 = (c)this.getChildAt(l).getLayoutParams();
                        int n26;
                        int n27;
                        long n28;
                        if (!c3.d) {
                            n26 = n23;
                            n27 = n24;
                            n28 = n25;
                        }
                        else {
                            final int b5 = c3.b;
                            if (b5 < n23) {
                                n28 = 1L << l;
                                n26 = b5;
                                n27 = 1;
                            }
                            else {
                                n26 = n23;
                                n27 = n24;
                                n28 = n25;
                                if (b5 == n23) {
                                    n27 = n24 + 1;
                                    n28 = (n25 | 1L << l);
                                    n26 = n23;
                                }
                            }
                        }
                        ++l;
                        n23 = n26;
                        n24 = n27;
                        n25 = n28;
                    }
                    n10 |= n25;
                    if (n24 > n19) {
                        n22 = n10;
                        break;
                    }
                    View child2;
                    c c4;
                    long n29;
                    int n30;
                    long n31;
                    int p3;
                    for (i = 0; i < n20; ++i, n19 = n30, n10 = n31) {
                        child2 = this.getChildAt(i);
                        c4 = (c)child2.getLayoutParams();
                        n29 = 1 << i;
                        if ((n25 & n29) == 0x0L) {
                            n30 = n19;
                            n31 = n10;
                            if (c4.b == n23 + 1) {
                                n31 = (n10 | n29);
                                n30 = n19;
                            }
                        }
                        else {
                            if (b4 && c4.e && n19 == 1) {
                                p3 = this.p;
                                child2.setPadding(p3 + n5, 0, p3, 0);
                            }
                            ++c4.b;
                            c4.f = true;
                            n30 = n19 - 1;
                            n31 = n10;
                        }
                    }
                    i = 1;
                }
                final boolean b6 = n8 == 0 && n11 == 1;
                if (n19 > 0 && n22 != 0L && (n19 < n11 - 1 || b6 || max > 1)) {
                    float n33;
                    final float n32 = n33 = (float)Long.bitCount(n22);
                    if (!b6) {
                        float n34 = n32;
                        if ((n22 & 0x1L) != 0x0L) {
                            n34 = n32;
                            if (!((c)this.getChildAt(0).getLayoutParams()).e) {
                                n34 = n32 - 0.5f;
                            }
                        }
                        final int n35 = n20 - 1;
                        n33 = n34;
                        if ((n22 & (long)(1 << n35)) != 0x0L) {
                            n33 = n34;
                            if (!((c)this.getChildAt(n35).getLayoutParams()).e) {
                                n33 = n34 - 0.5f;
                            }
                        }
                    }
                    int n36;
                    if (n33 > 0.0f) {
                        n36 = (int)(n19 * n5 / n33);
                    }
                    else {
                        n36 = 0;
                    }
                    int n39;
                    for (int n37 = n20, n38 = 0; n38 < n37; ++n38, i = n39) {
                        if ((n22 & (long)(1 << n38)) != 0x0L) {
                            final View child3 = this.getChildAt(n38);
                            final c c5 = (c)child3.getLayoutParams();
                            if (child3 instanceof ActionMenuItemView) {
                                c5.c = n36;
                                c5.f = true;
                                if (n38 == 0 && !c5.e) {
                                    c5.leftMargin = -n36 / 2;
                                }
                                i = 1;
                            }
                            else {
                                if (c5.a) {
                                    c5.c = n36;
                                    c5.f = true;
                                    c5.rightMargin = -n36 / 2;
                                    n39 = 1;
                                    continue;
                                }
                                if (n38 != 0) {
                                    c5.leftMargin = n36 / 2;
                                }
                                n39 = i;
                                if (n38 != n37 - 1) {
                                    c5.rightMargin = n36 / 2;
                                    n39 = i;
                                }
                                continue;
                            }
                        }
                        n39 = i;
                    }
                }
                if (i != 0) {
                    View child4;
                    c c6;
                    for (i = 0; i < n20; ++i) {
                        child4 = this.getChildAt(i);
                        c6 = (c)child4.getLayoutParams();
                        if (c6.f) {
                            child4.measure(View$MeasureSpec.makeMeasureSpec(c6.b * n5 + c6.c, 1073741824), n21);
                        }
                    }
                }
                if (mode == 1073741824) {
                    max2 = n;
                }
                ((View)this).setMeasuredDimension(n3, max2);
            }
        }
        else {
            for (int n40 = 0; n40 < childCount; ++n40) {
                final c c7 = (c)this.getChildAt(n40).getLayoutParams();
                c7.rightMargin = 0;
                c7.leftMargin = 0;
            }
            super.onMeasure(i, n);
        }
    }
    
    public void setExpandedActionViewsExclusive(final boolean w) {
        this.j.w = w;
    }
    
    public void setOnMenuItemClickListener(final ActionMenuView$e q) {
        this.q = q;
    }
    
    public void setOverflowIcon(final Drawable drawable) {
        this.getMenu();
        final androidx.appcompat.widget.c j = this.j;
        final androidx.appcompat.widget.c.d o = j.o;
        if (o != null) {
            o.setImageDrawable(drawable);
        }
        else {
            j.q = true;
            j.p = drawable;
        }
    }
    
    public void setOverflowReserved(final boolean i) {
        this.i = i;
    }
    
    public void setPopupTheme(final int h) {
        if (this.h != h) {
            if ((this.h = h) == 0) {
                this.g = ((View)this).getContext();
            }
            else {
                this.g = (Context)new ContextThemeWrapper(((View)this).getContext(), h);
            }
        }
    }
    
    public void setPresenter(final androidx.appcompat.widget.c j) {
        this.j = j;
        ((androidx.appcompat.view.menu.a)j).m = (j)this;
        this.f = ((androidx.appcompat.view.menu.a)j).h;
    }
    
    public static final class b implements i$a
    {
        public final void b(final MenuBuilder menuBuilder, final boolean b) {
        }
        
        public final boolean c(final MenuBuilder menuBuilder) {
            return false;
        }
    }
    
    public static final class c extends a
    {
        @ViewDebug$ExportedProperty
        public boolean a;
        @ViewDebug$ExportedProperty
        public int b;
        @ViewDebug$ExportedProperty
        public int c;
        @ViewDebug$ExportedProperty
        public boolean d;
        @ViewDebug$ExportedProperty
        public boolean e;
        public boolean f;
        
        public c() {
            super(-2, -2);
            this.a = false;
        }
        
        public c(final Context context, final AttributeSet set) {
            super(context, set);
        }
        
        public c(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
        }
        
        public c(final c c) {
            super((ViewGroup$LayoutParams)c);
            this.a = c.a;
        }
    }
    
    public final class d implements MenuBuilder$a
    {
        public final boolean a(final MenuBuilder menuBuilder, final MenuItem menuItem) {
            final ActionMenuView$e q = ActionMenuView.this.q;
            boolean b = false;
            if (q != null) {
                final ActionMenuView$e actionMenuView$e = (ActionMenuView$e)q;
                final Iterator<z> iterator = actionMenuView$e.a.L.b.iterator();
                while (true) {
                    while (iterator.hasNext()) {
                        if (iterator.next().d(menuItem)) {
                            final boolean b2 = true;
                            boolean b3;
                            if (b2) {
                                b3 = true;
                            }
                            else {
                                final Toolbar.h n = actionMenuView$e.a.N;
                                b3 = (n != null && n.onMenuItemClick(menuItem));
                            }
                            b = b;
                            if (b3) {
                                b = true;
                                return b;
                            }
                            return b;
                        }
                    }
                    final boolean b2 = false;
                    continue;
                }
            }
            return b;
        }
        
        public final void b(final MenuBuilder menuBuilder) {
            final MenuBuilder$a l = ActionMenuView.this.l;
            if (l != null) {
                l.b(menuBuilder);
            }
        }
    }
}

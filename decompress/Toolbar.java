// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.widget.ImageView;
import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import androidx.appcompat.view.menu.l;
import android.view.ViewParent;
import java.util.Objects;
import android.os.Build$VERSION;
import android.text.TextUtils$TruncateAt;
import android.view.ContextThemeWrapper;
import eg.n0;
import android.view.View$MeasureSpec;
import android.os.Parcelable;
import android.view.MotionEvent;
import java.util.Collection;
import android.widget.TextView;
import java.util.Iterator;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.MenuBuilder;
import android.view.View$OnClickListener;
import a4.z;
import java.util.WeakHashMap;
import android.view.Gravity;
import a4.j;
import k.g;
import android.view.MenuInflater;
import android.view.Menu;
import android.view.ViewGroup$MarginLayoutParams;
import h.a$a;
import android.view.ViewGroup$LayoutParams;
import android.text.TextUtils;
import a4.p0;
import gn.a;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.window.OnBackInvokedDispatcher;
import android.window.OnBackInvokedCallback;
import androidx.appcompat.view.menu.MenuBuilder$a;
import androidx.appcompat.view.menu.i$a;
import android.view.MenuItem;
import a4.n;
import android.view.View;
import java.util.ArrayList;
import android.content.res.ColorStateList;
import a4.k;
import android.view.ViewGroup;

public class Toolbar extends ViewGroup implements k
{
    public int A;
    public int B;
    public CharSequence C;
    public CharSequence D;
    public ColorStateList E;
    public ColorStateList F;
    public boolean G;
    public boolean H;
    public final ArrayList<View> I;
    public final ArrayList<View> J;
    public final int[] K;
    public final n L;
    public ArrayList<MenuItem> M;
    public h N;
    public final Toolbar$a O;
    public c1 P;
    public c Q;
    public f R;
    public i$a S;
    public MenuBuilder$a T;
    public boolean U;
    public OnBackInvokedCallback V;
    public OnBackInvokedDispatcher W;
    public boolean a0;
    public final Toolbar$b b0;
    public ActionMenuView f;
    public AppCompatTextView g;
    public AppCompatTextView h;
    public AppCompatImageButton i;
    public AppCompatImageView j;
    public Drawable k;
    public CharSequence l;
    public AppCompatImageButton m;
    public View n;
    public Context o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public q0 y;
    public int z;
    
    public Toolbar(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public Toolbar(final Context context, final AttributeSet set, int n) {
        super(context, set, 2130970004);
        this.B = 8388627;
        this.I = new ArrayList<View>();
        this.J = new ArrayList<View>();
        this.K = new int[2];
        this.L = new n(new a1(this, 0));
        this.M = new ArrayList<MenuItem>();
        this.O = new ActionMenuView$e() {};
        this.b0 = new Runnable() {
            @Override
            public final void run() {
                Toolbar.this.s();
            }
        };
        final Context context2 = ((View)this).getContext();
        final int[] o0 = a.o0;
        final z0 m = z0.m(context2, set, o0, 2130970004);
        p0.k((View)this, context, o0, set, m.b, 2130970004);
        this.q = m.i(28, 0);
        this.r = m.i(19, 0);
        n = this.B;
        this.B = m.b.getInteger(0, n);
        this.s = m.b.getInteger(2, 48);
        final int n2 = n = m.c(22, 0);
        if (m.l(27)) {
            n = m.c(27, n2);
        }
        this.x = n;
        this.w = n;
        this.v = n;
        this.u = n;
        n = m.c(25, -1);
        if (n >= 0) {
            this.u = n;
        }
        n = m.c(24, -1);
        if (n >= 0) {
            this.v = n;
        }
        n = m.c(26, -1);
        if (n >= 0) {
            this.w = n;
        }
        n = m.c(23, -1);
        if (n >= 0) {
            this.x = n;
        }
        this.t = m.d(13, -1);
        final int c = m.c(9, Integer.MIN_VALUE);
        n = m.c(5, Integer.MIN_VALUE);
        final int d = m.d(7, 0);
        final int d2 = m.d(8, 0);
        if (this.y == null) {
            this.y = new q0();
        }
        final q0 y = this.y;
        y.h = false;
        if (d != Integer.MIN_VALUE) {
            y.e = d;
            y.a = d;
        }
        if (d2 != Integer.MIN_VALUE) {
            y.f = d2;
            y.b = d2;
        }
        if (c != Integer.MIN_VALUE || n != Integer.MIN_VALUE) {
            y.a(c, n);
        }
        this.z = m.c(10, Integer.MIN_VALUE);
        this.A = m.c(6, Integer.MIN_VALUE);
        this.k = m.e(4);
        this.l = m.k(3);
        final CharSequence k = m.k(21);
        if (!TextUtils.isEmpty(k)) {
            this.setTitle(k);
        }
        final CharSequence i = m.k(18);
        if (!TextUtils.isEmpty(i)) {
            this.setSubtitle(i);
        }
        this.o = ((View)this).getContext();
        this.setPopupTheme(m.i(17, 0));
        final Drawable e = m.e(16);
        if (e != null) {
            this.setNavigationIcon(e);
        }
        final CharSequence j = m.k(15);
        if (!TextUtils.isEmpty(j)) {
            this.setNavigationContentDescription(j);
        }
        final Drawable e2 = m.e(11);
        if (e2 != null) {
            this.setLogo(e2);
        }
        final CharSequence l = m.k(12);
        if (!TextUtils.isEmpty(l)) {
            this.setLogoDescription(l);
        }
        if (m.l(29)) {
            this.setTitleTextColor(m.b(29));
        }
        if (m.l(20)) {
            this.setSubtitleTextColor(m.b(20));
        }
        if (m.l(14)) {
            this.k(m.i(14, 0));
        }
        m.n();
    }
    
    public static g g(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof g) {
            return new g((g)viewGroup$LayoutParams);
        }
        if (viewGroup$LayoutParams instanceof a$a) {
            return new g((a$a)viewGroup$LayoutParams);
        }
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            return new g((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        return new g(viewGroup$LayoutParams);
    }
    
    private ArrayList<MenuItem> getCurrentMenuItems() {
        final ArrayList list = new ArrayList();
        final Menu menu = this.getMenu();
        for (int i = 0; i < menu.size(); ++i) {
            list.add(menu.getItem(i));
        }
        return list;
    }
    
    private MenuInflater getMenuInflater() {
        return new k.g(((View)this).getContext());
    }
    
    public static int i(final View view) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        return j.b(viewGroup$MarginLayoutParams) + j.c(viewGroup$MarginLayoutParams);
    }
    
    public static int j(final View view) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        return viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin;
    }
    
    public final void a(int n, final ArrayList list) {
        final WeakHashMap a = p0.a;
        final int d = p0.e.d((View)this);
        int i = 0;
        final boolean b = d == 1;
        final int childCount = this.getChildCount();
        final int absoluteGravity = Gravity.getAbsoluteGravity(n, p0.e.d((View)this));
        list.clear();
        if (b) {
            for (int j = childCount - 1; j >= 0; --j) {
                final View child = this.getChildAt(j);
                final g g = (g)child.getLayoutParams();
                if (g.b == 0 && this.r(child)) {
                    n = g.a;
                    final WeakHashMap a2 = p0.a;
                    final int d2 = p0.e.d((View)this);
                    final int n2 = n = (Gravity.getAbsoluteGravity(n, d2) & 0x7);
                    if (n2 != 1 && (n = n2) != 3 && (n = n2) != 5) {
                        if (d2 == 1) {
                            n = 5;
                        }
                        else {
                            n = 3;
                        }
                    }
                    if (n == absoluteGravity) {
                        list.add(child);
                    }
                }
            }
        }
        else {
            while (i < childCount) {
                final View child2 = this.getChildAt(i);
                final g g2 = (g)child2.getLayoutParams();
                if (g2.b == 0 && this.r(child2)) {
                    n = g2.a;
                    final WeakHashMap a3 = p0.a;
                    final int d3 = p0.e.d((View)this);
                    final int n3 = n = (Gravity.getAbsoluteGravity(n, d3) & 0x7);
                    if (n3 != 1 && (n = n3) != 3 && (n = n3) != 5) {
                        if (d3 == 1) {
                            n = 5;
                        }
                        else {
                            n = 3;
                        }
                    }
                    if (n == absoluteGravity) {
                        list.add(child2);
                    }
                }
                ++i;
            }
        }
    }
    
    public final void addMenuProvider(final z z) {
        final n l = this.L;
        l.b.add(z);
        l.a.run();
    }
    
    public final void b(final View view, final boolean b) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        g g;
        if (layoutParams == null) {
            g = new g();
        }
        else if (!this.checkLayoutParams(layoutParams)) {
            g = g(layoutParams);
        }
        else {
            g = (g)layoutParams;
        }
        g.b = 1;
        if (b && this.n != null) {
            view.setLayoutParams((ViewGroup$LayoutParams)g);
            this.J.add(view);
        }
        else {
            this.addView(view, (ViewGroup$LayoutParams)g);
        }
    }
    
    public final void c() {
        if (this.m == null) {
            (this.m = new AppCompatImageButton(((View)this).getContext(), (AttributeSet)null, 2130970003)).setImageDrawable(this.k);
            ((View)this.m).setContentDescription(this.l);
            final g layoutParams = new g();
            layoutParams.a = (0x800003 | (this.s & 0x70));
            layoutParams.b = 2;
            ((View)this.m).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            ((View)this.m).setOnClickListener((View$OnClickListener)new View$OnClickListener() {
                public final void onClick(final View view) {
                    final f r = Toolbar.this.R;
                    androidx.appcompat.view.menu.g g;
                    if (r == null) {
                        g = null;
                    }
                    else {
                        g = r.g;
                    }
                    if (g != null) {
                        g.collapseActionView();
                    }
                }
            });
        }
    }
    
    public final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return super.checkLayoutParams(viewGroup$LayoutParams) && viewGroup$LayoutParams instanceof g;
    }
    
    public final void d() {
        this.e();
        final ActionMenuView f = this.f;
        if (f.f == null) {
            final MenuBuilder menuBuilder = (MenuBuilder)f.getMenu();
            if (this.R == null) {
                this.R = new f();
            }
            this.f.setExpandedActionViewsExclusive(true);
            menuBuilder.addMenuPresenter((androidx.appcompat.view.menu.i)this.R, this.o);
            this.t();
        }
    }
    
    public final void e() {
        if (this.f == null) {
            (this.f = new ActionMenuView(((View)this).getContext(), null)).setPopupTheme(this.p);
            this.f.setOnMenuItemClickListener((ActionMenuView.ActionMenuView$e)this.O);
            final ActionMenuView f = this.f;
            final i$a s = this.S;
            final MenuBuilder$a l = (MenuBuilder$a)new MenuBuilder$a() {
                public final boolean a(final MenuBuilder menuBuilder, final MenuItem menuItem) {
                    final MenuBuilder$a t = Toolbar.this.T;
                    return t != null && t.a(menuBuilder, menuItem);
                }
                
                public final void b(final MenuBuilder menuBuilder) {
                    final c j = Toolbar.this.f.j;
                    if (j == null || !j.m()) {
                        final Iterator<z> iterator = Toolbar.this.L.b.iterator();
                        while (iterator.hasNext()) {
                            iterator.next().c((Menu)menuBuilder);
                        }
                    }
                    final MenuBuilder$a t = Toolbar.this.T;
                    if (t != null) {
                        t.b(menuBuilder);
                    }
                }
            };
            f.k = s;
            f.l = (MenuBuilder$a)l;
            final g layoutParams = new g();
            layoutParams.a = (0x800005 | (this.s & 0x70));
            ((View)this.f).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            this.b((View)this.f, false);
        }
    }
    
    public final void f() {
        if (this.i == null) {
            this.i = new AppCompatImageButton(((View)this).getContext(), (AttributeSet)null, 2130970003);
            final g layoutParams = new g();
            layoutParams.a = (0x800003 | (this.s & 0x70));
            ((View)this.i).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        }
    }
    
    public final ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new g();
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new g(((View)this).getContext(), set);
    }
    
    public CharSequence getCollapseContentDescription() {
        final AppCompatImageButton m = this.m;
        CharSequence contentDescription;
        if (m != null) {
            contentDescription = ((View)m).getContentDescription();
        }
        else {
            contentDescription = null;
        }
        return contentDescription;
    }
    
    public Drawable getCollapseIcon() {
        final AppCompatImageButton m = this.m;
        Drawable drawable;
        if (m != null) {
            drawable = ((ImageView)m).getDrawable();
        }
        else {
            drawable = null;
        }
        return drawable;
    }
    
    public int getContentInsetEnd() {
        final q0 y = this.y;
        int n;
        if (y != null) {
            if (y.g) {
                n = y.a;
            }
            else {
                n = y.b;
            }
        }
        else {
            n = 0;
        }
        return n;
    }
    
    public int getContentInsetEndWithActions() {
        int n = this.A;
        if (n == Integer.MIN_VALUE) {
            n = this.getContentInsetEnd();
        }
        return n;
    }
    
    public int getContentInsetLeft() {
        final q0 y = this.y;
        int a;
        if (y != null) {
            a = y.a;
        }
        else {
            a = 0;
        }
        return a;
    }
    
    public int getContentInsetRight() {
        final q0 y = this.y;
        int b;
        if (y != null) {
            b = y.b;
        }
        else {
            b = 0;
        }
        return b;
    }
    
    public int getContentInsetStart() {
        final q0 y = this.y;
        int n;
        if (y != null) {
            if (y.g) {
                n = y.b;
            }
            else {
                n = y.a;
            }
        }
        else {
            n = 0;
        }
        return n;
    }
    
    public int getContentInsetStartWithNavigation() {
        int n = this.z;
        if (n == Integer.MIN_VALUE) {
            n = this.getContentInsetStart();
        }
        return n;
    }
    
    public int getCurrentContentInsetEnd() {
        final ActionMenuView f = this.f;
        boolean b = false;
        Label_0032: {
            if (f != null) {
                final MenuBuilder f2 = f.f;
                if (f2 != null && f2.hasVisibleItems()) {
                    b = true;
                    break Label_0032;
                }
            }
            b = false;
        }
        int n;
        if (b) {
            n = Math.max(this.getContentInsetEnd(), Math.max(this.A, 0));
        }
        else {
            n = this.getContentInsetEnd();
        }
        return n;
    }
    
    public int getCurrentContentInsetLeft() {
        final WeakHashMap a = p0.a;
        int n;
        if (p0.e.d((View)this) == 1) {
            n = this.getCurrentContentInsetEnd();
        }
        else {
            n = this.getCurrentContentInsetStart();
        }
        return n;
    }
    
    public int getCurrentContentInsetRight() {
        final WeakHashMap a = p0.a;
        int n;
        if (p0.e.d((View)this) == 1) {
            n = this.getCurrentContentInsetStart();
        }
        else {
            n = this.getCurrentContentInsetEnd();
        }
        return n;
    }
    
    public int getCurrentContentInsetStart() {
        int n;
        if (this.getNavigationIcon() != null) {
            n = Math.max(this.getContentInsetStart(), Math.max(this.z, 0));
        }
        else {
            n = this.getContentInsetStart();
        }
        return n;
    }
    
    public Drawable getLogo() {
        final AppCompatImageView j = this.j;
        Drawable drawable;
        if (j != null) {
            drawable = ((ImageView)j).getDrawable();
        }
        else {
            drawable = null;
        }
        return drawable;
    }
    
    public CharSequence getLogoDescription() {
        final AppCompatImageView j = this.j;
        CharSequence contentDescription;
        if (j != null) {
            contentDescription = ((View)j).getContentDescription();
        }
        else {
            contentDescription = null;
        }
        return contentDescription;
    }
    
    public Menu getMenu() {
        this.d();
        return this.f.getMenu();
    }
    
    public View getNavButtonView() {
        return (View)this.i;
    }
    
    public CharSequence getNavigationContentDescription() {
        final AppCompatImageButton i = this.i;
        CharSequence contentDescription;
        if (i != null) {
            contentDescription = ((View)i).getContentDescription();
        }
        else {
            contentDescription = null;
        }
        return contentDescription;
    }
    
    public Drawable getNavigationIcon() {
        final AppCompatImageButton i = this.i;
        Drawable drawable;
        if (i != null) {
            drawable = ((ImageView)i).getDrawable();
        }
        else {
            drawable = null;
        }
        return drawable;
    }
    
    public c getOuterActionMenuPresenter() {
        return this.Q;
    }
    
    public Drawable getOverflowIcon() {
        this.d();
        return this.f.getOverflowIcon();
    }
    
    Context getPopupContext() {
        return this.o;
    }
    
    public int getPopupTheme() {
        return this.p;
    }
    
    public CharSequence getSubtitle() {
        return this.D;
    }
    
    public final TextView getSubtitleTextView() {
        return this.h;
    }
    
    public CharSequence getTitle() {
        return this.C;
    }
    
    public int getTitleMarginBottom() {
        return this.x;
    }
    
    public int getTitleMarginEnd() {
        return this.v;
    }
    
    public int getTitleMarginStart() {
        return this.u;
    }
    
    public int getTitleMarginTop() {
        return this.w;
    }
    
    final TextView getTitleTextView() {
        return this.g;
    }
    
    public c0 getWrapper() {
        if (this.P == null) {
            this.P = new c1(this, true);
        }
        return this.P;
    }
    
    public final int h(int n, final View view) {
        final g g = (g)view.getLayoutParams();
        final int measuredHeight = view.getMeasuredHeight();
        if (n > 0) {
            n = (measuredHeight - n) / 2;
        }
        else {
            n = 0;
        }
        int n3;
        final int n2 = n3 = (g.a & 0x70);
        if (n2 != 16 && (n3 = n2) != 48 && (n3 = n2) != 80) {
            n3 = (this.B & 0x70);
        }
        if (n3 == 48) {
            return ((View)this).getPaddingTop() - n;
        }
        if (n3 != 80) {
            final int paddingTop = ((View)this).getPaddingTop();
            final int paddingBottom = ((View)this).getPaddingBottom();
            final int height = ((View)this).getHeight();
            final int n4 = (height - paddingTop - paddingBottom - measuredHeight) / 2;
            n = ((ViewGroup$MarginLayoutParams)g).topMargin;
            if (n4 >= n) {
                final int n5 = height - paddingBottom - measuredHeight - n4 - paddingTop;
                final int bottomMargin = ((ViewGroup$MarginLayoutParams)g).bottomMargin;
                n = n4;
                if (n5 < bottomMargin) {
                    n = Math.max(0, n4 - (bottomMargin - n5));
                }
            }
            return paddingTop + n;
        }
        return ((View)this).getHeight() - ((View)this).getPaddingBottom() - measuredHeight - ((ViewGroup$MarginLayoutParams)g).bottomMargin - n;
    }
    
    public final void k(final int n) {
        this.getMenuInflater().inflate(n, this.getMenu());
    }
    
    public final void l() {
        final Iterator<MenuItem> iterator = this.M.iterator();
        while (iterator.hasNext()) {
            this.getMenu().removeItem(iterator.next().getItemId());
        }
        final Menu menu = this.getMenu();
        final ArrayList<MenuItem> currentMenuItems = this.getCurrentMenuItems();
        final n l = this.L;
        final MenuInflater menuInflater = this.getMenuInflater();
        final Iterator<z> iterator2 = l.b.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().a(menu, menuInflater);
        }
        final ArrayList<MenuItem> currentMenuItems2 = this.getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.M = currentMenuItems2;
    }
    
    public final boolean m(final View view) {
        return view.getParent() == this || this.J.contains(view);
    }
    
    public final int n(final View view, int n, int measuredWidth, final int[] array) {
        final g g = (g)view.getLayoutParams();
        final int n2 = ((ViewGroup$MarginLayoutParams)g).leftMargin - array[0];
        n += Math.max(0, n2);
        array[0] = Math.max(0, -n2);
        final int h = this.h(measuredWidth, view);
        measuredWidth = view.getMeasuredWidth();
        view.layout(n, h, n + measuredWidth, view.getMeasuredHeight() + h);
        return measuredWidth + ((ViewGroup$MarginLayoutParams)g).rightMargin + n;
    }
    
    public final int o(final View view, int n, int h, final int[] array) {
        final g g = (g)view.getLayoutParams();
        final int n2 = ((ViewGroup$MarginLayoutParams)g).rightMargin - array[1];
        n -= Math.max(0, n2);
        array[1] = Math.max(0, -n2);
        h = this.h(h, view);
        final int measuredWidth = view.getMeasuredWidth();
        view.layout(n - measuredWidth, h, n, view.getMeasuredHeight() + h);
        return n - (measuredWidth + ((ViewGroup$MarginLayoutParams)g).leftMargin);
    }
    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.t();
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((View)this).removeCallbacks((Runnable)this.b0);
        this.t();
    }
    
    public final boolean onHoverEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.H = false;
        }
        if (!this.H) {
            final boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.H = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.H = false;
        }
        return true;
    }
    
    public void onLayout(final boolean b, int i, int n, int j, int k) {
        final WeakHashMap a = p0.a;
        final boolean b2 = p0.e.d((View)this) == 1;
        final int width = ((View)this).getWidth();
        final int height = ((View)this).getHeight();
        j = ((View)this).getPaddingLeft();
        final int paddingRight = ((View)this).getPaddingRight();
        final int paddingTop = ((View)this).getPaddingTop();
        final int paddingBottom = ((View)this).getPaddingBottom();
        final int n2 = width - paddingRight;
        final int[] l = this.K;
        l[l[1] = 0] = 0;
        i = p0.d.d((View)this);
        if (i >= 0) {
            k = Math.min(i, k - n);
        }
        else {
            k = 0;
        }
        int o = 0;
        int n3 = 0;
        Label_0172: {
            if (this.r((View)this.i)) {
                if (b2) {
                    o = this.o((View)this.i, n2, k, l);
                    n3 = j;
                    break Label_0172;
                }
                n3 = this.n((View)this.i, j, k, l);
            }
            else {
                n3 = j;
            }
            o = n2;
        }
        i = n3;
        n = o;
        if (this.r((View)this.m)) {
            if (b2) {
                n = this.o((View)this.m, o, k, l);
                i = n3;
            }
            else {
                i = this.n((View)this.m, n3, k, l);
                n = o;
            }
        }
        int n4 = i;
        int o2 = n;
        if (this.r((View)this.f)) {
            if (b2) {
                n4 = this.n((View)this.f, i, k, l);
                o2 = n;
            }
            else {
                o2 = this.o((View)this.f, n, k, l);
                n4 = i;
            }
        }
        n = this.getCurrentContentInsetLeft();
        i = this.getCurrentContentInsetRight();
        l[0] = Math.max(0, n - n4);
        l[1] = Math.max(0, i - (n2 - o2));
        final int max = Math.max(n4, n);
        final int min = Math.min(o2, n2 - i);
        n = max;
        i = min;
        if (this.r(this.n)) {
            if (b2) {
                i = this.o(this.n, min, k, l);
                n = max;
            }
            else {
                n = this.n(this.n, max, k, l);
                i = min;
            }
        }
        int n5 = n;
        int o3 = i;
        if (this.r((View)this.j)) {
            if (b2) {
                o3 = this.o((View)this.j, i, k, l);
                n5 = n;
            }
            else {
                n5 = this.n((View)this.j, n, k, l);
                o3 = i;
            }
        }
        final boolean r = this.r((View)this.g);
        final boolean r2 = this.r((View)this.h);
        if (r) {
            final g g = (g)((View)this.g).getLayoutParams();
            i = ((ViewGroup$MarginLayoutParams)g).topMargin;
            i = ((View)this.g).getMeasuredHeight() + i + ((ViewGroup$MarginLayoutParams)g).bottomMargin + 0;
        }
        else {
            i = 0;
        }
        if (r2) {
            final g g2 = (g)((View)this.h).getLayoutParams();
            n = ((ViewGroup$MarginLayoutParams)g2).topMargin;
            i += ((View)this.h).getMeasuredHeight() + n + ((ViewGroup$MarginLayoutParams)g2).bottomMargin;
        }
        if (!r && !r2) {
            n = n5;
            i = o3;
        }
        else {
            AppCompatTextView appCompatTextView;
            if (r) {
                appCompatTextView = this.g;
            }
            else {
                appCompatTextView = this.h;
            }
            AppCompatTextView appCompatTextView2;
            if (r2) {
                appCompatTextView2 = this.h;
            }
            else {
                appCompatTextView2 = this.g;
            }
            final g g3 = (g)((View)appCompatTextView).getLayoutParams();
            final g g4 = (g)((View)appCompatTextView2).getLayoutParams();
            final boolean b3 = (r && ((View)this.g).getMeasuredWidth() > 0) || (r2 && ((View)this.h).getMeasuredWidth() > 0);
            n = (this.B & 0x70);
            if (n != 48) {
                if (n != 80) {
                    n = (height - paddingTop - paddingBottom - i) / 2;
                    final int n6 = ((ViewGroup$MarginLayoutParams)g3).topMargin + this.w;
                    if (n < n6) {
                        i = n6;
                    }
                    else {
                        final int n7 = height - paddingBottom - i - n - paddingTop;
                        final int bottomMargin = ((ViewGroup$MarginLayoutParams)g3).bottomMargin;
                        final int x = this.x;
                        i = n;
                        if (n7 < bottomMargin + x) {
                            i = Math.max(0, n - (((ViewGroup$MarginLayoutParams)g4).bottomMargin + x - n7));
                        }
                    }
                    i += paddingTop;
                }
                else {
                    i = height - paddingBottom - ((ViewGroup$MarginLayoutParams)g4).bottomMargin - this.x - i;
                }
            }
            else {
                i = ((View)this).getPaddingTop() + ((ViewGroup$MarginLayoutParams)g3).topMargin + this.w;
            }
            if (b2) {
                if (b3) {
                    n = this.u;
                }
                else {
                    n = 0;
                }
                n -= l[1];
                final int n8 = o3 - Math.max(0, n);
                l[1] = Math.max(0, -n);
                int n10;
                if (r) {
                    final g g5 = (g)((View)this.g).getLayoutParams();
                    final int n9 = n8 - ((View)this.g).getMeasuredWidth();
                    n = ((View)this.g).getMeasuredHeight() + i;
                    ((View)this.g).layout(n9, i, n8, n);
                    n10 = n9 - this.v;
                    i = n + ((ViewGroup$MarginLayoutParams)g5).bottomMargin;
                }
                else {
                    n10 = n8;
                }
                int n12;
                if (r2) {
                    final int n11 = i + ((ViewGroup$MarginLayoutParams)((View)this.h).getLayoutParams()).topMargin;
                    n = ((View)this.h).getMeasuredWidth();
                    i = ((View)this.h).getMeasuredHeight();
                    ((View)this.h).layout(n8 - n, n11, n8, i + n11);
                    n12 = n8 - this.v;
                }
                else {
                    n12 = n8;
                }
                n = n5;
                i = n8;
                if (b3) {
                    i = Math.min(n10, n12);
                    n = n5;
                }
            }
            else {
                if (b3) {
                    n = this.u;
                }
                else {
                    n = 0;
                }
                final int n13 = n - l[0];
                n = n5 + Math.max(0, n13);
                l[0] = Math.max(0, -n13);
                int n16;
                if (r) {
                    final g g6 = (g)((View)this.g).getLayoutParams();
                    final int n14 = ((View)this.g).getMeasuredWidth() + n;
                    final int n15 = ((View)this.g).getMeasuredHeight() + i;
                    ((View)this.g).layout(n, i, n14, n15);
                    n16 = n14 + this.v;
                    i = n15 + ((ViewGroup$MarginLayoutParams)g6).bottomMargin;
                }
                else {
                    n16 = n;
                }
                int n19;
                if (r2) {
                    final int n17 = i + ((ViewGroup$MarginLayoutParams)((View)this.h).getLayoutParams()).topMargin;
                    final int n18 = ((View)this.h).getMeasuredWidth() + n;
                    i = ((View)this.h).getMeasuredHeight();
                    ((View)this.h).layout(n, n17, n18, i + n17);
                    n19 = n18 + this.v;
                }
                else {
                    n19 = n;
                }
                i = o3;
                if (b3) {
                    n = Math.max(n16, n19);
                    i = o3;
                }
            }
        }
        final int n20 = k;
        final int n21 = j;
        this.a(3, this.I);
        for (k = this.I.size(), j = 0; j < k; ++j) {
            n = this.n(this.I.get(j), n, n20, l);
        }
        this.a(5, this.I);
        for (k = this.I.size(), j = 0; j < k; ++j) {
            i = this.o(this.I.get(j), i, n20, l);
        }
        this.a(1, this.I);
        final ArrayList<View> m = this.I;
        int max2 = l[0];
        int max3 = l[1];
        final int size = m.size();
        k = 0;
        j = 0;
        while (k < size) {
            final View view = m.get(k);
            final g g7 = (g)view.getLayoutParams();
            final int n22 = ((ViewGroup$MarginLayoutParams)g7).leftMargin - max2;
            final int n23 = ((ViewGroup$MarginLayoutParams)g7).rightMargin - max3;
            final int max4 = Math.max(0, n22);
            final int max5 = Math.max(0, n23);
            max2 = Math.max(0, -n22);
            max3 = Math.max(0, -n23);
            j += view.getMeasuredWidth() + max4 + max5;
            ++k;
        }
        k = (width - n21 - paddingRight) / 2 + n21 - j / 2;
        j += k;
        if (k < n) {
            i = n;
        }
        else if (j > i) {
            i = k - (j - i);
        }
        else {
            i = k;
        }
        k = this.I.size();
        j = 0;
        n = i;
        for (i = j; i < k; ++i) {
            n = this.n(this.I.get(i), n, n20, l);
        }
        this.I.clear();
    }
    
    public void onMeasure(int i, int resolveSizeAndState) {
        final int[] k = this.K;
        final int a = i1.a((View)this) ? 1 : 0;
        final boolean r = this.r((View)this.i);
        final int n = 0;
        int n2;
        int max;
        int combineMeasuredStates;
        if (r) {
            this.q((View)this.i, i, 0, resolveSizeAndState, this.t);
            n2 = i((View)this.i) + ((View)this.i).getMeasuredWidth();
            max = Math.max(0, j((View)this.i) + ((View)this.i).getMeasuredHeight());
            combineMeasuredStates = View.combineMeasuredStates(0, ((View)this.i).getMeasuredState());
        }
        else {
            n2 = 0;
            max = (combineMeasuredStates = n2);
        }
        int n3 = n2;
        int n4 = max;
        int n5 = combineMeasuredStates;
        if (this.r((View)this.m)) {
            this.q((View)this.m, i, 0, resolveSizeAndState, this.t);
            n3 = i((View)this.m) + ((View)this.m).getMeasuredWidth();
            n4 = Math.max(max, j((View)this.m) + ((View)this.m).getMeasuredHeight());
            n5 = View.combineMeasuredStates(combineMeasuredStates, ((View)this.m).getMeasuredState());
        }
        final int currentContentInsetStart = this.getCurrentContentInsetStart();
        final int n6 = Math.max(currentContentInsetStart, n3) + 0;
        k[a] = Math.max(0, currentContentInsetStart - n3);
        int n7;
        if (this.r((View)this.f)) {
            this.q((View)this.f, i, n6, resolveSizeAndState, this.t);
            n7 = i((View)this.f) + ((View)this.f).getMeasuredWidth();
            n4 = Math.max(n4, j((View)this.f) + ((View)this.f).getMeasuredHeight());
            n5 = View.combineMeasuredStates(n5, ((View)this.f).getMeasuredState());
        }
        else {
            n7 = 0;
        }
        final int currentContentInsetEnd = this.getCurrentContentInsetEnd();
        final int n8 = n6 + Math.max(currentContentInsetEnd, n7);
        k[a ^ 0x1] = Math.max(0, currentContentInsetEnd - n7);
        int max2 = n4;
        int combineMeasuredStates2 = n5;
        int n9 = n8;
        if (this.r(this.n)) {
            n9 = n8 + this.p(this.n, i, n8, resolveSizeAndState, 0, k);
            max2 = Math.max(n4, j(this.n) + this.n.getMeasuredHeight());
            combineMeasuredStates2 = View.combineMeasuredStates(n5, this.n.getMeasuredState());
        }
        int max3 = max2;
        int combineMeasuredStates3 = combineMeasuredStates2;
        int n10 = n9;
        if (this.r((View)this.j)) {
            n10 = n9 + this.p((View)this.j, i, n9, resolveSizeAndState, 0, k);
            max3 = Math.max(max2, j((View)this.j) + ((View)this.j).getMeasuredHeight());
            combineMeasuredStates3 = View.combineMeasuredStates(combineMeasuredStates2, ((View)this.j).getMeasuredState());
        }
        final int childCount = this.getChildCount();
        int j = 0;
        int n11 = n10;
        int n12 = combineMeasuredStates3;
        while (j < childCount) {
            final View child = this.getChildAt(j);
            int max4 = max3;
            int combineMeasuredStates4 = n12;
            int n13 = n11;
            if (((g)child.getLayoutParams()).b == 0) {
                if (!this.r(child)) {
                    max4 = max3;
                    combineMeasuredStates4 = n12;
                    n13 = n11;
                }
                else {
                    n13 = n11 + this.p(child, i, n11, resolveSizeAndState, 0, k);
                    max4 = Math.max(max3, j(child) + child.getMeasuredHeight());
                    combineMeasuredStates4 = View.combineMeasuredStates(n12, child.getMeasuredState());
                }
            }
            ++j;
            max3 = max4;
            n12 = combineMeasuredStates4;
            n11 = n13;
        }
        final int n14 = this.w + this.x;
        final int n15 = this.u + this.v;
        int n16;
        int max5;
        if (this.r((View)this.g)) {
            this.p((View)this.g, i, n11 + n15, resolveSizeAndState, n14, k);
            final int measuredWidth = ((View)this.g).getMeasuredWidth();
            final int l = i((View)this.g);
            final int measuredHeight = ((View)this.g).getMeasuredHeight();
            final int m = j((View)this.g);
            n12 = View.combineMeasuredStates(n12, ((View)this.g).getMeasuredState());
            n16 = m + measuredHeight;
            max5 = l + measuredWidth;
        }
        else {
            n16 = (max5 = 0);
        }
        if (this.r((View)this.h)) {
            max5 = Math.max(max5, this.p((View)this.h, i, n11 + n15, resolveSizeAndState, n16 + n14, k));
            n16 += j((View)this.h) + ((View)this.h).getMeasuredHeight();
            n12 = View.combineMeasuredStates(n12, ((View)this.h).getMeasuredState());
        }
        final int max6 = Math.max(max3, n16);
        final int paddingLeft = ((View)this).getPaddingLeft();
        final int paddingRight = ((View)this).getPaddingRight();
        final int paddingTop = ((View)this).getPaddingTop();
        final int paddingBottom = ((View)this).getPaddingBottom();
        final int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight + paddingLeft + (n11 + max5), ((View)this).getSuggestedMinimumWidth()), i, 0xFF000000 & n12);
        resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom + paddingTop + max6, ((View)this).getSuggestedMinimumHeight()), resolveSizeAndState, n12 << 16);
        Label_1051: {
            Label_1038: {
                if (this.U) {
                    int childCount2;
                    View child2;
                    for (childCount2 = this.getChildCount(), i = 0; i < childCount2; ++i) {
                        child2 = this.getChildAt(i);
                        if (this.r(child2) && child2.getMeasuredWidth() > 0 && child2.getMeasuredHeight() > 0) {
                            break Label_1038;
                        }
                    }
                    i = 1;
                    break Label_1051;
                }
            }
            i = 0;
        }
        if (i != 0) {
            i = n;
        }
        else {
            i = resolveSizeAndState;
        }
        ((View)this).setMeasuredDimension(resolveSizeAndState2, i);
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final i i = (i)parcelable;
        super.onRestoreInstanceState(i.f);
        final ActionMenuView f = this.f;
        Object f2;
        if (f != null) {
            f2 = f.f;
        }
        else {
            f2 = null;
        }
        final int h = i.h;
        if (h != 0 && this.R != null && f2 != null) {
            final MenuItem item = ((Menu)f2).findItem(h);
            if (item != null) {
                item.expandActionView();
            }
        }
        if (i.i) {
            ((View)this).removeCallbacks((Runnable)this.b0);
            ((View)this).post((Runnable)this.b0);
        }
    }
    
    public final void onRtlPropertiesChanged(int n) {
        super.onRtlPropertiesChanged(n);
        if (this.y == null) {
            this.y = new q0();
        }
        final q0 y = this.y;
        boolean g = true;
        if (n != 1) {
            g = false;
        }
        if (g != y.g) {
            y.g = g;
            if (y.h) {
                if (g) {
                    n = y.d;
                    if (n == Integer.MIN_VALUE) {
                        n = y.e;
                    }
                    y.a = n;
                    n = y.c;
                    if (n == Integer.MIN_VALUE) {
                        n = y.f;
                    }
                    y.b = n;
                }
                else {
                    n = y.c;
                    if (n == Integer.MIN_VALUE) {
                        n = y.e;
                    }
                    y.a = n;
                    n = y.d;
                    if (n == Integer.MIN_VALUE) {
                        n = y.f;
                    }
                    y.b = n;
                }
            }
            else {
                y.a = y.e;
                y.b = y.f;
            }
        }
    }
    
    public Parcelable onSaveInstanceState() {
        final i i = new i(super.onSaveInstanceState());
        final f r = this.R;
        if (r != null) {
            final androidx.appcompat.view.menu.g g = r.g;
            if (g != null) {
                i.h = g.a;
            }
        }
        final ActionMenuView f = this.f;
        boolean j = true;
        Label_0084: {
            if (f != null) {
                final c k = f.j;
                if (k != null && k.m()) {
                    break Label_0084;
                }
            }
            j = false;
        }
        i.i = j;
        return (Parcelable)i;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.G = false;
        }
        if (!this.G) {
            final boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.G = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.G = false;
        }
        return true;
    }
    
    public final int p(final View view, int paddingTop, int childMeasureSpec, final int n, final int n2, final int[] array) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        final int n3 = viewGroup$MarginLayoutParams.leftMargin - array[0];
        final int n4 = viewGroup$MarginLayoutParams.rightMargin - array[1];
        final int n5 = Math.max(0, n4) + Math.max(0, n3);
        array[0] = Math.max(0, -n3);
        array[1] = Math.max(0, -n4);
        childMeasureSpec = ViewGroup.getChildMeasureSpec(paddingTop, ((View)this).getPaddingRight() + ((View)this).getPaddingLeft() + n5 + childMeasureSpec, viewGroup$MarginLayoutParams.width);
        paddingTop = ((View)this).getPaddingTop();
        view.measure(childMeasureSpec, ViewGroup.getChildMeasureSpec(n, ((View)this).getPaddingBottom() + paddingTop + viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin + n2, viewGroup$MarginLayoutParams.height));
        return view.getMeasuredWidth() + n5;
    }
    
    public final void q(final View view, int n, int childMeasureSpec, int mode, final int n2) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        final int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(n, ((View)this).getPaddingRight() + ((View)this).getPaddingLeft() + viewGroup$MarginLayoutParams.leftMargin + viewGroup$MarginLayoutParams.rightMargin + childMeasureSpec, viewGroup$MarginLayoutParams.width);
        n = ((View)this).getPaddingTop();
        childMeasureSpec = ViewGroup.getChildMeasureSpec(mode, ((View)this).getPaddingBottom() + n + viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin + 0, viewGroup$MarginLayoutParams.height);
        mode = View$MeasureSpec.getMode(childMeasureSpec);
        n = childMeasureSpec;
        if (mode != 1073741824) {
            n = childMeasureSpec;
            if (n2 >= 0) {
                n = n2;
                if (mode != 0) {
                    n = Math.min(View$MeasureSpec.getSize(childMeasureSpec), n2);
                }
                n = View$MeasureSpec.makeMeasureSpec(n, 1073741824);
            }
        }
        view.measure(childMeasureSpec2, n);
    }
    
    public final boolean r(final View view) {
        return view != null && view.getParent() == this && view.getVisibility() != 8;
    }
    
    public final void removeMenuProvider(final z z) {
        this.L.a(z);
    }
    
    public final boolean s() {
        final ActionMenuView f = this.f;
        boolean b = true;
        if (f != null) {
            final c j = f.j;
            if (j != null && j.n()) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    public void setBackInvokedCallbackEnabled(final boolean a0) {
        if (this.a0 != a0) {
            this.a0 = a0;
            this.t();
        }
    }
    
    public void setCollapseContentDescription(final int n) {
        CharSequence text;
        if (n != 0) {
            text = ((View)this).getContext().getText(n);
        }
        else {
            text = null;
        }
        this.setCollapseContentDescription(text);
    }
    
    public void setCollapseContentDescription(final CharSequence contentDescription) {
        if (!TextUtils.isEmpty(contentDescription)) {
            this.c();
        }
        final AppCompatImageButton m = this.m;
        if (m != null) {
            ((View)m).setContentDescription(contentDescription);
        }
    }
    
    public void setCollapseIcon(final int n) {
        this.setCollapseIcon(n0.L(((View)this).getContext(), n));
    }
    
    public void setCollapseIcon(final Drawable imageDrawable) {
        if (imageDrawable != null) {
            this.c();
            this.m.setImageDrawable(imageDrawable);
        }
        else {
            final AppCompatImageButton m = this.m;
            if (m != null) {
                m.setImageDrawable(this.k);
            }
        }
    }
    
    public void setCollapsible(final boolean u) {
        this.U = u;
        ((View)this).requestLayout();
    }
    
    public void setContentInsetEndWithActions(final int n) {
        int a = n;
        if (n < 0) {
            a = Integer.MIN_VALUE;
        }
        if (a != this.A) {
            this.A = a;
            if (this.getNavigationIcon() != null) {
                ((View)this).requestLayout();
            }
        }
    }
    
    public void setContentInsetStartWithNavigation(final int n) {
        int z = n;
        if (n < 0) {
            z = Integer.MIN_VALUE;
        }
        if (z != this.z) {
            this.z = z;
            if (this.getNavigationIcon() != null) {
                ((View)this).requestLayout();
            }
        }
    }
    
    public void setLogo(final int n) {
        this.setLogo(n0.L(((View)this).getContext(), n));
    }
    
    public void setLogo(final Drawable imageDrawable) {
        if (imageDrawable != null) {
            if (this.j == null) {
                this.j = new AppCompatImageView(((View)this).getContext());
            }
            if (!this.m((View)this.j)) {
                this.b((View)this.j, true);
            }
        }
        else {
            final AppCompatImageView j = this.j;
            if (j != null && this.m((View)j)) {
                this.removeView((View)this.j);
                this.J.remove(this.j);
            }
        }
        final AppCompatImageView i = this.j;
        if (i != null) {
            i.setImageDrawable(imageDrawable);
        }
    }
    
    public void setLogoDescription(final int n) {
        this.setLogoDescription(((View)this).getContext().getText(n));
    }
    
    public void setLogoDescription(final CharSequence contentDescription) {
        if (!TextUtils.isEmpty(contentDescription) && this.j == null) {
            this.j = new AppCompatImageView(((View)this).getContext());
        }
        final AppCompatImageView j = this.j;
        if (j != null) {
            ((View)j).setContentDescription(contentDescription);
        }
    }
    
    public void setNavigationContentDescription(final int n) {
        CharSequence text;
        if (n != 0) {
            text = ((View)this).getContext().getText(n);
        }
        else {
            text = null;
        }
        this.setNavigationContentDescription(text);
    }
    
    public void setNavigationContentDescription(final CharSequence contentDescription) {
        if (!TextUtils.isEmpty(contentDescription)) {
            this.f();
        }
        final AppCompatImageButton i = this.i;
        if (i != null) {
            ((View)i).setContentDescription(contentDescription);
            d1.a((View)this.i, contentDescription);
        }
    }
    
    public void setNavigationIcon(final int n) {
        this.setNavigationIcon(n0.L(((View)this).getContext(), n));
    }
    
    public void setNavigationIcon(final Drawable imageDrawable) {
        if (imageDrawable != null) {
            this.f();
            if (!this.m((View)this.i)) {
                this.b((View)this.i, true);
            }
        }
        else {
            final AppCompatImageButton i = this.i;
            if (i != null && this.m((View)i)) {
                this.removeView((View)this.i);
                this.J.remove(this.i);
            }
        }
        final AppCompatImageButton j = this.i;
        if (j != null) {
            j.setImageDrawable(imageDrawable);
        }
    }
    
    public void setNavigationOnClickListener(final View$OnClickListener onClickListener) {
        this.f();
        ((View)this.i).setOnClickListener(onClickListener);
    }
    
    public void setOnMenuItemClickListener(final h n) {
        this.N = n;
    }
    
    public void setOverflowIcon(final Drawable overflowIcon) {
        this.d();
        this.f.setOverflowIcon(overflowIcon);
    }
    
    public void setPopupTheme(final int p) {
        if (this.p != p) {
            if ((this.p = p) == 0) {
                this.o = ((View)this).getContext();
            }
            else {
                this.o = (Context)new ContextThemeWrapper(((View)this).getContext(), p);
            }
        }
    }
    
    public void setSubtitle(final int n) {
        this.setSubtitle(((View)this).getContext().getText(n));
    }
    
    public void setSubtitle(final CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.h == null) {
                final Context context = ((View)this).getContext();
                (this.h = new AppCompatTextView(context)).setSingleLine();
                this.h.setEllipsize(TextUtils$TruncateAt.END);
                final int r = this.r;
                if (r != 0) {
                    this.h.setTextAppearance(context, r);
                }
                final ColorStateList f = this.F;
                if (f != null) {
                    this.h.setTextColor(f);
                }
            }
            if (!this.m((View)this.h)) {
                this.b((View)this.h, true);
            }
        }
        else {
            final AppCompatTextView h = this.h;
            if (h != null && this.m((View)h)) {
                this.removeView((View)this.h);
                this.J.remove(this.h);
            }
        }
        final AppCompatTextView h2 = this.h;
        if (h2 != null) {
            h2.setText(charSequence);
        }
        this.D = charSequence;
    }
    
    public void setSubtitleTextColor(final int n) {
        this.setSubtitleTextColor(ColorStateList.valueOf(n));
    }
    
    public void setSubtitleTextColor(final ColorStateList list) {
        this.F = list;
        final AppCompatTextView h = this.h;
        if (h != null) {
            h.setTextColor(list);
        }
    }
    
    public void setTitle(final int n) {
        this.setTitle(((View)this).getContext().getText(n));
    }
    
    public void setTitle(final CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.g == null) {
                final Context context = ((View)this).getContext();
                (this.g = new AppCompatTextView(context)).setSingleLine();
                this.g.setEllipsize(TextUtils$TruncateAt.END);
                final int q = this.q;
                if (q != 0) {
                    this.g.setTextAppearance(context, q);
                }
                final ColorStateList e = this.E;
                if (e != null) {
                    this.g.setTextColor(e);
                }
            }
            if (!this.m((View)this.g)) {
                this.b((View)this.g, true);
            }
        }
        else {
            final AppCompatTextView g = this.g;
            if (g != null && this.m((View)g)) {
                this.removeView((View)this.g);
                this.J.remove(this.g);
            }
        }
        final AppCompatTextView g2 = this.g;
        if (g2 != null) {
            g2.setText(charSequence);
        }
        this.C = charSequence;
    }
    
    public void setTitleMarginBottom(final int x) {
        this.x = x;
        ((View)this).requestLayout();
    }
    
    public void setTitleMarginEnd(final int v) {
        this.v = v;
        ((View)this).requestLayout();
    }
    
    public void setTitleMarginStart(final int u) {
        this.u = u;
        ((View)this).requestLayout();
    }
    
    public void setTitleMarginTop(final int w) {
        this.w = w;
        ((View)this).requestLayout();
    }
    
    public void setTitleTextColor(final int n) {
        this.setTitleTextColor(ColorStateList.valueOf(n));
    }
    
    public void setTitleTextColor(final ColorStateList list) {
        this.E = list;
        final AppCompatTextView g = this.g;
        if (g != null) {
            g.setTextColor(list);
        }
    }
    
    final void t() {
        if (Build$VERSION.SDK_INT >= 33) {
            final OnBackInvokedDispatcher a = e.a((View)this);
            final f r = this.R;
            final int n = 1;
            int n2 = 0;
            Label_0076: {
                if (r != null && r.g != null && a != null) {
                    final WeakHashMap a2 = p0.a;
                    if (p0.g.b((View)this) && this.a0) {
                        n2 = n;
                        break Label_0076;
                    }
                }
                n2 = 0;
            }
            if (n2 != 0 && this.W == null) {
                if (this.V == null) {
                    this.V = e.b((Runnable)new androidx.activity.g((Object)this, 2));
                }
                e.c(a, this.V);
                this.W = a;
            }
            else if (n2 == 0) {
                final OnBackInvokedDispatcher w = this.W;
                if (w != null) {
                    e.d(w, this.V);
                    this.W = null;
                }
            }
        }
    }
    
    public static final class e
    {
        public static OnBackInvokedDispatcher a(final View view) {
            return view.findOnBackInvokedDispatcher();
        }
        
        public static OnBackInvokedCallback b(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return (OnBackInvokedCallback)new androidx.activity.k(runnable);
        }
        
        public static void c(final Object o, final Object o2) {
            ((OnBackInvokedDispatcher)o).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback)o2);
        }
        
        public static void d(final Object o, final Object o2) {
            ((OnBackInvokedDispatcher)o).unregisterOnBackInvokedCallback((OnBackInvokedCallback)o2);
        }
    }
    
    public final class f implements androidx.appcompat.view.menu.i
    {
        public MenuBuilder f;
        public androidx.appcompat.view.menu.g g;
        
        public final void b(final MenuBuilder menuBuilder, final boolean b) {
        }
        
        public final Parcelable c() {
            return null;
        }
        
        public final boolean d(final androidx.appcompat.view.menu.g g) {
            Toolbar.this.c();
            final ViewParent parent = ((View)Toolbar.this.m).getParent();
            final Toolbar h = Toolbar.this;
            if (parent != h) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup)parent).removeView((View)h.m);
                }
                final Toolbar h2 = Toolbar.this;
                h2.addView((View)h2.m);
            }
            Toolbar.this.n = g.getActionView();
            this.g = g;
            final ViewParent parent2 = Toolbar.this.n.getParent();
            final Toolbar h3 = Toolbar.this;
            if (parent2 != h3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup)parent2).removeView(h3.n);
                }
                Toolbar.this.getClass();
                final g layoutParams = new g();
                final Toolbar h4 = Toolbar.this;
                layoutParams.a = (0x800003 | (h4.s & 0x70));
                layoutParams.b = 2;
                h4.n.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                final Toolbar h5 = Toolbar.this;
                h5.addView(h5.n);
            }
            final Toolbar h6 = Toolbar.this;
            int childCount = h6.getChildCount();
            while (true) {
                final int n = childCount - 1;
                if (n < 0) {
                    break;
                }
                final View child = h6.getChildAt(n);
                childCount = n;
                if (((g)child.getLayoutParams()).b == 2) {
                    continue;
                }
                childCount = n;
                if (child == h6.f) {
                    continue;
                }
                h6.removeViewAt(n);
                h6.J.add(child);
                childCount = n;
            }
            ((View)Toolbar.this).requestLayout();
            g.C = true;
            g.n.onItemsChanged(false);
            final View n2 = Toolbar.this.n;
            if (n2 instanceof k.c) {
                ((k.c)n2).onActionViewExpanded();
            }
            Toolbar.this.t();
            return true;
        }
        
        public final boolean e() {
            return false;
        }
        
        public final void f(final Context context, final MenuBuilder f) {
            final MenuBuilder f2 = this.f;
            if (f2 != null) {
                final androidx.appcompat.view.menu.g g = this.g;
                if (g != null) {
                    f2.collapseItemActionView(g);
                }
            }
            this.f = f;
        }
        
        public final int getId() {
            return 0;
        }
        
        public final boolean i(final androidx.appcompat.view.menu.g g) {
            final View n = Toolbar.this.n;
            if (n instanceof k.c) {
                ((k.c)n).onActionViewCollapsed();
            }
            final Toolbar h = Toolbar.this;
            h.removeView(h.n);
            final Toolbar h2 = Toolbar.this;
            h2.removeView((View)h2.m);
            final Toolbar h3 = Toolbar.this;
            h3.n = null;
            int size = h3.J.size();
            while (--size >= 0) {
                h3.addView((View)h3.J.get(size));
            }
            h3.J.clear();
            this.g = null;
            ((View)Toolbar.this).requestLayout();
            g.C = false;
            g.n.onItemsChanged(false);
            Toolbar.this.t();
            return true;
        }
        
        public final void j(final Parcelable parcelable) {
        }
        
        public final void k() {
            if (this.g != null) {
                final MenuBuilder f = this.f;
                int n = 0;
                if (f != null) {
                    final int size = f.size();
                    int n2 = 0;
                    while (true) {
                        n = n;
                        if (n2 >= size) {
                            break;
                        }
                        if (this.f.getItem(n2) == this.g) {
                            n = 1;
                            break;
                        }
                        ++n2;
                    }
                }
                if (n == 0) {
                    this.i(this.g);
                }
            }
        }
        
        public final boolean l(final l l) {
            return false;
        }
    }
    
    public static final class g extends a$a
    {
        public int b;
        
        public g() {
            this.b = 0;
            super.a = 8388627;
        }
        
        public g(final Context context, final AttributeSet set) {
            super(context, set);
            this.b = 0;
        }
        
        public g(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
            this.b = 0;
        }
        
        public g(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            super((ViewGroup$LayoutParams)viewGroup$MarginLayoutParams);
            this.b = 0;
            ((ViewGroup$MarginLayoutParams)this).leftMargin = viewGroup$MarginLayoutParams.leftMargin;
            ((ViewGroup$MarginLayoutParams)this).topMargin = viewGroup$MarginLayoutParams.topMargin;
            ((ViewGroup$MarginLayoutParams)this).rightMargin = viewGroup$MarginLayoutParams.rightMargin;
            ((ViewGroup$MarginLayoutParams)this).bottomMargin = viewGroup$MarginLayoutParams.bottomMargin;
        }
        
        public g(final g g) {
            super((a$a)g);
            this.b = 0;
            this.b = g.b;
        }
        
        public g(final a$a a$a) {
            super(a$a);
            this.b = 0;
        }
    }
    
    public interface h
    {
        boolean onMenuItemClick(final MenuItem p0);
    }
    
    public static final class i extends h4.a
    {
        public static final Parcelable$Creator<i> CREATOR;
        public int h;
        public boolean i;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<i>() {
                public final Object createFromParcel(final Parcel parcel) {
                    return new i(parcel, null);
                }
                
                public final Object createFromParcel(final Parcel parcel, final ClassLoader classLoader) {
                    return new i(parcel, classLoader);
                }
                
                public final Object[] newArray(final int n) {
                    return new i[n];
                }
            };
        }
        
        public i(final Parcel parcel, final ClassLoader classLoader) {
            super(parcel, classLoader);
            this.h = parcel.readInt();
            this.i = (parcel.readInt() != 0);
        }
        
        public i(final Parcelable parcelable) {
            super(parcelable);
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeParcelable(super.f, n);
            parcel.writeInt(this.h);
            parcel.writeInt((int)(this.i ? 1 : 0));
        }
    }
}

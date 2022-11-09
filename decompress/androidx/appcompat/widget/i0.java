// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.widget.AdapterView;
import android.widget.Adapter;
import android.view.MotionEvent;
import android.widget.AbsListView;
import a4.c1;
import a4.b1;
import java.util.WeakHashMap;
import e4.h;
import android.view.View$OnTouchListener;
import a4.p0;
import e4.i;
import android.view.View$MeasureSpec;
import android.view.ViewGroup;
import android.widget.AbsListView$OnScrollListener;
import android.widget.AdapterView$OnItemSelectedListener;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import gn.a;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.PopupWindow;
import android.os.Build$VERSION;
import android.os.Handler;
import android.widget.AdapterView$OnItemClickListener;
import android.view.View;
import android.widget.ListAdapter;
import android.content.Context;
import android.graphics.Rect;
import java.lang.reflect.Method;
import l.f;

public class i0 implements l.f
{
    public static Method E;
    public static Method F;
    public final Rect A;
    public Rect B;
    public boolean C;
    public o D;
    public Context f;
    public ListAdapter g;
    public e0 h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public d s;
    public View t;
    public AdapterView$OnItemClickListener u;
    public final g v;
    public final f w;
    public final e x;
    public final c y;
    public final Handler z;
    
    static {
        if (Build$VERSION.SDK_INT <= 28) {
            try {
                i0.E = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            }
            catch (final NoSuchMethodException ex) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                i0.F = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            }
            catch (final NoSuchMethodException ex2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }
    
    public i0(final Context f, final AttributeSet set, final int n, final int n2) {
        this.i = -2;
        this.j = -2;
        this.m = 1002;
        this.q = 0;
        this.r = Integer.MAX_VALUE;
        this.v = new g();
        this.w = new f();
        this.x = new e();
        this.y = new c();
        this.A = new Rect();
        this.f = f;
        this.z = new Handler(f.getMainLooper());
        final TypedArray obtainStyledAttributes = f.obtainStyledAttributes(set, gn.a.e0, n, n2);
        this.k = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        final int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.l = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.n = true;
        }
        obtainStyledAttributes.recycle();
        (this.D = new o(f, set, n, n2)).setInputMethodMode(1);
    }
    
    @Override
    public final boolean a() {
        return this.D.isShowing();
    }
    
    public final Drawable b() {
        return this.D.getBackground();
    }
    
    public final void c(final int l) {
        this.l = l;
        this.n = true;
    }
    
    @Override
    public final void dismiss() {
        this.D.dismiss();
        this.D.setContentView((View)null);
        this.h = null;
        this.z.removeCallbacks((Runnable)this.v);
    }
    
    public final int f() {
        if (!this.n) {
            return 0;
        }
        return this.l;
    }
    
    @Override
    public final e0 h() {
        return this.h;
    }
    
    public final int i() {
        return this.k;
    }
    
    public final void k(final int k) {
        this.k = k;
    }
    
    public void n(final ListAdapter g) {
        final d s = this.s;
        if (s == null) {
            this.s = new d();
        }
        else {
            final ListAdapter g2 = this.g;
            if (g2 != null) {
                ((Adapter)g2).unregisterDataSetObserver((DataSetObserver)s);
            }
        }
        if ((this.g = g) != null) {
            ((Adapter)g).registerDataSetObserver((DataSetObserver)this.s);
        }
        final e0 h = this.h;
        if (h != null) {
            ((AbsListView)h).setAdapter(this.g);
        }
    }
    
    public final void o(final Drawable backgroundDrawable) {
        this.D.setBackgroundDrawable(backgroundDrawable);
    }
    
    public e0 p(final Context context, final boolean b) {
        return new e0(context, b);
    }
    
    public final void q(final int j) {
        final Drawable background = this.D.getBackground();
        if (background != null) {
            background.getPadding(this.A);
            final Rect a = this.A;
            this.j = a.left + a.right + j;
        }
        else {
            this.j = j;
        }
    }
    
    @Override
    public final void show() {
        if (this.h == null) {
            ((AbsListView)(this.h = this.p(this.f, this.C ^ true))).setAdapter(this.g);
            ((AdapterView)this.h).setOnItemClickListener(this.u);
            ((View)this.h).setFocusable(true);
            ((View)this.h).setFocusableInTouchMode(true);
            ((AdapterView)this.h).setOnItemSelectedListener((AdapterView$OnItemSelectedListener)new h0(this));
            ((AbsListView)this.h).setOnScrollListener((AbsListView$OnScrollListener)this.x);
            this.D.setContentView((View)this.h);
        }
        else {
            final ViewGroup viewGroup = (ViewGroup)this.D.getContentView();
        }
        final Drawable background = this.D.getBackground();
        final int n = 0;
        int n3;
        if (background != null) {
            background.getPadding(this.A);
            final Rect a = this.A;
            final int top = a.top;
            final int n2 = n3 = a.bottom + top;
            if (!this.n) {
                this.l = -top;
                n3 = n2;
            }
        }
        else {
            this.A.setEmpty();
            n3 = 0;
        }
        final int a2 = a.a(this.D, this.t, this.l, this.D.getInputMethodMode() == 2);
        int height;
        if (this.i == -1) {
            height = a2 + n3;
        }
        else {
            final int j = this.j;
            int n4;
            if (j != -2) {
                if (j != -1) {
                    n4 = View$MeasureSpec.makeMeasureSpec(j, 1073741824);
                }
                else {
                    final int widthPixels = this.f.getResources().getDisplayMetrics().widthPixels;
                    final Rect a3 = this.A;
                    n4 = View$MeasureSpec.makeMeasureSpec(widthPixels - (a3.left + a3.right), 1073741824);
                }
            }
            else {
                final int widthPixels2 = this.f.getResources().getDisplayMetrics().widthPixels;
                final Rect a4 = this.A;
                n4 = View$MeasureSpec.makeMeasureSpec(widthPixels2 - (a4.left + a4.right), Integer.MIN_VALUE);
            }
            final int a5 = this.h.a(n4, a2 + 0);
            int n5;
            if (a5 > 0) {
                n5 = ((View)this.h).getPaddingBottom() + ((View)this.h).getPaddingTop() + n3 + 0;
            }
            else {
                n5 = 0;
            }
            height = a5 + n5;
        }
        final boolean b = this.D.getInputMethodMode() == 2;
        e4.i.d((PopupWindow)this.D, this.m);
        if (this.D.isShowing()) {
            final View t = this.t;
            final WeakHashMap a6 = p0.a;
            if (!p0.g.b(t)) {
                return;
            }
            final int i = this.j;
            int width;
            if (i == -1) {
                width = -1;
            }
            else if ((width = i) == -2) {
                width = this.t.getWidth();
            }
            final int k = this.i;
            if (k == -1) {
                if (!b) {
                    height = -1;
                }
                if (b) {
                    final o d = this.D;
                    int width2;
                    if (this.j == -1) {
                        width2 = -1;
                    }
                    else {
                        width2 = 0;
                    }
                    d.setWidth(width2);
                    this.D.setHeight(0);
                }
                else {
                    final o d2 = this.D;
                    int width3 = n;
                    if (this.j == -1) {
                        width3 = -1;
                    }
                    d2.setWidth(width3);
                    this.D.setHeight(-1);
                }
            }
            else if (k != -2) {
                height = k;
            }
            this.D.setOutsideTouchable(true);
            final o d3 = this.D;
            final View t2 = this.t;
            final int l = this.k;
            final int m = this.l;
            if (width < 0) {
                width = -1;
            }
            if (height < 0) {
                height = -1;
            }
            d3.update(t2, l, m, width, height);
        }
        else {
            final int j2 = this.j;
            int width4;
            if (j2 == -1) {
                width4 = -1;
            }
            else if ((width4 = j2) == -2) {
                width4 = this.t.getWidth();
            }
            final int i2 = this.i;
            if (i2 == -1) {
                height = -1;
            }
            else if (i2 != -2) {
                height = i2;
            }
            this.D.setWidth(width4);
            this.D.setHeight(height);
            if (Build$VERSION.SDK_INT <= 28) {
                final Method e = i0.E;
                if (e != null) {
                    try {
                        e.invoke(this.D, Boolean.TRUE);
                    }
                    catch (final Exception ex) {
                        Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                    }
                }
            }
            else {
                i0.b.b(this.D, true);
            }
            this.D.setOutsideTouchable(true);
            this.D.setTouchInterceptor((View$OnTouchListener)this.w);
            if (this.p) {
                e4.i.c((PopupWindow)this.D, this.o);
            }
            if (Build$VERSION.SDK_INT <= 28) {
                final Method f = i0.F;
                if (f != null) {
                    try {
                        f.invoke(this.D, this.B);
                    }
                    catch (final Exception ex2) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", (Throwable)ex2);
                    }
                }
            }
            else {
                i0.b.a(this.D, this.B);
            }
            e4.h.a((PopupWindow)this.D, this.t, this.k, this.l, this.q);
            ((AdapterView)this.h).setSelection(-1);
            if (!this.C || this.h.isInTouchMode()) {
                final e0 h = this.h;
                if (h != null) {
                    h.setListSelectionHidden(true);
                    ((View)h).requestLayout();
                }
            }
            if (!this.C) {
                this.z.post((Runnable)this.y);
            }
        }
    }
    
    public static final class a
    {
        public static int a(final PopupWindow popupWindow, final View view, final int n, final boolean b) {
            return popupWindow.getMaxAvailableHeight(view, n, b);
        }
    }
    
    public static final class b
    {
        public static void a(final PopupWindow popupWindow, final Rect rect) {
            b1.i(popupWindow, rect);
        }
        
        public static void b(final PopupWindow popupWindow, final boolean b) {
            c1.d(popupWindow, b);
        }
    }
    
    public final class c implements Runnable
    {
        @Override
        public final void run() {
            final e0 h = i0.this.h;
            if (h != null) {
                h.setListSelectionHidden(true);
                ((View)h).requestLayout();
            }
        }
    }
    
    public final class d extends DataSetObserver
    {
        public final void onChanged() {
            if (i0.this.a()) {
                i0.this.show();
            }
        }
        
        public final void onInvalidated() {
            i0.this.dismiss();
        }
    }
    
    public final class e implements AbsListView$OnScrollListener
    {
        public final void onScroll(final AbsListView absListView, final int n, final int n2, final int n3) {
        }
        
        public final void onScrollStateChanged(final AbsListView absListView, int n) {
            final int n2 = 1;
            if (n == 1) {
                if (i0.this.D.getInputMethodMode() == 2) {
                    n = n2;
                }
                else {
                    n = 0;
                }
                if (n == 0 && i0.this.D.getContentView() != null) {
                    final i0 a = i0.this;
                    a.z.removeCallbacks((Runnable)a.v);
                    i0.this.v.run();
                }
            }
        }
    }
    
    public final class f implements View$OnTouchListener
    {
        public final boolean onTouch(final View view, final MotionEvent motionEvent) {
            final int action = motionEvent.getAction();
            final int n = (int)motionEvent.getX();
            final int n2 = (int)motionEvent.getY();
            if (action == 0) {
                final o d = i0.this.D;
                if (d != null && d.isShowing() && n >= 0 && n < i0.this.D.getWidth() && n2 >= 0 && n2 < i0.this.D.getHeight()) {
                    final i0 f = i0.this;
                    f.z.postDelayed((Runnable)f.v, 250L);
                    return false;
                }
            }
            if (action == 1) {
                final i0 f2 = i0.this;
                f2.z.removeCallbacks((Runnable)f2.v);
            }
            return false;
        }
    }
    
    public final class g implements Runnable
    {
        @Override
        public final void run() {
            final e0 h = i0.this.h;
            if (h != null) {
                final WeakHashMap a = p0.a;
                if (p0.g.b((View)h) && ((AdapterView)i0.this.h).getCount() > ((ViewGroup)i0.this.h).getChildCount()) {
                    final int childCount = ((ViewGroup)i0.this.h).getChildCount();
                    final i0 f = i0.this;
                    if (childCount <= f.r) {
                        f.D.setInputMethodMode(2);
                        i0.this.show();
                    }
                }
            }
        }
    }
}

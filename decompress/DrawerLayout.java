// 
// Decompiled by Procyon v0.6.0
// 

package androidx.drawerlayout.widget;

import android.view.accessibility.AccessibilityRecord;
import android.os.SystemClock;
import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import android.content.res.TypedArray;
import b4.c$a;
import android.view.accessibility.AccessibilityEvent;
import android.graphics.drawable.ColorDrawable;
import android.os.Parcelable;
import android.view.View$MeasureSpec;
import android.view.KeyEvent;
import android.view.WindowInsets;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.ViewGroup$LayoutParams;
import android.view.Gravity;
import java.util.WeakHashMap;
import android.view.View$OnApplyWindowInsetsListener;
import a4.a;
import a4.p0;
import android.util.AttributeSet;
import android.content.Context;
import i4.c;
import android.graphics.Paint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

public class DrawerLayout extends ViewGroup
{
    public static final int[] G;
    public static final int[] H;
    public Drawable A;
    public Object B;
    public boolean C;
    public final ArrayList<View> D;
    public Rect E;
    public Matrix F;
    public float f;
    public int g;
    public int h;
    public float i;
    public Paint j;
    public final i4.c k;
    public final i4.c l;
    public final g m;
    public final g n;
    public int o;
    public boolean p;
    public boolean q;
    public int r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public c w;
    public ArrayList x;
    public float y;
    public float z;
    
    static {
        G = new int[] { 16843828 };
        H = new int[] { 16842931 };
    }
    
    public DrawerLayout(Context obtainStyledAttributes, final AttributeSet set) {
        super(obtainStyledAttributes, set, 0);
        new b();
        this.h = -1728053248;
        this.j = new Paint();
        this.q = true;
        this.r = 3;
        this.s = 3;
        this.t = 3;
        this.u = 3;
        this.setDescendantFocusability(262144);
        final float density = ((View)this).getResources().getDisplayMetrics().density;
        this.g = (int)(64.0f * density + 0.5f);
        final float n = 400.0f * density;
        final g m = new g(3);
        this.m = m;
        final g n2 = new g(5);
        this.n = n2;
        final i4.c c = new i4.c(((View)this).getContext(), this, (i4.c.c)m);
        c.b *= (int)1.0f;
        this.k = c;
        c.p = 1;
        c.n = n;
        m.b = c;
        final i4.c c2 = new i4.c(((View)this).getContext(), this, (i4.c.c)n2);
        c2.b *= (int)1.0f;
        this.l = c2;
        c2.p = 2;
        c2.n = n;
        n2.b = c2;
        ((View)this).setFocusableInTouchMode(true);
        final WeakHashMap a = p0.a;
        p0.d.s((View)this, 1);
        p0.l((View)this, (a4.a)new a());
        this.setMotionEventSplittingEnabled(false);
        if (p0.d.b((View)this)) {
            ((View)this).setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)new j4.a());
            ((View)this).setSystemUiVisibility(1280);
            obtainStyledAttributes = (Context)obtainStyledAttributes.obtainStyledAttributes(DrawerLayout.G);
            try {
                this.A = ((TypedArray)obtainStyledAttributes).getDrawable(0);
            }
            finally {
                ((TypedArray)obtainStyledAttributes).recycle();
            }
        }
        this.f = density * 10.0f;
        this.D = new ArrayList<View>();
    }
    
    public static String k(final int n) {
        if ((n & 0x3) == 0x3) {
            return "LEFT";
        }
        if ((n & 0x5) == 0x5) {
            return "RIGHT";
        }
        return Integer.toHexString(n);
    }
    
    public static boolean l(final View view) {
        return ((d)view.getLayoutParams()).a == 0;
    }
    
    public static boolean n(final View view) {
        if (o(view)) {
            final int d = ((d)view.getLayoutParams()).d;
            boolean b = true;
            if ((d & 0x1) != 0x1) {
                b = false;
            }
            return b;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static boolean o(final View view) {
        final int a = ((d)view.getLayoutParams()).a;
        final WeakHashMap a2 = p0.a;
        final int absoluteGravity = Gravity.getAbsoluteGravity(a, p0.e.d(view));
        return (absoluteGravity & 0x3) != 0x0 || (absoluteGravity & 0x5) != 0x0;
    }
    
    public final void a(final c c) {
        if (c == null) {
            return;
        }
        if (this.x == null) {
            this.x = new ArrayList();
        }
        this.x.add(c);
    }
    
    public final void addFocusables(final ArrayList<View> list, final int n, final int n2) {
        if (this.getDescendantFocusability() == 393216) {
            return;
        }
        final int childCount = this.getChildCount();
        final int n3 = 0;
        int n4;
        for (int i = n4 = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (o(child)) {
                if (n(child)) {
                    child.addFocusables((ArrayList)list, n, n2);
                    n4 = 1;
                }
            }
            else {
                this.D.add(child);
            }
        }
        if (n4 == 0) {
            for (int size = this.D.size(), j = n3; j < size; ++j) {
                final View view = this.D.get(j);
                if (view.getVisibility() == 0) {
                    view.addFocusables((ArrayList)list, n, n2);
                }
            }
        }
        this.D.clear();
    }
    
    public final void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super.addView(view, n, viewGroup$LayoutParams);
        if (this.g() == null && !o(view)) {
            final WeakHashMap a = p0.a;
            p0.d.s(view, 1);
        }
        else {
            final WeakHashMap a2 = p0.a;
            p0.d.s(view, 4);
        }
    }
    
    public final boolean b(final int n, final View view) {
        return (this.j(view) & n) == n;
    }
    
    public final void c(final int n) {
        final View f = this.f(n);
        if (f != null) {
            this.d(f);
            return;
        }
        final StringBuilder k = a.k("No drawer view found with gravity ");
        k.append(k(n));
        throw new IllegalArgumentException(k.toString());
    }
    
    public final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof d && super.checkLayoutParams(viewGroup$LayoutParams);
    }
    
    public final void computeScroll() {
        final int childCount = this.getChildCount();
        float max = 0.0f;
        for (int i = 0; i < childCount; ++i) {
            max = Math.max(max, ((d)this.getChildAt(i).getLayoutParams()).b);
        }
        this.i = max;
        final boolean g = this.k.g();
        final boolean g2 = this.l.g();
        if (g || g2) {
            final WeakHashMap a = p0.a;
            p0.d.k((View)this);
        }
    }
    
    public final void d(final View view) {
        if (o(view)) {
            final d d = (d)view.getLayoutParams();
            if (this.q) {
                d.b = 0.0f;
                d.d = 0;
            }
            else {
                d.d |= 0x4;
                if (this.b(3, view)) {
                    this.k.s(view, -view.getWidth(), view.getTop());
                }
                else {
                    this.l.s(view, ((View)this).getWidth(), view.getTop());
                }
            }
            ((View)this).invalidate();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a sliding drawer");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final boolean dispatchGenericMotionEvent(final MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 0x2) != 0x0 && motionEvent.getAction() != 10 && this.i > 0.0f) {
            int i = this.getChildCount();
            if (i != 0) {
                final float x = motionEvent.getX();
                final float y = motionEvent.getY();
                --i;
                while (i >= 0) {
                    final View child = this.getChildAt(i);
                    if (this.E == null) {
                        this.E = new Rect();
                    }
                    child.getHitRect(this.E);
                    if (this.E.contains((int)x, (int)y)) {
                        if (!l(child)) {
                            boolean b;
                            if (!child.getMatrix().isIdentity()) {
                                final float n = (float)(((View)this).getScrollX() - child.getLeft());
                                final float n2 = (float)(((View)this).getScrollY() - child.getTop());
                                final MotionEvent obtain = MotionEvent.obtain(motionEvent);
                                obtain.offsetLocation(n, n2);
                                final Matrix matrix = child.getMatrix();
                                if (!matrix.isIdentity()) {
                                    if (this.F == null) {
                                        this.F = new Matrix();
                                    }
                                    matrix.invert(this.F);
                                    obtain.transform(this.F);
                                }
                                b = child.dispatchGenericMotionEvent(obtain);
                                obtain.recycle();
                            }
                            else {
                                final float n3 = (float)(((View)this).getScrollX() - child.getLeft());
                                final float n4 = (float)(((View)this).getScrollY() - child.getTop());
                                motionEvent.offsetLocation(n3, n4);
                                b = child.dispatchGenericMotionEvent(motionEvent);
                                motionEvent.offsetLocation(-n3, -n4);
                            }
                            if (b) {
                                return true;
                            }
                        }
                    }
                    --i;
                }
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }
    
    public final boolean drawChild(final Canvas canvas, final View view, final long n) {
        final int height = ((View)this).getHeight();
        final boolean l = l(view);
        int width = ((View)this).getWidth();
        final int save = canvas.save();
        int n2 = 0;
        int n3 = width;
        if (l) {
            int n4;
            int n5;
            for (int childCount = this.getChildCount(), i = n2 = 0; i < childCount; ++i, width = n4, n2 = n5) {
                final View child = this.getChildAt(i);
                n4 = width;
                n5 = n2;
                if (child != view) {
                    n4 = width;
                    n5 = n2;
                    if (child.getVisibility() == 0) {
                        final Drawable background = child.getBackground();
                        final boolean b = background != null && background.getOpacity() == -1;
                        n4 = width;
                        n5 = n2;
                        if (b) {
                            n4 = width;
                            n5 = n2;
                            if (o(child)) {
                                if (child.getHeight() < height) {
                                    n4 = width;
                                    n5 = n2;
                                }
                                else if (this.b(3, child)) {
                                    final int right = child.getRight();
                                    n4 = width;
                                    if (right > (n5 = n2)) {
                                        n5 = right;
                                        n4 = width;
                                    }
                                }
                                else {
                                    final int left = child.getLeft();
                                    n4 = width;
                                    n5 = n2;
                                    if (left < width) {
                                        n4 = left;
                                        n5 = n2;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            canvas.clipRect(n2, 0, width, ((View)this).getHeight());
            n3 = width;
        }
        final boolean drawChild = super.drawChild(canvas, view, n);
        canvas.restoreToCount(save);
        final float j = this.i;
        if (j > 0.0f && l) {
            final int h = this.h;
            this.j.setColor((int)(((0xFF000000 & h) >>> 24) * j) << 24 | (h & 0xFFFFFF));
            canvas.drawRect((float)n2, 0.0f, (float)n3, (float)((View)this).getHeight(), this.j);
        }
        return drawChild;
    }
    
    public final void e(final boolean b) {
        int n;
        int n2;
        for (int childCount = this.getChildCount(), i = n = 0; i < childCount; ++i, n = n2) {
            final View child = this.getChildAt(i);
            final d d = (d)child.getLayoutParams();
            n2 = n;
            if (o(child)) {
                if (b && !d.c) {
                    n2 = n;
                }
                else {
                    final int width = child.getWidth();
                    boolean b2;
                    if (this.b(3, child)) {
                        b2 = this.k.s(child, -width, child.getTop());
                    }
                    else {
                        b2 = this.l.s(child, ((View)this).getWidth(), child.getTop());
                    }
                    n2 = (n | (b2 ? 1 : 0));
                    d.c = false;
                }
            }
        }
        final g m = this.m;
        ((View)m.d).removeCallbacks((Runnable)m.c);
        final g n3 = this.n;
        ((View)n3.d).removeCallbacks((Runnable)n3.c);
        if (n != 0) {
            ((View)this).invalidate();
        }
    }
    
    public final View f(int i) {
        final WeakHashMap a = p0.a;
        final int absoluteGravity = Gravity.getAbsoluteGravity(i, p0.e.d((View)this));
        int childCount;
        View child;
        for (childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            if ((this.j(child) & 0x7) == (absoluteGravity & 0x7)) {
                return child;
            }
        }
        return null;
    }
    
    public final View g() {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if ((((d)child.getLayoutParams()).d & 0x1) == 0x1) {
                return child;
            }
        }
        return null;
    }
    
    public final ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new d();
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new d(((View)this).getContext(), set);
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        d d;
        if (viewGroup$LayoutParams instanceof d) {
            d = new d((d)viewGroup$LayoutParams);
        }
        else if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            d = new d((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        else {
            d = new d(viewGroup$LayoutParams);
        }
        return (ViewGroup$LayoutParams)d;
    }
    
    public float getDrawerElevation() {
        return this.f;
    }
    
    public Drawable getStatusBarBackgroundDrawable() {
        return this.A;
    }
    
    public final View h() {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (o(child)) {
                if (!o(child)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("View ");
                    sb.append(child);
                    sb.append(" is not a drawer");
                    throw new IllegalArgumentException(sb.toString());
                }
                if (((d)child.getLayoutParams()).b > 0.0f) {
                    return child;
                }
            }
        }
        return null;
    }
    
    public final int i(final View view) {
        if (o(view)) {
            final int a = ((d)view.getLayoutParams()).a;
            final WeakHashMap a2 = p0.a;
            final int d = p0.e.d((View)this);
            if (a != 3) {
                if (a != 5) {
                    if (a != 8388611) {
                        if (a == 8388613) {
                            int n = this.u;
                            if (n != 3) {
                                return n;
                            }
                            if (d == 0) {
                                n = this.s;
                            }
                            else {
                                n = this.r;
                            }
                            if (n != 3) {
                                return n;
                            }
                        }
                    }
                    else {
                        int n = this.t;
                        if (n != 3) {
                            return n;
                        }
                        if (d == 0) {
                            n = this.r;
                        }
                        else {
                            n = this.s;
                        }
                        if (n != 3) {
                            return n;
                        }
                    }
                }
                else {
                    int n = this.s;
                    if (n != 3) {
                        return n;
                    }
                    if (d == 0) {
                        n = this.u;
                    }
                    else {
                        n = this.t;
                    }
                    if (n != 3) {
                        return n;
                    }
                }
            }
            else {
                int n = this.r;
                if (n != 3) {
                    return n;
                }
                if (d == 0) {
                    n = this.t;
                }
                else {
                    n = this.u;
                }
                if (n != 3) {
                    return n;
                }
            }
            return 0;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final int j(final View view) {
        final int a = ((d)view.getLayoutParams()).a;
        final WeakHashMap a2 = p0.a;
        return Gravity.getAbsoluteGravity(a, p0.e.d((View)this));
    }
    
    public final boolean m(final int n) {
        final View f = this.f(n);
        return f != null && n(f);
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q = true;
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.q = true;
    }
    
    public final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.C && this.A != null) {
            final Object b = this.B;
            int systemWindowInsetTop;
            if (b != null) {
                systemWindowInsetTop = ((WindowInsets)b).getSystemWindowInsetTop();
            }
            else {
                systemWindowInsetTop = 0;
            }
            if (systemWindowInsetTop > 0) {
                this.A.setBounds(0, 0, ((View)this).getWidth(), systemWindowInsetTop);
                this.A.draw(canvas);
            }
        }
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final boolean r = this.k.r(motionEvent);
        final boolean r2 = this.l.r(motionEvent);
        boolean b = false;
        boolean b5 = false;
        if (actionMasked != 0) {
            Label_0232: {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        final i4.c k = this.k;
                        final int length = k.d.length;
                        int i = 0;
                        while (true) {
                            while (i < length) {
                                boolean b3 = false;
                                Label_0163: {
                                    if ((k.k & 1 << i) != 0x0) {
                                        final float n = k.f[i] - k.d[i];
                                        final float n2 = k.g[i] - k.e[i];
                                        final int b2 = k.b;
                                        if (n2 * n2 + n * n > b2 * b2) {
                                            b3 = true;
                                            break Label_0163;
                                        }
                                    }
                                    b3 = false;
                                }
                                if (b3) {
                                    final boolean b4 = true;
                                    if (b4) {
                                        final g m = this.m;
                                        ((View)m.d).removeCallbacks((Runnable)m.c);
                                        final g n3 = this.n;
                                        ((View)n3.d).removeCallbacks((Runnable)n3.c);
                                    }
                                    break Label_0232;
                                }
                                else {
                                    ++i;
                                }
                            }
                            final boolean b4 = false;
                            continue;
                        }
                    }
                    if (actionMasked != 3) {
                        break Label_0232;
                    }
                }
                this.e(true);
                this.v = false;
            }
            b5 = false;
        }
        else {
            final float x = motionEvent.getX();
            final float y = motionEvent.getY();
            this.y = x;
            this.z = y;
            Label_0302: {
                if (this.i > 0.0f) {
                    final View h = this.k.h((int)x, (int)y);
                    if (h != null && l(h)) {
                        b5 = true;
                        break Label_0302;
                    }
                }
                b5 = false;
            }
            this.v = false;
        }
        if (!(r | r2) && !b5) {
            final int childCount = this.getChildCount();
            int j = 0;
            while (true) {
                while (j < childCount) {
                    if (((d)this.getChildAt(j).getLayoutParams()).c) {
                        final boolean b6 = true;
                        if (b6 || this.v) {
                            return true;
                        }
                        return b;
                    }
                    else {
                        ++j;
                    }
                }
                final boolean b6 = false;
                continue;
            }
        }
        b = true;
        return b;
    }
    
    public final boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        if (n == 4 && this.h() != null) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(n, keyEvent);
    }
    
    public final boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        if (n == 4) {
            final View h = this.h();
            boolean b = false;
            if (h != null && this.i(h) == 0) {
                this.e(false);
            }
            if (h != null) {
                b = true;
            }
            return b;
        }
        return super.onKeyUp(n, keyEvent);
    }
    
    public final void onLayout(final boolean b, int visibility, final int n, int i, final int n2) {
        this.p = true;
        final int n3 = i - visibility;
        int childCount;
        View child;
        d d;
        int leftMargin;
        int measuredWidth;
        int measuredHeight;
        float n4;
        int n5;
        float n6;
        float n7;
        boolean b2;
        int n8;
        int n9;
        int n10;
        for (childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                d = (d)child.getLayoutParams();
                if (l(child)) {
                    leftMargin = d.leftMargin;
                    visibility = d.topMargin;
                    child.layout(leftMargin, visibility, child.getMeasuredWidth() + leftMargin, child.getMeasuredHeight() + d.topMargin);
                }
                else {
                    measuredWidth = child.getMeasuredWidth();
                    measuredHeight = child.getMeasuredHeight();
                    if (this.b(3, child)) {
                        visibility = -measuredWidth;
                        n4 = (float)measuredWidth;
                        n5 = visibility + (int)(d.b * n4);
                        n6 = (measuredWidth + n5) / n4;
                    }
                    else {
                        n7 = (float)measuredWidth;
                        n5 = n3 - (int)(d.b * n7);
                        n6 = (n3 - n5) / n7;
                    }
                    b2 = (n6 != d.b);
                    visibility = (d.a & 0x70);
                    if (visibility != 16) {
                        if (visibility != 80) {
                            visibility = d.topMargin;
                            child.layout(n5, visibility, measuredWidth + n5, measuredHeight + visibility);
                        }
                        else {
                            visibility = n2 - n;
                            child.layout(n5, visibility - d.bottomMargin - child.getMeasuredHeight(), measuredWidth + n5, visibility - d.bottomMargin);
                        }
                    }
                    else {
                        n8 = n2 - n;
                        n9 = (n8 - measuredHeight) / 2;
                        visibility = d.topMargin;
                        if (n9 >= visibility) {
                            n10 = n8 - d.bottomMargin;
                            visibility = n9;
                            if (n9 + measuredHeight > n10) {
                                visibility = n10 - measuredHeight;
                            }
                        }
                        child.layout(n5, visibility, measuredWidth + n5, measuredHeight + visibility);
                    }
                    if (b2) {
                        this.t(child, n6);
                    }
                    if (d.b > 0.0f) {
                        visibility = 0;
                    }
                    else {
                        visibility = 4;
                    }
                    if (child.getVisibility() != visibility) {
                        child.setVisibility(visibility);
                    }
                }
            }
        }
        this.p = false;
        this.q = false;
    }
    
    public final void onMeasure(final int n, final int n2) {
        final int mode = View$MeasureSpec.getMode(n);
        final int mode2 = View$MeasureSpec.getMode(n2);
        int size = View$MeasureSpec.getSize(n);
        final int size2 = View$MeasureSpec.getSize(n2);
        int n3 = 0;
        int n4 = 0;
        Label_0113: {
            if (mode == 1073741824) {
                n3 = size;
                n4 = size2;
                if (mode2 == 1073741824) {
                    break Label_0113;
                }
            }
            if (!((View)this).isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    size = 300;
                }
            }
            if (mode2 == Integer.MIN_VALUE) {
                n3 = size;
                n4 = size2;
            }
            else {
                n3 = size;
                n4 = size2;
                if (mode2 == 0) {
                    n4 = 300;
                    n3 = size;
                }
            }
        }
        ((View)this).setMeasuredDimension(n3, n4);
        final Object b = this.B;
        int n5 = 0;
        boolean b2 = false;
        Label_0155: {
            if (b != null) {
                final WeakHashMap a = p0.a;
                if (p0.d.b((View)this)) {
                    b2 = true;
                    break Label_0155;
                }
            }
            b2 = false;
        }
        final WeakHashMap a2 = p0.a;
        final int d = p0.e.d((View)this);
        final int childCount = this.getChildCount();
        int n7;
        int n6 = n7 = 0;
        while (true) {
            boolean b3 = false;
            if (n5 >= childCount) {
                return;
            }
            final View child = this.getChildAt(n5);
            if (child.getVisibility() != 8) {
                final d d2 = (d)child.getLayoutParams();
                if (b2) {
                    final int absoluteGravity = Gravity.getAbsoluteGravity(d2.a, d);
                    if (p0.d.b(child)) {
                        final WindowInsets windowInsets = (WindowInsets)this.B;
                        WindowInsets windowInsets2;
                        if (absoluteGravity == 3) {
                            windowInsets2 = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        }
                        else {
                            windowInsets2 = windowInsets;
                            if (absoluteGravity == 5) {
                                windowInsets2 = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                        }
                        child.dispatchApplyWindowInsets(windowInsets2);
                    }
                    else {
                        final WindowInsets windowInsets3 = (WindowInsets)this.B;
                        WindowInsets windowInsets4;
                        if (absoluteGravity == 3) {
                            windowInsets4 = windowInsets3.replaceSystemWindowInsets(windowInsets3.getSystemWindowInsetLeft(), windowInsets3.getSystemWindowInsetTop(), 0, windowInsets3.getSystemWindowInsetBottom());
                        }
                        else {
                            windowInsets4 = windowInsets3;
                            if (absoluteGravity == 5) {
                                windowInsets4 = windowInsets3.replaceSystemWindowInsets(0, windowInsets3.getSystemWindowInsetTop(), windowInsets3.getSystemWindowInsetRight(), windowInsets3.getSystemWindowInsetBottom());
                            }
                        }
                        d2.leftMargin = windowInsets4.getSystemWindowInsetLeft();
                        d2.topMargin = windowInsets4.getSystemWindowInsetTop();
                        d2.rightMargin = windowInsets4.getSystemWindowInsetRight();
                        d2.bottomMargin = windowInsets4.getSystemWindowInsetBottom();
                    }
                }
                if (l(child)) {
                    child.measure(View$MeasureSpec.makeMeasureSpec(n3 - d2.leftMargin - d2.rightMargin, 1073741824), View$MeasureSpec.makeMeasureSpec(n4 - d2.topMargin - d2.bottomMargin, 1073741824));
                }
                else {
                    if (!o(child)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Child ");
                        sb.append(child);
                        sb.append(" at index ");
                        sb.append(n5);
                        sb.append(" does not have a valid layout_gravity - must be Gravity.LEFT, ");
                        sb.append("Gravity.RIGHT or Gravity.NO_GRAVITY");
                        throw new IllegalStateException(sb.toString());
                    }
                    final float i = p0.i.i(child);
                    final float f = this.f;
                    if (i != f) {
                        p0.i.s(child, f);
                    }
                    final int n8 = this.j(child) & 0x7;
                    if (n8 == 3) {
                        b3 = true;
                    }
                    if ((b3 && n6 != 0) || (!b3 && n7 != 0)) {
                        final StringBuilder k = a.k("Child drawer has absolute gravity ");
                        k.append(k(n8));
                        k.append(" but this ");
                        k.append("DrawerLayout");
                        k.append(" already has a ");
                        k.append("drawer view along that edge");
                        throw new IllegalStateException(k.toString());
                    }
                    if (b3) {
                        n6 = 1;
                    }
                    else {
                        n7 = 1;
                    }
                    child.measure(ViewGroup.getChildMeasureSpec(n, this.g + d2.leftMargin + d2.rightMargin, d2.width), ViewGroup.getChildMeasureSpec(n2, d2.topMargin + d2.bottomMargin, d2.height));
                }
            }
            ++n5;
        }
    }
    
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final e e = (e)parcelable;
        super.onRestoreInstanceState(e.f);
        final int h = e.h;
        if (h != 0) {
            final View f = this.f(h);
            if (f != null) {
                this.q(f);
            }
        }
        final int i = e.i;
        if (i != 3) {
            this.s(i, 3);
        }
        final int j = e.j;
        if (j != 3) {
            this.s(j, 5);
        }
        final int k = e.k;
        if (k != 3) {
            this.s(k, 8388611);
        }
        final int l = e.l;
        if (l != 3) {
            this.s(l, 8388613);
        }
    }
    
    public final void onRtlPropertiesChanged(final int n) {
    }
    
    public final Parcelable onSaveInstanceState() {
        final e e = new e(super.onSaveInstanceState());
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final d d = (d)this.getChildAt(i).getLayoutParams();
            final int d2 = d.d;
            boolean b = true;
            final boolean b2 = d2 == 1;
            if (d2 != 2) {
                b = false;
            }
            if (b2 || b) {
                e.h = d.a;
                break;
            }
        }
        e.i = this.r;
        e.j = this.s;
        e.k = this.t;
        e.l = this.u;
        return (Parcelable)e;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        this.k.k(motionEvent);
        this.l.k(motionEvent);
        final int n = motionEvent.getAction() & 0xFF;
        boolean b = false;
        if (n != 0) {
            if (n != 1) {
                if (n == 3) {
                    this.e(true);
                    this.v = false;
                }
            }
            else {
                final float x = motionEvent.getX();
                final float y = motionEvent.getY();
                final View h = this.k.h((int)x, (int)y);
                Label_0159: {
                    if (h != null && l(h)) {
                        final float n2 = x - this.y;
                        final float n3 = y - this.z;
                        final int b2 = this.k.b;
                        if (n3 * n3 + n2 * n2 < b2 * b2) {
                            final View g = this.g();
                            if (g != null && this.i(g) != 2) {
                                break Label_0159;
                            }
                        }
                    }
                    b = true;
                }
                this.e(b);
            }
        }
        else {
            final float x2 = motionEvent.getX();
            final float y2 = motionEvent.getY();
            this.y = x2;
            this.z = y2;
            this.v = false;
        }
        return true;
    }
    
    public final void p(final int n) {
        final View f = this.f(n);
        if (f != null) {
            this.q(f);
            return;
        }
        final StringBuilder k = a.k("No drawer view found with gravity ");
        k.append(k(n));
        throw new IllegalArgumentException(k.toString());
    }
    
    public final void q(final View view) {
        if (o(view)) {
            final d d = (d)view.getLayoutParams();
            if (this.q) {
                d.b = 1.0f;
                d.d = 1;
                this.u(view, true);
            }
            else {
                d.d |= 0x2;
                if (this.b(3, view)) {
                    this.k.s(view, 0, view.getTop());
                }
                else {
                    this.l.s(view, ((View)this).getWidth() - view.getWidth(), view.getTop());
                }
            }
            ((View)this).invalidate();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a sliding drawer");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void r(final c c) {
        if (c == null) {
            return;
        }
        final ArrayList x = this.x;
        if (x == null) {
            return;
        }
        x.remove(c);
    }
    
    public final void requestDisallowInterceptTouchEvent(final boolean b) {
        super.requestDisallowInterceptTouchEvent(b);
        if (b) {
            this.e(true);
        }
    }
    
    public final void requestLayout() {
        if (!this.p) {
            super.requestLayout();
        }
    }
    
    public final void s(final int n, final int n2) {
        final WeakHashMap a = p0.a;
        final int absoluteGravity = Gravity.getAbsoluteGravity(n2, p0.e.d((View)this));
        if (n2 != 3) {
            if (n2 != 5) {
                if (n2 != 8388611) {
                    if (n2 == 8388613) {
                        this.u = n;
                    }
                }
                else {
                    this.t = n;
                }
            }
            else {
                this.s = n;
            }
        }
        else {
            this.r = n;
        }
        if (n != 0) {
            i4.c c;
            if (absoluteGravity == 3) {
                c = this.k;
            }
            else {
                c = this.l;
            }
            c.a();
        }
        if (n != 1) {
            if (n == 2) {
                final View f = this.f(absoluteGravity);
                if (f != null) {
                    this.q(f);
                }
            }
        }
        else {
            final View f2 = this.f(absoluteGravity);
            if (f2 != null) {
                this.d(f2);
            }
        }
    }
    
    public void setDrawerElevation(float f) {
        this.f = f;
        for (int i = 0; i < this.getChildCount(); ++i) {
            final View child = this.getChildAt(i);
            if (o(child)) {
                f = this.f;
                final WeakHashMap a = p0.a;
                p0.i.s(child, f);
            }
        }
    }
    
    @Deprecated
    public void setDrawerListener(final c w) {
        final c w2 = this.w;
        if (w2 != null) {
            this.r(w2);
        }
        if (w != null) {
            this.a(w);
        }
        this.w = w;
    }
    
    public void setDrawerLockMode(final int n) {
        this.s(n, 3);
        this.s(n, 5);
    }
    
    public void setScrimColor(final int h) {
        this.h = h;
        ((View)this).invalidate();
    }
    
    public void setStatusBarBackground(final int n) {
        Drawable drawable;
        if (n != 0) {
            drawable = n3.a.getDrawable(((View)this).getContext(), n);
        }
        else {
            drawable = null;
        }
        this.A = drawable;
        ((View)this).invalidate();
    }
    
    public void setStatusBarBackground(final Drawable a) {
        this.A = a;
        ((View)this).invalidate();
    }
    
    public void setStatusBarBackgroundColor(final int n) {
        this.A = (Drawable)new ColorDrawable(n);
        ((View)this).invalidate();
    }
    
    public final void t(final View view, final float b) {
        final d d = (d)view.getLayoutParams();
        if (b == d.b) {
            return;
        }
        d.b = b;
        final ArrayList x = this.x;
        if (x != null) {
            int size = x.size();
            while (--size >= 0) {
                ((c)this.x.get(size)).h(view);
            }
        }
    }
    
    public final void u(final View view, final boolean b) {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if ((!b && !o(child)) || (b && child == view)) {
                final WeakHashMap a = p0.a;
                p0.d.s(child, 1);
            }
            else {
                final WeakHashMap a2 = p0.a;
                p0.d.s(child, 4);
            }
        }
    }
    
    public final void v(View rootView, int i) {
        final int a = this.k.a;
        final int a2 = this.l.a;
        final int n = 2;
        int o;
        if (a != 1 && a2 != 1) {
            o = n;
            if (a != 2) {
                if (a2 == 2) {
                    o = n;
                }
                else {
                    o = 0;
                }
            }
        }
        else {
            o = 1;
        }
        if (rootView != null && i == 0) {
            final float b = ((d)rootView.getLayoutParams()).b;
            if (b == 0.0f) {
                final d d = (d)rootView.getLayoutParams();
                if ((d.d & 0x1) == 0x1) {
                    d.d = 0;
                    final ArrayList x = this.x;
                    if (x != null) {
                        for (i = x.size() - 1; i >= 0; --i) {
                            this.x.get(i).e(rootView);
                        }
                    }
                    this.u(rootView, false);
                    if (((View)this).hasWindowFocus()) {
                        rootView = ((View)this).getRootView();
                        if (rootView != null) {
                            rootView.sendAccessibilityEvent(32);
                        }
                    }
                }
            }
            else if (b == 1.0f) {
                final d d2 = (d)rootView.getLayoutParams();
                if ((d2.d & 0x1) == 0x0) {
                    d2.d = 1;
                    final ArrayList x2 = this.x;
                    if (x2 != null) {
                        for (i = x2.size() - 1; i >= 0; --i) {
                            this.x.get(i).d(rootView);
                        }
                    }
                    this.u(rootView, true);
                    if (((View)this).hasWindowFocus()) {
                        ((View)this).sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (o != this.o) {
            this.o = o;
            final ArrayList x3 = this.x;
            if (x3 != null) {
                for (i = x3.size() - 1; i >= 0; --i) {
                    this.x.get(i).c();
                }
            }
        }
    }
    
    public final class a extends a4.a
    {
        public a() {
            new Rect();
        }
        
        @Override
        public final boolean dispatchPopulateAccessibilityEvent(View h, final AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                ((AccessibilityRecord)accessibilityEvent).getText();
                h = DrawerLayout.this.h();
                if (h != null) {
                    final int j = DrawerLayout.this.j(h);
                    final DrawerLayout b = DrawerLayout.this;
                    b.getClass();
                    final WeakHashMap a = p0.a;
                    Gravity.getAbsoluteGravity(j, p0.e.d((View)b));
                }
                return true;
            }
            return super.dispatchPopulateAccessibilityEvent(h, accessibilityEvent);
        }
        
        @Override
        public final void onInitializeAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            ((AccessibilityRecord)accessibilityEvent).setClassName((CharSequence)DrawerLayout.class.getName());
        }
        
        @Override
        public final void onInitializeAccessibilityNodeInfo(final View view, final b4.c c) {
            final int[] g = DrawerLayout.G;
            super.onInitializeAccessibilityNodeInfo(view, c);
            c.n((CharSequence)DrawerLayout.class.getName());
            c.a.setFocusable(false);
            c.a.setFocused(false);
            c.k(c$a.e);
            c.k(c$a.f);
        }
        
        @Override
        public final boolean onRequestSendAccessibilityEvent(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
            final int[] g = DrawerLayout.G;
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }
    
    public static final class b extends a
    {
        @Override
        public final void onInitializeAccessibilityNodeInfo(final View view, final b4.c c) {
            super.onInitializeAccessibilityNodeInfo(view, c);
            final int[] g = DrawerLayout.G;
            final WeakHashMap a = p0.a;
            if (p0.d.c(view) == 4 || p0.d.c(view) == 2) {
                c.b = -1;
                c.a.setParent((View)null);
            }
        }
    }
    
    public interface c
    {
        void c();
        
        void d(final View p0);
        
        void e(final View p0);
        
        void h(final View p0);
    }
    
    public static final class d extends ViewGroup$MarginLayoutParams
    {
        public int a;
        public float b;
        public boolean c;
        public int d;
        
        public d() {
            super(-1, -1);
            this.a = 0;
        }
        
        public d(final Context context, final AttributeSet set) {
            super(context, set);
            this.a = 0;
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, DrawerLayout.H);
            this.a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }
        
        public d(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
            this.a = 0;
        }
        
        public d(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            super(viewGroup$MarginLayoutParams);
            this.a = 0;
        }
        
        public d(final d d) {
            super((ViewGroup$MarginLayoutParams)d);
            this.a = 0;
            this.a = d.a;
        }
    }
    
    public static final class e extends h4.a
    {
        public static final Parcelable$Creator<e> CREATOR;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<e>() {
                public final Object createFromParcel(final Parcel parcel) {
                    return new e(parcel, null);
                }
                
                public final Object createFromParcel(final Parcel parcel, final ClassLoader classLoader) {
                    return new e(parcel, classLoader);
                }
                
                public final Object[] newArray(final int n) {
                    return new e[n];
                }
            };
        }
        
        public e(final Parcel parcel, final ClassLoader classLoader) {
            super(parcel, classLoader);
            this.h = 0;
            this.h = parcel.readInt();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
            this.l = parcel.readInt();
        }
        
        public e(final Parcelable parcelable) {
            super(parcelable);
            this.h = 0;
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeParcelable(super.f, n);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
            parcel.writeInt(this.l);
        }
    }
    
    public abstract static class f implements c
    {
        @Override
        public final void c() {
        }
        
        @Override
        public void e(final View view) {
        }
        
        @Override
        public final void h(final View view) {
        }
    }
    
    public final class g extends c.c
    {
        public final int a;
        public c b;
        public final DrawerLayout$g$a c;
        public final /* synthetic */ DrawerLayout d;
        
        public g(final int a) {
            this.c = new Runnable() {
                @Override
                public final void run() {
                    final g f = g.this;
                    final int o = f.b.o;
                    final int a = f.a;
                    final int n = 3;
                    final int n2 = 0;
                    final boolean b = a == 3;
                    View view;
                    int n4;
                    if (b) {
                        view = f.d.f(3);
                        int n3;
                        if (view != null) {
                            n3 = -view.getWidth();
                        }
                        else {
                            n3 = 0;
                        }
                        n4 = n3 + o;
                    }
                    else {
                        view = f.d.f(5);
                        n4 = ((View)f.d).getWidth() - o;
                    }
                    if (view != null && ((b && view.getLeft() < n4) || (!b && view.getLeft() > n4)) && f.d.i(view) == 0) {
                        final d d = (d)view.getLayoutParams();
                        f.b.s(view, n4, view.getTop());
                        d.c = true;
                        ((View)f.d).invalidate();
                        int n5 = n;
                        if (f.a == 3) {
                            n5 = 5;
                        }
                        final View f2 = f.d.f(n5);
                        if (f2 != null) {
                            f.d.d(f2);
                        }
                        final DrawerLayout d2 = f.d;
                        if (!d2.v) {
                            final long uptimeMillis = SystemClock.uptimeMillis();
                            final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                            for (int childCount = d2.getChildCount(), i = n2; i < childCount; ++i) {
                                d2.getChildAt(i).dispatchTouchEvent(obtain);
                            }
                            obtain.recycle();
                            d2.v = true;
                        }
                    }
                }
            };
            this.a = a;
        }
        
        @Override
        public final int a(final View view, final int n) {
            if (DrawerLayout.this.b(3, view)) {
                return Math.max(-view.getWidth(), Math.min(n, 0));
            }
            final int width = ((View)DrawerLayout.this).getWidth();
            return Math.max(width - view.getWidth(), Math.min(n, width));
        }
        
        @Override
        public final int b(final View view, final int n) {
            return view.getTop();
        }
        
        @Override
        public final int c(final View view) {
            DrawerLayout.this.getClass();
            int width;
            if (DrawerLayout.o(view)) {
                width = view.getWidth();
            }
            else {
                width = 0;
            }
            return width;
        }
        
        @Override
        public final void e(final int n, final int n2) {
            View view;
            if ((n & 0x1) == 0x1) {
                view = DrawerLayout.this.f(3);
            }
            else {
                view = DrawerLayout.this.f(5);
            }
            if (view != null && DrawerLayout.this.i(view) == 0) {
                this.b.b(n2, view);
            }
        }
        
        @Override
        public final void f() {
            ((View)DrawerLayout.this).postDelayed((Runnable)this.c, 160L);
        }
        
        @Override
        public final void g(int n, View f) {
            ((d)f.getLayoutParams()).c = false;
            final int a = this.a;
            n = 3;
            if (a == 3) {
                n = 5;
            }
            f = DrawerLayout.this.f(n);
            if (f != null) {
                DrawerLayout.this.d(f);
            }
        }
        
        @Override
        public final void h(final int n) {
            DrawerLayout.this.v(this.b.s, n);
        }
        
        @Override
        public final void i(final View view, int visibility, int width) {
            width = view.getWidth();
            float n;
            if (DrawerLayout.this.b(3, view)) {
                n = (float)(visibility + width);
            }
            else {
                n = (float)(((View)DrawerLayout.this).getWidth() - visibility);
            }
            final float n2 = n / width;
            DrawerLayout.this.t(view, n2);
            if (n2 == 0.0f) {
                visibility = 4;
            }
            else {
                visibility = 0;
            }
            view.setVisibility(visibility);
            ((View)DrawerLayout.this).invalidate();
        }
        
        @Override
        public final void j(final View view, final float n, float b) {
            DrawerLayout.this.getClass();
            b = ((d)view.getLayoutParams()).b;
            final int width = view.getWidth();
            int n3 = 0;
            Label_0119: {
                if (DrawerLayout.this.b(3, view)) {
                    final float n2 = fcmpl(n, 0.0f);
                    if (n2 <= 0 && (n2 != 0 || b <= 0.5f)) {
                        n3 = -width;
                    }
                    else {
                        n3 = 0;
                    }
                }
                else {
                    final int width2 = ((View)DrawerLayout.this).getWidth();
                    if (n >= 0.0f) {
                        n3 = width2;
                        if (n != 0.0f) {
                            break Label_0119;
                        }
                        n3 = width2;
                        if (b <= 0.5f) {
                            break Label_0119;
                        }
                    }
                    n3 = width2 - width;
                }
            }
            this.b.q(n3, view.getTop());
            ((View)DrawerLayout.this).invalidate();
        }
        
        @Override
        public final boolean k(final int n, final View view) {
            DrawerLayout.this.getClass();
            return DrawerLayout.o(view) && DrawerLayout.this.b(this.a, view) && DrawerLayout.this.i(view) == 0;
        }
    }
}

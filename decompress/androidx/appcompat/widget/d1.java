// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.view.ViewManager;
import android.view.accessibility.AccessibilityManager;
import android.view.MotionEvent;
import android.util.DisplayMetrics;
import android.graphics.Rect;
import android.content.Context;
import android.content.res.Resources;
import java.util.WeakHashMap;
import a4.l0$d;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import android.app.Activity;
import android.content.ContextWrapper;
import android.view.WindowManager$LayoutParams;
import a4.l0$g;
import a4.l0;
import android.util.Log;
import android.view.WindowManager;
import java.lang.reflect.Method;
import a4.c1$b;
import android.os.Build$VERSION;
import android.view.ViewConfiguration;
import androidx.activity.b;
import android.view.View;
import android.view.View$OnAttachStateChangeListener;
import android.view.View$OnHoverListener;
import android.view.View$OnLongClickListener;

public final class d1 implements View$OnLongClickListener, View$OnHoverListener, View$OnAttachStateChangeListener
{
    public static d1 p;
    public static d1 q;
    public final View f;
    public final CharSequence g;
    public final int h;
    public final c1 i;
    public final b j;
    public int k;
    public int l;
    public e1 m;
    public boolean n;
    public boolean o;
    
    public d1(final View f, final CharSequence g) {
        this.i = new c1(this, 0);
        this.j = new b((Object)this, 2);
        this.f = f;
        this.g = g;
        final ViewConfiguration value = ViewConfiguration.get(f.getContext());
        final Method a = a4.c1.a;
        int a2;
        if (Build$VERSION.SDK_INT >= 28) {
            a2 = c1$b.a(value);
        }
        else {
            a2 = value.getScaledTouchSlop() / 2;
        }
        this.h = a2;
        this.o = true;
        f.setOnLongClickListener((View$OnLongClickListener)this);
        f.setOnHoverListener((View$OnHoverListener)this);
    }
    
    public static void b(final d1 p) {
        final d1 p2 = d1.p;
        if (p2 != null) {
            p2.f.removeCallbacks((Runnable)p2.i);
        }
        if ((d1.p = p) != null) {
            p.f.postDelayed((Runnable)p.i, (long)ViewConfiguration.getLongPressTimeout());
        }
    }
    
    public final void a() {
        if (d1.q == this) {
            d1.q = null;
            final e1 m = this.m;
            if (m != null) {
                if (m.b.getParent() != null) {
                    ((ViewManager)m.a.getSystemService("window")).removeView(m.b);
                }
                this.m = null;
                this.o = true;
                this.f.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
            }
            else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (d1.p == this) {
            b(null);
        }
        this.f.removeCallbacks((Runnable)this.j);
    }
    
    public final void c(final boolean n) {
        final View f = this.f;
        final WeakHashMap a = l0.a;
        if (!l0$g.b(f)) {
            return;
        }
        b(null);
        final d1 q = d1.q;
        if (q != null) {
            q.a();
        }
        d1.q = this;
        this.n = n;
        final e1 m = new e1(this.f.getContext());
        this.m = m;
        final View f2 = this.f;
        final int k = this.k;
        final int l = this.l;
        final boolean n2 = this.n;
        final CharSequence g = this.g;
        if (m.b.getParent() != null) {
            if (m.b.getParent() != null) {
                ((ViewManager)m.a.getSystemService("window")).removeView(m.b);
            }
        }
        m.c.setText(g);
        final WindowManager$LayoutParams d = m.d;
        d.token = f2.getApplicationWindowToken();
        final int dimensionPixelOffset = m.a.getResources().getDimensionPixelOffset(2131166880);
        int n3;
        if (f2.getWidth() >= dimensionPixelOffset) {
            n3 = k;
        }
        else {
            n3 = f2.getWidth() / 2;
        }
        int height;
        int n4;
        if (f2.getHeight() >= dimensionPixelOffset) {
            final int dimensionPixelOffset2 = m.a.getResources().getDimensionPixelOffset(2131166879);
            height = l + dimensionPixelOffset2;
            n4 = l - dimensionPixelOffset2;
        }
        else {
            height = f2.getHeight();
            n4 = 0;
        }
        d.gravity = 49;
        final Resources resources = m.a.getResources();
        int n5;
        if (n2) {
            n5 = 2131166884;
        }
        else {
            n5 = 2131166883;
        }
        final int dimensionPixelOffset3 = resources.getDimensionPixelOffset(n5);
        final View rootView = f2.getRootView();
        final ViewGroup$LayoutParams layoutParams = rootView.getLayoutParams();
        View decorView;
        if (layoutParams instanceof WindowManager$LayoutParams && ((WindowManager$LayoutParams)layoutParams).type == 2) {
            decorView = rootView;
        }
        else {
            Context context = f2.getContext();
            while (true) {
                decorView = rootView;
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof Activity) {
                    decorView = ((Activity)context).getWindow().getDecorView();
                    break;
                }
                context = ((ContextWrapper)context).getBaseContext();
            }
        }
        if (decorView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
        }
        else {
            decorView.getWindowVisibleDisplayFrame(m.e);
            final Rect e = m.e;
            if (e.left < 0 && e.top < 0) {
                final Resources resources2 = m.a.getResources();
                final int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                int dimensionPixelSize;
                if (identifier != 0) {
                    dimensionPixelSize = resources2.getDimensionPixelSize(identifier);
                }
                else {
                    dimensionPixelSize = 0;
                }
                final DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                m.e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            decorView.getLocationOnScreen(m.g);
            f2.getLocationOnScreen(m.f);
            final int[] f3 = m.f;
            final int n6 = f3[0];
            final int[] g2 = m.g;
            final int n7 = n6 - g2[0];
            f3[0] = n7;
            f3[1] -= g2[1];
            d.x = n7 + n3 - decorView.getWidth() / 2;
            final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
            m.b.measure(measureSpec, measureSpec);
            final int measuredHeight = m.b.getMeasuredHeight();
            final int n8 = m.f[1];
            final int n9 = n4 + n8 - dimensionPixelOffset3 - measuredHeight;
            final int n10 = n8 + height + dimensionPixelOffset3;
            if (n2) {
                if (n9 >= 0) {
                    d.y = n9;
                }
                else {
                    d.y = n10;
                }
            }
            else if (measuredHeight + n10 <= m.e.height()) {
                d.y = n10;
            }
            else {
                d.y = n9;
            }
        }
        ((ViewManager)m.a.getSystemService("window")).addView(m.b, (ViewGroup$LayoutParams)m.d);
        this.f.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        long n11;
        if (this.n) {
            n11 = 2500L;
        }
        else {
            long n12;
            int n13;
            if ((l0$d.g(this.f) & 0x1) == 0x1) {
                n12 = 3000L;
                n13 = ViewConfiguration.getLongPressTimeout();
            }
            else {
                n12 = 15000L;
                n13 = ViewConfiguration.getLongPressTimeout();
            }
            n11 = n12 - n13;
        }
        this.f.removeCallbacks((Runnable)this.j);
        this.f.postDelayed((Runnable)this.j, n11);
    }
    
    public final boolean onHover(final View view, final MotionEvent motionEvent) {
        if (this.m != null && this.n) {
            return false;
        }
        final AccessibilityManager accessibilityManager = (AccessibilityManager)this.f.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        final int action = motionEvent.getAction();
        boolean b = true;
        if (action != 7) {
            if (action == 10) {
                this.o = true;
                this.a();
            }
        }
        else if (this.f.isEnabled() && this.m == null) {
            final int k = (int)motionEvent.getX();
            final int l = (int)motionEvent.getY();
            if (!this.o && Math.abs(k - this.k) <= this.h && Math.abs(l - this.l) <= this.h) {
                b = false;
            }
            else {
                this.k = k;
                this.l = l;
                this.o = false;
            }
            if (b) {
                b(this);
            }
        }
        return false;
    }
    
    public final boolean onLongClick(final View view) {
        this.k = view.getWidth() / 2;
        this.l = view.getHeight() / 2;
        this.c(true);
        return true;
    }
    
    public final void onViewAttachedToWindow(final View view) {
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        this.a();
    }
}

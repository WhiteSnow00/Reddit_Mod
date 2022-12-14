// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.view.MotionEvent;
import androidx.appcompat.view.menu.MenuBuilder;
import android.content.res.TypedArray;
import mg.d0;
import android.content.res.Configuration;
import a4.l1;
import a4.l0;
import android.view.View$MeasureSpec;
import android.view.View;
import android.view.ContextThemeWrapper;
import android.util.TypedValue;
import android.util.AttributeSet;
import a4.k1;
import android.content.Context;
import android.view.ViewGroup;

public abstract class a extends ViewGroup
{
    public final a.a$a f;
    public final Context g;
    public ActionMenuView h;
    public c i;
    public int j;
    public k1 k;
    public boolean l;
    public boolean m;
    
    public a(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public a(final Context g, final AttributeSet set, final int n) {
        super(g, set, n);
        this.f = new a.a$a(this);
        final TypedValue typedValue = new TypedValue();
        if (g.getTheme().resolveAttribute(2130968580, typedValue, true) && typedValue.resourceId != 0) {
            this.g = (Context)new ContextThemeWrapper(g, typedValue.resourceId);
        }
        else {
            this.g = g;
        }
    }
    
    public static void a(final a a) {
        ((View)a).setVisibility(0);
    }
    
    public static void b(final a a, final int visibility) {
        ((View)a).setVisibility(visibility);
    }
    
    public static int c(final View view, final int n, final int n2) {
        view.measure(View$MeasureSpec.makeMeasureSpec(n, Integer.MIN_VALUE), n2);
        return Math.max(0, n - view.getMeasuredWidth() - 0);
    }
    
    public static int d(final View view, final boolean b, int n, int n2, final int n3) {
        final int measuredWidth = view.getMeasuredWidth();
        final int measuredHeight = view.getMeasuredHeight();
        n2 += (n3 - measuredHeight) / 2;
        if (b) {
            view.layout(n - measuredWidth, n2, n, measuredHeight + n2);
        }
        else {
            view.layout(n, n2, n + measuredWidth, measuredHeight + n2);
        }
        n = measuredWidth;
        if (b) {
            n = -measuredWidth;
        }
        return n;
    }
    
    public final k1 e(final int n, final long n2) {
        final k1 k = this.k;
        if (k != null) {
            k.b();
        }
        if (n == 0) {
            if (((View)this).getVisibility() != 0) {
                ((View)this).setAlpha(0.0f);
            }
            final k1 a = l0.a((View)this);
            a.a(1.0f);
            a.c(n2);
            final a.a$a f = this.f;
            f.h.k = a;
            f.g = n;
            a.e((l1)f);
            return a;
        }
        final k1 a2 = l0.a((View)this);
        a2.a(0.0f);
        a2.c(n2);
        final a.a$a f2 = this.f;
        f2.h.k = a2;
        f2.g = n;
        a2.e((l1)f2);
        return a2;
    }
    
    public int getAnimatedVisibility() {
        if (this.k != null) {
            return this.f.g;
        }
        return ((View)this).getVisibility();
    }
    
    public int getContentHeight() {
        return this.j;
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final TypedArray obtainStyledAttributes = ((View)this).getContext().obtainStyledAttributes((AttributeSet)null, d0.x, 2130968583, 0);
        this.setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        final c i = this.i;
        if (i != null) {
            i.v = new k.a(i.g).a();
            final MenuBuilder h = i.h;
            if (h != null) {
                h.onItemsChanged(true);
            }
        }
    }
    
    public final boolean onHoverEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.m = false;
        }
        if (!this.m) {
            final boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.m = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.m = false;
        }
        return true;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.l = false;
        }
        if (!this.l) {
            final boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.l = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.l = false;
        }
        return true;
    }
    
    public void setContentHeight(final int j) {
        this.j = j;
        ((View)this).requestLayout();
    }
    
    public void setVisibility(final int visibility) {
        if (visibility != ((View)this).getVisibility()) {
            final k1 k = this.k;
            if (k != null) {
                k.b();
            }
            super.setVisibility(visibility);
        }
    }
}

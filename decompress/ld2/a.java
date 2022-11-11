// 
// Decompiled by Procyon v0.6.0
// 

package ld2;

import android.view.MotionEvent;
import android.view.View;
import android.content.Context;
import a4.c0;
import a4.b0;
import android.webkit.WebView;

public final class a extends WebView implements b0
{
    public int f;
    public final int[] g;
    public final int[] h;
    public int i;
    public c0 j;
    
    public a(final Context context) {
        super(context);
        this.g = new int[2];
        this.h = new int[2];
        this.j = new c0((View)this);
        this.setNestedScrollingEnabled(true);
    }
    
    public final boolean dispatchNestedFling(final float n, final float n2, final boolean b) {
        return this.j.a(n, n2, b);
    }
    
    public final boolean dispatchNestedPreFling(final float n, final float n2) {
        return this.j.b(n, n2);
    }
    
    public final boolean dispatchNestedPreScroll(final int n, final int n2, final int[] array, final int[] array2) {
        return this.j.c(n, n2, array, array2, 0);
    }
    
    public final boolean dispatchNestedScroll(final int n, final int n2, final int n3, final int n4, final int[] array) {
        return this.j.e(n, n2, n3, n4, array);
    }
    
    public final boolean hasNestedScrollingParent() {
        return this.j.h(0);
    }
    
    public final boolean isNestedScrollingEnabled() {
        return this.j.d;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        final MotionEvent obtain = MotionEvent.obtain(motionEvent);
        final int actionMasked = motionEvent.getActionMasked();
        boolean b = false;
        if (actionMasked == 0) {
            this.i = 0;
        }
        final int f = (int)motionEvent.getY();
        motionEvent.offsetLocation(0.0f, (float)this.i);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int n2;
                    final int n = n2 = this.f - f;
                    if (this.dispatchNestedPreScroll(0, n, this.h, this.g)) {
                        n2 = n - this.h[1];
                        obtain.offsetLocation(0.0f, (float)this.g[1]);
                        this.i += this.g[1];
                    }
                    this.f = f - this.g[1];
                    final int scrollY = ((View)this).getScrollY();
                    final int n3 = Math.max(0, scrollY + n2) - scrollY;
                    if (this.dispatchNestedScroll(0, n3, 0, n2 - n3, this.g)) {
                        final int f2 = this.f;
                        final int n4 = this.g[1];
                        this.f = f2 - n4;
                        obtain.offsetLocation(0.0f, (float)n4);
                        this.i += this.g[1];
                    }
                    b = super.onTouchEvent(obtain);
                    obtain.recycle();
                    return b;
                }
                if (actionMasked != 3 && actionMasked != 5 && actionMasked != 6) {
                    return b;
                }
            }
            this.stopNestedScroll();
            b = super.onTouchEvent(motionEvent);
        }
        else {
            this.f = f;
            this.startNestedScroll(2);
            b = super.onTouchEvent(motionEvent);
        }
        return b;
    }
    
    public void setNestedScrollingEnabled(final boolean b) {
        this.j.i(b);
    }
    
    public final boolean startNestedScroll(final int n) {
        return this.j.j(n, 0);
    }
    
    public final void stopNestedScroll() {
        this.j.k(0);
    }
}

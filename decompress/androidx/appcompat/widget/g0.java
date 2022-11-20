// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.view.ViewParent;
import android.os.SystemClock;
import android.view.MotionEvent;
import l.f;
import android.view.ViewConfiguration;
import android.view.View;
import android.view.View$OnAttachStateChangeListener;
import android.view.View$OnTouchListener;

public abstract class g0 implements View$OnTouchListener, View$OnAttachStateChangeListener
{
    public final float f;
    public final int g;
    public final int h;
    public final View i;
    public a j;
    public b k;
    public boolean l;
    public int m;
    public final int[] n;
    
    public g0(final View i) {
        this.n = new int[2];
        (this.i = i).setLongClickable(true);
        i.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        this.f = (float)ViewConfiguration.get(i.getContext()).getScaledTouchSlop();
        final int tapTimeout = ViewConfiguration.getTapTimeout();
        this.g = tapTimeout;
        this.h = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }
    
    public final void a() {
        final b k = this.k;
        if (k != null) {
            this.i.removeCallbacks((Runnable)k);
        }
        final a j = this.j;
        if (j != null) {
            this.i.removeCallbacks((Runnable)j);
        }
    }
    
    public abstract f b();
    
    public abstract boolean c();
    
    public boolean d() {
        final f b = this.b();
        if (b != null && b.a()) {
            b.dismiss();
        }
        return true;
    }
    
    public final boolean onTouch(View i, final MotionEvent motionEvent) {
        final boolean l = this.l;
        final boolean b = true;
        boolean k;
        if (l) {
            final View j = this.i;
            final f b2 = this.b();
            boolean b5 = false;
            Label_0188: {
                if (b2 != null) {
                    if (b2.a()) {
                        final e0 h = b2.h();
                        if (h != null) {
                            if (((View)h).isShown()) {
                                final MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                                final int[] n = this.n;
                                j.getLocationOnScreen(n);
                                obtainNoHistory.offsetLocation((float)n[0], (float)n[1]);
                                final int[] n2 = this.n;
                                ((View)h).getLocationOnScreen(n2);
                                obtainNoHistory.offsetLocation((float)(-n2[0]), (float)(-n2[1]));
                                final boolean b3 = h.b(obtainNoHistory, this.m);
                                obtainNoHistory.recycle();
                                final int actionMasked = motionEvent.getActionMasked();
                                final boolean b4 = actionMasked != 1 && actionMasked != 3;
                                if (b3 && b4) {
                                    b5 = true;
                                    break Label_0188;
                                }
                            }
                        }
                    }
                }
                b5 = false;
            }
            k = (b5 || !this.d());
        }
        else {
            i = this.i;
            boolean b6 = false;
            Label_0474: {
                Label_0471: {
                    if (i.isEnabled()) {
                        final int actionMasked2 = motionEvent.getActionMasked();
                        if (actionMasked2 != 0) {
                            if (actionMasked2 != 1) {
                                if (actionMasked2 != 2) {
                                    if (actionMasked2 != 3) {
                                        break Label_0471;
                                    }
                                }
                                else {
                                    final int pointerIndex = motionEvent.findPointerIndex(this.m);
                                    if (pointerIndex < 0) {
                                        break Label_0471;
                                    }
                                    final float x = motionEvent.getX(pointerIndex);
                                    final float y = motionEvent.getY(pointerIndex);
                                    final float f = this.f;
                                    final float n3 = -f;
                                    if (x < n3 || y < n3 || x >= i.getRight() - i.getLeft() + f || y >= i.getBottom() - i.getTop() + f) {
                                        this.a();
                                        i.getParent().requestDisallowInterceptTouchEvent(true);
                                        b6 = true;
                                        break Label_0474;
                                    }
                                    break Label_0471;
                                }
                            }
                            this.a();
                        }
                        else {
                            this.m = motionEvent.getPointerId(0);
                            if (this.j == null) {
                                this.j = new a();
                            }
                            i.postDelayed((Runnable)this.j, (long)this.g);
                            if (this.k == null) {
                                this.k = new b();
                            }
                            i.postDelayed((Runnable)this.k, (long)this.h);
                        }
                    }
                }
                b6 = false;
            }
            final boolean b7 = k = (b6 && this.c());
            if (b7) {
                final long uptimeMillis = SystemClock.uptimeMillis();
                final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.i.onTouchEvent(obtain);
                obtain.recycle();
                k = b7;
            }
        }
        this.l = k;
        boolean b8 = b;
        if (!k) {
            b8 = (l && b);
        }
        return b8;
    }
    
    public final void onViewAttachedToWindow(final View view) {
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        this.l = false;
        this.m = -1;
        final a j = this.j;
        if (j != null) {
            this.i.removeCallbacks((Runnable)j);
        }
    }
    
    public final class a implements Runnable
    {
        public final g0 f;
        
        public a(final g0 f) {
            this.f = f;
        }
        
        @Override
        public final void run() {
            final ViewParent parent = this.f.i.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }
    
    public final class b implements Runnable
    {
        public final g0 f;
        
        public b(final g0 f) {
            this.f = f;
        }
        
        @Override
        public final void run() {
            final g0 f = this.f;
            f.a();
            final View i = f.i;
            if (i.isEnabled()) {
                if (!i.isLongClickable()) {
                    if (f.c()) {
                        i.getParent().requestDisallowInterceptTouchEvent(true);
                        final long uptimeMillis = SystemClock.uptimeMillis();
                        final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        i.onTouchEvent(obtain);
                        obtain.recycle();
                        f.l = true;
                    }
                }
            }
        }
    }
}

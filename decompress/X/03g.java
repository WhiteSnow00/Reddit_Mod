// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewParent;
import android.view.MotionEvent;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;
import android.view.View;
import android.view.View$OnTouchListener;
import android.view.View$OnAttachStateChangeListener;

public abstract class 03g implements View$OnAttachStateChangeListener, View$OnTouchListener
{
    public final float LIZ;
    public final int LIZIZ;
    public final View LIZJ;
    public final int LIZLLL;
    public Runnable LJ;
    public Runnable LJFF;
    public boolean LJI;
    public int LJII;
    public final int[] LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(466);
    }
    
    public 03g(final View lizj) {
        this.LJIIIIZZ = new int[2];
        (this.LIZJ = lizj).setLongClickable(true);
        lizj.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        this.LIZ = (float)ViewConfiguration.get(lizj.getContext()).getScaledTouchSlop();
        final int tapTimeout = ViewConfiguration.getTapTimeout();
        this.LIZIZ = tapTimeout;
        this.LIZLLL = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }
    
    private void LJ() {
        final Runnable ljff = this.LJFF;
        if (ljff != null) {
            this.LIZJ.removeCallbacks(ljff);
        }
        final Runnable lj = this.LJ;
        if (lj != null) {
            this.LIZJ.removeCallbacks(lj);
        }
    }
    
    public abstract 02u LIZ();
    
    public boolean LIZIZ() {
        final 02u liz = this.LIZ();
        if (liz != null && !liz.LJ()) {
            liz.a_();
        }
        return true;
    }
    
    public boolean LIZJ() {
        final 02u liz = this.LIZ();
        if (liz != null && liz.LJ()) {
            liz.LIZLLL();
        }
        return true;
    }
    
    public final void LIZLLL() {
        this.LJ();
        final View lizj = this.LIZJ;
        if (lizj.isEnabled() && !lizj.isLongClickable()) {
            if (!this.LIZIZ()) {
                return;
            }
            lizj.getParent().requestDisallowInterceptTouchEvent(true);
            final long uptimeMillis = SystemClock.uptimeMillis();
            final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            lizj.onTouchEvent(obtain);
            obtain.recycle();
            this.LJI = true;
        }
    }
    
    public boolean onTouch(View view, final MotionEvent motionEvent) {
        final boolean lji = this.LJI;
        boolean lji2 = false;
        Label_0045: {
            if (lji) {
                view = this.LIZJ;
                final 02u liz = this.LIZ();
                Label_0042: {
                    if (liz != null && liz.LJ()) {
                        final 03b 03b = (03b)liz.LJI();
                        if (03b != null) {
                            if (03b.isShown()) {
                                final MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                                final int[] ljiiiizz = this.LJIIIIZZ;
                                view.getLocationOnScreen(ljiiiizz);
                                obtainNoHistory.offsetLocation((float)ljiiiizz[0], (float)ljiiiizz[1]);
                                final int[] ljiiiizz2 = this.LJIIIIZZ;
                                ((View)03b).getLocationOnScreen(ljiiiizz2);
                                obtainNoHistory.offsetLocation((float)(-ljiiiizz2[0]), (float)(-ljiiiizz2[1]));
                                final boolean liz2 = 03b.LIZ(obtainNoHistory, this.LJII);
                                obtainNoHistory.recycle();
                                final int actionMasked = motionEvent.getActionMasked();
                                boolean b;
                                if (actionMasked != 1 && actionMasked != 3) {
                                    b = true;
                                }
                                else {
                                    b = false;
                                }
                                if (liz2 && b) {
                                    break Label_0042;
                                }
                            }
                        }
                    }
                    if (this.LIZJ()) {
                        lji2 = false;
                        break Label_0045;
                    }
                }
                lji2 = true;
            }
            else {
                view = this.LIZJ;
                Label_0254: {
                    if (view.isEnabled()) {
                        final int actionMasked2 = motionEvent.getActionMasked();
                        if (actionMasked2 != 0) {
                            if (actionMasked2 != 1) {
                                if (actionMasked2 != 2) {
                                    if (actionMasked2 != 3) {
                                        break Label_0254;
                                    }
                                }
                                else {
                                    final int pointerIndex = motionEvent.findPointerIndex(this.LJII);
                                    if (pointerIndex < 0) {
                                        break Label_0254;
                                    }
                                    final float x = motionEvent.getX(pointerIndex);
                                    final float y = motionEvent.getY(pointerIndex);
                                    final float liz3 = this.LIZ;
                                    final float n = -liz3;
                                    if (x >= n && y >= n && x < view.getRight() - view.getLeft() + liz3 && y < view.getBottom() - view.getTop() + liz3) {
                                        break Label_0254;
                                    }
                                    this.LJ();
                                    view.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (this.LIZIZ()) {
                                        lji2 = true;
                                        final long uptimeMillis = SystemClock.uptimeMillis();
                                        final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                                        this.LIZJ.onTouchEvent(obtain);
                                        obtain.recycle();
                                        break Label_0045;
                                    }
                                    break Label_0254;
                                }
                            }
                            this.LJ();
                        }
                        else {
                            this.LJII = motionEvent.getPointerId(0);
                            if (this.LJ == null) {
                                this.LJ = new a();
                            }
                            view.postDelayed(this.LJ, (long)this.LIZIZ);
                            if (this.LJFF == null) {
                                this.LJFF = new b();
                            }
                            view.postDelayed(this.LJFF, (long)this.LIZLLL);
                        }
                    }
                }
                lji2 = false;
            }
        }
        this.LJI = lji2;
        return lji2 || lji;
    }
    
    public void onViewAttachedToWindow(final View view) {
    }
    
    public void onViewDetachedFromWindow(final View view) {
        this.LJI = false;
        this.LJII = -1;
        final Runnable lj = this.LJ;
        if (lj != null) {
            this.LIZJ.removeCallbacks(lj);
        }
    }
    
    public final class a implements Runnable
    {
        static {
            Covode.recordClassIndex(467);
        }
        
        @Override
        public final void run() {
            final ViewParent parent = 03g.this.LIZJ.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }
    
    public final class b implements Runnable
    {
        static {
            Covode.recordClassIndex(468);
        }
        
        @Override
        public final void run() {
            03g.this.LIZLLL();
        }
    }
}

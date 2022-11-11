// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import android.view.MotionEvent;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;

public final class 091 implements Runnable
{
    public final /* synthetic */ 092.e LIZ;
    
    static {
        Covode.recordClassIndex(951);
    }
    
    public 091(final 092.e liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void run() {
        final 092.e liz = this.LIZ;
        final int lj = liz.LIZIZ.LJ;
        final int liz2 = liz.LIZ;
        final int n = 0;
        int n2;
        View view;
        int n3;
        if (liz2 == 3) {
            n2 = 1;
            view = liz.LIZJ.LIZIZ(3);
            if (view == null) {
                return;
            }
            n3 = -view.getWidth() + lj;
        }
        else {
            n2 = 0;
            view = liz.LIZJ.LIZIZ(5);
            n3 = liz.LIZJ.getWidth() - lj;
        }
        if (view != null) {
            if (n2 != 0) {
                if (view.getLeft() >= n3) {
                    return;
                }
            }
            else if (view.getLeft() <= n3) {
                return;
            }
            if (liz.LIZJ.LIZ(view) == 0) {
                final 092.d d = (092.d)view.getLayoutParams();
                liz.LIZIZ.LIZ(view, n3, view.getTop());
                d.LIZJ = true;
                liz.LIZJ.invalidate();
                liz.LIZLLL();
                final 092 lizj = liz.LIZJ;
                if (!lizj.LIZJ) {
                    final long uptimeMillis = SystemClock.uptimeMillis();
                    final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    for (int childCount = lizj.getChildCount(), i = n; i < childCount; ++i) {
                        lizj.getChildAt(i).dispatchTouchEvent(obtain);
                    }
                    obtain.recycle();
                    lizj.LIZJ = true;
                }
            }
        }
    }
}

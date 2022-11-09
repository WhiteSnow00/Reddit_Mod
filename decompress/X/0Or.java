// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.animation.Animator;
import com.bytedance.covode.number.Covode;
import android.animation.Animator$AnimatorListener;

public final class 0or implements Animator$AnimatorListener
{
    public final /* synthetic */ 0oy LIZ;
    
    static {
        Covode.recordClassIndex(8043);
    }
    
    public 0or(final 0oy liz) {
        this.LIZ = liz;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        CTM.LIZ((Object)animator);
    }
    
    public final void onAnimationEnd(final Animator animator) {
        CTM.LIZ((Object)animator);
        if (this.LIZ.LIZ) {
            final LinearLayout lizj = this.LIZ.LIZJ;
            final int n = 0;
            int width;
            if (lizj != null) {
                width = lizj.getWidth();
            }
            else {
                width = 0;
            }
            final HorizontalScrollView liziz = this.LIZ.LIZIZ;
            int width2;
            if (liziz != null) {
                width2 = liziz.getWidth();
            }
            else {
                width2 = 0;
            }
            final int n2 = width - width2;
            final HorizontalScrollView liziz2 = this.LIZ.LIZIZ;
            if (liziz2 != null) {
                int scrollX = n;
                if (0cB.LJI()) {
                    scrollX = n2;
                }
                liziz2.setScrollX(scrollX);
            }
            final 0oy liz = this.LIZ;
            final StringBuilder sb = new StringBuilder("scroll width is ");
            sb.append(n2);
            sb.append(", scroll X is ");
            final HorizontalScrollView liziz3 = liz.LIZIZ;
            Integer value;
            if (liziz3 != null) {
                value = liziz3.getScrollX();
            }
            else {
                value = null;
            }
            sb.append(value);
            0ba.LIZ(3, "BattleTaskGuide", sb.toString());
            liz.removeCallbacks(liz.LJI);
            liz.LJI = null;
            liz.LJI = new 0ot(liz);
            if (n2 >= 0cB.LIZ(10.0f)) {
                liz.removeCallbacks(liz.LJFF);
                liz.LJFF = null;
                liz.postDelayed(liz.LJFF = new 0ox(liz, n2), 300L);
                return;
            }
            liz.postDelayed(liz.LJI, liz.LJIIIZ);
        }
    }
    
    public final void onAnimationRepeat(final Animator animator) {
        CTM.LIZ((Object)animator);
    }
    
    public final void onAnimationStart(final Animator animator) {
        CTM.LIZ((Object)animator);
    }
}

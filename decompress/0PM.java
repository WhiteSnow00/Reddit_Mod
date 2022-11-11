// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import android.view.View;
import com.bytedance.covode.number.Covode;

public final class 0pm implements Runnable
{
    public final /* synthetic */ 1SX LIZ;
    
    static {
        Covode.recordClassIndex(8218);
    }
    
    public 0pm(final 1SX liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void run() {
        final 1SX liz = this.LIZ;
        GTi.LIZ((View)liz, true);
        liz.animate().cancel();
        liz.getViewTipBg().animate().cancel();
        liz.getViewTipTop().animate().cancel();
        liz.getViewTipBottom().animate().cancel();
        liz.getViewTipText().animate().cancel();
        liz.getViewTipBg().setAlpha(0.0f);
        liz.getViewTipTop().setAlpha(0.0f);
        liz.getViewTipBottom().setAlpha(0.0f);
        liz.getViewTipText().setAlpha(0.0f);
        liz.setAlpha(1.0f);
        liz.getViewTipTop().setTranslationY(-(float)liz.getViewTipTop().getHeight());
        liz.getViewTipBottom().setTranslationY((float)liz.getViewTipBottom().getHeight());
        liz.getViewTipBg().animate().setDuration(liz.LIZ).setInterpolator((TimeInterpolator)liz.LIZLLL).alpha(0.2f).start();
        liz.getViewTipTop().animate().setDuration(liz.LIZ).setInterpolator((TimeInterpolator)liz.LIZLLL).translationY(0.0f).alpha(1.0f).start();
        liz.getViewTipBottom().animate().setDuration(liz.LIZ).setInterpolator((TimeInterpolator)liz.LIZLLL).translationY(0.0f).alpha(1.0f).start();
        liz.getViewTipText().animate().setDuration(liz.LIZ).setInterpolator((TimeInterpolator)liz.LIZLLL).alpha(1.0f).start();
        liz.animate().setDuration(liz.LIZJ).setInterpolator((TimeInterpolator)liz.LIZLLL).alpha(0.0f).setStartDelay(liz.LIZIZ + liz.LIZ).setListener((Animator$AnimatorListener)new 0pl()).start();
    }
}

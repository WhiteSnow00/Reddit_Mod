// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.animation.Animator;
import com.bytedance.covode.number.Covode;
import android.animation.AnimatorListenerAdapter;

public final class 0rN extends AnimatorListenerAdapter
{
    public final /* synthetic */ 1ln LIZ;
    
    static {
        Covode.recordClassIndex(8655);
    }
    
    public 0rN(final 1ln liz) {
        this.LIZ = liz;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        CTM.LIZ((Object)animator);
        if (this.LIZ.getMPresenter().LJ()) {
            this.LIZ.LIZ(3);
        }
    }
    
    public final void onAnimationRepeat(final Animator animator) {
        CTM.LIZ((Object)animator);
        final 1ln liz = this.LIZ;
        --liz.LIZ;
        final TextView mOnlineCountDown = this.LIZ.getMOnlineCountDown();
        if (mOnlineCountDown != null) {
            mOnlineCountDown.setText((CharSequence)String.valueOf(this.LIZ.LIZ));
        }
    }
    
    public final void onAnimationStart(final Animator animator) {
        CTM.LIZ((Object)animator);
        final TextView mOnlineCountDown = this.LIZ.getMOnlineCountDown();
        if (mOnlineCountDown != null) {
            mOnlineCountDown.setText((CharSequence)String.valueOf(this.LIZ.LIZ));
        }
        final TextView mOnlineCountDown2 = this.LIZ.getMOnlineCountDown();
        if (mOnlineCountDown2 != null) {
            mOnlineCountDown2.setVisibility(0);
        }
    }
}

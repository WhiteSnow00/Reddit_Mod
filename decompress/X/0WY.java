// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import android.animation.ObjectAnimator;
import android.view.View;
import android.animation.AnimatorSet;
import kotlin.jvm.internal.n;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.animation.Animator;
import com.bytedance.covode.number.Covode;
import android.animation.Animator$AnimatorListener;

public final class 0wy implements Animator$AnimatorListener
{
    public final /* synthetic */ 1BF LIZ;
    public final /* synthetic */ 28m LIZIZ;
    
    static {
        Covode.recordClassIndex(10192);
    }
    
    public 0wy(final 1BF liz, final 28m liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public final void onAnimationCancel(final Animator animator) {
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.LIZ.setVisibility(8);
    }
    
    public final void onAnimationRepeat(final Animator animator) {
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.LIZ.setVisibility(0);
        final 28m liziz = this.LIZIZ;
        if (liziz.LJIILL == null) {
            0ba.LIZ(3, "MultiMatchAudienceWidge", " battleTaskEnterRoomPrompt null");
            return;
        }
        final MatchBaseWidget liz = liziz.LIZ;
        if (liz != null) {
            final ConstraintLayout constraintLayout = (ConstraintLayout)liz.findViewById(2131367746);
            final 05c 05c = new 05c();
            final ConstraintLayout constraintLayout2 = (ConstraintLayout)liz.findViewById(2131368169);
            05c.LIZ(constraintLayout2);
            05c.LIZIZ(2131367746, 4);
            05c.LIZ(2131367746, 4, 2131368358, 4, 0);
            05c.LIZIZ(constraintLayout2);
            final 1ib 1ib = (1ib)liz.findViewById(2131367747);
            n.LIZIZ((Object)1ib, "");
            1ib.setText((CharSequence)liziz.LJIILL);
            n.LIZIZ((Object)constraintLayout, "");
            constraintLayout.setVisibility(0);
            final 1si 1si = (1si)liz.findViewById(2131367745);
            n.LIZIZ((Object)1si, "");
            final SEV sev = (SEV)((SEd)1si).getHierarchy();
            n.LIZIZ((Object)sev, "");
            sev.LIZ(I7e.LIZIZ);
            0ch.LIZ(1si, 2131233908);
            final AnimatorSet set = new AnimatorSet();
            final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)constraintLayout, View.ALPHA, new float[] { 0.0f, 1.0f });
            ofFloat.setDuration(320L);
            final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)constraintLayout, View.ALPHA, new float[] { 1.0f, 1.0f });
            ofFloat2.setDuration(1480L);
            final ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((Object)constraintLayout, View.ALPHA, new float[] { 1.0f, 0.0f });
            ofFloat3.setDuration(320L);
            set.playSequentially(new Animator[] { (Animator)ofFloat, (Animator)ofFloat2, (Animator)ofFloat3 });
            set.addListener((Animator$AnimatorListener)new 0wz(constraintLayout, liziz));
            set.start();
        }
    }
}

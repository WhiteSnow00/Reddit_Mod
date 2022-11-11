// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import com.bytedance.covode.number.Covode;
import android.view.ViewPropertyAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import android.animation.AnimatorListenerAdapter;

public final class 116 extends AnimatorListenerAdapter
{
    public final /* synthetic */ 1n7 LIZ;
    public final /* synthetic */ RecyclerView.ViewHolder LIZIZ;
    public final /* synthetic */ View LIZJ;
    public final /* synthetic */ ViewPropertyAnimator LIZLLL;
    
    static {
        Covode.recordClassIndex(10820);
    }
    
    public 116(final 1n7 liz, final RecyclerView.ViewHolder liziz, final View lizj, final ViewPropertyAnimator lizlll) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        CTM.LIZ((Object)animator);
        this.LIZJ.setTranslationY(0.0f);
    }
    
    public final void onAnimationEnd(final Animator animator) {
        CTM.LIZ((Object)animator);
        this.LIZLLL.setListener((Animator$AnimatorListener)null);
        this.LIZ.LJIIIIZZ(this.LIZIZ);
        this.LIZ.LIZLLL.remove(this.LIZIZ);
        this.LIZ.LIZJ();
    }
    
    public final void onAnimationStart(final Animator animator) {
        CTM.LIZ((Object)animator);
    }
}

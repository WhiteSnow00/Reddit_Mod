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

public final class 119 extends AnimatorListenerAdapter
{
    public final /* synthetic */ 1n7 LIZ;
    public final /* synthetic */ RecyclerView.ViewHolder LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ View LIZLLL;
    public final /* synthetic */ int LJ;
    public final /* synthetic */ ViewPropertyAnimator LJFF;
    
    static {
        Covode.recordClassIndex(10823);
    }
    
    public 119(final 1n7 liz, final RecyclerView.ViewHolder liziz, final int lizj, final View lizlll, final int lj, final ViewPropertyAnimator ljff) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        this.LJ = lj;
        this.LJFF = ljff;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        CTM.LIZ((Object)animator);
        if (this.LIZJ != 0) {
            this.LIZLLL.setTranslationX(0.0f);
        }
        if (this.LJ != 0) {
            this.LIZLLL.setTranslationY(0.0f);
        }
    }
    
    public final void onAnimationEnd(final Animator animator) {
        CTM.LIZ((Object)animator);
        this.LJFF.setListener((Animator$AnimatorListener)null);
        ((RecyclerView.f)this.LIZ).LJI(this.LIZIZ);
        this.LIZ.LJ.remove(this.LIZIZ);
        this.LIZ.LIZJ();
    }
    
    public final void onAnimationStart(final Animator animator) {
        CTM.LIZ((Object)animator);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import com.bytedance.covode.number.Covode;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import android.animation.AnimatorListenerAdapter;

public final class 11A extends AnimatorListenerAdapter
{
    public final /* synthetic */ 1n7 LIZ;
    public final /* synthetic */ RecyclerView.ViewHolder LIZIZ;
    public final /* synthetic */ ViewPropertyAnimator LIZJ;
    public final /* synthetic */ View LIZLLL;
    
    static {
        Covode.recordClassIndex(10824);
    }
    
    public 11A(final 1n7 liz, final RecyclerView.ViewHolder liziz, final ViewPropertyAnimator lizj, final View lizlll) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        CTM.LIZ((Object)animator);
        this.LIZJ.setListener((Animator$AnimatorListener)null);
        this.LIZLLL.setAlpha(1.0f);
        ((RecyclerView.f)this.LIZ).LJI(this.LIZIZ);
        this.LIZ.LJFF.remove(this.LIZIZ);
        this.LIZ.LIZJ();
    }
    
    public final void onAnimationStart(final Animator animator) {
        CTM.LIZ((Object)animator);
    }
}

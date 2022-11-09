// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.recyclerview.widget.RecyclerView;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import com.bytedance.covode.number.Covode;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.animation.AnimatorListenerAdapter;

public final class 118 extends AnimatorListenerAdapter
{
    public final /* synthetic */ 1n7 LIZ;
    public final /* synthetic */ 1n7.a LIZIZ;
    public final /* synthetic */ ViewPropertyAnimator LIZJ;
    public final /* synthetic */ View LIZLLL;
    
    static {
        Covode.recordClassIndex(10822);
    }
    
    public 118(final 1n7 liz, final 1n7.a liziz, final ViewPropertyAnimator lizj, final View lizlll) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        CTM.LIZ((Object)animator);
        this.LIZJ.setListener((Animator$AnimatorListener)null);
        this.LIZLLL.setAlpha(1.0f);
        this.LIZLLL.setTranslationX(0.0f);
        this.LIZLLL.setTranslationY(0.0f);
        ((RecyclerView.f)this.LIZ).LJI(this.LIZIZ.LIZIZ);
        this.LIZ.LJI.remove(this.LIZIZ.LIZIZ);
        this.LIZ.LIZJ();
    }
    
    public final void onAnimationStart(final Animator animator) {
        CTM.LIZ((Object)animator);
    }
}

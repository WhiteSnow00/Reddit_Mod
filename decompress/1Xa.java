// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.animation.Animator;
import com.bytedance.covode.number.Covode;
import android.animation.AnimatorSet;
import android.view.View;

public final class 1xa extends F5g implements SRS<View, AnimatorSet>
{
    public final /* synthetic */ 0no LIZ;
    public final /* synthetic */ 1xY LIZIZ;
    public final /* synthetic */ 1xX LIZJ;
    
    static {
        Covode.recordClassIndex(7942);
    }
    
    public 1xa(final 0no liz, final 1xY liziz, final 1xX lizj) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        super(1);
    }
    
    public final AnimatorSet LIZ(final View view) {
        CTM.LIZ((Object)view);
        final int lizj = 0cB.LIZJ();
        final int[] array = new int[2];
        view.getLocationOnScreen(array);
        final float n = (float)array[0];
        final float n2 = lizj / 2.0f;
        int n3;
        if (n < n2) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        float n4;
        if (n3 != 0) {
            n4 = -(n2 - (array[0] + 0cB.LIZLLL(2131165940) / 2.0f));
        }
        else {
            n4 = n2 - (lizj - array[0] - 0cB.LIZLLL(2131165940) / 2.0f);
        }
        final float n5 = (float)view.getBottom();
        final float n6 = this.LIZ.getHeight() / 2.0f;
        final AnimatorSet set = new AnimatorSet();
        set.playTogether(new Animator[] { (Animator)this.LIZIZ.LIZ(n4, n5 - n6, 200L), (Animator)this.LIZJ.LIZ(3.5f, 0.8f, 200L) });
        return set;
    }
}

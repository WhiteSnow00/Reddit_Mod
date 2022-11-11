// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.fragment.app.Fragment;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.effect.smallitem.LiveSmallSubItemBeautyFragment;
import android.view.View$OnClickListener;

public final class 0hw implements View$OnClickListener
{
    public final /* synthetic */ LiveSmallSubItemBeautyFragment LIZ;
    
    static {
        Covode.recordClassIndex(6594);
    }
    
    public 0hw(final LiveSmallSubItemBeautyFragment liz) {
        this.LIZ = liz;
    }
    
    public final void onClick(final View view) {
        final 0AB fragmentManager = this.LIZ.getFragmentManager();
        if (fragmentManager != null) {
            final 0AO liz = fragmentManager.LIZ();
            liz.LIZ(this.LIZ);
            liz.LIZIZ();
        }
        final QgG<2P9> lj = this.LIZ.LJ;
        if (lj != null) {
            lj.invoke();
        }
    }
}

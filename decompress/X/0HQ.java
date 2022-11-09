// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.fragment.app.Fragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.app.Dialog;
import com.bytedance.android.live.design.app.LiveDialog;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.effect.panel.LiveEffectNewDialogFragment;
import android.view.View$OnClickListener;

public final class 0hq implements View$OnClickListener
{
    public final /* synthetic */ LiveEffectNewDialogFragment LIZ;
    
    static {
        Covode.recordClassIndex(6541);
    }
    
    public 0hq(final LiveEffectNewDialogFragment liz) {
        this.LIZ = liz;
    }
    
    public final void onClick(final View view) {
        final DataChannel ljil = this.LIZ.LJIL;
        String lj;
        if ((lj = this.LIZ.LJ) == null) {
            lj = "";
        }
        CTM.LIZ((Object)lj);
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_live_reset_beauty_click");
        liz.LIZ(ljil);
        liz.LIZ("tab_name", lj);
        liz.LIZLLL();
        final LiveEffectNewDialogFragment liz2 = this.LIZ;
        final LiveDialog.a a = new LiveDialog.a(((Fragment)liz2).getContext());
        a.LIZ(2131829155, (LiveDialog.b)new 1Lf(liz2));
        a.LIZIZ(2131829154, (LiveDialog.b)new 1Lg(liz2));
        a.LIZIZ(2131829152);
        a.LIZJ(2131829153);
        final LiveDialog liziz = a.LIZIZ();
        liziz.show();
        KN6.LIZ.LIZ((Dialog)liziz);
    }
}

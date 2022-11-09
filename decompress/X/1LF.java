// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.widget.ImageView;
import kotlin.jvm.internal.n;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.effect.panel.LiveEffectNewDialogFragment;
import com.bytedance.android.live.design.app.LiveDialog;

public final class 1Lf implements b
{
    public final /* synthetic */ LiveEffectNewDialogFragment LIZ;
    
    static {
        Covode.recordClassIndex(6545);
    }
    
    public 1Lf(final LiveEffectNewDialogFragment liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void LIZ(final DialogInterface dialogInterface) {
        CTM.LIZ((Object)dialogInterface);
        final 1Jc ljiiiz = 1Jc.LJIIIZ;
        final DataChannel ljil = this.LIZ.LJIL;
        String lj;
        if ((lj = this.LIZ.LJ) == null) {
            lj = "";
        }
        ljiiiz.LIZ(ljil, lj, "reset");
        final LiveEffectNewDialogFragment liz = this.LIZ;
        if (n.LIZ((Object)liz.LIZLLL, (Object)0gZ.LJIIIZ) ^ true) {
            final 0hu liziz = liz.LIZIZ;
            if (liziz == null) {
                n.LIZ("");
            }
            liziz.LIZIZ();
            final ImageView imageView = (ImageView)liz.LIZ(2131370412);
            n.LIZIZ((Object)imageView, "");
            imageView.setEnabled(false);
        }
        dialogInterface.dismiss();
    }
}

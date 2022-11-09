// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.Context;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.MultiLiveAnchorOpenCameraDialog;
import kotlin.jvm.internal.n;
import android.app.Dialog;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.design.app.LiveDialog;

public final class 1Yw implements b
{
    public final /* synthetic */ 1mM LIZ;
    
    static {
        Covode.recordClassIndex(9439);
    }
    
    public 1Yw(final 1mM liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void LIZ(final DialogInterface dialogInterface) {
        CTM.LIZ((Object)dialogInterface);
        dialogInterface.dismiss();
        final 1mM liz = this.LIZ;
        liz.LJFF().LIZ((CharSequence)((1mB.a)liz).getContext().getString(2131835897));
        if (!liz.LJFF().isShowing()) {
            final Hls ljff = liz.LJFF();
            ((0eC)ljff).show();
            KN6.LIZ.LIZ((Dialog)ljff);
        }
        final 1mM liz2 = this.LIZ;
        final 1Uo lizlll = liz2.LIZLLL;
        if (lizlll == null) {
            n.LIZ("");
        }
        if (!lizlll.LIZIZ) {
            final 1nL liziz = 0cT.LIZIZ(((1mB.a)liz2).getContext());
            if (liziz != null) {
                n.LIZIZ((Object)liziz, "");
                final Context context = ((1mB.a)liz2).getContext();
                n.LIZIZ((Object)context, "");
                final MultiLiveAnchorOpenCameraDialog multiLiveAnchorOpenCameraDialog = new MultiLiveAnchorOpenCameraDialog(context, liz2.LJII, liziz, "close_link");
                multiLiveAnchorOpenCameraDialog.show();
                KN6.LIZ.LIZ((Dialog)multiLiveAnchorOpenCameraDialog);
            }
        }
        final 0mc ljff2 = this.LIZ.LJFF;
        if (ljff2 != null) {
            ljff2.LIZ(5E5.USER_CLICK, (Cert)TokenCert.Companion.with("bpea-multilive_anchor_close_layout"));
        }
        0xt.LJFF("manual_close");
    }
}

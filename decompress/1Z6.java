// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.Context;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.bpea.basics.PrivacyCert$Builder;
import com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.MultiLiveAnchorOpenCameraDialog;
import kotlin.jvm.internal.n;
import android.app.Dialog;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.design.app.LiveDialog;

public final class 1Z6 implements b
{
    public final /* synthetic */ 1mN LIZ;
    
    static {
        Covode.recordClassIndex(9471);
    }
    
    public 1Z6(final 1mN liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void LIZ(final DialogInterface dialogInterface) {
        CTM.LIZ((Object)dialogInterface);
        dialogInterface.dismiss();
        final 1mN liz = this.LIZ;
        liz.LJFF().LIZ((CharSequence)((1mB.a)liz).getContext().getString(2131835897));
        if (!liz.LJFF().isShowing()) {
            final Hls ljff = liz.LJFF();
            ((0eC)ljff).show();
            KN6.LIZ.LIZ((Dialog)ljff);
        }
        final 1mN liz2 = this.LIZ;
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
                final MultiLiveAnchorOpenCameraDialog multiLiveAnchorOpenCameraDialog = new MultiLiveAnchorOpenCameraDialog(context, liz2.LJIIIIZZ, liziz, "close_link");
                multiLiveAnchorOpenCameraDialog.show();
                KN6.LIZ.LIZ((Dialog)multiLiveAnchorOpenCameraDialog);
            }
        }
        final 0mc ljff2 = this.LIZ.LJFF;
        if (ljff2 != null) {
            final 5E5 user_CLICK = 5E5.USER_CLICK;
            final PrivacyCert$Builder with = PrivacyCert$Builder.Companion.with("bpea-1227");
            with.usage("");
            with.tag("turn off guest requests");
            with.policies(new 6E8[] { PrivacyPolicyStore.getAudioPrivacyPolicy() });
            ljff2.LIZ(user_CLICK, (Cert)with.build());
        }
        0xt.LJFF("manual_close");
    }
}

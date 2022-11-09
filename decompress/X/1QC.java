// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;
import android.view.View;
import com.bytedance.covode.number.Covode;

public final class 1QC implements 0fW
{
    public final /* synthetic */ 1QE LIZ;
    
    static {
        Covode.recordClassIndex(7657);
    }
    
    public 1QC(final 1QE liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void LIZ(final View view, final 0fS 0fS, final LiveActionSheetDialog liveActionSheetDialog) {
        CTM.LIZ((Object)view, (Object)0fS, (Object)liveActionSheetDialog);
        liveActionSheetDialog.dismiss();
        final DataChannel liz = this.LIZ.LIZ;
        if (liz != null) {
            liz.LIZJ((Class)2Fs.class, (Object)8sj.LIZ((Object)"guest_icon", (Object)10002));
        }
    }
}

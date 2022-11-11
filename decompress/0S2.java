// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.liveinteract.multiguestv3.dialog.MultiGuestV3BottomConfirmDialog;
import android.view.View$OnClickListener;

public final class 0s2 implements View$OnClickListener
{
    public final /* synthetic */ MultiGuestV3BottomConfirmDialog LIZ;
    
    static {
        Covode.recordClassIndex(8769);
    }
    
    public 0s2(final MultiGuestV3BottomConfirmDialog liz) {
        this.LIZ = liz;
    }
    
    public final void onClick(final View view) {
        final SRS<? super LiveBottomSheetDialog, 2P9> ljiij = this.LIZ.LJIIJ;
        if (ljiij != null) {
            ljiij.invoke((Object)this.LIZ);
        }
    }
}

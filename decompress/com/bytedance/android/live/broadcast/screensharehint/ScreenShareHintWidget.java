// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.broadcast.screensharehint;

import com.bytedance.android.widget.Widget;
import X.0CC;
import X.0CH;
import X.1ib;
import X.VR3;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastGamePermissionSetting;
import X.0cB;
import com.bytedance.covode.number.Covode;
import X.6mZ;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;

public final class ScreenShareHintWidget extends PreviewWidget implements 6mZ
{
    static {
        Covode.recordClassIndex(5508);
    }
    
    @Override
    public final void LJ() {
        super.LJ();
        String text = 0cB.LIZ(2131829945);
        if (BroadcastGamePermissionSetting.INSTANCE.getValue() != 0 && (text = VR3.LIZ().LIZ("pm_mt_mobile_gaming_background_tips")) == null) {
            text = 0cB.LIZ(2131831043);
        }
        Object view;
        if (!((view = ((Widget)this).getView()) instanceof 1ib)) {
            view = null;
        }
        final 1ib 1ib = (1ib)view;
        if (1ib != null) {
            1ib.setText((CharSequence)text);
        }
    }
    
    public final int getLayoutId() {
        return 2131562290;
    }
    
    @Override
    public final void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
}

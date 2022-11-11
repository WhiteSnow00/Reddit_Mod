// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.guset.fragment.preview;

import X.CTM;
import X.1JQ;
import com.bytedance.covode.number.Covode;

public final class MultiGuestLinkedPreviewViewModel extends AbsMultiGuestNewPreviewViewModel
{
    public boolean LJ;
    
    static {
        Covode.recordClassIndex(9755);
    }
    
    @Override
    public final void LIZ(final 1JQ 1jq) {
        CTM.LIZ((Object)1jq);
        AbsMultiGuestNewPreviewViewModel.LIZLLL.LIZ(1jq);
    }
    
    @Override
    public final void LJI() {
        if (this.LJ) {
            return;
        }
        super.LJI();
        this.LJ = true;
    }
}

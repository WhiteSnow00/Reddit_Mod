// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.anchor.contract;

import java.util.HashMap;
import com.bytedance.android.live.liveinteract.cohost.business.contract.InteractDialogFragmentBaseContract;
import com.bytedance.covode.number.Covode;

public final class MultiLiveAnchorSettingDialogContract
{
    static {
        Covode.recordClassIndex(9335);
    }
    
    public abstract static class AbsView extends InteractDialogFragmentBaseContract.AbsView<MultiLiveAnchorSettingDialogContract.a>
    {
        public HashMap LIZ;
        
        static {
            Covode.recordClassIndex(9336);
        }
        
        public void LIZ() {
            final HashMap liz = this.LIZ;
            if (liz != null) {
                liz.clear();
            }
        }
        
        public abstract void LIZ(final int p0);
        
        public abstract void LIZ(final Throwable p0);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.guset.contract;

import java.util.HashMap;
import com.bytedance.android.live.liveinteract.cohost.business.contract.InteractDialogFragmentBaseContract;
import com.bytedance.covode.number.Covode;

public interface MultiGuestPreviewContract
{
    default static {
        Covode.recordClassIndex(9574);
    }
    
    public abstract static class AbsView extends InteractDialogFragmentBaseContract.AbsView<Object>
    {
        public HashMap LIZ;
        
        static {
            Covode.recordClassIndex(9575);
        }
    }
}

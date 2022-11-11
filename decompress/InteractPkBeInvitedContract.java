// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.match.business.contract;

import java.util.HashMap;
import com.bytedance.android.live.liveinteract.cohost.business.contract.InteractDialogFragmentBaseContract;
import com.bytedance.covode.number.Covode;

public final class InteractPkBeInvitedContract
{
    static {
        Covode.recordClassIndex(7808);
    }
    
    public abstract static class View extends AbsView<InteractPkBeInvitedContract.b>
    {
        public HashMap LIZ;
        
        static {
            Covode.recordClassIndex(7809);
        }
        
        public void LIZ() {
            final HashMap liz = this.LIZ;
            if (liz != null) {
                liz.clear();
            }
        }
        
        public abstract void LIZ(final Throwable p0);
        
        public abstract void LIZIZ(final Throwable p0);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.cohost.business.contract;

import java.util.HashMap;
import com.bytedance.covode.number.Covode;

public final class CoHostBeInvitedContract
{
    static {
        Covode.recordClassIndex(7303);
    }
    
    public abstract static class AbsView extends InteractDialogFragmentBaseContract.AbsView<CoHostBeInvitedContract.a>
    {
        public HashMap LIZ;
        
        static {
            Covode.recordClassIndex(7304);
        }
        
        public abstract void LIZ();
        
        public abstract void LIZ(final int p0, final int p1);
        
        public void LIZIZ() {
            final HashMap liz = this.LIZ;
            if (liz != null) {
                liz.clear();
            }
        }
    }
}

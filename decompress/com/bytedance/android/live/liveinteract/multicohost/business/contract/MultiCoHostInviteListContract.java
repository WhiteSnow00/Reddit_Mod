// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multicohost.business.contract;

import java.util.HashMap;
import com.bytedance.android.live.liveinteract.cohost.business.contract.InteractDialogFragmentBaseContract;
import com.bytedance.covode.number.Covode;

public final class MultiCoHostInviteListContract
{
    static {
        Covode.recordClassIndex(8187);
    }
    
    public abstract static class AbsView extends InteractDialogFragmentBaseContract.AbsView<MultiCoHostInviteListContract.a>
    {
        public long LIZ;
        public HashMap LJ;
        
        static {
            Covode.recordClassIndex(8188);
        }
        
        public abstract void LIZ();
        
        public abstract void LIZ(final int p0);
        
        public abstract void LIZ(final Throwable p0);
        
        public abstract void LIZ(final boolean p0);
        
        public abstract void LIZIZ();
        
        public abstract void LIZIZ(final Throwable p0);
        
        public void LIZLLL() {
            final HashMap lj = this.LJ;
            if (lj != null) {
                lj.clear();
            }
        }
    }
}

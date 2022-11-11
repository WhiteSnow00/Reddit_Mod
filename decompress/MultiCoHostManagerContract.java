// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multicohost.business.contract;

import X.GQk;
import java.util.HashMap;
import com.bytedance.android.live.liveinteract.cohost.business.contract.InteractDialogFragmentBaseContract;
import com.bytedance.covode.number.Covode;

public final class MultiCoHostManagerContract
{
    static {
        Covode.recordClassIndex(8192);
    }
    
    public abstract static class AbsView extends InteractDialogFragmentBaseContract.AbsView<MultiCoHostManagerContract.a>
    {
        public HashMap LIZ;
        
        static {
            Covode.recordClassIndex(8193);
        }
        
        public void LIZ() {
            final HashMap liz = this.LIZ;
            if (liz != null) {
                liz.clear();
            }
        }
        
        public abstract void LIZ(final int p0);
        
        public abstract void LIZ(final GQk p0);
    }
}

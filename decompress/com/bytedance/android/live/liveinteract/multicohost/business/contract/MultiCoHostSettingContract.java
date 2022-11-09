// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multicohost.business.contract;

import java.util.HashMap;
import com.bytedance.android.live.liveinteract.cohost.business.contract.InteractDialogFragmentBaseContract;
import com.bytedance.covode.number.Covode;

public final class MultiCoHostSettingContract
{
    static {
        Covode.recordClassIndex(8197);
    }
    
    public abstract static class AbsView extends InteractDialogFragmentBaseContract.AbsView<MultiCoHostSettingContract.a>
    {
        public HashMap LIZ;
        
        static {
            Covode.recordClassIndex(8198);
        }
        
        public void LIZ() {
            final HashMap liz = this.LIZ;
            if (liz != null) {
                liz.clear();
            }
        }
        
        public abstract void LIZ(final boolean p0, final boolean p1, final Throwable p2);
        
        public abstract void LIZIZ(final boolean p0, final boolean p1, final Throwable p2);
        
        public abstract void LIZJ(final boolean p0, final boolean p1, final Throwable p2);
        
        public abstract void LIZLLL(final boolean p0, final boolean p1, final Throwable p2);
        
        public abstract void LJ(final boolean p0, final boolean p1, final Throwable p2);
    }
}

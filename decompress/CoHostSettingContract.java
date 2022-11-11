// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.cohost.business.contract;

import java.util.HashMap;
import com.bytedance.covode.number.Covode;

public final class CoHostSettingContract
{
    static {
        Covode.recordClassIndex(7312);
    }
    
    public abstract static class AbsView extends InteractDialogFragmentBaseContract.AbsView<CoHostSettingContract.a>
    {
        public HashMap LIZ;
        
        static {
            Covode.recordClassIndex(7313);
        }
        
        public abstract void LIZ();
        
        public abstract void LIZ(final Throwable p0);
        
        public abstract void LIZIZ();
        
        public abstract void LIZIZ(final Throwable p0);
        
        public abstract void LIZJ();
        
        public abstract void LIZJ(final Throwable p0);
        
        public void LIZLLL() {
            final HashMap liz = this.LIZ;
            if (liz != null) {
                liz.clear();
            }
        }
    }
}

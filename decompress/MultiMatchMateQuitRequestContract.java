// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract;

import X.1ci;
import java.util.HashMap;
import com.bytedance.android.live.liveinteract.cohost.business.contract.InteractDialogFragmentBaseContract;
import com.bytedance.covode.number.Covode;

public final class MultiMatchMateQuitRequestContract
{
    static {
        Covode.recordClassIndex(10066);
    }
    
    public abstract static class AbsView extends InteractDialogFragmentBaseContract.AbsView<MultiMatchMateQuitRequestContract.a>
    {
        public HashMap LIZ;
        
        static {
            Covode.recordClassIndex(10067);
        }
        
        public abstract void LIZ();
        
        public abstract void LIZ(final long p0);
        
        public abstract boolean LIZIZ();
        
        public void LIZJ() {
            final HashMap liz = this.LIZ;
            if (liz != null) {
                liz.clear();
            }
        }
    }
    
    public abstract static class a extends InteractDialogFragmentBaseContract.a<MultiMatchMateQuitRequestContract.AbsView>
    {
        static {
            Covode.recordClassIndex(10068);
        }
        
        public a(final MultiMatchMateQuitRequestContract.AbsView absView) {
            super((InteractDialogFragmentBaseContract.AbsView)absView);
        }
        
        public abstract void LIZ();
        
        public abstract void LIZ(final boolean p0);
        
        public abstract void LIZIZ();
        
        public abstract void LIZJ();
        
        public abstract 1ci LIZLLL();
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract;

import X.1ci;
import X.0pc;
import java.util.HashMap;
import com.bytedance.android.live.liveinteract.cohost.business.contract.InteractDialogFragmentBaseContract;
import com.bytedance.covode.number.Covode;

public final class MultiMatchInviteContract
{
    static {
        Covode.recordClassIndex(10061);
    }
    
    public abstract static class AbsView extends InteractDialogFragmentBaseContract.AbsView<MultiMatchInviteContract.a>
    {
        public HashMap LIZ;
        
        static {
            Covode.recordClassIndex(10062);
        }
        
        public abstract void LIZ(final Throwable p0);
        
        public abstract void LIZIZ();
        
        public void LJFF() {
            final HashMap liz = this.LIZ;
            if (liz != null) {
                liz.clear();
            }
        }
    }
    
    public abstract static class a extends InteractDialogFragmentBaseContract.a<MultiMatchInviteContract.AbsView>
    {
        static {
            Covode.recordClassIndex(10063);
        }
        
        public a(final MultiMatchInviteContract.AbsView absView) {
            super((InteractDialogFragmentBaseContract.AbsView)absView);
        }
        
        public abstract void LIZ();
        
        public abstract void LIZ(final 0pc p0);
        
        public abstract void LIZIZ();
        
        public abstract void LIZJ();
        
        public abstract 1ci LIZLLL();
        
        public abstract boolean LJ();
        
        public abstract MultiMatchInviteContract.b LJFF();
    }
}

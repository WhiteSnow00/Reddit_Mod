// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract;

import X.2P9;
import X.SRS;
import X.1ci;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import java.util.HashMap;
import com.bytedance.android.live.liveinteract.cohost.business.contract.InteractDialogFragmentBaseContract;
import com.bytedance.covode.number.Covode;

public final class MultiMatchBeInvitedContract
{
    static {
        Covode.recordClassIndex(10057);
    }
    
    public abstract static class AbsView extends InteractDialogFragmentBaseContract.AbsView<MultiMatchBeInvitedContract.a>
    {
        public HashMap LIZ;
        
        static {
            Covode.recordClassIndex(10058);
        }
        
        public abstract int LIZJ();
        
        public void LIZLLL() {
            final HashMap liz = this.LIZ;
            if (liz != null) {
                liz.clear();
            }
        }
    }
    
    public static final class b extends InteractDialogFragmentBaseContract.b
    {
        public final MatchBaseWidget LIZ;
        public final boolean LIZIZ;
        public final int LIZJ;
        
        static {
            Covode.recordClassIndex(10060);
        }
        
        public b(final MatchBaseWidget liz, final boolean liziz, final int lizj) {
            ((b)this).LIZ = liz;
            ((b)this).LIZIZ = liziz;
            ((b)this).LIZJ = lizj;
        }
    }
    
    public abstract static class a extends InteractDialogFragmentBaseContract.a<MultiMatchBeInvitedContract.AbsView>
    {
        static {
            Covode.recordClassIndex(10059);
        }
        
        public a(final MultiMatchBeInvitedContract.AbsView absView) {
            super((InteractDialogFragmentBaseContract.AbsView)absView);
        }
        
        public abstract 1ci LIZ();
        
        public abstract void LIZ(final int p0, final SRS<? super Boolean, 2P9> p1);
        
        public abstract void LIZ(final SRS<? super Boolean, 2P9> p0);
    }
}

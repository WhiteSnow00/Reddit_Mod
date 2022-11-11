// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multicohost.business.contract;

import X.CTM;
import java.util.Map;
import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteContent;
import java.util.HashMap;
import com.bytedance.android.live.liveinteract.cohost.business.contract.InteractDialogFragmentBaseContract;
import com.bytedance.covode.number.Covode;

public final class MultiCoHostBeInvitedContract
{
    static {
        Covode.recordClassIndex(8182);
    }
    
    public abstract static class AbsView extends InteractDialogFragmentBaseContract.AbsView<MultiCoHostBeInvitedContract.a>
    {
        public HashMap LIZ;
        
        static {
            Covode.recordClassIndex(8183);
        }
        
        public void LIZ() {
            final HashMap liz = this.LIZ;
            if (liz != null) {
                liz.clear();
            }
        }
        
        public abstract void LIZ(final long p0);
    }
    
    public abstract static class a extends InteractDialogFragmentBaseContract.a<MultiCoHostBeInvitedContract.AbsView>
    {
        static {
            Covode.recordClassIndex(8184);
        }
        
        public a(final MultiCoHostBeInvitedContract.AbsView absView) {
            super((InteractDialogFragmentBaseContract.AbsView)absView);
        }
        
        public abstract void LIZ(final long p0);
        
        public abstract void LIZ(final LinkerInviteContent p0, final int p1, final Map<String, ?> p2);
        
        public abstract void LIZ(final LinkerInviteContent p0, final int p1, final boolean p2, final boolean p3);
        
        public abstract void LIZ(final boolean p0);
        
        public abstract void LIZIZ(final LinkerInviteContent p0, final int p1, final Map<String, ?> p2);
        
        public abstract void LIZIZ(final boolean p0);
    }
    
    public static final class b extends InteractDialogFragmentBaseContract.b
    {
        public static final a LIZJ;
        public LinkerInviteContent LIZ;
        public int LIZIZ;
        
        static {
            Covode.recordClassIndex(8185);
            LIZJ = (a)new a((byte)0);
        }
        
        public b() {
            ((b)this).LIZIZ = 1;
        }
        
        public static final class a
        {
            static {
                Covode.recordClassIndex(8186);
            }
            
            public final b LIZ(final LinkerInviteContent liz) {
                CTM.LIZ((Object)liz);
                final b b = new b((byte)0);
                ((b)b).LIZ = liz;
                return (b)b;
            }
        }
    }
}

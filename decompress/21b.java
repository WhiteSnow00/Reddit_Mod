// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.liveinteract.multiguestv3.dialog.MultiGuestV3GuestBeInvitedDialog;

public final class 21b extends F5g implements QgG<2P9>
{
    public final /* synthetic */ MultiGuestV3GuestBeInvitedDialog LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ long LIZJ;
    
    static {
        Covode.recordClassIndex(8775);
    }
    
    public 21b(final MultiGuestV3GuestBeInvitedDialog liz, final long liziz, final long lizj) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        super(0);
    }
    
    public final void LIZ() {
        if (this.LIZ.LIZJ) {
            return;
        }
        this.LIZ.LIZJ = true;
        final 0rg<MultiGuestV3GuestBeInvitedDialog> liziz = this.LIZ.LIZIZ;
        if (liziz != null) {
            liziz.LIZIZ(this.LIZIZ, this.LIZJ);
        }
    }
}

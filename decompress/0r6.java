// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.n;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import android.view.View;
import com.bytedance.covode.number.Covode;
import android.view.View$OnClickListener;

public final class 0r6 implements View$OnClickListener
{
    public final /* synthetic */ 10r LIZ;
    
    static {
        Covode.recordClassIndex(8523);
    }
    
    public 0r6(final 10r liz) {
        this.LIZ = liz;
    }
    
    public final void onClick(final View view) {
        final DataChannel ljiizilj = this.LIZ.LJIIZILJ;
        if (view != null && view.getContext() != null && ljiizilj != null) {
            final IInteractService liz = 0jR.LIZ(IInteractService.class);
            n.LIZIZ((Object)liz, "");
            if (0k7.LIZ(liz.getCurrentLinkMode(), 2)) {
                Hf4.LIZ(0cB.LJ(), 0cB.LIZ(2131830623), 0L);
                return;
            }
            ljiizilj.LIZJ((Class)Gta.class, (Object)"");
            final Gkn liz2 = Gkn.LJFF.LIZ("livesdk_anchor_invite_guest_popup_click");
            liz2.LIZ();
            liz2.LIZLLL();
        }
    }
}

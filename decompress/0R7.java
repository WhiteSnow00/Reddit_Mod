// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Set;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import kotlin.jvm.internal.n;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.model.message.LinkMicAudienceNoticeMessage$LinkMicAudienceInviteGuide;
import android.view.View$OnClickListener;

public final class 0r7 implements View$OnClickListener
{
    public final /* synthetic */ LinkMicAudienceNoticeMessage$LinkMicAudienceInviteGuide LIZ;
    public final /* synthetic */ 10r LIZIZ;
    
    static {
        Covode.recordClassIndex(8525);
    }
    
    public 0r7(final 20E 20E, final LinkMicAudienceNoticeMessage$LinkMicAudienceInviteGuide liz, final 10r liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public final void onClick(final View view) {
        final User lizj = this.LIZ.LIZJ;
        n.LIZIZ((Object)lizj, "");
        final long id = lizj.getId();
        final 0k8 lj = 0ta.LJ();
        final 20D liz = 20D.LIZ;
        final User lizj2 = this.LIZ.LIZJ;
        n.LIZIZ((Object)lizj2, "");
        0xy.LIZ(id, lj, true, liz.LIZ(lizj2.getFollowInfo()));
        final DataChannel ljiizilj = this.LIZIZ.LJIIZILJ;
        if (view != null && view.getContext() != null && ljiizilj != null) {
            if (1NN.LLFF.LIZ().LIZ() != 2) {
                Hf4.LIZ(0cB.LJ(), 2131830549);
                return;
            }
            if (Gbx.LIZ.LIZJ()) {
                final IInteractService liz2 = 0jR.LIZ(IInteractService.class);
                n.LIZIZ((Object)liz2, "");
                final Set<Long> hasAppliedUidSetForMultiGuestAnchor = liz2.getHasAppliedUidSetForMultiGuestAnchor();
                final User lizj3 = this.LIZ.LIZJ;
                n.LIZIZ((Object)lizj3, "");
                if (hasAppliedUidSetForMultiGuestAnchor.contains(lizj3.getId())) {
                    final User lizj4 = this.LIZ.LIZJ;
                    n.LIZIZ((Object)lizj4, "");
                    ljiizilj.LIZJ((Class)2E0.class, (Object)new GFm(lizj4));
                    return;
                }
                ljiizilj.LIZJ((Class)2Dy.class, (Object)new GG0(this.LIZ.LIZJ, "mutual_notice"));
            }
            else {
                ljiizilj.LIZJ((Class)2Dy.class, (Object)new GG0(this.LIZ.LIZJ, "mutual_notice"));
            }
        }
    }
}

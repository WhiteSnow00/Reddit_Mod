// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.model.message.PinMessage;
import java.util.Map;
import java.util.HashMap;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent$Sender;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;

public final class 1my extends GG1
{
    static {
        Covode.recordClassIndex(10717);
    }
    
    public 1my(final User user) {
        super(user);
    }
    
    public 1my(final User user, final int n) {
        super(user, n);
    }
    
    public final void LIZ(final View view, final GCd gCd, final ISendCommentEvent$Sender sendCommentEvent$Sender) {
        super.LIZ(view, gCd, sendCommentEvent$Sender);
        final Map logArgs = sendCommentEvent$Sender.getLogArgs();
        final Object tag = view.getTag(2131372766);
        Object ljiiliil;
        if (tag instanceof 2Gk) {
            final 2Gk 2Gk = (2Gk)tag;
            if (2Gk.LJFF.LIZIZ) {
                logArgs.put("reply_method", "pin");
                if (2Gk.LJFF.LIZJ != null) {
                    final PinMessage lji = 2Gk.LJFF.LIZJ.LJI;
                    if (lji != null) {
                        logArgs.put("pin_msg_id", String.valueOf(((H31)lji).getMessageId()));
                        logArgs.put("pin_id", String.valueOf(lji.LJIIJ));
                    }
                }
            }
            else if (2Gk.LJJIJLIJ()) {
                logArgs.put("reply_method", "anchor");
            }
            else {
                logArgs.put("reply_method", "viewer");
            }
            ljiiliil = 2Gk.LJIILIIL;
            logArgs.put("reply_event_page", "click_msg");
        }
        else {
            ljiiliil = null;
        }
        if (ljiiliil instanceof MemberMessage) {
            final MemberMessage memberMessage = (MemberMessage)ljiiliil;
            if (memberMessage.LJIILL != null && "pm_mt_guidance_interaction".equals(memberMessage.LJIILL.LIZ)) {
                final HashMap<String, String> hashMap = new HashMap<String, String>();
                hashMap.put("event_type", "click");
                hashMap.put("click_module", "message");
                final Gkn liz = Gkn.LJFF.LIZ("livesdk_anchor_interact_notice");
                liz.LIZ((Map)hashMap);
                liz.LIZ();
                liz.LIZLLL();
                gCd.LJ = "interact_guide";
            }
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.model.message.RoomMessage;

public class 2Ha extends 2Gk<RoomMessage>
{
    static {
        Covode.recordClassIndex(10879);
    }
    
    public 2Ha(final RoomMessage roomMessage) {
        super((H31)roomMessage);
    }
    
    @Override
    public final User LIZIZ() {
        return null;
    }
    
    @Override
    public final void LJIIJ() {
        super.LJIIJ();
        if (super.LIZLLL.LIZIZ) {
            String liz;
            if (((HDi)super.LJIILIIL).baseMessage.LJIIIZ != null) {
                liz = ((HDi)super.LJIILIIL).baseMessage.LJIIIZ.LIZ;
            }
            else {
                liz = "";
            }
            if ("pm_mt_brightness_adjust_banner".equals(liz)) {
                final Gkn liz2 = Gkn.LJFF.LIZ("livesdk_brightness_adjust_message_show");
                liz2.LIZ();
                liz2.LIZLLL();
            }
            HDj.LIZ.LIZ(super.LJIILIIL);
        }
    }
    
    @Override
    public CharSequence p_() {
        0jR.LIZ(IPublicScreenService.class).getTextMessageConfig();
        return 11M.LIZ(((RoomMessage)super.LJIILIIL).LIZ);
    }
    
    @Override
    public final void w_() {
        super.w_();
        if ((((RoomMessage)super.LJIILIIL).LIZIZ == 1 || ((RoomMessage)super.LJIILIIL).LIZIZ == 3) && super.LJ.LIZ == 1 && ((HDi)super.LJIILIIL).baseMessage != null && ((HDi)super.LJIILIIL).baseMessage.LJIIIZ != null) {
            final Gkn liz = Gkn.LJFF.LIZ("livesdk_promoting_message_show");
            liz.LIZ(super.LIZLLL.LJIIZILJ);
            liz.LIZIZ(Long.valueOf(super.LIZLLL.LIZ));
            liz.LIZ(Long.valueOf(super.LIZLLL.LIZJ));
            liz.LIZ("msg_id", ((HDi)super.LJIILIIL).baseMessage.LJIIIZ.LIZ);
            String s;
            if (super.LIZLLL.LJIILJJIL) {
                s = "anchor";
            }
            else {
                s = "viewer";
            }
            liz.LIZ("admin_type", s);
            liz.LIZLLL();
        }
    }
}

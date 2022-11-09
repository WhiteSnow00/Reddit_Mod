// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.List;
import kotlin.jvm.internal.n;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

public final class 0lD
{
    public static final 0lD LIZ;
    
    static {
        Covode.recordClassIndex(7331);
        LIZ = new 0lD();
    }
    
    public static final void LIZ(final 0kf 0kf, long lizj, final boolean b, final long n, final Room room, final DataChannel dataChannel, final String s) {
        CTM.LIZ((Object)0kf, (Object)room, (Object)dataChannel, (Object)s);
        final String liz = 0xg.LIZ(0kf);
        final Gkn liz2 = Gkn.LJFF.LIZ("livesdk_follow");
        liz2.LIZ("channel_id", lizj);
        final IInteractService liz3 = 0jR.LIZ(IInteractService.class);
        n.LIZIZ((Object)liz3, "");
        Label_0173: {
            if (liz3.isRoomInBattle()) {
                final IInteractService liz4 = 0jR.LIZ(IInteractService.class);
                n.LIZIZ((Object)liz4, "");
                liz2.LIZ("pk_id", liz4.getBattleId());
                if (!b) {
                    break Label_0173;
                }
                if (0n9.LIZ.LIZLLL) {
                    liz2.LIZ("pk_inviter_id", room.getOwnerUserId());
                    liz2.LIZ("pk_invitee_id", 1NN.LLFF.LIZ().LJFF);
                }
                else if (!0n9.LIZ.LIZLLL) {
                    liz2.LIZ("pk_invitee_id", room.getOwnerUserId());
                    liz2.LIZ("pk_inviter_id", 1NN.LLFF.LIZ().LJFF);
                }
            }
            else if (!b) {
                break Label_0173;
            }
            if (1NN.LLFF.LIZ().LJIIZILJ) {
                liz2.LIZ("connection_inviter_id", room.getOwnerUserId());
                liz2.LIZ("connection_invitee_id", 1NN.LLFF.LIZ().LJFF);
            }
            else {
                liz2.LIZ("connection_inviter_id", 1NN.LLFF.LIZ().LJFF);
                liz2.LIZ("connection_invitee_id", room.getOwnerUserId());
            }
        }
        final boolean hasMultiCoHostPermission = 0jR.LIZ(IInteractService.class).hasMultiCoHostPermission();
        final String s2 = "1";
        if (hasMultiCoHostPermission) {
            final IInteractService liz5 = 0jR.LIZ(IInteractService.class);
            n.LIZIZ((Object)liz5, "");
            final List<Long> multiCoHostLinkedUserList = liz5.getMultiCoHostLinkedUserList();
            String s3;
            if (multiCoHostLinkedUserList.size() > 2) {
                s3 = "1";
            }
            else {
                s3 = "0";
            }
            liz2.LIZ("is_multi", s3);
            liz2.LIZ("current_connection_cnts", String.valueOf(multiCoHostLinkedUserList.size()));
            liz2.LIZ("uid_list", multiCoHostLinkedUserList.toString());
        }
        else {
            liz2.LIZ("is_multi", "0");
            final GIK liziz = Fk2.LIZ().LIZIZ();
            n.LIZIZ((Object)liziz, "");
            lizj = liziz.LIZJ();
            liz2.LIZ("current_connection_cnts", "2");
            liz2.LIZ("uid_list", new Object[] { String.valueOf(lizj), n }.toString());
        }
        final List<0pc> coHostLinkedUserList = 0jz.LIZLLL().getCoHostLinkedUserList();
        String s4;
        if (coHostLinkedUserList.size() > 2) {
            s4 = "1";
        }
        else {
            s4 = "0";
        }
        liz2.LIZ("is_multi", s4);
        if (coHostLinkedUserList.size() <= 2) {
            liz2.LIZ("invitee_list", liz);
        }
        final IInteractService liz6 = 0jR.LIZ(IInteractService.class);
        n.LIZIZ((Object)liz6, "");
        final String connectionType = liz6.getConnectionType();
        if (n.LIZ((Object)connectionType, (Object)"manual_pk")) {
            String s5;
            if (0n9.LIZ.LIZJ() == 0nC.PUNISH) {
                s5 = "punish";
            }
            else {
                s5 = "pk_phase";
            }
            liz2.LIZ("match_status", s5);
        }
        liz2.LIZ("anchor_type", "opposite");
        String s6;
        if (n.LIZ((Object)Fwf.LIZ.LIZLLL(), (Object)"portal")) {
            s6 = s2;
        }
        else {
            s6 = "0";
        }
        liz2.LIZ("is_portal_user", s6);
        if (n.LIZ((Object)Fwf.LIZ.LIZLLL(), (Object)"portal")) {
            liz2.LIZ("portal_id", Fwf.LIZ.LJ());
        }
        liz2.LIZ(dataChannel);
        liz2.LIZ(new Fl1("user_live_follow"));
        String s7;
        if (b) {
            s7 = "live_anchor_c_anchor";
        }
        else {
            s7 = "live_audience_c_anchor";
        }
        liz2.LIZ("request_page", s7);
        liz2.LIZ("enter_from_merge", Fwf.LIZ.LIZ());
        liz2.LIZ("enter_method", Fwf.LIZ.LIZLLL());
        liz2.LIZ("action_type", Fwf.LIZ.LJFF());
        liz2.LIZ("anchor_id", room.getOwnerUserId());
        liz2.LIZ("room_id", room.getId());
        liz2.LIZ("request_id", room.getRequestId());
        liz2.LIZ("log_pb", room.getLog_pb());
        liz2.LIZ("click_user_position", s);
        liz2.LIZ("to_user_id", n);
        liz2.LIZ("live_type", "video_live");
        liz2.LIZ("connection_type", connectionType);
        liz2.LIZLLL();
    }
    
    public final String LIZ() {
        final IInteractService liz = 0jR.LIZ(IInteractService.class);
        n.LIZIZ((Object)liz, "");
        if (liz.isInMultiGuest()) {
            return "audience";
        }
        final IInteractService liz2 = 0jR.LIZ(IInteractService.class);
        n.LIZIZ((Object)liz2, "");
        if (liz2.isRoomInBattle()) {
            return "manual_pk";
        }
        final IInteractService liz3 = 0jR.LIZ(IInteractService.class);
        n.LIZIZ((Object)liz3, "");
        if (liz3.isInCoHost()) {
            return "anchor";
        }
        return "normal";
    }
}

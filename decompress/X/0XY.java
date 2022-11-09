// 
// Decompiled by Procyon v0.6.0
// 

package X;

import org.json.JSONException;
import org.json.JSONObject;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoHostPreviewAnchorAndroidSwitchSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo$Tag;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscribeGuestSubscriberSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3ServiceInviteRefactorSetting;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

public final class 0xy
{
    public static boolean LIZ;
    public static String LIZIZ;
    public static long LIZJ;
    public static boolean LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static long LJI;
    
    static {
        Covode.recordClassIndex(10342);
    }
    
    public static 0k8 LIZ(final 1Uo 1Uo) {
        if (0sD.LIZJ.LIZ().LIZLLL()) {
            return 0sD.LIZJ.LIZ().LJIIIIZZ();
        }
        return 1Uo.LJIILL;
    }
    
    public static Gnh LIZ(final Room room) {
        final 1NN liz = 1NN.LLFF.LIZ();
        final Gnh gnh = new Gnh();
        gnh.LIZ(liz.LJIILL.getType());
        if (liz.LJIIZILJ) {
            gnh.LIZ = room.getOwner().getId();
            gnh.LIZIZ = liz.LJFF;
        }
        else {
            gnh.LIZ = liz.LJFF;
            gnh.LIZIZ = room.getOwner().getId();
        }
        gnh.LJI = liz.LJ;
        return gnh;
    }
    
    public static void LIZ() {
        LIZIZ("guest_connection_underage_popup", null, "show");
    }
    
    public static void LIZ(final int n) {
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_appeal_popup_window_show");
        liz.LIZ("request_page", LIZLLL(n));
        liz.LIZ();
        liz.LIZLLL();
    }
    
    public static void LIZ(final int n, final int n2, final long n3, final int n4, 0k8 ljiiiizz) {
        if (0sD.LIZJ.LIZ().LIZLLL()) {
            ljiiiizz = 0sD.LIZJ.LIZ().LJIIIIZZ();
        }
        final HashMap hashMap = new HashMap();
        String s;
        if (n == 1) {
            s = "video";
        }
        else {
            s = "voice";
        }
        hashMap.put("guest_connection_type", s);
        hashMap.put("weight_decay_type", String.valueOf(n2));
        hashMap.put("anchor_relationship", String.valueOf(n3));
        final 1ZT liz = 1ZT.LJ.LIZ();
        final 0us liz2 = 1Za.LJIIJ.LIZ();
        String lizj;
        if (liz2 != null) {
            lizj = liz2.LIZJ();
        }
        else {
            lizj = "";
        }
        String lizlll = null;
        Label_0156: {
            Label_0147: {
                if (liz != null && !liz.LIZLLL().isEmpty()) {
                    hashMap.put("request_page", liz.LIZLLL());
                }
                else {
                    if (liz2 != null && !TextUtils.isEmpty((CharSequence)lizj)) {
                        hashMap.put("request_page", lizj);
                        break Label_0147;
                    }
                    if (!TextUtils.isEmpty((CharSequence)0xy.LIZIZ)) {
                        hashMap.put("request_page", 0xy.LIZIZ);
                    }
                }
                if (liz2 == null) {
                    lizlll = "room";
                    break Label_0156;
                }
            }
            lizlll = liz2.LIZLLL();
        }
        final 1Uo liz3 = 1Uo.LJJIJIIJIL.LIZ();
        if (liz3 != null) {
            hashMap.put("guest_permission", liz3.LIZLLL());
        }
        hashMap.put("apply_connection_type", "0");
        hashMap.put("request_platform", lizlll);
        hashMap.put("connected_guest_cnt", String.valueOf(n4));
        hashMap.put("layout_setting", 0uW.LIZJ.LIZ(ljiiiizz).getFirst());
        hashMap.put("window_setting", 0uW.LIZJ.LIZ(ljiiiizz).getSecond());
        LIZ("livesdk_guest_connection_apply", hashMap, "live_take_detail");
    }
    
    public static void LIZ(final int n, 0k8 ljiiiizz, final String s, final String s2) {
        if (0sD.LIZJ.LIZ().LIZLLL()) {
            ljiiiizz = 0sD.LIZJ.LIZ().LJIIIIZZ();
        }
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_guest_receive_anchor_apply");
        liz.LIZ();
        liz.LIZ("guest_connection_type", "anchor_invite_guest");
        liz.LIZ("live_type", "video_live");
        liz.LIZ("receive_invitation_platform", s);
        liz.LIZ("anchor_invite_position", s2);
        liz.LIZ("connected_guest_cnt", n);
        liz.LIZ("layout_setting", (String)0uW.LIZJ.LIZ(ljiiiizz).getFirst());
        liz.LIZ("window_setting", (String)0uW.LIZJ.LIZ(ljiiiizz).getSecond());
        liz.LIZLLL();
    }
    
    public static void LIZ(final int n, final String s) {
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_appeal_popup_window_click");
        liz.LIZ("request_page", LIZLLL(n));
        liz.LIZ("click_type", s);
        liz.LIZ();
        liz.LIZLLL();
    }
    
    public static void LIZ(final long n, final 0k8 0k8, final long n2, final String s, final String s2, final String s3, final String s4, final String s5, final int n3, final int n4) {
        0k8 ljiiiizz = 0k8;
        if (0sD.LIZJ.LIZ().LIZLLL()) {
            ljiiiizz = 0sD.LIZJ.LIZ().LJIIIIZZ();
        }
        String liz2;
        String liziz2;
        if (LinkMicMultiGuestV3ServiceInviteRefactorSetting.getValue()) {
            final 0sR.a liz = 0sR.LJIIIIZZ.LIZ(n);
            String liziz;
            if (liz != null) {
                liziz = liz.LIZIZ;
            }
            else {
                liziz = "";
            }
            final String s6 = "room";
            liz2 = liziz;
            liziz2 = s6;
        }
        else {
            liz2 = 1Tj.LIZ(n);
            liziz2 = 1Tj.LIZIZ(n);
        }
        final Gkn liz3 = Gkn.LJFF.LIZ("livesdk_anchor_guest_connection_success");
        liz3.LIZ();
        liz3.LIZ("enter_from", liz2);
        liz3.LIZ("share_platform", liziz2);
        liz3.LIZ("live_type", "video_live");
        liz3.LIZ("reply_id", String.valueOf(n2));
        liz3.LIZ("guest_invite_type", "anchor_invite_guest");
        liz3.LIZ("layout_setting", (String)0uW.LIZJ.LIZ(ljiiiizz).getFirst());
        liz3.LIZ("window_setting", (String)0uW.LIZJ.LIZ(ljiiiizz).getSecond());
        liz3.LIZ("permission_type", 0tO.LIZLLL());
        liz3.LIZ("link_id", s);
        liz3.LIZ("guest_id", n);
        liz3.LIZ("multi_request_id", 0uF.LIZ.LIZIZ(n));
        liz3.LIZ("channel_id", s2);
        liz3.LIZ("anchor_relationship", n4);
        liz3.LIZ("guest_cnt", String.valueOf(GCe.LIZ().LJJI));
        liz3.LIZ("tag_list", s4);
        liz3.LIZ("show_tag_list", s5);
        liz3.LIZ("tag_show_cnt", n3);
        if (SubscribeGuestSubscriberSetting.INSTANCE.getValue()) {
            liz3.LIZ("is_guest_subscriber", s3);
        }
        GSP.LIZ(liz3);
        liz3.LIZLLL();
        if (!1NN.LLFF.LIZ().LJLIL) {
            LIZJ("Anchor invite guest");
            1NN.LLFF.LIZ().LJLIL = true;
        }
        0uS.LIZ.LIZJ(n);
    }
    
    public static void LIZ(final long n, final 0k8 0k8, final String s, final String s2, final String s3, final int n2) {
        0k8 ljiiiizz = 0k8;
        if (0sD.LIZJ.LIZ().LIZLLL()) {
            ljiiiizz = 0sD.LIZJ.LIZ().LJIIIIZZ();
        }
        String s4;
        if (LinkMicMultiGuestV3ServiceInviteRefactorSetting.getValue()) {
            final 0sR.a liz = 0sR.LJIIIIZZ.LIZ(n);
            if (liz != null) {
                s4 = liz.LIZIZ;
            }
            else {
                s4 = "";
            }
        }
        else {
            s4 = 1Tj.LIZ(n);
        }
        final Gkn liz2 = Gkn.LJFF.LIZ("livesdk_anchor_invite_guest_connection");
        liz2.LIZ();
        liz2.LIZ("guest_id", String.valueOf(n));
        liz2.LIZ("share_platform", "room");
        liz2.LIZ("enter_from", s4);
        liz2.LIZ("live_type", "video_live");
        liz2.LIZ("layout_setting", (String)0uW.LIZJ.LIZ(ljiiiizz).getFirst());
        liz2.LIZ("window_setting", (String)0uW.LIZJ.LIZ(ljiiiizz).getSecond());
        liz2.LIZ("trigger", s);
        liz2.LIZ("guest_cnt", String.valueOf(GCe.LIZ().LJJI));
        liz2.LIZ("tag_list", s2);
        liz2.LIZ("show_tag_list", s3);
        liz2.LIZ("tag_show_cnt", String.valueOf(n2));
        liz2.LIZ("multi_request_id", 0uF.LIZ.LIZIZ(n));
        liz2.LIZLLL();
    }
    
    public static void LIZ(final long n, final 0k8 0k8, final boolean b, final int n2) {
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_anchor_guest_connection_mutual_notice");
        liz.LIZ();
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null) {
            liz.LIZ("room_id", String.valueOf(room.getId()));
            liz.LIZ("anchor_id", String.valueOf(room.getOwnerUserId()));
        }
        liz.LIZ("guest_id", String.valueOf(n));
        int n3;
        if (GCe.LIZ().LJJI != 0) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        liz.LIZ("is_guest_connection", n3);
        liz.LIZ("layout_setting", (String)0uW.LIZJ.LIZ(0k8).getFirst());
        liz.LIZ("window_setting", (String)0uW.LIZJ.LIZ(0k8).getSecond());
        liz.LIZ("guest_cnt", String.valueOf(GCe.LIZ().LJJI));
        String s;
        if (b) {
            s = "click";
        }
        else {
            s = "show";
        }
        liz.LIZ("action_type", s);
        liz.LIZ("anchor_relationship", n2);
        liz.LIZLLL();
    }
    
    public static void LIZ(final long n, 0k8 ljiiiizz, final boolean b, final String s, final String s2, final String s3, final String s4, final String s5, final int n2, final int n3) {
        if (0sD.LIZJ.LIZ().LIZLLL()) {
            ljiiiizz = 0sD.LIZJ.LIZ().LJIIIIZZ();
        }
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_anchor_guest_connection_success");
        liz.LIZ();
        liz.LIZ("live_type", "video_live");
        liz.LIZ("channel_id", s2);
        String s6 = "guest_apply_anchor";
        liz.LIZ("guest_invite_type", "guest_apply_anchor");
        if (b) {
            s6 = "animation_guest_apply_anchor";
        }
        liz.LIZ("enter_from", s6);
        liz.LIZ("layout_setting", (String)0uW.LIZJ.LIZ(ljiiiizz).getFirst());
        liz.LIZ("window_setting", (String)0uW.LIZJ.LIZ(ljiiiizz).getSecond());
        liz.LIZ("permission_type", 0tO.LIZLLL());
        liz.LIZ("link_id", s);
        liz.LIZ("guest_id", n);
        liz.LIZ("multi_request_id", 0uF.LIZ.LIZIZ(n));
        liz.LIZ("channel_id", s2);
        liz.LIZ("anchor_relationship", n3);
        liz.LIZ("guest_cnt", String.valueOf(GCe.LIZ().LJJI));
        liz.LIZ("tag_list", s4);
        liz.LIZ("show_tag_list", s5);
        liz.LIZ("tag_show_cnt", n2);
        if (SubscribeGuestSubscriberSetting.INSTANCE.getValue()) {
            liz.LIZ("is_guest_subscriber", s3);
        }
        GSP.LIZ(liz);
        liz.LIZLLL();
        if (!1NN.LLFF.LIZ().LJLIL) {
            LIZJ("Guest reply anchor");
            1NN.LLFF.LIZ().LJLIL = true;
        }
        0uS.LIZ.LIZJ(n);
    }
    
    public static void LIZ(final long n, final String s, 0k8 ljiiiizz, final String s2) {
        if (0sD.LIZJ.LIZ().LIZLLL()) {
            ljiiiizz = 0sD.LIZJ.LIZ().LJIIIIZZ();
        }
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_anchor_invite_guest_connection");
        liz.LIZ();
        liz.LIZ("enter_from", s2);
        liz.LIZ("guest_id", String.valueOf(n));
        liz.LIZ("share_platform", s);
        liz.LIZ("live_type", "video_live");
        liz.LIZ("layout_setting", (String)0uW.LIZJ.LIZ(ljiiiizz).getFirst());
        liz.LIZ("window_setting", (String)0uW.LIZJ.LIZ(ljiiiizz).getSecond());
        liz.LIZ("guest_cnt", String.valueOf(GCe.LIZ().LJJI));
        liz.LIZLLL();
    }
    
    public static void LIZ(0k8 ljiiiizz) {
        if (0sD.LIZJ.LIZ().LIZLLL()) {
            ljiiiizz = 0sD.LIZJ.LIZ().LJIIIIZZ();
        }
        final boolean booleanValue = (boolean)((44T)GST.LLFFF).LIZ();
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_guest_connection_status");
        liz.LIZ();
        String s;
        if (booleanValue) {
            s = "open";
        }
        else {
            s = "close";
        }
        liz.LIZ("status", s);
        liz.LIZ("layout_setting", (String)0uW.LIZJ.LIZ(ljiiiizz).getFirst());
        liz.LIZ("window_setting", (String)0uW.LIZJ.LIZ(ljiiiizz).getSecond());
        liz.LIZLLL();
    }
    
    public static void LIZ(final 0kf 0kf, final long n, final long n2, final String s, final long n3, final boolean b, final boolean b2, final RivalExtraInfo$Tag rivalExtraInfo$Tag) {
        final HashMap hashMap = new HashMap();
        hashMap.put("connection_type", "anchor");
        0xg.LIZ(hashMap, 0kf, true);
        hashMap.put("time_stamp", String.valueOf(0xy.LJ = System.currentTimeMillis()));
        if (0kf == 0kf.FOLLOW_INVITE || 0kf == 0kf.RECOMMEND_INVITE) {
            hashMap.put("show_to_decide_dur", String.valueOf(0xy.LJ - 0xy.LJFF));
        }
        if (b2) {
            hashMap.put("is_opposite_anchor_live_show", "1");
        }
        else {
            hashMap.put("is_opposite_anchor_live_show", "0");
        }
        hashMap.put("inviter_id", String.valueOf(n));
        hashMap.put("invitee_id", String.valueOf(n2));
        hashMap.put("selection", s);
        hashMap.put("invited_room_id", String.valueOf(n3));
        String s2;
        if (b) {
            s2 = "1";
        }
        else {
            s2 = "0";
        }
        hashMap.put("is_turn_off_invitation", s2);
        String s3;
        if (1NN.LLFF.LIZ().LJIIZILJ) {
            s3 = "inviter";
        }
        else {
            s3 = "invitee";
        }
        hashMap.put("anchor_type", s3);
        final String ljjijlij = 1NN.LLFF.LIZ().LJJIJLIJ;
        if (!TextUtils.isEmpty((CharSequence)ljjijlij)) {
            hashMap.put("request_id", ljjijlij);
        }
        if (1NN.LLFF.LIZ().LJJJIL.LIZIZ()) {
            hashMap.put("rank_type", 1NN.LLFF.LIZ().LJJJIL.LIZ);
        }
        hashMap.put("is_ranking_opposite_anchor", 1NN.LLFF.LIZ().LJJJIL.LIZJ());
        if (rivalExtraInfo$Tag != null) {
            hashMap.put("relation_type", String.valueOf(rivalExtraInfo$Tag.LIZ));
        }
        if (1NN.LLFF.LIZ().LJIILL == 0kf.RANDOM_LINK_MIC_RECOMMEND) {
            hashMap.put("is_quick_recommend", "1");
        }
        else {
            hashMap.put("is_quick_recommend", "0");
        }
        LIZIZ(hashMap);
        LIZ("connection_invited", hashMap);
    }
    
    public static void LIZ(final 0kf 0kf, final String s, final String s2) {
        final HashMap hashMap = new HashMap();
        0xg.LIZ(hashMap, 0kf, false);
        LIZ(hashMap);
        hashMap.put("click_position", s);
        hashMap.put("selection", s2);
        hashMap.put("event_type", String.valueOf(1NN.LLFF.LIZ().LJIILL.getType()));
        LIZ("cancel_connection_popup_click", hashMap);
    }
    
    public static void LIZ(final 0kf 0kf, final Map<String, String> map) {
        if (LIZ(0kf)) {
            map.put("is_ranking_opposite_anchor", "1");
            map.put("rank_type", 0xg.LIZIZ(0kf));
            return;
        }
        if (1NN.LLFF.LIZ().LJJJIL.LIZIZ()) {
            map.put("rank_type", 1NN.LLFF.LIZ().LJJJIL.LIZ);
        }
        else {
            map.put("rank_type", "not_in_rank");
        }
        map.put("is_ranking_opposite_anchor", 1NN.LLFF.LIZ().LJJJIL.LIZJ());
    }
    
    public static void LIZ(final PunishEventInfo punishEventInfo) {
        final HashMap hashMap = new HashMap();
        if (punishEventInfo != null) {
            hashMap.put("record_id", punishEventInfo.LIZJ);
            hashMap.put("violation_anchor_id", String.valueOf(punishEventInfo.LIZLLL));
            hashMap.put("violation_type", punishEventInfo.LIZ);
            hashMap.put("violation_reason", punishEventInfo.LIZIZ);
        }
        LIZ("livesdk_accept_connect_notice", hashMap);
    }
    
    public static void LIZ(final Room room, final long n, final String s, final String s2) {
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_anchor_reinvite_guest_connection");
        liz.LIZ();
        if (room != null) {
            liz.LIZ("room_id", room.getId());
            if (room.getOwner() != null) {
                liz.LIZ("anchor_id", room.getOwner().getId());
            }
            if (1jw.LIZ.LIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER") != null) {
                final 1XD 1xd = (1XD)1jw.LIZ.LIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
                if (1xd != null) {
                    final LinkPlayerInfo liziz = 0sc.LIZIZ(1xd.LJFF(), n);
                    if (liziz != null && liziz.LIZJ != null && liziz.LIZJ.getFollowInfo() != null) {
                        liz.LIZ("anchor_relationship", liziz.LIZJ.getFollowInfo().getFollowStatus());
                    }
                }
            }
            liz.LIZ("action_type", s);
            liz.LIZ("click_descision", s2);
            liz.LIZ("connected_guest_cnt", 0sM.LIZ(0jz.LIZJ()));
            liz.LIZ("guest_id", n);
            liz.LIZLLL();
        }
    }
    
    public static void LIZ(final Room room, final long n, final String s, final boolean b) {
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_anchor_refused_connection_show");
        liz.LIZ();
        if (room != null) {
            liz.LIZ("room_id", room.getId());
            if (room.getOwner() != null) {
                liz.LIZ("anchor_id", room.getOwner().getId());
            }
        }
        if (1jw.LIZ.LIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER") != null) {
            final 1XD 1xd = (1XD)1jw.LIZ.LIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (1xd != null) {
                final LinkPlayerInfo liziz = 0sc.LIZIZ(1xd.LJFF(), n);
                if (liziz != null && liziz.LIZJ != null && liziz.LIZJ.getFollowInfo() != null) {
                    liz.LIZ("anchor_relationship", liziz.LIZJ.getFollowInfo().getFollowStatus());
                }
            }
        }
        liz.LIZ("refused_way", s);
        liz.LIZ("connected_guest_cnt", 0sM.LIZ(0jz.LIZJ()));
        liz.LIZ("guest_id", n);
        liz.LIZ("is_toast_show", (int)(b ? 1 : 0));
        liz.LIZLLL();
    }
    
    public static void LIZ(final Room room, final 0kf 0kf, String s, final String s2) {
        final 1NN liz = 1NN.LLFF.LIZ();
        final HashMap hashMap = new HashMap();
        hashMap.put("connection_type", "anchor");
        int n = 1;
        0xg.LIZ(hashMap, 0kf, true);
        0xy.LJI = System.currentTimeMillis();
        if (0kf != 0kf.RANDOM_LINK_MIC_INVITE) {
            hashMap.put("invitee_id", room.getOwner().getIdStr());
            hashMap.put("invited_room_id", room.getIdStr());
            hashMap.put("time_stamp", String.valueOf(0xy.LJI));
        }
        else {
            hashMap.put("invitee_id", "0");
        }
        0xg.LIZ(hashMap, 0kf, true);
        hashMap.put("invite_scene", LIZIZ());
        if (!TextUtils.isEmpty((CharSequence)liz.LIZIZ())) {
            hashMap.put("enter_from", liz.LIZIZ());
        }
        final String ljjijlij = liz.LJJIJLIJ;
        if (!TextUtils.isEmpty((CharSequence)ljjijlij)) {
            hashMap.put("request_id", ljjijlij);
        }
        else {
            hashMap.put("request_id", s);
        }
        hashMap.put("connection_inviter_id", String.valueOf(Fk2.LIZ().LIZIZ().LIZJ()));
        final String s3 = "";
        if (room == null) {
            s = "";
        }
        else {
            s = String.valueOf(room.getOwnerUserId());
        }
        hashMap.put("connection_invitee_id", s);
        if (0kf == 0kf.RANDOM_LINK_MIC_INVITE && 1NN.LLFF.LIZ().LJFF > 0L) {
            return;
        }
        if (1NN.LLFF.LIZ().LJFF > 0L) {
            hashMap.put("invitee_id", String.valueOf(1NN.LLFF.LIZ().LJFF));
        }
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            hashMap.put("request_page", s2);
        }
        if (1NN.LLFF.LIZ().LJJJIL.LIZIZ()) {
            hashMap.put("rank_type", 1NN.LLFF.LIZ().LJJJIL.LIZ);
        }
        hashMap.put("is_ranking_opposite_anchor", 1NN.LLFF.LIZ().LJJJIL.LIZJ());
        0xg.LIZ(hashMap);
        s = 1NN.LLFF.LIZ().LJLJLLL;
        String value;
        if (room == null) {
            value = s3;
        }
        else {
            value = String.valueOf(room.getOwnerUserId());
        }
        if (s == null || !s.equals(value)) {
            n = 0;
        }
        String s4;
        if (n != 0) {
            s4 = "1";
        }
        else {
            s4 = "0";
        }
        hashMap.put("is_icon_show_anchor", s4);
        hashMap.put("log_id", 1NN.LLFF.LIZ().LJLJLJ);
        if (1NN.LLFF.LIZ().LJLL != null) {
            hashMap.put("relation_type", String.valueOf(1NN.LLFF.LIZ().LJLL));
        }
        final Room room2 = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null && room.ageRestricted != null) {
            if (room.ageRestricted.ageInterval == 0) {
                hashMap.put("is_invitee_mature", "0");
            }
            else if (room.ageRestricted.ageInterval == 4) {
                hashMap.put("is_invitee_mature", "1");
            }
        }
        if (room2 != null && room2.ageRestricted != null) {
            if (room2.ageRestricted.ageInterval == 0) {
                hashMap.put("is_inviter_mature", "0");
            }
            else if (room2.ageRestricted.ageInterval == 4) {
                hashMap.put("is_inviter_mature", "1");
            }
        }
        LIZ("connection_invite", hashMap);
    }
    
    public static void LIZ(final Room room, final String s) {
        0xy.LIZ = true;
        final 1NN liz = 1NN.LLFF.LIZ();
        liz.LJLIIIL = 0xy.LIZ;
        String s2;
        if (liz.LJIIZILJ) {
            s2 = "inviter";
        }
        else {
            s2 = "invitee";
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("connection_type", "anchor");
        hashMap.put("anchor_type", s2);
        hashMap.put("invited_room_id", String.valueOf(liz.LJIIIIZZ));
        hashMap.put("time_stamp", String.valueOf(System.currentTimeMillis()));
        final String ljjijlij = liz.LJJIJLIJ;
        if (!TextUtils.isEmpty((CharSequence)ljjijlij)) {
            hashMap.put("request_id", ljjijlij);
        }
        if (1O2.LIZ()) {
            0xg.LIZ(hashMap, 0kf.RANDOM_LINK_MIC_INVITE, true);
            hashMap.put("random_match_waiting_time", String.valueOf(1O2.LIZJ * 1000L));
        }
        else {
            0xg.LIZ(hashMap, 1NN.LLFF.LIZ().LJIILL, true);
            if (1NN.LLFF.LIZ().LJJL != 0L && liz.LJIIZILJ) {
                hashMap.put("invite_to_success_dur", String.valueOf(System.currentTimeMillis() - 0xy.LJI));
            }
        }
        if (1NN.LLFF.LIZ().LJIIZILJ) {
            hashMap.put("connection_inviter_id", String.valueOf(room.getOwnerUserId()));
            hashMap.put("connection_invitee_id", String.valueOf(1NN.LLFF.LIZ().LJFF));
            final String ljljlll = 1NN.LLFF.LIZ().LJLJLLL;
            String s3;
            if (ljljlll != null && ljljlll.equals(String.valueOf(1NN.LLFF.LIZ().LJFF))) {
                s3 = "1";
            }
            else {
                s3 = "0";
            }
            hashMap.put("is_icon_show_anchor", s3);
        }
        else {
            hashMap.put("connection_invitee_id", String.valueOf(room.getOwnerUserId()));
            hashMap.put("connection_inviter_id", String.valueOf(1NN.LLFF.LIZ().LJFF));
        }
        if (1NN.LLFF.LIZ().LJIILLIIL == 0kP.RANDOM_LINK_MIC_RECOMMEND || 1NN.LLFF.LIZ().LJIILL == 0kf.RANDOM_LINK_MIC_RECOMMEND) {
            hashMap.put("is_quick_recommend", "1");
        }
        else {
            hashMap.put("is_quick_recommend", "0");
        }
        hashMap.put("event_type", String.valueOf(1NN.LLFF.LIZ().LJIILL.getType()));
        if (1NN.LLFF.LIZ().LJJJIL.LIZIZ()) {
            hashMap.put("rank_type", 1NN.LLFF.LIZ().LJJJIL.LIZ);
        }
        hashMap.put("is_ranking_opposite_anchor", 1NN.LLFF.LIZ().LJJJIL.LIZJ());
        hashMap.put("log_id", 1NN.LLFF.LIZ().LJLJLJ);
        String value;
        if (1NN.LLFF.LIZ().LJLL == null) {
            value = "";
        }
        else {
            value = String.valueOf(1NN.LLFF.LIZ().LJLL);
        }
        hashMap.put("relation_type", value);
        0xg.LIZ(hashMap);
        if (room.ageRestricted != null) {
            if (room.ageRestricted.ageInterval == 0) {
                hashMap.put("is_invitee_mature", "0");
                hashMap.put("is_inviter_mature", "0");
            }
            else if (room.ageRestricted.ageInterval == 4) {
                hashMap.put("is_invitee_mature", "1");
                hashMap.put("is_inviter_mature", "1");
            }
        }
        final Gkn liz2 = Gkn.LJFF.LIZ(s);
        liz2.LIZ(LIZ(room));
        liz2.LIZ((Map)hashMap);
        liz2.LIZ();
        liz2.LIZLLL();
    }
    
    public static void LIZ(final DataChannel dataChannel) {
        final HashMap hashMap = new HashMap();
        hashMap.put("connection_type", "anchor");
        final Gkn liz = Gkn.LJFF.LIZ("connection_click");
        liz.LIZ((Map)hashMap);
        liz.LJ("live_detail");
        liz.LIZJ("live");
        liz.LIZLLL("click");
        liz.LIZ(dataChannel);
        liz.LIZLLL();
    }
    
    public static void LIZ(final String s) {
        TextUtils.isEmpty((CharSequence)s);
        final HashMap hashMap = new HashMap();
        hashMap.put("guest_connection_type", "video");
        if (!TextUtils.isEmpty((CharSequence)s)) {
            LIZ("guest_connection_agree", hashMap, "live_take_detail");
            return;
        }
        LIZ("guest_connection_agree", hashMap);
    }
    
    public static void LIZ(final String s, final int n) {
        final HashMap hashMap = new HashMap();
        String s2;
        if (1NN.LLFF.LIZ().LJIILL == 0kf.FOLLOW_INVITE) {
            s2 = "mutual_follow";
        }
        else {
            s2 = "recommend";
        }
        hashMap.put("invitee_list", s2);
        int n2;
        if (0n9.LIZ.LIZJ() != 0nC.NORMAL) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (n2 == 0) {
            hashMap.put("connection_type", "anchor");
        }
        else {
            hashMap.put("connection_type", "manual_pk");
        }
        hashMap.put("selection", s);
        hashMap.put("is_dont_suggest", String.valueOf(n));
        LIZ("cancel_connection_select", hashMap);
    }
    
    public static void LIZ(final String s, final long n) {
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_guest_connection_icon_show");
        liz.LIZ();
        liz.LIZ("request_page", s);
        liz.LIZ("anchor_relationship", n);
        liz.LIZLLL();
    }
    
    public static void LIZ(final String s, final 0kf 0kf, final String s2) {
        if (!LiveCoHostPreviewAnchorAndroidSwitchSetting.INSTANCE.getValue()) {
            return;
        }
        final HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty((CharSequence)s)) {
            hashMap.put("show_type", s);
        }
        if (0kf != null) {
            hashMap.put("invitee_list", 0xg.LIZ(0kf));
        }
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            hashMap.put("invitee_id", s2);
        }
        hashMap.put("is_change_pairing", "0");
        hashMap.put("is_system_rematching", "0");
        hashMap.put("time_stamp", String.valueOf(System.currentTimeMillis()));
        LIZ(0kf, hashMap);
        LIZ("livesdk_connection_live_watched_show", hashMap);
    }
    
    public static void LIZ(final String s, final 0kf 0kf, final String s2, final boolean b) {
        if (!LiveCoHostPreviewAnchorAndroidSwitchSetting.INSTANCE.getValue()) {
            return;
        }
        final HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty((CharSequence)s)) {
            hashMap.put("show_type", s);
        }
        if (0kf != null) {
            hashMap.put("invitee_list", 0xg.LIZ(0kf));
        }
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            hashMap.put("invitee_id", s2);
        }
        if (b) {
            hashMap.put("selection", "continue");
        }
        else {
            hashMap.put("selection", "cancel");
        }
        hashMap.put("is_change_pairing", "0");
        hashMap.put("is_system_rematching", "0");
        hashMap.put("connection_type", "anchor");
        hashMap.put("time_stamp", String.valueOf(System.currentTimeMillis()));
        hashMap.put("inviter_id", String.valueOf(Fk2.LIZ().LIZIZ().LIZJ()));
        LIZ(0kf, hashMap);
        LIZ("livesdk_connection_live_watched_popup_click", hashMap);
    }
    
    public static void LIZ(final String s, final Room room, final int n, final RivalExtraInfo rivalExtraInfo, final int n2) {
        if (room != null && room.getOwner() != null) {
            int n3;
            if (rivalExtraInfo != null && rivalExtraInfo.LJFF == 0) {
                n3 = 1;
            }
            else {
                n3 = 0;
            }
            String s2;
            if (n == 1) {
                s2 = "mutual_follow";
            }
            else {
                s2 = "recommend";
            }
            final HashMap hashMap = new HashMap();
            hashMap.put("connection_type", "anchor");
            hashMap.put("invitee_list", s2);
            hashMap.put("invitee_status", String.valueOf(n3));
            hashMap.put("invitee_id", String.valueOf(room.getOwnerUserId()));
            hashMap.put("invited_room_id", room.getIdStr());
            hashMap.put("connection_inviter_id", String.valueOf(Fk2.LIZ().LIZIZ().LIZJ()));
            hashMap.put("connection_invitee_id", String.valueOf(room.getOwnerUserId()));
            if (!TextUtils.isEmpty((CharSequence)s)) {
                hashMap.put("request_id", s);
            }
            1NN.LLFF.LIZ();
            LIZ(hashMap);
            hashMap.put("is_icon_show_anchor", String.valueOf(n2));
            if (rivalExtraInfo != null && rivalExtraInfo.LJIIIZ != null) {
                hashMap.put("relation_type", String.valueOf(rivalExtraInfo.LJIIIZ.LIZ));
            }
            LIZ("connection_invite_show", hashMap);
        }
    }
    
    public static void LIZ(String s, String ljljlj, final String s2, final String s3, final String s4) {
        final HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", s);
        hashMap.put("room_id", ljljlj);
        hashMap.put("show_type", s2);
        hashMap.put("current_live_mutual_friends_cnts", s3);
        if (!s4.isEmpty()) {
            hashMap.put("to_anchor_id", s4);
        }
        ljljlj = 1NN.LLFF.LIZ().LJLJLJ;
        if ((s = ljljlj) == null) {
            s = "";
        }
        hashMap.put("log_id", s);
        LIZIZ("livesdk_anchor_live_notification_popup_show", hashMap, "show");
    }
    
    public static void LIZ(final String s, final Map<String, String> map) {
        final Gkn liz = Gkn.LJFF.LIZ(s);
        liz.LIZ();
        liz.LIZ((Map)map);
        liz.LIZLLL();
    }
    
    public static void LIZ(final String s, final Map<String, String> map, final String s2) {
        final Gkn liz = Gkn.LJFF.LIZ(s);
        liz.LIZ();
        liz.LJ(s2);
        liz.LIZ((Map)map);
        liz.LIZLLL();
    }
    
    public static void LIZ(String s, final boolean b, final boolean b2) {
        final HashMap hashMap = new HashMap();
        hashMap.put("enter_from", s);
        if (b) {
            s = "random_notice";
        }
        else {
            s = "normal_notice";
        }
        hashMap.put("notice_type", s);
        if (b2) {
            s = "anchor";
        }
        else {
            s = "audience";
        }
        hashMap.put("connection_type", s);
        if (b) {
            hashMap.put("invitee_list", "random_match");
        }
        0uW.LIZJ.LIZ(hashMap, null);
        LIZIZ("guest_connection_anchor", hashMap, "show");
    }
    
    public static void LIZ(final Map<String, String> map) {
        final String liziz = 1NN.LLFF.LIZ().LIZIZ();
        if (!TextUtils.isEmpty((CharSequence)liziz)) {
            map.put("enter_from", liziz);
        }
    }
    
    public static void LIZ(final boolean b) {
        final HashMap hashMap = new HashMap();
        String s;
        if (b) {
            s = "dismiss";
        }
        else {
            s = "contact_us";
        }
        hashMap.put("choose_type", s);
        LIZIZ("guest_connection_underage_popup", hashMap, "click");
    }
    
    public static void LIZ(final boolean b, final String s) {
        final HashMap hashMap = new HashMap();
        hashMap.put("is_open", String.valueOf((int)(b ? 1 : 0)));
        hashMap.put("enter_from", s);
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null) {
            hashMap.put("room_id", room.getIdStr());
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
        }
        LIZ("anchor_connection_recommend_open", hashMap);
    }
    
    public static boolean LIZ(final 0kf 0kf) {
        return 0kf == 0kf.WEEKLY_RANK_INVITE || 0kf == 0kf.HOURLY_RANK_INVITE || 0kf == 0kf.WEEKLY_RISING_INVITE || 0kf == 0kf.WEEKLY_ROOKIE_INVITE || 0kf == 0kf.DAILY_RANK_INVITE;
    }
    
    public static String LIZIZ() {
        final boolean liz = 0k7.LIZ(0jR.LIZ(IInteractService.class).getCurrentLinkMode(), 2);
        final boolean inMultiGuest = 0jR.LIZ(IInteractService.class).isInMultiGuest();
        if (!liz) {
            return "guest_close";
        }
        if (inMultiGuest) {
            return "guest";
        }
        return "guest_open";
    }
    
    public static void LIZIZ(final int n) {
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_add_birth_popup_window_show");
        liz.LIZ("request_page", LIZLLL(n));
        liz.LIZ();
        liz.LIZLLL();
    }
    
    public static void LIZIZ(final String s) {
        final HashMap hashMap = new HashMap();
        hashMap.put("request_page", s);
        LIZIZ("guest_connection", hashMap, "show");
    }
    
    public static void LIZIZ(final String s, final Map<String, String> map, final String s2) {
        final Gkn liz = Gkn.LJFF.LIZ(s);
        liz.LIZ();
        liz.LIZ((Map)map);
        liz.LJI(s2);
        liz.LIZLLL();
    }
    
    public static void LIZIZ(final Map<String, String> map) {
        if (DataChannelGlobal.LIZJ.LIZIZ((Class)HPq.class) == H6J.SHOW) {
            map.put("event_page", "live_extended_comment_filed");
        }
    }
    
    public static void LIZJ() {
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_guest_linkmic_ban");
        liz.LIZ();
        liz.LIZLLL("show");
        String s;
        if (GTi.LIZ(DataChannelGlobal.LIZJ)) {
            s = "anchor";
        }
        else {
            s = "guest";
        }
        liz.LIZ("user_type", s);
        liz.LIZLLL();
    }
    
    public static void LIZJ(final int n) {
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_add_birth_popup_window_click");
        liz.LIZ("request_page", LIZLLL(n));
        liz.LIZ("click_type", "cancel");
        liz.LIZ();
        liz.LIZLLL();
    }
    
    public static void LIZJ(final String s) {
        try {
            final JSONObject jsonObject = new JSONObject();
            jsonObject.put("log_name", (Object)"ttlive_multilive_multi_live_start");
            jsonObject.put("way", (Object)s);
            0ba.LIZ(4, "MultiLiveStart", jsonObject.toString());
        }
        catch (final JSONException ex) {
            0II.LIZ((Exception)ex);
        }
    }
    
    public static String LIZLLL(final int n) {
        if (n == 0) {
            return "multi_live_apply";
        }
        return "multi_live_accept";
    }
}

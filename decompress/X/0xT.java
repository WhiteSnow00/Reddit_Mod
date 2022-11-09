// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import java.util.LinkedHashMap;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import java.util.List;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import android.util.Pair;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.android.live.gift.IGiftService;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.n;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Map;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscribeGuestSubscriberSetting;
import java.util.HashMap;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;

public final class 0xt
{
    public static long LIZ;
    public static final 0xt LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static final HashSet<Long> LJ;
    
    static {
        Covode.recordClassIndex(10332);
        LIZIZ = new 0xt();
        LJ = new HashSet<Long>();
    }
    
    public static final void LIZ(final int n) {
        final HashMap hashMap = new HashMap();
        String value;
        if (SubscribeGuestSubscriberSetting.INSTANCE.getValue()) {
            value = String.valueOf(n);
        }
        else {
            value = "0";
        }
        hashMap.put("subscriber_cnt", value);
        final 0xt liziz = 0xt.LIZIZ;
        liziz.LIZIZ(hashMap);
        liziz.LIZ("livesdk_subscription_guest_connection_panel_show", hashMap);
    }
    
    public static final void LIZ(final long n, final int n2) {
        final HashMap hashMap = new HashMap();
        hashMap.put("user_id", String.valueOf(n));
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null) {
            hashMap.put("enter_from_merge", Fwf.LIZ.LIZ());
            hashMap.put("enter_method", Fwf.LIZ.LIZLLL());
            hashMap.put("action_type", Fwf.LIZ.LJFF());
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr;
            if ((idStr = room.getIdStr()) == null) {
                idStr = "";
            }
            hashMap.put("room_id", idStr);
            hashMap.put("connected_guest_cnt", String.valueOf(n2));
            final User owner = room.getOwner();
            n.LIZIZ((Object)owner, "");
            final FollowInfo followInfo = owner.getFollowInfo();
            n.LIZIZ((Object)followInfo, "");
            hashMap.put("anchor_relationship", String.valueOf(followInfo.getFollowStatus()));
            0xt.LIZIZ.LIZ("livesdk_guest_refused_connection_show", hashMap);
        }
    }
    
    public static final void LIZ(final 0k8 0k8, String liziz) {
        CTM.LIZ((Object)liziz);
        final HashMap hashMap = new HashMap();
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null) {
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr;
            if ((idStr = room.getIdStr()) == null) {
                idStr = "";
            }
            hashMap.put("room_id", idStr);
            hashMap.put("enter_method", Fwf.LIZ.LIZLLL());
            hashMap.put("enter_from_merge", Fwf.LIZ.LIZ());
            hashMap.put("action_type", Fwf.LIZ.LJFF());
            final User owner = room.getOwner();
            n.LIZIZ((Object)owner, "");
            final FollowInfo followInfo = owner.getFollowInfo();
            n.LIZIZ((Object)followInfo, "");
            hashMap.put("anchor_relationship", String.valueOf(followInfo.getFollowStatus()));
            hashMap.put("layout_setting", 0uW.LIZJ.LIZ(0k8).getFirst());
            hashMap.put("window_setting", 0uW.LIZJ.LIZ(0k8).getSecond());
            hashMap.put("withdraw_action_type", liziz);
            final String liziz2 = 0xy.LIZIZ;
            if (liziz2 != null && liziz2.length() != 0) {
                liziz = 0xy.LIZIZ;
                String s;
                if ((s = liziz) == null) {
                    s = "";
                }
                n.LIZIZ((Object)s, "");
                hashMap.put("request_page", s);
            }
            0xt.LIZIZ.LIZ("livesdk_guest_connection_apply_withdraw", hashMap);
        }
    }
    
    public static final void LIZ(final a a) {
        CTM.LIZ((Object)a);
        final long ljiilliil = 0n9.LIZ.LJIILLIIL;
        if (ljiilliil > 0L) {
            final HashSet<Long> lj = 0xt.LJ;
            if (!lj.contains(0n9.LIZ.LJ())) {
                lj.add(0n9.LIZ.LJ());
                final HashMap hashMap = new HashMap();
                final 0xt liziz = 0xt.LIZIZ;
                liziz.LIZIZ(hashMap);
                liziz.LIZLLL(hashMap);
                liziz.LIZ(true, false, hashMap);
                hashMap.put("over_type", a.getType());
                hashMap.put("right_user_id", String.valueOf(1NN.LLFF.LIZ().LJFF));
                hashMap.put("connection_time", String.valueOf((System.currentTimeMillis() - ljiilliil) / 1000L));
                0xg.LIZ(hashMap, 1NN.LLFF.LIZ().LJIILL, false);
                final boolean ljjjz = 1NN.LLFF.LIZ().LJJJZ;
                final String s = "1";
                if (ljjjz) {
                    hashMap.put("is_live_end", "1");
                }
                if (!TextUtils.isEmpty((CharSequence)1NN.LLFF.LIZ().LJL)) {
                    final String ljl = 1NN.LLFF.LIZ().LJL;
                    if (ljl == null) {
                        n.LIZIZ();
                    }
                    hashMap.put("request_from", ljl);
                }
                String s2;
                if (0n9.LIZ.LIZLLL) {
                    s2 = "inviter";
                }
                else {
                    s2 = "invitee";
                }
                hashMap.put("anchor_type", s2);
                final GIK liziz2 = Fk2.LIZ().LIZIZ();
                n.LIZIZ((Object)liziz2, "");
                final long lizj = liziz2.LIZJ();
                if (0n9.LIZ.LIZLLL) {
                    final Long n = 0n9.LIZ.LJIJJLI.get(lizj);
                    String value;
                    if (n == null || (value = String.valueOf((long)n)) == null) {
                        value = "0";
                    }
                    hashMap.put("inviter_pk_score", value);
                    final Long n2 = 0n9.LIZ.LJIJJLI.get(1NN.LLFF.LIZ().LJFF);
                    String value2;
                    if (n2 == null || (value2 = String.valueOf((long)n2)) == null) {
                        value2 = "0";
                    }
                    hashMap.put("invitee_pk_score", value2);
                    String s3;
                    if (1NN.LLFF.LIZ().LJIILLIIL == 0kP.RANDOM_LINK_MIC_RECOMMEND) {
                        s3 = "1";
                    }
                    else {
                        s3 = "0";
                    }
                    hashMap.put("is_quick_recommend", s3);
                }
                else {
                    final Long n3 = 0n9.LIZ.LJIJJLI.get(lizj);
                    String value3;
                    if (n3 == null || (value3 = String.valueOf((long)n3)) == null) {
                        value3 = "0";
                    }
                    hashMap.put("invitee_pk_score", value3);
                    final Long n4 = 0n9.LIZ.LJIJJLI.get(1NN.LLFF.LIZ().LJFF);
                    String value4;
                    if (n4 == null || (value4 = String.valueOf((long)n4)) == null) {
                        value4 = "0";
                    }
                    hashMap.put("inviter_pk_score", value4);
                    String s4;
                    if (1NN.LLFF.LIZ().LJIILL == 0kf.RANDOM_LINK_MIC_RECOMMEND) {
                        s4 = "1";
                    }
                    else {
                        s4 = "0";
                    }
                    hashMap.put("is_quick_recommend", s4);
                }
                final BattleComboInfo ljff = 0n9.LIZ.LJFF;
                if (ljff != null) {
                    hashMap.put("win_status", String.valueOf(ljff.LIZJ));
                }
                hashMap.put("oncemore_type", 0n9.LJIIIIZZ.LIZJ());
                final IGiftService giftService = 0jR.LIZ(IGiftService.class);
                if (giftService != null && giftService.isGuestMatchAnchorGiftTrayEnable() && !Ghp.LIZ(GlobalContext.getApplicationContext())) {
                    final Pair<Integer, Integer> showedAndUnShowedGuestGiftCount = giftService.getShowedAndUnShowedGuestGiftCount();
                    String value5 = null;
                    Label_0568: {
                        if (showedAndUnShowedGuestGiftCount != null) {
                            final Integer n5 = (Integer)showedAndUnShowedGuestGiftCount.first;
                            if (n5 != null && (value5 = String.valueOf((int)n5)) != null) {
                                break Label_0568;
                            }
                        }
                        value5 = "0";
                    }
                    hashMap.put("opposite_showed_gift_tray", value5);
                    final Pair<Integer, Integer> showedAndUnShowedGuestGiftCount2 = giftService.getShowedAndUnShowedGuestGiftCount();
                    String value6 = null;
                    Label_0624: {
                        if (showedAndUnShowedGuestGiftCount2 != null) {
                            final Integer n6 = (Integer)showedAndUnShowedGuestGiftCount2.second;
                            if (n6 != null && (value6 = String.valueOf((int)n6)) != null) {
                                break Label_0624;
                            }
                        }
                        value6 = "0";
                    }
                    hashMap.put("opposite_unshowed_gift_tray", value6);
                }
                0xg.LIZ(hashMap);
                String s5;
                if (0n9.LIZ.LJJIJIIJIL) {
                    s5 = s;
                }
                else {
                    s5 = "0";
                }
                hashMap.put("is_punish_activity", s5);
                if (0n9.LIZ.LJJIJIIJIL) {
                    String s6;
                    if (0n9.LIZ.LJJIJIIJI) {
                        s6 = "open";
                    }
                    else {
                        s6 = "close";
                    }
                    hashMap.put("punish_activity_status", s6);
                }
                hashMap.put("relation_type", String.valueOf(1NN.LLFF.LIZ().LJLL));
                liziz.LIZ("livesdk_pk_end", hashMap);
            }
        }
    }
    
    public static final void LIZ(final d d, final boolean b, final LinkMicBattleMessage linkMicBattleMessage) {
        CTM.LIZ((Object)d);
        final HashMap hashMap = new HashMap();
        final 0xt liziz = 0xt.LIZIZ;
        liziz.LIZIZ(hashMap);
        liziz.LIZLLL(hashMap);
        hashMap.put("connection_type", d.getType());
        if (d == 0xt.d.MANUAL_PK) {
            final String s = "0";
            String s2;
            if (b) {
                s2 = "1";
            }
            else {
                s2 = "0";
            }
            hashMap.put("is_oncemore", s2);
            String value = s;
            if (linkMicBattleMessage != null) {
                value = String.valueOf(linkMicBattleMessage.LIZ);
                if (value == null) {
                    value = s;
                }
            }
            hashMap.put("pk_id", value);
        }
        if (b) {
            hashMap.put("oncemore_type", 0n9.LJIIIIZZ.LIZJ());
        }
        0xg.LIZ(hashMap, 1NN.LLFF.LIZ().LJIILL, false);
        liziz.LIZJ(hashMap);
        liziz.LIZ("livesdk_connection_invited_received", hashMap);
    }
    
    public static final void LIZ(final String s, final long n) {
        final HashMap hashMap = new HashMap();
        final 0xt liziz = 0xt.LIZIZ;
        liziz.LIZIZ(hashMap);
        hashMap.put("request_page", s);
        hashMap.put("anchor_relationship", String.valueOf(n));
        liziz.LIZ("livesdk_guest_connection_icon_click", hashMap);
    }
    
    public static final void LIZIZ(final String s, final long n) {
        CTM.LIZ((Object)s);
        final HashMap hashMap = new HashMap();
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null) {
            String idStr;
            if ((idStr = room.getIdStr()) == null) {
                idStr = "";
            }
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            hashMap.put("action_type", s);
            hashMap.put("anchor_relationship", String.valueOf(n));
            0xt.LIZIZ.LIZ("livesdk_anchor_refuse_guest_connection", hashMap);
        }
    }
    
    public static final void LIZIZ(final boolean b) {
        final Gnh gnh = new Gnh();
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room == null) {
            return;
        }
        if (!b) {
            final Gkn liz = Gkn.LJFF.LIZ("livesdk_connection_transform");
            liz.LJ("live_detail");
            liz.LIZJ("live");
            liz.LIZLLL("other");
            liz.LIZ(gnh);
            liz.LIZ();
            liz.LIZ("anchor_id", room.getOwnerUserId());
            liz.LIZ("room_id", room.getIdStr());
            liz.LIZ("channel_id", 1NN.LLFF.LIZ().LJ);
            liz.LIZ("opposite_anchor_id", 1NN.LLFF.LIZ().LJFF);
            final List liziz = Ey9.LIZIZ((Object[])new Long[] { room.getOwnerUserId(), 1NN.LLFF.LIZ().LJFF });
            liz.LIZ("is_multi", "0");
            liz.LIZ("current_connection_cnts", "2");
            liz.LIZ("uid_list", liziz.toString());
            liz.LIZLLL();
        }
    }
    
    public static final void LIZLLL(String s) {
        CTM.LIZ((Object)s);
        final HashMap hashMap = new HashMap();
        hashMap.put("action_type", "click");
        hashMap.put("invite_entrance", s);
        if (GGI.LIZJ()) {
            s = "1";
        }
        else {
            s = "0";
        }
        hashMap.put("is_subscriber_only_live", s);
        0uW.LIZ(0uW.LIZJ, hashMap);
        0xt.LIZIZ.LIZ("livesdk_anchor_guest_connection_entrance_click", hashMap);
    }
    
    public static final void LJ(final String s) {
        CTM.LIZ((Object)s);
        final HashMap hashMap = new HashMap();
        final 0xt liziz = 0xt.LIZIZ;
        liziz.LIZIZ(hashMap);
        hashMap.put("open_method", s);
        liziz.LIZ("livesdk_anchor_guest_connection_open", hashMap);
    }
    
    public static final void LJFF(final String s) {
        CTM.LIZ((Object)s);
        final HashMap hashMap = new HashMap();
        final 0xt liziz = 0xt.LIZIZ;
        liziz.LIZIZ(hashMap);
        hashMap.put("end_reason", s);
        liziz.LIZ("livesdk_anchor_guest_connection_close", hashMap);
    }
    
    public final void LIZ() {
        final HashMap hashMap = new HashMap();
        this.LIZIZ(hashMap);
        hashMap.put("invitee_list", 0xg.LIZ(1NN.LLFF.LIZ().LJIILL));
        0xg.LIZ(hashMap);
        this.LIZ("livesdk_pk_icon_click", hashMap);
    }
    
    public final void LIZ(final c c, final boolean b, final String s) {
        CTM.LIZ((Object)c, (Object)s);
        final GIK liziz = Fk2.LIZ().LIZIZ();
        n.LIZIZ((Object)liziz, "");
        final long lizj = liziz.LIZJ();
        final HashMap hashMap = new HashMap();
        this.LIZIZ(hashMap);
        this.LIZLLL(hashMap);
        hashMap.put("request_from", c.getValue());
        0xg.LIZ(hashMap, 1NN.LLFF.LIZ().LJIILL, false);
        final String s2 = "1";
        String s3;
        if (b) {
            s3 = "1";
        }
        else {
            s3 = "0";
        }
        hashMap.put("is_effective", s3);
        hashMap.put("channel_id", String.valueOf(1NN.LLFF.LIZ().LJ));
        hashMap.put("pk_inviter_id", String.valueOf(lizj));
        hashMap.put("pk_invitee_id", String.valueOf(1NN.LLFF.LIZ().LJFF));
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null) {
            final RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
            n.LIZIZ((Object)roomAuthStatus, "");
            String s4;
            if (roomAuthStatus.isEnableGift()) {
                s4 = s2;
            }
            else {
                s4 = "0";
            }
            hashMap.put("is_from_gift_permission", s4);
        }
        hashMap.put("click_reason", s);
        this.LIZ("livesdk_pk_click", hashMap);
    }
    
    public final void LIZ(final String s) {
        CTM.LIZ((Object)s);
        final HashMap hashMap = new HashMap();
        hashMap.put("invitee_list", 0xg.LIZ(1NN.LLFF.LIZ().LJIILL));
        String s2;
        if (1NN.LLFF.LIZ().LJIIZILJ) {
            s2 = "inviter";
        }
        else {
            s2 = "invitee";
        }
        hashMap.put("anchor_type", s2);
        String ljl;
        if ((ljl = 1NN.LLFF.LIZ().LJL) == null) {
            ljl = "";
        }
        hashMap.put("request_from", ljl);
        hashMap.put("time_stamp", String.valueOf(System.currentTimeMillis()));
        hashMap.put("pk_task_type", s);
        final GIK liziz = Fk2.LIZ().LIZIZ();
        if (liziz != null) {
            final 0W5 liz = liziz.LIZ();
            if (liz != null) {
                hashMap.put("user_id", String.valueOf(liz.getId()));
            }
        }
        this.LIZIZ(hashMap);
        this.LIZLLL(hashMap);
        this.LIZ(true, false, hashMap);
        this.LIZ(hashMap);
        this.LIZ("livesdk_pk_task_icon_click", hashMap);
    }
    
    public final void LIZ(final String s, final Map<String, String> map) {
        final Gkn liz = Gkn.LJFF.LIZ(s);
        liz.LIZ();
        liz.LIZ((Map)map);
        liz.LIZLLL();
    }
    
    public final void LIZ(final Map<String, String> map) {
        CTM.LIZ((Object)map);
        if (0jz.LIZLLL().isEnableSDK()) {
            final List<0pc> coHostLinkedUserList = 0jz.LIZLLL().getCoHostLinkedUserList();
            if (coHostLinkedUserList.size() > 2) {
                map.put("is_multi", "1");
                map.put("multi_type", "team_pk");
                map.put("team_id", String.valueOf(0n9.LIZ.LJJIIZI));
            }
            else {
                map.put("is_multi", "0");
                map.put("team_id", "0");
            }
            map.put("current_connection_cnts", String.valueOf(coHostLinkedUserList.size()));
            return;
        }
        map.put("is_multi", "0");
        map.put("current_connection_cnts", "2");
        map.put("team_id", "0");
    }
    
    public final void LIZ(final boolean b) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZ(true, b, linkedHashMap);
        this.LIZIZ(linkedHashMap);
        if (!TextUtils.isEmpty((CharSequence)1NN.LLFF.LIZ().LJL)) {
            final String ljl = 1NN.LLFF.LIZ().LJL;
            if (ljl == null) {
                n.LIZIZ();
            }
            linkedHashMap.put("request_from", ljl);
        }
        this.LIZLLL(linkedHashMap);
        this.LIZ("livesdk_pk_invite_withdraw", linkedHashMap);
    }
    
    public final void LIZ(final boolean b, final int n, final c c) {
        final HashMap hashMap = new HashMap();
        this.LIZIZ(hashMap);
        this.LIZLLL(hashMap);
        this.LIZ(true, b, hashMap);
        if (c != null) {
            hashMap.put("request_from", c.getValue());
        }
        hashMap.put("invitee_id", String.valueOf(1NN.LLFF.LIZ().LJFF));
        hashMap.put("invitee_status", String.valueOf(n));
        hashMap.put("time_stamp", String.valueOf(0xt.LIZJ = System.currentTimeMillis()));
        0xg.LIZ(hashMap, 1NN.LLFF.LIZ().LJIILL, false);
        0xg.LIZ(hashMap);
        hashMap.put("invitee_status", String.valueOf(n));
        if (b) {
            hashMap.put("oncemore_type", 0n9.LJIIIIZZ.LIZJ());
        }
        hashMap.put("relation_type", String.valueOf(1NN.LLFF.LIZ().LJLL));
        this.LIZ("livesdk_connection_invite", hashMap);
    }
    
    public final void LIZ(final boolean b, final BattleComboInfo battleComboInfo) {
        if (battleComboInfo == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        hashMap.put("connection_type", "manual_pk");
        final int n = 0xu.LIZ[1NN.LLFF.LIZ().LJIILL.ordinal()];
        int n2 = 2;
        String s;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    s = "none";
                }
                else {
                    s = "random_match";
                }
            }
            else {
                s = "recommend";
            }
        }
        else {
            s = "manual_follow";
        }
        hashMap.put("invitee_list", s);
        String s2;
        if (b) {
            s2 = "anchor";
        }
        else {
            s2 = "user";
        }
        hashMap.put("user_type", s2);
        hashMap.put("pk_id", String.valueOf(0n9.LIZ.LJ()));
        hashMap.put("channel_id", String.valueOf(1NN.LLFF.LIZ().LJ));
        if (room != null) {
            final String idStr = room.getIdStr();
            kotlin.jvm.internal.n.LIZIZ((Object)idStr, "");
            hashMap.put("room_id", idStr);
        }
        hashMap.put("win_status", String.valueOf(battleComboInfo.LIZJ));
        if (room != null) {
            if (battleComboInfo.LIZ == room.getOwnerUserId()) {
                n2 = 1;
            }
            hashMap.put("anchor_type", String.valueOf(n2));
        }
        this.LIZ("connection_win_click", hashMap);
    }
    
    public final void LIZ(final boolean b, final boolean b2) {
        final HashMap hashMap = new HashMap();
        String ljl;
        if ((ljl = 1NN.LLFF.LIZ().LJL) == null) {
            ljl = "";
        }
        hashMap.put("request_from", ljl);
        hashMap.put("invitee_list", 0xg.LIZ(1NN.LLFF.LIZ().LJIILL));
        String s;
        if (1NN.LLFF.LIZ().LJIIZILJ) {
            s = "inviter";
        }
        else {
            s = "invitee";
        }
        hashMap.put("anchor_type", s);
        this.LIZIZ(hashMap);
        this.LIZLLL(hashMap);
        this.LIZ(true, false, hashMap);
        String s2;
        if (b2) {
            s2 = "turn_on";
        }
        else {
            s2 = "close";
        }
        hashMap.put("status", s2);
        String s3;
        if (b) {
            s3 = "1";
        }
        else {
            s3 = "0";
        }
        hashMap.put("is_dont_show_again", s3);
        this.LIZ("livesdk_no_gift_reminder_click", hashMap);
    }
    
    public final void LIZ(final boolean b, final boolean b2, final long n) {
        final HashMap hashMap = new HashMap();
        this.LIZIZ(hashMap);
        this.LIZLLL(hashMap);
        this.LIZ(true, b, hashMap);
        hashMap.put("anchor_type", "invitee");
        hashMap.put("inviter_id", String.valueOf(1NN.LLFF.LIZ().LJFF));
        String s;
        if (b2) {
            s = "accept";
        }
        else {
            s = "reject";
        }
        hashMap.put("selection", s);
        0xg.LIZ(hashMap, 1NN.LLFF.LIZ().LJIILL, false);
        hashMap.put("time_stamp", String.valueOf(0xt.LIZLLL = System.currentTimeMillis()));
        if (1NN.LLFF.LIZ().LJJJIL.LIZIZ()) {
            final String liz = 1NN.LLFF.LIZ().LJJJIL.LIZ;
            n.LIZIZ((Object)liz, "");
            hashMap.put("rank_type", liz);
        }
        final String lizj = 1NN.LLFF.LIZ().LJJJIL.LIZJ();
        n.LIZIZ((Object)lizj, "");
        hashMap.put("is_ranking_opposite_anchor", lizj);
        hashMap.put("show_to_decide_dur", String.valueOf(0xt.LIZLLL - 0xt.LIZ));
        if (b) {
            hashMap.put("oncemore_type", 0n9.LJIIIIZZ.LIZJ());
        }
        hashMap.put("pk_id", String.valueOf(n));
        hashMap.put("relation_type", String.valueOf(1NN.LLFF.LIZ().LJLL));
        String s2;
        if (1NN.LLFF.LIZ().LJIILL == 0kf.RANDOM_LINK_MIC_RECOMMEND) {
            s2 = "1";
        }
        else {
            s2 = "0";
        }
        hashMap.put("is_quick_recommend", s2);
        0xg.LIZ(hashMap);
        this.LIZJ(hashMap);
        this.LIZ("livesdk_connection_invited", hashMap);
    }
    
    public final void LIZ(final boolean b, final boolean b2, final Map<String, String> map) {
        CTM.LIZ((Object)map);
        map.put("connection_type", "manual_pk");
        1Qk 1Qk;
        if (b2) {
            1Qk = 0n9.LIZIZ;
        }
        else {
            1Qk = 0n9.LIZ;
        }
        final Object o = null;
        Object value = null;
        String s;
        if (b) {
            final BattleSetting liziz = 1Qk.LIZIZ;
            if (liziz != null && liziz.LIZLLL > 0) {
                final BattleSetting liziz2 = 1Qk.LIZIZ;
                if (liziz2 != null) {
                    value = liziz2.LIZLLL;
                }
                s = String.valueOf(value);
            }
            else {
                s = String.valueOf(LiveInteractBattleDurationSetting.INSTANCE.getValue());
            }
        }
        else {
            final BattleSetting liziz3 = 1Qk.LIZIZ;
            Object value2 = o;
            if (liziz3 != null) {
                value2 = liziz3.LIZLLL;
            }
            s = String.valueOf(value2);
        }
        map.put("pk_time", s);
        if (b) {
            map.put("is_oncemore", String.valueOf((int)(1Qk.LIZJ ? 1 : 0)));
        }
        map.put("channel_id", String.valueOf(1NN.LLFF.LIZ().LJ));
        map.put("pk_id", String.valueOf(1Qk.LJ()));
    }
    
    public final void LIZIZ() {
        final HashMap hashMap = new HashMap();
        this.LIZIZ(hashMap);
        this.LIZ(false, false, hashMap);
        hashMap.put("right_user_id", String.valueOf(1NN.LLFF.LIZ().LJFF));
        this.LIZ("livesdk_pk_transform", hashMap);
    }
    
    public final void LIZIZ(final a a) {
        CTM.LIZ((Object)a);
        final long ljiizilj = 0n9.LIZ.LJIIZILJ;
        if (ljiizilj <= 0L) {
            return;
        }
        final HashMap hashMap = new HashMap();
        this.LIZIZ(hashMap);
        this.LIZ(true, false, hashMap);
        this.LIZLLL(hashMap);
        if (!TextUtils.isEmpty((CharSequence)1NN.LLFF.LIZ().LJL)) {
            final String ljl = 1NN.LLFF.LIZ().LJL;
            if (ljl == null) {
                n.LIZIZ();
            }
            hashMap.put("request_from", ljl);
        }
        hashMap.put("right_user_id", String.valueOf(1NN.LLFF.LIZ().LJFF));
        hashMap.put("over_type", a.getType());
        String s;
        if (0n9.LIZ.LIZLLL) {
            s = "inviter";
        }
        else {
            s = "invitee";
        }
        hashMap.put("anchor_type", s);
        hashMap.put("connection_time", String.valueOf((System.currentTimeMillis() - ljiizilj) / 1000L));
        0xg.LIZ(hashMap, 1NN.LLFF.LIZ().LJIILL, false);
        final boolean ljjjz = 1NN.LLFF.LIZ().LJJJZ;
        String s2 = "1";
        if (ljjjz) {
            hashMap.put("is_live_end", "1");
        }
        hashMap.put("oncemore_type", 0n9.LJIIIIZZ.LIZJ());
        if (!0n9.LIZ.LJJIJIIJIL) {
            s2 = "0";
        }
        hashMap.put("is_punish_activity", s2);
        if (0n9.LIZ.LJJIJIIJIL) {
            String s3;
            if (0n9.LIZ.LJJIJIIJI) {
                s3 = "open";
            }
            else {
                s3 = "close";
            }
            hashMap.put("punish_activity_status", s3);
        }
        this.LIZ("livesdk_punish_end", hashMap);
    }
    
    public final void LIZIZ(final String s) {
        CTM.LIZ((Object)s);
        final HashMap hashMap = new HashMap();
        this.LIZIZ(hashMap);
        this.LIZLLL(hashMap);
        this.LIZ(true, false, hashMap);
        String s2;
        if (0n9.LIZ.LIZLLL) {
            s2 = String.valueOf(1NN.LLFF.LIZ().LJFF);
        }
        else {
            final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
            if (room == null || (s2 = String.valueOf(room.getOwnerUserId())) == null) {
                s2 = "";
            }
        }
        hashMap.put("invitee_id", s2);
        0xg.LIZ(hashMap, 1NN.LLFF.LIZ().LJIILL, false);
        final long currentTimeMillis = System.currentTimeMillis();
        hashMap.put("time_stamp", String.valueOf(currentTimeMillis));
        if (0n9.LIZ.LIZLLL) {
            hashMap.put("invite_to_success_dur", String.valueOf(currentTimeMillis - 0xt.LIZJ));
        }
        String s3;
        if (0n9.LIZ.LIZLLL) {
            s3 = "inviter";
        }
        else {
            s3 = "invitee";
        }
        hashMap.put("anchor_type", s3);
        if (!TextUtils.isEmpty((CharSequence)1NN.LLFF.LIZ().LJL)) {
            final String ljl = 1NN.LLFF.LIZ().LJL;
            if (ljl == null) {
                n.LIZIZ();
            }
            hashMap.put("request_from", ljl);
        }
        hashMap.put("oncemore_type", 0n9.LJIIIIZZ.LIZJ());
        hashMap.put("relation_type", String.valueOf(1NN.LLFF.LIZ().LJLL));
        final boolean lizlll = 0n9.LIZ.LIZLLL;
        String s4 = "1";
        if (lizlll) {
            if (1NN.LLFF.LIZ().LJIILLIIL != 0kP.RANDOM_LINK_MIC_RECOMMEND) {
                s4 = "0";
            }
            hashMap.put("is_quick_recommend", s4);
        }
        else {
            if (1NN.LLFF.LIZ().LJIILL != 0kf.RANDOM_LINK_MIC_RECOMMEND) {
                s4 = "0";
            }
            hashMap.put("is_quick_recommend", s4);
        }
        0xg.LIZ(hashMap);
        this.LIZ(s, hashMap);
    }
    
    public final void LIZIZ(final Map<String, String> map) {
        CTM.LIZ((Object)map);
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            final String idStr = room.getIdStr();
            n.LIZIZ((Object)idStr, "");
            map.put("room_id", idStr);
            map.put("enter_method", Fwf.LIZ.LIZLLL());
            map.put("enter_from_merge", Fwf.LIZ.LIZ());
            map.put("action_type", Fwf.LIZ.LJFF());
            final String ljjijlij = 1NN.LLFF.LIZ().LJJIJLIJ;
            if (!TextUtils.isEmpty((CharSequence)ljjijlij)) {
                if (ljjijlij == null) {
                    n.LIZIZ();
                }
                map.put("request_id", ljjijlij);
            }
        }
    }
    
    public final void LIZIZ(final boolean b, final BattleComboInfo battleComboInfo) {
        if (battleComboInfo == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        hashMap.put("connection_type", "manual_pk");
        final int n = 0xu.LIZIZ[1NN.LLFF.LIZ().LJIILL.ordinal()];
        int n2 = 2;
        String s;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    s = "none";
                }
                else {
                    s = "random_match";
                }
            }
            else {
                s = "recommend";
            }
        }
        else {
            s = "manual_follow";
        }
        hashMap.put("invitee_list", s);
        String s2;
        if (b) {
            s2 = "anchor";
        }
        else {
            s2 = "user";
        }
        hashMap.put("user_type", s2);
        hashMap.put("pk_id", String.valueOf(0n9.LIZ.LJ()));
        hashMap.put("channel_id", String.valueOf(1NN.LLFF.LIZ().LJ));
        if (room != null) {
            final String idStr = room.getIdStr();
            kotlin.jvm.internal.n.LIZIZ((Object)idStr, "");
            hashMap.put("room_id", idStr);
        }
        hashMap.put("win_status", String.valueOf(battleComboInfo.LIZJ));
        if (room != null) {
            if (battleComboInfo.LIZ == room.getOwnerUserId()) {
                n2 = 1;
            }
            hashMap.put("anchor_type", String.valueOf(n2));
        }
        this.LIZ("livesdk_connection_win_show", hashMap);
    }
    
    public final void LIZJ() {
        final HashMap hashMap = new HashMap();
        this.LIZIZ(hashMap);
        this.LIZLLL(hashMap);
        this.LIZ(true, false, hashMap);
        final GIK liziz = Fk2.LIZ().LIZIZ();
        n.LIZIZ((Object)liziz, "");
        final long lizj = liziz.LIZJ();
        hashMap.put("right_user_id", String.valueOf(1NN.LLFF.LIZ().LJFF));
        0xg.LIZ(hashMap, 1NN.LLFF.LIZ().LJIILL, false);
        hashMap.put("connection_inviter_id", String.valueOf(lizj));
        hashMap.put("connection_invitee_id", String.valueOf(1NN.LLFF.LIZ().LJFF));
        hashMap.put("oncemore_type", 0n9.LJIIIIZZ.LIZJ());
        this.LIZ("livesdk_pk_oncemore_click", hashMap);
    }
    
    public final void LIZJ(final String s) {
        CTM.LIZ((Object)s);
        0ba.LIZ(4, "BattleWatchTAG", "logBattleWatchDuration, source = ".concat(String.valueOf(s)));
        final long ljiilliil = 0n9.LIZ.LJIILLIIL;
        if (ljiilliil <= 0L) {
            return;
        }
        final HashMap hashMap = new HashMap();
        this.LIZIZ(hashMap);
        this.LIZ(false, false, hashMap);
        hashMap.put("right_user_id", String.valueOf(1NN.LLFF.LIZ().LJFF));
        hashMap.put("watch_connection_duration", String.valueOf((System.currentTimeMillis() - ljiilliil) / 1000L));
        this.LIZ("livesdk_connection_watch_duration", hashMap);
    }
    
    public final void LIZJ(final Map<String, String> map) {
        if (DataChannelGlobal.LIZJ.LIZIZ((Class)HPq.class) == H6J.SHOW) {
            map.put("event_page", "live_extended_comment_filed");
        }
    }
    
    public final void LIZLLL() {
        final HashMap hashMap = new HashMap();
        this.LIZIZ(hashMap);
        this.LIZLLL(hashMap);
        hashMap.put("channel_id", String.valueOf(1NN.LLFF.LIZ().LJ));
        hashMap.put("connection_type", "manual_pk");
        hashMap.put("right_user_id", String.valueOf(1NN.LLFF.LIZ().LJFF));
        hashMap.put("invitee_list", 0xg.LIZ(1NN.LLFF.LIZ().LJIILL));
        hashMap.put("oncemore_type", 0n9.LJIIIIZZ.LIZJ());
        this.LIZ("livesdk_pk_oncemore_show", hashMap);
    }
    
    public final void LIZLLL(final Map<String, String> map) {
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        Long value;
        if (room != null) {
            value = room.getOwnerUserId();
        }
        else {
            value = null;
        }
        final GIK liziz = Fk2.LIZ().LIZIZ();
        n.LIZIZ((Object)liziz, "");
        final long lizj = liziz.LIZJ();
        if (value == null) {
            return;
        }
        if (value != lizj) {
            return;
        }
        if (1NN.LLFF.LIZ().LJIIZILJ) {
            map.put("connection_inviter_id", String.valueOf(lizj));
            map.put("connection_invitee_id", String.valueOf(1NN.LLFF.LIZ().LJFF));
        }
        else {
            map.put("connection_inviter_id", String.valueOf(1NN.LLFF.LIZ().LJFF));
            map.put("connection_invitee_id", String.valueOf(lizj));
        }
        if (0n9.LIZ.LIZLLL) {
            map.put("pk_inviter_id", String.valueOf(lizj));
            map.put("pk_invitee_id", String.valueOf(1NN.LLFF.LIZ().LJFF));
            return;
        }
        map.put("pk_inviter_id", String.valueOf(1NN.LLFF.LIZ().LJFF));
        map.put("pk_invitee_id", String.valueOf(lizj));
    }
    
    public enum a
    {
        NEGATIVE_OVER("negative_over"), 
        POSITIVE_OVER("positive_over"), 
        TIME_OUT("time_out");
        
        public final String LIZIZ;
        
        static {
            Covode.recordClassIndex(10333);
        }
        
        public a(final String liziz) {
            this.LIZIZ = liziz;
        }
        
        public final String getType() {
            return this.LIZIZ;
        }
    }
    
    public enum b
    {
        INVITE("invite"), 
        OVER_TIME("over_time"), 
        REJECT("reject"), 
        WITHDRAW("withdraw");
        
        public final String LIZIZ;
        
        static {
            Covode.recordClassIndex(10334);
        }
        
        public b(final String liziz) {
            this.LIZIZ = liziz;
        }
        
        public final String getValue() {
            return this.LIZIZ;
        }
    }
    
    public enum c
    {
        MULTI_PK_GUIDE("multi_pk_guide"), 
        PK_GUIDE("pk_guide"), 
        PK_ICON("pk_icon"), 
        PK_REMATCH("rematch");
        
        public final String LIZIZ;
        
        static {
            Covode.recordClassIndex(10335);
        }
        
        public c(final String liziz) {
            this.LIZIZ = liziz;
        }
        
        public final String getValue() {
            return this.LIZIZ;
        }
    }
    
    public enum d
    {
        ANCHOR("anchor"), 
        MANUAL_PK("manual_pk");
        
        public final String LIZIZ;
        
        static {
            Covode.recordClassIndex(10336);
        }
        
        public d(final String liziz) {
            this.LIZIZ = liziz;
        }
        
        public final String getType() {
            return this.LIZIZ;
        }
    }
}

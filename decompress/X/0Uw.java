// 
// Decompiled by Procyon v0.6.0
// 

package X;

import org.json.JSONObject;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import kotlin.jvm.internal.n;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.covode.number.Covode;

public final class 0uW
{
    public static 1Uo LIZ;
    public static String LIZIZ;
    public static final 0uW LIZJ;
    public static 0k8 LIZLLL;
    public static long LJ;
    public static 0k8 LJFF;
    public static long LJI;
    public static String LJII;
    
    static {
        Covode.recordClassIndex(9505);
        LIZJ = new 0uW();
        0uW.LIZLLL = 0k8.NORMAL;
        0uW.LJFF = 0k8.NORMAL;
        0uW.LJII = "";
        0uW.LIZIZ = "go_live_panel";
    }
    
    private final String LIZ(final Integer n) {
        if (n != null) {
            if (n == 1 || n == 3) {
                return "video";
            }
            if (n == 2) {
                return "audio";
            }
            n.intValue();
        }
        return "no_permission";
    }
    
    public static /* synthetic */ void LIZ(final 0uW 0uW, final Map map) {
        0uW.LIZ(map, 0uW.LIZIZ());
    }
    
    private void LIZ(final String s, final Integer n) {
        CTM.LIZ((Object)s);
        final HashMap hashMap = new HashMap();
        this.LIZ(hashMap);
        hashMap.put("trigger", s);
        final 0k8 liziz = this.LIZIZ();
        if (liziz != null) {
            0uW.LJFF = liziz;
        }
        hashMap.put("layout_setting", this.LIZ(liziz).getFirst());
        hashMap.put("window_setting", this.LIZ(liziz).getSecond());
        if (n != null) {
            hashMap.put("guest_cnt", String.valueOf(n.intValue()));
        }
        this.LIZ("livesdk_multilive_mode_connection_start", hashMap);
        0uW.LJI = System.currentTimeMillis();
        this.LIZ(s, liziz);
    }
    
    private void LIZ(String s, final Long n, final String s2) {
        CTM.LIZ((Object)s, (Object)s2);
        final HashMap hashMap = new HashMap();
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        final String s3 = "";
        if (room != null) {
            final String idStr = room.getIdStr();
            n.LIZIZ((Object)idStr, "");
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            final GIK liziz = Fk2.LIZ().LIZIZ();
            n.LIZIZ((Object)liziz, "");
            hashMap.put("guest_id", String.valueOf(liziz.LIZJ()));
        }
        String s4;
        if (n.LIZ((Object)Fwf.LIZ.LIZLLL(), (Object)"portal")) {
            s4 = "1";
        }
        else {
            s4 = "0";
        }
        hashMap.put("is_portal_user", s4);
        if (n.LIZ((Object)Fwf.LIZ.LIZLLL(), (Object)"portal")) {
            hashMap.put("portal_id", String.valueOf(Fwf.LIZ.LJ()));
        }
        hashMap.put("request_page", s);
        hashMap.put("click_user_position", s2);
        final IInteractService liz = 0jR.LIZ(IInteractService.class);
        n.LIZIZ((Object)liz, "");
        s = liz.getConnectionType();
        n.LIZIZ((Object)s, "");
        hashMap.put("connection_type", s);
        s = s3;
        if (n != null) {
            s = String.valueOf((long)n);
            if (s == null) {
                s = s3;
            }
        }
        hashMap.put("to_user_id", s);
        LIZ(this, hashMap);
        this.LIZ(hashMap);
        this.LIZ("livesdk_follow", hashMap);
    }
    
    private final 8si<String, String> LIZIZ(final a a) {
        final 1Uo liz = 0uW.LIZ;
        MultiLiveAnchorPanelSettings ljff;
        if (liz != null) {
            ljff = liz.LJFF;
        }
        else {
            ljff = null;
        }
        final int n = 0uX.LIZIZ[a.ordinal()];
        if (n == 1) {
            if (ljff != null) {
                if (ljff.LIZJ == 3 && ljff.LIZLLL == 4) {
                    return (8si<String, String>)8sj.LIZ((Object)"off", (Object)"on");
                }
                if (ljff.LIZJ == 3 && ljff.LIZLLL == 3) {
                    return (8si<String, String>)8sj.LIZ((Object)"on", (Object)"on");
                }
                if (ljff.LIZJ == 4 && ljff.LIZLLL == 4) {
                    return (8si<String, String>)8sj.LIZ((Object)"off", (Object)"off");
                }
            }
            return (8si<String, String>)8sj.LIZ((Object)"err", (Object)"err");
        }
        if (n == 2) {
            return this.LIZLLL();
        }
        if (n == 3) {
            return (8si<String, String>)8sj.LIZ((Object)"off", (Object)"off");
        }
        throw new 5e3();
    }
    
    private final 8si<String, String> LIZLLL() {
        final 1Uo liz = 0uW.LIZ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        if (liz == null || (multiLiveAnchorPanelSettings = liz.LJFF) == null) {
            multiLiveAnchorPanelSettings = GCe.LIZ().LJJII;
        }
        if (multiLiveAnchorPanelSettings != null) {
            if (multiLiveAnchorPanelSettings.LIZJ == 3 && multiLiveAnchorPanelSettings.LIZLLL == 4) {
                return (8si<String, String>)8sj.LIZ((Object)"on", (Object)"on");
            }
            if (multiLiveAnchorPanelSettings.LIZJ == 3 && multiLiveAnchorPanelSettings.LIZLLL == 3) {
                return (8si<String, String>)8sj.LIZ((Object)"off", (Object)"on");
            }
            if (multiLiveAnchorPanelSettings.LIZJ == 4 && multiLiveAnchorPanelSettings.LIZLLL == 4) {
                return (8si<String, String>)8sj.LIZ((Object)"on", (Object)"on");
            }
        }
        return (8si<String, String>)8sj.LIZ((Object)"err", (Object)"err");
    }
    
    public final 8si<String, String> LIZ(final 0k8 0k8) {
        if (0k8 != null) {
            final int n = 0uX.LIZ[0k8.ordinal()];
            if (n == 1) {
                return (8si<String, String>)8sj.LIZ((Object)"floating", (Object)"fixed");
            }
            if (n == 2) {
                return (8si<String, String>)8sj.LIZ((Object)"floating", (Object)"unfixed");
            }
            if (n == 3) {
                return (8si<String, String>)8sj.LIZ((Object)"grid", (Object)"fixed");
            }
            if (n == 4) {
                return (8si<String, String>)8sj.LIZ((Object)"grid", (Object)"unfixed");
            }
        }
        return (8si<String, String>)8sj.LIZ((Object)"normal_floating", (Object)"not_existed");
    }
    
    public final String LIZ(final Room room, final boolean b) {
        if (!b) {
            final 1Uo liz = 0uW.LIZ;
            Integer value;
            if (liz != null) {
                value = liz.LJJIFFI;
            }
            else {
                value = null;
            }
            return this.LIZ(value);
        }
        long liz2;
        if (room != null) {
            liz2 = 0sK.LJ.LIZ(room);
        }
        else {
            liz2 = 0L;
        }
        return this.LIZ(Integer.valueOf((int)liz2));
    }
    
    public final String LIZ(final boolean b) {
        String s;
        if (b) {
            s = 0uW.LJII;
        }
        else {
            s = 0xy.LIZIZ;
        }
        String s2 = s;
        if (s == null) {
            s2 = "";
        }
        return s2;
    }
    
    public final String LIZ(final String[] array) {
        if (Qsj.LIZJ((Object[])array, (Object)"android.permission.RECORD_AUDIO") && Qsj.LIZJ((Object[])array, (Object)"android.permission.CAMERA")) {
            return "all";
        }
        if (Qsj.LIZJ((Object[])array, (Object)"android.permission.CAMERA") && !Qsj.LIZJ((Object[])array, (Object)"android.permission.RECORD_AUDIO")) {
            return "video";
        }
        if (!Qsj.LIZJ((Object[])array, (Object)"android.permission.CAMERA") && Qsj.LIZJ((Object[])array, (Object)"android.permission.RECORD_AUDIO")) {
            return "audio";
        }
        return "none";
    }
    
    public final void LIZ(final int n) {
        final HashMap hashMap = new HashMap();
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null) {
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            final String idStr = room.getIdStr();
            n.LIZIZ((Object)idStr, "");
            hashMap.put("room_id", idStr);
        }
        hashMap.put("friend_cnt", String.valueOf(n));
        this.LIZ("livesdk_anchor_guest_connection_friends_list_invite_list_show", hashMap);
    }
    
    public final void LIZ(final a a) {
        CTM.LIZ((Object)a);
        final HashMap hashMap = new HashMap();
        this.LIZ(hashMap);
        hashMap.put("connection_type", "guest");
        hashMap.put("trigger", a.getValue());
        hashMap.put("guest_mode_status", this.LIZIZ(a).getSecond());
        hashMap.put("switch_to", this.LIZIZ(a).getFirst());
        final IInteractService liz = 0jR.LIZ(IInteractService.class);
        n.LIZIZ((Object)liz, "");
        hashMap.put("guest_cnt", String.valueOf(liz.getLinkedGuestNum()));
        hashMap.put("layout_setting", this.LIZ(this.LIZIZ()).getFirst());
        hashMap.put("window_setting", this.LIZ(this.LIZIZ()).getSecond());
        this.LIZ("livesdk_permissionsettiings_followers_only_on_and_off", hashMap);
    }
    
    public final void LIZ(final LinkPlayerInfo linkPlayerInfo, String s, final int n, final List<String> list, final List<String> list2) {
        CTM.LIZ((Object)linkPlayerInfo, (Object)s);
        final HashMap hashMap = new HashMap();
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null) {
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            final String idStr = room.getIdStr();
            n.LIZIZ((Object)idStr, "");
            hashMap.put("room_id", idStr);
        }
        final User lizj = linkPlayerInfo.LIZJ;
        n.LIZIZ((Object)lizj, "");
        final String idStr2 = lizj.getIdStr();
        n.LIZIZ((Object)idStr2, "");
        hashMap.put("guest_id", idStr2);
        final User lizj2 = linkPlayerInfo.LIZJ;
        n.LIZIZ((Object)lizj2, "");
        final FollowInfo followInfo = lizj2.getFollowInfo();
        n.LIZIZ((Object)followInfo, "");
        final long followStatus = followInfo.getFollowStatus();
        String s2 = "1";
        String s4 = null;
        Label_0184: {
            String s3 = null;
            Label_0172: {
                if (followStatus != 0L && followStatus != 1L) {
                    if (followStatus == 2L) {
                        s3 = s2;
                        break Label_0172;
                    }
                    if (followStatus == 3L) {
                        s4 = "0";
                        break Label_0184;
                    }
                }
                s3 = "0";
            }
            final String s5 = s3;
            s2 = s3;
            s4 = s5;
        }
        hashMap.put("is_fans", s2);
        hashMap.put("is_mutal", s4);
        hashMap.put("status", s);
        hashMap.put("rank", String.valueOf(n));
        s = 0b8.a.LIZJ.LIZIZ((Object)list2);
        n.LIZIZ((Object)s, "");
        hashMap.put("tag_list", s);
        s = 0b8.a.LIZJ.LIZIZ((Object)list);
        n.LIZIZ((Object)s, "");
        hashMap.put("show_tag_list", s);
        final 0uF liz = 0uF.LIZ;
        final User lizj3 = linkPlayerInfo.LIZJ;
        n.LIZIZ((Object)lizj3, "");
        hashMap.put("multi_request_id", liz.LIZIZ(lizj3.getId()));
        if (list != null) {
            hashMap.put("tag_show_cnt", String.valueOf(list.size()));
        }
        else {
            hashMap.put("tag_show_cnt", "0");
        }
        this.LIZ("livesdk_anchor_guest_connection_viewers_list_invite_show", hashMap);
    }
    
    public final void LIZ(final LiveEffect liveEffect, final long n, final boolean b, final boolean b2, final boolean b3, final String s, final long n2) {
        CTM.LIZ((Object)s);
        final HashMap hashMap = new HashMap();
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null) {
            final String idStr = room.getIdStr();
            n.LIZIZ((Object)idStr, "");
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            final GIK liziz = Fk2.LIZ().LIZIZ();
            n.LIZIZ((Object)liziz, "");
            hashMap.put("guest_id", String.valueOf(liziz.LIZJ()));
        }
        long effectId;
        if (liveEffect != null) {
            effectId = liveEffect.effectId;
        }
        else {
            effectId = 0L;
        }
        hashMap.put("props_id", String.valueOf(effectId));
        hashMap.put("enhance_level", String.valueOf(n));
        hashMap.put("mic_status", String.valueOf((int)((b ^ true) ? 1 : 0)));
        hashMap.put("camera_status", String.valueOf((int)((b2 ^ true) ? 1 : 0)));
        String s2;
        if (b2) {
            s2 = "off";
        }
        else if (b3) {
            s2 = "rear";
        }
        else {
            s2 = "front";
        }
        hashMap.put("camera_type", s2);
        hashMap.put("close_way", s);
        hashMap.put("stay_duration", String.valueOf(n2));
        LIZ(this, hashMap);
        this.LIZ("livesdk_guest_connection_setting_panel_close", hashMap);
    }
    
    public final void LIZ(final String ljii) {
        CTM.LIZ((Object)ljii);
        0uW.LJII = ljii;
    }
    
    public final void LIZ(final String s, final int n, final int n2, final String s2, final String s3, final boolean b) {
        CTM.LIZ((Object)s2, (Object)s3);
        final HashMap hashMap = new HashMap();
        this.LIZ(hashMap);
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null) {
            final String idStr = room.getIdStr();
            n.LIZIZ((Object)idStr, "");
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            final GIK liziz = Fk2.LIZ().LIZIZ();
            n.LIZIZ((Object)liziz, "");
            hashMap.put("guest_id", String.valueOf(liziz.LIZJ()));
        }
        String s4;
        if ((s4 = s) == null) {
            s4 = "guest_apply_anchor";
        }
        hashMap.put("guest_invite_type", s4);
        if (n != 0) {
            if (n != 1) {
                if (n == 2) {
                    hashMap.put("camera_status", "off");
                }
            }
            else {
                hashMap.put("camera_status", "on");
            }
        }
        else {
            hashMap.put("camera_status", "abnormal");
        }
        if (n2 != 1) {
            if (n2 == 2) {
                hashMap.put("mic_status", "off");
            }
        }
        else {
            hashMap.put("mic_status", "on");
        }
        hashMap.put("request_page", s2);
        hashMap.put("action_type", s3);
        LIZ(this, hashMap);
        if (b) {
            this.LIZ("livesdk_anchor_guest_camera_status_switch", hashMap);
            return;
        }
        this.LIZ("livesdk_anchor_guest_mic_status_switch", hashMap);
    }
    
    public final void LIZ(String s, final int n, final int n2, final String s2, final boolean b, final String s3) {
        CTM.LIZ((Object)s2);
        final HashMap hashMap = new HashMap();
        this.LIZ(hashMap);
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null) {
            final String idStr = room.getIdStr();
            n.LIZIZ((Object)idStr, "");
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            final GIK liziz = Fk2.LIZ().LIZIZ();
            n.LIZIZ((Object)liziz, "");
            hashMap.put("guest_id", String.valueOf(liziz.LIZJ()));
        }
        String s4;
        if ((s4 = s) == null) {
            s4 = "guest_apply_anchor";
        }
        hashMap.put("guest_invite_type", s4);
        if (n != 0) {
            if (n != 1) {
                if (n == 2) {
                    hashMap.put("camera_status", "off");
                }
            }
            else {
                hashMap.put("camera_status", "on");
            }
        }
        else {
            hashMap.put("camera_status", "abnormal");
        }
        if (n2 != 1) {
            if (n2 == 2) {
                hashMap.put("mic_status", "off");
            }
        }
        else {
            hashMap.put("mic_status", "on");
        }
        if (b) {
            hashMap.put("switch_type", "camera");
        }
        else {
            hashMap.put("switch_type", "mico");
        }
        s = s3;
        if (s3 == null) {
            s = "";
        }
        hashMap.put("windows_type", s);
        hashMap.put("action_type", s2);
        LIZ(this, hashMap);
        this.LIZ("livesdk_guest_connection_status_switch", hashMap);
    }
    
    public final void LIZ(String s, final int n, final boolean b, final String s2) {
        CTM.LIZ((Object)s2);
        final HashMap hashMap = new HashMap();
        this.LIZ(hashMap);
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null) {
            final String idStr = room.getIdStr();
            n.LIZIZ((Object)idStr, "");
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            final GIK liziz = Fk2.LIZ().LIZIZ();
            n.LIZIZ((Object)liziz, "");
            hashMap.put("guest_id", String.valueOf(liziz.LIZJ()));
        }
        String s3;
        if (s == null) {
            s3 = "";
        }
        else {
            final int hashCode = s.hashCode();
            if (hashCode != -1183699191) {
                if (hashCode != 93029230) {
                    s3 = s;
                }
                else {
                    s3 = s;
                    if (s.equals("apply")) {
                        s3 = "guest_apply_anchor";
                    }
                }
            }
            else {
                s3 = s;
                if (s.equals("invite")) {
                    s3 = "anchor_invite_guest";
                }
            }
        }
        hashMap.put("guest_invite_type", s3);
        if (n != 0) {
            if (n != 1) {
                if (n == 2) {
                    hashMap.put("guest_connection_type", "voice");
                }
            }
            else {
                hashMap.put("guest_connection_type", "video");
            }
        }
        else {
            hashMap.put("guest_connection_type", "video");
        }
        if (b) {
            s = "mute";
        }
        else {
            s = "unmute";
        }
        hashMap.put("switch_to", s);
        hashMap.put("setting_position", s2);
        LIZ(this, hashMap);
        this.LIZ("livesdk_guest_switch_mute_setting", hashMap);
    }
    
    public final void LIZ(final String s, final 0k8 0k8) {
        CTM.LIZ((Object)s);
        final 0k8 lizlll = 0uW.LIZLLL;
        if (0k8 == lizlll) {
            return;
        }
        if (lizlll != null) {
            this.LIZIZ(s, lizlll);
        }
        final HashMap hashMap = new HashMap();
        this.LIZ(hashMap);
        hashMap.put("trigger", s);
        final 0k8 liziz = this.LIZIZ();
        if (liziz != null) {
            0uW.LIZLLL = liziz;
        }
        hashMap.put("layout_setting", this.LIZ(liziz).getFirst());
        hashMap.put("window_setting", this.LIZ(liziz).getSecond());
        this.LIZ("livesdk_multilive_mode_watch_start", hashMap);
        0uW.LJ = System.currentTimeMillis();
    }
    
    public final void LIZ(final String s, final LiveEffect liveEffect, final long n, final boolean b, final boolean b2, final boolean b3, final String s2, final String s3, final long n2) {
        CTM.LIZ((Object)s2, (Object)s3);
        final HashMap hashMap = new HashMap();
        final String s4 = "";
        String s5;
        if (s == null) {
            s5 = "";
        }
        else {
            final int hashCode = s.hashCode();
            if ((hashCode == -1183699191) ? s.equals("invite") : (hashCode == 93029230 && s.equals("apply"))) {
                s5 = "guest_apply_anchor";
            }
            else {
                s5 = s;
            }
        }
        hashMap.put("guest_invite_type", s5);
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null) {
            final String idStr = room.getIdStr();
            n.LIZIZ((Object)idStr, "");
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            final GIK liziz = Fk2.LIZ().LIZIZ();
            n.LIZIZ((Object)liziz, "");
            hashMap.put("guest_id", String.valueOf(liziz.LIZJ()));
        }
        long effectId;
        if (liveEffect != null) {
            effectId = liveEffect.effectId;
        }
        else {
            effectId = 0L;
        }
        hashMap.put("props_id", String.valueOf(effectId));
        hashMap.put("enhance_level", String.valueOf(n));
        hashMap.put("mic_status", String.valueOf((int)((b ^ true) ? 1 : 0)));
        hashMap.put("camera_status", String.valueOf((int)((b2 ^ true) ? 1 : 0)));
        String s6;
        if (b2) {
            s6 = "off";
        }
        else if (b3) {
            s6 = "rear";
        }
        else {
            s6 = "front";
        }
        hashMap.put("camera_type", s6);
        hashMap.put("close_way", s2);
        hashMap.put("close_reason", s3);
        String s7;
        if (s == null) {
            s7 = "click_icon";
        }
        else {
            final int hashCode2 = s.hashCode();
            if (hashCode2 != -1183699191) {
                if (hashCode2 != 93029230) {
                    s7 = s4;
                }
                else {
                    s7 = s4;
                    if (s.equals("apply")) {
                        s7 = "accepted_apply";
                    }
                }
            }
            else {
                s7 = s4;
                if (s.equals("invite")) {
                    s7 = "receive_invitation";
                }
            }
        }
        hashMap.put("open_reason", s7);
        hashMap.put("stay_duration", String.valueOf(n2));
        LIZ(this, hashMap);
        this.LIZ("livesdk_guest_connection_preview_panel_close", hashMap);
    }
    
    public final void LIZ(final String s, final String s2) {
        CTM.LIZ((Object)s, (Object)s2);
        final HashMap hashMap = new HashMap();
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null) {
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            final String idStr = room.getIdStr();
            n.LIZIZ((Object)idStr, "");
            hashMap.put("room_id", idStr);
            final GIK liziz = Fk2.LIZ().LIZIZ();
            n.LIZIZ((Object)liziz, "");
            hashMap.put("guest_id", String.valueOf(liziz.LIZJ()));
        }
        hashMap.put("guest_invite_type", s);
        hashMap.put("connection_status", s2);
        LIZ(this, hashMap);
        this.LIZ("livesdk_guest_preview_page_show", hashMap);
    }
    
    public final void LIZ(final String s, final String s2, final int n) {
        CTM.LIZ((Object)s, (Object)s2);
        final HashMap hashMap = new HashMap();
        this.LIZ(hashMap);
        hashMap.put("connection_type", "guest");
        hashMap.put("switch_to", s);
        hashMap.put("way_of_switch", s2);
        hashMap.put("is_success", String.valueOf(n));
        this.LIZ("livesdk_camera_on_and_off", hashMap);
    }
    
    public final void LIZ(String s, final String s2, String s3, final LiveEffect liveEffect, final long n, final boolean b, final boolean b2, final boolean b3) {
        CTM.LIZ((Object)s2, (Object)s3);
        final HashMap hashMap = new HashMap();
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null) {
            final String idStr = room.getIdStr();
            n.LIZIZ((Object)idStr, "");
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            final GIK liziz = Fk2.LIZ().LIZIZ();
            n.LIZIZ((Object)liziz, "");
            hashMap.put("guest_id", String.valueOf(liziz.LIZJ()));
        }
        if (s != null) {
            final int hashCode = s.hashCode();
            if (hashCode != -1183699191) {
                if (hashCode != 93029230) {
                    if (hashCode == 1466857630) {
                        if (s.equals("join_direct")) {
                            hashMap.put("guest_invite_type", "guest_apply_anchor");
                        }
                    }
                }
                else if (s.equals("apply")) {
                    hashMap.put("guest_invite_type", "guest_apply_anchor");
                }
            }
            else if (s.equals("invite")) {
                hashMap.put("guest_invite_type", "anchor_invite_guest");
            }
        }
        hashMap.put("request_page", s2);
        if (b2) {
            s3 = "";
        }
        hashMap.put("tab", s3);
        long effectId;
        if (liveEffect != null) {
            effectId = liveEffect.effectId;
        }
        else {
            effectId = 0L;
        }
        hashMap.put("props_id", String.valueOf(effectId));
        hashMap.put("enhance_level", String.valueOf(n));
        hashMap.put("mic_status", String.valueOf((int)((b ^ true) ? 1 : 0)));
        hashMap.put("camera_status", String.valueOf((int)((b2 ^ true) ? 1 : 0)));
        if (b2) {
            s = "off";
        }
        else if (b3) {
            s = "rear";
        }
        else {
            s = "front";
        }
        hashMap.put("camera_type", s);
        LIZ(this, hashMap);
        this.LIZ("livesdk_guest_connection_setting_panel_show", hashMap);
    }
    
    public final void LIZ(String s, final String s2, final boolean b, final boolean b2) {
        CTM.LIZ((Object)s, (Object)s2);
        final HashMap hashMap = new HashMap();
        this.LIZ(hashMap);
        hashMap.put("connection_type", "guest");
        if (b2) {
            if (b) {
                s = "fixed";
            }
            else {
                s = "unfixed";
            }
        }
        hashMap.put("switch_to", s);
        hashMap.put("decision", s2);
        this.LIZ("livesdk_layoutwindowsettings_confirm", hashMap);
    }
    
    public final void LIZ(final String s, final Map<String, String> map) {
        final Gkn liz = Gkn.LJFF.LIZ(s);
        liz.LIZ();
        liz.LIZ((Map)map);
        liz.LIZLLL();
    }
    
    public final void LIZ(final Map<String, String> map) {
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            final String idStr = room.getIdStr();
            n.LIZIZ((Object)idStr, "");
            map.put("room_id", idStr);
            final GIK liziz = Fk2.LIZ().LIZIZ();
            n.LIZIZ((Object)liziz, "");
            map.put("user_id", String.valueOf(liziz.LIZJ()));
            map.put("enter_method", Fwf.LIZ.LIZLLL());
            map.put("enter_from_merge", Fwf.LIZ.LIZ());
            map.put("action_type", Fwf.LIZ.LJFF());
            final 0uW lizj = 0uW.LIZJ;
            final 0k8 liziz2 = lizj.LIZIZ();
            map.put("layout_setting", (String)lizj.LIZ(liziz2).getFirst());
            map.put("window_setting", (String)lizj.LIZ(liziz2).getSecond());
            final String requestId = room.getRequestId();
            if (requestId != null) {
                map.put("request_id", requestId);
            }
        }
        final 1Uo liz = 0uW.LIZ;
        int ljii;
        if (liz != null) {
            ljii = liz.LJII;
        }
        else {
            ljii = 0;
        }
        map.put("guest_cnt", String.valueOf(ljii));
    }
    
    public final void LIZ(final Map<String, String> map, final 0k8 0k8) {
        CTM.LIZ((Object)map);
        map.put("layout_setting", (String)this.LIZ(0k8).getFirst());
        map.put("window_setting", (String)this.LIZ(0k8).getSecond());
        final 1Uo liz = 0uW.LIZ;
        int ljii;
        if (liz != null) {
            ljii = liz.LJII;
        }
        else {
            ljii = 0;
        }
        map.put("guest_cnt", String.valueOf(ljii));
    }
    
    public final void LIZ(final boolean b, final String s, String idStr) {
        CTM.LIZ((Object)s);
        final HashMap hashMap = new HashMap();
        if (idStr != null) {
            final int hashCode = idStr.hashCode();
            if (hashCode != -1183699191) {
                if (hashCode != 93029230) {
                    if (hashCode == 1466857630) {
                        if (idStr.equals("join_direct")) {
                            hashMap.put("guest_invite_type", "guest_apply_anchor");
                        }
                    }
                }
                else if (idStr.equals("apply")) {
                    hashMap.put("guest_invite_type", "guest_apply_anchor");
                }
            }
            else if (idStr.equals("invite")) {
                hashMap.put("guest_invite_type", "anchor_invite_guest");
            }
        }
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null) {
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            idStr = room.getIdStr();
            n.LIZIZ((Object)idStr, "");
            hashMap.put("room_id", idStr);
            final GIK liziz = Fk2.LIZ().LIZIZ();
            n.LIZIZ((Object)liziz, "");
            hashMap.put("guest_id", String.valueOf(liziz.LIZJ()));
        }
        hashMap.put("connection_type", "guest");
        final String s2 = "on";
        if (b) {
            idStr = "on";
        }
        else {
            idStr = "off";
        }
        hashMap.put("switch_to", idStr);
        hashMap.put("way_of_switch", s);
        LIZ(this, hashMap);
        this.LIZ("livesdk_guest_camera_on_and_off", hashMap);
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("log_name", (Object)"ttlive_multilive_guest_switch_camera");
        if (b) {
            idStr = s2;
        }
        else {
            idStr = "off";
        }
        jsonObject.put("switch", (Object)idStr);
        jsonObject.put("way", (Object)s);
        0ba.LIZ(4, "MultiLiveGuestSwitchCamera", jsonObject.toString());
    }
    
    public final void LIZ(final boolean b, String s, final boolean b2) {
        if (s == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null) {
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            final String idStr = room.getIdStr();
            n.LIZIZ((Object)idStr, "");
            hashMap.put("room_id", idStr);
            String s2;
            if (b) {
                s2 = "click";
            }
            else {
                s2 = "show";
            }
            hashMap.put("action_type", s2);
            final int ljji = GCe.LIZ().LJJI;
            final String s3 = "1";
            String s4;
            if (ljji != 0) {
                s4 = "1";
            }
            else {
                s4 = "0";
            }
            hashMap.put("is_guest_connection", s4);
            hashMap.put("guest_cnt", String.valueOf(GCe.LIZ().LJJI));
            hashMap.put("user_id", s);
            if (b2) {
                s = s3;
            }
            else {
                s = "0";
            }
            hashMap.put("is_mutal", s);
            final 0uW lizj = 0uW.LIZJ;
            LIZ(lizj, hashMap);
            lizj.LIZ("livesdk_anchor_guest_connection_animation", hashMap);
        }
    }
    
    public final void LIZ(final boolean b, final String[] array, final String s) {
        CTM.LIZ((Object)array, (Object)s);
        final HashMap hashMap = new HashMap();
        this.LIZ(hashMap);
        hashMap.put("check_permission_scene", this.LIZ(b));
        hashMap.put("popup_type", "first_popup");
        hashMap.put("guest_permission", this.LIZ(null, false));
        hashMap.put("require_permission", this.LIZ(array));
        hashMap.put("click_type", s);
        this.LIZ("livesdk_guest_sys_permission_click", hashMap);
    }
    
    public final boolean LIZ() {
        final 1Uo liz = 0uW.LIZ;
        0k8 ljiill;
        if (liz != null) {
            ljiill = liz.LJIILL;
        }
        else {
            ljiill = null;
        }
        return ljiill == 0k8.GRID_FIX || ljiill == 0k8.FLOATING_FIX || ljiill == 0k8.GRID || ljiill == 0k8.FLOATING;
    }
    
    public final 0k8 LIZIZ() {
        if (0sD.LIZJ.LIZ().LIZLLL()) {
            return 0sD.LIZJ.LIZ().LJIIIIZZ();
        }
        final 1Uo liz = 0uW.LIZ;
        if (liz != null) {
            return liz.LJIILL;
        }
        return null;
    }
    
    public final void LIZIZ(final int n) {
        if (n <= 0) {
            return;
        }
        final HashMap hashMap = new HashMap();
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null) {
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            final String idStr = room.getIdStr();
            n.LIZIZ((Object)idStr, "");
            hashMap.put("room_id", idStr);
        }
        hashMap.put("viewer_cnt", String.valueOf(n));
        this.LIZ("livesdk_anchor_guest_connection_viewers_list_invite_list_show", hashMap);
    }
    
    public final void LIZIZ(final String s) {
        CTM.LIZ((Object)s);
        final HashMap hashMap = new HashMap();
        this.LIZ(hashMap);
        hashMap.put("connection_type", "guest");
        hashMap.put("way_of_open", s);
        this.LIZ("livesdk_layoutsettings_open", hashMap);
    }
    
    public final void LIZIZ(final String s, final 0k8 0k8) {
        CTM.LIZ((Object)s);
        if (0uW.LIZLLL == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        this.LIZ(hashMap);
        String s2 = s;
        if (n.LIZ((Object)s, (Object)"live_over") ^ true) {
            s2 = s;
            if (n.LIZ((Object)s, (Object)"manual_setting_switch") ^ true) {
                s2 = s;
                if (n.LIZ((Object)s, (Object)"connection_start") ^ true) {
                    s2 = "others";
                }
            }
        }
        hashMap.put("trigger", s2);
        0k8 lizlll;
        if ((lizlll = 0k8) == null) {
            lizlll = 0uW.LIZLLL;
        }
        0uW.LIZLLL = null;
        hashMap.put("layout_setting", this.LIZ(lizlll).getFirst());
        hashMap.put("window_setting", this.LIZ(lizlll).getSecond());
        hashMap.put("duration", String.valueOf(System.currentTimeMillis() - 0uW.LJ));
        this.LIZ("livesdk_multilive_mode_watch_duration", hashMap);
    }
    
    public final void LIZIZ(final String s, final String s2) {
        CTM.LIZ((Object)s, (Object)s2);
        final HashMap hashMap = new HashMap();
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null) {
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            final String idStr = room.getIdStr();
            n.LIZIZ((Object)idStr, "");
            hashMap.put("room_id", idStr);
        }
        hashMap.put("guest_id", s);
        hashMap.put("status", s2);
        this.LIZ("livesdk_anchor_guest_connection_friends_list_invite_show", hashMap);
    }
    
    public final void LIZJ() {
        final HashMap hashMap = new HashMap();
        this.LIZ(hashMap);
        int ljii = 0;
        hashMap.put("guest_permission", this.LIZ(null, false));
        String liziz;
        if ((liziz = 0xy.LIZIZ) == null) {
            liziz = "";
        }
        n.LIZIZ((Object)liziz, "");
        hashMap.put("request_page", liziz);
        final 1Uo liz = 0uW.LIZ;
        if (liz != null) {
            ljii = liz.LJII;
        }
        hashMap.put("connected_guest_cnt", String.valueOf(ljii));
        this.LIZ("livesdk_guest_application_panel_show", hashMap);
    }
    
    public final void LIZJ(final String s) {
        CTM.LIZ((Object)s);
        final HashMap hashMap = new HashMap();
        this.LIZ(hashMap);
        hashMap.put("connection_type", "guest");
        hashMap.put("switch_to", s);
        this.LIZ("livesdk_layoutwindowsettings_switch", hashMap);
    }
    
    public final void LIZJ(final String s, final String s2) {
        CTM.LIZ((Object)s, (Object)s2);
        final HashMap hashMap = new HashMap();
        this.LIZ(hashMap);
        final 1Uo liz = 0uW.LIZ;
        int n = 0;
        int ljii;
        if (liz != null) {
            ljii = liz.LJII;
        }
        else {
            ljii = 0;
        }
        hashMap.put("guest_cnt", String.valueOf(ljii));
        if (ljii > 0) {
            n = 1;
        }
        hashMap.put("is_guest_connection", String.valueOf(n));
        hashMap.put("switch_to", s);
        hashMap.put("action_type", s2);
        this.LIZ("livesdk_anchor_guest_connection_invite_list_switch", hashMap);
    }
    
    public final void LIZLLL(final String s) {
        CTM.LIZ((Object)s);
        if (0uW.LJFF == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        this.LIZ(hashMap);
        hashMap.put("trigger", s);
        final 0k8 ljff = 0uW.LJFF;
        0uW.LJFF = null;
        hashMap.put("layout_setting", this.LIZ(ljff).getFirst());
        hashMap.put("window_setting", this.LIZ(ljff).getSecond());
        hashMap.put("duration", String.valueOf(System.currentTimeMillis() - 0uW.LJI));
        this.LIZ("livesdk_multilive_mode_connection_duration", hashMap);
        if (ljff != 0uW.LIZLLL) {
            this.LIZIZ(s, ljff);
        }
    }
    
    public final void LIZLLL(final String s, final String s2) {
        CTM.LIZ((Object)s, (Object)s2);
        final HashMap hashMap = new HashMap();
        this.LIZ(hashMap);
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null) {
            final String idStr = room.getIdStr();
            n.LIZIZ((Object)idStr, "");
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            final GIK liziz = Fk2.LIZ().LIZIZ();
            n.LIZIZ((Object)liziz, "");
            hashMap.put("guest_id", String.valueOf(liziz.LIZJ()));
        }
        hashMap.put("initiator", s);
        hashMap.put("request_page", s2);
        LIZ(this, hashMap);
        this.LIZ("livesdk_guest_connection_click_disconnect", hashMap);
    }
    
    public final void LJ(final String s) {
        CTM.LIZ((Object)s);
        final HashMap hashMap = new HashMap();
        this.LIZ(hashMap);
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null) {
            final String idStr = room.getIdStr();
            n.LIZIZ((Object)idStr, "");
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            final GIK liziz = Fk2.LIZ().LIZIZ();
            n.LIZIZ((Object)liziz, "");
            hashMap.put("guest_id", String.valueOf(liziz.LIZJ()));
            hashMap.put("is_subscriber_only_live", String.valueOf(room.liveSubOnly));
        }
        hashMap.put("request_page", s);
        hashMap.put("guest_connected_cnt", String.valueOf(GCe.LIZ().LJJI));
        LIZ(this, hashMap);
        this.LIZ("livesdk_anchor_guest_connection_panel_show", hashMap);
    }
    
    public final void LJFF(final String liziz) {
        CTM.LIZ((Object)liziz);
        0uW.LIZIZ = liziz;
    }
    
    public enum a
    {
        CLOSE_MODE("close_mode"), 
        DEFAULT_MODE("default_mode"), 
        MANUAL_SETTING("manual_setting");
        
        public final String LIZIZ;
        
        static {
            Covode.recordClassIndex(9506);
        }
        
        public a(final String liziz) {
            this.LIZIZ = liziz;
        }
        
        public final String getValue() {
            return this.LIZIZ;
        }
    }
}

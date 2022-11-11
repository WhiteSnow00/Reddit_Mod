// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiLiveServerAutoJoinChannel;
import java.util.UUID;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.List;
import java.util.Iterator;
import java.util.HashMap;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import java.util.Map;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicPerfTeaReportSetting;
import org.json.JSONObject;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;

public final class 1ml extends 1d9
{
    public static long LIZ;
    public static boolean LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static long LJI;
    public static long LJII;
    public static final 1ml LJIIIIZZ;
    public static long LJIIIZ;
    public static long LJIIJ;
    public static long LJIIJJI;
    public static final 5DO LJIIL;
    
    static {
        Covode.recordClassIndex(10347);
        LJIIIIZZ = new 1ml();
        1ml.LIZ = System.currentTimeMillis();
        1ml.LJIIIZ = System.currentTimeMillis();
        1ml.LIZJ = System.currentTimeMillis();
        1ml.LIZLLL = System.currentTimeMillis();
        1ml.LJ = System.currentTimeMillis();
        1ml.LJFF = System.currentTimeMillis();
        1ml.LJI = System.currentTimeMillis();
        1ml.LJIIJ = System.currentTimeMillis();
        1ml.LJII = System.currentTimeMillis();
        1ml.LJIIJJI = System.currentTimeMillis();
        LJIIL = 3Os.LIZ((QgG)29O.LIZ);
    }
    
    public static final String LIZ(final String s, final 0k8 0k8, final boolean b) {
        CTM.LIZ((Object)s);
        String s2 = null;
        Label_0055: {
            switch (s.hashCode()) {
                case -2033363707: {
                    if (s.equals("leave_with_kicked_out")) {
                        s2 = "anchor_kick_out_guest";
                        break Label_0055;
                    }
                    break;
                }
                case -1331253956: {
                    if (s.equals("leave_normally")) {
                        s2 = "guest_over";
                        break Label_0055;
                    }
                    break;
                }
                case -700436896: {
                    if (s.equals("leave_with_detach_view")) {
                        s2 = "connection_end";
                        break Label_0055;
                    }
                    break;
                }
                case 1608498638: {
                    if (s.equals("quick_leave_normally")) {
                        s2 = "guest_over_quickly";
                        break Label_0055;
                    }
                    break;
                }
            }
            s2 = "others";
        }
        0xx.LIZ(s2, 0k8, b);
        if (n.LIZ((Object)s, (Object)"quick_leave_normally")) {
            return "leave_normally";
        }
        return s;
    }
    
    public static final void LIZ() {
        LIZ(1ml.LJIIIIZZ, true, "list_request", new JSONObject());
        1ml.LJIIIZ = System.currentTimeMillis();
    }
    
    public static final void LIZ(final int n) {
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "type", String.valueOf(n));
        LIZ(1ml.LJIIIIZZ, true, "disconnect_popup_click", jsonObject);
    }
    
    public static final void LIZ(final long n, final long n2, String idStr) {
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "reply_status", n);
        0d3.LIZ(jsonObject, "guest_linkmic_id", idStr);
        final 1ml ljiiiizz = 1ml.LJIIIIZZ;
        ljiiiizz.LIZ(jsonObject, n2, idStr);
        LIZ(ljiiiizz, false, "reply_request", jsonObject);
        1ml.LJIIJ = System.currentTimeMillis();
        final 0xz lji = ljiiiizz.LJI();
        final GCe liz = GCe.LIZ();
        n.LIZIZ((Object)liz, "");
        0xz.LIZ(lji, liz.LIZIZ(), "reply_request", jsonObject, 8);
        if (LinkMicPerfTeaReportSetting.INSTANCE.getValue().LIZ && n == 1L) {
            final 5oa liz2 = 5ob.LIZ;
            final GIK liziz = Fk2.LIZ().LIZIZ();
            n.LIZIZ((Object)liziz, "");
            final String liz3 = liz2.LIZ(liziz.LIZJ());
            if (liz3 != null) {
                final I5s multiLive = I5s.MultiLive;
                final Fk2 liz4 = Fk2.LIZ();
                final String s = null;
                while (true) {
                    Label_0259: {
                        if (liz4 == null) {
                            break Label_0259;
                        }
                        final GIK liziz2 = liz4.LIZIZ();
                        if (liziz2 == null) {
                            break Label_0259;
                        }
                        final Long value = liziz2.LIZJ();
                        final String value2 = String.valueOf(value);
                        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
                        idStr = s;
                        if (room != null) {
                            idStr = room.getIdStr();
                        }
                        W2f.LIZ(liz3, liz3, multiLive, "Invite", String.valueOf(idStr), "", value2, String.valueOf(n2), I5r.Guest);
                        return;
                    }
                    final Long value = null;
                    continue;
                }
            }
        }
    }
    
    public static final void LIZ(final long n, final String s) {
        CTM.LIZ((Object)s);
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "guest_user_id", n);
        final long n2 = System.currentTimeMillis() - 1ml.LJI;
        0d3.LIZ(jsonObject, "cost", n2);
        0d3.LIZ(jsonObject, "guest_linkmic_id", s);
        final 1ml ljiiiizz = 1ml.LJIIIIZZ;
        ljiiiizz.LIZ(jsonObject, n, s);
        0d3.LIZ(jsonObject, "invite_service_timestamp", System.currentTimeMillis() + Gl0.LIZ - n2);
        LIZ(ljiiiizz, true, "invite_succeed", jsonObject);
        final JSONObject jsonObject2 = new JSONObject();
        ljiiiizz.LIZ(true, jsonObject2);
        0d3.LIZ(jsonObject2, "record_id", s);
        String s2;
        if (1ml.LIZIZ) {
            s2 = "live";
        }
        else {
            s2 = "guest";
        }
        0d3.LIZ(jsonObject2, "live_type", s2);
        final 0xz lji = ljiiiizz.LJI();
        lji.LIZ(jsonObject2);
        lji.LIZ(s, "invite_succeed", jsonObject, FJ4.LIZ(8sj.LIZ((Object)"duration", (Object)n2)));
    }
    
    public static /* synthetic */ void LIZ(final 1ml 1ml, final boolean b, final String s, final JSONObject jsonObject) {
        1ml.LIZ(b, s, jsonObject, 0);
    }
    
    public static final void LIZ(final 5E4 5e4, final Throwable t) {
        CTM.LIZ((Object)5e4);
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "turn_on_source", 5e4.value);
        final 1ml ljiiiizz = 1ml.LJIIIIZZ;
        ljiiiizz.LIZ(jsonObject, t);
        0d3.LIZ(jsonObject, "cost", System.currentTimeMillis() - 1ml.LIZ);
        ljiiiizz.LIZ(true, "init_failed", jsonObject, 1);
    }
    
    public static final void LIZ(final LinkMessage linkMessage, final long n, final long n2) {
        CTM.LIZ((Object)linkMessage);
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "message_available_time", linkMessage.LJ());
        0d3.LIZ(jsonObject, "at_least_available_time", n);
        0d3.LIZ(jsonObject, "limit_time", n2);
        0d3.LIZ(jsonObject, "remote_linkmic_id", linkMessage.LJ.LJI.LJII);
        final JSONObject jsonObject2 = new JSONObject();
        final 1ml ljiiiizz = 1ml.LJIIIIZZ;
        ljiiiizz.LIZ(false, jsonObject2);
        final String ljii = linkMessage.LJ.LIZLLL.LJII;
        0d3.LIZ(jsonObject2, "record_id", ljii);
        String s;
        if (1ml.LIZIZ) {
            s = "live";
        }
        else {
            s = "guest";
        }
        0d3.LIZ(jsonObject2, "live_type", s);
        final 0xz lji = ljiiiizz.LJI();
        lji.LIZ(jsonObject2);
        0xz.LIZ(lji, ljii, "permit_message_delay", 0xv.LIZ(jsonObject), 8);
        ljiiiizz.LIZ(jsonObject, linkMessage);
        0d3.LIZ(jsonObject, "msgId", ((H31)linkMessage).getMessageId());
        LIZ(ljiiiizz, false, "permit_message_delay", jsonObject);
    }
    
    public static final void LIZ(final LinkMessage linkMessage, final long n, String idStr, final long n2) {
        CTM.LIZ((Object)linkMessage, (Object)idStr);
        final JSONObject jsonObject = new JSONObject();
        final 1ml ljiiiizz = 1ml.LJIIIIZZ;
        ljiiiizz.LIZ(jsonObject, n, idStr);
        0d3.LIZ(jsonObject, "guest_user_id", n);
        0d3.LIZ(jsonObject, "guest_linkmic_id", idStr);
        0d3.LIZ(jsonObject, "reply_status", n2);
        ljiiiizz.LIZ(jsonObject, n, idStr);
        0xz.LIZ(ljiiiizz.LJI(), idStr, "reply_message", 0xv.LIZ(jsonObject), 8);
        final long n3 = lcmp(n2, 1L);
        if (n3 != 0) {
            ljiiiizz.LJI().LIZ(idStr, 1);
        }
        Label_0235: {
            if (LinkMicPerfTeaReportSetting.INSTANCE.getValue().LIZ && n3 == 0) {
                final String liz = 5ob.LIZ.LIZ(n);
                if (liz != null) {
                    final I5s multiLive = I5s.MultiLive;
                    final Fk2 liz2 = Fk2.LIZ();
                    final String s = null;
                    while (true) {
                        Label_0267: {
                            if (liz2 == null) {
                                break Label_0267;
                            }
                            final GIK liziz = liz2.LIZIZ();
                            if (liziz == null) {
                                break Label_0267;
                            }
                            final Long value = liziz.LIZJ();
                            final String value2 = String.valueOf(value);
                            final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
                            idStr = s;
                            if (room != null) {
                                idStr = room.getIdStr();
                            }
                            W2f.LIZ(liz, liz, multiLive, "Invite", String.valueOf(idStr), "", value2, String.valueOf(n), I5r.Anchor);
                            break Label_0235;
                        }
                        final Long value = null;
                        continue;
                    }
                }
            }
        }
        ljiiiizz.LIZ(jsonObject, linkMessage);
        0d3.LIZ(jsonObject, "msgId", ((H31)linkMessage).getMessageId());
        LIZ(ljiiiizz, true, "reply_message", jsonObject);
    }
    
    public static final void LIZ(final LinkMessage linkMessage, final boolean b) {
        CTM.LIZ((Object)linkMessage);
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "is_background", String.valueOf((int)(b ? 1 : 0)));
        0d3.LIZ(jsonObject, "message_expired_time", linkMessage.LJIIZILJ);
        0d3.LIZ(jsonObject, "message_available_time", linkMessage.LJ());
        0d3.LIZ(jsonObject, "delay_time", linkMessage.LIZJ());
        0d3.LIZ(jsonObject, "guest_linkmic_id", linkMessage.LJ.LJI.LJII);
        final 1ml ljiiiizz = 1ml.LJIIIIZZ;
        ljiiiizz.LIZ(jsonObject, linkMessage.LJ.LJ, linkMessage.LJ.LJI.LJII);
        final JSONObject jsonObject2 = new JSONObject();
        ljiiiizz.LIZ(false, jsonObject2);
        final String ljii = linkMessage.LJ.LIZLLL.LJII;
        0d3.LIZ(jsonObject2, "record_id", ljii);
        String s;
        if (1ml.LIZIZ) {
            s = "live";
        }
        else {
            s = "guest";
        }
        0d3.LIZ(jsonObject2, "live_type", s);
        0xz.LIZ(ljiiiizz.LJI(), ljii, "permit_message", 0xv.LIZ(jsonObject), 8);
        Label_0357: {
            if (LinkMicPerfTeaReportSetting.INSTANCE.getValue().LIZ && linkMessage.LJ.LJIIIIZZ == 1) {
                final 5oa liz = 5ob.LIZ;
                final GIK liziz = Fk2.LIZ().LIZIZ();
                n.LIZIZ((Object)liziz, "");
                final String liz2 = liz.LIZ(liziz.LIZJ());
                if (liz2 != null) {
                    final I5s multiLive = I5s.MultiLive;
                    final Fk2 liz3 = Fk2.LIZ();
                    final Object o = null;
                    while (true) {
                        Label_0384: {
                            if (liz3 == null) {
                                break Label_0384;
                            }
                            final GIK liziz2 = liz3.LIZIZ();
                            if (liziz2 == null) {
                                break Label_0384;
                            }
                            final Long value = liziz2.LIZJ();
                            final String value2 = String.valueOf(value);
                            final long liz4 = linkMessage.LJ.LIZ;
                            final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
                            Object idStr = o;
                            if (room != null) {
                                idStr = room.getIdStr();
                            }
                            W2f.LIZ(liz2, liz2, multiLive, "Apply", String.valueOf(idStr), "", value2, String.valueOf(liz4), I5r.Guest);
                            break Label_0357;
                        }
                        final Long value = null;
                        continue;
                    }
                }
            }
        }
        ljiiiizz.LIZ(jsonObject, linkMessage);
        0d3.LIZ(jsonObject, "msgId", ((H31)linkMessage).getMessageId());
        LIZ(ljiiiizz, false, "permit_message", jsonObject);
    }
    
    public static final void LIZ(final String s) {
        CTM.LIZ((Object)s);
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "type", s);
        LIZ(1ml.LJIIIIZZ, false, "leave_click", jsonObject);
    }
    
    public static final void LIZ(String s, final String s2) {
        CTM.LIZ((Object)s, (Object)s2);
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "response", s2);
        final long n = System.currentTimeMillis() - 1ml.LJII;
        0d3.LIZ(jsonObject, "cost", n);
        final 1ml ljiiiizz = 1ml.LJIIIIZZ;
        LIZ(ljiiiizz, false, "apply_succeed", jsonObject);
        final JSONObject jsonObject2 = new JSONObject();
        ljiiiizz.LIZ(false, jsonObject2);
        0d3.LIZ(jsonObject2, "record_id", s2);
        if (1ml.LIZIZ) {
            s = "live";
        }
        else {
            s = "guest";
        }
        0d3.LIZ(jsonObject2, "live_type", s);
        final 0xz lji = ljiiiizz.LJI();
        lji.LIZ(jsonObject2);
        lji.LIZ(s2, "apply_succeed", jsonObject, FJ4.LIZ(8sj.LIZ((Object)"duration", (Object)n)));
    }
    
    public static final void LIZ(final String s, final Throwable t, final HashMap<String, Object> hashMap) {
        CTM.LIZ((Object)s, (Object)hashMap);
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "request_source", s);
        for (final Map.Entry<String, V> entry : hashMap.entrySet()) {
            1ml.LJIIIIZZ.LIZ(jsonObject, entry.getKey(), entry.getValue());
        }
        final 1ml ljiiiizz = 1ml.LJIIIIZZ;
        ljiiiizz.LIZ(jsonObject, t);
        0d3.LIZ(jsonObject, "cost", System.currentTimeMillis() - 1ml.LJIIJJI);
        ljiiiizz.LIZ(false, "leave_failed", jsonObject, 1);
        final JSONObject jsonObject2 = new JSONObject();
        0d3.LIZ(jsonObject2, "request_source", s);
        ljiiiizz.LIZ(jsonObject2, t);
        final 0xz lji = ljiiiizz.LJI();
        final GCe liz = GCe.LIZ();
        n.LIZIZ((Object)liz, "");
        0xz.LIZ(lji, liz.LIZIZ(), "leave_failed", jsonObject2, 8);
    }
    
    public static final void LIZ(final String s, final HashMap<String, Object> hashMap) {
        CTM.LIZ((Object)s, (Object)hashMap);
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "request_source", s);
        for (final Map.Entry<String, V> entry : hashMap.entrySet()) {
            1ml.LJIIIIZZ.LIZ(jsonObject, entry.getKey(), entry.getValue());
        }
        final 1ml ljiiiizz = 1ml.LJIIIIZZ;
        LIZ(ljiiiizz, false, "leave_request", jsonObject);
        1ml.LJIIJJI = System.currentTimeMillis();
        final JSONObject jsonObject2 = new JSONObject();
        0d3.LIZ(jsonObject2, "request_source", s);
        final 0xz lji = ljiiiizz.LJI();
        final GCe liz = GCe.LIZ();
        n.LIZIZ((Object)liz, "");
        0xz.LIZ(lji, liz.LIZIZ(), "leave_request", jsonObject2, 8);
    }
    
    public static final void LIZ(String liziz, final boolean b) {
        CTM.LIZ((Object)liziz);
        final long lizj = 5ob.LIZ.LIZJ(liziz);
        long n = 0L;
        if (lizj <= 0L) {
            return;
        }
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "guest_user_id", lizj);
        0d3.LIZ(jsonObject, "guest_linkmic_id", liziz);
        final 1ml ljiiiizz = 1ml.LJIIIIZZ;
        ljiiiizz.LIZ(jsonObject, lizj, liziz);
        final long liziz2 = GCe.LIZ().LIZIZ(lizj);
        int n2 = 0;
        if (!GCe.LIZ().LJIJ) {
            n = System.currentTimeMillis() - liziz2;
            GCe.LIZ().LJIJ = true;
            n2 = 1;
        }
        0d3.LIZ(jsonObject, "cost", n);
        0d3.LIZ(jsonObject, "first_joined", String.valueOf(n2));
        LIZ(ljiiiizz, b, "rtc_first_remote_video", jsonObject);
        final JSONObject jsonObject2 = new JSONObject();
        0d3.LIZ(jsonObject2, "first_joined", String.valueOf(n2));
        final 0xz lji = ljiiiizz.LJI();
        if (!b) {
            final GCe liz = GCe.LIZ();
            kotlin.jvm.internal.n.LIZIZ((Object)liz, "");
            liziz = liz.LIZIZ();
        }
        0xz.LIZ(lji, liziz, "rtc_first_remote_video", jsonObject2, 8);
    }
    
    public static final void LIZ(final Throwable t) {
        final JSONObject jsonObject = new JSONObject();
        final 1ml ljiiiizz = 1ml.LJIIIIZZ;
        ljiiiizz.LIZ(jsonObject, t);
        0d3.LIZ(jsonObject, "cost", System.currentTimeMillis() - 1ml.LJIIIZ);
        ljiiiizz.LIZ(true, "list_failed", jsonObject, 1);
    }
    
    public static final void LIZ(final Throwable t, final long n, final long n2, final String s) {
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "error_code", 101L);
        0d3.LIZ(jsonObject, "code", "101");
        0d3.LIZ(jsonObject, "reply_status", n);
        0d3.LIZ(jsonObject, "cost", System.currentTimeMillis() - 1ml.LJIIJ);
        final 1ml ljiiiizz = 1ml.LJIIIIZZ;
        ljiiiizz.LIZ(jsonObject, t);
        ljiiiizz.LIZ(jsonObject, n2, s);
        final 0xz lji = ljiiiizz.LJI();
        final GCe liz = GCe.LIZ();
        n.LIZIZ((Object)liz, "");
        0xz.LIZ(lji, liz.LIZIZ(), "reply_failed", 0xv.LIZ(jsonObject), 8);
        ljiiiizz.LIZ(false, "reply_failed", jsonObject, 1);
        if (LinkMicPerfTeaReportSetting.INSTANCE.getValue().LIZ && n == 1L) {
            final 5oa liz2 = 5ob.LIZ;
            final GIK liziz = Fk2.LIZ().LIZIZ();
            n.LIZIZ((Object)liziz, "");
            final String liz3 = liz2.LIZ(liziz.LIZJ());
            if (liz3 != null) {
                W2f.LIZ(liz3, "reply_failed", (String)null, (Long)null, (String)null);
            }
        }
    }
    
    public static final void LIZ(final List<? extends LinkPlayerInfo> list) {
        CTM.LIZ((Object)list);
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "response", list.toString());
        0d3.LIZ(jsonObject, "cost", System.currentTimeMillis() - 1ml.LJIIIZ);
        LIZ(1ml.LJIIIIZZ, true, "list_succeed", jsonObject);
    }
    
    public static final void LIZ(final boolean b) {
        final JSONObject jsonObject = new JSONObject();
        final GCe liz = GCe.LIZ();
        n.LIZIZ((Object)liz, "");
        0d3.LIZ(jsonObject, "rtc_ext_info", liz.LJIIL);
        final GCe liz2 = GCe.LIZ();
        n.LIZIZ((Object)liz2, "");
        0d3.LIZ(jsonObject, "rtc_ext_info_map", liz2.LIZJ());
        String s;
        if (1ml.LIZIZ) {
            s = "live";
        }
        else {
            s = "guest";
        }
        0d3.LIZ(jsonObject, "live_type", s);
        0d3.LIZ(jsonObject, "side_type", "room");
        final 1ml ljiiiizz = 1ml.LJIIIIZZ;
        LIZ(ljiiiizz, b, "rtc_join_channel_start", jsonObject);
        if (b) {
            final GCe liz3 = GCe.LIZ();
            n.LIZIZ((Object)liz3, "");
            0d3.LIZ(jsonObject, "record_id", liz3.LIZIZ());
            final 0xz lji = ljiiiizz.LJI();
            lji.LIZ(jsonObject);
            final GCe liz4 = GCe.LIZ();
            n.LIZIZ((Object)liz4, "");
            0xz.LIZ(lji, liz4.LIZIZ(), "rtc_join_channel_start", null, 12);
        }
    }
    
    public static final void LIZ(final boolean b, final int n) {
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "guest_pre_push_time_mills", n);
        final 1ml ljiiiizz = 1ml.LJIIIIZZ;
        LIZ(ljiiiizz, b, "rtc_push_stream", jsonObject);
        final 0xz lji = ljiiiizz.LJI();
        final GCe liz = GCe.LIZ();
        n.LIZIZ((Object)liz, "");
        0xz.LIZ(lji, liz.LIZIZ(), "rtc_push_stream", 0xv.LIZ(jsonObject), 8);
    }
    
    public static final void LIZ(final boolean b, final int n, final String s) {
        CTM.LIZ((Object)s);
        final JSONObject jsonObject = new JSONObject();
        final Long value = 104L;
        0d3.LIZ(jsonObject, "error_code", 104L);
        0d3.LIZ(jsonObject, "code", "104");
        0d3.LIZ(jsonObject, "error_msg", (long)n);
        0d3.LIZ(jsonObject, "error_detail", s);
        final 0xz lji = 1ml.LJIIIIZZ.LJI();
        final GCe liz = GCe.LIZ();
        n.LIZIZ((Object)liz, "");
        String liziz;
        if ((liziz = liz.LIZIZ()) == null) {
            liziz = "";
        }
        0xz.LIZ(lji, liziz, "rtc_error", 0xv.LIZ(jsonObject), 8);
        final GCe liz2 = GCe.LIZ();
        n.LIZIZ((Object)liz2, "");
        String liziz2;
        if ((liziz2 = liz2.LIZIZ()) == null) {
            liziz2 = "";
        }
        lji.LIZ(liziz2, 2);
        if (LinkMicPerfTeaReportSetting.INSTANCE.getValue().LIZ) {
            final 5oa liz3 = 5ob.LIZ;
            n.LIZIZ((Object)liz3, "");
            final Map liz4 = liz3.LIZ;
            n.LIZIZ((Object)liz4, "");
            for (final Map.Entry<K, Object> entry : liz4.entrySet()) {
                final String value2 = entry.getValue();
                n.LIZIZ((Object)value2, "");
                W2f.LIZ((String)value2, "rtc_error", (String)null, value, s);
                final String value3 = entry.getValue();
                n.LIZIZ((Object)value3, "");
                W2f.LIZIZ((String)value3, "rtc_error", (String)null, value, s);
            }
        }
        LIZ(1ml.LJIIIIZZ, b, "rtc_error", jsonObject);
        1mk.LJ(0xv.LIZ(jsonObject));
    }
    
    public static final void LIZ(final boolean b, final long n, final String s) {
        CTM.LIZ((Object)s);
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "guest_user_id", n);
        0d3.LIZ(jsonObject, "guest_linkmic_id", s);
        final 1ml ljiiiizz = 1ml.LJIIIIZZ;
        ljiiiizz.LIZ(jsonObject, n, s);
        LIZ(ljiiiizz, b, "rtc_user_joined", jsonObject);
        0xz.LIZ(ljiiiizz.LJI(), s, "rtc_user_joined", null, 8);
    }
    
    public static final void LIZ(final boolean b, final 5E4 5e4, final Throwable t) {
        CTM.LIZ((Object)5e4);
        final JSONObject jsonObject = new JSONObject();
        String value;
        if ((value = 5e4.value) == null) {
            value = "";
        }
        0d3.LIZ(jsonObject, "turn_on_source", value);
        0d3.LIZ(jsonObject, "init_success", b ? 1 : 0);
        if (t != null) {
            1ml.LJIIIIZZ.LIZ(jsonObject, t);
        }
        1ml.LJIIIIZZ.LIZ(true, "anchor_init_and_turn_on_multi_guest", jsonObject, 0);
    }
    
    public static final void LIZ(final boolean b, final String s) {
        CTM.LIZ((Object)s);
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "request_source", s);
        final 1ml ljiiiizz = 1ml.LJIIIIZZ;
        LIZ(ljiiiizz, b, "rtc_stop", jsonObject);
        final JSONObject jsonObject2 = new JSONObject();
        0d3.LIZ(jsonObject2, "request_source", s);
        final 0xz lji = ljiiiizz.LJI();
        final GCe liz = GCe.LIZ();
        n.LIZIZ((Object)liz, "");
        0xz.LIZ(lji, liz.LIZIZ(), "rtc_stop", jsonObject2, 8);
        if (LinkMicPerfTeaReportSetting.INSTANCE.getValue().LIZ) {
            final 5oa liz2 = 5ob.LIZ;
            n.LIZIZ((Object)liz2, "");
            final Map liz3 = liz2.LIZ;
            n.LIZIZ((Object)liz3, "");
            for (final Map.Entry<K, Object> entry : liz3.entrySet()) {
                final String value = entry.getValue();
                n.LIZIZ((Object)value, "");
                W2f.LIZ((String)value, "rtc_stop", s, (Long)null, (String)null);
                final String value2 = entry.getValue();
                n.LIZIZ((Object)value2, "");
                W2f.LIZIZ((String)value2, "rtc_stop", s, (Long)null, (String)null);
            }
        }
    }
    
    public static final void LIZ(final boolean b, String s, final String s2) {
        final JSONObject jsonObject = new JSONObject();
        String s3 = s;
        if (s == null) {
            s3 = "";
        }
        0d3.LIZ(jsonObject, "msg_id", s3);
        if ((s = s2) == null) {
            s = "";
        }
        0d3.LIZ(jsonObject, "msg", s);
        LIZ(1ml.LJIIIIZZ, b, "multilive_rtc_message_send", jsonObject);
    }
    
    public static final void LIZ(final boolean b, String s, final String s2, final long n) {
        final JSONObject jsonObject = new JSONObject();
        String s3 = s;
        if (s == null) {
            s3 = "";
        }
        0d3.LIZ(jsonObject, "msg_id", s3);
        0d3.LIZ(jsonObject, "cost", n);
        if ((s = s2) == null) {
            s = "";
        }
        0d3.LIZ(jsonObject, "msg", s);
        LIZ(1ml.LJIIIIZZ, b, "multilive_rtc_message_received", jsonObject);
    }
    
    public static final void LIZ(final boolean b, final Throwable t) {
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "anchor_check_permission_status", b ? 1 : 0);
        if (t != null) {
            1ml.LJIIIIZZ.LIZ(jsonObject, t);
        }
        1ml.LJIIIIZZ.LIZ(true, "anchor_check_permission", jsonObject, 0);
    }
    
    public static final void LIZ(final boolean b, final HashMap<String, Object> hashMap) {
        CTM.LIZ((Object)hashMap);
        final JSONObject jsonObject = new JSONObject();
        for (final Map.Entry<String, V> entry : hashMap.entrySet()) {
            1ml.LJIIIIZZ.LIZ(jsonObject, entry.getKey(), entry.getValue());
        }
        LIZ(1ml.LJIIIIZZ, b, "multilive_rtc_message_send_fail", jsonObject);
    }
    
    public static final void LIZIZ() {
        final JSONObject jsonObject = new JSONObject();
        final 1ml ljiiiizz = 1ml.LJIIIIZZ;
        LIZ(ljiiiizz, false, "join_channel_request", jsonObject);
        1ml.LIZLLL = System.currentTimeMillis();
        final 0xz lji = ljiiiizz.LJI();
        final GCe liz = GCe.LIZ();
        n.LIZIZ((Object)liz, "");
        0xz.LIZ(lji, liz.LIZIZ(), "join_channel_request", null, 8);
    }
    
    public static final void LIZIZ(final int n) {
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "type", String.valueOf(n));
        LIZ(1ml.LJIIIIZZ, false, "leave_popup_click", jsonObject);
    }
    
    public static final void LIZIZ(final long n, final long n2, final String s) {
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "reply_status", n);
        final long n3 = System.currentTimeMillis() - 1ml.LJIIJ;
        0d3.LIZ(jsonObject, "cost", n3);
        final 1ml ljiiiizz = 1ml.LJIIIIZZ;
        ljiiiizz.LIZ(jsonObject, n2, s);
        LIZ(ljiiiizz, false, "reply_succeed", jsonObject);
        final JSONObject jsonObject2 = new JSONObject();
        0d3.LIZ(jsonObject, "reply_status", n);
        final 0xz lji = ljiiiizz.LJI();
        final GCe liz = GCe.LIZ();
        n.LIZIZ((Object)liz, "");
        lji.LIZ(liz.LIZIZ(), "reply_succeed", jsonObject2, FJ4.LIZ(8sj.LIZ((Object)"duration", (Object)n3)));
    }
    
    public static final void LIZIZ(final long n, final String s) {
        CTM.LIZ((Object)s);
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "guest_user_id", n);
        0d3.LIZ(jsonObject, "guest_linkmic_id", s);
        final 1ml ljiiiizz = 1ml.LJIIIIZZ;
        ljiiiizz.LIZ(jsonObject, n, s);
        LIZ(ljiiiizz, true, "cancel_invite", jsonObject);
        0xz.LIZ(ljiiiizz.LJI(), s, "cancel_invite", null, 8);
    }
    
    public static final void LIZIZ(final String s, final HashMap<String, Object> hashMap) {
        CTM.LIZ((Object)s, (Object)hashMap);
        final JSONObject jsonObject = new JSONObject();
        for (final Map.Entry<String, V> entry : hashMap.entrySet()) {
            1ml.LJIIIIZZ.LIZ(jsonObject, entry.getKey(), entry.getValue());
        }
        0d3.LIZ(jsonObject, "cost", System.currentTimeMillis() - 1ml.LJIIJJI);
        0d3.LIZ(jsonObject, "request_source", s);
        final 1ml ljiiiizz = 1ml.LJIIIIZZ;
        LIZ(ljiiiizz, false, "leave_succeed", jsonObject);
        final JSONObject jsonObject2 = new JSONObject();
        0d3.LIZ(jsonObject2, "request_source", s);
        final 0xz lji = ljiiiizz.LJI();
        final GCe liz = GCe.LIZ();
        n.LIZIZ((Object)liz, "");
        0xz.LIZ(lji, liz.LIZIZ(), "leave_succeed", jsonObject2, 8);
        if (LinkMicPerfTeaReportSetting.INSTANCE.getValue().LIZ) {
            final 5oa liz2 = 5ob.LIZ;
            final GIK liziz = Fk2.LIZ().LIZIZ();
            n.LIZIZ((Object)liziz, "");
            final String liz3 = liz2.LIZ(liziz.LIZJ());
            if (liz3 != null) {
                W2f.LIZ(liz3, "leave_request", s, (Long)null, (String)null);
                W2f.LIZIZ(liz3, "leave_request", s, (Long)null, (String)null);
            }
        }
    }
    
    public static final void LIZIZ(final String s, final boolean b) {
        CTM.LIZ((Object)s);
        final long lizj = 5ob.LIZ.LIZJ(s);
        if (lizj <= 0L) {
            return;
        }
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "guest_user_id", lizj);
        0d3.LIZ(jsonObject, "guest_linkmic_id", s);
        final 1ml ljiiiizz = 1ml.LJIIIIZZ;
        ljiiiizz.LIZ(jsonObject, lizj, s);
        final long liziz = GCe.LIZ().LIZIZ(lizj);
        long n;
        int n2;
        if (!GCe.LIZ().LJIJI) {
            n = System.currentTimeMillis() - liziz;
            GCe.LIZ().LJIJI = true;
            n2 = 1;
        }
        else {
            n = 0L;
            n2 = 0;
        }
        0d3.LIZ(jsonObject, "cost", n);
        0d3.LIZ(jsonObject, "first_joined", String.valueOf(n2));
        LIZ(ljiiiizz, b, "rtc_first_frame_render", jsonObject);
        final JSONObject jsonObject2 = new JSONObject();
        0d3.LIZ(jsonObject2, "first_joined", String.valueOf(n2));
        final 0xz lji = ljiiiizz.LJI();
        final String s2 = "";
        String liziz2;
        if (b) {
            liziz2 = s;
        }
        else {
            final GCe liz = GCe.LIZ();
            kotlin.jvm.internal.n.LIZIZ((Object)liz, "");
            liziz2 = liz.LIZIZ();
        }
        0xz.LIZ(lji, liziz2, "rtc_first_frame_render", jsonObject2, 8);
        if (LinkMicPerfTeaReportSetting.INSTANCE.getValue().LIZ) {
            String liz2;
            if (b) {
                liz2 = s;
            }
            else {
                final 5oa liz3 = 5ob.LIZ;
                final GIK liziz3 = Fk2.LIZ().LIZIZ();
                kotlin.jvm.internal.n.LIZIZ((Object)liziz3, "");
                liz2 = liz3.LIZ(liziz3.LIZJ());
            }
            if (liz2 == null) {
                0d8.LIZ(new Throwable(), "LinkInRoomMonitor monitorRtcFirstRemoteVideoRender: linkMicId is empty.");
            }
            else {
                W2f.LIZ(liz2, "rtc_first_frame_render", (String)null, (Long)null, (String)null, false);
                String liziz4;
                if (b) {
                    liziz4 = s;
                }
                else {
                    final GCe liz4 = GCe.LIZ();
                    kotlin.jvm.internal.n.LIZIZ((Object)liz4, "");
                    if ((liziz4 = liz4.LIZIZ()) == null) {
                        liziz4 = "";
                    }
                }
                final Object o = null;
                W2f.LIZ(liziz4, "rtc_first_frame_render", (String)null, (Long)null, (String)null);
                final I5s multiLive = I5s.MultiLive;
                final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
                String idStr = s2;
                if (room != null) {
                    idStr = room.getIdStr();
                    if (idStr == null) {
                        idStr = s2;
                    }
                }
                final Fk2 liz5 = Fk2.LIZ();
                Object value = o;
                if (liz5 != null) {
                    final GIK liziz5 = liz5.LIZIZ();
                    value = o;
                    if (liziz5 != null) {
                        value = liziz5.LIZJ();
                    }
                }
                final String value2 = String.valueOf(value);
                I5r i5r;
                if (b) {
                    i5r = I5r.Anchor;
                }
                else {
                    i5r = I5r.Guest;
                }
                W2f.LIZ(liz2, liz2, multiLive, "", idStr, "", value2, String.valueOf(lizj), i5r, true);
            }
        }
        if (liziz > 0L) {
            0d8.LIZ("ttlive_client_guest_link_first_frame", n, 0xv.LIZ(jsonObject));
            1mk.LIZLLL(0xv.LIZ(jsonObject));
            if (b) {
                ljiiiizz.LJI().LIZ(s, 1);
            }
        }
    }
    
    public static final void LIZIZ(final Throwable t) {
        final JSONObject jsonObject = new JSONObject();
        final 1ml ljiiiizz = 1ml.LJIIIIZZ;
        ljiiiizz.LIZ(jsonObject, t);
        0d3.LIZ(jsonObject, "cost", System.currentTimeMillis() - 1ml.LJII);
        ljiiiizz.LIZ(false, "apply_failed", jsonObject, 1);
        final JSONObject jsonObject2 = new JSONObject();
        ljiiiizz.LIZ(false, jsonObject2);
        final String string = UUID.randomUUID().toString();
        n.LIZIZ((Object)string, "");
        0d3.LIZ(jsonObject2, "record_id", string);
        String s;
        if (1ml.LIZIZ) {
            s = "live";
        }
        else {
            s = "guest";
        }
        0d3.LIZ(jsonObject2, "live_type", s);
        final 0xz lji = ljiiiizz.LJI();
        lji.LIZ(jsonObject2);
        0xz.LIZ(lji, string, "apply_failed", jsonObject, 8);
        lji.LIZ(string, 2);
    }
    
    public static final void LIZIZ(final boolean b) {
        final JSONObject jsonObject = new JSONObject();
        final long ljiill = GCe.LIZ().LJIILL;
        if (ljiill > 0L) {
            0d3.LIZ(jsonObject, "cost", System.currentTimeMillis() - ljiill);
        }
        final 1ml ljiiiizz = 1ml.LJIIIIZZ;
        LIZ(ljiiiizz, b, "rtc_join_channel_succeed", jsonObject);
        if (b) {
            final 0xz lji = ljiiiizz.LJI();
            final GCe liz = GCe.LIZ();
            n.LIZIZ((Object)liz, "");
            0xz.LIZ(lji, liz.LIZIZ(), "rtc_join_channel_succeed", null, 12);
        }
    }
    
    public static final void LIZIZ(final boolean b, final long n, String liz) {
        CTM.LIZ((Object)liz);
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "guest_user_id", n);
        0d3.LIZ(jsonObject, "guest_linkmic_id", liz);
        final 1ml ljiiiizz = 1ml.LJIIIIZZ;
        ljiiiizz.LIZ(jsonObject, n, liz);
        LIZ(ljiiiizz, b, "rtc_user_leaved", jsonObject);
        0xz.LIZ(ljiiiizz.LJI(), liz, "rtc_user_leaved", null, 8);
        if (LinkMicPerfTeaReportSetting.INSTANCE.getValue().LIZ) {
            if (!b) {
                final 5oa liz2 = 5ob.LIZ;
                final GIK liziz = Fk2.LIZ().LIZIZ();
                n.LIZIZ((Object)liziz, "");
                liz = liz2.LIZ(liziz.LIZJ());
            }
            if (liz == null) {
                0d8.LIZ(new Throwable(), "LinkInRoomMonitor monitorRtcFirstRemoteVideoRender: linkMicId is empty.");
            }
            else {
                W2f.LIZ(liz, "rtc_user_leaved", (String)null, (Long)null, (String)null);
                W2f.LIZIZ(liz, "rtc_user_leaved", (String)null, (Long)null, (String)null);
            }
        }
    }
    
    public static final void LIZIZ(final boolean b, final String s) {
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "check_permission_success", b ? 1 : 0);
        String s2 = s;
        if (s == null) {
            s2 = "";
        }
        0d3.LIZ(jsonObject, "response", s2);
        1ml.LJIIIIZZ.LIZ(false, "guest_check_permission", jsonObject, (b ? 1 : 0) ^ 0x1);
    }
    
    public static final void LIZJ() {
        LIZ(1ml.LJIIIIZZ, true, "disconnect_popup_show", new JSONObject());
    }
    
    public static final void LIZJ(String liziz, final boolean b) {
        CTM.LIZ((Object)liziz);
        final long lizj = 5ob.LIZ.LIZJ(liziz);
        long n = 0L;
        if (lizj <= 0L) {
            return;
        }
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "guest_user_id", lizj);
        0d3.LIZ(jsonObject, "guest_linkmic_id", liziz);
        final 1ml ljiiiizz = 1ml.LJIIIIZZ;
        ljiiiizz.LIZ(jsonObject, lizj, liziz);
        final long liziz2 = GCe.LIZ().LIZIZ(lizj);
        int n2 = 0;
        if (liziz2 > 0L) {
            n = System.currentTimeMillis() - liziz2;
            n2 = 1;
        }
        0d3.LIZ(jsonObject, "cost", n);
        0d3.LIZ(jsonObject, "first_joined", String.valueOf(n2));
        LIZ(ljiiiizz, b, "rtc_first_remote_audio", jsonObject);
        final JSONObject jsonObject2 = new JSONObject();
        0d3.LIZ(jsonObject2, "first_joined", String.valueOf(n2));
        final 0xz lji = ljiiiizz.LJI();
        if (!b) {
            final GCe liz = GCe.LIZ();
            kotlin.jvm.internal.n.LIZIZ((Object)liz, "");
            liziz = liz.LIZIZ();
        }
        0xz.LIZ(lji, liziz, "rtc_first_remote_audio", jsonObject2, 8);
    }
    
    public static final void LIZJ(final boolean b) {
        LIZ(1ml.LJIIIIZZ, b, "rtc_offline", new JSONObject());
    }
    
    public static final void LIZJ(final boolean b, final String s) {
        final JSONObject jsonObject = new JSONObject();
        String s2;
        if (b) {
            s2 = "1";
        }
        else {
            s2 = "0";
        }
        0d3.LIZ(jsonObject, "is_anchor", s2);
        String s3 = s;
        if (s == null) {
            s3 = "";
        }
        0d3.LIZ(jsonObject, "interact_id", s3);
        1ml.LJIIIIZZ.LIZ(b, "add_guest_window", jsonObject, 0);
    }
    
    public static final void LIZLLL() {
        LIZ(1ml.LJIIIIZZ, false, "leave_popup_show", new JSONObject());
    }
    
    public static final void LIZLLL(final boolean b) {
        LIZ(1ml.LJIIIIZZ, b, "multilive_rtc_message_send_succeed", new JSONObject());
    }
    
    public static final void LIZLLL(final boolean b, String string) {
        final JSONObject jsonObject = new JSONObject();
        final GCe liz = GCe.LIZ();
        n.LIZIZ((Object)liz, "");
        0d3.LIZ(jsonObject, "record_id", liz.LIZIZ());
        final boolean liziz = 1ml.LIZIZ;
        final String s = "live";
        String s2;
        if (liziz) {
            s2 = "live";
        }
        else {
            s2 = "guest";
        }
        0d3.LIZ(jsonObject, "live_type", s2);
        String s3;
        if (string == null) {
            s3 = "";
        }
        else {
            s3 = string;
        }
        0d3.LIZ(jsonObject, "rtc_ext_now", s3);
        final GCe liz2 = GCe.LIZ();
        n.LIZIZ((Object)liz2, "");
        0d3.LIZ(jsonObject, "rtc_ext_info", liz2.LJIIL);
        final GCe liz3 = GCe.LIZ();
        n.LIZIZ((Object)liz3, "");
        0d3.LIZ(jsonObject, "rtc_ext_info_map", liz3.LIZJ());
        LIZ(1ml.LJIIIIZZ, b, "update_Rtc_info", jsonObject);
        final JSONObject jsonObject2 = new JSONObject();
        final GCe liz4 = GCe.LIZ();
        n.LIZIZ((Object)liz4, "");
        0d3.LIZ(jsonObject2, "record_id", liz4.LIZIZ());
        String s4;
        if (1ml.LIZIZ) {
            s4 = s;
        }
        else {
            s4 = "guest";
        }
        0d3.LIZ(jsonObject2, "live_type", s4);
        if (string == null) {
            0d3.LIZ(jsonObject2, "rtc_ext_now", "");
        }
        else {
            try {
                final JSONObject jsonObject3 = new JSONObject(string);
                final JSONObject jsonObject4 = jsonObject3.getJSONObject("live_rtc_engine_config");
                jsonObject4.remove("rtc_token");
                jsonObject3.put("live_rtc_engine_config", (Object)jsonObject4);
                string = jsonObject3.toString();
            }
            catch (final Exception ex) {
                0d8.LIZ(ex, "LinkInRoomMonitor monitorUpdateRtcInfo error");
            }
            0d3.LIZ(jsonObject2, "rtc_ext_now", string);
        }
        final 0xz lji = 1ml.LJIIIIZZ.LJI();
        final GCe liz5 = GCe.LIZ();
        n.LIZIZ((Object)liz5, "");
        0xz.LIZ(lji, liz5.LIZIZ(), "update_Rtc_info", jsonObject2, 8);
    }
    
    public static final void LJFF() {
        1ml.LJIIIIZZ.LIZ(false, "reach_max_link_mic_number", new JSONObject(), 0);
    }
    
    public static final void LJFF(final boolean b) {
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "has_audio_video_permission", b ? 1 : 0);
        1ml.LJIIIIZZ.LIZ(false, "audio_video_permission", jsonObject, (b ? 1 : 0) ^ 0x1);
    }
    
    public static final void LJI(final boolean b) {
        final JSONObject jsonObject = new JSONObject();
        String s;
        if (b) {
            s = "1";
        }
        else {
            s = "0";
        }
        0d3.LIZ(jsonObject, "is_anchor", s);
        1ml.LJIIIIZZ.LIZ(b, "anchor_turn_off_multi_guest", jsonObject, 0);
    }
    
    private final String LJII(final boolean b) {
        if (1ml.LIZIZ) {
            return this.LJIIIZ(b);
        }
        return this.LJIIIIZZ(b);
    }
    
    private final String LJIIIIZZ(final boolean b) {
        if (b) {
            return "ttlive_client_guest_link_anchor_monitor";
        }
        return "ttlive_client_guest_link_audience_monitor";
    }
    
    private final String LJIIIZ(final boolean b) {
        if (b) {
            return "ttlive_client_multi_live_anchor_monitor";
        }
        return "ttlive_client_multi_live_audience_monitor";
    }
    
    public final void LIZ(final JSONObject jsonObject, final Long n, final String s) {
        long longValue;
        if (n != null) {
            longValue = n;
        }
        else {
            longValue = 0L;
        }
        0d3.LIZ(jsonObject, "remote_user_id", longValue);
        0d3.LIZ(jsonObject, "remote_linkmic_id", s);
    }
    
    public final void LIZ(final boolean b, final String s, final JSONObject jsonObject, final int n) {
        0d3.LIZ(jsonObject, "event_id", s);
        if (!b) {
            0d3.LIZ(jsonObject, "join_channel_removed", String.valueOf((int)(MultiLiveServerAutoJoinChannel.INSTANCE.getValue() ? 1 : 0)));
        }
        this.LIZ(b, jsonObject);
        0d3.LIZ(jsonObject, "report_id", String.valueOf(GCe.LIZ().LJIJJLI));
        final GCe liz = GCe.LIZ();
        ++liz.LJIJJLI;
        0d8.LIZ(this.LJII(b), n, jsonObject);
    }
    
    public final 0xz LJI() {
        return (0xz)1ml.LJIIL.getValue();
    }
}

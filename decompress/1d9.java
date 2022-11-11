// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicSequentialEventReportSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveGuestLinkPreInitEnableSetting;
import com.ss.avframework.livestreamv2.core.interact.model.Config$Vendor;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostNeedWaitRtcJoinChannelSucceed;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import kotlin.jvm.internal.n;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import org.json.JSONObject;
import com.bytedance.covode.number.Covode;

public class 1d9 extends 0d3
{
    static {
        Covode.recordClassIndex(10338);
    }
    
    public final void LIZ(final int n, final boolean b, final JSONObject jsonObject) {
        CTM.LIZ((Object)jsonObject);
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        String idStr;
        if (Room.isValid(room)) {
            if (room == null) {
                n.LIZIZ();
            }
            idStr = room.getIdStr();
        }
        else {
            idStr = "0";
        }
        final boolean valid = Room.isValid(room);
        final long n2 = 0L;
        long ownerUserId;
        if (valid) {
            if (room == null) {
                n.LIZIZ();
            }
            ownerUserId = room.getOwnerUserId();
        }
        else {
            ownerUserId = 0L;
        }
        final String s = "";
        String value;
        if (n != 2) {
            if (n != 4) {
                value = "";
            }
            else {
                value = String.valueOf(1NN.LLFF.LIZ().LJ);
            }
        }
        else {
            value = idStr;
        }
        0d3.LIZ(jsonObject, "channel_id", value);
        0d3.LIZ(jsonObject, "room_id", idStr);
        0d3.LIZ(jsonObject, "anchor_id", ownerUserId);
        0d3.LIZ(jsonObject, "is_mute", String.valueOf((int)((n == 4 && 1NN.LLFF.LIZ().LJJLJLI) ? 1 : 0)));
        final GIK liziz = Fk2.LIZ().LIZIZ();
        long lizj = n2;
        if (liziz != null) {
            lizj = liziz.LIZJ();
        }
        0d3.LIZ(jsonObject, "current_user_id", lizj);
        String s2;
        if (n != 2) {
            if (n != 4) {
                s2 = s;
            }
            else if (b) {
                if (1NN.LLFF.LIZ().LJIIZILJ) {
                    s2 = "inviter";
                }
                else {
                    s2 = "invitee";
                }
            }
            else {
                s2 = "audience";
            }
        }
        else if (b) {
            s2 = "anchor";
        }
        else {
            s2 = "guest";
        }
        0d3.LIZ(jsonObject, "role_type", s2);
        0d3.LIZ(jsonObject, "mode", (long)n);
        this.LIZJ(jsonObject);
    }
    
    public final void LIZ(final Throwable t, final JSONObject jsonObject) {
        CTM.LIZ((Object)jsonObject);
        if (t != null) {
            if (t instanceof 1Ev) {
                0d3.LIZ(jsonObject, "error_type", "api_error");
                final 1Ev 1Ev = (1Ev)t;
                0d3.LIZ(jsonObject, "error_code", (long)1Ev.getErrorCode());
                0d3.LIZ(jsonObject, "error_msg", 1Ev.getErrorMsg());
            }
            else if (t instanceof 0Vr) {
                0d3.LIZ(jsonObject, "error_type", "net_error");
                0d3.LIZ(jsonObject, "error_code", (long)((0Vr)t).statusCode);
                0d3.LIZ(jsonObject, "error_msg", t.getMessage());
            }
            else {
                0d3.LIZ(jsonObject, "error_type", "unknow");
                0d3.LIZ(jsonObject, "error_code", -1L);
                0d3.LIZ(jsonObject, "error_msg", t.getClass().getName());
            }
        }
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        String idStr;
        if (Room.isValid(room)) {
            if (room == null) {
                n.LIZIZ();
            }
            idStr = room.getIdStr();
        }
        else {
            idStr = "0";
        }
        long ownerUserId;
        if (Room.isValid(room)) {
            if (room == null) {
                n.LIZIZ();
            }
            ownerUserId = room.getOwnerUserId();
        }
        else {
            ownerUserId = 0L;
        }
        0d3.LIZ(jsonObject, "room_id", idStr);
        0d3.LIZ(jsonObject, "anchor_id", ownerUserId);
    }
    
    public final void LIZ(final JSONObject jsonObject, final long n) {
        CTM.LIZ((Object)jsonObject);
        if (!jsonObject.has("channel_id")) {
            0d3.LIZ(jsonObject, "channel_id", n);
        }
    }
    
    public final <T> void LIZ(final JSONObject jsonObject, final 0z4<T, ?> 0z4) {
        CTM.LIZ((Object)jsonObject, (Object)0z4);
        0d3.LIZ(jsonObject, "request_type", String.valueOf(0z4.requestType));
        0d3.LIZ(jsonObject, "response", 0b8.a.LIZIZ.LIZIZ((Object)0z4));
    }
    
    public final void LIZ(final JSONObject jsonObject, final LinkMessage linkMessage) {
        CTM.LIZ((Object)jsonObject, (Object)linkMessage);
        0d3.LIZ(jsonObject, "channel_id", linkMessage.LIZIZ);
        0d3.LIZ(jsonObject, "message_from", String.valueOf(((H31)linkMessage).getMessageFrom()));
        0d3.LIZ(jsonObject, "message_create_time", ((HDi)linkMessage).baseMessage.LIZ);
        0d3.LIZ(jsonObject, "message_fetch_time", ((HDi)linkMessage).timestamp);
        0d3.LIZ(jsonObject, "transfer_extra", linkMessage.LJIJ);
        0d3.LIZ(jsonObject, "delay_time", linkMessage.LIZJ());
        final long liz = Gqs.LIZ();
        0d3.LIZ(jsonObject, "server_timestamp", liz);
        0d3.LIZ(jsonObject, "fetch_delay_time", liz - ((HDi)linkMessage).timestamp);
        0d3.LIZ(jsonObject, "message", 0b8.a.LIZIZ.LIZIZ((Object)linkMessage));
    }
    
    public final void LIZ(final JSONObject jsonObject, final LinkMicBattleMessage linkMicBattleMessage) {
        CTM.LIZ((Object)jsonObject, (Object)linkMicBattleMessage);
        0d3.LIZ(jsonObject, "battle_id", linkMicBattleMessage.LIZ);
        0d3.LIZ(jsonObject, "message_create_time", ((HDi)linkMicBattleMessage).baseMessage.LIZ);
        0d3.LIZ(jsonObject, "message_fetch_time", ((HDi)linkMicBattleMessage).timestamp);
        0d3.LIZ(jsonObject, "message", 0b8.a.LIZIZ.LIZIZ((Object)linkMicBattleMessage));
    }
    
    public final void LIZ(final JSONObject jsonObject, final String s, final Object o) {
        CTM.LIZ((Object)jsonObject, (Object)s);
        if (o == null) {
            return;
        }
        if (o instanceof Long) {
            0d3.LIZ(jsonObject, s, ((Number)o).longValue());
            return;
        }
        if (o instanceof Float) {
            0d3.LIZ(jsonObject, s, ((Number)o).floatValue());
            return;
        }
        if (o instanceof Double) {
            0d3.LIZ(jsonObject, s, ((Number)o).doubleValue());
            return;
        }
        if (o instanceof JSONObject) {
            0d3.LIZ(jsonObject, s, (JSONObject)o);
            return;
        }
        if (o instanceof String) {
            0d3.LIZ(jsonObject, s, (String)o);
            return;
        }
        0d3.LIZ(jsonObject, s, o.toString());
    }
    
    public final void LIZ(final JSONObject jsonObject, final Throwable t) {
        CTM.LIZ((Object)jsonObject);
        if (t != null) {
            final String s = t.toString();
        }
        else {
            final String s = null;
        }
        String s;
        int n;
        if (t instanceof 1Ev) {
            final 1Ev 1Ev = (1Ev)t;
            n = 1Ev.getErrorCode();
            s = 1Ev.getErrorMsg();
        }
        else if (t instanceof 0Vr) {
            n = ((0Vr)t).statusCode;
            s = t.getMessage();
        }
        else {
            n = 100001;
        }
        0d3.LIZ(jsonObject, "error_msg", (long)n);
        0d3.LIZ(jsonObject, "error_detail", s);
        if (t != null) {
            0d3.LIZ(jsonObject, "error_class", t.getClass().getName());
        }
    }
    
    public final void LIZ(final boolean b, final JSONObject jsonObject) {
        CTM.LIZ((Object)jsonObject);
        for (final Map.Entry<String, V> entry : this.LJ(b).entrySet()) {
            if (!jsonObject.has((String)entry.getKey())) {
                final V value = entry.getValue();
                if (value == null) {
                    continue;
                }
                this.LIZ(jsonObject, entry.getKey(), value);
            }
        }
        this.LIZJ(jsonObject);
    }
    
    public final void LIZIZ(final JSONObject jsonObject) {
        CTM.LIZ((Object)jsonObject);
        for (final Map.Entry<String, V> entry : this.LJ().entrySet()) {
            if (!jsonObject.has((String)entry.getKey())) {
                final V value = entry.getValue();
                if (value == null) {
                    continue;
                }
                this.LIZ(jsonObject, entry.getKey(), value);
            }
        }
        this.LIZJ(jsonObject);
    }
    
    public final void LIZJ(final JSONObject jsonObject) {
        CTM.LIZ((Object)jsonObject);
        if (!jsonObject.has("server_timestamp")) {
            0d3.LIZ(jsonObject, "server_timestamp", Gqs.LIZ());
        }
        if (!jsonObject.has("client_and_server_diff_time")) {
            0d3.LIZ(jsonObject, "client_and_server_diff_time", Gl0.LIZ);
        }
        if (!jsonObject.has("client_timestamp")) {
            0d3.LIZ(jsonObject, "client_timestamp", System.currentTimeMillis());
        }
    }
    
    public final HashMap<String, Object> LJ() {
        final HashMap hashMap = new HashMap();
        final 1NN liz = 1NN.LLFF.LIZ();
        hashMap.put("channel_id", liz.LJ);
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        final boolean valid = Room.isValid(room);
        final String s = "0";
        String idStr;
        if (valid) {
            if (room == null) {
                n.LIZIZ();
            }
            idStr = room.getIdStr();
        }
        else {
            idStr = "0";
        }
        hashMap.put("room_id", idStr);
        hashMap.put("vendor", String.valueOf(liz.LIZLLL().getValue()));
        String s2;
        if (liz.LJIIZILJ) {
            s2 = "inviter";
        }
        else {
            s2 = "invitee";
        }
        hashMap.put("role_type", s2);
        final boolean valid2 = Room.isValid(room);
        final long n = 0L;
        long ownerUserId;
        if (valid2) {
            if (room == null) {
                kotlin.jvm.internal.n.LIZIZ();
            }
            ownerUserId = room.getOwnerUserId();
        }
        else {
            ownerUserId = 0L;
        }
        hashMap.put("user_id", ownerUserId);
        hashMap.put("guest_user_id", liz.LJFF);
        hashMap.put("link_mic_id", liz.LJJJJZI);
        long n2 = n;
        if (liz.LJJIJL) {
            n2 = 1L;
        }
        hashMap.put("rtc_join_channel_advance", n2);
        hashMap.put("server_auto_joinchannel", true);
        final 0kd lizj = liz.LIZJ();
        String name;
        if (lizj != null) {
            name = lizj.name();
        }
        else {
            name = null;
        }
        hashMap.put("link_state", name);
        hashMap.put("device_score", TTliveAnchorDeviceScoreSetting.INSTANCE.getValue());
        hashMap.put("network_type", (long)TTNetInit.getEffectiveConnectionType());
        if (hashMap.get("invitee_list") == null) {
            hashMap.put("invitee_list", 0xg.LIZ(1NN.LLFF.LIZ().LJIILL));
        }
        hashMap.put("server_timestamp", Gqs.LIZ());
        String s3 = s;
        if (CoHostNeedWaitRtcJoinChannelSucceed.INSTANCE.getValue()) {
            s3 = "1";
        }
        hashMap.put("need_wait_rtc_joinchannel_succeed", s3);
        return hashMap;
    }
    
    public final HashMap<String, Object> LJ(final boolean b) {
        final HashMap hashMap = new HashMap();
        final GCe liz = GCe.LIZ();
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        String idStr;
        if (Room.isValid(room)) {
            if (room == null) {
                n.LIZIZ();
            }
            idStr = room.getIdStr();
        }
        else {
            idStr = "0";
        }
        final boolean valid = Room.isValid(room);
        final long n = 0L;
        long ownerUserId;
        if (valid) {
            if (room == null) {
                kotlin.jvm.internal.n.LIZIZ();
            }
            ownerUserId = room.getOwnerUserId();
        }
        else {
            ownerUserId = 0L;
        }
        hashMap.put("room_id", idStr);
        hashMap.put("anchor_id", ownerUserId);
        hashMap.put("in_rtc_room", liz.LJJIIJZLJL);
        String s;
        if (b) {
            s = "anchor";
        }
        else {
            s = "guest";
        }
        hashMap.put("role_type", s);
        final String s2 = "";
        kotlin.jvm.internal.n.LIZIZ((Object)liz, "");
        final Config$Vendor fromValue = Config$Vendor.fromValue(liz.LJIIJJI);
        kotlin.jvm.internal.n.LIZIZ((Object)fromValue, "");
        hashMap.put("vendor", String.valueOf(fromValue.getValue()));
        hashMap.put("link_mic_id", liz.LIZIZ());
        final GIK liziz = Fk2.LIZ().LIZIZ();
        long lizj = n;
        if (liziz != null) {
            lizj = liziz.LIZJ();
        }
        hashMap.put("current_user_id", lizj);
        hashMap.put("current_linkmic_id", 5ob.LIZ.LIZ(lizj));
        hashMap.put("server_timestamp", Gqs.LIZ());
        String s3;
        if (!b && 1NO.LIZ().LJI == 2) {
            s3 = "audio";
        }
        else {
            s3 = "video";
        }
        hashMap.put("link_type", s3);
        hashMap.put("device_score", TTliveAnchorDeviceScoreSetting.INSTANCE.getValue());
        hashMap.put("network_type", (long)TTNetInit.getEffectiveConnectionType());
        if (!b) {
            hashMap.put("rtc_init_advance", LiveGuestLinkPreInitEnableSetting.INSTANCE.getValue());
        }
        String liz2 = GdQ.LIZ;
        if (liz2 == null) {
            liz2 = s2;
        }
        hashMap.put("guest_ab_params", liz2);
        hashMap.put("live_ab_label", LiveAbLabelSetting.INSTANCE.getValue());
        hashMap.put("sequential_enable", LinkmicSequentialEventReportSetting.INSTANCE.getValue().LIZ);
        return hashMap;
    }
}

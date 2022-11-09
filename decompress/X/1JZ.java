// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteContent;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteMessageExtra;
import com.bytedance.covode.number.Covode;

public final class 1jz extends 1d9
{
    public static long LIZ;
    public static long LIZIZ;
    public static long LIZJ;
    public static final 1jz LIZLLL;
    
    static {
        Covode.recordClassIndex(7202);
        LIZLLL = new 1jz();
        1jz.LIZ = System.currentTimeMillis();
        1jz.LIZIZ = System.currentTimeMillis();
        System.currentTimeMillis();
        1jz.LIZJ = System.currentTimeMillis();
    }
    
    public static final String LIZ(final LinkerInviteMessageExtra linkerInviteMessageExtra) {
        String s;
        if (linkerInviteMessageExtra != null) {
            final int liziz = linkerInviteMessageExtra.LIZIZ;
            if (liziz != 1) {
                if (liziz != 2) {
                    if (liziz != 5) {
                        if (liziz != 7) {
                            s = 0xg.LIZ(0kf.NONE);
                        }
                        else {
                            s = 0xg.LIZ(0kf.RANDOM_LINK_MIC_RECOMMEND);
                        }
                    }
                    else {
                        s = 0xg.LIZ(0kf.RANDOM_LINK_MIC_INVITE);
                    }
                }
                else {
                    s = 0xg.LIZ(0kf.RECOMMEND_INVITE);
                }
            }
            else {
                s = 0xg.LIZ(0kf.FOLLOW_INVITE);
            }
        }
        else {
            s = "unknow";
        }
        return s;
    }
    
    public static final void LIZ() {
        1jz.LIZLLL.LIZ("reply_error", new JSONObject(), 0);
    }
    
    public static final void LIZ(final int n, final 1dl<?> 1dl, final Map<String, ?> map) {
        CTM.LIZ((Object)1dl);
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "answer", String.valueOf(n));
        0d3.LIZ(jsonObject, "cost", System.currentTimeMillis() - 1jz.LIZIZ);
        1jz.LIZLLL.LIZ(jsonObject, (0z4<Object, ?>)1dl);
        if (map != null) {
            for (final Map.Entry<String, V> entry : map.entrySet()) {
                1jz.LIZLLL.LIZ(jsonObject, entry.getKey(), entry.getValue());
            }
        }
        1jz.LIZLLL.LIZ("reply_succeed", jsonObject, 0);
    }
    
    public static final void LIZ(final int n, final Map<String, ?> map) {
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "reply_status", String.valueOf(n));
        if (map != null) {
            for (final Map.Entry<String, V> entry : map.entrySet()) {
                1jz.LIZLLL.LIZ(jsonObject, entry.getKey(), entry.getValue());
            }
        }
        1jz.LIZLLL.LIZ("reply_request", jsonObject, 0);
        1jz.LIZIZ = System.currentTimeMillis();
    }
    
    public static final void LIZ(final long n) {
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "invite_room_id", n);
        0d3.LIZ(jsonObject, "is_new_arch", false);
        1jz.LIZLLL.LIZ("invite_click", jsonObject, 0);
    }
    
    public static final void LIZ(final LinkMessage linkMessage, final long n, final long n2, final LinkerInviteMessageExtra linkerInviteMessageExtra) {
        CTM.LIZ((Object)linkMessage);
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "channel_id", linkMessage.LIZIZ);
        final LinkerInviteContent lizlll = linkMessage.LIZLLL;
        String value;
        if (lizlll != null) {
            value = String.valueOf(lizlll.LJ);
        }
        else {
            value = null;
        }
        0d3.LIZ(jsonObject, "vendor", value);
        final LinkerInviteContent lizlll2 = linkMessage.LIZLLL;
        long liz;
        if (lizlll2 != null) {
            liz = lizlll2.LIZ;
        }
        else {
            liz = 0L;
        }
        0d3.LIZ(jsonObject, "guest_user_id", liz);
        0d3.LIZ(jsonObject, "message_available_time", linkMessage.LJ());
        0d3.LIZ(jsonObject, "at_least_available_time", n);
        0d3.LIZ(jsonObject, "limit_time", n2);
        0d3.LIZ(jsonObject, "invitee_list", LIZ(linkerInviteMessageExtra));
        0d3.LIZ(jsonObject, "msgId", ((H31)linkMessage).getMessageId());
        1jz.LIZLLL.LIZ("invite_message_delay", jsonObject, 0);
    }
    
    public static final void LIZ(final String s) {
        CTM.LIZ((Object)s);
        final JSONObject jsonObject = new JSONObject();
        1jz.LIZLLL.LIZ(jsonObject);
        0d3.LIZ(jsonObject, "event_id", s);
        0d8.LIZ("ttlive_client_linkmic_room", 1, jsonObject);
    }
    
    public static final void LIZ(final Throwable t) {
        final JSONObject jsonObject = new JSONObject();
        final 1jz lizlll = 1jz.LIZLLL;
        lizlll.LIZ(jsonObject, t);
        if (t instanceof 0kk) {
            0d3.LIZ(jsonObject, "is_show_violation_dialog", true);
        }
        0d3.LIZ(jsonObject, "cost", System.currentTimeMillis() - 1jz.LIZ);
        lizlll.LIZ("invite_failed", jsonObject, 1);
    }
    
    public static final void LIZ(final boolean b) {
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "push_stream_advance", String.valueOf(b));
        1jz.LIZLLL.LIZ("rtc_push_stream", jsonObject, 0);
        ((I5h)I5o.LIZIZ).LIZJ("push_stream", jsonObject);
    }
    
    public static final void LIZIZ() {
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "rtc_ext_info", 1NN.LLFF.LIZ().LJJIJIL);
        1jz.LIZLLL.LIZ("rtc_join_channel_start", jsonObject, 0);
        ((I5h)I5o.LIZIZ).LIZJ("join_channel", (JSONObject)null);
    }
    
    public static final void LIZJ() {
        1jz.LIZLLL.LIZ("rtc_stop", new JSONObject(), 0);
    }
    
    public final void LIZ(final String s, final JSONObject jsonObject, final int n) {
        this.LIZIZ(jsonObject);
        0d3.LIZ(jsonObject, "event_id", s);
        if (jsonObject.optLong("channel_id") > 0L) {
            0d3.LIZ(jsonObject, "report_id", String.valueOf(1NN.LLFF.LIZ().LJJLIIIJJIZ));
            final 1NN liz = 1NN.LLFF.LIZ();
            ++liz.LJJLIIIJJIZ;
        }
        0d8.LIZ("ttlive_client_anchor_link_mic_monitor", n, jsonObject);
    }
    
    public final void LIZ(final JSONObject jsonObject) {
        0d3.LIZ(jsonObject, "channel_id", 1NN.LLFF.LIZ().LJ);
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
        0d3.LIZ(jsonObject, "room_id", idStr);
        final long n = 0L;
        long ownerUserId;
        if (room != null) {
            ownerUserId = room.getOwnerUserId();
        }
        else {
            ownerUserId = 0L;
        }
        0d3.LIZ(jsonObject, "anchor_id", ownerUserId);
        final GIK liziz = Fk2.LIZ().LIZIZ();
        long lizj = n;
        if (liziz != null) {
            lizj = liziz.LIZJ();
        }
        0d3.LIZ(jsonObject, "current_user_id", lizj);
    }
    
    public final JSONObject LIZLLL() {
        final JSONObject jsonObject = new JSONObject();
        final 1NN liz = 1NN.LLFF.LIZ();
        String s;
        if (liz.LJIIZILJ) {
            s = "inviter";
        }
        else {
            s = "invitee";
        }
        jsonObject.put("role_type", (Object)s);
        String s2;
        if (liz.LJIILIIL) {
            s2 = "random";
        }
        else {
            s2 = "normal";
        }
        jsonObject.put("from", (Object)s2);
        return jsonObject;
    }
}

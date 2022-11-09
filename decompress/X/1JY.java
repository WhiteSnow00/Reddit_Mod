// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.TextUtils;
import java.util.HashMap;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.n;
import java.util.Objects;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkReplyResult;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import com.bytedance.covode.number.Covode;

@0kX(LIZ = "LINK_LOGGER")
public final class 1jy extends 1ct
{
    static {
        Covode.recordClassIndex(7201);
    }
    
    private final JSONObject LIZJ() {
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
    
    @Override
    public final void LIZ(final Throwable t, final Map<String, Object> map) {
        if (map != null) {
            final Integer n = map.get("reply_status");
            if (n != null) {
                n.intValue();
                final int intValue = n;
                final JSONObject jsonObject = new JSONObject();
                0d3.LIZ(jsonObject, "error_code", 101L);
                1jz.LIZLLL.LIZ(jsonObject, t);
                for (final Map.Entry<String, V> entry : map.entrySet()) {
                    1jz.LIZLLL.LIZ(jsonObject, entry.getKey(), entry.getValue());
                }
                0d3.LIZ(jsonObject, "answer", String.valueOf(intValue));
                0d3.LIZ(jsonObject, "cost", System.currentTimeMillis() - 1jz.LIZIZ);
                1jz.LIZLLL.LIZ("reply_failed", jsonObject, 1);
                if (intValue == 1) {
                    1mk.LIZ(0xv.LIZ(jsonObject));
                }
                final JSONObject jsonObject2 = new JSONObject();
                0d3.LIZ(jsonObject2, "reply_status", n);
                0d3.LIZ(jsonObject2, "err_code", -1);
                0d3.LIZ(jsonObject2, "err_msg", String.valueOf(t));
                ((I5h)I5o.LIZIZ).LIZIZ("reply", jsonObject2);
                final JSONObject lizj = this.LIZJ();
                0d3.LIZ(lizj, "end_reason", "reply_failed");
                ((I5h)I5o.LIZIZ).LIZ(2, lizj);
            }
        }
        0xo.LIZJ("LinkCross_Reply_Failed", "throwable:".concat(String.valueOf(t)));
    }
    
    @Override
    public final void LIZ(final Map<String, Object> map) {
        CTM.LIZ((Object)map);
        final Integer n = map.get("reply_status");
        if (n != null) {
            n.intValue();
            if (n == 1) {
                1jz.LIZ(n, null);
            }
            else {
                1jz.LIZ(n, map);
            }
            final StringBuilder sb = new StringBuilder("channelId:");
            sb.append(map.get("channel_id"));
            sb.append("; roomId:");
            sb.append(map.get("room_id"));
            sb.append("; replyStatus:");
            sb.append(n);
            sb.append("; guestUserId:");
            sb.append(map.get("guest_user_id"));
            0xo.LIZJ("LinkCross_Reply", sb.toString());
            final JSONObject jsonObject = new JSONObject();
            0d3.LIZ(jsonObject, "reply_status", n);
            ((I5h)I5o.LIZIZ).LIZ("reply", jsonObject);
        }
    }
    
    @Override
    public final void LIZIZ(final Throwable t, final Map<String, Object> map) {
        if (map == null) {
            return;
        }
        final Integer n = map.get("finishCode");
        if (n != null) {
            final int intValue = n;
            final Long n2 = (Long)map.get("channel_id");
            long longValue;
            if (n2 != null) {
                longValue = n2;
            }
            else {
                longValue = 0L;
            }
            final JSONObject jsonObject = new JSONObject();
            1jz.LIZLLL.LIZ(jsonObject, longValue);
            0d3.LIZ(jsonObject, "finish_code", String.valueOf(intValue));
            1jz.LIZLLL.LIZ(jsonObject, t);
            0d3.LIZ(jsonObject, "cost", System.currentTimeMillis() - 1jz.LIZJ);
            1jz.LIZLLL.LIZ("finish_failed", jsonObject, 1);
            0xo.LIZJ("LinkCross_Finish_Failed", "throwable:".concat(String.valueOf(t)));
            final JSONObject jsonObject2 = new JSONObject();
            0d3.LIZ(jsonObject2, "finish_code", intValue);
            0d3.LIZ(jsonObject2, "error_code", -1);
            0d3.LIZ(jsonObject2, "channel_id", longValue);
            0d3.LIZ(jsonObject2, "error_msg", String.valueOf(t));
            ((I5h)I5n.LIZ).LIZIZ("finish_link_mic", jsonObject2);
            final JSONObject lizj = this.LIZJ();
            0d3.LIZ(lizj, "end_reason", "finish_failed");
            ((I5h)I5n.LIZ).LIZ(2, lizj);
        }
    }
    
    @Override
    public final void LIZIZ(final Map<String, Object> map) {
        CTM.LIZ((Object)map);
        final 0xK 0xK = map.get("response");
        if (0xK != null) {
            if (0xK.LIZ instanceof LinkReplyResult) {
                final Object liz = 0xK.LIZ;
                Objects.requireNonNull(liz, "null cannot be cast to non-null type com.bytedance.android.livesdk.chatroom.model.interact.LinkReplyResult");
                if (liz != null) {
                    final String liziz = 0b8.a.LIZIZ.LIZIZ(liz);
                    n.LIZIZ((Object)liziz, "");
                    0xo.LIZJ("LinkCross_Reply_Success", liziz);
                }
            }
            final 1dl 1dl = (1dl)0xK.LIZ;
            if (1dl != null) {
                final 0xK value = map.get("reply_status");
                Objects.requireNonNull((Integer)value, "null cannot be cast to non-null type kotlin.Int");
                1jz.LIZ((int)value, 1dl, map);
                final JSONObject jsonObject = new JSONObject();
                final 0xK value2 = map.get("reply_status");
                Objects.requireNonNull((Integer)value2, "null cannot be cast to non-null type kotlin.Int");
                0d3.LIZ(jsonObject, "reply_status", (int)value2);
                0d3.LIZ(jsonObject, "err_code", 0);
                ((I5h)I5o.LIZIZ).LIZIZ("reply", jsonObject);
                final 0xK value3 = map.get("reply_status");
                Objects.requireNonNull((Integer)value3, "null cannot be cast to non-null type kotlin.Int");
                if ((int)value3 != 1) {
                    final JSONObject lizj = this.LIZJ();
                    0d3.LIZ(lizj, "end_reason", "not_agree");
                    ((I5h)I5o.LIZIZ).LIZ(2, lizj);
                }
            }
        }
    }
    
    @Override
    public final void LIZJ(final Map<String, Object> map) {
        CTM.LIZ((Object)map);
        final Long value = map.get("to_room_id");
        Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.Long");
        final long longValue = value;
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "invite_room_id", longValue);
        0d3.LIZ(jsonObject, "is_new_anchor", false);
        1jz.LIZLLL.LIZ("invite_request", jsonObject, 0);
        1jz.LIZ = System.currentTimeMillis();
    }
    
    @Override
    public final void LIZLLL(final Map<String, Object> map) {
        CTM.LIZ((Object)map);
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null) {
            final 1NN liz = 1NN.LLFF.LIZ();
            String s;
            if (liz.LJIILL == 0kf.FOLLOW_INVITE) {
                s = "mutual_follow";
            }
            else {
                s = "recommend";
            }
            final HashMap hashMap = new HashMap();
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            hashMap.put("room_id", room.getIdStr());
            hashMap.put("invitee_id", String.valueOf(liz.LJFF));
            hashMap.put("invitee_list", s);
            hashMap.put("invite_scene", 0xy.LIZIZ());
            0xy.LIZ(hashMap);
            final String ljjijlij = liz.LJJIJLIJ;
            if (!TextUtils.isEmpty((CharSequence)ljjijlij)) {
                hashMap.put("request_id", ljjijlij);
            }
            final String ljljlll = 1NN.LLFF.LIZ().LJLJLLL;
            String s2;
            if (ljljlll != null && ljljlll.equals(String.valueOf(1NN.LLFF.LIZ().LJFF))) {
                s2 = "1";
            }
            else {
                s2 = "0";
            }
            hashMap.put("is_icon_show_anchor", s2);
            hashMap.put("log_id", 1NN.LLFF.LIZ().LJLJLJ);
            0xy.LIZ("livesdk_anchor_connection_invite_success", hashMap);
        }
    }
    
    @Override
    public final void LJ(final Map<String, Object> map) {
        CTM.LIZ((Object)map);
        final Integer n = map.get("finishCode");
        if (n != null) {
            final int intValue = n;
            final Integer value = map.get("channel_id");
            Objects.requireNonNull(Long.valueOf(value), "null cannot be cast to non-null type kotlin.Long");
            final long longValue = value;
            0xo.LIZJ("FINISH_CROSS", "finishCode = ".concat(String.valueOf(intValue)));
            final JSONObject jsonObject = new JSONObject();
            1jz.LIZLLL.LIZ(jsonObject, longValue);
            0d3.LIZ(jsonObject, "finish_code", String.valueOf(intValue));
            1jz.LIZLLL.LIZ("finish_request", jsonObject, 0);
            0d8.LIZ("ttlive_client_linkmic_anchor_finish", 0, 0xv.LIZ(jsonObject));
            1jz.LIZJ = System.currentTimeMillis();
            0xo.LIZJ("LinkCross_Finish", "channelId:".concat(String.valueOf(longValue)));
            ((I5h)I5n.LIZ).LIZ("finish_link_mic", (JSONObject)null);
        }
    }
    
    @Override
    public final void LJFF(final Map<String, Object> map) {
        CTM.LIZ((Object)map);
        final Integer n = map.get("finishCode");
        if (n != null) {
            final int intValue = n;
            final Integer value = map.get("channel_id");
            Objects.requireNonNull(Long.valueOf(value), "null cannot be cast to non-null type kotlin.Long");
            final long longValue = value;
            final 0xK 0xK = (0xK)map.get("response");
            if (0xK != null) {
                final 1dl 1dl = (1dl)0xK.LIZ;
                if (1dl != null) {
                    CTM.LIZ((Object)1dl);
                    final JSONObject jsonObject = new JSONObject();
                    1jz.LIZLLL.LIZ(jsonObject, (0z4<Object, ?>)1dl);
                    1jz.LIZLLL.LIZ(jsonObject, longValue);
                    0d3.LIZ(jsonObject, "finish_code", String.valueOf(intValue));
                    0d3.LIZ(jsonObject, "cost", System.currentTimeMillis() - 1jz.LIZJ);
                    1jz.LIZLLL.LIZ("finish_succeed", jsonObject, 0);
                }
                0xo.LIZ("LinkCross_Finish_Success");
                final JSONObject jsonObject2 = new JSONObject();
                0d3.LIZ(jsonObject2, "finish_code", intValue);
                0d3.LIZ(jsonObject2, "error_code", 0);
                0d3.LIZ(jsonObject2, "channel_id", longValue);
                ((I5h)I5n.LIZ).LIZIZ("finish_link_mic", jsonObject2);
                final JSONObject lizj = this.LIZJ();
                0d3.LIZ(lizj, "end_reason", "close_co_host");
                0d3.LIZ(lizj, "finish_code", intValue);
                ((I5h)I5n.LIZ).LIZ(1, lizj);
            }
        }
    }
}

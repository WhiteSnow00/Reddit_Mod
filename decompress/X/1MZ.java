// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdk.model.message.RankTextMessage;
import android.util.ArrayMap;
import com.bytedance.android.livesdk.model.message.SubNotifyMessage;
import java.util.Map;
import java.util.HashMap;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;

public final class 1mz extends GIB
{
    public final String LIZ;
    
    static {
        Covode.recordClassIndex(10724);
    }
    
    public 1mz(final User user, final int n, final String liz) {
        super(user, n);
        this.LIZ = liz;
    }
    
    public final void LIZ(final View view, final UserProfileEvent userProfileEvent) {
        super.LIZ(view, userProfileEvent);
        final Object tag = view.getTag(2131372767);
        if (tag instanceof String) {
            userProfileEvent.mEventPage = tag.toString();
        }
        final Object tag2 = view.getTag(2131372766);
        if (tag2 instanceof 2Gk) {
            final 2Gk 2Gk = (2Gk)tag2;
            final H31 ljiiliil = 2Gk.LJIILIIL;
            if (2Gk.LJFF.LIZIZ) {
                userProfileEvent.clickMethod = "pin";
                final 10h lizj = 2Gk.LJFF.LIZJ;
                if (lizj != null) {
                    userProfileEvent.pinId = lizj.LIZIZ();
                    userProfileEvent.pinMsgId = lizj.LIZJ();
                }
            }
            else {
                userProfileEvent.clickMethod = "normal";
            }
            if (ljiiliil != null) {
                userProfileEvent.msgId = ljiiliil.getMessageId();
                userProfileEvent.setClickUserPosition(this.LIZ);
                if (ljiiliil instanceof ChatMessage) {
                    userProfileEvent.content = ((ChatMessage)ljiiliil).LIZIZ;
                    return;
                }
                if (ljiiliil instanceof MemberMessage) {
                    final MemberMessage memberMessage = (MemberMessage)ljiiliil;
                    if (memberMessage.LJIILL != null && "pm_mt_guidance_interaction".equals(memberMessage.LJIILL.LIZ)) {
                        final HashMap<String, String> hashMap = new HashMap<String, String>();
                        hashMap.put("event_type", "click");
                        hashMap.put("click_module", "username");
                        final Gkn liz = Gkn.LJFF.LIZ("livesdk_anchor_interact_notice");
                        liz.LIZ((Map)hashMap);
                        liz.LIZ();
                        liz.LIZLLL();
                    }
                    return;
                }
                final boolean b = ljiiliil instanceof SubNotifyMessage;
                final String s = "";
                Object extraParams;
                if (b) {
                    userProfileEvent.setClickUserPosition("subscribe_message");
                    final SubNotifyMessage subNotifyMessage = (SubNotifyMessage)ljiiliil;
                    final ArrayMap arrayMap = new ArrayMap();
                    String s2;
                    if (subNotifyMessage.LIZLLL == 0) {
                        s2 = "one_month";
                    }
                    else if (subNotifyMessage.LIZLLL == 1) {
                        s2 = "auto_sub";
                    }
                    else {
                        s2 = "";
                    }
                    final int lj = subNotifyMessage.LJ;
                    String s3;
                    if (lj != 0) {
                        if (lj != 1) {
                            if (lj != 2) {
                                if (lj != 3) {
                                    s3 = s;
                                }
                                else {
                                    s3 = "resubscribe_beyond_grace_period";
                                }
                            }
                            else {
                                s3 = "resubscribe_within_grace_period";
                            }
                        }
                        else {
                            s3 = "resubscribe";
                        }
                    }
                    else {
                        s3 = "first_subscribe";
                    }
                    ((Map<String, String>)arrayMap).put("subscribe_type", s2);
                    ((Map<String, String>)arrayMap).put("sub_message_type", s3);
                    extraParams = arrayMap;
                }
                else {
                    if (!(ljiiliil instanceof RankTextMessage)) {
                        return;
                    }
                    userProfileEvent.setClickUserPosition("top_active_user_rank_message");
                    final RankTextMessage rankTextMessage = (RankTextMessage)ljiiliil;
                    final ArrayMap arrayMap2 = new ArrayMap();
                    long longValue;
                    if (rankTextMessage.LIZIZ != null) {
                        longValue = rankTextMessage.LIZIZ;
                    }
                    else {
                        longValue = 0L;
                    }
                    long longValue2;
                    if (rankTextMessage.LIZJ != null) {
                        longValue2 = rankTextMessage.LIZJ;
                    }
                    else {
                        longValue2 = 0L;
                    }
                    String s4 = s;
                    if (longValue >= 0L) {
                        s4 = s;
                        if (longValue2 > 0L) {
                            if (longValue > 3L && longValue2 <= 3L) {
                                s4 = "above_top3_change";
                            }
                            else {
                                s4 = s;
                                if (longValue2 < 3L) {
                                    s4 = s;
                                    if (longValue2 < longValue) {
                                        s4 = "top3_change";
                                    }
                                }
                            }
                            ((Map<String, String>)arrayMap2).put("to_user_rank", String.valueOf(longValue2));
                        }
                    }
                    ((Map<String, String>)arrayMap2).put("top_active_user_rank_message_type", s4);
                    final long lizj2 = Fk2.LIZ().LIZIZ().LIZJ();
                    long ownerUserId;
                    if (DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class) != null) {
                        ownerUserId = ((Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class)).getOwnerUserId();
                    }
                    else {
                        ownerUserId = 0L;
                    }
                    extraParams = arrayMap2;
                    if (lizj2 != 0L) {
                        extraParams = arrayMap2;
                        if (DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class) != null) {
                            if (lizj2 == ownerUserId) {
                                ((Map<String, String>)arrayMap2).put("from_user_rank", "null");
                                extraParams = arrayMap2;
                            }
                            else {
                                extraParams = arrayMap2;
                                if (((Fgy)DataChannelGlobal.LIZJ.LIZIZ((Class)HQP.class)).LJFF != null) {
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append(((Fgy)DataChannelGlobal.LIZJ.LIZIZ((Class)HQP.class)).LJFF.LJJJJZ);
                                    ((Map<String, String>)arrayMap2).put("from_user_rank", sb.toString());
                                    extraParams = arrayMap2;
                                }
                            }
                        }
                    }
                }
                userProfileEvent.setExtraParams((Map)extraParams);
            }
        }
    }
}

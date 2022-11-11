// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import com.bytedance.android.live.base.model.user.User;
import android.util.ArrayMap;
import java.util.Map;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.model.message.RankTextMessage;

public final class 2HY extends 2Gk<RankTextMessage>
{
    static {
        Covode.recordClassIndex(10876);
    }
    
    public 2HY(final RankTextMessage rankTextMessage) {
        super((H31)rankTextMessage);
    }
    
    private Map<String, String> LJ() {
        final ArrayMap arrayMap = new ArrayMap();
        long longValue;
        if (((RankTextMessage)super.LJIILIIL).LIZIZ != null) {
            longValue = ((RankTextMessage)super.LJIILIIL).LIZIZ;
        }
        else {
            longValue = 0L;
        }
        long longValue2;
        if (((RankTextMessage)super.LJIILIIL).LIZJ != null) {
            longValue2 = ((RankTextMessage)super.LJIILIIL).LIZJ;
        }
        else {
            longValue2 = 0L;
        }
        String s2;
        final String s = s2 = "";
        if (longValue >= 0L) {
            s2 = s;
            if (longValue2 > 0L) {
                if (longValue > 3L && longValue2 <= 3L) {
                    s2 = "above_top3_change";
                }
                else {
                    s2 = s;
                    if (longValue2 < 3L) {
                        s2 = s;
                        if (longValue2 < longValue) {
                            s2 = "top3_change";
                        }
                    }
                }
                ((Map<String, String>)arrayMap).put("to_user_rank", String.valueOf(longValue2));
            }
        }
        ((Map<String, String>)arrayMap).put("top_active_user_rank_message_type", s2);
        return (Map<String, String>)arrayMap;
    }
    
    private User LJJIIZ() {
        if (((HDi)super.LJIILIIL).baseMessage.LJIIIZ != null) {
            final List lizlll = ((HDi)super.LJIILIIL).baseMessage.LJIIIZ.LIZLLL;
            final ArrayList list = new ArrayList();
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            HYW.LIZ("", lizlll, (List)list, (Map)linkedHashMap, (HYY)this);
            if (list.size() > 0 && list.size() == linkedHashMap.size()) {
                for (int i = 0; i < list.size(); ++i) {
                    list.get(i);
                    final TextPiece textPiece = (TextPiece)linkedHashMap.get(i);
                    if (textPiece.LIZ == HYX.USER.getPieceType() && textPiece.LIZLLL != null && textPiece.LIZLLL.LIZ != null) {
                        return textPiece.LIZLLL.LIZ;
                    }
                }
            }
        }
        return null;
    }
    
    @Override
    public final void LIZ(final UserProfileEvent userProfileEvent) {
        if (this.LJJIIZ() != null) {
            userProfileEvent.user = this.LJJIIZ();
        }
        userProfileEvent.setClickUserPosition("top_active_user_rank_message");
        userProfileEvent.setExtraParams((Map)this.LJ());
    }
    
    @Override
    public final User LIZIZ() {
        return null;
    }
    
    @Override
    public final void LJIIJ() {
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_top_active_user_rank_message_show");
        liz.LIZ((Map)this.LJ());
        liz.LIZ();
        final boolean ljjijl = this.LJJIJL();
        final String s = "anchor";
        String s2;
        if (ljjijl) {
            s2 = "anchor";
        }
        else {
            s2 = "user";
        }
        liz.LIZ("user_type", s2);
        liz.LIZLLL();
        final Gkn liz2 = Gkn.LJFF.LIZ("livesdk_top_active_user_rank_message_send");
        liz2.LIZ((Map)this.LJ());
        liz2.LIZ();
        String s3;
        if (this.LJJIJL()) {
            s3 = s;
        }
        else {
            s3 = "user";
        }
        liz2.LIZ("user_type", s3);
        liz2.LIZLLL();
    }
    
    @Override
    public final CharSequence p_() {
        return null;
    }
}

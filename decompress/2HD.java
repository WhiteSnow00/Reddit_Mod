// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.Spannable;
import android.text.SpannableString;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import org.json.JSONObject;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import android.util.ArrayMap;
import java.util.Map;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.model.message.SubNotifyMessage;

public final class 2Hd extends 2Gk<SubNotifyMessage>
{
    static {
        Covode.recordClassIndex(10884);
    }
    
    public 2Hd(final SubNotifyMessage subNotifyMessage) {
        super((H31)subNotifyMessage);
    }
    
    private Map<String, String> LJ() {
        final ArrayMap arrayMap = new ArrayMap();
        final int lizlll = ((SubNotifyMessage)super.LJIILIIL).LIZLLL;
        String s = "";
        String s2;
        if (lizlll == 0) {
            s2 = "one_month";
        }
        else if (((SubNotifyMessage)super.LJIILIIL).LIZLLL == 1) {
            s2 = "auto_sub";
        }
        else {
            s2 = "";
        }
        final int lj = ((SubNotifyMessage)super.LJIILIIL).LJ;
        if (lj != 0) {
            if (lj != 1) {
                if (lj != 2) {
                    if (lj == 3) {
                        s = "resubscribe_beyond_grace_period";
                    }
                }
                else {
                    s = "resubscribe_within_grace_period";
                }
            }
            else {
                s = "resubscribe";
            }
        }
        else {
            s = "first_subscribe";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(((SubNotifyMessage)super.LJIILIIL).LJFF);
        ((Map<String, String>)arrayMap).put("subscribing_status", sb.toString());
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(((SubNotifyMessage)super.LJIILIIL).LJI);
        ((Map<String, String>)arrayMap).put("new_sub_message_type", sb2.toString());
        ((Map<String, String>)arrayMap).put("subscribe_type", s2);
        ((Map<String, String>)arrayMap).put("sub_message_type", s);
        return (Map<String, String>)arrayMap;
    }
    
    @Override
    public final void LIZ(final UserProfileEvent userProfileEvent) {
        if (this.LIZIZ() != null) {
            userProfileEvent.user = this.LIZIZ();
        }
        if (this.LIZIZ() == null && ((HDi)super.LJIILIIL).baseMessage.LJIIIZ != null) {
            final List lizlll = ((HDi)super.LJIILIIL).baseMessage.LJIIIZ.LIZLLL;
            final ArrayList list = new ArrayList();
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            HYW.LIZ("", lizlll, (List)list, (Map)linkedHashMap, (HYY)this);
            if (list.size() > 0 && list.size() == linkedHashMap.size()) {
                for (int i = 0; i < list.size(); ++i) {
                    list.get(i);
                    final TextPiece textPiece = (TextPiece)linkedHashMap.get(i);
                    if (textPiece.LIZ == HYX.USER.getPieceType() && textPiece.LIZLLL != null && textPiece.LIZLLL.LIZ != null) {
                        userProfileEvent.user = textPiece.LIZLLL.LIZ;
                        break;
                    }
                }
            }
        }
        userProfileEvent.setClickUserPosition("subscribe_message");
        userProfileEvent.setExtraParams((Map)this.LJ());
    }
    
    @Override
    public final User LIZIZ() {
        return ((SubNotifyMessage)super.LJIILIIL).LIZ;
    }
    
    @Override
    public final void LJIIJ() {
        final SubNotifyMessage subNotifyMessage = (SubNotifyMessage)super.LJIILIIL;
        if (subNotifyMessage.LJI == 0 && (subNotifyMessage.LJ == 0 || subNotifyMessage.LJ == 3) && this.LIZIZ() != null && Fk2.LIZ().LIZIZ() != null && Fk2.LIZ().LIZIZ().LIZ() != null && this.LIZIZ().getId() != Fk2.LIZ().LIZIZ().LIZ().getId()) {
            DataChannelGlobal.LIZJ.LIZ((Class)HQQ.class, (Object)new Gow(Long.valueOf(System.currentTimeMillis()), this.LIZIZ()));
        }
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_subscribe_message_show");
        liz.LIZ("fold_type", ((SubNotifyMessage)super.LJIILIIL).LIZIZ);
        liz.LIZ((Map)this.LJ());
        liz.LIZ();
        String s;
        if (this.LJJIJL()) {
            s = "anchor";
        }
        else {
            s = "user";
        }
        liz.LIZ("user_type", s);
        liz.LIZLLL();
        final H31 ljiiliil = super.LJIILIIL;
        CTM.LIZ((Object)ljiiliil);
        final JSONObject jsonObject = new JSONObject();
        CTM.LIZ((Object)jsonObject, (Object)ljiiliil);
        0d3.LIZ(jsonObject, "message_from", String.valueOf(ljiiliil.getMessageFrom()));
        0d3.LIZ(jsonObject, "message_create_time", ((HDi)ljiiliil).baseMessage.LIZ);
        0d3.LIZ(jsonObject, "message_fetch_time", ((HDi)ljiiliil).timestamp);
        0d3.LIZ(jsonObject, "fetch_delay_time", System.currentTimeMillis() + Gl0.LIZ - ((HDi)ljiiliil).timestamp);
        0d3.LIZ(jsonObject, "message", 0b8.a.LIZIZ.LIZIZ((Object)ljiiliil));
        Gkm.LIZJ.LIZ("subscription_notify_message", jsonObject);
    }
    
    @Override
    public final boolean LJIILL() {
        return ((SubNotifyMessage)super.LJIILIIL).LIZIZ == 1;
    }
    
    @Override
    public final boolean LJIILLIIL() {
        return ((SubNotifyMessage)super.LJIILIIL).LIZIZ < 2;
    }
    
    @Override
    public final boolean o_() {
        return ((HDi)super.LJIILIIL).baseMessage != null && ((HDi)super.LJIILIIL).baseMessage.LJIIIZ != null;
    }
    
    @Override
    public final CharSequence p_() {
        final String liz = 0W3.LIZ(((SubNotifyMessage)super.LJIILIIL).LIZ);
        if (((SubNotifyMessage)super.LJIILIIL).LIZJ == null) {
            return "";
        }
        final String liz2 = 0cB.LIZ(2131689864, ((SubNotifyMessage)super.LJIILIIL).LIZJ.intValue(), liz, ((SubNotifyMessage)super.LJIILIIL).LIZJ);
        final GIB lizj = this.LIZJ(((SubNotifyMessage)super.LJIILIIL).LIZ, 11M.LIZ(0jR.LIZ(IPublicScreenService.class).getTextMessageConfig().LIZIZ()));
        final SpannableString spannableString = new SpannableString((CharSequence)liz2);
        final int index = liz2.indexOf(liz);
        ((Spannable)spannableString).setSpan((Object)lizj, index, liz.length() + index, 33);
        return (CharSequence)spannableString;
    }
    
    @Override
    public final int y_() {
        return 2131234706;
    }
}

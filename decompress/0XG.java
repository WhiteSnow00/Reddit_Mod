// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.model.RandomLinkMicSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveRandomLinkmicSetting;
import kotlin.jvm.internal.n;
import android.text.TextUtils;
import java.util.Map;
import org.json.JSONObject;
import com.bytedance.covode.number.Covode;

public final class 0xg
{
    static {
        Covode.recordClassIndex(10320);
    }
    
    public static final String LIZ(final 0kf 0kf) {
        CTM.LIZ((Object)0kf);
        switch (0xh.LIZ[0kf.ordinal()]) {
            default: {
                return "";
            }
            case 1: {
                return "mutual_follow";
            }
            case 2: {
                return "recommend";
            }
            case 3: {
                return H3e.WEEKLY_RANK.getRankName();
            }
            case 4: {
                return H3e.DAILY_RANK.getRankName();
            }
            case 5: {
                return H3e.HOURLY_RANK.getRankName();
            }
            case 6:
            case 7: {
                return 1O2.LJIIZILJ.getType();
            }
            case 8: {
                return H3e.WEEKLY_ROOKIE_RANK.getRankName();
            }
        }
    }
    
    public static final void LIZ() {
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_connection_overtime");
        liz.LIZ();
        liz.LIZ("invitee_list", 1O2.LJIIZILJ.getType());
        liz.LIZ("connection_type", "anchor");
        liz.LIZLLL();
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "end_reason", "auto_match_overtime");
        ((I5h)HiV.LIZ).LIZ(2, jsonObject);
    }
    
    public static final void LIZ(final Map<String, String> map) {
        CTM.LIZ((Object)map);
        try {
            if (!1NN.LLFF.LIZ().LJIIZILJ) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (TextUtils.isEmpty((CharSequence)1O2.LJIILLIIL) ^ true) {
                map.put("match_id", 1O2.LJIILLIIL);
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        catch (final IllegalStateException ex) {}
    }
    
    public static final void LIZ(final Map<String, String> map, final 0kf 0kf, final boolean b) {
        CTM.LIZ((Object)map, (Object)0kf);
        switch (0xh.LIZLLL[0kf.ordinal()]) {
            case 7:
            case 8: {
                map.put("invitee_list", "random_match");
                map.put("is_change_pairing", "0");
                map.put("is_system_rematching", "0");
                final int n = 0xh.LIZJ[1O2.LJIIZILJ.ordinal()];
                if (n == 1) {
                    map.put("is_change_pairing", "1");
                    break;
                }
                if (n != 2) {
                    break;
                }
                map.put("is_system_rematching", "1");
                break;
            }
            case 6: {
                map.put("invitee_list", H3e.WEEKLY_ROOKIE_RANK.getRankName());
                LIZIZ(map);
                break;
            }
            case 5: {
                map.put("invitee_list", H3e.HOURLY_RANK.getRankName());
                LIZIZ(map);
                break;
            }
            case 4: {
                map.put("invitee_list", H3e.DAILY_RANK.getRankName());
                LIZIZ(map);
                break;
            }
            case 3: {
                map.put("invitee_list", H3e.WEEKLY_RANK.getRankName());
                LIZIZ(map);
                break;
            }
            case 2: {
                map.put("invitee_list", "recommend");
                break;
            }
            case 1: {
                map.put("invitee_list", "mutual_follow");
                break;
            }
        }
        map.put("event_type", String.valueOf(0kf.getType()));
        if (1NN.LLFF.LIZ().LJJJIL.LIZIZ()) {
            final String liz = 1NN.LLFF.LIZ().LJJJIL.LIZ;
            n.LIZIZ((Object)liz, "");
            map.put("rank_type", liz);
        }
        final String lizj = 1NN.LLFF.LIZ().LJJJIL.LIZJ();
        n.LIZIZ((Object)lizj, "");
        map.put("is_ranking_opposite_anchor", lizj);
        if (b) {
            final String liziz = 1NN.LLFF.LIZ().LIZIZ();
            if (!TextUtils.isEmpty((CharSequence)liziz)) {
                map.put("enter_from", liziz);
            }
        }
    }
    
    public static final String LIZIZ(final 0kf 0kf) {
        CTM.LIZ((Object)0kf);
        final int n = 0xh.LIZIZ[0kf.ordinal()];
        if (n == 1) {
            return H3e.WEEKLY_RANK.getRankName();
        }
        if (n == 2) {
            return H3e.DAILY_RANK.getRankName();
        }
        if (n == 3) {
            return H3e.HOURLY_RANK.getRankName();
        }
        if (n != 4) {
            return "";
        }
        return H3e.WEEKLY_ROOKIE_RANK.getRankName();
    }
    
    public static final void LIZIZ() {
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_connection_banned");
        liz.LIZ();
        liz.LIZ("invitee_list", 1O2.LJIIZILJ.getType());
        liz.LIZ("connection_type", "anchor");
        final RandomLinkMicSetting value = LiveRandomLinkmicSetting.INSTANCE.getValue();
        Integer value2;
        if (value != null) {
            value2 = value.banTime;
        }
        else {
            value2 = null;
        }
        liz.LIZ("banned_time", (int)value2);
        liz.LIZLLL();
    }
    
    public static final void LIZIZ(final Map<String, String> map) {
        final Map<String, String> ljlillllzi = 1NN.LLFF.LIZ().LJLILLLLZI;
        if (ljlillllzi != null && ljlillllzi.containsKey("rank_period")) {
            Object value;
            if ((value = ljlillllzi.get("rank_period")) == null) {
                value = "";
            }
            map.put("rank_period", (String)value);
        }
    }
}

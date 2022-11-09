// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import java.util.Iterator;
import android.text.TextUtils;
import org.json.JSONObject;
import com.bytedance.covode.number.Covode;

public final class 0Rt
{
    static {
        Covode.recordClassIndex(4462);
    }
    
    public static void LIZ(final String s, final 0Rj 0Rj, JSONObject optJSONObject) {
        final 0Rd lji = 1hk.LIZLLL().LJI;
        if (lji == null) {
            return;
        }
        long lizj = -1L;
        long n = System.currentTimeMillis();
        String liz = "";
        String lji2;
        if (0Rj != null) {
            liz = 0Rj.LIZ();
            lizj = 0Rj.LIZJ;
            lji2 = 0Rj.LJI;
            n = 0Rj.LJIIIIZZ;
        }
        else {
            lji2 = "";
        }
        Object o = optJSONObject;
        if (optJSONObject == null) {
            o = new JSONObject();
        }
        while (true) {
            try {
                LIZ((JSONObject)o, "ts", n);
                ((JSONObject)o).put("tag", (Object)"track_ad").put("value", lizj).put("track_label", (Object)liz).put("log_extra", (Object)lji2).put("category", (Object)"event_v3").put("is_ad_event", (Object)"1").put("ad_event_type", (Object)"monitor");
                final 0Rp ljii = 1hk.LIZLLL().LJII;
                if (ljii != null) {
                    ((JSONObject)o).put("user_agent", (Object)0Ry.LIZJ(ljii.LIZ()));
                }
                if (0Rj != null) {
                    if (!((JSONObject)o).has("ad_extra_data") || (optJSONObject = ((JSONObject)o).optJSONObject("ad_extra_data")) == null) {
                        optJSONObject = new JSONObject();
                    }
                    int n2 = 0;
                    int n3 = 0;
                    if (0Rj.LJII != null) {
                        final JSONObject ljii2 = 0Rj.LJII;
                        final Iterator keys = ljii2.keys();
                        while (true) {
                            n2 = n3;
                            if (!keys.hasNext()) {
                                break;
                            }
                            final String s2 = keys.next();
                            if (TextUtils.isEmpty((CharSequence)s2)) {
                                continue;
                            }
                            final Object opt = ljii2.opt(s2);
                            if (opt == null || !LIZ((JSONObject)optJSONObject, s2, opt)) {
                                continue;
                            }
                            n3 = 1;
                        }
                    }
                    if (!0Rj.LIZLLL && 0Rj.LJ > 0L) {
                        ((JSONObject)optJSONObject).put("non_std_ad_id", 0Rj.LJ);
                    }
                    else if (n2 != 0) {}
                    ((JSONObject)o).put("ad_extra_data", optJSONObject);
                }
                lji.LIZ(s, (JSONObject)o);
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static void LIZ(final String s, final 1Dk 1Dk, final JSONObject jsonObject) {
        LIZ(jsonObject, "track_url_list", "");
        LIZ(jsonObject, "track_status", -1);
        LIZ(jsonObject, "ts", 1Dk.LJIIIIZZ);
        LIZ(jsonObject, "local_time_ms", String.valueOf(System.currentTimeMillis()));
        LIZ(jsonObject, "is_retry", 0);
        JSONObject optJSONObject;
        if ((optJSONObject = jsonObject.optJSONObject("ad_extra_data")) == null) {
            optJSONObject = new JSONObject();
        }
        try {
            optJSONObject.put("expire_seconds", 1Dk.LJIILIIL).put("is_c2s_sdk", 1);
            jsonObject.put("ad_extra_data", (Object)optJSONObject);
        }
        catch (final JSONException ex) {
            0II.LIZ((Exception)ex);
        }
        LIZ(s, (0Rj)1Dk, jsonObject);
    }
    
    public static boolean LIZ(final JSONObject jsonObject, final String s, final Object o) {
        if (jsonObject.has(s)) {
            return false;
        }
        try {
            jsonObject.putOpt(s, o);
            return true;
        }
        catch (final JSONException ex) {
            0II.LIZ((Exception)ex);
            return false;
        }
    }
    
    public static void onEventExpired(final 1Dk 1Dk) {
        final JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("track_url_list", (Object)new JSONArray((Collection)1Dk.LJFF)).put("is_retry", 1Dk.LJIIIZ);
        }
        catch (final JSONException ex) {
            0II.LIZ((Exception)ex);
        }
        LIZ("track_url_expired", 1Dk, jsonObject);
    }
}

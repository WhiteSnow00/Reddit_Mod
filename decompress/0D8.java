// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableSlardarSetting;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import com.bytedance.android.live.base.service.IHostMonitor;
import com.bytedance.covode.number.Covode;

public final class 0d8
{
    static {
        Covode.recordClassIndex(5791);
    }
    
    public static IHostMonitor LIZ() {
        return 0jR.LIZ(IHostMonitor.class);
    }
    
    public static JSONObject LIZ(final long n) {
        final JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("duration", n);
            return jsonObject;
        }
        catch (final JSONException ex) {
            return jsonObject;
        }
    }
    
    public static JSONObject LIZ(Map<String, Object> iterator) {
        if (iterator == null) {
            return null;
        }
        final JSONObject jsonObject = new JSONObject();
        iterator = ((Map<String, Object>)iterator).entrySet().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                return jsonObject;
            }
            final Map.Entry entry = iterator.next();
            try {
                jsonObject.put((String)entry.getKey(), entry.getValue());
                continue;
            }
            catch (final JSONException ex) {}
        }
    }
    
    public static JSONObject LIZ(final JSONObject jsonObject) {
        final JSONObject jsonObject2 = new JSONObject();
        try {
            jsonObject2.put("tag", (Object)"ttlive_sdk");
            jsonObject2.put("ttlive_sdk_version", (Object)Fwi.LIZ());
            if (jsonObject != null) {
                jsonObject2.put("extra", (Object)jsonObject);
            }
        }
        catch (final JSONException ex) {
            0ba.LIZ(6, "LiveSlardarMonitor", ex.getMessage());
        }
        return jsonObject2;
    }
    
    public static void LIZ(final String s, final int n, final long n2) {
        if (LiveEnableSlardarSetting.INSTANCE.isDisable(s)) {
            return;
        }
        1NI.LIZIZ(new 0dE(n2, s, n));
    }
    
    public static void LIZ(final String s, final int n, final long n2, final Map<String, Object> map) {
        if (LiveEnableSlardarSetting.INSTANCE.isDisable(s)) {
            return;
        }
        1NI.LIZIZ(new 0dG(n2, map, s, n));
    }
    
    public static void LIZ(final String s, final int n, final long n2, final JSONObject jsonObject) {
        if (LiveEnableSlardarSetting.INSTANCE.isDisable(s)) {
            return;
        }
        1NI.LIZIZ(new 0dH(n2, s, n, jsonObject));
    }
    
    public static void LIZ(final String s, final int n, final long n2, final JSONObject jsonObject, final int n3) {
        if (!2X0.LIZ.LIZ(s, n3)) {
            LIZ(s, n, n2, jsonObject);
        }
    }
    
    public static void LIZ(final String s, final int n, final Map<String, Object> map) {
        if (LIZ() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable(s)) {
            1NI.LIZIZ(new 0d9(map, s, n));
        }
    }
    
    public static void LIZ(final String s, final int n, final Map<String, Object> map, final int n2) {
        if (!2X0.LIZ.LIZ(s, n2)) {
            LIZ(s, n, map);
        }
    }
    
    public static void LIZ(final String s, final int n, final JSONObject jsonObject) {
        if (LIZ() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable(s)) {
            1NI.LIZIZ(new 0dA(s, jsonObject, n));
        }
    }
    
    public static void LIZ(final String s, final int n, final JSONObject jsonObject, final int n2) {
        if (!2X0.LIZ.LIZ(s, n2)) {
            LIZ(s, n, jsonObject);
        }
    }
    
    public static void LIZ(final String s, final int n, final JSONObject jsonObject, final JSONObject jsonObject2) {
        if (LIZ() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable(s)) {
            1NI.LIZIZ(new 0dI(jsonObject2, s, n, jsonObject));
        }
    }
    
    public static void LIZ(final String s, final long n, final JSONObject jsonObject) {
        if (LiveEnableSlardarSetting.INSTANCE.isDisable(s)) {
            return;
        }
        1NI.LIZIZ(new 0dC(n, jsonObject, s));
    }
    
    public static void LIZ(final String s, final String s2, final JSONObject jsonObject) {
        if (LIZ() == null) {
            return;
        }
        JSONObject jsonObject2;
        if ((jsonObject2 = jsonObject) == null) {
            jsonObject2 = new JSONObject();
        }
        while (true) {
            try {
                if (!TextUtils.isEmpty((CharSequence)s2)) {
                    jsonObject2.put("service", (Object)s2);
                }
                LIZ().LIZ(s, jsonObject2);
            }
            catch (final JSONException ex) {
                continue;
            }
            break;
        }
    }
    
    public static void LIZ(final String s, final JSONObject jsonObject, final JSONObject jsonObject2, final JSONObject jsonObject3) {
        if (LIZ() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable(s)) {
            LIZ(jsonObject3, "tag", "ttlive_sdk");
            LIZ(jsonObject3, "ttlive_sdk_version", "2570");
            final Fgy fgy = (Fgy)DataChannelGlobal.LIZJ.LIZIZ((Class)HQP.class);
            if (fgy != null) {
                try {
                    jsonObject.put("is_anchor", (int)(GTi.LIZ(DataChannelGlobal.LIZJ) ? 1 : 0));
                    jsonObject3.put("anchor_id", (Object)fgy.LIZJ);
                    if (fgy.LJFF != null) {
                        jsonObject.put("enter_method", (Object)fgy.LJFF.LIZ);
                        jsonObject.put("enter_from_merge", (Object)fgy.LJFF.LIZIZ);
                    }
                    if (fgy.LIZIZ != null) {
                        jsonObject3.put("room_id", fgy.LIZIZ.getId());
                    }
                }
                catch (final JSONException ex) {
                    0II.LIZ((Exception)ex);
                }
            }
            String concat = s;
            if (!s.startsWith("ttlive_")) {
                concat = "ttlive_".concat(String.valueOf(s));
            }
            LIZ().LIZ(concat, jsonObject, jsonObject2, jsonObject3);
        }
    }
    
    public static void LIZ(final Throwable t, final String s) {
        if (LIZ() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable("")) {
            1NI.LIZIZ(new 0dB(t, s));
        }
    }
    
    public static void LIZ(final JSONObject jsonObject, final String s, final String s2) {
        try {
            jsonObject.put(s, (Object)s2);
        }
        catch (final JSONException ex) {
            0ba.LIZ(6, "LiveSlardarMonitor", ex.getMessage());
        }
    }
    
    public static void LIZIZ(final String s, final int n, final long n2, final Map<String, Object> map) {
        if (!2X0.LIZ.LIZ(s, 0)) {
            LIZ(s, n, n2, map);
        }
    }
    
    public static void LIZIZ(final String s, final int n, final JSONObject jsonObject) {
        if (LiveEnableSlardarSetting.INSTANCE.isDisable(s)) {
            return;
        }
        1NI.LIZIZ(new 0dF(s, n, jsonObject));
    }
    
    public static void LIZIZ(final String s, final int n, final JSONObject jsonObject, final JSONObject jsonObject2) {
        if (LIZ() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable(s)) {
            1NI.LIZIZ(new 0dJ(s, n, jsonObject, jsonObject2));
        }
    }
    
    public static void LIZIZ(final String s, final long n, final JSONObject jsonObject) {
        if (!2X0.LIZ.LIZ(s, 0)) {
            LIZ(s, n, jsonObject);
        }
    }
    
    public static void LIZJ(final String s, final int n, final JSONObject jsonObject) {
        if (!2X0.LIZ.LIZ(s, 1)) {
            LIZIZ(s, n, jsonObject);
        }
    }
    
    public static void LIZLLL(final String s, final int n, final JSONObject jsonObject) {
        if (!2X0.LIZ.LIZ(s, 0) && LIZ() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable(s)) {
            LIZ().LIZ(s, n, jsonObject);
        }
    }
}

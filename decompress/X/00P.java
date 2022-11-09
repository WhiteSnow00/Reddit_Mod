// 
// Decompiled by Procyon v0.6.0
// 

package X;

import org.json.JSONException;
import org.json.JSONObject;
import com.bytedance.covode.number.Covode;

public final class 00p
{
    public static 00r<a> LIZ;
    public static boolean LIZIZ;
    
    static {
        Covode.recordClassIndex(76);
        00p.LIZ = new 11v();
    }
    
    public static void LIZ(final String s, final JSONObject jsonObject, final String s2) {
        if (00p.LIZ.LIZIZ() != null) {
            try {
                jsonObject.put("sdkVersion", (Object)"2.0.26.d-lazyLoadTest-mt");
            }
            catch (final JSONException ex) {
                0II.LIZ((Exception)ex);
            }
            if (00p.LIZIZ) {
                00p.LIZ.LIZIZ().LIZ(s, jsonObject, s2);
            }
            try {
                jsonObject.put("second_appid", (Object)"4159");
                jsonObject.put("second_appname", (Object)"vboost_oversea");
            }
            catch (final JSONException ex2) {
                0II.LIZ((Exception)ex2);
            }
            00s.LIZ(3);
            00p.LIZ.LIZIZ().LIZ(s, jsonObject, s2);
        }
    }
    
    public static boolean LIZ() {
        return 00p.LIZ.LIZIZ() != null;
    }
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(78);
        }
        
        void LIZ(final String p0, final JSONObject p1, final String p2);
    }
}

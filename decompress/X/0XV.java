// 
// Decompiled by Procyon v0.6.0
// 

package X;

import org.json.JSONObject;
import com.bytedance.covode.number.Covode;

public final class 0xv
{
    static {
        Covode.recordClassIndex(10339);
    }
    
    public static final JSONObject LIZ(JSONObject jsonObject) {
        CTM.LIZ((Object)jsonObject);
        try {
            jsonObject = new JSONObject(jsonObject.toString());
        }
        catch (final Exception ex) {
            jsonObject = new JSONObject();
        }
        return jsonObject;
    }
}

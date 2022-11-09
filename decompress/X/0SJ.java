// 
// Decompiled by Procyon v0.6.0
// 

package X;

import org.json.JSONObject;
import com.bytedance.covode.number.Covode;

public final class 0SJ
{
    public final 0SM LIZ;
    public final 0SL LIZIZ;
    public final 0SK LIZJ;
    
    static {
        Covode.recordClassIndex(4513);
    }
    
    public 0SJ(JSONObject optJSONObject) {
        CTM.LIZ((Object)optJSONObject);
        JSONObject optJSONObject2;
        if ((optJSONObject2 = optJSONObject.optJSONObject("resource_config")) == null) {
            optJSONObject2 = new JSONObject();
        }
        this.LIZ = new 0SM(optJSONObject2);
        JSONObject optJSONObject3;
        if ((optJSONObject3 = optJSONObject.optJSONObject("porn_inspector")) == null) {
            optJSONObject3 = new JSONObject();
        }
        this.LIZIZ = new 0SL(optJSONObject3);
        if ((optJSONObject = optJSONObject.optJSONObject("android_config")) == null) {
            optJSONObject = new JSONObject();
        }
        this.LIZJ = new 0SK(optJSONObject);
    }
}

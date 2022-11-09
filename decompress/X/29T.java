// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.livesetting.message.LiveMtPbRequestsSetting;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class 29T extends F5g implements QgG<JSONObject>
{
    public static final 29T LIZ;
    
    static {
        Covode.recordClassIndex(10468);
        LIZ = new 29T();
    }
    
    public 29T() {
        super(0);
    }
    
    private JSONObject LIZ() {
        Object liz = null;
        try {
            F1k.constructor-impl((Object)new JSONObject(LiveMtPbRequestsSetting.INSTANCE.getValue().getSwitches()));
        }
        finally {
            final Throwable t;
            liz = F1j.LIZ(t);
            F1k.constructor-impl(liz);
        }
        final JSONObject jsonObject = new JSONObject();
        JSONObject jsonObject2 = (JSONObject)liz;
        if (F1k.isFailure-impl(liz)) {
            jsonObject2 = jsonObject;
        }
        return jsonObject2;
    }
}

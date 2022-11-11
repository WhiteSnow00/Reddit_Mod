// 
// Decompiled by Procyon v0.6.0
// 

package X;

import org.json.JSONObject;
import com.bytedance.covode.number.Covode;

public final class 0Ru
{
    static {
        Covode.recordClassIndex(4463);
    }
    
    public static IllegalArgumentException LIZ(final String s) {
        return new IllegalArgumentException(s);
    }
    
    public static JSONObject LIZ(Throwable cause, final JSONObject jsonObject) {
        if (cause == null) {
            return jsonObject;
        }
        try {
            jsonObject.put("err", (Object)cause.getMessage());
            jsonObject.put("err_type", (Object)cause.getClass().getSimpleName());
            cause = cause.getCause();
            if (cause != null) {
                while (true) {
                    final Throwable cause2 = cause.getCause();
                    if (cause2 == null) {
                        break;
                    }
                    cause = cause2;
                }
                jsonObject.put("err_inner", (Object)cause.getMessage());
                jsonObject.put("err_type_inner", (Object)cause.getClass().getSimpleName());
            }
            return jsonObject;
        }
        finally {
            return jsonObject;
        }
    }
}

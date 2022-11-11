// 
// Decompiled by Procyon v0.6.0
// 

package X;

import org.json.JSONException;
import org.json.JSONObject;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class 0hi
{
    public static final 0hi LIZ;
    
    static {
        Covode.recordClassIndex(6490);
        LIZ = new 0hi();
    }
    
    public final boolean LIZ(final String s, final String s2, final boolean b) {
        if (!TextUtils.isEmpty((CharSequence)s) && !TextUtils.equals((CharSequence)s, (CharSequence)"{}")) {
            try {
                return new JSONObject(s).optBoolean(s2, b);
            }
            catch (final JSONException ex) {
                return false;
            }
        }
        return b;
    }
}

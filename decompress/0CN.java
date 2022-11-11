// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class 0cn
{
    static {
        Covode.recordClassIndex(5757);
    }
    
    public static String LIZ(String string) {
        String s = string;
        if (TextUtils.isEmpty((CharSequence)string)) {
            s = "-1";
        }
        string = s;
        if (!s.contains("_")) {
            string = TextUtils.concat(new CharSequence[] { s, "_", "0" }).toString();
        }
        return string;
    }
}

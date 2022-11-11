// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ContextThemeWrapper;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 0et
{
    static {
        Covode.recordClassIndex(6003);
    }
    
    public static Context LIZ(final Context context) {
        return (Context)new ContextThemeWrapper(context, 2131886617);
    }
    
    public static String LIZ(final String s) {
        String replace = s;
        if (s != null) {
            if (s.length() == 0) {
                replace = s;
            }
            else {
                replace = s.replace('\ufffc', ' ');
            }
        }
        return replace;
    }
}

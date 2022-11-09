// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class 0Ng
{
    static {
        Covode.recordClassIndex(3910);
    }
    
    public static String LIZ(String s) {
        final boolean empty = TextUtils.isEmpty((CharSequence)s);
        final String s2 = "";
        if (empty) {
            return "";
        }
        s.hashCode();
        switch (s.hashCode()) {
            default: {
                s = s2;
                break;
            }
            case -1005512447: {
                if (!s.equals("output")) {
                    s = s2;
                    break;
                }
                s = "post";
                break;
            }
            case -865586570: {
                if (!s.equals("trends")) {
                    s = s2;
                    break;
                }
                s = "dongtai";
                break;
            }
            case 3321751: {
                if (!s.equals("like")) {
                    s = s2;
                    break;
                }
                s = "fav";
                break;
            }
        }
        return s;
    }
}

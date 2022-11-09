// 
// Decompiled by Procyon v0.6.0
// 

package wd;

import android.text.TextUtils;
import java.util.regex.Pattern;

public final class h
{
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }
    
    public static String a(final String s) {
        String s2 = s;
        if (TextUtils.isEmpty((CharSequence)s)) {
            s2 = null;
        }
        return s2;
    }
    
    public static boolean b(final String s) {
        return s == null || s.trim().isEmpty();
    }
}

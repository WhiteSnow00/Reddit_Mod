// 
// Decompiled by Procyon v0.6.0
// 

package wa;

import java.util.HashSet;

public final class x
{
    public static final HashSet<String> a;
    public static String b;
    
    static {
        a = new HashSet<String>();
        x.b = "goog.exo.core";
    }
    
    public static void a(final String s) {
        synchronized (x.class) {
            if (x.a.add(s)) {
                final String b = x.b;
                final StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 2 + s.length());
                sb.append(b);
                sb.append(", ");
                sb.append(s);
                x.b = sb.toString();
            }
        }
    }
}

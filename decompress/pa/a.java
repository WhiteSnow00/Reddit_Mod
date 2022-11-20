// 
// Decompiled by Procyon v0.6.0
// 

package pa;

import android.os.Build$VERSION;
import android.util.Log;

public final class a
{
    public static void a(final Object o, String c, final String s) {
        c = c(c);
        if (Log.isLoggable(c, 3)) {
            Log.d(c, String.format(s, o));
        }
    }
    
    public static void b(String c, final String s, final Exception ex) {
        c = c(c);
        if (Log.isLoggable(c, 6)) {
            Log.e(c, s, (Throwable)ex);
        }
    }
    
    public static String c(String s) {
        if (Build$VERSION.SDK_INT < 26) {
            final String s2 = s = b.l("TRuntime.", s);
            if (s2.length() > 23) {
                s = s2.substring(0, 23);
            }
            return s;
        }
        return b.l("TRuntime.", s);
    }
}

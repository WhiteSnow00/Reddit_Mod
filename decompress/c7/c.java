// 
// Decompiled by Procyon v0.6.0
// 

package c7;

import java.util.HashSet;
import android.util.Log;

public final class c
{
    public static b a;
    
    static {
        c.a = new b();
    }
    
    public static void a() {
        c.a.getClass();
    }
    
    public static void b(final String s) {
        c.a.getClass();
        final HashSet a = b.a;
        if (!a.contains(s)) {
            Log.w("LOTTIE", s, (Throwable)null);
            a.add(s);
        }
    }
    
    public static void c(final String s, final Throwable t) {
        c.a.getClass();
        final HashSet a = b.a;
        if (!a.contains(s)) {
            Log.w("LOTTIE", s, t);
            a.add(s);
        }
    }
}

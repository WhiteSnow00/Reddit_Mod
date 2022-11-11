// 
// Decompiled by Procyon v0.6.0
// 

package wd;

import android.content.Context;

public final class c
{
    public static c b;
    public b a;
    
    static {
        c.b = new c();
    }
    
    public c() {
        this.a = null;
    }
    
    public static b a(final Context context) {
        final c b = c.b;
        synchronized (b) {
            if (b.a == null) {
                Context applicationContext = context;
                if (context.getApplicationContext() != null) {
                    applicationContext = context.getApplicationContext();
                }
                b.a = new b(applicationContext);
            }
            return b.a;
        }
    }
}

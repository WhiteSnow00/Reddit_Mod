// 
// Decompiled by Procyon v0.6.0
// 

package ld;

import android.content.Context;

public final class n
{
    public static n b;
    public c a;
    
    public n(final Context context) {
        (this.a = c.a(context)).b();
        this.a.c();
    }
    
    public static n b(final Context context) {
        synchronized (n.class) {
            final Context applicationContext = context.getApplicationContext();
            synchronized (n.class) {
                n b = n.b;
                if (b != null) {
                    monitorexit(n.class);
                }
                else {
                    b = (n.b = new n(applicationContext));
                }
                return b;
            }
        }
    }
    
    public final void a() {
        synchronized (this) {
            final c a = this.a;
            a.a.lock();
            try {
                a.b.edit().clear().apply();
            }
            finally {
                a.a.unlock();
            }
        }
    }
}

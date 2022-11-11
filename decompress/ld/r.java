// 
// Decompiled by Procyon v0.6.0
// 

package ld;

import android.util.Log;
import ve.x;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import vd.a;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Context;

public final class r
{
    public static r e;
    public final Context a;
    public final ScheduledExecutorService b;
    public m c;
    public int d;
    
    public r(final Context context, final ScheduledExecutorService b) {
        this.c = new m(this);
        this.d = 1;
        this.b = b;
        this.a = context.getApplicationContext();
    }
    
    public static r a(final Context context) {
        synchronized (r.class) {
            if (r.e == null) {
                r.e = new r(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory)new a("MessengerIpcClient"))));
            }
            return r.e;
        }
    }
    
    public final x b(final p p) {
        synchronized (this) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                final String value = String.valueOf(p);
                final StringBuilder sb = new StringBuilder(value.length() + 9);
                sb.append("Queueing ");
                sb.append(value);
                Log.d("MessengerIpcClient", sb.toString());
            }
            if (!this.c.d(p)) {
                (this.c = new m(this)).d(p);
            }
            return p.b.a;
        }
    }
}

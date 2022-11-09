// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import android.os.Handler;
import java.util.concurrent.Executor;
import android.content.Context;
import android.os.HandlerThread;

public abstract class h
{
    public static final Object a;
    public static h1 b;
    public static HandlerThread c;
    
    static {
        a = new Object();
    }
    
    public static h1 a(final Context context) {
        synchronized (h.a) {
            if (h.b == null) {
                h.b = new h1(context.getApplicationContext(), context.getMainLooper());
            }
            return h.b;
        }
    }
    
    public final void b(final String s, String s2, int n, final x0 x0, final boolean b) {
        final e1 e1 = new e1(n, s, s2, b);
        final h1 h1 = (h1)this;
        synchronized (h1.d) {
            final f1 f1 = h1.d.get(e1);
            if (f1 == null) {
                s2 = e1.toString();
                n = s2.length();
                final StringBuilder sb = new StringBuilder(n + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(s2);
                throw new IllegalStateException(sb.toString());
            }
            if (f1.f.containsKey(x0)) {
                f1.f.remove(x0);
                if (f1.f.isEmpty()) {
                    ((Handler)h1.f).sendMessageDelayed(((Handler)h1.f).obtainMessage(0, (Object)e1), h1.h);
                }
                return;
            }
            s2 = e1.toString();
            n = s2.length();
            final StringBuilder sb2 = new StringBuilder(n + 76);
            sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
            sb2.append(s2);
            throw new IllegalStateException(sb2.toString());
        }
    }
    
    public abstract boolean c(final e1 p0, final x0 p1, final String p2, final Executor p3);
}

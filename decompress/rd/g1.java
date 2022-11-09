// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import android.os.Handler;
import java.util.HashMap;
import android.content.ServiceConnection;
import yd.a;
import android.content.ComponentName;
import android.util.Log;
import android.os.Message;
import android.os.Handler$Callback;

public final class g1 implements Handler$Callback
{
    public final /* synthetic */ h1 f;
    
    public final boolean handleMessage(final Message message) {
        final int what = message.what;
        if (what != 0) {
            if (what != 1) {
                return false;
            }
            synchronized (this.f.d) {
                final e1 e1 = (e1)message.obj;
                final f1 f1 = this.f.d.get(e1);
                if (f1 != null && f1.g == 3) {
                    final String value = String.valueOf(e1);
                    final StringBuilder sb = new StringBuilder(value.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(value);
                    Log.e("GmsClientSupervisor", sb.toString(), (Throwable)new Exception());
                    ComponentName k;
                    if ((k = f1.k) == null) {
                        e1.getClass();
                        k = null;
                    }
                    ComponentName componentName;
                    if ((componentName = k) == null) {
                        componentName = new(android.content.ComponentName.class)();
                        final String b = e1.b;
                        a.S0((Object)b);
                        new ComponentName(b, "unknown");
                    }
                    f1.onServiceDisconnected(componentName);
                }
                return true;
            }
        }
        final HashMap<e1, f1> d = this.f.d;
        monitorenter(d);
        Label_0316: {
            try {
                final e1 e2 = (e1)message.obj;
                final f1 f2 = this.f.d.get(e2);
                if (f2 != null && f2.f.isEmpty()) {
                    if (f2.h) {
                        ((Handler)f2.l.f).removeMessages(1, (Object)f2.j);
                        final h1 l = f2.l;
                        l.g.c(l.e, (ServiceConnection)f2);
                        f2.h = false;
                        f2.g = 2;
                    }
                    this.f.d.remove(e2);
                }
                break Label_0316;
            }
            finally {
                monitorexit(d);
                monitorexit(d);
                return true;
            }
        }
    }
}

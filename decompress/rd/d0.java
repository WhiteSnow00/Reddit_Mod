// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import qd.d;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import yd.a;
import android.os.Looper;
import fe.f;
import java.util.concurrent.atomic.AtomicInteger;
import com.google.android.gms.common.api.c;
import java.util.ArrayList;
import android.os.Handler$Callback;

public final class d0 implements Handler$Callback
{
    public final c0 f;
    public final ArrayList<c.b> g;
    public final ArrayList<c.b> h;
    public final ArrayList<c.c> i;
    public volatile boolean j;
    public final AtomicInteger k;
    public boolean l;
    public final f m;
    public final Object n;
    
    public d0(final Looper looper, final c1.c f) {
        this.g = new ArrayList<c.b>();
        this.h = new ArrayList<c.b>();
        this.i = new ArrayList<c.c>();
        this.j = false;
        this.k = new AtomicInteger(0);
        this.l = false;
        this.n = new Object();
        this.f = f;
        this.m = new f(looper, (Handler$Callback)this);
    }
    
    public final void a(final c.c c) {
        a.S0((Object)c);
        synchronized (this.n) {
            if (this.i.contains(c)) {
                final String value = String.valueOf(c);
                final StringBuilder sb = new StringBuilder(value.length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(value);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            }
            else {
                this.i.add(c);
            }
        }
    }
    
    public final boolean handleMessage(final Message message) {
        final int what = message.what;
        if (what == 1) {
            final c.b b = (c.b)message.obj;
            synchronized (this.n) {
                if (this.j && this.f.b() && this.g.contains(b)) {
                    ((d)b).R((Bundle)null);
                }
                return true;
            }
        }
        final StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(what);
        Log.wtf("GmsClientEvents", sb.toString(), (Throwable)new Exception());
        return false;
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.background.systemalarm;

import java.util.Iterator;
import android.content.Intent;
import android.os.PowerManager$WakeLock;
import java.util.Map;
import java.util.HashMap;
import m6.r;
import android.content.Context;
import c6.h;
import androidx.lifecycle.t;

public class SystemAlarmService extends t implements d$c
{
    public static final String i;
    public d g;
    public boolean h;
    
    static {
        i = h.e("SystemAlarmService");
    }
    
    public final void a() {
        final d g = new d((Context)this);
        this.g = g;
        if (g.o != null) {
            c6.h.c().b(d.p, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        }
        else {
            g.o = (d.d$c)this;
        }
    }
    
    public final void b() {
        this.h = true;
        c6.h.c().a(SystemAlarmService.i, "All commands completed in dispatcher", new Throwable[0]);
        final String a = r.a;
        final HashMap hashMap = new HashMap();
        Object o = r.b;
        synchronized (o) {
            hashMap.putAll((Map)o);
            monitorexit(o);
            o = hashMap.keySet().iterator();
            while (((Iterator)o).hasNext()) {
                final PowerManager$WakeLock powerManager$WakeLock = (PowerManager$WakeLock)((Iterator)o).next();
                if (powerManager$WakeLock != null && powerManager$WakeLock.isHeld()) {
                    c6.h.c().f(r.a, String.format("WakeLock held for %s", hashMap.get(powerManager$WakeLock)), new Throwable[0]);
                }
            }
            this.stopSelf();
        }
    }
    
    @Override
    public final void onCreate() {
        super.onCreate();
        this.a();
        this.h = false;
    }
    
    @Override
    public final void onDestroy() {
        super.onDestroy();
        this.h = true;
        this.g.d();
    }
    
    @Override
    public final int onStartCommand(final Intent intent, final int n, final int n2) {
        super.onStartCommand(intent, n, n2);
        if (this.h) {
            c6.h.c().d(SystemAlarmService.i, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.g.d();
            this.a();
            this.h = false;
        }
        if (intent != null) {
            this.g.a(n2, intent);
        }
        return 3;
    }
}

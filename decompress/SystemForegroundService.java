// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.foreground;

import android.content.Context;
import android.os.Build$VERSION;
import java.util.UUID;
import android.text.TextUtils;
import n6.b;
import android.content.Intent;
import d6.c;
import android.os.Looper;
import c6.h;
import android.app.NotificationManager;
import android.os.Handler;
import androidx.lifecycle.t;

public class SystemForegroundService extends t implements a$a
{
    public static final String k;
    public Handler g;
    public boolean h;
    public a i;
    public NotificationManager j;
    
    static {
        k = h.e("SystemFgService");
    }
    
    public final void a() {
        this.g = new Handler(Looper.getMainLooper());
        this.j = (NotificationManager)((Context)this).getApplicationContext().getSystemService("notification");
        final a i = new a(((Context)this).getApplicationContext());
        this.i = i;
        if (i.o != null) {
            c6.h.c().b(a.p, "A callback already exists.", new Throwable[0]);
        }
        else {
            i.o = (a.a$a)this;
        }
    }
    
    @Override
    public final void onCreate() {
        super.onCreate();
        this.a();
    }
    
    @Override
    public final void onDestroy() {
        super.onDestroy();
        final a i = this.i;
        i.o = null;
        synchronized (i.i) {
            i.n.c();
            monitorexit(i.i);
            final c f = i.g.f;
            final Object p = f.p;
            synchronized (i.i) {
                f.o.remove(i);
            }
        }
    }
    
    @Override
    public final int onStartCommand(final Intent intent, final int n, final int n2) {
        super.onStartCommand(intent, n, n2);
        if (this.h) {
            c6.h.c().d(SystemForegroundService.k, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            final a i = this.i;
            i.o = null;
            synchronized (i.i) {
                i.n.c();
                monitorexit(i.i);
                final c f = i.g.f;
                final Object p3 = f.p;
                synchronized (i.i) {
                    f.o.remove(i);
                    monitorexit(i.i);
                    this.a();
                    this.h = false;
                }
            }
        }
        if (intent != null) {
            final a j = this.i;
            j.getClass();
            final String action = intent.getAction();
            if ("ACTION_START_FOREGROUND".equals(action)) {
                c6.h.c().d(a.p, String.format("Started foreground service %s", intent), new Throwable[0]);
                ((b)j.h).a(new k6.b(j, j.g.c, intent.getStringExtra("KEY_WORKSPEC_ID")));
                j.f(intent);
            }
            else if ("ACTION_NOTIFY".equals(action)) {
                j.f(intent);
            }
            else if ("ACTION_CANCEL_WORK".equals(action)) {
                c6.h.c().d(a.p, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
                final String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra != null && !TextUtils.isEmpty((CharSequence)stringExtra)) {
                    j.g.d(UUID.fromString(stringExtra));
                }
            }
            else if ("ACTION_STOP_FOREGROUND".equals(action)) {
                c6.h.c().d(a.p, "Stopping foreground service", new Throwable[0]);
                final a.a$a o = j.o;
                if (o != null) {
                    final SystemForegroundService systemForegroundService = (SystemForegroundService)o;
                    systemForegroundService.h = true;
                    c6.h.c().a(SystemForegroundService.k, "All commands completed.", new Throwable[0]);
                    if (Build$VERSION.SDK_INT >= 26) {
                        systemForegroundService.stopForeground(true);
                    }
                    systemForegroundService.stopSelf();
                }
            }
        }
        return 3;
    }
}

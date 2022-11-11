// 
// Decompiled by Procyon v0.6.0
// 

package ld;

import com.android.billingclient.api.l0;
import android.os.RemoteException;
import android.os.Message;
import android.os.Parcelable;
import android.content.Intent;
import ve.x;
import android.content.pm.PackageInfo;
import ui.b;
import ve.j;
import java.io.IOException;
import ve.a;
import java.util.concurrent.Executor;
import z0.c1;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import ve.g;
import java.util.concurrent.TimeUnit;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import android.content.Context;
import android.os.Bundle;
import ve.h;
import j0.i;
import java.util.regex.Pattern;
import android.app.PendingIntent;

public final class c
{
    public static int h;
    public static PendingIntent i;
    public static final Pattern j;
    public final i<String, h<Bundle>> a;
    public final Context b;
    public final s c;
    public final ScheduledThreadPoolExecutor d;
    public Messenger e;
    public Messenger f;
    public ld.h g;
    
    static {
        j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    }
    
    public c(final Context b) {
        this.a = (i<String, h<Bundle>>)new i();
        this.b = b;
        this.c = new s(b);
        this.e = new Messenger((Handler)new e(this, Looper.getMainLooper()));
        final ScheduledThreadPoolExecutor d = new ScheduledThreadPoolExecutor(1);
        d.setKeepAliveTime(60L, TimeUnit.SECONDS);
        d.allowCoreThreadTimeOut(true);
        this.d = d;
    }
    
    public final g<Bundle> a(final Bundle bundle) {
        final s c = this.c;
        synchronized (c) {
            if (c.b == 0) {
                PackageInfo b;
                try {
                    b = wd.c.a(c.a).b(0, "com.google.android.gms");
                }
                catch (final PackageManager$NameNotFoundException ex) {
                    final String value = String.valueOf(ex);
                    final StringBuilder sb = new StringBuilder(value.length() + 23);
                    sb.append("Failed to find package ");
                    sb.append(value);
                    Log.w("Metadata", sb.toString());
                    b = null;
                }
                if (b != null) {
                    c.b = b.versionCode;
                }
            }
            final int b2 = c.b;
            monitorexit(c);
            if (b2 < 12000000) {
                ve.g<Bundle> g;
                if (this.c.a() != 0) {
                    g = this.b(bundle).h(t.f, (ve.a<Object, ve.g<Bundle>>)new c1(6, (Object)this, (Object)bundle));
                }
                else {
                    g = ve.j.d((Exception)new IOException("MISSING_INSTANCEID_SERVICE"));
                }
                return g;
            }
            final r a = r.a(this.b);
            synchronized (a) {
                final int n = a.d++;
                monitorexit(a);
                return a.b((p)new q(n, bundle)).f(t.f, (ve.a<Object, Bundle>)ui.b.u);
            }
        }
    }
    
    public final x b(final Bundle bundle) {
        synchronized (c.class) {
            final int h = ld.c.h;
            ld.c.h = h + 1;
            final String string = Integer.toString(h);
            monitorexit(c.class);
            final h h2 = new h();
            Object a = this.a;
            synchronized (a) {
                this.a.put((Object)string, (Object)h2);
                monitorexit(a);
                a = new Intent();
                ((Intent)a).setPackage("com.google.android.gms");
                if (this.c.a() == 2) {
                    ((Intent)a).setAction("com.google.iid.TOKEN_REQUEST");
                }
                else {
                    ((Intent)a).setAction("com.google.android.c2dm.intent.REGISTER");
                }
                ((Intent)a).putExtras(bundle);
                final Context b = this.b;
                synchronized (c.class) {
                    if (ld.c.i == null) {
                        final Intent intent = new Intent();
                        intent.setPackage("com.google.example.invalidpackage");
                        ld.c.i = PendingIntent.getBroadcast(b, 0, intent, ee.a.a);
                    }
                    ((Intent)a).putExtra("app", (Parcelable)ld.c.i);
                    monitorexit(c.class);
                    ((Intent)a).putExtra("kid", android.support.v4.media.a.l(new StringBuilder(String.valueOf(string).length() + 5), "|ID|", string, "|"));
                    if (Log.isLoggable("Rpc", 3)) {
                        final String value = String.valueOf(((Intent)a).getExtras());
                        final StringBuilder sb = new StringBuilder(value.length() + 8);
                        sb.append("Sending ");
                        sb.append(value);
                        Log.d("Rpc", sb.toString());
                    }
                    ((Intent)a).putExtra("google.messenger", (Parcelable)this.e);
                    Label_0398: {
                        if (this.f != null || this.g != null) {
                            final Message obtain = Message.obtain();
                            obtain.obj = a;
                            try {
                                final Messenger f = this.f;
                                if (f != null) {
                                    f.send(obtain);
                                    break Label_0398;
                                }
                                final Messenger f2 = this.g.f;
                                f2.getClass();
                                f2.send(obtain);
                                break Label_0398;
                            }
                            catch (final RemoteException ex) {
                                if (Log.isLoggable("Rpc", 3)) {
                                    Log.d("Rpc", "Messenger failed, fallback to startService");
                                }
                            }
                        }
                        if (this.c.a() == 2) {
                            this.b.sendBroadcast((Intent)a);
                        }
                        else {
                            this.b.startService((Intent)a);
                        }
                    }
                    h2.a.b(t.f, (ve.c)new t6.h((Object)this, (Object)string, (Object)this.d.schedule((Runnable)new l0((Object)h2, 2), 30L, TimeUnit.SECONDS)));
                    return h2.a;
                }
            }
        }
    }
    
    public final void c(final Bundle bundle, final String s) {
        synchronized (this.a) {
            final h h = (h)this.a.remove((Object)s);
            if (h == null) {
                final String value = String.valueOf(s);
                String concat;
                if (value.length() != 0) {
                    concat = "Missing callback for ".concat(value);
                }
                else {
                    concat = new String("Missing callback for ");
                }
                Log.w("Rpc", concat);
                return;
            }
            h.b((Object)bundle);
        }
    }
}

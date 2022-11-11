// 
// Decompiled by Procyon v0.6.0
// 

package zb;

import android.content.BroadcastReceiver;
import android.net.ConnectivityManager$NetworkCallback;
import android.net.ConnectivityManager;
import android.content.IntentFilter;
import yb.d;
import android.os.Handler$Callback;
import android.os.Looper;
import ad.c0;
import ra.o;
import android.os.Handler;
import android.content.Context;

public final class b
{
    public final Context a;
    public final b.b$b b;
    public final a c;
    public final Handler d;
    public b.b$a e;
    public int f;
    public b.b$c g;
    
    public b(final Context context, final o b, final a c) {
        this.a = context.getApplicationContext();
        this.b = (b.b$b)b;
        this.c = c;
        final int a = c0.a;
        Looper looper = Looper.myLooper();
        if (looper == null) {
            looper = Looper.getMainLooper();
        }
        this.d = new Handler(looper, (Handler$Callback)null);
    }
    
    public final void a() {
        final int a = this.c.a(this.a);
        if (this.f != a) {
            this.f = a;
            final d d = (d)((o)this.b).g;
            final a m = yb.d.m;
            d.b(this, a);
        }
    }
    
    public final int b() {
        this.f = this.c.a(this.a);
        final IntentFilter intentFilter = new IntentFilter();
        final int f = this.c.f;
        final int n = 1;
        if ((f & 0x1) != 0x0) {
            if (c0.a >= 24) {
                final ConnectivityManager connectivityManager = (ConnectivityManager)this.a.getSystemService("connectivity");
                connectivityManager.getClass();
                connectivityManager.registerDefaultNetworkCallback((ConnectivityManager$NetworkCallback)(this.g = new b.b$c(this)));
            }
            else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if ((this.c.f & 0x8) != 0x0) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if ((this.c.f & 0x4) != 0x0) {
            if (c0.a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            }
            else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        int n2;
        if ((this.c.f & 0x10) != 0x0) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        if (n2 != 0) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        final b.b$a e = new b.b$a(this);
        this.e = e;
        this.a.registerReceiver((BroadcastReceiver)e, intentFilter, (String)null, this.d);
        return this.f;
    }
}

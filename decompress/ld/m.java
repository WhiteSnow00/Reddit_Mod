// 
// Decompiled by Procyon v0.6.0
// 

package ld;

import com.android.billingclient.api.l0;
import com.android.billingclient.api.i0;
import android.os.IBinder;
import android.content.ComponentName;
import java.util.concurrent.TimeUnit;
import android.content.Intent;
import java.util.Iterator;
import com.google.android.gms.cloudmessaging.zzq;
import td.a;
import android.util.Log;
import android.os.Handler;
import ee.b;
import android.os.Looper;
import android.util.SparseArray;
import java.util.ArrayDeque;
import android.os.Messenger;
import android.content.ServiceConnection;

public final class m implements ServiceConnection
{
    public int f = 0;
    public final Messenger g = new Messenger((Handler)new b(Looper.getMainLooper(), new j(this)));
    public n h;
    public final ArrayDeque i = new ArrayDeque();
    public final SparseArray<p<?>> j = new SparseArray();
    public final /* synthetic */ r k;
    
    public final void a(final int n, final String s) {
        synchronized (this) {
            this.b(n, s, null);
        }
    }
    
    public final void b(int i, final String s, final SecurityException ex) {
        synchronized (this) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                final String value = String.valueOf(s);
                String concat;
                if (value.length() != 0) {
                    concat = "Disconnected: ".concat(value);
                }
                else {
                    concat = new String("Disconnected: ");
                }
                Log.d("MessengerIpcClient", concat);
            }
            final int f = this.f;
            if (f == 0) {
                throw new IllegalStateException();
            }
            if (f == 1 || f == 2) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.f = 4;
                a.b().c(this.k.a, (ServiceConnection)this);
                final zzq zzq = new zzq(i, s, (Throwable)ex);
                final Iterator iterator = this.i.iterator();
                while (iterator.hasNext()) {
                    ((p)iterator.next()).c(zzq);
                }
                this.i.clear();
                for (i = 0; i < this.j.size(); ++i) {
                    ((p)this.j.valueAt(i)).c(zzq);
                }
                this.j.clear();
                return;
            }
            if (f != 3) {
                return;
            }
            this.f = 4;
        }
    }
    
    public final void c() {
        synchronized (this) {
            if (this.f == 2 && this.i.isEmpty() && this.j.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f = 3;
                a.b().c(this.k.a, (ServiceConnection)this);
            }
        }
    }
    
    public final boolean d(final p<?> p) {
        synchronized (this) {
            final int f = this.f;
            if (f == 0) {
                this.i.add(p);
                lw0.b.V(this.f == 0);
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.f = 1;
                final Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                try {
                    if (!a.b().a(this.k.a, intent, (ServiceConnection)this, 1)) {
                        this.a(0, "Unable to bind to service");
                    }
                    else {
                        this.k.b.schedule(new l(this, 0), 30L, TimeUnit.SECONDS);
                    }
                }
                catch (final SecurityException ex) {
                    this.b(0, "Unable to bind to service", ex);
                }
                return true;
            }
            if (f == 1) {
                this.i.add(p);
                return true;
            }
            if (f != 2) {
                return false;
            }
            this.i.add(p);
            this.k.b.execute(new k(this, 0));
            return true;
        }
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.k.b.execute((Runnable)new i0(1, (Object)this, (Object)binder));
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.k.b.execute((Runnable)new l0((Object)this, 1));
    }
}

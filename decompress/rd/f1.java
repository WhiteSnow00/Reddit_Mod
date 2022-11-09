// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import android.os.Handler;
import android.os.BaseBundle;
import java.util.Iterator;
import android.content.Context;
import vd.a;
import android.content.Intent;
import android.util.Log;
import android.os.Bundle;
import java.util.concurrent.Executor;
import android.content.ComponentName;
import android.os.IBinder;
import java.util.HashMap;
import android.content.ServiceConnection;

public final class f1 implements ServiceConnection
{
    public final HashMap f;
    public int g;
    public boolean h;
    public IBinder i;
    public final e1 j;
    public ComponentName k;
    public final /* synthetic */ h1 l;
    
    public f1(final h1 l, final e1 j) {
        this.l = l;
        this.j = j;
        this.f = new HashMap();
        this.g = 2;
    }
    
    public final void a(final String s, final Executor executor) {
        this.g = 3;
        final h1 l = this.l;
        final a g = l.g;
        final Context e = l.e;
        final e1 j = this.j;
        final String a = j.a;
        Intent intent = null;
        final Intent intent2 = null;
        if (a != null) {
            if (j.d) {
                final Bundle bundle = new Bundle();
                ((BaseBundle)bundle).putString("serviceActionBundleKey", j.a);
                Bundle call;
                try {
                    call = e.getContentResolver().call(e1.e, "serviceIntentCall", (String)null, bundle);
                }
                catch (final IllegalArgumentException ex) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(ex.toString()));
                    call = null;
                }
                Intent intent3;
                if (call == null) {
                    intent3 = intent2;
                }
                else {
                    intent3 = (Intent)call.getParcelable("serviceResponseIntentKey");
                }
                intent = intent3;
                if (intent3 == null) {
                    final String value = String.valueOf(j.a);
                    String concat;
                    if (value.length() != 0) {
                        concat = "Dynamic lookup for intent failed for action: ".concat(value);
                    }
                    else {
                        concat = new String("Dynamic lookup for intent failed for action: ");
                    }
                    Log.w("ConnectionStatusConfig", concat);
                    intent = intent3;
                }
            }
            if (intent == null) {
                intent = new Intent(j.a).setPackage(j.b);
            }
        }
        else {
            intent = new Intent().setComponent((ComponentName)null);
        }
        final boolean d = g.d(e, s, intent, (ServiceConnection)this, this.j.c, executor);
        this.h = d;
        if (d) {
            ((Handler)this.l.f).sendMessageDelayed(((Handler)this.l.f).obtainMessage(1, (Object)this.j), this.l.i);
            return;
        }
        this.g = 2;
        try {
            final h1 i = this.l;
            i.g.c(i.e, (ServiceConnection)this);
        }
        catch (final IllegalArgumentException ex2) {}
    }
    
    public final void onServiceConnected(final ComponentName k, final IBinder i) {
        synchronized (this.l.d) {
            ((Handler)this.l.f).removeMessages(1, (Object)this.j);
            this.i = i;
            this.k = k;
            final Iterator iterator = this.f.values().iterator();
            while (iterator.hasNext()) {
                ((ServiceConnection)iterator.next()).onServiceConnected(k, i);
            }
            this.g = 1;
        }
    }
    
    public final void onServiceDisconnected(final ComponentName k) {
        synchronized (this.l.d) {
            ((Handler)this.l.f).removeMessages(1, (Object)this.j);
            this.i = null;
            this.k = k;
            final Iterator iterator = this.f.values().iterator();
            while (iterator.hasNext()) {
                ((ServiceConnection)iterator.next()).onServiceDisconnected(k);
            }
            this.g = 2;
        }
    }
}

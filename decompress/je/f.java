// 
// Decompiled by Procyon v0.6.0
// 

package je;

import rd.b;
import android.os.RemoteException;
import java.util.Iterator;
import android.app.PendingIntent;
import android.os.IBinder;
import java.util.HashMap;
import android.content.Context;

public final class f
{
    public final r a;
    public final Context b;
    public boolean c;
    public final HashMap d;
    public final HashMap e;
    public final HashMap f;
    
    public f(final Context b, final r a) {
        this.c = false;
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new HashMap();
        this.b = b;
        this.a = a;
    }
    
    public final void a() throws RemoteException {
        final HashMap d = this.d;
        monitorenter(d);
        Label_0091: {
            try {
                for (final i i : this.d.values()) {
                    if (i != null) {
                        ((b<d>)this.a.a).C().P0(new n(2, (l)null, (IBinder)i, (PendingIntent)null, (IBinder)null, (IBinder)null));
                    }
                }
                break Label_0091;
            }
            finally {
                monitorexit(d);
                this.d.clear();
                monitorexit(d);
                final HashMap f = this.f;
                monitorenter(f);
                Label_0192: {
                    try {
                        for (final g g : this.f.values()) {
                            if (g != null) {
                                ((b<d>)this.a.a).C().P0(new n(2, (l)null, (IBinder)null, (PendingIntent)null, (IBinder)g, (IBinder)null));
                            }
                        }
                        break Label_0192;
                    }
                    finally {
                        monitorexit(f);
                        this.f.clear();
                        monitorexit(f);
                        synchronized (this.e) {
                            for (final h h : this.e.values()) {
                                if (h != null) {
                                    ((b<d>)this.a.a).C().S0(new u(2, (s)null, (IBinder)h, (IBinder)null));
                                }
                            }
                            this.e.clear();
                        }
                    }
                }
            }
        }
    }
    
    public final void b() throws RemoteException {
        if (this.c) {
            if (!((b)this.a.a).b()) {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
            ((b<d>)this.a.a).C().zza();
            this.c = false;
        }
    }
}

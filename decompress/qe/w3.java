// 
// Decompiled by Procyon v0.6.0
// 

package qe;

import android.os.IInterface;
import pd.c2;
import je.h0;
import je.j0;
import je.i0;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

public final class w3 implements ServiceConnection
{
    public final String f;
    public final x3 g;
    
    public w3(final x3 g, final String f) {
        this.g = g;
        this.f = f;
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        if (binder != null) {
            try {
                final int a = i0.a;
                final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                Object o;
                if (queryLocalInterface instanceof j0) {
                    o = queryLocalInterface;
                }
                else {
                    o = new h0(binder);
                }
                if (o == null) {
                    this.g.a.c().p.a("Install Referrer Service implementation was not found");
                    return;
                }
                this.g.a.c().u.a("Install Referrer Service connected");
                this.g.a.a().B((Runnable)new c2((Object)this, 1, o, (Object)this));
                return;
            }
            catch (final RuntimeException ex) {
                this.g.a.c().p.b((Object)ex, "Exception occurred while calling Install Referrer API");
                return;
            }
        }
        this.g.a.c().p.a("Install Referrer connection returned with null binder");
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        this.g.a.c().u.a("Install Referrer Service disconnected");
    }
}

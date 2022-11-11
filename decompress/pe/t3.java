// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.os.IInterface;
import ie.j0;
import ie.l0;
import ie.k0;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

public final class t3 implements ServiceConnection
{
    public final String f;
    public final /* synthetic */ u3 g;
    
    public t3(final u3 g, final String f) {
        this.g = g;
        this.f = f;
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        if (binder != null) {
            try {
                final int a = k0.a;
                final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                Object o;
                if (queryLocalInterface instanceof l0) {
                    o = queryLocalInterface;
                }
                else {
                    o = new j0(binder);
                }
                if (o == null) {
                    this.g.a.h().n.a("Install Referrer Service implementation was not found");
                    return;
                }
                this.g.a.h().s.a("Install Referrer Service connected");
                this.g.a.b().U(new s3(this, (l0)o, (ServiceConnection)this));
                return;
            }
            catch (final RuntimeException ex) {
                this.g.a.h().n.b((Object)ex, "Exception occurred while calling Install Referrer API");
                return;
            }
        }
        this.g.a.h().n.a("Install Referrer connection returned with null binder");
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        this.g.a.h().s.a("Install Referrer Service disconnected");
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import android.os.Handler;
import android.os.IInterface;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

public final class x0 implements ServiceConnection
{
    public final int f;
    public final /* synthetic */ b g;
    
    public x0(final b g, final int f) {
        this.g = g;
        this.f = f;
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        final b g = this.g;
        if (binder == null) {
            b.H((b<IInterface>)g);
            return;
        }
        synchronized (g.r) {
            final b g2 = this.g;
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            k s;
            if (queryLocalInterface != null && queryLocalInterface instanceof k) {
                s = (k)queryLocalInterface;
            }
            else {
                s = new o0(binder);
            }
            g2.s = s;
            monitorexit(g.r);
            final b g3 = this.g;
            final int f = this.f;
            final u0 p2 = g3.p;
            ((Handler)p2).sendMessage(((Handler)p2).obtainMessage(7, f, -1, (Object)new z0(g3, 0)));
        }
    }
    
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName = (ComponentName)this.g.r;
        synchronized (componentName) {
            final b g = this.g;
            g.s = null;
            monitorexit(componentName);
            componentName = (ComponentName)g.p;
            ((Handler)componentName).sendMessage(((Handler)componentName).obtainMessage(6, this.f, 1));
        }
    }
}

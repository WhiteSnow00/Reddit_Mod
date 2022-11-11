// 
// Decompiled by Procyon v0.6.0
// 

package re;

import u5.w;
import android.os.IInterface;
import android.os.RemoteException;
import qd.h1;
import android.os.IBinder;
import android.content.ComponentName;
import qd.d2;
import nd.l;
import android.os.DeadObjectException;
import com.android.billingclient.api.m0;
import yd.a;
import rd.b;
import android.content.ServiceConnection;

public final class k6 implements ServiceConnection, a, b.b
{
    public volatile boolean f;
    public volatile y2 g;
    public final /* synthetic */ l6 h;
    
    public k6(final l6 h) {
        this.h = h;
    }
    
    public final void b() {
        yd.a.O0("MeasurementServiceConnection.onConnected");
        monitorenter(this);
        try {
            try {
                yd.a.S0((Object)this.g);
                ((h4)((w)this.h).f).a().G(new m0(this, ((b<t2>)this.g).C(), 3));
            }
            finally {
                monitorexit(this);
                monitorexit(this);
            }
        }
        catch (final DeadObjectException | IllegalStateException ex) {}
    }
    
    public final void k(final int n) {
        yd.a.O0("MeasurementServiceConnection.onConnectionSuspended");
        ((h4)((w)this.h).f).f().r.a("Service connection suspended");
        ((h4)((w)this.h).f).a().G((Runnable)new l((Object)this, 2));
    }
    
    public final void m(final od.b b) {
        yd.a.O0("MeasurementServiceConnection.onConnectionFailed");
        c3 n = ((h4)((w)this.h).f).n;
        if (n == null || !n.g) {
            n = null;
        }
        if (n != null) {
            n.n.b(b, "Service connection failed");
        }
        synchronized (this) {
            this.f = false;
            this.g = null;
            monitorexit(this);
            ((h4)((w)this.h).f).a().G((Runnable)new d2((Object)this, 1));
        }
    }
    
    public final void onServiceConnected(ComponentName componentName, final IBinder binder) {
        yd.a.O0("MeasurementServiceConnection.onServiceConnected");
        monitorenter(this);
        Label_0044: {
            if (binder != null) {
                break Label_0044;
            }
            try {
                this.f = false;
                ((h4)((w)this.h).f).f().k.a("Service connected with null binder");
                monitorexit(this);
            }
            finally {
                while (true) {
                    while (true) {
                        Label_0275: {
                            break Label_0275;
                            this.f = false;
                            try {
                                final vd.a b = vd.a.b();
                                final l6 h = this.h;
                                b.c(((h4)((w)h).f).f, (ServiceConnection)h.h);
                                while (true) {
                                    monitorexit(this);
                                    return;
                                    Label_0238: {
                                        ((h4)((w)this.h).f).a().G((Runnable)new h1((Object)this, (Object)componentName, 6));
                                    }
                                    continue;
                                }
                                monitorexit(this);
                            }
                            catch (final IllegalArgumentException ex) {}
                        }
                        iftrue(Label_0238:)(componentName != null);
                        continue;
                    }
                    final ComponentName componentName2 = null;
                    final ComponentName componentName3 = componentName = null;
                    try {
                        final String interfaceDescriptor = binder.getInterfaceDescriptor();
                        componentName = componentName3;
                        if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                            componentName = componentName3;
                            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                            componentName = componentName3;
                            Object o;
                            if (queryLocalInterface instanceof t2) {
                                componentName = componentName3;
                                o = queryLocalInterface;
                            }
                            else {
                                componentName = componentName3;
                                o = new r2(binder);
                            }
                            componentName = (ComponentName)o;
                            ((h4)((w)this.h).f).f().s.a("Bound to IMeasurementService interface");
                            componentName = (ComponentName)o;
                        }
                        else {
                            componentName = componentName3;
                            ((h4)((w)this.h).f).f().k.b(interfaceDescriptor, "Got binder with a wrong descriptor");
                            componentName = componentName2;
                        }
                    }
                    catch (final RemoteException ex2) {
                        ((h4)((w)this.h).f).f().k.a("Service connect failed to get IMeasurementService");
                    }
                    continue;
                }
            }
        }
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        yd.a.O0("MeasurementServiceConnection.onServiceDisconnected");
        ((h4)((w)this.h).f).f().r.a("Service disconnected");
        ((h4)((w)this.h).f).a().G((Runnable)new j4(4, (Object)this, (Object)componentName));
    }
}

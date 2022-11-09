// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import android.os.Handler;
import android.os.RemoteException;
import android.os.IBinder;
import android.util.Log;
import android.os.Bundle;
import yd.a;
import he.c;
import android.os.Parcel;
import he.b;

public abstract class n0 extends b
{
    public n0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }
    
    public final boolean k(int n, final Parcel parcel, final Parcel parcel2) throws RemoteException {
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    return false;
                }
                n = parcel.readInt();
                final IBinder strongBinder = parcel.readStrongBinder();
                final a1 f = (a1)c.a(parcel, a1.CREATOR);
                final w0 w0 = (w0)this;
                final rd.b a = w0.a;
                yd.a.T0((Object)a, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                yd.a.S0((Object)f);
                a.F = f;
                final Bundle f2 = f.f;
                yd.a.T0((Object)w0.a, "onPostInitComplete can be called only once per call to getRemoteService");
                final rd.b a2 = w0.a;
                final int b = w0.b;
                final u0 p3 = a2.p;
                ((Handler)p3).sendMessage(((Handler)p3).obtainMessage(1, b, -1, (Object)new y0(a2, n, strongBinder, f2)));
                w0.a = null;
            }
            else {
                parcel.readInt();
                final Bundle bundle = (Bundle)c.a(parcel, Bundle.CREATOR);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", (Throwable)new Exception());
            }
        }
        else {
            final int int1 = parcel.readInt();
            final IBinder strongBinder2 = parcel.readStrongBinder();
            final Bundle bundle2 = (Bundle)c.a(parcel, Bundle.CREATOR);
            final w0 w2 = (w0)this;
            a.T0((Object)w2.a, "onPostInitComplete can be called only once per call to getRemoteService");
            final rd.b a3 = w2.a;
            n = w2.b;
            final u0 p4 = a3.p;
            ((Handler)p4).sendMessage(((Handler)p4).obtainMessage(1, n, -1, (Object)new y0(a3, int1, strongBinder2, bundle2)));
            w2.a = null;
        }
        parcel2.writeNoException();
        return true;
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package qd;

import android.os.Handler;
import android.os.RemoteException;
import android.os.IBinder;
import android.util.Log;
import android.os.Bundle;
import mg.d0;
import ge.c;
import android.os.Parcel;
import ge.b;

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
                final int int1 = parcel.readInt();
                final IBinder strongBinder = parcel.readStrongBinder();
                final a1 f = (a1)c.a(parcel, a1.CREATOR);
                final w0 w0 = (w0)this;
                final qd.b a = w0.a;
                d0.z((Object)a, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                d0.y((Object)f);
                a.F = f;
                final Bundle f2 = f.f;
                d0.z((Object)w0.a, "onPostInitComplete can be called only once per call to getRemoteService");
                final qd.b a2 = w0.a;
                n = w0.b;
                final u0 p3 = a2.p;
                ((Handler)p3).sendMessage(((Handler)p3).obtainMessage(1, n, -1, (Object)new y0(a2, int1, strongBinder, f2)));
                w0.a = null;
            }
            else {
                parcel.readInt();
                final Bundle bundle = (Bundle)c.a(parcel, Bundle.CREATOR);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", (Throwable)new Exception());
            }
        }
        else {
            n = parcel.readInt();
            final IBinder strongBinder2 = parcel.readStrongBinder();
            final Bundle bundle2 = (Bundle)c.a(parcel, Bundle.CREATOR);
            final w0 w2 = (w0)this;
            d0.z((Object)w2.a, "onPostInitComplete can be called only once per call to getRemoteService");
            final qd.b a3 = w2.a;
            final int b = w2.b;
            final u0 p4 = a3.p;
            ((Handler)p4).sendMessage(((Handler)p4).obtainMessage(1, b, -1, (Object)new y0(a3, n, strongBinder2, bundle2)));
            w2.a = null;
        }
        parcel2.writeNoException();
        return true;
    }
}

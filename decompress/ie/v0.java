// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import android.os.RemoteException;
import android.os.Bundle;
import android.os.Parcel;

public abstract class v0 extends h0 implements w0
{
    public v0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }
    
    public final boolean l(final int n, final Parcel parcel, final Parcel parcel2) throws RemoteException {
        if (n == 1) {
            final Bundle bundle = (Bundle)i0.a(parcel, Bundle.CREATOR);
            i0.b(parcel);
            ((p0)this).c(bundle);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}

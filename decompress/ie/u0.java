// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import android.os.RemoteException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Bundle;
import android.os.IBinder;

public final class u0 extends g0 implements w0
{
    public u0(final IBinder binder) {
        super(binder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }
    
    public final void c(final Bundle bundle) throws RemoteException {
        final Parcel l = this.l();
        i0.c(l, (Parcelable)bundle);
        this.N(l, 1);
    }
}

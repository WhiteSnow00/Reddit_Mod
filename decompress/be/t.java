// 
// Decompiled by Procyon v0.6.0
// 

package be;

import android.os.RemoteException;
import android.os.Parcelable;
import android.os.IInterface;
import android.os.Parcel;
import android.os.IBinder;

public final class t extends l implements u
{
    public t(final IBinder binder) {
        super(binder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }
    
    public final void f0(final q q, final w w) throws RemoteException {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(super.b);
        m.b(obtain, (IInterface)q);
        m.c(obtain, (Parcelable)w);
        this.l(obtain, 2);
    }
}

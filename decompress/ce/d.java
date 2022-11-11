// 
// Decompiled by Procyon v0.6.0
// 

package ce;

import android.os.RemoteException;
import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;

public final class d implements e, IInterface
{
    public final IBinder a;
    
    public d(final IBinder a) {
        this.a = a;
    }
    
    public final void A(String obtain, final j j) throws RemoteException {
        final Parcel obtain2 = Parcel.obtain();
        obtain2.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        obtain2.writeString(obtain);
        final int a = c.a;
        obtain2.writeStrongBinder((IBinder)j);
        obtain = (String)Parcel.obtain();
        try {
            this.a.transact(2, obtain2, (Parcel)obtain, 0);
            ((Parcel)obtain).readException();
        }
        finally {
            obtain2.recycle();
            ((Parcel)obtain).recycle();
        }
    }
    
    public final IBinder asBinder() {
        return this.a;
    }
    
    public final void p0(final k k) throws RemoteException {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        final int a = c.a;
        obtain.writeStrongBinder((IBinder)k);
        final Parcel obtain2 = Parcel.obtain();
        try {
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}

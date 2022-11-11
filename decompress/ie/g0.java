// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import android.os.RemoteException;
import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;

public class g0 implements IInterface
{
    public final IBinder a;
    public final String b;
    
    public g0(final IBinder a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final void N(final Parcel parcel, final int n) throws RemoteException {
        final Parcel obtain = Parcel.obtain();
        try {
            this.a.transact(n, parcel, obtain, 0);
            obtain.readException();
        }
        finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
    
    public final IBinder asBinder() {
        return this.a;
    }
    
    public final Parcel l() {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        return obtain;
    }
    
    public final Parcel o(final Parcel parcel, final int n) throws RemoteException {
        final Parcel obtain = Parcel.obtain();
        try {
            try {
                this.a.transact(n, parcel, obtain, 0);
                obtain.readException();
                parcel.recycle();
                return obtain;
            }
            finally {}
        }
        catch (final RuntimeException ex) {
            obtain.recycle();
            throw ex;
        }
        parcel.recycle();
    }
}

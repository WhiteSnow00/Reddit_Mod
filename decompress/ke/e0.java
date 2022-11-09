// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import android.os.RemoteException;
import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;

public class e0 implements IInterface
{
    public final IBinder a;
    public final String b;
    
    public e0(final IBinder a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final void J(final Parcel parcel, final int n) throws RemoteException {
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
    
    public final Parcel k() {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        return obtain;
    }
    
    public final Parcel m(final Parcel parcel, final int n) throws RemoteException {
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

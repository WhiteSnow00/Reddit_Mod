// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import android.os.RemoteException;
import android.os.Parcel;
import android.os.IBinder;

public final class o0 implements k
{
    public final IBinder a;
    
    public o0(final IBinder a) {
        this.a = a;
    }
    
    public final IBinder asBinder() {
        return this.a;
    }
    
    @Override
    public final void f1(final w0 w0, final f f) throws RemoteException {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder((IBinder)w0);
            obtain.writeInt(1);
            d1.a(f, obtain, 0);
            this.a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

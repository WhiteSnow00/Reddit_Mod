// 
// Decompiled by Procyon v0.6.0
// 

package he;

import android.os.RemoteException;
import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;

public class a implements IInterface
{
    public final IBinder a;
    public final String b;
    
    public a(final IBinder a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final IBinder asBinder() {
        return this.a;
    }
    
    public final void l(final Parcel parcel, final int n) throws RemoteException {
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
}

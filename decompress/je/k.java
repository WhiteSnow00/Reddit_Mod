// 
// Decompiled by Procyon v0.6.0
// 

package je;

import android.os.RemoteException;
import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;

public class k extends Binder implements IInterface
{
    public final IBinder asBinder() {
        return (IBinder)this;
    }
    
    public boolean k(final int n, final Parcel parcel) throws RemoteException {
        throw null;
    }
    
    public final boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) throws RemoteException {
        boolean onTransact;
        if (n > 16777215) {
            onTransact = super.onTransact(n, parcel, parcel2, n2);
        }
        else {
            parcel.enforceInterface(this.getInterfaceDescriptor());
            onTransact = false;
        }
        return onTransact || this.k(n, parcel);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import android.os.RemoteException;
import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;

public class f0 extends Binder implements IInterface
{
    public f0(final String s) {
        this.attachInterface((IInterface)this, s);
    }
    
    public IBinder asBinder() {
        return (IBinder)this;
    }
    
    public boolean k(final int n, final Parcel parcel, final Parcel parcel2) throws RemoteException {
        throw null;
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) throws RemoteException {
        if (n > 16777215) {
            if (super.onTransact(n, parcel, parcel2, n2)) {
                return true;
            }
        }
        else {
            parcel.enforceInterface(this.getInterfaceDescriptor());
        }
        return this.k(n, parcel, parcel2);
    }
}

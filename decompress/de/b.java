// 
// Decompiled by Procyon v0.6.0
// 

package de;

import android.os.RemoteException;
import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;

public class b extends Binder implements IInterface
{
    public b(final String s) {
        this.attachInterface((IInterface)this, s);
    }
    
    public final IBinder asBinder() {
        return (IBinder)this;
    }
    
    public final boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) throws RemoteException {
        if (n > 16777215) {
            if (super.onTransact(n, parcel, parcel2, n2)) {
                return true;
            }
        }
        else {
            parcel.enforceInterface(this.getInterfaceDescriptor());
        }
        return this.z1(n, parcel, parcel2);
    }
    
    public boolean z1(final int n, final Parcel parcel, final Parcel parcel2) throws RemoteException {
        throw null;
    }
}

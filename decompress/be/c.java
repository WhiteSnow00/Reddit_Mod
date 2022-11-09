// 
// Decompiled by Procyon v0.6.0
// 

package be;

import android.os.RemoteException;
import android.os.Parcel;
import android.os.IBinder;

public final class c extends a implements e
{
    public c(final IBinder binder) {
        super(binder);
    }
    
    @Override
    public final String s() throws RemoteException {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        final Parcel k = this.k(obtain, 1);
        final String string = k.readString();
        k.recycle();
        return string;
    }
    
    @Override
    public final boolean t() throws RemoteException {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        final int a = b.a;
        boolean b = true;
        obtain.writeInt(1);
        final Parcel k = this.k(obtain, 2);
        if (k.readInt() == 0) {
            b = false;
        }
        k.recycle();
        return b;
    }
    
    @Override
    public final boolean u() throws RemoteException {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        final Parcel k = this.k(obtain, 6);
        final int a = b.a;
        final boolean b = k.readInt() != 0;
        k.recycle();
        return b;
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package te;

import java.util.ArrayList;
import java.util.List;
import android.os.RemoteException;
import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;

public final class b implements a, IInterface
{
    public final IBinder a;
    
    public b(final IBinder a) {
        this.a = a;
    }
    
    @Override
    public final String a(final String s) throws RemoteException {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.oss.licenses.IOSSLicenseService");
        obtain.writeString(s);
        final Parcel k = this.k(obtain, 2);
        final String string = k.readString();
        k.recycle();
        return string;
    }
    
    public final IBinder asBinder() {
        return this.a;
    }
    
    @Override
    public final String g(String string) throws RemoteException {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.oss.licenses.IOSSLicenseService");
        obtain.writeString(string);
        final Parcel k = this.k(obtain, 4);
        string = k.readString();
        k.recycle();
        return string;
    }
    
    @Override
    public final String i(final String s) throws RemoteException {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.oss.licenses.IOSSLicenseService");
        obtain.writeString(s);
        final Parcel k = this.k(obtain, 3);
        final String string = k.readString();
        k.recycle();
        return string;
    }
    
    @Override
    public final ArrayList j1(final List list) throws RemoteException {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.oss.licenses.IOSSLicenseService");
        obtain.writeList(list);
        final Parcel k = this.k(obtain, 5);
        final ArrayList arrayList = k.readArrayList(le.a.a);
        k.recycle();
        return arrayList;
    }
    
    public final Parcel k(final Parcel parcel, final int n) {
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

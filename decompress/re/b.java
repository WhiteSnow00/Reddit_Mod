// 
// Decompiled by Procyon v0.6.0
// 

package re;

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
    
    public final IBinder asBinder() {
        return this.a;
    }
    
    public final String b(String string) throws RemoteException {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.oss.licenses.IOSSLicenseService");
        obtain.writeString(string);
        final Parcel l = this.l(obtain, 2);
        string = l.readString();
        l.recycle();
        return string;
    }
    
    public final String h(String string) throws RemoteException {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.oss.licenses.IOSSLicenseService");
        obtain.writeString(string);
        final Parcel l = this.l(obtain, 4);
        string = l.readString();
        l.recycle();
        return string;
    }
    
    public final String j(String string) throws RemoteException {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.oss.licenses.IOSSLicenseService");
        obtain.writeString(string);
        final Parcel l = this.l(obtain, 3);
        string = l.readString();
        l.recycle();
        return string;
    }
    
    public final Parcel l(final Parcel parcel, final int n) {
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
    
    public final ArrayList r1(final List list) throws RemoteException {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.oss.licenses.IOSSLicenseService");
        obtain.writeList(list);
        final Parcel l = this.l(obtain, 5);
        final ArrayList arrayList = l.readArrayList(je.a.a);
        l.recycle();
        return arrayList;
    }
}

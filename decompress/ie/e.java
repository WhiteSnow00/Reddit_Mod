// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import android.os.RemoteException;
import android.os.Parcel;
import android.location.Location;
import android.os.IBinder;

public final class e extends a implements d
{
    public e(final IBinder binder) {
        super(binder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }
    
    public final Location a(final String s) throws RemoteException {
        Object obtain = Parcel.obtain();
        ((Parcel)obtain).writeInterfaceToken(super.b);
        ((Parcel)obtain).writeString(s);
        final Parcel obtain2 = Parcel.obtain();
        try {
            try {
                super.a.transact(21, (Parcel)obtain, obtain2, 0);
                obtain2.readException();
                ((Parcel)obtain).recycle();
                obtain = p.a(obtain2, Location.CREATOR);
                obtain2.recycle();
                return (Location)obtain;
            }
            finally {}
        }
        catch (final RuntimeException ex) {
            ((Parcel)s).recycle();
            throw ex;
        }
        ((Parcel)obtain).recycle();
    }
    
    public final void a0(final n n) throws RemoteException {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(super.b);
        final int a = p.a;
        obtain.writeInt(1);
        n.writeToParcel(obtain, 0);
        this.k(obtain, 59);
    }
    
    public final void e1(final u u) throws RemoteException {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(super.b);
        final int a = p.a;
        obtain.writeInt(1);
        u.writeToParcel(obtain, 0);
        this.k(obtain, 75);
    }
    
    public final void zza() throws RemoteException {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(super.b);
        final int a = p.a;
        obtain.writeInt(0);
        this.k(obtain, 12);
    }
}

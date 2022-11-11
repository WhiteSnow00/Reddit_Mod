// 
// Decompiled by Procyon v0.6.0
// 

package be;

import android.os.Parcelable;
import hd.a;
import android.os.RemoteException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.IBinder;

public final class b extends l implements c
{
    public b(final IBinder binder) {
        super(binder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }
    
    public final void T(final f f, final String s) throws RemoteException {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(super.b);
        m.b(obtain, (IInterface)f);
        obtain.writeString(s);
        this.l(obtain, 2);
    }
    
    public final void w1(final g g, final a a) throws RemoteException {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(super.b);
        m.b(obtain, (IInterface)g);
        m.c(obtain, (Parcelable)a);
        this.l(obtain, 1);
    }
}

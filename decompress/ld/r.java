// 
// Decompiled by Procyon v0.6.0
// 

package ld;

import android.os.RemoteException;
import android.os.Parcelable;
import android.os.IInterface;
import de.m;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import android.os.IBinder;
import de.l;

public final class r extends l implements s
{
    public r(final IBinder binder) {
        super(binder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }
    
    public final void E0(final j j, final GoogleSignInOptions googleSignInOptions) throws RemoteException {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(super.b);
        m.b(obtain, (IInterface)j);
        m.c(obtain, (Parcelable)googleSignInOptions);
        this.k(obtain, 102);
    }
    
    public final void W0(final ld.l l, final GoogleSignInOptions googleSignInOptions) throws RemoteException {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(super.b);
        m.b(obtain, (IInterface)l);
        m.c(obtain, (Parcelable)googleSignInOptions);
        this.k(obtain, 103);
    }
}

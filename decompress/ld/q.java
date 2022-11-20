// 
// Decompiled by Procyon v0.6.0
// 

package ld;

import android.os.RemoteException;
import android.os.Parcelable;
import android.os.IInterface;
import ce.m;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import android.os.IBinder;
import ce.l;

public final class q extends l implements r
{
    public q(final IBinder binder) {
        super(binder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }
    
    public final void D0(final i i, final GoogleSignInOptions googleSignInOptions) throws RemoteException {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(super.b);
        m.b(obtain, (IInterface)i);
        m.c(obtain, (Parcelable)googleSignInOptions);
        this.k(obtain, 102);
    }
    
    public final void a1(final k k, final GoogleSignInOptions googleSignInOptions) throws RemoteException {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(super.b);
        m.b(obtain, (IInterface)k);
        m.c(obtain, (Parcelable)googleSignInOptions);
        this.k(obtain, 103);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package dd;

import android.os.Parcelable$Creator;
import fa.c;
import android.os.Parcel;
import android.os.IBinder;
import fa.b;
import android.os.RemoteException;
import android.os.Bundle;
import android.os.IInterface;

public interface a extends IInterface
{
    Bundle E(final Bundle p0) throws RemoteException;
    
    public abstract static class a extends b implements a
    {
        public static final class a extends fa.a implements dd.a
        {
            public a(final IBinder binder) {
                super(binder);
            }
            
            public final Bundle E(Bundle bundle) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                final int a = c.a;
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
                final Parcel obtain2 = Parcel.obtain();
                try {
                    try {
                        super.a.transact(1, obtain, obtain2, 0);
                        obtain2.readException();
                        obtain.recycle();
                        final Parcelable$Creator creator = Bundle.CREATOR;
                        Object o;
                        if (obtain2.readInt() == 0) {
                            o = null;
                        }
                        else {
                            o = creator.createFromParcel(obtain2);
                        }
                        bundle = (Bundle)o;
                        obtain2.recycle();
                        return bundle;
                    }
                    finally {}
                }
                catch (final RuntimeException ex) {
                    obtain2.recycle();
                    throw ex;
                }
                obtain.recycle();
            }
        }
    }
}

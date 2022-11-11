// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app.unusedapprestrictions;

import android.os.Parcel;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.IInterface;

public interface IUnusedAppRestrictionsBackportCallback extends IInterface
{
    public static final String DESCRIPTOR = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback";
    
    void onIsPermissionRevocationEnabledForAppResult(final boolean p0, final boolean p1) throws RemoteException;
    
    public static class Default implements IUnusedAppRestrictionsBackportCallback
    {
        public IBinder asBinder() {
            return null;
        }
        
        @Override
        public void onIsPermissionRevocationEnabledForAppResult(final boolean b, final boolean b2) throws RemoteException {
        }
    }
    
    public abstract static class Stub extends Binder implements IUnusedAppRestrictionsBackportCallback
    {
        public static final int TRANSACTION_onIsPermissionRevocationEnabledForAppResult = 1;
        
        public Stub() {
            this.attachInterface((IInterface)this, "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
        }
        
        public static IUnusedAppRestrictionsBackportCallback asInterface(final IBinder binder) {
            if (binder == null) {
                return null;
            }
            final IInterface queryLocalInterface = binder.queryLocalInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
            if (queryLocalInterface != null && queryLocalInterface instanceof IUnusedAppRestrictionsBackportCallback) {
                return (IUnusedAppRestrictionsBackportCallback)queryLocalInterface;
            }
            return new a(binder);
        }
        
        public IBinder asBinder() {
            return (IBinder)this;
        }
        
        public boolean onTransact(int int1, final Parcel parcel, final Parcel parcel2, final int n) throws RemoteException {
            if (int1 >= 1 && int1 <= 16777215) {
                parcel.enforceInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
            }
            if (int1 == 1598968902) {
                parcel2.writeString("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
                return true;
            }
            if (int1 != 1) {
                return super.onTransact(int1, parcel, parcel2, n);
            }
            int1 = parcel.readInt();
            boolean b = false;
            final boolean b2 = int1 != 0;
            if (parcel.readInt() != 0) {
                b = true;
            }
            this.onIsPermissionRevocationEnabledForAppResult(b2, b);
            return true;
        }
        
        public static final class a implements IUnusedAppRestrictionsBackportCallback
        {
            public IBinder a;
            
            public a(final IBinder a) {
                this.a = a;
            }
            
            public final IBinder asBinder() {
                return this.a;
            }
            
            @Override
            public final void onIsPermissionRevocationEnabledForAppResult(final boolean b, final boolean b2) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
                    final int n = 0;
                    int n2;
                    if (b) {
                        n2 = 1;
                    }
                    else {
                        n2 = 0;
                    }
                    obtain.writeInt(n2);
                    int n3 = n;
                    if (b2) {
                        n3 = 1;
                    }
                    obtain.writeInt(n3);
                    this.a.transact(1, obtain, (Parcel)null, 1);
                }
                finally {
                    obtain.recycle();
                }
            }
        }
    }
}

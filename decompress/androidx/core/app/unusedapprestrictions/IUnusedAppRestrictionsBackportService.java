// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app.unusedapprestrictions;

import android.os.Parcel;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.IInterface;

public interface IUnusedAppRestrictionsBackportService extends IInterface
{
    public static final String DESCRIPTOR = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService";
    
    void isPermissionRevocationEnabledForApp(final IUnusedAppRestrictionsBackportCallback p0) throws RemoteException;
    
    public static class Default implements IUnusedAppRestrictionsBackportService
    {
        public IBinder asBinder() {
            return null;
        }
        
        @Override
        public void isPermissionRevocationEnabledForApp(final IUnusedAppRestrictionsBackportCallback unusedAppRestrictionsBackportCallback) throws RemoteException {
        }
    }
    
    public abstract static class Stub extends Binder implements IUnusedAppRestrictionsBackportService
    {
        public static final int TRANSACTION_isPermissionRevocationEnabledForApp = 1;
        
        public Stub() {
            this.attachInterface((IInterface)this, "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
        }
        
        public static IUnusedAppRestrictionsBackportService asInterface(final IBinder binder) {
            if (binder == null) {
                return null;
            }
            final IInterface queryLocalInterface = binder.queryLocalInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
            if (queryLocalInterface != null && queryLocalInterface instanceof IUnusedAppRestrictionsBackportService) {
                return (IUnusedAppRestrictionsBackportService)queryLocalInterface;
            }
            return new a(binder);
        }
        
        public IBinder asBinder() {
            return (IBinder)this;
        }
        
        public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) throws RemoteException {
            if (n >= 1 && n <= 16777215) {
                parcel.enforceInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
            }
            if (n == 1598968902) {
                parcel2.writeString("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
                return true;
            }
            if (n != 1) {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            this.isPermissionRevocationEnabledForApp(IUnusedAppRestrictionsBackportCallback.Stub.asInterface(parcel.readStrongBinder()));
            return true;
        }
        
        public static final class a implements IUnusedAppRestrictionsBackportService
        {
            public IBinder a;
            
            public a(final IBinder a) {
                this.a = a;
            }
            
            public final IBinder asBinder() {
                return this.a;
            }
            
            @Override
            public final void isPermissionRevocationEnabledForApp(final IUnusedAppRestrictionsBackportCallback unusedAppRestrictionsBackportCallback) throws RemoteException {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
                    obtain.writeStrongInterface((IInterface)unusedAppRestrictionsBackportCallback);
                    this.a.transact(1, obtain, (Parcel)null, 1);
                }
                finally {
                    obtain.recycle();
                }
            }
        }
    }
}

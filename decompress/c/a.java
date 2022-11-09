// 
// Decompiled by Procyon v0.6.0
// 

package c;

import android.os.RemoteException;
import android.os.Parcelable$Creator;
import android.os.Bundle;
import android.os.Parcel;
import android.os.IBinder;
import android.os.Binder;
import android.os.IInterface;

public interface a extends IInterface
{
    public abstract static class a extends Binder implements a
    {
        public a() {
            this.attachInterface((IInterface)this, "android.support.v4.os.IResultReceiver");
        }
        
        public final IBinder asBinder() {
            return (IBinder)this;
        }
        
        public final boolean onTransact(int int1, final Parcel parcel, final Parcel parcel2, final int n) throws RemoteException {
            if (int1 >= 1 && int1 <= 16777215) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
            }
            if (int1 == 1598968902) {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
            if (int1 != 1) {
                return super.onTransact(int1, parcel, parcel2, n);
            }
            int1 = parcel.readInt();
            final Parcelable$Creator creator = Bundle.CREATOR;
            Object fromParcel;
            if (parcel.readInt() != 0) {
                fromParcel = creator.createFromParcel(parcel);
            }
            else {
                fromParcel = null;
            }
            final Bundle bundle = (Bundle)fromParcel;
            final b.b b = (b.b)this;
            b.b.getClass();
            b.b.a(int1, bundle);
            return true;
        }
        
        public static final class a implements c.a
        {
            public IBinder a;
            
            public a(final IBinder a) {
                this.a = a;
            }
            
            public final IBinder asBinder() {
                return this.a;
            }
        }
    }
}

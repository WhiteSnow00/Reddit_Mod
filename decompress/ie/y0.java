// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import android.os.RemoteException;
import android.os.Bundle;
import android.os.Parcel;

public abstract class y0 extends h0 implements z0
{
    public y0() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }
    
    public final boolean l(int a, final Parcel parcel, final Parcel parcel2) throws RemoteException {
        if (a != 1) {
            if (a != 2) {
                return false;
            }
            a = ((v1)this).a();
            parcel2.writeNoException();
            parcel2.writeInt(a);
        }
        else {
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            final Bundle bundle = (Bundle)i0.a(parcel, Bundle.CREATOR);
            final long long1 = parcel.readLong();
            i0.b(parcel);
            ((v1)this).e0(long1, bundle, string, string2);
            parcel2.writeNoException();
        }
        return true;
    }
}

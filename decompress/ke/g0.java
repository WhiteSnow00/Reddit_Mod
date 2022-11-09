// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import android.os.IBinder;
import android.os.IInterface;
import android.os.BadParcelableException;
import ak0.n;
import android.os.Parcelable;
import android.os.Parcelable$Creator;
import android.os.Parcel;

public final class g0
{
    public static final ClassLoader a;
    
    static {
        a = g0.class.getClassLoader();
    }
    
    public static Parcelable a(final Parcel parcel, final Parcelable$Creator parcelable$Creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable)parcelable$Creator.createFromParcel(parcel);
    }
    
    public static void b(final Parcel parcel) {
        final int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        throw new BadParcelableException(n.k("Parcel data not fully consumed, unread size: ", dataAvail));
    }
    
    public static void c(final Parcel parcel, final Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
    
    public static void d(final Parcel parcel, final IInterface interface1) {
        if (interface1 == null) {
            parcel.writeStrongBinder((IBinder)null);
            return;
        }
        parcel.writeStrongBinder(interface1.asBinder());
    }
}

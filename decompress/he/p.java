// 
// Decompiled by Procyon v0.6.0
// 

package he;

import android.os.Parcelable;
import android.os.Parcelable$Creator;
import android.os.Parcel;

public final class p
{
    static {
        p.class.getClassLoader();
    }
    
    public static <T extends Parcelable> T a(final Parcel parcel, final Parcelable$Creator<T> parcelable$Creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (T)parcelable$Creator.createFromParcel(parcel);
    }
}

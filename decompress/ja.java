// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class ja implements Parcelable$Creator
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        String c = null;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            if ((char)int1 != '\u0001') {
                SafeParcelReader.n(parcel, int1);
            }
            else {
                c = SafeParcelReader.c(parcel, int1);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new ia(c);
    }
}

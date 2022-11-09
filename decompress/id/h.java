// 
// Decompiled by Procyon v0.6.0
// 

package id;

import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class h implements Parcelable$Creator<a$c>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        boolean h = false;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            if ((char)int1 != '\u0001') {
                SafeParcelReader.n(parcel, int1);
            }
            else {
                h = SafeParcelReader.h(parcel, int1);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new a$c(h);
    }
}

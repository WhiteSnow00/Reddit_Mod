// 
// Decompiled by Procyon v0.6.0
// 

package od;

import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class l implements Parcelable$Creator<d>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        String c = null;
        int j = 0;
        long k = -1L;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            final char c2 = (char)int1;
            if (c2 != '\u0001') {
                if (c2 != '\u0002') {
                    if (c2 != '\u0003') {
                        SafeParcelReader.n(parcel, int1);
                    }
                    else {
                        k = SafeParcelReader.k(parcel, int1);
                    }
                }
                else {
                    j = SafeParcelReader.j(parcel, int1);
                }
            }
            else {
                c = SafeParcelReader.c(parcel, int1);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new d(c, j, k);
    }
}

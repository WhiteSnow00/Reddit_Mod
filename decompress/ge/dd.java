// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class dd implements Parcelable$Creator
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        String c = null;
        String c3;
        String c2 = c3 = c;
        long k = 0L;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            final char c4 = (char)int1;
            if (c4 != '\u0001') {
                if (c4 != '\u0002') {
                    if (c4 != '\u0003') {
                        if (c4 != '\u0004') {
                            SafeParcelReader.n(parcel, int1);
                        }
                        else {
                            k = SafeParcelReader.k(parcel, int1);
                        }
                    }
                    else {
                        c3 = SafeParcelReader.c(parcel, int1);
                    }
                }
                else {
                    c2 = SafeParcelReader.c(parcel, int1);
                }
            }
            else {
                c = SafeParcelReader.c(parcel, int1);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new cd(c, c2, c3, k);
    }
}

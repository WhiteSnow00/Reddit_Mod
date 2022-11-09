// 
// Decompiled by Procyon v0.6.0
// 

package oe;

import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import android.os.Parcelable$Creator;

public final class b implements Parcelable$Creator<LocationAvailability>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        int i;
        int j = i = 1;
        int k = 1000;
        long l = 0L;
        f[] array = null;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            final char c = (char)int1;
            if (c != '\u0001') {
                if (c != '\u0002') {
                    if (c != '\u0003') {
                        if (c != '\u0004') {
                            if (c != '\u0005') {
                                SafeParcelReader.n(parcel, int1);
                            }
                            else {
                                array = (f[])SafeParcelReader.e(parcel, int1, (Parcelable$Creator)f.CREATOR);
                            }
                        }
                        else {
                            k = SafeParcelReader.j(parcel, int1);
                        }
                    }
                    else {
                        l = SafeParcelReader.k(parcel, int1);
                    }
                }
                else {
                    i = SafeParcelReader.j(parcel, int1);
                }
            }
            else {
                j = SafeParcelReader.j(parcel, int1);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new LocationAvailability(k, j, i, l, array);
    }
}

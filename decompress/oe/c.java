// 
// Decompiled by Procyon v0.6.0
// 

package oe;

import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import com.google.android.gms.location.LocationRequest;
import android.os.Parcelable$Creator;

public final class c implements Parcelable$Creator<LocationRequest>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        int j = 102;
        long k = 3600000L;
        long i = 600000L;
        boolean h = false;
        long l = Long.MAX_VALUE;
        int m = Integer.MAX_VALUE;
        float float1 = 0.0f;
        long k2 = 0L;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.n(parcel, int1);
                    continue;
                }
                case '\b': {
                    k2 = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\u0007': {
                    SafeParcelReader.q(parcel, int1, 4);
                    float1 = parcel.readFloat();
                    continue;
                }
                case '\u0006': {
                    m = SafeParcelReader.j(parcel, int1);
                    continue;
                }
                case '\u0005': {
                    l = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\u0004': {
                    h = SafeParcelReader.h(parcel, int1);
                    continue;
                }
                case '\u0003': {
                    i = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\u0002': {
                    k = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\u0001': {
                    j = SafeParcelReader.j(parcel, int1);
                    continue;
                }
            }
        }
        SafeParcelReader.g(parcel, o);
        return new LocationRequest(j, k, i, h, l, m, float1, k2);
    }
}

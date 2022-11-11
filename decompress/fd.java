// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class fd implements Parcelable$Creator
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        String c = null;
        String c3;
        String c2 = c3 = c;
        String c5;
        String c4 = c5 = c3;
        String c7;
        String c6 = c7 = c5;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.n(parcel, int1);
                    continue;
                }
                case '\b': {
                    c7 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0007': {
                    c6 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0006': {
                    c5 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0005': {
                    c4 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0004': {
                    c3 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0003': {
                    c2 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0002': {
                    c = SafeParcelReader.c(parcel, int1);
                    continue;
                }
            }
        }
        SafeParcelReader.g(parcel, o);
        return new ed(c, c2, c3, c4, c5, c6, c7);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import android.os.Bundle;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class b1 implements Parcelable$Creator
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        long i;
        long k = i = 0L;
        String c = null;
        String c3;
        String c2 = c3 = c;
        String c4;
        Object a = c4 = c3;
        boolean h = false;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.n(parcel, int1);
                    continue;
                }
                case '\b': {
                    c4 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0007': {
                    a = SafeParcelReader.a(parcel, int1);
                    continue;
                }
                case '\u0006': {
                    c3 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0005': {
                    c2 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0004': {
                    c = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0003': {
                    h = SafeParcelReader.h(parcel, int1);
                    continue;
                }
                case '\u0002': {
                    i = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\u0001': {
                    k = SafeParcelReader.k(parcel, int1);
                    continue;
                }
            }
        }
        SafeParcelReader.g(parcel, o);
        return new a1(k, i, h, c, c2, c3, (Bundle)a, c4);
    }
}

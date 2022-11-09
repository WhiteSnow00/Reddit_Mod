// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.io.Serializable;
import java.util.ArrayList;
import ih.y;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class bd implements Parcelable$Creator
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        long i;
        long k = i = 0L;
        boolean h2;
        boolean h = h2 = false;
        Serializable c = null;
        Serializable c3;
        String c2 = (String)(c3 = c);
        Object o2;
        String c4 = (String)(o2 = c3);
        Object c6;
        Object c5 = c6 = o2;
        Object f;
        Object o3 = f = c6;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.n(parcel, int1);
                    continue;
                }
                case '\u000e': {
                    f = SafeParcelReader.f(parcel, int1, hd.CREATOR);
                    continue;
                }
                case '\r': {
                    o3 = SafeParcelReader.b(parcel, int1, y.CREATOR);
                    continue;
                }
                case '\f': {
                    h2 = SafeParcelReader.h(parcel, int1);
                    continue;
                }
                case '\u000b': {
                    i = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\n': {
                    k = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\t': {
                    c6 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\b': {
                    c5 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0007': {
                    o2 = SafeParcelReader.b(parcel, int1, ld.CREATOR);
                    continue;
                }
                case '\u0006': {
                    c4 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0005': {
                    c3 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0004': {
                    h = SafeParcelReader.h(parcel, int1);
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
        return new ad((String)c, c2, h, (String)c3, c4, (ld)o2, (String)c5, (String)c6, k, i, h2, (y)o3, (ArrayList)f);
    }
}

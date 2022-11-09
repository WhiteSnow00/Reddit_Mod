// 
// Decompiled by Procyon v0.6.0
// 

package re;

import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class d implements Parcelable$Creator
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        long k = 0L;
        long j;
        long i = j = k;
        Object c = null;
        Object o2;
        String c2 = (String)(o2 = c);
        Object o3;
        Object c3 = o3 = o2;
        Object o4;
        t t = (t)(o4 = o3);
        boolean h = false;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.n(parcel, int1);
                    continue;
                }
                case '\f': {
                    o4 = SafeParcelReader.b(parcel, int1, re.t.CREATOR);
                    continue;
                }
                case '\u000b': {
                    j = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\n': {
                    t = (t)SafeParcelReader.b(parcel, int1, re.t.CREATOR);
                    continue;
                }
                case '\t': {
                    i = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\b': {
                    o3 = SafeParcelReader.b(parcel, int1, re.t.CREATOR);
                    continue;
                }
                case '\u0007': {
                    c3 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0006': {
                    h = SafeParcelReader.h(parcel, int1);
                    continue;
                }
                case '\u0005': {
                    k = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\u0004': {
                    o2 = SafeParcelReader.b(parcel, int1, j7.CREATOR);
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
        return new c((String)c, c2, (j7)o2, k, h, (String)c3, (t)o3, i, t, j, (t)o4);
    }
}

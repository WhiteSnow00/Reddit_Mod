// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import com.google.android.gms.common.internal.MethodInvocation;
import android.os.Parcelable$Creator;

public final class f0 implements Parcelable$Creator<MethodInvocation>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        String c2;
        String c = c2 = null;
        long i;
        long k = i = 0L;
        int l;
        int j = l = 0;
        int j2;
        int m = j2 = l;
        int j3 = -1;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.n(parcel, int1);
                    continue;
                }
                case '\t': {
                    j3 = SafeParcelReader.j(parcel, int1);
                    continue;
                }
                case '\b': {
                    j2 = SafeParcelReader.j(parcel, int1);
                    continue;
                }
                case '\u0007': {
                    c2 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0006': {
                    c = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0005': {
                    i = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\u0004': {
                    k = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\u0003': {
                    m = SafeParcelReader.j(parcel, int1);
                    continue;
                }
                case '\u0002': {
                    l = SafeParcelReader.j(parcel, int1);
                    continue;
                }
                case '\u0001': {
                    j = SafeParcelReader.j(parcel, int1);
                    continue;
                }
            }
        }
        SafeParcelReader.g(parcel, o);
        return new MethodInvocation(j, l, m, k, i, c, c2, j2, j3);
    }
}

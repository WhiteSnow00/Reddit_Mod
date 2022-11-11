// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import java.io.Serializable;
import java.util.ArrayList;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class r7 implements Parcelable$Creator
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        Serializable c = null;
        Serializable c3;
        String c2 = (String)(c3 = c);
        Serializable c5;
        String c4 = (String)(c5 = c3);
        Serializable c7;
        String c6 = (String)(c7 = c5);
        Serializable d;
        Serializable value = d = c7;
        Serializable c9;
        Serializable c8 = c9 = d;
        int h = 0;
        int h2;
        int j = h2 = h;
        boolean h4;
        boolean h3 = h4 = true;
        String c11;
        String c10 = c11 = "";
        long k = 0L;
        long l;
        long i = l = k;
        long k2;
        long m = k2 = l;
        long k3 = -2147483648L;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.n(parcel, int1);
                    continue;
                }
                case '\u001b': {
                    c9 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u001a': {
                    c11 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0019': {
                    c10 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0018': {
                    c8 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0017': {
                    d = SafeParcelReader.d(parcel, int1);
                    continue;
                }
                case '\u0016': {
                    k2 = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\u0015': {
                    final int m2 = SafeParcelReader.m(parcel, int1);
                    if (m2 == 0) {
                        value = null;
                        continue;
                    }
                    SafeParcelReader.p(parcel, m2, 4);
                    value = (parcel.readInt() != 0);
                    continue;
                }
                case '\u0013': {
                    c7 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0012': {
                    h2 = (SafeParcelReader.h(parcel, int1) ? 1 : 0);
                    continue;
                }
                case '\u0010': {
                    h4 = SafeParcelReader.h(parcel, int1);
                    continue;
                }
                case '\u000f': {
                    j = SafeParcelReader.j(parcel, int1);
                    continue;
                }
                case '\u000e': {
                    m = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\r': {
                    l = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\f': {
                    c6 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u000b': {
                    k3 = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\n': {
                    h = (SafeParcelReader.h(parcel, int1) ? 1 : 0);
                    continue;
                }
                case '\t': {
                    h3 = SafeParcelReader.h(parcel, int1);
                    continue;
                }
                case '\b': {
                    c5 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0007': {
                    i = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\u0006': {
                    k = SafeParcelReader.k(parcel, int1);
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
        return new q7((String)c, c2, (String)c3, c4, k, i, (String)c5, h3, (boolean)(h != 0), k3, c6, l, m, j, h4, (boolean)(h2 != 0), (String)c7, (Boolean)value, k2, (ArrayList)d, (String)c8, c10, c11, (String)c9);
    }
}

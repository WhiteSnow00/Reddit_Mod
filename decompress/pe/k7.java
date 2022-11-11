// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import java.io.Serializable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import a92.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class k7 implements Parcelable$Creator
{
    public static void a(final j7 j7, final Parcel parcel) {
        final int y0 = b.y0(parcel, 20293);
        b.p0(parcel, 1, j7.f);
        b.t0(parcel, 2, j7.g);
        b.q0(parcel, 3, j7.h);
        b.r0(parcel, 4, j7.i);
        b.t0(parcel, 6, j7.j);
        b.t0(parcel, 7, j7.k);
        final Double l = j7.l;
        if (l != null) {
            parcel.writeInt(524296);
            parcel.writeDouble((double)l);
        }
        b.D0(parcel, y0);
    }
    
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        Number l;
        Serializable c = l = null;
        Serializable c2;
        Number value = (Number)(c2 = l);
        Serializable value2;
        String c3 = (String)(value2 = c2);
        int j = 0;
        long k = 0L;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.n(parcel, int1);
                    continue;
                }
                case '\b': {
                    final int m = SafeParcelReader.m(parcel, int1);
                    if (m == 0) {
                        value2 = null;
                        continue;
                    }
                    SafeParcelReader.p(parcel, m, 8);
                    value2 = parcel.readDouble();
                    continue;
                }
                case '\u0007': {
                    c3 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0006': {
                    c2 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0005': {
                    final int i = SafeParcelReader.m(parcel, int1);
                    if (i == 0) {
                        value = null;
                        continue;
                    }
                    SafeParcelReader.p(parcel, i, 4);
                    value = parcel.readFloat();
                    continue;
                }
                case '\u0004': {
                    l = SafeParcelReader.l(parcel, int1);
                    continue;
                }
                case '\u0003': {
                    k = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\u0002': {
                    c = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0001': {
                    j = SafeParcelReader.j(parcel, int1);
                    continue;
                }
            }
        }
        SafeParcelReader.g(parcel, o);
        return new j7(j, (String)c, k, (Long)l, (Float)value, (String)c2, c3, (Double)value2);
    }
}

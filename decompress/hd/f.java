// 
// Decompiled by Procyon v0.6.0
// 

package hd;

import java.io.Serializable;
import java.util.ArrayList;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class f implements Parcelable$Creator<a$b>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        boolean h2;
        boolean h = h2 = false;
        Serializable c2;
        Serializable c = c2 = null;
        Serializable d;
        String c3 = (String)(d = c2);
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.n(parcel, int1);
                    continue;
                }
                case '\u0006': {
                    d = SafeParcelReader.d(parcel, int1);
                    continue;
                }
                case '\u0005': {
                    c3 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0004': {
                    h2 = SafeParcelReader.h(parcel, int1);
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
                case '\u0001': {
                    h = SafeParcelReader.h(parcel, int1);
                    continue;
                }
            }
        }
        SafeParcelReader.g(parcel, o);
        return new a$b((String)c, (String)c2, c3, (ArrayList)d, h, h2);
    }
}

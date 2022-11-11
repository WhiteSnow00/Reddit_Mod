// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import java.io.Serializable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class bd implements Parcelable$Creator
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        Serializable l = null;
        Serializable c;
        Long i = (Long)(c = l);
        Serializable c3;
        String c2 = (String)(c3 = c);
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            final char c4 = (char)int1;
            if (c4 != '\u0002') {
                if (c4 != '\u0003') {
                    if (c4 != '\u0004') {
                        if (c4 != '\u0005') {
                            if (c4 != '\u0006') {
                                SafeParcelReader.n(parcel, int1);
                            }
                            else {
                                i = SafeParcelReader.l(parcel, int1);
                            }
                        }
                        else {
                            c3 = SafeParcelReader.c(parcel, int1);
                        }
                    }
                    else {
                        l = SafeParcelReader.l(parcel, int1);
                    }
                }
                else {
                    c2 = SafeParcelReader.c(parcel, int1);
                }
            }
            else {
                c = SafeParcelReader.c(parcel, int1);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new ad((Long)l, i, (String)c, c2, (String)c3);
    }
}

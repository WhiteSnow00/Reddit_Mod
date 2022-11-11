// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import java.util.ArrayList;
import gh.y;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class eb implements Parcelable$Creator
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        String c = null;
        y y;
        Object f = y = null;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            final char c2 = (char)int1;
            if (c2 != '\u0001') {
                if (c2 != '\u0002') {
                    if (c2 != '\u0003') {
                        SafeParcelReader.n(parcel, int1);
                    }
                    else {
                        y = (y)SafeParcelReader.b(parcel, int1, gh.y.CREATOR);
                    }
                }
                else {
                    f = SafeParcelReader.f(parcel, int1, cd.CREATOR);
                }
            }
            else {
                c = SafeParcelReader.c(parcel, int1);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new db(c, (ArrayList)f, y);
    }
}

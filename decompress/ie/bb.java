// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import ih.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class bb implements Parcelable$Creator
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        o o2 = null;
        String c = null;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            final char c2 = (char)int1;
            if (c2 != '\u0001') {
                if (c2 != '\u0002') {
                    SafeParcelReader.n(parcel, int1);
                }
                else {
                    c = SafeParcelReader.c(parcel, int1);
                }
            }
            else {
                o2 = (o)SafeParcelReader.b(parcel, int1, ih.o.CREATOR);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new ab(o2, c);
    }
}

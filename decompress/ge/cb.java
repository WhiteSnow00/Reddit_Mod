// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import com.google.android.gms.common.api.Status;
import gh.y;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class cb implements Parcelable$Creator
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        Status status = null;
        Object o2 = null;
        Object c2;
        Object c = c2 = o2;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            final char c3 = (char)int1;
            if (c3 != '\u0001') {
                if (c3 != '\u0002') {
                    if (c3 != '\u0003') {
                        if (c3 != '\u0004') {
                            SafeParcelReader.n(parcel, int1);
                        }
                        else {
                            c2 = SafeParcelReader.c(parcel, int1);
                        }
                    }
                    else {
                        c = SafeParcelReader.c(parcel, int1);
                    }
                }
                else {
                    o2 = SafeParcelReader.b(parcel, int1, y.CREATOR);
                }
            }
            else {
                status = (Status)SafeParcelReader.b(parcel, int1, Status.CREATOR);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new bb(status, (y)o2, (String)c, (String)c2);
    }
}

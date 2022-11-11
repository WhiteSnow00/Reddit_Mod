// 
// Decompiled by Procyon v0.6.0
// 

package he;

import android.os.IBinder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class v implements Parcelable$Creator<u>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        s s = null;
        int j = 1;
        IBinder k;
        IBinder i = k = null;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            final char c = (char)int1;
            if (c != '\u0001') {
                if (c != '\u0002') {
                    if (c != '\u0003') {
                        if (c != '\u0004') {
                            SafeParcelReader.n(parcel, int1);
                        }
                        else {
                            k = SafeParcelReader.i(parcel, int1);
                        }
                    }
                    else {
                        i = SafeParcelReader.i(parcel, int1);
                    }
                }
                else {
                    s = (s)SafeParcelReader.b(parcel, int1, he.s.CREATOR);
                }
            }
            else {
                j = SafeParcelReader.j(parcel, int1);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new u(j, s, i, k);
    }
}

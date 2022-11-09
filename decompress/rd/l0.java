// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import android.os.IBinder;
import od.b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class l0 implements Parcelable$Creator<k0>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        b b;
        Object i = b = null;
        int j = 0;
        int h2;
        int h = h2 = j;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            final char c = (char)int1;
            if (c != '\u0001') {
                if (c != '\u0002') {
                    if (c != '\u0003') {
                        if (c != '\u0004') {
                            if (c != '\u0005') {
                                SafeParcelReader.n(parcel, int1);
                            }
                            else {
                                h2 = (SafeParcelReader.h(parcel, int1) ? 1 : 0);
                            }
                        }
                        else {
                            h = (SafeParcelReader.h(parcel, int1) ? 1 : 0);
                        }
                    }
                    else {
                        b = (b)SafeParcelReader.b(parcel, int1, (Parcelable$Creator)od.b.CREATOR);
                    }
                }
                else {
                    i = SafeParcelReader.i(parcel, int1);
                }
            }
            else {
                j = SafeParcelReader.j(parcel, int1);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new k0(j, (IBinder)i, b, (boolean)(h != 0), (boolean)(h2 != 0));
    }
}

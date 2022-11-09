// 
// Decompiled by Procyon v0.6.0
// 

package od;

import android.os.IBinder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class b0 implements Parcelable$Creator<a0>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        boolean h = false;
        IBinder i;
        Object c = i = null;
        boolean h2 = false;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            final char c2 = (char)int1;
            if (c2 != '\u0001') {
                if (c2 != '\u0002') {
                    if (c2 != '\u0003') {
                        if (c2 != '\u0004') {
                            SafeParcelReader.n(parcel, int1);
                        }
                        else {
                            h2 = SafeParcelReader.h(parcel, int1);
                        }
                    }
                    else {
                        h = SafeParcelReader.h(parcel, int1);
                    }
                }
                else {
                    i = SafeParcelReader.i(parcel, int1);
                }
            }
            else {
                c = SafeParcelReader.c(parcel, int1);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new a0((String)c, i, h, h2);
    }
}

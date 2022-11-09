// 
// Decompiled by Procyon v0.6.0
// 

package oe;

import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class g implements Parcelable$Creator<f>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        long i;
        long k = i = -1L;
        int l;
        int j = l = 1;
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
                            i = SafeParcelReader.k(parcel, int1);
                        }
                    }
                    else {
                        k = SafeParcelReader.k(parcel, int1);
                    }
                }
                else {
                    l = SafeParcelReader.j(parcel, int1);
                }
            }
            else {
                j = SafeParcelReader.j(parcel, int1);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new f(k, j, l, i);
    }
}

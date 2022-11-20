// 
// Decompiled by Procyon v0.6.0
// 

package ne;

import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class i implements Parcelable$Creator<h>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        boolean h = true;
        long k = 50L;
        float float1 = 0.0f;
        long i = Long.MAX_VALUE;
        int j = Integer.MAX_VALUE;
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
                                j = SafeParcelReader.j(parcel, int1);
                            }
                        }
                        else {
                            i = SafeParcelReader.k(parcel, int1);
                        }
                    }
                    else {
                        SafeParcelReader.q(parcel, int1, 4);
                        float1 = parcel.readFloat();
                    }
                }
                else {
                    k = SafeParcelReader.k(parcel, int1);
                }
            }
            else {
                h = SafeParcelReader.h(parcel, int1);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new h(h, k, float1, i, j);
    }
    
    public final Object[] newArray(final int n) {
        return new h[n];
    }
}

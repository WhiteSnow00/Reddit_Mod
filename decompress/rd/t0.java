// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class t0 implements Parcelable$Creator<p>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        int j = 0;
        int k;
        int i = k = j;
        int h2;
        int h = h2 = k;
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
                                k = SafeParcelReader.j(parcel, int1);
                            }
                        }
                        else {
                            i = SafeParcelReader.j(parcel, int1);
                        }
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
                j = SafeParcelReader.j(parcel, int1);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new p(j, i, k, (boolean)(h != 0), (boolean)(h2 != 0));
    }
}

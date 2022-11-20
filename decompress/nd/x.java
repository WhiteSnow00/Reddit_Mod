// 
// Decompiled by Procyon v0.6.0
// 

package nd;

import android.os.IBinder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class x implements Parcelable$Creator<w>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        String c = null;
        IBinder i = null;
        boolean h = false;
        boolean h3;
        boolean h2 = h3 = false;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            final char c2 = (char)int1;
            if (c2 != '\u0001') {
                if (c2 != '\u0002') {
                    if (c2 != '\u0003') {
                        if (c2 != '\u0004') {
                            if (c2 != '\u0005') {
                                SafeParcelReader.n(parcel, int1);
                            }
                            else {
                                h3 = SafeParcelReader.h(parcel, int1);
                            }
                        }
                        else {
                            i = SafeParcelReader.i(parcel, int1);
                        }
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
                c = SafeParcelReader.c(parcel, int1);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new w(c, h, h2, i, h3);
    }
    
    public final Object[] newArray(final int n) {
        return new w[n];
    }
}

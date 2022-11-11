// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import java.util.ArrayList;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class hd implements Parcelable$Creator
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        ArrayList f = null;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            if ((char)int1 != '\u0002') {
                SafeParcelReader.n(parcel, int1);
            }
            else {
                f = SafeParcelReader.f(parcel, int1, ed.CREATOR);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new gd(f);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package te;

import java.util.ArrayList;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class i implements Parcelable$Creator<h>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        ArrayList d = null;
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
                d = SafeParcelReader.d(parcel, int1);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new h(d, c);
    }
}

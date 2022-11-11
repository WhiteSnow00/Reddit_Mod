// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.util.List;
import me.h;
import pd.c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class t implements Parcelable$Creator<s>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        h j = s.j;
        List list = s.i;
        String c = null;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            final char c2 = (char)int1;
            if (c2 != '\u0001') {
                if (c2 != '\u0002') {
                    if (c2 != '\u0003') {
                        SafeParcelReader.n(parcel, int1);
                    }
                    else {
                        c = SafeParcelReader.c(parcel, int1);
                    }
                }
                else {
                    list = SafeParcelReader.f(parcel, int1, (Parcelable$Creator)pd.c.CREATOR);
                }
            }
            else {
                j = (h)SafeParcelReader.b(parcel, int1, h.CREATOR);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new s(j, list, c);
    }
}

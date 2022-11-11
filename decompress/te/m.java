// 
// Decompiled by Procyon v0.6.0
// 

package te;

import md.b;
import pd.l0;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class m implements Parcelable$Creator<l>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        b b = null;
        int j = 0;
        l0 l0 = null;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            final char c = (char)int1;
            if (c != '\u0001') {
                if (c != '\u0002') {
                    if (c != '\u0003') {
                        SafeParcelReader.n(parcel, int1);
                    }
                    else {
                        l0 = (l0)SafeParcelReader.b(parcel, int1, (Parcelable$Creator)pd.l0.CREATOR);
                    }
                }
                else {
                    b = (b)SafeParcelReader.b(parcel, int1, md.b.CREATOR);
                }
            }
            else {
                j = SafeParcelReader.j(parcel, int1);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new l(j, b, l0);
    }
}

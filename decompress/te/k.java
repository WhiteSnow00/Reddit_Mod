// 
// Decompiled by Procyon v0.6.0
// 

package te;

import pd.j0;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class k implements Parcelable$Creator<j>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        int j = 0;
        j0 j2 = null;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            final char c = (char)int1;
            if (c != '\u0001') {
                if (c != '\u0002') {
                    SafeParcelReader.n(parcel, int1);
                }
                else {
                    j2 = (j0)SafeParcelReader.b(parcel, int1, (Parcelable$Creator)j0.CREATOR);
                }
            }
            else {
                j = SafeParcelReader.j(parcel, int1);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new j(j, j2);
    }
}

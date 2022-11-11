// 
// Decompiled by Procyon v0.6.0
// 

package te;

import android.content.Intent;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class c implements Parcelable$Creator<b>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        int j = 0;
        Intent intent = null;
        int i = 0;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            final char c = (char)int1;
            if (c != '\u0001') {
                if (c != '\u0002') {
                    if (c != '\u0003') {
                        SafeParcelReader.n(parcel, int1);
                    }
                    else {
                        intent = (Intent)SafeParcelReader.b(parcel, int1, Intent.CREATOR);
                    }
                }
                else {
                    i = SafeParcelReader.j(parcel, int1);
                }
            }
            else {
                j = SafeParcelReader.j(parcel, int1);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new b(j, i, intent);
    }
}

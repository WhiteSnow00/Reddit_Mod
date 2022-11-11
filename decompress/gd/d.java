// 
// Decompiled by Procyon v0.6.0
// 

package gd;

import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.IdToken;
import android.os.Parcelable$Creator;

public final class d implements Parcelable$Creator<IdToken>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        String c = null;
        String c2 = null;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            final char c3 = (char)int1;
            if (c3 != '\u0001') {
                if (c3 != '\u0002') {
                    SafeParcelReader.n(parcel, int1);
                }
                else {
                    c2 = SafeParcelReader.c(parcel, int1);
                }
            }
            else {
                c = SafeParcelReader.c(parcel, int1);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new IdToken(c, c2);
    }
}

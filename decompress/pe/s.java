// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.os.Bundle;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class s implements Parcelable$Creator
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        Bundle a = null;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            if ((char)int1 != '\u0002') {
                SafeParcelReader.n(parcel, int1);
            }
            else {
                a = SafeParcelReader.a(parcel, int1);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new r(a);
    }
}

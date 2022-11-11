// 
// Decompiled by Procyon v0.6.0
// 

package ld;

import android.content.Intent;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class d implements Parcelable$Creator<a>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            if ((char)int1 != '\u0001') {
                SafeParcelReader.n(parcel, int1);
            }
            else {
                intent = (Intent)SafeParcelReader.b(parcel, int1, Intent.CREATOR);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new a(intent);
    }
}

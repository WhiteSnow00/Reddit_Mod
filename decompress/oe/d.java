// 
// Decompiled by Procyon v0.6.0
// 

package oe;

import java.util.List;
import android.location.Location;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import com.google.android.gms.location.LocationResult;
import android.os.Parcelable$Creator;

public final class d implements Parcelable$Creator<LocationResult>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        List<Location> list = LocationResult.g;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            if ((char)int1 != '\u0001') {
                SafeParcelReader.n(parcel, int1);
            }
            else {
                list = SafeParcelReader.f(parcel, int1, Location.CREATOR);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new LocationResult(list);
    }
}

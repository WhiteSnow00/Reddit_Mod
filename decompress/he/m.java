// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.util.List;
import com.google.android.gms.location.LocationRequest;
import pd.c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class m implements Parcelable$Creator<l>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        List list = l.m;
        int h = 0;
        int h3;
        int h2 = h3 = h;
        Object o2 = null;
        Object c2;
        Object c = c2 = o2;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            final char c3 = (char)int1;
            if (c3 != '\u0001') {
                switch (c3) {
                    default: {
                        SafeParcelReader.n(parcel, int1);
                        continue;
                    }
                    case 10: {
                        c2 = SafeParcelReader.c(parcel, int1);
                        continue;
                    }
                    case 9: {
                        h3 = (SafeParcelReader.h(parcel, int1) ? 1 : 0);
                        continue;
                    }
                    case 8: {
                        h2 = (SafeParcelReader.h(parcel, int1) ? 1 : 0);
                        continue;
                    }
                    case 7: {
                        h = (SafeParcelReader.h(parcel, int1) ? 1 : 0);
                        continue;
                    }
                    case 6: {
                        c = SafeParcelReader.c(parcel, int1);
                        continue;
                    }
                    case 5: {
                        list = SafeParcelReader.f(parcel, int1, (Parcelable$Creator)pd.c.CREATOR);
                        continue;
                    }
                }
            }
            else {
                o2 = SafeParcelReader.b(parcel, int1, LocationRequest.CREATOR);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new l((LocationRequest)o2, list, (String)c, (boolean)(h != 0), (boolean)(h2 != 0), (boolean)(h3 != 0), (String)c2);
    }
}

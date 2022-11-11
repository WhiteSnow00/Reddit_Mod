// 
// Decompiled by Procyon v0.6.0
// 

package nd;

import android.app.PendingIntent;
import md.b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import android.os.Parcelable$Creator;

public final class g implements Parcelable$Creator<Status>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        int i;
        int j = i = 0;
        Object c = null;
        Object o3;
        Object o2 = o3 = c;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            final char c2 = (char)int1;
            if (c2 != '\u0001') {
                if (c2 != '\u0002') {
                    if (c2 != '\u0003') {
                        if (c2 != '\u0004') {
                            if (c2 != '\u03e8') {
                                SafeParcelReader.n(parcel, int1);
                            }
                            else {
                                j = SafeParcelReader.j(parcel, int1);
                            }
                        }
                        else {
                            o3 = SafeParcelReader.b(parcel, int1, b.CREATOR);
                        }
                    }
                    else {
                        o2 = SafeParcelReader.b(parcel, int1, PendingIntent.CREATOR);
                    }
                }
                else {
                    c = SafeParcelReader.c(parcel, int1);
                }
            }
            else {
                i = SafeParcelReader.j(parcel, int1);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new Status(j, i, (String)c, (PendingIntent)o2, (b)o3);
    }
}

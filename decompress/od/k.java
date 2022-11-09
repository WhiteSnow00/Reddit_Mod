// 
// Decompiled by Procyon v0.6.0
// 

package od;

import android.app.PendingIntent;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class k implements Parcelable$Creator<b>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        PendingIntent pendingIntent = null;
        int i;
        int j = i = 0;
        String c = null;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            final char c2 = (char)int1;
            if (c2 != '\u0001') {
                if (c2 != '\u0002') {
                    if (c2 != '\u0003') {
                        if (c2 != '\u0004') {
                            SafeParcelReader.n(parcel, int1);
                        }
                        else {
                            c = SafeParcelReader.c(parcel, int1);
                        }
                    }
                    else {
                        pendingIntent = (PendingIntent)SafeParcelReader.b(parcel, int1, PendingIntent.CREATOR);
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
        return new b(j, i, pendingIntent, c);
    }
}

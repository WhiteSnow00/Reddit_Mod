// 
// Decompiled by Procyon v0.6.0
// 

package hd;

import android.app.PendingIntent;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class g implements Parcelable$Creator<b>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            if ((char)int1 != '\u0001') {
                SafeParcelReader.n(parcel, int1);
            }
            else {
                pendingIntent = (PendingIntent)SafeParcelReader.b(parcel, int1, PendingIntent.CREATOR);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new b(pendingIntent);
    }
}

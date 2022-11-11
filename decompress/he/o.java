// 
// Decompiled by Procyon v0.6.0
// 

package he;

import android.os.IBinder;
import android.app.PendingIntent;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class o implements Parcelable$Creator<n>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        Object o2 = null;
        Object o3;
        Object i = o3 = o2;
        Object k;
        Object j = k = o3;
        int l = 1;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.n(parcel, int1);
                    continue;
                }
                case '\u0006': {
                    k = SafeParcelReader.i(parcel, int1);
                    continue;
                }
                case '\u0005': {
                    j = SafeParcelReader.i(parcel, int1);
                    continue;
                }
                case '\u0004': {
                    o3 = SafeParcelReader.b(parcel, int1, PendingIntent.CREATOR);
                    continue;
                }
                case '\u0003': {
                    i = SafeParcelReader.i(parcel, int1);
                    continue;
                }
                case '\u0002': {
                    o2 = SafeParcelReader.b(parcel, int1, he.l.CREATOR);
                    continue;
                }
                case '\u0001': {
                    l = SafeParcelReader.j(parcel, int1);
                    continue;
                }
            }
        }
        SafeParcelReader.g(parcel, o);
        return new n(l, (l)o2, (IBinder)i, (PendingIntent)o3, (IBinder)j, (IBinder)k);
    }
}

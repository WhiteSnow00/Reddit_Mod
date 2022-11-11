// 
// Decompiled by Procyon v0.6.0
// 

package hd;

import android.net.Uri;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class i implements Parcelable$Creator<c>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        Object c = null;
        Object c3;
        String c2 = (String)(c3 = c);
        Object o2;
        String c4 = (String)(o2 = c3);
        Object c6;
        Object c5 = c6 = o2;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.n(parcel, int1);
                    continue;
                }
                case '\u0007': {
                    c6 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0006': {
                    c5 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0005': {
                    o2 = SafeParcelReader.b(parcel, int1, Uri.CREATOR);
                    continue;
                }
                case '\u0004': {
                    c4 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0003': {
                    c3 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0002': {
                    c2 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0001': {
                    c = SafeParcelReader.c(parcel, int1);
                    continue;
                }
            }
        }
        SafeParcelReader.g(parcel, o);
        return new c((String)c, c2, (String)c3, c4, (Uri)o2, (String)c5, (String)c6);
    }
}

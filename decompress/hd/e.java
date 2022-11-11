// 
// Decompiled by Procyon v0.6.0
// 

package hd;

import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class e implements Parcelable$Creator<a>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        a$c a$c = null;
        String c = null;
        boolean h = false;
        a$b a$b = (a$b)c;
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
                            h = SafeParcelReader.h(parcel, int1);
                        }
                    }
                    else {
                        c = SafeParcelReader.c(parcel, int1);
                    }
                }
                else {
                    a$b = (a$b)SafeParcelReader.b(parcel, int1, hd.a$b.CREATOR);
                }
            }
            else {
                a$c = (a$c)SafeParcelReader.b(parcel, int1, hd.a$c.CREATOR);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new a(a$c, a$b, c, h);
    }
}

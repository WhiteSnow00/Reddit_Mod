// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcelable;
import a92.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class u implements Parcelable$Creator
{
    public static void a(final t t, final Parcel parcel, final int n) {
        final int y0 = b.y0(parcel, 20293);
        b.t0(parcel, 2, t.f);
        b.s0(parcel, 3, (Parcelable)t.g, n);
        b.t0(parcel, 4, t.h);
        b.q0(parcel, 5, t.i);
        b.D0(parcel, y0);
    }
    
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        String c = null;
        String c2;
        Object o2 = c2 = c;
        long k = 0L;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            final char c3 = (char)int1;
            if (c3 != '\u0002') {
                if (c3 != '\u0003') {
                    if (c3 != '\u0004') {
                        if (c3 != '\u0005') {
                            SafeParcelReader.n(parcel, int1);
                        }
                        else {
                            k = SafeParcelReader.k(parcel, int1);
                        }
                    }
                    else {
                        c2 = SafeParcelReader.c(parcel, int1);
                    }
                }
                else {
                    o2 = SafeParcelReader.b(parcel, int1, (Parcelable$Creator)r.CREATOR);
                }
            }
            else {
                c = SafeParcelReader.c(parcel, int1);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new t(c, (r)o2, c2, k);
    }
}

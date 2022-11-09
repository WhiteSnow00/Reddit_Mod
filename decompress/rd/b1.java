// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import android.os.Bundle;
import od.d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class b1 implements Parcelable$Creator<a1>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        Bundle a = null;
        e e = null;
        int j = 0;
        Object[] array = (Object)e;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            final char c = (char)int1;
            if (c != '\u0001') {
                if (c != '\u0002') {
                    if (c != '\u0003') {
                        if (c != '\u0004') {
                            SafeParcelReader.n(parcel, int1);
                        }
                        else {
                            e = (e)SafeParcelReader.b(parcel, int1, rd.e.CREATOR);
                        }
                    }
                    else {
                        j = SafeParcelReader.j(parcel, int1);
                    }
                }
                else {
                    array = SafeParcelReader.e(parcel, int1, (Parcelable$Creator)d.CREATOR);
                }
            }
            else {
                a = SafeParcelReader.a(parcel, int1);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new a1(a, (d[])array, j, e);
    }
}

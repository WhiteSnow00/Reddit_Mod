// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class c1 implements Parcelable$Creator<e>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        Object o2 = null;
        Object intArray2;
        Object intArray = intArray2 = o2;
        int h = 0;
        int j;
        int h2 = j = h;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.n(parcel, int1);
                    continue;
                }
                case '\u0006': {
                    final int m = SafeParcelReader.m(parcel, int1);
                    final int dataPosition = parcel.dataPosition();
                    if (m == 0) {
                        intArray2 = null;
                        continue;
                    }
                    intArray2 = parcel.createIntArray();
                    parcel.setDataPosition(dataPosition + m);
                    continue;
                }
                case '\u0005': {
                    j = SafeParcelReader.j(parcel, int1);
                    continue;
                }
                case '\u0004': {
                    final int i = SafeParcelReader.m(parcel, int1);
                    final int dataPosition2 = parcel.dataPosition();
                    if (i == 0) {
                        intArray = null;
                        continue;
                    }
                    intArray = parcel.createIntArray();
                    parcel.setDataPosition(dataPosition2 + i);
                    continue;
                }
                case '\u0003': {
                    h2 = (SafeParcelReader.h(parcel, int1) ? 1 : 0);
                    continue;
                }
                case '\u0002': {
                    h = (SafeParcelReader.h(parcel, int1) ? 1 : 0);
                    continue;
                }
                case '\u0001': {
                    o2 = SafeParcelReader.b(parcel, int1, p.CREATOR);
                    continue;
                }
            }
        }
        SafeParcelReader.g(parcel, o);
        return new e((p)o2, (boolean)(h != 0), (boolean)(h2 != 0), (int[])intArray, j, (int[])intArray2);
    }
}

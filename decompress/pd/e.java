// 
// Decompiled by Procyon v0.6.0
// 

package pd;

import android.os.Parcelable;
import a92.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import qd.a;

public final class e extends a
{
    public static final Parcelable$Creator<e> CREATOR;
    public final p f;
    public final boolean g;
    public final boolean h;
    public final int[] i;
    public final int j;
    public final int[] k;
    
    static {
        CREATOR = (Parcelable$Creator)new d1();
    }
    
    public e(final p f, final boolean g, final boolean h, final int[] i, final int j, final int[] k) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public final void writeToParcel(final Parcel parcel, int n) {
        final int y0 = b.y0(parcel, 20293);
        b.s0(parcel, 1, (Parcelable)this.f, n);
        b.m0(parcel, 2, this.g);
        b.m0(parcel, 3, this.h);
        final int[] i = this.i;
        if (i != null) {
            n = b.y0(parcel, 4);
            parcel.writeIntArray(i);
            b.D0(parcel, n);
        }
        b.p0(parcel, 5, this.j);
        final int[] k = this.k;
        if (k != null) {
            n = b.y0(parcel, 6);
            parcel.writeIntArray(k);
            b.D0(parcel, n);
        }
        b.D0(parcel, y0);
    }
}

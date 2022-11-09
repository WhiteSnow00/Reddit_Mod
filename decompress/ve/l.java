// 
// Decompiled by Procyon v0.6.0
// 

package ve;

import android.os.Parcelable;
import dg.d;
import android.os.Parcel;
import rd.k0;
import od.b;
import android.os.Parcelable$Creator;
import sd.a;

public final class l extends a
{
    public static final Parcelable$Creator<l> CREATOR;
    public final int f;
    public final od.b g;
    public final k0 h;
    
    static {
        CREATOR = (Parcelable$Creator)new m();
    }
    
    public l(final int f, final od.b g, final k0 h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i2 = d.i2(parcel, 20293);
        d.T1(parcel, 1, this.f);
        d.Z1(parcel, 2, (Parcelable)this.g, n);
        d.Z1(parcel, 3, (Parcelable)this.h, n);
        d.w2(parcel, i2);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package od;

import dg.d;
import android.os.Parcel;
import p2.e;
import android.os.Parcelable$Creator;
import sd.a;

public final class y extends a
{
    public static final Parcelable$Creator<y> CREATOR;
    public final boolean f;
    public final String g;
    public final int h;
    
    static {
        CREATOR = (Parcelable$Creator)new z();
    }
    
    public y(final boolean f, final String g, final int n) {
        this.f = f;
        this.g = g;
        this.h = e.r(n) - 1;
    }
    
    public final void writeToParcel(final Parcel parcel, int i2) {
        i2 = d.i2(parcel, 20293);
        d.N1(parcel, 1, this.f);
        d.b2(parcel, 2, this.g);
        d.T1(parcel, 3, this.h);
        d.w2(parcel, i2);
    }
}

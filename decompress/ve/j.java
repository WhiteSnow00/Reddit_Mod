// 
// Decompiled by Procyon v0.6.0
// 

package ve;

import android.os.Parcelable;
import dg.d;
import android.os.Parcel;
import rd.i0;
import android.os.Parcelable$Creator;
import sd.a;

public final class j extends a
{
    public static final Parcelable$Creator<j> CREATOR;
    public final int f;
    public final i0 g;
    
    static {
        CREATOR = (Parcelable$Creator)new k();
    }
    
    public j(final int f, final i0 g) {
        this.f = f;
        this.g = g;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i2 = d.i2(parcel, 20293);
        d.T1(parcel, 1, this.f);
        d.Z1(parcel, 2, (Parcelable)this.g, n);
        d.w2(parcel, i2);
    }
}

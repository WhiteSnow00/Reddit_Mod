// 
// Decompiled by Procyon v0.6.0
// 

package he;

import android.os.Parcelable;
import android.os.Parcel;
import hh.d;
import android.os.Parcelable$Creator;
import rd.a;

public final class xa extends a
{
    public static final Parcelable$Creator<xa> CREATOR;
    public final d f;
    
    static {
        CREATOR = (Parcelable$Creator)new ya();
    }
    
    public xa(final d f) {
        this.f = f;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int b0 = i10.a.B0(parcel, 20293);
        i10.a.v0(parcel, 1, (Parcelable)this.f, n);
        i10.a.G0(parcel, b0);
    }
}

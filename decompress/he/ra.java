// 
// Decompiled by Procyon v0.6.0
// 

package he;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import rd.a;

public final class ra extends a
{
    public static final Parcelable$Creator<ra> CREATOR;
    public final od f;
    
    static {
        CREATOR = (Parcelable$Creator)new sa();
    }
    
    public ra(final od f) {
        this.f = f;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int b0 = i10.a.B0(parcel, 20293);
        i10.a.v0(parcel, 1, (Parcelable)this.f, n);
        i10.a.G0(parcel, b0);
    }
}

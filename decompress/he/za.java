// 
// Decompiled by Procyon v0.6.0
// 

package he;

import android.os.Parcelable;
import android.os.Parcel;
import hh.o;
import android.os.Parcelable$Creator;
import rd.a;

public final class za extends a
{
    public static final Parcelable$Creator<za> CREATOR;
    public final o f;
    public final String g;
    
    static {
        CREATOR = (Parcelable$Creator)new ab();
    }
    
    public za(final o f, final String g) {
        this.f = f;
        this.g = g;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int b0 = i10.a.B0(parcel, 20293);
        i10.a.v0(parcel, 1, (Parcelable)this.f, n);
        i10.a.w0(parcel, 2, this.g);
        i10.a.G0(parcel, b0);
    }
}

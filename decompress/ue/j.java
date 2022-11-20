// 
// Decompiled by Procyon v0.6.0
// 

package ue;

import android.os.Parcelable;
import android.os.Parcel;
import qd.i0;
import android.os.Parcelable$Creator;
import rd.a;

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
        final int b0 = i10.a.B0(parcel, 20293);
        i10.a.s0(parcel, 1, this.f);
        i10.a.v0(parcel, 2, (Parcelable)this.g, n);
        i10.a.G0(parcel, b0);
    }
}

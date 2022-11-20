// 
// Decompiled by Procyon v0.6.0
// 

package ue;

import android.os.Parcelable;
import android.os.Parcel;
import qd.k0;
import nd.b;
import android.os.Parcelable$Creator;
import rd.a;

public final class l extends a
{
    public static final Parcelable$Creator<l> CREATOR;
    public final int f;
    public final nd.b g;
    public final k0 h;
    
    static {
        CREATOR = (Parcelable$Creator)new m();
    }
    
    public l(final int f, final nd.b g, final k0 h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int b0 = i10.a.B0(parcel, 20293);
        i10.a.s0(parcel, 1, this.f);
        i10.a.v0(parcel, 2, (Parcelable)this.g, n);
        i10.a.v0(parcel, 3, (Parcelable)this.h, n);
        i10.a.G0(parcel, b0);
    }
}

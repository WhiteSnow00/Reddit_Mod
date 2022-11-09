// 
// Decompiled by Procyon v0.6.0
// 

package ld;

import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;

public final class a extends sd.a
{
    public static final Parcelable$Creator<a> CREATOR;
    public final int f;
    public int g;
    public Bundle h;
    
    static {
        CREATOR = (Parcelable$Creator)new d();
    }
    
    public a(final int f, final int g, final Bundle h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final void writeToParcel(final Parcel parcel, int i2) {
        i2 = dg.d.i2(parcel, 20293);
        dg.d.T1(parcel, 1, this.f);
        dg.d.T1(parcel, 2, this.g);
        dg.d.P1(parcel, 3, this.h);
        dg.d.w2(parcel, i2);
    }
}

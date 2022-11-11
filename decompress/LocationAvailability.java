// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.location;

import android.os.Parcelable;
import dg.d;
import android.os.Parcel;
import java.util.Arrays;
import oe.b;
import oe.f;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import sd.a;

public final class LocationAvailability extends a implements ReflectedParcelable
{
    public static final Parcelable$Creator<LocationAvailability> CREATOR;
    @Deprecated
    public int f;
    @Deprecated
    public int g;
    public long h;
    public int i;
    public f[] j;
    
    static {
        CREATOR = (Parcelable$Creator)new oe.b();
    }
    
    public LocationAvailability(final int i, final int f, final int g, final long h, final f[] j) {
        this.i = i;
        this.f = f;
        this.g = g;
        this.h = h;
        this.j = j;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (LocationAvailability.class == o.getClass()) {
                final LocationAvailability locationAvailability = (LocationAvailability)o;
                if (this.f == locationAvailability.f && this.g == locationAvailability.g && this.h == locationAvailability.h && this.i == locationAvailability.i && Arrays.equals(this.j, locationAvailability.j)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.i, this.f, this.g, this.h, this.j });
    }
    
    public final String toString() {
        final boolean b = this.i < 1000;
        final StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(b);
        sb.append("]");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i2 = d.i2(parcel, 20293);
        d.T1(parcel, 1, this.f);
        d.T1(parcel, 2, this.g);
        d.U1(parcel, 3, this.h);
        d.T1(parcel, 4, this.i);
        d.g2(parcel, 5, (Parcelable[])this.j, n);
        d.w2(parcel, i2);
    }
}

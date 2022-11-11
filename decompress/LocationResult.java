// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.location;

import android.os.Parcel;
import java.util.Iterator;
import oe.d;
import java.util.Collections;
import android.location.Location;
import java.util.List;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import sd.a;

public final class LocationResult extends a implements ReflectedParcelable
{
    public static final Parcelable$Creator<LocationResult> CREATOR;
    public static final List<Location> g;
    public final List<Location> f;
    
    static {
        g = Collections.emptyList();
        CREATOR = (Parcelable$Creator)new d();
    }
    
    public LocationResult(final List<Location> f) {
        this.f = f;
    }
    
    public final boolean equals(final Object o) {
        if (!(o instanceof LocationResult)) {
            return false;
        }
        final LocationResult locationResult = (LocationResult)o;
        if (locationResult.f.size() != this.f.size()) {
            return false;
        }
        final Iterator<Location> iterator = locationResult.f.iterator();
        final Iterator<Location> iterator2 = this.f.iterator();
        while (iterator.hasNext()) {
            if (iterator2.next().getTime() != iterator.next().getTime()) {
                return false;
            }
        }
        return true;
    }
    
    public final int hashCode() {
        final Iterator<Location> iterator = this.f.iterator();
        int n = 17;
        while (iterator.hasNext()) {
            final long time = iterator.next().getTime();
            n = n * 31 + (int)(time ^ time >>> 32);
        }
        return n;
    }
    
    public final String toString() {
        final String value = String.valueOf(this.f);
        return ag0.a.l(value.length() + 27, "LocationResult[locations: ", value, "]");
    }
    
    public final void writeToParcel(final Parcel parcel, int i2) {
        i2 = dg.d.i2(parcel, 20293);
        dg.d.h2(parcel, 1, (List)this.f);
        dg.d.w2(parcel, i2);
    }
}

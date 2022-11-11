// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.location;

import dg.d;
import android.os.Parcel;
import android.os.SystemClock;
import java.util.Arrays;
import oe.c;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import sd.a;

public final class LocationRequest extends a implements ReflectedParcelable
{
    public static final Parcelable$Creator<LocationRequest> CREATOR;
    public int f;
    public long g;
    public long h;
    public boolean i;
    public long j;
    public int k;
    public float l;
    public long m;
    
    static {
        CREATOR = (Parcelable$Creator)new c();
    }
    
    public LocationRequest() {
        this.f = 102;
        this.g = 3600000L;
        this.h = 600000L;
        this.i = false;
        this.j = Long.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.l = 0.0f;
        this.m = 0L;
    }
    
    public LocationRequest(final int f, final long g, final long h, final boolean i, final long j, final int k, final float l, final long m) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LocationRequest)) {
            return false;
        }
        final LocationRequest locationRequest = (LocationRequest)o;
        if (this.f == locationRequest.f) {
            final long g = this.g;
            long g2 = locationRequest.g;
            if (g == g2 && this.h == locationRequest.h && this.i == locationRequest.i && this.j == locationRequest.j && this.k == locationRequest.k && this.l == locationRequest.l) {
                long m = this.m;
                if (m < g) {
                    m = g;
                }
                final long i = locationRequest.m;
                if (i >= g2) {
                    g2 = i;
                }
                if (m == g2) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.f, this.g, this.l, this.m });
    }
    
    public final String toString() {
        final StringBuilder k = a.k("Request[");
        final int f = this.f;
        String s;
        if (f != 100) {
            if (f != 102) {
                if (f != 104) {
                    if (f != 105) {
                        s = "???";
                    }
                    else {
                        s = "PRIORITY_NO_POWER";
                    }
                }
                else {
                    s = "PRIORITY_LOW_POWER";
                }
            }
            else {
                s = "PRIORITY_BALANCED_POWER_ACCURACY";
            }
        }
        else {
            s = "PRIORITY_HIGH_ACCURACY";
        }
        k.append(s);
        if (this.f != 105) {
            k.append(" requested=");
            k.append(this.g);
            k.append("ms");
        }
        k.append(" fastest=");
        k.append(this.h);
        k.append("ms");
        if (this.m > this.g) {
            k.append(" maxWait=");
            k.append(this.m);
            k.append("ms");
        }
        if (this.l > 0.0f) {
            k.append(" smallestDisplacement=");
            k.append(this.l);
            k.append("m");
        }
        final long j = this.j;
        if (j != Long.MAX_VALUE) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            k.append(" expireIn=");
            k.append(j - elapsedRealtime);
            k.append("ms");
        }
        if (this.k != Integer.MAX_VALUE) {
            k.append(" num=");
            k.append(this.k);
        }
        k.append(']');
        return k.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int i2) {
        i2 = d.i2(parcel, 20293);
        d.T1(parcel, 1, this.f);
        d.U1(parcel, 2, this.g);
        d.U1(parcel, 3, this.h);
        d.N1(parcel, 4, this.i);
        d.U1(parcel, 5, this.j);
        d.T1(parcel, 6, this.k);
        final float l = this.l;
        parcel.writeInt(262151);
        parcel.writeFloat(l);
        d.U1(parcel, 8, this.m);
        d.w2(parcel, i2);
    }
}

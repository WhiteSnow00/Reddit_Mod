// 
// Decompiled by Procyon v0.6.0
// 

package oe;

import dg.d;
import android.os.Parcel;
import android.os.SystemClock;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import sd.a;

public final class h extends a
{
    public static final Parcelable$Creator<h> CREATOR;
    public boolean f;
    public long g;
    public float h;
    public long i;
    public int j;
    
    static {
        CREATOR = (Parcelable$Creator)new i();
    }
    
    public h() {
        this(true, 50L, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }
    
    public h(final boolean f, final long g, final float h, final long i, final int j) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof h)) {
            return false;
        }
        final h h = (h)o;
        return this.f == h.f && this.g == h.g && Float.compare(this.h, h.h) == 0 && this.i == h.i && this.j == h.j;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.f, this.g, this.h, this.i, this.j });
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("DeviceOrientationRequest[mShouldUseMag=");
        k.append(this.f);
        k.append(" mMinimumSamplingPeriodMs=");
        k.append(this.g);
        k.append(" mSmallestAngleChangeRadians=");
        k.append(this.h);
        final long i = this.i;
        if (i != Long.MAX_VALUE) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            k.append(" expireIn=");
            k.append(i - elapsedRealtime);
            k.append("ms");
        }
        if (this.j != Integer.MAX_VALUE) {
            k.append(" num=");
            k.append(this.j);
        }
        k.append(']');
        return k.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int i2) {
        i2 = d.i2(parcel, 20293);
        d.N1(parcel, 1, this.f);
        d.U1(parcel, 2, this.g);
        final float h = this.h;
        parcel.writeInt(262147);
        parcel.writeFloat(h);
        d.U1(parcel, 4, this.i);
        d.T1(parcel, 5, this.j);
        d.w2(parcel, i2);
    }
}

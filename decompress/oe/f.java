// 
// Decompiled by Procyon v0.6.0
// 

package oe;

import dg.d;
import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import sd.a;

public final class f extends a
{
    public static final Parcelable$Creator<f> CREATOR;
    public final int f;
    public final int g;
    public final long h;
    public final long i;
    
    static {
        CREATOR = (Parcelable$Creator)new g();
    }
    
    public f(final long h, final int f, final int g, final long i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (f.class == o.getClass()) {
                final f f = (f)o;
                if (this.f == f.f && this.g == f.g && this.h == f.h && this.i == f.i) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.g, this.f, this.i, this.h });
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("NetworkLocationStatus:");
        sb.append(" Wifi status: ");
        sb.append(this.f);
        sb.append(" Cell status: ");
        sb.append(this.g);
        sb.append(" elapsed time NS: ");
        sb.append(this.i);
        sb.append(" system time ms: ");
        sb.append(this.h);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int i2) {
        i2 = d.i2(parcel, 20293);
        d.T1(parcel, 1, this.f);
        d.T1(parcel, 2, this.g);
        d.U1(parcel, 3, this.h);
        d.U1(parcel, 4, this.i);
        d.w2(parcel, i2);
    }
}

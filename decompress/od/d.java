// 
// Decompiled by Procyon v0.6.0
// 

package od;

import android.os.Parcel;
import rd.m;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import sd.a;

public final class d extends a
{
    public static final Parcelable$Creator<d> CREATOR;
    public final String f;
    @Deprecated
    public final int g;
    public final long h;
    
    static {
        CREATOR = (Parcelable$Creator)new l();
    }
    
    public d(final String f, final int g, final long h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public d(final String f, final long h) {
        this.f = f;
        this.h = h;
        this.g = -1;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof d) {
            final d d = (d)o;
            final String f = this.f;
            if (((f != null && f.equals(d.f)) || (this.f == null && d.f == null)) && this.f() == d.f()) {
                return true;
            }
        }
        return false;
    }
    
    public final long f() {
        long h;
        if ((h = this.h) == -1L) {
            h = this.g;
        }
        return h;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.f, this.f() });
    }
    
    @Override
    public final String toString() {
        final m.a a = new m.a(this);
        a.a(this.f, "name");
        a.a(this.f(), "version");
        return a.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int i2) {
        i2 = dg.d.i2(parcel, 20293);
        dg.d.b2(parcel, 1, this.f);
        dg.d.T1(parcel, 2, this.g);
        dg.d.U1(parcel, 3, this.f());
        dg.d.w2(parcel, i2);
    }
}

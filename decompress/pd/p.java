// 
// Decompiled by Procyon v0.6.0
// 

package pd;

import a92.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import qd.a;

public final class p extends a
{
    public static final Parcelable$Creator<p> CREATOR;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    
    static {
        CREATOR = (Parcelable$Creator)new u0();
    }
    
    public p(final int f, final int i, final int j, final boolean g, final boolean h) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final void writeToParcel(final Parcel parcel, int y0) {
        y0 = b.y0(parcel, 20293);
        b.p0(parcel, 1, this.f);
        b.m0(parcel, 2, this.g);
        b.m0(parcel, 3, this.h);
        b.p0(parcel, 4, this.i);
        b.p0(parcel, 5, this.j);
        b.D0(parcel, y0);
    }
}

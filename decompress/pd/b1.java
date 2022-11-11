// 
// Decompiled by Procyon v0.6.0
// 

package pd;

import android.os.Parcelable;
import a92.b;
import android.os.Parcel;
import md.d;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import qd.a;

public final class b1 extends a
{
    public static final Parcelable$Creator<b1> CREATOR;
    public Bundle f;
    public d[] g;
    public int h;
    public e i;
    
    static {
        CREATOR = (Parcelable$Creator)new c1();
    }
    
    public b1() {
    }
    
    public b1(final Bundle f, final d[] g, final int h, final e i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int y0 = b.y0(parcel, 20293);
        b.n0(parcel, 1, this.f);
        b.v0(parcel, 2, (Parcelable[])this.g, n);
        b.p0(parcel, 3, this.h);
        b.s0(parcel, 4, (Parcelable)this.i, n);
        b.D0(parcel, y0);
    }
}

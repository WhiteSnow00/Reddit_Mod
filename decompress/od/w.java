// 
// Decompiled by Procyon v0.6.0
// 

package od;

import dg.d;
import android.os.Parcel;
import zd.b;
import android.os.IBinder;
import android.content.Context;
import android.os.Parcelable$Creator;
import sd.a;

public final class w extends a
{
    public static final Parcelable$Creator<w> CREATOR;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final Context i;
    public final boolean j;
    
    static {
        CREATOR = (Parcelable$Creator)new x();
    }
    
    public w(final String f, final boolean g, final boolean h, final IBinder binder, final boolean j) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = zd.b.J(zd.a.a.m(binder));
        this.j = j;
    }
    
    public final void writeToParcel(final Parcel parcel, int i2) {
        i2 = d.i2(parcel, 20293);
        d.b2(parcel, 1, this.f);
        d.N1(parcel, 2, this.g);
        d.N1(parcel, 3, this.h);
        d.Q1(parcel, 4, (IBinder)new zd.b(this.i));
        d.N1(parcel, 5, this.j);
        d.w2(parcel, i2);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package pd;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.IInterface;
import md.b;
import android.os.IBinder;
import android.os.Parcelable$Creator;
import qd.a;

public final class l0 extends a
{
    public static final Parcelable$Creator<l0> CREATOR;
    public final int f;
    public final IBinder g;
    public final b h;
    public final boolean i;
    public final boolean j;
    
    static {
        CREATOR = (Parcelable$Creator)new m0();
    }
    
    public l0(final int f, final IBinder g, final b h, final boolean i, final boolean j) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        if (!(o instanceof l0)) {
            return false;
        }
        final l0 l0 = (l0)o;
        if (this.h.equals((Object)l0.h)) {
            final IBinder g = this.g;
            Object o2 = null;
            Object o3;
            if (g == null) {
                o3 = null;
            }
            else {
                final int a = j$a.a;
                final IInterface queryLocalInterface = g.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof j) {
                    o3 = queryLocalInterface;
                }
                else {
                    o3 = new l1(g);
                }
            }
            final IBinder g2 = l0.g;
            if (g2 != null) {
                final int a2 = j$a.a;
                final IInterface queryLocalInterface2 = g2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface2 instanceof j) {
                    o2 = queryLocalInterface2;
                }
                else {
                    o2 = new l1(g2);
                }
            }
            if (m.a(o3, o2)) {
                return true;
            }
        }
        return false;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int y0 = a92.b.y0(parcel, 20293);
        a92.b.p0(parcel, 1, this.f);
        a92.b.o0(parcel, 2, this.g);
        a92.b.s0(parcel, 3, (Parcelable)this.h, n);
        a92.b.m0(parcel, 4, this.i);
        a92.b.m0(parcel, 5, this.j);
        a92.b.D0(parcel, y0);
    }
}

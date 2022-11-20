// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.IInterface;
import ne.r;
import ne.q;
import android.os.IBinder;
import ne.m;
import android.app.PendingIntent;
import ne.p;
import android.os.Parcelable$Creator;
import rd.a;

public final class n extends a
{
    public static final Parcelable$Creator<n> CREATOR;
    public int f;
    public l g;
    public p h;
    public PendingIntent i;
    public m j;
    public ie.b k;
    
    static {
        CREATOR = (Parcelable$Creator)new o();
    }
    
    public n(int f, final l g, final IBinder binder, final PendingIntent i, final IBinder binder2, final IBinder binder3) {
        this.f = f;
        this.g = g;
        final ie.b b = null;
        Object h;
        if (binder == null) {
            h = null;
        }
        else {
            f = q.a;
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            if (queryLocalInterface instanceof p) {
                h = queryLocalInterface;
            }
            else {
                h = new r(binder);
            }
        }
        this.h = (p)h;
        this.i = i;
        Object j;
        if (binder2 == null) {
            j = null;
        }
        else {
            f = ne.n.a;
            final IInterface queryLocalInterface2 = binder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            if (queryLocalInterface2 instanceof m) {
                j = queryLocalInterface2;
            }
            else {
                j = new ne.o(binder2);
            }
        }
        this.j = (m)j;
        Object k;
        if (binder3 == null) {
            k = b;
        }
        else {
            final IInterface queryLocalInterface3 = binder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface3 instanceof ie.b) {
                k = queryLocalInterface3;
            }
            else {
                k = new c(binder3);
            }
        }
        this.k = (ie.b)k;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int b0 = i10.a.B0(parcel, 20293);
        i10.a.s0(parcel, 1, this.f);
        i10.a.v0(parcel, 2, (Parcelable)this.g, n);
        final p h = this.h;
        final IBinder binder = null;
        IBinder binder2;
        if (h == null) {
            binder2 = null;
        }
        else {
            binder2 = ((IInterface)h).asBinder();
        }
        i10.a.r0(parcel, 3, binder2);
        i10.a.v0(parcel, 4, (Parcelable)this.i, n);
        final m j = this.j;
        IBinder binder3;
        if (j == null) {
            binder3 = null;
        }
        else {
            binder3 = ((IInterface)j).asBinder();
        }
        i10.a.r0(parcel, 5, binder3);
        final ie.b k = this.k;
        IBinder binder4;
        if (k == null) {
            binder4 = binder;
        }
        else {
            binder4 = ((IInterface)k).asBinder();
        }
        i10.a.r0(parcel, 6, binder4);
        i10.a.G0(parcel, b0);
    }
}

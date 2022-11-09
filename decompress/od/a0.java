// 
// Decompiled by Procyon v0.6.0
// 

package od;

import dg.d;
import android.os.Parcel;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import zd.b;
import rd.l1;
import rd.n1;
import rd.m1;
import android.os.IBinder;
import android.os.Parcelable$Creator;
import sd.a;

public final class a0 extends a
{
    public static final Parcelable$Creator<a0> CREATOR;
    public final String f;
    public final r g;
    public final boolean h;
    public final boolean i;
    
    static {
        CREATOR = (Parcelable$Creator)new b0();
    }
    
    public a0(final String f, final IBinder binder, final boolean h, final boolean i) {
        this.f = f;
        final r r = null;
        r g;
        if (binder == null) {
            g = r;
        }
        else {
            try {
                final int a = m1.a;
                final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                n1 n1;
                if (queryLocalInterface instanceof n1) {
                    n1 = (n1)queryLocalInterface;
                }
                else {
                    n1 = new l1(binder);
                }
                final zd.a u = n1.u();
                byte[] array;
                if (u == null) {
                    array = null;
                }
                else {
                    array = zd.b.J(u);
                }
                if (array != null) {
                    g = new s(array);
                }
                else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                    g = r;
                }
            }
            catch (final RemoteException ex) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", (Throwable)ex);
                g = r;
            }
        }
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public a0(final String f, final r g, final boolean h, final boolean i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final void writeToParcel(final Parcel parcel, int i2) {
        i2 = d.i2(parcel, 20293);
        d.b2(parcel, 1, this.f);
        Object g;
        if ((g = this.g) == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            g = null;
        }
        d.Q1(parcel, 2, (IBinder)g);
        d.N1(parcel, 3, this.h);
        d.N1(parcel, 4, this.i);
        d.w2(parcel, i2);
    }
}

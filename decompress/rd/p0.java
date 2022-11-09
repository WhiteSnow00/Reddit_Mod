// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import android.os.IInterface;
import zd.b;
import od.a0;
import android.os.RemoteException;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import he.c;
import od.y;
import od.w;
import android.os.IBinder;
import he.a;

public final class p0 extends a implements r0
{
    public p0(final IBinder binder) {
        super(binder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }
    
    public final y O(final w w) throws RemoteException {
        final Parcel m = this.m();
        final int a = c.a;
        m.writeInt(1);
        w.writeToParcel(m, 0);
        final Parcel k = this.k(m, 6);
        final y y = (y)c.a(k, (Parcelable$Creator)od.y.CREATOR);
        k.recycle();
        return y;
    }
    
    public final boolean d() throws RemoteException {
        final Parcel k = this.k(this.m(), 7);
        final int a = c.a;
        final boolean b = k.readInt() != 0;
        k.recycle();
        return b;
    }
    
    public final boolean r1(final a0 a0, final b b) throws RemoteException {
        final Parcel m = this.m();
        final int a2 = c.a;
        boolean b2 = true;
        m.writeInt(1);
        a0.writeToParcel(m, 0);
        c.b(m, (IInterface)b);
        final Parcel k = this.k(m, 5);
        if (k.readInt() == 0) {
            b2 = false;
        }
        k.recycle();
        return b2;
    }
}

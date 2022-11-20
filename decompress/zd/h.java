// 
// Decompiled by Procyon v0.6.0
// 

package zd;

import android.os.RemoteException;
import android.os.Parcel;
import yd.a$a;
import android.os.IInterface;
import ge.c;
import yd.b;
import android.os.IBinder;
import ge.a;

public final class h extends a
{
    public h(final IBinder binder) {
        super(binder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }
    
    public final yd.a A0(final b b, final String s, final int n, final b b2) throws RemoteException {
        final Parcel m = this.m();
        c.b(m, (IInterface)b);
        m.writeString(s);
        m.writeInt(n);
        c.b(m, (IInterface)b2);
        final Parcel k = this.k(m, 3);
        final yd.a i = a$a.m(k.readStrongBinder());
        k.recycle();
        return i;
    }
    
    public final yd.a N(final b b, final String s, final int n, final b b2) throws RemoteException {
        final Parcel m = this.m();
        c.b(m, (IInterface)b);
        m.writeString(s);
        m.writeInt(n);
        c.b(m, (IInterface)b2);
        final Parcel k = this.k(m, 2);
        final yd.a i = a$a.m(k.readStrongBinder());
        k.recycle();
        return i;
    }
}

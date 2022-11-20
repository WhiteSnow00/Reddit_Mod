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

public final class g extends a
{
    public g(final IBinder binder) {
        super(binder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }
    
    public final yd.a A0(final b b, final String s, final int n, final b b2) throws RemoteException {
        final Parcel m = this.m();
        c.b(m, (IInterface)b);
        m.writeString(s);
        m.writeInt(n);
        c.b(m, (IInterface)b2);
        final Parcel k = this.k(m, 8);
        final yd.a i = a$a.m(k.readStrongBinder());
        k.recycle();
        return i;
    }
    
    public final yd.a A1(final b b, final String s, final boolean b2, final long n) throws RemoteException {
        final Parcel m = this.m();
        c.b(m, (IInterface)b);
        m.writeString(s);
        m.writeInt((int)(b2 ? 1 : 0));
        m.writeLong(n);
        final Parcel k = this.k(m, 7);
        final yd.a i = a$a.m(k.readStrongBinder());
        k.recycle();
        return i;
    }
    
    public final yd.a N(final b b, final String s, final int n) throws RemoteException {
        final Parcel m = this.m();
        c.b(m, (IInterface)b);
        m.writeString(s);
        m.writeInt(n);
        final Parcel k = this.k(m, 2);
        final yd.a i = a$a.m(k.readStrongBinder());
        k.recycle();
        return i;
    }
    
    public final yd.a z1(final b b, final String s, final int n) throws RemoteException {
        final Parcel m = this.m();
        c.b(m, (IInterface)b);
        m.writeString(s);
        m.writeInt(n);
        final Parcel k = this.k(m, 4);
        final yd.a i = a$a.m(k.readStrongBinder());
        k.recycle();
        return i;
    }
}

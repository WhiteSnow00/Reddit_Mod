// 
// Decompiled by Procyon v0.6.0
// 

package qd;

import yd.a$a;
import android.os.RemoteException;
import android.os.Parcel;
import android.os.IBinder;
import ge.a;

public final class l1 extends a implements n1
{
    public l1(final IBinder binder) {
        super(binder, "com.google.android.gms.common.internal.ICertData");
    }
    
    public final int s() throws RemoteException {
        final Parcel k = this.k(this.m(), 2);
        final int int1 = k.readInt();
        k.recycle();
        return int1;
    }
    
    public final yd.a u() throws RemoteException {
        final Parcel k = this.k(this.m(), 1);
        final yd.a m = a$a.m(k.readStrongBinder());
        k.recycle();
        return m;
    }
}

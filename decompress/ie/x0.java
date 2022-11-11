// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import android.os.Parcelable;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.Parcel;
import android.os.IBinder;

public final class x0 extends g0 implements z0
{
    public x0(final IBinder binder) {
        super(binder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }
    
    public final int a() throws RemoteException {
        final Parcel o = this.o(this.l(), 2);
        final int int1 = o.readInt();
        o.recycle();
        return int1;
    }
    
    public final void e0(final long n, final Bundle bundle, final String s, final String s2) throws RemoteException {
        final Parcel l = this.l();
        l.writeString(s);
        l.writeString(s2);
        i0.c(l, (Parcelable)bundle);
        l.writeLong(n);
        this.N(l, 1);
    }
}

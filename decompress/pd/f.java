// 
// Decompiled by Procyon v0.6.0
// 

package pd;

import android.os.RemoteException;
import dg.l0;
import ee.c;
import com.google.android.gms.common.api.Status;
import android.os.Parcel;
import ee.b;

public abstract class f extends b
{
    public f() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }
    
    public final boolean z1(final int n, final Parcel parcel, final Parcel parcel2) throws RemoteException {
        if (n == 1) {
            l0.W0((Status)c.a(parcel, Status.CREATOR), (id.b)null, ((ce.f)this).a);
            return true;
        }
        return false;
    }
}

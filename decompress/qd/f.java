// 
// Decompiled by Procyon v0.6.0
// 

package qd;

import android.os.RemoteException;
import xl0.d;
import fe.c;
import com.google.android.gms.common.api.Status;
import android.os.Parcel;
import fe.b;

public abstract class f extends b
{
    public f() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }
    
    public final boolean x1(final int n, final Parcel parcel, final Parcel parcel2) throws RemoteException {
        if (n == 1) {
            d.l((Status)c.a(parcel, Status.CREATOR), (id.b)null, ((de.f)this).a);
            return true;
        }
        return false;
    }
}

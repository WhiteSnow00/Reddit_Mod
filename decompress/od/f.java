// 
// Decompiled by Procyon v0.6.0
// 

package od;

import android.os.RemoteException;
import lq0.k;
import android.os.Parcelable$Creator;
import de.c;
import com.google.android.gms.common.api.Status;
import android.os.Parcel;
import de.b;

public abstract class f extends b
{
    public f() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }
    
    @Override
    public final boolean z1(final int n, final Parcel parcel, final Parcel parcel2) throws RemoteException {
        if (n == 1) {
            k.r0((Status)c.a(parcel, (android.os.Parcelable$Creator<Status>)Status.CREATOR), (hd.b)null, ((be.f)this).a);
            return true;
        }
        return false;
    }
}

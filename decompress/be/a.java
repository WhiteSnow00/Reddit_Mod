// 
// Decompiled by Procyon v0.6.0
// 

package be;

import android.os.RemoteException;
import hd.b;
import com.google.android.gms.common.api.Status;
import android.os.Parcel;

public abstract class a extends k
{
    public a() {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }
    
    public final boolean l(final int n, final Parcel parcel, final Parcel parcel2) throws RemoteException {
        if (n == 1) {
            lq0.k.r0((Status)m.a(parcel, Status.CREATOR), (b)m.a(parcel, b.CREATOR), ((g)this).a);
            return true;
        }
        return false;
    }
}

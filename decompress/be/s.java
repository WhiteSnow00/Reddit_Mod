// 
// Decompiled by Procyon v0.6.0
// 

package be;

import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import android.os.Parcel;

public abstract class s extends k
{
    public s() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }
    
    public final boolean l(final int n, final Parcel parcel, final Parcel parcel2) throws RemoteException {
        if (n == 1) {
            final Status status = (Status)m.a(parcel, Status.CREATOR);
            final Credential credential = (Credential)m.a(parcel, Credential.CREATOR);
            throw new UnsupportedOperationException();
        }
        if (n == 2) {
            ((q)this).a.a((Status)m.a(parcel, Status.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        if (n != 3) {
            return false;
        }
        final Status status2 = (Status)m.a(parcel, Status.CREATOR);
        parcel.readString();
        throw new UnsupportedOperationException();
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package ld;

import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import de.m;
import com.google.android.gms.common.api.Status;
import android.os.Parcel;
import de.k;

public abstract class p extends k implements q
{
    public p() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }
    
    public final boolean k(final int n, final Parcel parcel, final Parcel parcel2) throws RemoteException {
        switch (n) {
            default: {
                return false;
            }
            case 103: {
                this.X((Status)m.a(parcel, Status.CREATOR));
                break;
            }
            case 102: {
                this.h((Status)m.a(parcel, Status.CREATOR));
                break;
            }
            case 101: {
                final GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount)m.a(parcel, GoogleSignInAccount.CREATOR);
                final Status status = (Status)m.a(parcel, Status.CREATOR);
                throw new UnsupportedOperationException();
            }
        }
        parcel2.writeNoException();
        return true;
    }
}

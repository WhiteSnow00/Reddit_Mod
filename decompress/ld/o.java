// 
// Decompiled by Procyon v0.6.0
// 

package ld;

import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import ce.m;
import com.google.android.gms.common.api.Status;
import android.os.Parcel;
import ce.k;

public abstract class o extends k implements p
{
    public o() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }
    
    public final boolean k(final int n, final Parcel parcel, final Parcel parcel2) throws RemoteException {
        switch (n) {
            default: {
                return false;
            }
            case 103: {
                ((p)this).T((Status)m.a(parcel, Status.CREATOR));
                break;
            }
            case 102: {
                ((p)this).h((Status)m.a(parcel, Status.CREATOR));
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

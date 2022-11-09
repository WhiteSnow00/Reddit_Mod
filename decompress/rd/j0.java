// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import android.accounts.Account;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class j0 implements Parcelable$Creator<i0>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        Account account = null;
        int i;
        int j = i = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            final char c = (char)int1;
            if (c != '\u0001') {
                if (c != '\u0002') {
                    if (c != '\u0003') {
                        if (c != '\u0004') {
                            SafeParcelReader.n(parcel, int1);
                        }
                        else {
                            googleSignInAccount = (GoogleSignInAccount)SafeParcelReader.b(parcel, int1, GoogleSignInAccount.CREATOR);
                        }
                    }
                    else {
                        i = SafeParcelReader.j(parcel, int1);
                    }
                }
                else {
                    account = (Account)SafeParcelReader.b(parcel, int1, Account.CREATOR);
                }
            }
            else {
                j = SafeParcelReader.j(parcel, int1);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new i0(j, account, i, googleSignInAccount);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package kd;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.SignInAccount;
import android.os.Parcelable$Creator;

public final class h implements Parcelable$Creator<SignInAccount>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        String c = "";
        GoogleSignInAccount googleSignInAccount = null;
        String c2 = "";
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            final char c3 = (char)int1;
            if (c3 != '\u0004') {
                if (c3 != '\u0007') {
                    if (c3 != '\b') {
                        SafeParcelReader.n(parcel, int1);
                    }
                    else {
                        c2 = SafeParcelReader.c(parcel, int1);
                    }
                }
                else {
                    googleSignInAccount = (GoogleSignInAccount)SafeParcelReader.b(parcel, int1, GoogleSignInAccount.CREATOR);
                }
            }
            else {
                c = SafeParcelReader.c(parcel, int1);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new SignInAccount(c, googleSignInAccount, c2);
    }
}

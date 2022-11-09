// 
// Decompiled by Procyon v0.6.0
// 

package ld;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import android.os.Parcelable$Creator;

public final class u implements Parcelable$Creator<SignInConfiguration>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        String c = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            final char c2 = (char)int1;
            if (c2 != '\u0002') {
                if (c2 != '\u0005') {
                    SafeParcelReader.n(parcel, int1);
                }
                else {
                    googleSignInOptions = (GoogleSignInOptions)SafeParcelReader.b(parcel, int1, GoogleSignInOptions.CREATOR);
                }
            }
            else {
                c = SafeParcelReader.c(parcel, int1);
            }
        }
        SafeParcelReader.g(parcel, o);
        return new SignInConfiguration(c, googleSignInOptions);
    }
}

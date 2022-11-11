// 
// Decompiled by Procyon v0.6.0
// 

package jd;

import java.io.Serializable;
import java.util.ArrayList;
import android.net.Uri;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import android.os.Parcelable$Creator;

public final class d implements Parcelable$Creator<GoogleSignInAccount>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        Serializable c2;
        Serializable c = c2 = null;
        Serializable c4;
        String c3 = (String)(c4 = c2);
        Serializable c5;
        Object o2 = c5 = c4;
        Serializable f;
        String c6 = (String)(f = c5);
        Serializable c8;
        Serializable c7 = c8 = f;
        int j = 0;
        long k = 0L;
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.n(parcel, int1);
                    continue;
                }
                case '\f': {
                    c8 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u000b': {
                    c7 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\n': {
                    f = SafeParcelReader.f(parcel, int1, Scope.CREATOR);
                    continue;
                }
                case '\t': {
                    c6 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\b': {
                    k = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\u0007': {
                    c5 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0006': {
                    o2 = SafeParcelReader.b(parcel, int1, Uri.CREATOR);
                    continue;
                }
                case '\u0005': {
                    c4 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0004': {
                    c3 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0003': {
                    c2 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0002': {
                    c = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0001': {
                    j = SafeParcelReader.j(parcel, int1);
                    continue;
                }
            }
        }
        SafeParcelReader.g(parcel, o);
        return new GoogleSignInAccount(j, (String)c, (String)c2, c3, (String)c4, (Uri)o2, (String)c5, k, c6, (ArrayList)f, (String)c7, (String)c8);
    }
}

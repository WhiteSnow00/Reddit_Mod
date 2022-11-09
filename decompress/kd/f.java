// 
// Decompiled by Procyon v0.6.0
// 

package kd;

import java.io.Serializable;
import java.util.Map;
import java.util.ArrayList;
import com.google.android.gms.common.api.Scope;
import android.accounts.Account;
import ld.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import android.os.Parcelable$Creator;

public final class f implements Parcelable$Creator<GoogleSignInOptions>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        ArrayList f = null;
        int h;
        int j = h = 0;
        int h3;
        int h2 = h3 = h;
        Serializable f2 = null;
        Serializable c;
        Object o2 = c = f2;
        Serializable c3;
        String c2 = (String)(c3 = c);
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.n(parcel, int1);
                    continue;
                }
                case '\n': {
                    c3 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\t': {
                    f = SafeParcelReader.f(parcel, int1, (Parcelable$Creator)a.CREATOR);
                    continue;
                }
                case '\b': {
                    c2 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0007': {
                    c = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0006': {
                    h3 = (SafeParcelReader.h(parcel, int1) ? 1 : 0);
                    continue;
                }
                case '\u0005': {
                    h2 = (SafeParcelReader.h(parcel, int1) ? 1 : 0);
                    continue;
                }
                case '\u0004': {
                    h = (SafeParcelReader.h(parcel, int1) ? 1 : 0);
                    continue;
                }
                case '\u0003': {
                    o2 = SafeParcelReader.b(parcel, int1, Account.CREATOR);
                    continue;
                }
                case '\u0002': {
                    f2 = SafeParcelReader.f(parcel, int1, Scope.CREATOR);
                    continue;
                }
                case '\u0001': {
                    j = SafeParcelReader.j(parcel, int1);
                    continue;
                }
            }
        }
        SafeParcelReader.g(parcel, o);
        return new GoogleSignInOptions(j, (ArrayList)f2, (Account)o2, (boolean)(h != 0), (boolean)(h2 != 0), (boolean)(h3 != 0), (String)c, c2, (Map)GoogleSignInOptions.j(f), (String)c3);
    }
}

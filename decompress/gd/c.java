// 
// Decompiled by Procyon v0.6.0
// 

package gd;

import java.io.Serializable;
import java.util.ArrayList;
import android.net.Uri;
import com.google.android.gms.auth.api.credentials.IdToken;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import android.os.Parcelable$Creator;

public final class c implements Parcelable$Creator<Credential>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        Serializable c2;
        Serializable c = c2 = null;
        Serializable f;
        Object o2 = f = c2;
        Serializable c4;
        Serializable c3 = c4 = f;
        Serializable c6;
        String c5 = (String)(c6 = c4);
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.n(parcel, int1);
                    continue;
                }
                case '\n': {
                    c6 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\t': {
                    c5 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0006': {
                    c4 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0005': {
                    c3 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0004': {
                    f = SafeParcelReader.f(parcel, int1, IdToken.CREATOR);
                    continue;
                }
                case '\u0003': {
                    o2 = SafeParcelReader.b(parcel, int1, Uri.CREATOR);
                    continue;
                }
                case '\u0002': {
                    c2 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0001': {
                    c = SafeParcelReader.c(parcel, int1);
                    continue;
                }
            }
        }
        SafeParcelReader.g(parcel, o);
        return new Credential((String)c, (String)c2, (Uri)o2, (ArrayList)f, (String)c3, (String)c4, c5, (String)c6);
    }
}

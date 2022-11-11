// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import android.util.Log;
import com.google.android.gms.internal.firebase-auth-api.zzty;

public final class a
{
    public static zzty a(final String s, final String s2, final Exception ex) {
        final String message = ex.getMessage();
        final StringBuilder r = d.r("Failed to parse ", s, " for string [", s2, "] with exception: ");
        r.append(message);
        Log.e(s, r.toString());
        return (zzty)new com.google.android.gms.internal.firebase_auth_api.zzty(al0.a.k("Failed to parse ", s, " for string [", s2, "]"), (Throwable)ex);
    }
}

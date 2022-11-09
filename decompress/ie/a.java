// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import ak0.n;
import android.util.Log;
import com.google.android.gms.internal.firebase-auth-api.zzty;

public final class a
{
    public static zzty a(final String s, final String s2, final Exception ex) {
        final String message = ex.getMessage();
        final StringBuilder m = b.m("Failed to parse ", s, " for string [", s2, "] with exception: ");
        m.append(message);
        Log.e(s, m.toString());
        return (zzty)new com.google.android.gms.internal.firebase_auth_api.zzty(n.n("Failed to parse ", s, " for string [", s2, "]"), (Throwable)ex);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package og;

import java.util.Iterator;
import java.util.Map;
import androidx.appcompat.widget.s0;
import java.util.HashMap;

public final class a
{
    public static final HashMap a;
    public static final HashMap b;
    public static final HashMap c;
    
    static {
        final HashMap hashMap = a = new HashMap();
        final HashMap hashMap2 = b = new HashMap();
        final Integer value = -1;
        final Integer i = s0.i(hashMap, value, "Too many sessions are running for current app, existing sessions must be resolved first.", -2, "A requested module is not available (to this user/device, for the installed apk).");
        final Integer value2 = -3;
        final Integer j = s0.i(hashMap, value2, "Request is otherwise invalid.", -4, "Requested session is not found.");
        final Integer value3 = -5;
        final Integer k = s0.i(hashMap, value3, "Split Install API is not available.", -6, "Network error: unable to obtain split details.");
        final Integer value4 = -7;
        final Integer l = s0.i(hashMap, value4, "Download not permitted under current device circumstances (e.g. in background).", -8, "Requested session contains modules from an existing active session and also new modules.");
        final Integer value5 = -9;
        final Integer m = s0.i(hashMap, value5, "Service handling split install has died.", -10, "Install failed due to insufficient storage.");
        final Integer value6 = -11;
        final Integer i2 = s0.i(hashMap, value6, "Signature verification error when invoking SplitCompat.", -12, "Error in SplitCompat emulation.");
        final Integer value7 = -13;
        final Integer i3 = s0.i(hashMap, value7, "Error in copying files for SplitCompat.", -14, "The Play Store app is either not installed or not the official version.");
        final Integer value8 = -15;
        final Integer i4 = s0.i(hashMap, value8, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.", -100, "Unknown error processing split install.");
        hashMap2.put(value, "ACTIVE_SESSIONS_LIMIT_EXCEEDED");
        hashMap2.put(i, "MODULE_UNAVAILABLE");
        hashMap2.put(value2, "INVALID_REQUEST");
        hashMap2.put(j, "DOWNLOAD_NOT_FOUND");
        hashMap2.put(value3, "API_NOT_AVAILABLE");
        hashMap2.put(k, "NETWORK_ERROR");
        hashMap2.put(value4, "ACCESS_DENIED");
        hashMap2.put(l, "INCOMPATIBLE_WITH_EXISTING_SESSION");
        hashMap2.put(value5, "SERVICE_DIED");
        hashMap2.put(m, "INSUFFICIENT_STORAGE");
        hashMap2.put(value6, "SPLITCOMPAT_VERIFICATION_ERROR");
        hashMap2.put(i2, "SPLITCOMPAT_EMULATION_ERROR");
        hashMap2.put(value7, "SPLITCOMPAT_COPY_ERROR");
        hashMap2.put(i3, "PLAY_STORE_NOT_FOUND");
        hashMap2.put(value8, "APP_NOT_OWNED");
        hashMap2.put(i4, "INTERNAL_ERROR");
        c = new HashMap();
        for (final Map.Entry<K, String> entry : hashMap2.entrySet()) {
            og.a.c.put(entry.getValue(), entry.getKey());
        }
    }
    
    public static int a(final String s) {
        final Integer n = og.a.c.get(s);
        if (n != null) {
            return n;
        }
        throw new IllegalArgumentException(String.valueOf(s).concat(" is unknown error."));
    }
}

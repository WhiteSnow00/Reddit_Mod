// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import java.security.GeneralSecurityException;
import com.google.android.gms.internal.firebase_auth_api.z0;

public final class m4
{
    public static final String a;
    
    static {
        new l4();
        a = "type.googleapis.com/google.crypto.tink.AesSivKey";
        final int f = z0.f;
        try {
            g3.f((d3)new o4());
            if (j4.a()) {
                return;
            }
            g3.e((f6)new l4());
        }
        catch (final GeneralSecurityException ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }
}

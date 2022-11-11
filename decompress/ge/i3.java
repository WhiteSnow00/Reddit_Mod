// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import java.security.GeneralSecurityException;
import com.google.android.gms.internal.firebase_auth_api.z0;

public final class i3
{
    public static final String a;
    public static final String b;
    
    static {
        new o3(0);
        a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new r3(1);
        b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new u3(1);
        new u3(0);
        new o3(1);
        new z3();
        new r3(2);
        new o3(2);
        final int f = z0.f;
        try {
            a();
        }
        catch (final GeneralSecurityException ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static void a() throws GeneralSecurityException {
        g3.f((d3)new l3());
        b7.a();
        boolean b = false;
        g3.e((f6)new o3(0));
        g3.e((f6)new r3(1));
        if (j4.a()) {
            return;
        }
        g3.e((f6)new u3(0));
        while (true) {
            try {
                Cipher.getInstance("AES/GCM-SIV/NoPadding");
                b = true;
                if (b) {
                    g3.e((f6)new u3(1));
                }
                g3.e((f6)new r3(2));
                g3.e((f6)new o3(1));
                g3.e((f6)new z3());
                g3.e((f6)new o3(2));
            }
            catch (final NoSuchAlgorithmException | NoSuchPaddingException ex) {
                continue;
            }
            break;
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Locale;
import java.util.regex.Pattern;

public final class ha
{
    static {
        Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"), 2);
        Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"), 2);
    }
    
    public static String a(final String s) {
        if (s.toLowerCase(Locale.US).startsWith("android-keystore://")) {
            return s.substring(19);
        }
        throw new IllegalArgumentException(String.format("key URI must start with %s", "android-keystore://"));
    }
    
    public static void b(final int n) throws InvalidAlgorithmParameterException {
        if (n != 16 && n != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", n * 8));
        }
    }
    
    public static void c(final int n) throws GeneralSecurityException {
        if (n >= 0 && n <= 0) {
            return;
        }
        throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", n, 0));
    }
}

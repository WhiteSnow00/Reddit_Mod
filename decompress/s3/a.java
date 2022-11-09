// 
// Decompiled by Procyon v0.6.0
// 

package s3;

import javax.crypto.Mac;
import java.security.Signature;
import javax.crypto.Cipher;
import androidx.biometric.BiometricPrompt$b;
import androidx.biometric.BiometricPrompt$c;
import android.hardware.fingerprint.FingerprintManager$AuthenticationResult;
import androidx.lifecycle.x;
import androidx.biometric.r;
import android.hardware.fingerprint.FingerprintManager$AuthenticationCallback;

public final class a extends FingerprintManager$AuthenticationCallback
{
    public final /* synthetic */ b.b a;
    
    public a(final androidx.biometric.a a) {
        this.a = a;
    }
    
    public final void onAuthenticationError(final int n, final CharSequence charSequence) {
        ((androidx.biometric.a)this.a).a.c.a(n, charSequence);
    }
    
    public final void onAuthenticationFailed() {
        ((androidx.biometric.a)this.a).a.c.b();
    }
    
    public final void onAuthenticationHelp(final int n, final CharSequence charSequence) {
        final r.a a = (r.a)((androidx.biometric.a)this.a).a.c;
        if (a.a.get() != null) {
            final r r = a.a.get();
            if (r.t == null) {
                r.t = new x<CharSequence>();
            }
            androidx.biometric.r.i(r.t, charSequence);
        }
    }
    
    public final void onAuthenticationSucceeded(final FingerprintManager$AuthenticationResult fingerprintManager$AuthenticationResult) {
        final b.b a = this.a;
        final b.c f = b.a.f(b.a.b(fingerprintManager$AuthenticationResult));
        final androidx.biometric.a a2 = (androidx.biometric.a)a;
        a2.getClass();
        BiometricPrompt$c biometricPrompt$c = null;
        if (f != null) {
            final Cipher b = f.b;
            if (b != null) {
                biometricPrompt$c = new BiometricPrompt$c(b);
            }
            else {
                final Signature a3 = f.a;
                if (a3 != null) {
                    biometricPrompt$c = new BiometricPrompt$c(a3);
                }
                else {
                    final Mac c = f.c;
                    if (c != null) {
                        biometricPrompt$c = new BiometricPrompt$c(c);
                    }
                }
            }
        }
        a2.a.c.c(new BiometricPrompt$b(biometricPrompt$c, 2));
    }
}

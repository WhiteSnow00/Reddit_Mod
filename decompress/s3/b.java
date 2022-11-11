// 
// Decompiled by Procyon v0.6.0
// 

package s3;

import javax.crypto.Mac;
import javax.crypto.Cipher;
import java.security.Signature;
import android.hardware.fingerprint.FingerprintManager$AuthenticationResult;
import android.hardware.fingerprint.FingerprintManager$AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager$CryptoObject;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Handler;
import android.os.CancellationSignal;
import v3.d$a;
import androidx.biometric.a;
import v3.d;
import android.content.Context;

@Deprecated
public final class b
{
    public final Context a;
    
    public b(final Context a) {
        this.a = a;
    }
    
    public final void a(final c c, d d, final androidx.biometric.a a) {
        final FingerprintManager c2 = a.c(this.a);
        if (c2 != null) {
            Label_0077: {
                if (d != null) {
                    monitorenter(d);
                    Label_0057: {
                        try {
                            if (d.c != null) {
                                break Label_0057;
                            }
                            final CancellationSignal b = d$a.b();
                            d.c = b;
                            if (d.a) {
                                d$a.a((Object)b);
                            }
                            break Label_0057;
                        }
                        finally {
                            monitorexit(d);
                            final Object c3 = d.c;
                            monitorexit(d);
                            d = (d)c3;
                            break Label_0077;
                        }
                    }
                }
                d = null;
            }
            a.a(c2, a.g(c), (CancellationSignal)d, 0, new s3.a(a), null);
        }
    }
    
    public static final class a
    {
        public static void a(final Object o, final Object o2, final CancellationSignal cancellationSignal, final int n, final Object o3, final Handler handler) {
            ((FingerprintManager)o).authenticate((FingerprintManager$CryptoObject)o2, cancellationSignal, n, (FingerprintManager$AuthenticationCallback)o3, handler);
        }
        
        public static FingerprintManager$CryptoObject b(final Object o) {
            return ((FingerprintManager$AuthenticationResult)o).getCryptoObject();
        }
        
        public static FingerprintManager c(final Context context) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return (FingerprintManager)context.getSystemService((Class)FingerprintManager.class);
            }
            return null;
        }
        
        public static boolean d(final Object o) {
            return ((FingerprintManager)o).hasEnrolledFingerprints();
        }
        
        public static boolean e(final Object o) {
            return ((FingerprintManager)o).isHardwareDetected();
        }
        
        public static c f(final Object o) {
            final FingerprintManager$CryptoObject fingerprintManager$CryptoObject = (FingerprintManager$CryptoObject)o;
            Object o2 = null;
            if (fingerprintManager$CryptoObject == null) {
                return null;
            }
            if (fingerprintManager$CryptoObject.getCipher() != null) {
                return new c(fingerprintManager$CryptoObject.getCipher());
            }
            if (fingerprintManager$CryptoObject.getSignature() != null) {
                return new c(fingerprintManager$CryptoObject.getSignature());
            }
            if (fingerprintManager$CryptoObject.getMac() != null) {
                o2 = new c(fingerprintManager$CryptoObject.getMac());
            }
            return (c)o2;
        }
        
        public static FingerprintManager$CryptoObject g(final c c) {
            FingerprintManager$CryptoObject fingerprintManager$CryptoObject = null;
            if (c == null) {
                return null;
            }
            if (c.b != null) {
                return new FingerprintManager$CryptoObject(c.b);
            }
            if (c.a != null) {
                return new FingerprintManager$CryptoObject(c.a);
            }
            if (c.c != null) {
                fingerprintManager$CryptoObject = new FingerprintManager$CryptoObject(c.c);
            }
            return fingerprintManager$CryptoObject;
        }
    }
    
    public abstract static class b
    {
    }
    
    public static final class c
    {
        public final Signature a;
        public final Cipher b;
        public final Mac c;
        
        public c(final Signature a) {
            this.a = a;
            this.b = null;
            this.c = null;
        }
        
        public c(final Cipher b) {
            this.b = b;
            this.a = null;
            this.c = null;
        }
        
        public c(final Mac c) {
            this.c = c;
            this.b = null;
            this.a = null;
        }
    }
}

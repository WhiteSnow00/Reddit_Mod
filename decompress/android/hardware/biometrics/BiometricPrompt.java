// 
// Decompiled by Procyon v0.6.0
// 

package android.hardware.biometrics;

import java.util.concurrent.Executor;
import android.os.CancellationSignal;
import android.annotation.NonNull;

public class BiometricPrompt
{
    static {
        throw new NoClassDefFoundError();
    }
    
    public native void authenticate(@NonNull final BiometricPrompt$CryptoObject p0, @NonNull final CancellationSignal p1, @NonNull final Executor p2, @NonNull final BiometricPrompt$AuthenticationCallback p3);
    
    public native void authenticate(@NonNull final CancellationSignal p0, @NonNull final Executor p1, @NonNull final BiometricPrompt$AuthenticationCallback p2);
}

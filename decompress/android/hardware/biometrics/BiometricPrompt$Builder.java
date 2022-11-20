// 
// Decompiled by Procyon v0.6.0
// 

package android.hardware.biometrics;

import android.content.DialogInterface$OnClickListener;
import java.util.concurrent.Executor;
import android.annotation.NonNull;
import android.content.Context;

public class BiometricPrompt$Builder
{
    static {
        throw new NoClassDefFoundError();
    }
    
    public BiometricPrompt$Builder(final Context context) {
    }
    
    @NonNull
    public native BiometricPrompt build();
    
    @NonNull
    public native BiometricPrompt$Builder setNegativeButton(@NonNull final CharSequence p0, @NonNull final Executor p1, @NonNull final DialogInterface$OnClickListener p2);
    
    @NonNull
    public native BiometricPrompt$Builder setTitle(@NonNull final CharSequence p0);
}

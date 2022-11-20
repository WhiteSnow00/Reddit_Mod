// 
// Decompiled by Procyon v0.6.0
// 

package w2;

import androidx.compose.ui.window.SecureFlagPolicy;

public final class f
{
    public static final int[] a;
    
    static {
        final int[] a2 = new int[SecureFlagPolicy.values().length];
        a2[((Enum)SecureFlagPolicy.SecureOff).ordinal()] = 1;
        a2[((Enum)SecureFlagPolicy.SecureOn).ordinal()] = 2;
        a2[((Enum)SecureFlagPolicy.Inherit).ordinal()] = 3;
        a = a2;
    }
}

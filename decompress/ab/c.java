// 
// Decompiled by Procyon v0.6.0
// 

package ab;

import android.media.NotProvisionedException;
import android.media.DeniedByServerException;

public final class c
{
    public static boolean a(final Throwable t) {
        return t instanceof DeniedByServerException;
    }
    
    public static boolean b(final Throwable t) {
        return t instanceof NotProvisionedException;
    }
}

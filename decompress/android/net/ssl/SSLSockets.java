// 
// Decompiled by Procyon v0.6.0
// 

package android.net.ssl;

import android.annotation.NonNull;
import javax.net.ssl.SSLSocket;

public class SSLSockets
{
    static {
        throw new NoClassDefFoundError();
    }
    
    public static native boolean isSupportedSocket(@NonNull final SSLSocket p0);
    
    public static native void setUseSessionTickets(@NonNull final SSLSocket p0, final boolean p1);
}

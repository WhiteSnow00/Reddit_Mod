// 
// Decompiled by Procyon v0.6.0
// 

package android.media.session;

import android.annotation.NonNull;

public final class MediaSessionManager$RemoteUserInfo
{
    static {
        throw new NoClassDefFoundError();
    }
    
    public MediaSessionManager$RemoteUserInfo(@NonNull final String s, final int n, final int n2) {
    }
    
    public native String getPackageName();
    
    public native int getPid();
    
    public native int getUid();
}

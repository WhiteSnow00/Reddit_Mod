// 
// Decompiled by Procyon v0.6.0
// 

package z4;

import android.media.session.MediaSessionManager$RemoteUserInfo;

public final class b extends c
{
    public b(final MediaSessionManager$RemoteUserInfo mediaSessionManager$RemoteUserInfo) {
        super(mediaSessionManager$RemoteUserInfo.getPackageName(), mediaSessionManager$RemoteUserInfo.getPid(), mediaSessionManager$RemoteUserInfo.getUid());
    }
    
    public b(final String s, final int n, final int n2) {
        super(s, n, n2);
        new MediaSessionManager$RemoteUserInfo(s, n, n2);
    }
    
    public static String a(final MediaSessionManager$RemoteUserInfo mediaSessionManager$RemoteUserInfo) {
        return mediaSessionManager$RemoteUserInfo.getPackageName();
    }
}

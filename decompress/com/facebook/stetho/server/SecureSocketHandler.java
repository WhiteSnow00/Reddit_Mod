// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.server;

import java.io.IOException;
import android.net.Credentials;
import android.support.v4.media.a;
import com.facebook.stetho.common.LogUtil;
import android.net.LocalSocket;
import android.content.Context;

public abstract class SecureSocketHandler implements SocketHandler
{
    private final Context mContext;
    
    public SecureSocketHandler(final Context mContext) {
        this.mContext = mContext;
    }
    
    private static void enforcePermission(final Context context, final LocalSocket localSocket) throws IOException, PeerAuthorizationException {
        final Credentials peerCredentials = localSocket.getPeerCredentials();
        final int uid = peerCredentials.getUid();
        final int pid = peerCredentials.getPid();
        if (LogUtil.isLoggable(2)) {
            LogUtil.v("Got request from uid=%d, pid=%d", new Object[] { uid, pid });
        }
        if (context.checkPermission("android.permission.DUMP", pid, uid) == 0) {
            return;
        }
        final StringBuilder p2 = a.p("Peer pid=", pid, ", uid=", uid, " does not have ");
        p2.append("android.permission.DUMP");
        throw new PeerAuthorizationException(p2.toString());
    }
    
    public final void onAccepted(final LocalSocket localSocket) throws IOException {
        try {
            enforcePermission(this.mContext, localSocket);
            this.onSecured(localSocket);
        }
        catch (final PeerAuthorizationException ex) {
            final StringBuilder t = a.t("Unauthorized request: ");
            t.append(((Throwable)ex).getMessage());
            LogUtil.e(t.toString());
        }
    }
    
    public abstract void onSecured(final LocalSocket p0) throws IOException;
}

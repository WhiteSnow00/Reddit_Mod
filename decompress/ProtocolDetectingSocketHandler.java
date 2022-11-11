// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.server;

import java.io.IOException;
import java.io.InputStream;
import android.net.LocalSocket;
import android.content.Context;
import java.util.ArrayList;

public class ProtocolDetectingSocketHandler extends SecureSocketHandler
{
    private static final int SENSING_BUFFER_SIZE = 256;
    private final ArrayList<ProtocolDetectingSocketHandler.ProtocolDetectingSocketHandler$HandlerInfo> mHandlers;
    
    public ProtocolDetectingSocketHandler(final Context context) {
        super(context);
        this.mHandlers = new ArrayList<ProtocolDetectingSocketHandler.ProtocolDetectingSocketHandler$HandlerInfo>(2);
    }
    
    public void addHandler(final ProtocolDetectingSocketHandler.ProtocolDetectingSocketHandler$MagicMatcher protocolDetectingSocketHandler$MagicMatcher, final SocketLikeHandler socketLikeHandler) {
        this.mHandlers.add(new ProtocolDetectingSocketHandler.ProtocolDetectingSocketHandler$HandlerInfo(protocolDetectingSocketHandler$MagicMatcher, socketLikeHandler, (ProtocolDetectingSocketHandler$1)null));
    }
    
    public void onSecured(final LocalSocket localSocket) throws IOException {
        final LeakyBufferedInputStream leakyBufferedInputStream = new LeakyBufferedInputStream(localSocket.getInputStream(), 256);
        if (!this.mHandlers.isEmpty()) {
            for (int i = 0; i < this.mHandlers.size(); ++i) {
                final ProtocolDetectingSocketHandler.ProtocolDetectingSocketHandler$HandlerInfo protocolDetectingSocketHandler$HandlerInfo = this.mHandlers.get(i);
                leakyBufferedInputStream.mark(256);
                final boolean matches = protocolDetectingSocketHandler$HandlerInfo.magicMatcher.matches((InputStream)leakyBufferedInputStream);
                leakyBufferedInputStream.reset();
                if (matches) {
                    protocolDetectingSocketHandler$HandlerInfo.handler.onAccepted(new SocketLike(localSocket, leakyBufferedInputStream));
                    return;
                }
            }
            final StringBuilder r = a.r("No matching handler, firstByte=");
            r.append(((InputStream)leakyBufferedInputStream).read());
            throw new IOException(r.toString());
        }
        throw new IllegalStateException("No handlers added");
    }
}

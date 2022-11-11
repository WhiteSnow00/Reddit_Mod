// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.server;

import java.io.IOException;
import android.net.LocalSocket;

public interface SocketHandler
{
    void onAccepted(final LocalSocket p0) throws IOException;
}

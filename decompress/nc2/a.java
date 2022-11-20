// 
// Decompiled by Procyon v0.6.0
// 

package nc2;

import java.util.Collections;
import java.net.Proxy;
import java.util.List;
import java.io.IOException;
import java.net.SocketAddress;
import java.net.URI;
import java.net.ProxySelector;

public final class a extends ProxySelector
{
    @Override
    public final void connectFailed(final URI uri, final SocketAddress socketAddress, final IOException ex) {
    }
    
    @Override
    public final List<Proxy> select(final URI uri) {
        if (uri != null) {
            return Collections.singletonList(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }
}

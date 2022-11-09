// 
// Decompiled by Procyon v0.6.0
// 

package v9;

import java.io.IOException;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Arrays;
import java.net.Proxy;
import java.util.List;
import java.net.ProxySelector;

public final class i extends ProxySelector
{
    public static final List<Proxy> d;
    public final ProxySelector a;
    public final String b;
    public final int c;
    
    static {
        d = Arrays.asList(Proxy.NO_PROXY);
    }
    
    public i(final ProxySelector a, final int c) {
        a.getClass();
        this.a = a;
        this.b = "127.0.0.1";
        this.c = c;
    }
    
    @Override
    public final void connectFailed(final URI uri, final SocketAddress socketAddress, final IOException ex) {
        this.a.connectFailed(uri, socketAddress, ex);
    }
    
    @Override
    public final List<Proxy> select(final URI uri) {
        List<Proxy> list;
        if (this.b.equals(uri.getHost()) && this.c == uri.getPort()) {
            list = i.d;
        }
        else {
            list = this.a.select(uri);
        }
        return list;
    }
}

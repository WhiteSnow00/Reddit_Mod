// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.proxy;

import lw0.b;
import java.net.Proxy;
import java.util.List;
import java.io.IOException;
import java.net.SocketAddress;
import java.net.URI;
import kotlin.Metadata;
import java.net.ProxySelector;

@Metadata(bv = {}, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000f" }, d2 = { "Lokhttp3/internal/proxy/NullProxySelector;", "Ljava/net/ProxySelector;", "Ljava/net/URI;", "uri", "", "Ljava/net/Proxy;", "select", "Ljava/net/SocketAddress;", "sa", "Ljava/io/IOException;", "ioe", "Lhg2/j;", "connectFailed", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class NullProxySelector extends ProxySelector
{
    public static final NullProxySelector INSTANCE;
    
    static {
        INSTANCE = new NullProxySelector();
    }
    
    private NullProxySelector() {
    }
    
    @Override
    public void connectFailed(final URI uri, final SocketAddress socketAddress, final IOException ex) {
    }
    
    @Override
    public List<Proxy> select(final URI uri) {
        if (uri != null) {
            return b.r1((Object)Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }
}

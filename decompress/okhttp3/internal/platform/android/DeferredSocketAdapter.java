// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.platform.android;

import javax.net.ssl.X509TrustManager;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Protocol;
import java.util.List;
import javax.net.ssl.SSLSocket;
import ng2.e;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018" }, d2 = { "Lokhttp3/internal/platform/android/DeferredSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "getDelegate", "", "isSupported", "matchesSocket", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "Lcg2/j;", "configureTlsExtensions", "getSelectedProtocol", "Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "socketAdapterFactory", "Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "delegate", "Lokhttp3/internal/platform/android/SocketAdapter;", "<init>", "(Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;)V", "Factory", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class DeferredSocketAdapter implements SocketAdapter
{
    private SocketAdapter delegate;
    private final DeferredSocketAdapter.DeferredSocketAdapter$Factory socketAdapterFactory;
    
    public DeferredSocketAdapter(final DeferredSocketAdapter.DeferredSocketAdapter$Factory socketAdapterFactory) {
        e.f((Object)socketAdapterFactory, "socketAdapterFactory");
        this.socketAdapterFactory = socketAdapterFactory;
    }
    
    private final SocketAdapter getDelegate(final SSLSocket sslSocket) {
        synchronized (this) {
            if (this.delegate == null && this.socketAdapterFactory.matchesSocket(sslSocket)) {
                this.delegate = this.socketAdapterFactory.create(sslSocket);
            }
            return this.delegate;
        }
    }
    
    public void configureTlsExtensions(final SSLSocket sslSocket, final String s, final List<? extends Protocol> list) {
        e.f((Object)sslSocket, "sslSocket");
        e.f((Object)list, "protocols");
        final SocketAdapter delegate = this.getDelegate(sslSocket);
        if (delegate != null) {
            delegate.configureTlsExtensions(sslSocket, s, (List)list);
        }
    }
    
    public String getSelectedProtocol(final SSLSocket sslSocket) {
        e.f((Object)sslSocket, "sslSocket");
        final SocketAdapter delegate = this.getDelegate(sslSocket);
        String selectedProtocol;
        if (delegate == null) {
            selectedProtocol = null;
        }
        else {
            selectedProtocol = delegate.getSelectedProtocol(sslSocket);
        }
        return selectedProtocol;
    }
    
    public boolean isSupported() {
        return true;
    }
    
    public boolean matchesSocket(final SSLSocket sslSocket) {
        e.f((Object)sslSocket, "sslSocket");
        return this.socketAdapterFactory.matchesSocket(sslSocket);
    }
    
    public boolean matchesSocketFactory(final SSLSocketFactory sslSocketFactory) {
        return SocketAdapter$DefaultImpls.matchesSocketFactory((SocketAdapter)this, sslSocketFactory);
    }
    
    public X509TrustManager trustManager(final SSLSocketFactory sslSocketFactory) {
        return SocketAdapter$DefaultImpls.trustManager((SocketAdapter)this, sslSocketFactory);
    }
}

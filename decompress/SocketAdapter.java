// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.platform.android;

import sg2.e;
import javax.net.ssl.X509TrustManager;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Protocol;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\bH&¨\u0006\u0014" }, d2 = { "Lokhttp3/internal/platform/android/SocketAdapter;", "", "", "isSupported", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "matchesSocket", "matchesSocketFactory", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "Lhg2/j;", "configureTlsExtensions", "getSelectedProtocol", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public interface SocketAdapter
{
    void configureTlsExtensions(final SSLSocket p0, final String p1, final List<? extends Protocol> p2);
    
    String getSelectedProtocol(final SSLSocket p0);
    
    boolean isSupported();
    
    boolean matchesSocket(final SSLSocket p0);
    
    boolean matchesSocketFactory(final SSLSocketFactory p0);
    
    X509TrustManager trustManager(final SSLSocketFactory p0);
    
    @Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
    public static final class DefaultImpls
    {
        public static boolean matchesSocketFactory(final SocketAdapter socketAdapter, final SSLSocketFactory sslSocketFactory) {
            e.f((Object)socketAdapter, "this");
            e.f((Object)sslSocketFactory, "sslSocketFactory");
            return false;
        }
        
        public static X509TrustManager trustManager(final SocketAdapter socketAdapter, final SSLSocketFactory sslSocketFactory) {
            e.f((Object)socketAdapter, "this");
            e.f((Object)sslSocketFactory, "sslSocketFactory");
            return null;
        }
    }
}

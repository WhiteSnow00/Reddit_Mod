// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.platform.android;

import javax.net.ssl.X509TrustManager;
import javax.net.ssl.SSLSocketFactory;
import a4.u0;
import javax.net.ssl.SSLParameters;
import java.io.IOException;
import okhttp3.internal.platform.Platform;
import android.net.ssl.SSLSockets;
import ng2.e;
import okhttp3.Protocol;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.SuppressSignatureCheck;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0017¨\u0006\u0012" }, d2 = { "Lokhttp3/internal/platform/android/Android10SocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "matchesSocket", "isSupported", "", "getSelectedProtocol", "hostname", "", "Lokhttp3/Protocol;", "protocols", "Lcg2/j;", "configureTlsExtensions", "<init>", "()V", "Companion", "okhttp" }, k = 1, mv = { 1, 6, 0 })
@SuppressSignatureCheck
public final class Android10SocketAdapter implements SocketAdapter
{
    public static final Android10SocketAdapter.Android10SocketAdapter$Companion Companion;
    
    static {
        Companion = new Android10SocketAdapter.Android10SocketAdapter$Companion((DefaultConstructorMarker)null);
    }
    
    public void configureTlsExtensions(final SSLSocket sslSocket, final String s, final List<? extends Protocol> list) {
        e.f((Object)sslSocket, "sslSocket");
        e.f((Object)list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            final SSLParameters sslParameters = sslSocket.getSSLParameters();
            final Object[] array = Platform.Companion.alpnProtocolNames((List)list).toArray(new String[0]);
            if (array != null) {
                sslParameters.setApplicationProtocols((String[])array);
                sslSocket.setSSLParameters(sslParameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        catch (final IllegalArgumentException ex) {
            throw new IOException("Android internal error", ex);
        }
    }
    
    public String getSelectedProtocol(final SSLSocket sslSocket) {
        e.f((Object)sslSocket, "sslSocket");
        final String s = null;
        try {
            String d = u0.d(sslSocket);
            if (d == null || e.a((Object)d, (Object)"")) {
                d = s;
            }
            return d;
        }
        catch (final UnsupportedOperationException ex) {
            return s;
        }
    }
    
    public boolean isSupported() {
        return Android10SocketAdapter.Companion.isSupported();
    }
    
    public boolean matchesSocket(final SSLSocket sslSocket) {
        e.f((Object)sslSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sslSocket);
    }
    
    public boolean matchesSocketFactory(final SSLSocketFactory sslSocketFactory) {
        return SocketAdapter$DefaultImpls.matchesSocketFactory((SocketAdapter)this, sslSocketFactory);
    }
    
    public X509TrustManager trustManager(final SSLSocketFactory sslSocketFactory) {
        return SocketAdapter$DefaultImpls.trustManager((SocketAdapter)this, sslSocketFactory);
    }
}

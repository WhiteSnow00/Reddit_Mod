// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.platform.android;

import javax.net.ssl.X509TrustManager;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.platform.ConscryptPlatform;
import okhttp3.internal.platform.Platform;
import org.conscrypt.Conscrypt;
import ng2.e;
import okhttp3.Protocol;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¨\u0006\u0012" }, d2 = { "Lokhttp3/internal/platform/android/ConscryptSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "matchesSocket", "isSupported", "", "getSelectedProtocol", "hostname", "", "Lokhttp3/Protocol;", "protocols", "Lcg2/j;", "configureTlsExtensions", "<init>", "()V", "Companion", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class ConscryptSocketAdapter implements SocketAdapter
{
    public static final ConscryptSocketAdapter.ConscryptSocketAdapter$Companion Companion;
    private static final DeferredSocketAdapter$Factory factory;
    
    static {
        Companion = new ConscryptSocketAdapter.ConscryptSocketAdapter$Companion((DefaultConstructorMarker)null);
        factory = (DeferredSocketAdapter$Factory)new ConscryptSocketAdapter$Companion$factory.ConscryptSocketAdapter$Companion$factory$1();
    }
    
    public static final DeferredSocketAdapter$Factory access$getFactory$cp() {
        return ConscryptSocketAdapter.factory;
    }
    
    public void configureTlsExtensions(final SSLSocket sslSocket, final String s, final List<? extends Protocol> list) {
        e.f((Object)sslSocket, "sslSocket");
        e.f((Object)list, "protocols");
        if (this.matchesSocket(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            final Object[] array = Platform.Companion.alpnProtocolNames((List)list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            Conscrypt.setApplicationProtocols(sslSocket, (String[])array);
        }
    }
    
    public String getSelectedProtocol(final SSLSocket sslSocket) {
        e.f((Object)sslSocket, "sslSocket");
        String applicationProtocol;
        if (this.matchesSocket(sslSocket)) {
            applicationProtocol = Conscrypt.getApplicationProtocol(sslSocket);
        }
        else {
            applicationProtocol = null;
        }
        return applicationProtocol;
    }
    
    public boolean isSupported() {
        return ConscryptPlatform.Companion.isSupported();
    }
    
    public boolean matchesSocket(final SSLSocket sslSocket) {
        e.f((Object)sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }
    
    public boolean matchesSocketFactory(final SSLSocketFactory sslSocketFactory) {
        return SocketAdapter$DefaultImpls.matchesSocketFactory((SocketAdapter)this, sslSocketFactory);
    }
    
    public X509TrustManager trustManager(final SSLSocketFactory sslSocketFactory) {
        return SocketAdapter$DefaultImpls.trustManager((SocketAdapter)this, sslSocketFactory);
    }
}

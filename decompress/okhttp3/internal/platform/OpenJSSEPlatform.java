// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.platform;

import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import java.util.Arrays;
import java.security.KeyStore;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.net.ssl.SSLContext;
import org.openjsse.javax.net.ssl.SSLParameters;
import ng2.e;
import okhttp3.Protocol;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.openjsse.net.ssl.OpenJSSE;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.security.Provider;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019" }, d2 = { "Lokhttp3/internal/platform/OpenJSSEPlatform;", "Lokhttp3/internal/platform/Platform;", "Ljavax/net/ssl/SSLContext;", "newSSLContext", "Ljavax/net/ssl/X509TrustManager;", "platformTrustManager", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "trustManager", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "Lcg2/j;", "configureTlsExtensions", "getSelectedProtocol", "Ljava/security/Provider;", "provider", "Ljava/security/Provider;", "<init>", "()V", "Companion", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class OpenJSSEPlatform extends Platform
{
    public static final OpenJSSEPlatform.OpenJSSEPlatform$Companion Companion;
    private static final boolean isSupported;
    private final Provider provider;
    
    static {
        final OpenJSSEPlatform.OpenJSSEPlatform$Companion openJSSEPlatform$Companion = Companion = new OpenJSSEPlatform.OpenJSSEPlatform$Companion((DefaultConstructorMarker)null);
        boolean isSupported2 = false;
        while (true) {
            try {
                Class.forName("org.openjsse.net.ssl.OpenJSSE", false, openJSSEPlatform$Companion.getClass().getClassLoader());
                isSupported2 = true;
                isSupported = isSupported2;
            }
            catch (final ClassNotFoundException ex) {
                continue;
            }
            break;
        }
    }
    
    private OpenJSSEPlatform() {
        this.provider = (Provider)new OpenJSSE();
    }
    
    public OpenJSSEPlatform(final DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
    
    public static final boolean access$isSupported$cp() {
        return OpenJSSEPlatform.isSupported;
    }
    
    public void configureTlsExtensions(final SSLSocket sslSocket, final String s, final List<Protocol> list) {
        e.f((Object)sslSocket, "sslSocket");
        e.f((Object)list, "protocols");
        if (sslSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            final org.openjsse.javax.net.ssl.SSLSocket sslSocket2 = (org.openjsse.javax.net.ssl.SSLSocket)sslSocket;
            final javax.net.ssl.SSLParameters sslParameters = sslSocket2.getSSLParameters();
            if (sslParameters instanceof SSLParameters) {
                final List alpnProtocolNames = Platform.Companion.alpnProtocolNames((List)list);
                final SSLParameters sslParameters2 = (SSLParameters)sslParameters;
                final Object[] array = alpnProtocolNames.toArray(new String[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                sslParameters2.setApplicationProtocols((String[])array);
                sslSocket2.setSSLParameters(sslParameters);
            }
        }
        else {
            super.configureTlsExtensions(sslSocket, s, (List)list);
        }
    }
    
    public String getSelectedProtocol(final SSLSocket sslSocket) {
        e.f((Object)sslSocket, "sslSocket");
        String s;
        if (sslSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            s = ((org.openjsse.javax.net.ssl.SSLSocket)sslSocket).getApplicationProtocol();
            if (s == null || e.a((Object)s, (Object)"")) {
                s = null;
            }
        }
        else {
            s = super.getSelectedProtocol(sslSocket);
        }
        return s;
    }
    
    public SSLContext newSSLContext() {
        final SSLContext instance = SSLContext.getInstance("TLSv1.3", this.provider);
        e.e((Object)instance, "getInstance(\"TLSv1.3\", provider)");
        return instance;
    }
    
    public X509TrustManager platformTrustManager() {
        final TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.provider);
        instance.init((KeyStore)null);
        final TrustManager[] trustManagers = instance.getTrustManagers();
        e.c((Object)trustManagers);
        final int length = trustManagers.length;
        boolean b = true;
        if (length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            b = false;
        }
        if (!b) {
            final String string = Arrays.toString(trustManagers);
            e.e((Object)string, "toString(this)");
            throw new IllegalStateException(e.l((Object)string, "Unexpected default trust managers: ").toString());
        }
        final TrustManager trustManager = trustManagers[0];
        if (trustManager != null) {
            return (X509TrustManager)trustManager;
        }
        throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
    }
    
    public X509TrustManager trustManager(final SSLSocketFactory sslSocketFactory) {
        e.f((Object)sslSocketFactory, "sslSocketFactory");
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported with OpenJSSE");
    }
}

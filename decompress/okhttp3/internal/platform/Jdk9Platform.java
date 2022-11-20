// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.platform;

import javax.net.ssl.X509TrustManager;
import javax.net.ssl.SSLSocketFactory;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import a4.u0;
import okhttp3.internal.SuppressSignatureCheck;
import javax.net.ssl.SSLParameters;
import a4.t0;
import ng2.e;
import okhttp3.Protocol;
import java.util.List;
import javax.net.ssl.SSLSocket;
import xi2.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0017J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016¨\u0006\u0015" }, d2 = { "Lokhttp3/internal/platform/Jdk9Platform;", "Lokhttp3/internal/platform/Platform;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "Lcg2/j;", "configureTlsExtensions", "getSelectedProtocol", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Ljavax/net/ssl/SSLContext;", "newSSLContext", "<init>", "()V", "Companion", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public class Jdk9Platform extends Platform
{
    public static final Jdk9Platform.Jdk9Platform$Companion Companion;
    private static final boolean isAvailable;
    private static final Integer majorVersion;
    
    static {
        Integer u0 = null;
        Companion = new Jdk9Platform.Jdk9Platform$Companion((DefaultConstructorMarker)null);
        final String property = System.getProperty("java.specification.version");
        if (property != null) {
            u0 = i.u0(property);
        }
        majorVersion = u0;
        boolean isAvailable2 = true;
        Label_0058: {
            if (u0 == null) {
                break Label_0058;
            }
            Label_0070: {
                if (u0 >= 9) {
                    break Label_0070;
                }
                while (true) {
                    isAvailable2 = false;
                    break Label_0070;
                    try {
                        SSLSocket.class.getMethod("getApplicationProtocol", (Class<?>[])new Class[0]);
                        isAvailable = isAvailable2;
                    }
                    catch (final NoSuchMethodException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public static final Integer access$getMajorVersion$cp() {
        return Jdk9Platform.majorVersion;
    }
    
    public static final boolean access$isAvailable$cp() {
        return Jdk9Platform.isAvailable;
    }
    
    @SuppressSignatureCheck
    public void configureTlsExtensions(final SSLSocket sslSocket, final String s, final List<Protocol> list) {
        e.f((Object)sslSocket, "sslSocket");
        e.f((Object)list, "protocols");
        final SSLParameters sslParameters = sslSocket.getSSLParameters();
        final Object[] array = Platform.Companion.alpnProtocolNames((List)list).toArray(new String[0]);
        if (array != null) {
            t0.l(sslParameters, (String[])array);
            sslSocket.setSSLParameters(sslParameters);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
    
    @SuppressSignatureCheck
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
    
    public SSLContext newSSLContext() {
        final Integer majorVersion = Jdk9Platform.majorVersion;
        SSLContext sslContext;
        if (majorVersion != null && majorVersion >= 9) {
            sslContext = SSLContext.getInstance("TLS");
            e.e((Object)sslContext, "getInstance(\"TLS\")");
        }
        else {
            try {
                sslContext = SSLContext.getInstance("TLSv1.3");
            }
            catch (final NoSuchAlgorithmException ex) {
                sslContext = SSLContext.getInstance("TLS");
            }
            e.e((Object)sslContext, "try {\n          // Based\u2026Instance(\"TLS\")\n        }");
        }
        return sslContext;
    }
    
    public X509TrustManager trustManager(final SSLSocketFactory sslSocketFactory) {
        e.f((Object)sslSocketFactory, "sslSocketFactory");
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 8 (>= 252) or JDK 9+");
    }
}

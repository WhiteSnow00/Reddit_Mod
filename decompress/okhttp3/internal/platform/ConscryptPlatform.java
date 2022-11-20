// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.platform;

import java.security.cert.X509Certificate;
import javax.net.ssl.SSLSession;
import org.conscrypt.Conscrypt$Version;
import org.conscrypt.ConscryptHostnameVerifier;
import java.util.Arrays;
import java.security.KeyStore;
import javax.net.ssl.TrustManagerFactory;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import javax.net.ssl.SSLContext;
import okhttp3.Protocol;
import java.util.List;
import javax.net.ssl.SSLSocket;
import ng2.e;
import org.conscrypt.Conscrypt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.security.Provider;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001b" }, d2 = { "Lokhttp3/internal/platform/ConscryptPlatform;", "Lokhttp3/internal/platform/Platform;", "Ljavax/net/ssl/SSLContext;", "newSSLContext", "Ljavax/net/ssl/X509TrustManager;", "platformTrustManager", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "trustManager", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "Lcg2/j;", "configureTlsExtensions", "getSelectedProtocol", "newSslSocketFactory", "Ljava/security/Provider;", "provider", "Ljava/security/Provider;", "<init>", "()V", "Companion", "DisabledHostnameVerifier", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class ConscryptPlatform extends Platform
{
    public static final Companion Companion;
    private static final boolean isSupported;
    private final Provider provider;
    
    static {
        final Companion companion = Companion = new Companion(null);
        final boolean b = false;
        while (true) {
            try {
                Class.forName("org.conscrypt.Conscrypt$Version", false, companion.getClass().getClassLoader());
                boolean isSupported2 = b;
                if (Conscrypt.isAvailable()) {
                    final boolean atLeastVersion = companion.atLeastVersion(2, 1, 0);
                    isSupported2 = b;
                    if (atLeastVersion) {
                        isSupported2 = true;
                    }
                }
                isSupported = isSupported2;
            }
            catch (final NoClassDefFoundError | ClassNotFoundException ex) {
                final boolean isSupported2 = b;
                continue;
            }
            break;
        }
    }
    
    private ConscryptPlatform() {
        final Provider provider = Conscrypt.newProvider();
        e.e((Object)provider, "newProvider()");
        this.provider = provider;
    }
    
    public ConscryptPlatform(final DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
    
    public static final boolean access$isSupported$cp() {
        return ConscryptPlatform.isSupported;
    }
    
    public void configureTlsExtensions(final SSLSocket sslSocket, final String s, final List<Protocol> list) {
        e.f((Object)sslSocket, "sslSocket");
        e.f((Object)list, "protocols");
        if (Conscrypt.isConscrypt(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            final Object[] array = Platform.Companion.alpnProtocolNames((List)list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            Conscrypt.setApplicationProtocols(sslSocket, (String[])array);
        }
        else {
            super.configureTlsExtensions(sslSocket, s, (List)list);
        }
    }
    
    public String getSelectedProtocol(final SSLSocket sslSocket) {
        e.f((Object)sslSocket, "sslSocket");
        String s;
        if (Conscrypt.isConscrypt(sslSocket)) {
            s = Conscrypt.getApplicationProtocol(sslSocket);
        }
        else {
            s = super.getSelectedProtocol(sslSocket);
        }
        return s;
    }
    
    public SSLContext newSSLContext() {
        final SSLContext instance = SSLContext.getInstance("TLS", this.provider);
        e.e((Object)instance, "getInstance(\"TLS\", provider)");
        return instance;
    }
    
    public SSLSocketFactory newSslSocketFactory(final X509TrustManager x509TrustManager) {
        e.f((Object)x509TrustManager, "trustManager");
        final SSLContext sslContext = this.newSSLContext();
        sslContext.init(null, new TrustManager[] { x509TrustManager }, null);
        final SSLSocketFactory socketFactory = sslContext.getSocketFactory();
        e.e((Object)socketFactory, "newSSLContext().apply {\n\u2026null)\n    }.socketFactory");
        return socketFactory;
    }
    
    public X509TrustManager platformTrustManager() {
        final TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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
            final X509TrustManager x509TrustManager = (X509TrustManager)trustManager;
            Conscrypt.setHostnameVerifier((TrustManager)x509TrustManager, (ConscryptHostnameVerifier)DisabledHostnameVerifier.INSTANCE);
            return x509TrustManager;
        }
        throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
    }
    
    public X509TrustManager trustManager(final SSLSocketFactory sslSocketFactory) {
        e.f((Object)sslSocketFactory, "sslSocketFactory");
        return null;
    }
    
    @Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bJ\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005¨\u0006\r" }, d2 = { "Lokhttp3/internal/platform/ConscryptPlatform$Companion;", "", "()V", "isSupported", "", "()Z", "atLeastVersion", "major", "", "minor", "patch", "buildIfSupported", "Lokhttp3/internal/platform/ConscryptPlatform;", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
        
        public static boolean atLeastVersion$default(final Companion companion, final int n, int n2, int n3, final int n4, final Object o) {
            if ((n4 & 0x2) != 0x0) {
                n2 = 0;
            }
            if ((n4 & 0x4) != 0x0) {
                n3 = 0;
            }
            return companion.atLeastVersion(n, n2, n3);
        }
        
        public final boolean atLeastVersion(final int n, final int n2, final int n3) {
            final Conscrypt$Version version = Conscrypt.version();
            final boolean b = false;
            boolean b2 = false;
            final boolean b3 = false;
            if (version == null) {
                return false;
            }
            if (version.major() != n) {
                boolean b4 = b3;
                if (version.major() > n) {
                    b4 = true;
                }
                return b4;
            }
            if (version.minor() != n2) {
                boolean b5 = b;
                if (version.minor() > n2) {
                    b5 = true;
                }
                return b5;
            }
            if (version.patch() >= n3) {
                b2 = true;
            }
            return b2;
        }
        
        public final ConscryptPlatform buildIfSupported() {
            final boolean supported = this.isSupported();
            ConscryptPlatform conscryptPlatform = null;
            if (supported) {
                conscryptPlatform = new ConscryptPlatform(null);
            }
            return conscryptPlatform;
        }
        
        public final boolean isSupported() {
            return ConscryptPlatform.access$isSupported$cp();
        }
    }
    
    @Metadata(d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\u0003\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\fJ\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\r" }, d2 = { "Lokhttp3/internal/platform/ConscryptPlatform$DisabledHostnameVerifier;", "Lorg/conscrypt/ConscryptHostnameVerifier;", "()V", "verify", "", "certs", "", "Ljava/security/cert/X509Certificate;", "hostname", "", "session", "Ljavax/net/ssl/SSLSession;", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class DisabledHostnameVerifier implements ConscryptHostnameVerifier
    {
        public static final DisabledHostnameVerifier INSTANCE;
        
        static {
            INSTANCE = new DisabledHostnameVerifier();
        }
        
        private DisabledHostnameVerifier() {
        }
        
        public final boolean verify(final String s, final SSLSession sslSession) {
            return true;
        }
        
        public boolean verify(final X509Certificate[] array, final String s, final SSLSession sslSession) {
            return true;
        }
    }
}

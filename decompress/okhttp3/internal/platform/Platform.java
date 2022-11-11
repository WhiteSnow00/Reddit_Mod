// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.platform;

import jk2.c;
import java.util.Iterator;
import ig2.m;
import java.util.ArrayList;
import java.security.Security;
import okhttp3.internal.platform.android.AndroidLog;
import okhttp3.internal._UtilJvmKt;
import java.security.KeyStore;
import javax.net.ssl.TrustManagerFactory;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.SSLContext;
import java.util.logging.Level;
import java.io.IOException;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import okhttp3.Protocol;
import java.util.List;
import okhttp3.internal.tls.BasicTrustRootIndex;
import java.util.Arrays;
import java.security.cert.X509Certificate;
import okhttp3.internal.tls.TrustRootIndex;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.CertificateChainCleaner;
import javax.net.ssl.X509TrustManager;
import sg2.e;
import javax.net.ssl.SSLSocket;
import okhttp3.OkHttpClient;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.logging.Logger;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b-\u0010.J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J \u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J&\u0010 \u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00192\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010\"\u001a\u00020!2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0012\u0010$\u001a\u0004\u0018\u00010\u00012\u0006\u0010#\u001a\u00020\u0002H\u0016J\u001a\u0010&\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u0016J\u0010\u0010(\u001a\u00020'2\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010*\u001a\u00020)2\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010+\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010,\u001a\u00020\u0002H\u0016¨\u00060" }, d2 = { "Lokhttp3/internal/platform/Platform;", "", "", "getPrefix", "Ljavax/net/ssl/SSLContext;", "newSSLContext", "Ljavax/net/ssl/X509TrustManager;", "platformTrustManager", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "trustManager", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "hostname", "", "Lokhttp3/Protocol;", "protocols", "Lhg2/j;", "configureTlsExtensions", "afterHandshake", "getSelectedProtocol", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "connectSocket", "message", "level", "", "t", "log", "", "isCleartextTrafficPermitted", "closer", "getStackTraceForCloseable", "stackTrace", "logCloseableLeak", "Lokhttp3/internal/tls/CertificateChainCleaner;", "buildCertificateChainCleaner", "Lokhttp3/internal/tls/TrustRootIndex;", "buildTrustRootIndex", "newSslSocketFactory", "toString", "<init>", "()V", "Companion", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public class Platform
{
    public static final Companion Companion;
    public static final int INFO = 4;
    public static final int WARN = 5;
    private static final Logger logger;
    private static volatile Platform platform;
    
    static {
        Platform.platform = (Companion = new Companion(null)).findPlatform();
        logger = Logger.getLogger(OkHttpClient.class.getName());
    }
    
    public static final /* synthetic */ Platform access$getPlatform$cp() {
        return Platform.platform;
    }
    
    public static final /* synthetic */ void access$setPlatform$cp(final Platform platform) {
        Platform.platform = platform;
    }
    
    public static final Platform get() {
        return Platform.Companion.get();
    }
    
    public void afterHandshake(final SSLSocket sslSocket) {
        e.f((Object)sslSocket, "sslSocket");
    }
    
    public CertificateChainCleaner buildCertificateChainCleaner(final X509TrustManager x509TrustManager) {
        e.f((Object)x509TrustManager, "trustManager");
        return (CertificateChainCleaner)new BasicCertificateChainCleaner(this.buildTrustRootIndex(x509TrustManager));
    }
    
    public TrustRootIndex buildTrustRootIndex(final X509TrustManager x509TrustManager) {
        e.f((Object)x509TrustManager, "trustManager");
        final X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        e.e((Object)acceptedIssuers, "trustManager.acceptedIssuers");
        return (TrustRootIndex)new BasicTrustRootIndex((X509Certificate[])Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }
    
    public void configureTlsExtensions(final SSLSocket sslSocket, final String s, final List<Protocol> list) {
        e.f((Object)sslSocket, "sslSocket");
        e.f((Object)list, "protocols");
    }
    
    public void connectSocket(final Socket socket, final InetSocketAddress inetSocketAddress, final int n) throws IOException {
        e.f((Object)socket, "socket");
        e.f((Object)inetSocketAddress, "address");
        socket.connect(inetSocketAddress, n);
    }
    
    public final String getPrefix() {
        return "OkHttp";
    }
    
    public String getSelectedProtocol(final SSLSocket sslSocket) {
        e.f((Object)sslSocket, "sslSocket");
        return null;
    }
    
    public Object getStackTraceForCloseable(final String s) {
        e.f((Object)s, "closer");
        Throwable t;
        if (Platform.logger.isLoggable(Level.FINE)) {
            t = new Throwable(s);
        }
        else {
            t = null;
        }
        return t;
    }
    
    public boolean isCleartextTrafficPermitted(final String s) {
        e.f((Object)s, "hostname");
        return true;
    }
    
    public void log(final String s, final int n, final Throwable t) {
        e.f((Object)s, "message");
        Level level;
        if (n == 5) {
            level = Level.WARNING;
        }
        else {
            level = Level.INFO;
        }
        Platform.logger.log(level, s, t);
    }
    
    public void logCloseableLeak(final String s, final Object o) {
        e.f((Object)s, "message");
        String l = s;
        if (o == null) {
            l = e.l((Object)" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);", s);
        }
        this.log(l, 5, (Throwable)o);
    }
    
    public SSLContext newSSLContext() {
        final SSLContext instance = SSLContext.getInstance("TLS");
        e.e((Object)instance, "getInstance(\"TLS\")");
        return instance;
    }
    
    public SSLSocketFactory newSslSocketFactory(final X509TrustManager x509TrustManager) {
        e.f((Object)x509TrustManager, "trustManager");
        try {
            final SSLContext sslContext = this.newSSLContext();
            sslContext.init(null, new TrustManager[] { x509TrustManager }, null);
            final SSLSocketFactory socketFactory = sslContext.getSocketFactory();
            e.e((Object)socketFactory, "newSSLContext().apply {\n\u2026ll)\n      }.socketFactory");
            return socketFactory;
        }
        catch (final GeneralSecurityException ex) {
            throw new AssertionError(e.l((Object)ex, "No System TLS: "), ex);
        }
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
            return (X509TrustManager)trustManager;
        }
        throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
    public X509TrustManager trustManager(final SSLSocketFactory sslSocketFactory) {
        e.f((Object)sslSocketFactory, "sslSocketFactory");
        try {
            final Object fieldOrNull = _UtilJvmKt.readFieldOrNull((Object)sslSocketFactory, (Class)Class.forName("sun.security.ssl.SSLContextImpl"), "context");
            if (fieldOrNull == null) {
                return null;
            }
            final X509TrustManager x509TrustManager = (X509TrustManager)_UtilJvmKt.readFieldOrNull(fieldOrNull, (Class)X509TrustManager.class, "trustManager");
            goto Label_0068;
        }
        catch (final RuntimeException ex) {
            if (e.a((Object)ex.getClass().getName(), (Object)"java.lang.reflect.InaccessibleObjectException")) {
                goto Label_0068;
            }
            throw ex;
        }
        catch (final ClassNotFoundException ex2) {
            goto Label_0068;
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0002J\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0014\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u0014\u0010\u0012\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001d\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001f¨\u0006\"" }, d2 = { "Lokhttp3/internal/platform/Platform$Companion;", "", "Lokhttp3/internal/platform/Platform;", "findPlatform", "findAndroidPlatform", "findJvmPlatform", "get", "platform", "Lhg2/j;", "resetForTests", "", "Lokhttp3/Protocol;", "protocols", "", "alpnProtocolNames", "", "concatLengthPrefixed", "", "isConscryptPreferred", "()Z", "isOpenJSSEPreferred", "isBouncyCastlePreferred", "isAndroid", "", "INFO", "I", "WARN", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "Lokhttp3/internal/platform/Platform;", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
    public static final class Companion
    {
        private Companion() {
        }
        
        private final Platform findAndroidPlatform() {
            AndroidLog.INSTANCE.enable();
            Platform platform;
            if ((platform = Android10Platform.Companion.buildIfSupported()) == null) {
                platform = AndroidPlatform.Companion.buildIfSupported();
                e.c((Object)platform);
            }
            return platform;
        }
        
        private final Platform findJvmPlatform() {
            if (this.isConscryptPreferred()) {
                final ConscryptPlatform buildIfSupported = ConscryptPlatform.Companion.buildIfSupported();
                if (buildIfSupported != null) {
                    return (Platform)buildIfSupported;
                }
            }
            if (this.isBouncyCastlePreferred()) {
                final BouncyCastlePlatform buildIfSupported2 = BouncyCastlePlatform.Companion.buildIfSupported();
                if (buildIfSupported2 != null) {
                    return (Platform)buildIfSupported2;
                }
            }
            if (this.isOpenJSSEPreferred()) {
                final OpenJSSEPlatform buildIfSupported3 = OpenJSSEPlatform.Companion.buildIfSupported();
                if (buildIfSupported3 != null) {
                    return (Platform)buildIfSupported3;
                }
            }
            final Jdk9Platform buildIfSupported4 = Jdk9Platform.Companion.buildIfSupported();
            if (buildIfSupported4 != null) {
                return (Platform)buildIfSupported4;
            }
            final Platform buildIfSupported5 = Jdk8WithJettyBootPlatform.Companion.buildIfSupported();
            if (buildIfSupported5 != null) {
                return buildIfSupported5;
            }
            return new Platform();
        }
        
        private final Platform findPlatform() {
            Platform platform;
            if (this.isAndroid()) {
                platform = this.findAndroidPlatform();
            }
            else {
                platform = this.findJvmPlatform();
            }
            return platform;
        }
        
        private final boolean isBouncyCastlePreferred() {
            return e.a((Object)"BC", (Object)Security.getProviders()[0].getName());
        }
        
        private final boolean isConscryptPreferred() {
            return e.a((Object)"Conscrypt", (Object)Security.getProviders()[0].getName());
        }
        
        private final boolean isOpenJSSEPreferred() {
            return e.a((Object)"OpenJSSE", (Object)Security.getProviders()[0].getName());
        }
        
        public final List<String> alpnProtocolNames(final List<? extends Protocol> list) {
            e.f((Object)list, "protocols");
            final ArrayList list2 = new ArrayList();
            for (final Protocol next : list) {
                if (next != Protocol.HTTP_1_0) {
                    list2.add(next);
                }
            }
            final ArrayList list3 = new ArrayList(m.c3((Iterable)list2, 10));
            final Iterator iterator2 = list2.iterator();
            while (iterator2.hasNext()) {
                list3.add((Object)((Protocol)iterator2.next()).toString());
            }
            return (List<String>)list3;
        }
        
        public final byte[] concatLengthPrefixed(final List<? extends Protocol> list) {
            e.f((Object)list, "protocols");
            final c c = new c();
            for (final String s : this.alpnProtocolNames(list)) {
                c.O(s.length());
                c.Y(s);
            }
            return c.w1();
        }
        
        public final Platform get() {
            return Platform.access$getPlatform$cp();
        }
        
        public final boolean isAndroid() {
            return e.a((Object)"Dalvik", (Object)System.getProperty("java.vm.name"));
        }
        
        public final void resetForTests(final Platform platform) {
            e.f((Object)platform, "platform");
            Platform.access$setPlatform$cp(platform);
        }
    }
}

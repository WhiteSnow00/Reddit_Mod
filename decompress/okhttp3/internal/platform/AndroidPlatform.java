// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.platform;

import java.lang.reflect.InvocationTargetException;
import java.security.cert.TrustAnchor;
import javax.net.ssl.SSLSocketFactory;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import okhttp3.Protocol;
import javax.net.ssl.SSLSocket;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import okhttp3.internal.tls.TrustRootIndex;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import ng2.e;
import okhttp3.internal.tls.CertificateChainCleaner;
import javax.net.ssl.X509TrustManager;
import java.util.Iterator;
import java.util.ArrayList;
import kotlin.collections.b;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.StandardAndroidSocketAdapter$Companion;
import okhttp3.internal.platform.android.StandardAndroidSocketAdapter;
import android.os.Build$VERSION;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.platform.android.SocketAdapter;
import java.util.List;
import okhttp3.internal.SuppressSignatureCheck;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002\"#B\u0007¢\u0006\u0004\b \u0010!J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J(\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\fH\u0016R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006$" }, d2 = { "Lokhttp3/internal/platform/AndroidPlatform;", "Lokhttp3/internal/platform/Platform;", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "Lcg2/j;", "connectSocket", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "configureTlsExtensions", "getSelectedProtocol", "", "isCleartextTrafficPermitted", "Lokhttp3/internal/tls/CertificateChainCleaner;", "buildCertificateChainCleaner", "Lokhttp3/internal/tls/TrustRootIndex;", "buildTrustRootIndex", "Lokhttp3/internal/platform/android/SocketAdapter;", "socketAdapters", "Ljava/util/List;", "<init>", "()V", "Companion", "CustomTrustRootIndex", "okhttp" }, k = 1, mv = { 1, 6, 0 })
@SuppressSignatureCheck
public final class AndroidPlatform extends Platform
{
    public static final Companion Companion;
    private static final boolean isSupported;
    private final List<SocketAdapter> socketAdapters;
    
    static {
        Companion = new Companion(null);
        final boolean android = Platform.Companion.isAndroid();
        boolean isSupported2 = false;
        if (android) {
            if (Build$VERSION.SDK_INT < 30) {
                isSupported2 = true;
            }
        }
        isSupported = isSupported2;
    }
    
    public AndroidPlatform() {
        final ArrayList e2 = b.e2((Object[])new SocketAdapter[] { StandardAndroidSocketAdapter$Companion.buildIfSupported$default(StandardAndroidSocketAdapter.Companion, (String)null, 1, (Object)null), (SocketAdapter)new DeferredSocketAdapter(AndroidSocketAdapter.Companion.getPlayProviderFactory()), (SocketAdapter)new DeferredSocketAdapter(ConscryptSocketAdapter.Companion.getFactory()), (SocketAdapter)new DeferredSocketAdapter(BouncyCastleSocketAdapter.Companion.getFactory()) });
        final ArrayList socketAdapters = new ArrayList();
        for (final Object next : e2) {
            if (((SocketAdapter)next).isSupported()) {
                socketAdapters.add(next);
            }
        }
        this.socketAdapters = socketAdapters;
    }
    
    public static final boolean access$isSupported$cp() {
        return AndroidPlatform.isSupported;
    }
    
    public CertificateChainCleaner buildCertificateChainCleaner(final X509TrustManager x509TrustManager) {
        e.f((Object)x509TrustManager, "trustManager");
        CertificateChainCleaner certificateChainCleaner;
        if ((certificateChainCleaner = AndroidCertificateChainCleaner.Companion.buildIfSupported(x509TrustManager)) == null) {
            certificateChainCleaner = super.buildCertificateChainCleaner(x509TrustManager);
        }
        return certificateChainCleaner;
    }
    
    public TrustRootIndex buildTrustRootIndex(X509TrustManager buildTrustRootIndex) {
        e.f((Object)buildTrustRootIndex, "trustManager");
        try {
            final Method declaredMethod = buildTrustRootIndex.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            buildTrustRootIndex = (X509TrustManager)new CustomTrustRootIndex(buildTrustRootIndex, declaredMethod);
        }
        catch (final NoSuchMethodException ex) {
            buildTrustRootIndex = (X509TrustManager)super.buildTrustRootIndex(buildTrustRootIndex);
        }
        return (TrustRootIndex)buildTrustRootIndex;
    }
    
    public void configureTlsExtensions(final SSLSocket sslSocket, final String s, final List<Protocol> list) {
        e.f((Object)sslSocket, "sslSocket");
        e.f((Object)list, "protocols");
        while (true) {
            for (final SocketAdapter next : this.socketAdapters) {
                if (next.matchesSocket(sslSocket)) {
                    final SocketAdapter socketAdapter = next;
                    if (socketAdapter != null) {
                        socketAdapter.configureTlsExtensions(sslSocket, s, (List)list);
                    }
                    return;
                }
            }
            SocketAdapter next = null;
            continue;
        }
    }
    
    public void connectSocket(final Socket socket, final InetSocketAddress inetSocketAddress, final int n) throws IOException {
        e.f((Object)socket, "socket");
        e.f((Object)inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, n);
        }
        catch (final ClassCastException ex) {
            if (Build$VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", ex);
            }
            throw ex;
        }
    }
    
    public String getSelectedProtocol(final SSLSocket sslSocket) {
        e.f((Object)sslSocket, "sslSocket");
        final Iterator<Object> iterator = this.socketAdapters.iterator();
        while (true) {
            SocketAdapter next;
            do {
                final boolean hasNext = iterator.hasNext();
                final String s = null;
                if (!hasNext) {
                    next = null;
                    final SocketAdapter socketAdapter = next;
                    String selectedProtocol;
                    if (socketAdapter == null) {
                        selectedProtocol = s;
                    }
                    else {
                        selectedProtocol = socketAdapter.getSelectedProtocol(sslSocket);
                    }
                    return selectedProtocol;
                }
                next = iterator.next();
            } while (!next.matchesSocket(sslSocket));
            continue;
        }
    }
    
    public boolean isCleartextTrafficPermitted(final String s) {
        e.f((Object)s, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(s);
    }
    
    public X509TrustManager trustManager(final SSLSocketFactory sslSocketFactory) {
        e.f((Object)sslSocketFactory, "sslSocketFactory");
        final Iterator<Object> iterator = this.socketAdapters.iterator();
        while (true) {
            SocketAdapter next;
            do {
                final boolean hasNext = iterator.hasNext();
                final X509TrustManager x509TrustManager = null;
                if (!hasNext) {
                    next = null;
                    final SocketAdapter socketAdapter = next;
                    X509TrustManager trustManager;
                    if (socketAdapter == null) {
                        trustManager = x509TrustManager;
                    }
                    else {
                        trustManager = socketAdapter.trustManager(sslSocketFactory);
                    }
                    return trustManager;
                }
                next = iterator.next();
            } while (!next.matchesSocketFactory(sslSocketFactory));
            continue;
        }
    }
    
    @Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005¨\u0006\b" }, d2 = { "Lokhttp3/internal/platform/AndroidPlatform$Companion;", "", "()V", "isSupported", "", "()Z", "buildIfSupported", "Lokhttp3/internal/platform/Platform;", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
        
        public final Platform buildIfSupported() {
            AndroidPlatform androidPlatform;
            if (this.isSupported()) {
                androidPlatform = new AndroidPlatform();
            }
            else {
                androidPlatform = null;
            }
            return androidPlatform;
        }
        
        public final boolean isSupported() {
            return AndroidPlatform.access$isSupported$cp();
        }
    }
    
    @Metadata(d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0003H\u00c2\u0003J\t\u0010\b\u001a\u00020\u0005H\u00c2\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015" }, d2 = { "Lokhttp3/internal/platform/AndroidPlatform$CustomTrustRootIndex;", "Lokhttp3/internal/tls/TrustRootIndex;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "findByIssuerAndSignatureMethod", "Ljava/lang/reflect/Method;", "(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V", "component1", "component2", "copy", "equals", "", "other", "", "findByIssuerAndSignature", "Ljava/security/cert/X509Certificate;", "cert", "hashCode", "", "toString", "", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class CustomTrustRootIndex implements TrustRootIndex
    {
        private final Method findByIssuerAndSignatureMethod;
        private final X509TrustManager trustManager;
        
        public CustomTrustRootIndex(final X509TrustManager trustManager, final Method findByIssuerAndSignatureMethod) {
            e.f((Object)trustManager, "trustManager");
            e.f((Object)findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.trustManager = trustManager;
            this.findByIssuerAndSignatureMethod = findByIssuerAndSignatureMethod;
        }
        
        private final X509TrustManager component1() {
            return this.trustManager;
        }
        
        private final Method component2() {
            return this.findByIssuerAndSignatureMethod;
        }
        
        public static CustomTrustRootIndex copy$default(final CustomTrustRootIndex customTrustRootIndex, X509TrustManager trustManager, Method findByIssuerAndSignatureMethod, final int n, final Object o) {
            if ((n & 0x1) != 0x0) {
                trustManager = customTrustRootIndex.trustManager;
            }
            if ((n & 0x2) != 0x0) {
                findByIssuerAndSignatureMethod = customTrustRootIndex.findByIssuerAndSignatureMethod;
            }
            return customTrustRootIndex.copy(trustManager, findByIssuerAndSignatureMethod);
        }
        
        public final CustomTrustRootIndex copy(final X509TrustManager x509TrustManager, final Method method) {
            e.f((Object)x509TrustManager, "trustManager");
            e.f((Object)method, "findByIssuerAndSignatureMethod");
            return new CustomTrustRootIndex(x509TrustManager, method);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof CustomTrustRootIndex)) {
                return false;
            }
            final CustomTrustRootIndex customTrustRootIndex = (CustomTrustRootIndex)o;
            return e.a((Object)this.trustManager, (Object)customTrustRootIndex.trustManager) && e.a((Object)this.findByIssuerAndSignatureMethod, (Object)customTrustRootIndex.findByIssuerAndSignatureMethod);
        }
        
        public X509Certificate findByIssuerAndSignature(X509Certificate trustedCert) {
            e.f((Object)trustedCert, "cert");
            try {
                final Object invoke = this.findByIssuerAndSignatureMethod.invoke(this.trustManager, trustedCert);
                if (invoke != null) {
                    trustedCert = ((TrustAnchor)invoke).getTrustedCert();
                    goto Label_0056;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            }
            catch (final InvocationTargetException ex) {
                trustedCert = null;
            }
            catch (final IllegalAccessException ex2) {
                throw new AssertionError("unable to get issues and signature", ex2);
            }
        }
        
        @Override
        public int hashCode() {
            return this.findByIssuerAndSignatureMethod.hashCode() + this.trustManager.hashCode() * 31;
        }
        
        @Override
        public String toString() {
            final StringBuilder t = a.t("CustomTrustRootIndex(trustManager=");
            t.append(this.trustManager);
            t.append(", findByIssuerAndSignatureMethod=");
            t.append(this.findByIssuerAndSignatureMethod);
            t.append(')');
            return t.toString();
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.platform;

import javax.net.ssl.SSLSocketFactory;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import okhttp3.Protocol;
import javax.net.ssl.SSLSocket;
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
import okhttp3.internal.platform.android.Android10SocketAdapter;
import android.os.Build$VERSION;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.platform.android.SocketAdapter;
import java.util.List;
import okhttp3.internal.SuppressSignatureCheck;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u001a\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\bH\u0017J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 " }, d2 = { "Lokhttp3/internal/platform/Android10Platform;", "Lokhttp3/internal/platform/Platform;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "Lcg2/j;", "configureTlsExtensions", "getSelectedProtocol", "closer", "", "getStackTraceForCloseable", "message", "stackTrace", "logCloseableLeak", "", "isCleartextTrafficPermitted", "Lokhttp3/internal/tls/CertificateChainCleaner;", "buildCertificateChainCleaner", "Lokhttp3/internal/platform/android/SocketAdapter;", "socketAdapters", "Ljava/util/List;", "<init>", "()V", "Companion", "okhttp" }, k = 1, mv = { 1, 6, 0 })
@SuppressSignatureCheck
public final class Android10Platform extends Platform
{
    public static final Companion Companion;
    private static final boolean isSupported;
    private final List<SocketAdapter> socketAdapters;
    
    static {
        Companion = new Companion(null);
        isSupported = (Platform.Companion.isAndroid() && Build$VERSION.SDK_INT >= 29);
    }
    
    public Android10Platform() {
        final ArrayList e2 = b.e2((Object[])new SocketAdapter[] { Android10SocketAdapter.Companion.buildIfSupported(), (SocketAdapter)new DeferredSocketAdapter(AndroidSocketAdapter.Companion.getPlayProviderFactory()), (SocketAdapter)new DeferredSocketAdapter(ConscryptSocketAdapter.Companion.getFactory()), (SocketAdapter)new DeferredSocketAdapter(BouncyCastleSocketAdapter.Companion.getFactory()) });
        final ArrayList socketAdapters = new ArrayList();
        for (final Object next : e2) {
            if (((SocketAdapter)next).isSupported()) {
                socketAdapters.add(next);
            }
        }
        this.socketAdapters = socketAdapters;
    }
    
    public static final boolean access$isSupported$cp() {
        return Android10Platform.isSupported;
    }
    
    public CertificateChainCleaner buildCertificateChainCleaner(final X509TrustManager x509TrustManager) {
        e.f((Object)x509TrustManager, "trustManager");
        CertificateChainCleaner certificateChainCleaner;
        if ((certificateChainCleaner = AndroidCertificateChainCleaner.Companion.buildIfSupported(x509TrustManager)) == null) {
            certificateChainCleaner = super.buildCertificateChainCleaner(x509TrustManager);
        }
        return certificateChainCleaner;
    }
    
    public void configureTlsExtensions(final SSLSocket sslSocket, final String s, final List<? extends Protocol> list) {
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
    
    public Object getStackTraceForCloseable(final String s) {
        e.f((Object)s, "closer");
        Object stackTraceForCloseable;
        if (Build$VERSION.SDK_INT >= 30) {
            final CloseGuard closeGuard = new CloseGuard();
            closeGuard.open(s);
            stackTraceForCloseable = closeGuard;
        }
        else {
            stackTraceForCloseable = super.getStackTraceForCloseable(s);
        }
        return stackTraceForCloseable;
    }
    
    public boolean isCleartextTrafficPermitted(final String s) {
        e.f((Object)s, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(s);
    }
    
    public void logCloseableLeak(final String s, final Object o) {
        e.f((Object)s, "message");
        if (Build$VERSION.SDK_INT >= 30) {
            if (o == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.util.CloseGuard");
            }
            ((CloseGuard)o).warnIfOpen();
        }
        else {
            super.logCloseableLeak(s, o);
        }
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
    
    @Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005¨\u0006\b" }, d2 = { "Lokhttp3/internal/platform/Android10Platform$Companion;", "", "()V", "isSupported", "", "()Z", "buildIfSupported", "Lokhttp3/internal/platform/Platform;", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
        
        public final Platform buildIfSupported() {
            Android10Platform android10Platform;
            if (this.isSupported()) {
                android10Platform = new Android10Platform();
            }
            else {
                android10Platform = null;
            }
            return android10Platform;
        }
        
        public final boolean isSupported() {
            return Android10Platform.access$isSupported$cp();
        }
    }
}

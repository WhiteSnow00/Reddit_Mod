// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.platform.android;

import okhttp3.internal.SuppressSignatureCheck;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.security.cert.X509Certificate;
import java.security.cert.Certificate;
import java.util.List;
import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import android.net.http.X509TrustManagerExtensions;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import okhttp3.internal.tls.CertificateChainCleaner;

@Metadata(d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0017J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014" }, d2 = { "Lokhttp3/internal/platform/android/AndroidCertificateChainCleaner;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "x509TrustManagerExtensions", "Landroid/net/http/X509TrustManagerExtensions;", "(Ljavax/net/ssl/X509TrustManager;Landroid/net/http/X509TrustManagerExtensions;)V", "clean", "", "Ljava/security/cert/Certificate;", "chain", "hostname", "", "equals", "", "other", "", "hashCode", "", "Companion", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public final class AndroidCertificateChainCleaner extends CertificateChainCleaner
{
    public static final AndroidCertificateChainCleaner.AndroidCertificateChainCleaner$Companion Companion;
    private final X509TrustManager trustManager;
    private final X509TrustManagerExtensions x509TrustManagerExtensions;
    
    static {
        Companion = new AndroidCertificateChainCleaner.AndroidCertificateChainCleaner$Companion((DefaultConstructorMarker)null);
    }
    
    public AndroidCertificateChainCleaner(final X509TrustManager trustManager, final X509TrustManagerExtensions x509TrustManagerExtensions) {
        e.f((Object)trustManager, "trustManager");
        e.f((Object)x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.trustManager = trustManager;
        this.x509TrustManagerExtensions = x509TrustManagerExtensions;
    }
    
    @SuppressSignatureCheck
    public List<Certificate> clean(final List<? extends Certificate> list, final String s) throws SSLPeerUnverifiedException {
        e.f((Object)list, "chain");
        e.f((Object)s, "hostname");
        final Object[] array = list.toArray((Object[])new X509Certificate[0]);
        if (array != null) {
            final X509Certificate[] array2 = (X509Certificate[])array;
            try {
                final List checkServerTrusted = this.x509TrustManagerExtensions.checkServerTrusted(array2, "RSA", s);
                e.e((Object)checkServerTrusted, "x509TrustManagerExtensio\u2026ficates, \"RSA\", hostname)");
                return checkServerTrusted;
            }
            catch (final CertificateException ex) {
                final SSLPeerUnverifiedException ex2 = new SSLPeerUnverifiedException(ex.getMessage());
                ex2.initCause(ex);
                throw ex2;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
    
    public boolean equals(final Object o) {
        return o instanceof AndroidCertificateChainCleaner && ((AndroidCertificateChainCleaner)o).trustManager == this.trustManager;
    }
    
    public int hashCode() {
        return System.identityHashCode(this.trustManager);
    }
}

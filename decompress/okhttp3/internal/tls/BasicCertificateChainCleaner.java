// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.tls;

import java.util.Iterator;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ArrayDeque;
import java.security.cert.Certificate;
import java.util.List;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J \u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017" }, d2 = { "Lokhttp3/internal/tls/BasicCertificateChainCleaner;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "trustRootIndex", "Lokhttp3/internal/tls/TrustRootIndex;", "(Lokhttp3/internal/tls/TrustRootIndex;)V", "clean", "", "Ljava/security/cert/Certificate;", "chain", "hostname", "", "equals", "", "other", "", "hashCode", "", "verifySignature", "toVerify", "Ljava/security/cert/X509Certificate;", "signingCert", "minIntermediates", "Companion", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public final class BasicCertificateChainCleaner extends CertificateChainCleaner
{
    public static final BasicCertificateChainCleaner.BasicCertificateChainCleaner$Companion Companion;
    private static final int MAX_SIGNERS = 9;
    private final TrustRootIndex trustRootIndex;
    
    static {
        Companion = new BasicCertificateChainCleaner.BasicCertificateChainCleaner$Companion((DefaultConstructorMarker)null);
    }
    
    public BasicCertificateChainCleaner(final TrustRootIndex trustRootIndex) {
        e.f((Object)trustRootIndex, "trustRootIndex");
        this.trustRootIndex = trustRootIndex;
    }
    
    private final boolean verifySignature(final X509Certificate x509Certificate, final X509Certificate x509Certificate2, final int n) {
        final boolean a = e.a((Object)x509Certificate.getIssuerDN(), (Object)x509Certificate2.getSubjectDN());
        boolean b = false;
        if (!a) {
            return false;
        }
        if (x509Certificate2.getBasicConstraints() < n) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            b = true;
            return b;
        }
        catch (final GeneralSecurityException ex) {
            return b;
        }
    }
    
    public List<Certificate> clean(final List<? extends Certificate> list, final String s) throws SSLPeerUnverifiedException {
        e.f((Object)list, "chain");
        e.f((Object)s, "hostname");
        final ArrayDeque arrayDeque = new ArrayDeque((Collection<? extends E>)list);
        final ArrayList list2 = new ArrayList();
        final Object removeFirst = arrayDeque.removeFirst();
        e.e(removeFirst, "queue.removeFirst()");
        list2.add(removeFirst);
        int i = 0;
        boolean b = false;
    Label_0058:
        while (i < 9) {
            ++i;
            final X509Certificate x509Certificate = (X509Certificate)list2.get(list2.size() - 1);
            final X509Certificate byIssuerAndSignature = this.trustRootIndex.findByIssuerAndSignature(x509Certificate);
            if (byIssuerAndSignature != null) {
                if (list2.size() > 1 || !e.a((Object)x509Certificate, (Object)byIssuerAndSignature)) {
                    list2.add(byIssuerAndSignature);
                }
                if (this.verifySignature(byIssuerAndSignature, byIssuerAndSignature, list2.size() - 2)) {
                    return list2;
                }
                b = true;
            }
            else {
                final Iterator iterator = arrayDeque.iterator();
                e.e((Object)iterator, "queue.iterator()");
                while (iterator.hasNext()) {
                    final Object next = iterator.next();
                    if (next == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                    final X509Certificate x509Certificate2 = (X509Certificate)next;
                    if (this.verifySignature(x509Certificate, x509Certificate2, list2.size() - 1)) {
                        iterator.remove();
                        list2.add(x509Certificate2);
                        continue Label_0058;
                    }
                }
                if (b) {
                    return list2;
                }
                throw new SSLPeerUnverifiedException(e.l((Object)x509Certificate, "Failed to find a trusted cert that signed "));
            }
        }
        throw new SSLPeerUnverifiedException(e.l((Object)list2, "Certificate chain too long: "));
    }
    
    public boolean equals(final Object o) {
        boolean b = true;
        if (o != this) {
            if (!(o instanceof BasicCertificateChainCleaner) || !e.a((Object)((BasicCertificateChainCleaner)o).trustRootIndex, (Object)this.trustRootIndex)) {
                b = false;
            }
        }
        return b;
    }
    
    public int hashCode() {
        return this.trustRootIndex.hashCode();
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.tls;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;
import ng2.e;
import java.security.cert.X509Certificate;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012" }, d2 = { "Lokhttp3/internal/tls/BasicTrustRootIndex;", "Lokhttp3/internal/tls/TrustRootIndex;", "caCerts", "", "Ljava/security/cert/X509Certificate;", "([Ljava/security/cert/X509Certificate;)V", "subjectToCaCerts", "", "Ljavax/security/auth/x500/X500Principal;", "", "equals", "", "other", "", "findByIssuerAndSignature", "cert", "hashCode", "", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public final class BasicTrustRootIndex implements TrustRootIndex
{
    private final Map<X500Principal, Set<X509Certificate>> subjectToCaCerts;
    
    public BasicTrustRootIndex(final X509Certificate... array) {
        e.f((Object)array, "caCerts");
        final LinkedHashMap subjectToCaCerts = new LinkedHashMap();
        final int length = array.length;
        int i = 0;
        while (i < length) {
            final X509Certificate x509Certificate = array[i];
            ++i;
            final X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            e.e((Object)subjectX500Principal, "caCert.subjectX500Principal");
            Object value;
            if ((value = subjectToCaCerts.get(subjectX500Principal)) == null) {
                value = new LinkedHashSet<X509Certificate>();
                subjectToCaCerts.put(subjectX500Principal, value);
            }
            ((Set<X509Certificate>)value).add(x509Certificate);
        }
        this.subjectToCaCerts = subjectToCaCerts;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof BasicTrustRootIndex && e.a((Object)((BasicTrustRootIndex)o).subjectToCaCerts, (Object)this.subjectToCaCerts));
    }
    
    public X509Certificate findByIssuerAndSignature(final X509Certificate x509Certificate) {
        e.f((Object)x509Certificate, "cert");
        final Set set = this.subjectToCaCerts.get(x509Certificate.getIssuerX500Principal());
        final X509Certificate x509Certificate2 = null;
        if (set == null) {
            return null;
        }
        final Iterator iterator = set.iterator();
        boolean b;
        Object next;
        do {
            next = x509Certificate2;
            if (!iterator.hasNext()) {
                break;
            }
            next = iterator.next();
            final X509Certificate x509Certificate3 = (X509Certificate)next;
            try {
                x509Certificate.verify(x509Certificate3.getPublicKey());
                b = true;
            }
            catch (final Exception ex) {
                b = false;
            }
        } while (!b);
        return (X509Certificate)next;
    }
    
    @Override
    public int hashCode() {
        return this.subjectToCaCerts.hashCode();
    }
}

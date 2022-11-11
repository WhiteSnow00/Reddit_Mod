// 
// Decompiled by Procyon v0.6.0
// 

package vc2;

import java.security.PublicKey;
import java.util.Iterator;
import javax.security.auth.x500.X500Principal;
import java.util.LinkedHashSet;
import java.util.Set;
import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;

public final class b implements e
{
    public final LinkedHashMap a;
    
    public b(final X509Certificate... array) {
        this.a = new LinkedHashMap();
        for (final X509Certificate x509Certificate : array) {
            final X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set set;
            if ((set = this.a.get(subjectX500Principal)) == null) {
                set = new LinkedHashSet(1);
                this.a.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (!(o instanceof b) || !((b)o).a.equals(this.a)) {
            b = false;
        }
        return b;
    }
    
    public final X509Certificate findByIssuerAndSignature(final X509Certificate x509Certificate) {
        final Set set = this.a.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        final Iterator iterator = set.iterator();
        while (true) {
            Label_0063: {
                if (!iterator.hasNext()) {
                    break Label_0063;
                }
                final X509Certificate x509Certificate2 = (X509Certificate)iterator.next();
                final PublicKey publicKey = x509Certificate2.getPublicKey();
                try {
                    x509Certificate.verify(publicKey);
                    return x509Certificate2;
                    return null;
                }
                catch (final Exception ex) {}
            }
        }
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}

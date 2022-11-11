// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.tls;

import java.security.cert.Certificate;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import okhttp3.internal._HostnamesCommonKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import okhttp3.internal._HostnamesJvmKt;
import cj2.j;
import al0.b;
import al0.g7;
import java.util.Iterator;
import java.util.Collection;
import java.security.cert.CertificateParsingException;
import sg2.e;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import java.util.List;
import java.security.cert.X509Certificate;
import java.util.Locale;
import kotlin.Metadata;
import javax.net.ssl.HostnameVerifier;

@Metadata(d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0002J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\f\u0010\u0017\u001a\u00020\b*\u00020\bH\u0002J\f\u0010\u0018\u001a\u00020\u000e*\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019" }, d2 = { "Lokhttp3/internal/tls/OkHostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "()V", "ALT_DNS_NAME", "", "ALT_IPA_NAME", "allSubjectAltNames", "", "", "certificate", "Ljava/security/cert/X509Certificate;", "getSubjectAltNames", "type", "verify", "", "host", "session", "Ljavax/net/ssl/SSLSession;", "verifyHostname", "hostname", "pattern", "verifyIpAddress", "ipAddress", "asciiToLowercase", "isAscii", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public final class OkHostnameVerifier implements HostnameVerifier
{
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE;
    
    static {
        INSTANCE = new OkHostnameVerifier();
    }
    
    private OkHostnameVerifier() {
    }
    
    private final String asciiToLowercase(final String s) {
        String p = s;
        if (this.isAscii(s)) {
            final Locale us = Locale.US;
            p = a.p(us, "US", s, us, "this as java.lang.String).toLowerCase(locale)");
        }
        return p;
    }
    
    private final List<String> getSubjectAltNames(final X509Certificate x509Certificate, final int n) {
        try {
            final Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return (List<String>)EmptyList.INSTANCE;
            }
            final ArrayList list = new ArrayList();
            for (final List list2 : subjectAlternativeNames) {
                if (list2 != null) {
                    if (list2.size() < 2) {
                        continue;
                    }
                    if (!e.a(list2.get(0), (Object)n)) {
                        continue;
                    }
                    final Object value = list2.get(1);
                    if (value == null) {
                        continue;
                    }
                    list.add(value);
                }
            }
            return list;
        }
        catch (final CertificateParsingException ex) {
            return (List<String>)EmptyList.INSTANCE;
        }
    }
    
    private final boolean isAscii(final String s) {
        final int length = s.length();
        final int length2 = s.length();
        boolean b = false;
        if (length2 < 0) {
            throw new IllegalArgumentException(g7.f("endIndex < beginIndex: ", length2, " < ", 0).toString());
        }
        if (length2 <= s.length()) {
            long n = 0L;
            int i = 0;
            while (i < length2) {
                final char char1 = s.charAt(i);
                if (char1 < '\u0080') {
                    ++n;
                }
                else {
                    int n2;
                    if (char1 < '\u0800') {
                        n2 = 2;
                    }
                    else if (char1 >= '\ud800' && char1 <= '\udfff') {
                        final int n3 = i + 1;
                        char char2;
                        if (n3 < length2) {
                            char2 = s.charAt(n3);
                        }
                        else {
                            char2 = '\0';
                        }
                        if (char1 <= '\udbff' && char2 >= '\udc00' && char2 <= '\udfff') {
                            n += 4;
                            i += 2;
                            continue;
                        }
                        ++n;
                        i = n3;
                        continue;
                    }
                    else {
                        n2 = 3;
                    }
                    n += n2;
                }
                ++i;
            }
            if (length == (int)n) {
                b = true;
            }
            return b;
        }
        final StringBuilder j = al0.b.i("endIndex > string.length: ", length2, " > ");
        j.append(s.length());
        throw new IllegalArgumentException(j.toString().toString());
    }
    
    private final boolean verifyHostname(String s, final String s2) {
        if (s != null && s.length() != 0 && !j.O0(s, ".", false)) {
            if (!j.D0(s, "..", false)) {
                if (s2 != null && s2.length() != 0 && !j.O0(s2, ".", false)) {
                    if (!j.D0(s2, "..", false)) {
                        String l = s;
                        if (!j.D0(s, ".", false)) {
                            l = e.l((Object)".", s);
                        }
                        s = s2;
                        if (!j.D0(s2, ".", false)) {
                            s = e.l((Object)".", s2);
                        }
                        s = this.asciiToLowercase(s);
                        if (!kotlin.text.b.P0((CharSequence)s, (CharSequence)"*", false)) {
                            return e.a((Object)l, (Object)s);
                        }
                        if (j.O0(s, "*.", false)) {
                            if (kotlin.text.b.Y0((CharSequence)s, '*', 1, false, 4) == -1) {
                                if (l.length() < s.length()) {
                                    return false;
                                }
                                if (e.a((Object)"*.", (Object)s)) {
                                    return false;
                                }
                                s = s.substring(1);
                                e.e((Object)s, "this as java.lang.String).substring(startIndex)");
                                if (!j.D0(l, s, false)) {
                                    return false;
                                }
                                final int n = l.length() - s.length();
                                return n <= 0 || kotlin.text.b.b1((CharSequence)l, '.', n - 1, 4) == -1;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    private final boolean verifyHostname(String asciiToLowercase, final X509Certificate x509Certificate) {
        asciiToLowercase = this.asciiToLowercase(asciiToLowercase);
        final List<String> subjectAltNames = this.getSubjectAltNames(x509Certificate, 2);
        final boolean b = subjectAltNames instanceof Collection;
        final boolean b2 = false;
        boolean b3;
        if (b && subjectAltNames.isEmpty()) {
            b3 = b2;
        }
        else {
            final Iterator iterator = subjectAltNames.iterator();
            do {
                b3 = b2;
                if (iterator.hasNext()) {
                    continue;
                }
                return b3;
            } while (!OkHostnameVerifier.INSTANCE.verifyHostname(asciiToLowercase, (String)iterator.next()));
            b3 = true;
        }
        return b3;
    }
    
    private final boolean verifyIpAddress(String canonicalHost, final X509Certificate x509Certificate) {
        canonicalHost = _HostnamesJvmKt.toCanonicalHost(canonicalHost);
        final List<String> subjectAltNames = this.getSubjectAltNames(x509Certificate, 7);
        final boolean b = subjectAltNames instanceof Collection;
        final boolean b2 = false;
        boolean b3;
        if (b && subjectAltNames.isEmpty()) {
            b3 = b2;
        }
        else {
            final Iterator iterator = subjectAltNames.iterator();
            do {
                b3 = b2;
                if (iterator.hasNext()) {
                    continue;
                }
                return b3;
            } while (!e.a((Object)canonicalHost, (Object)_HostnamesJvmKt.toCanonicalHost((String)iterator.next())));
            b3 = true;
        }
        return b3;
    }
    
    public final List<String> allSubjectAltNames(final X509Certificate x509Certificate) {
        e.f((Object)x509Certificate, "certificate");
        return CollectionsKt___CollectionsKt.W3((Iterable)this.getSubjectAltNames(x509Certificate, 2), (Collection)this.getSubjectAltNames(x509Certificate, 7));
    }
    
    public final boolean verify(final String s, final X509Certificate x509Certificate) {
        e.f((Object)s, "host");
        e.f((Object)x509Certificate, "certificate");
        boolean b;
        if (_HostnamesCommonKt.canParseAsIpAddress(s)) {
            b = this.verifyIpAddress(s, x509Certificate);
        }
        else {
            b = this.verifyHostname(s, x509Certificate);
        }
        return b;
    }
    
    @Override
    public boolean verify(final String s, final SSLSession sslSession) {
        e.f((Object)s, "host");
        e.f((Object)sslSession, "session");
        final boolean ascii = this.isAscii(s);
        boolean verify = false;
        if (!ascii) {
            return verify;
        }
        try {
            final Certificate certificate = sslSession.getPeerCertificates()[0];
            if (certificate != null) {
                verify = this.verify(s, (X509Certificate)certificate);
                return verify;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        }
        catch (final SSLException ex) {
            return verify;
        }
    }
}

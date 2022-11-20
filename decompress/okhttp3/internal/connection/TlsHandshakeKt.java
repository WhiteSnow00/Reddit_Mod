// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.connection;

import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import ng2.e;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¨\u0006\u0005" }, d2 = { "retryTlsHandshake", "", "e", "Ljava/io/IOException;", "Lokio/IOException;", "okhttp" }, k = 2, mv = { 1, 6, 0 }, xi = 48)
public final class TlsHandshakeKt
{
    public static final boolean retryTlsHandshake(final IOException ex) {
        e.f((Object)ex, "e");
        final boolean b = ex instanceof ProtocolException;
        boolean b2 = false;
        if (!b) {
            if (!(ex instanceof InterruptedIOException)) {
                if (!(ex instanceof SSLHandshakeException) || !(ex.getCause() instanceof CertificateException)) {
                    if (!(ex instanceof SSLPeerUnverifiedException)) {
                        if (ex instanceof SSLException) {
                            b2 = true;
                        }
                    }
                }
            }
        }
        return b2;
    }
}

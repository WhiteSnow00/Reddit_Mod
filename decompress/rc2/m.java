// 
// Decompiled by Procyon v0.6.0
// 

package rc2;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.net.SocketTimeoutException;
import java.io.IOException;
import java.net.Socket;

public final class m extends c
{
    public final Socket k;
    
    public m(final Socket k) {
        this.k = k;
    }
    
    public final IOException n(final IOException ex) {
        final SocketTimeoutException ex2 = new SocketTimeoutException("timeout");
        if (ex != null) {
            ex2.initCause(ex);
        }
        return ex2;
    }
    
    public final void o() {
        try {
            this.k.close();
        }
        catch (final AssertionError assertionError) {
            if (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) {
                throw assertionError;
            }
            final Logger a = n.a;
            final Level warning = Level.WARNING;
            final StringBuilder t = a.t("Failed to close timed out socket ");
            t.append(this.k);
            a.log(warning, t.toString(), assertionError);
        }
        catch (final Exception ex) {
            final Logger a2 = n.a;
            final Level warning2 = Level.WARNING;
            final StringBuilder t2 = a.t("Failed to close timed out socket ");
            t2.append(this.k);
            a2.log(warning2, t2.toString(), ex);
        }
    }
}

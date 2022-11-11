// 
// Decompiled by Procyon v0.6.0
// 

package od;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.a$e;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import nd.c;
import com.google.android.gms.common.api.internal.a;

public final class q1<A extends a<? extends c, Object>> extends t1
{
    public final A b;
    
    public q1(final a b) {
        super(1);
        this.b = (A)b;
    }
    
    public final void a(final Status status) {
        try {
            this.b.m(status);
        }
        catch (final IllegalStateException ex) {
            Log.w("ApiCallRunner", "Exception reporting failure", (Throwable)ex);
        }
    }
    
    public final void b(final RuntimeException ex) {
        final String simpleName = ex.getClass().getSimpleName();
        final String localizedMessage = ex.getLocalizedMessage();
        final Status status = new Status(10, (PendingIntent)null, android.support.v4.media.a.l(new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length()), simpleName, ": ", localizedMessage));
        try {
            this.b.m(status);
        }
        catch (final IllegalStateException ex2) {
            Log.w("ApiCallRunner", "Exception reporting failure", (Throwable)ex2);
        }
    }
    
    public final void c(final w0<?> w0) throws DeadObjectException {
        try {
            final a<? extends c, Object> b = this.b;
            final a$e b2 = w0.b;
            b.getClass();
            try {
                b.l(b2);
            }
            catch (final RemoteException ex) {
                b.m(new Status(8, (PendingIntent)null, ((Throwable)ex).getLocalizedMessage()));
            }
            catch (final DeadObjectException ex2) {
                b.m(new Status(8, (PendingIntent)null, ((Throwable)ex2).getLocalizedMessage()));
                throw ex2;
            }
        }
        catch (final RuntimeException ex3) {
            this.b(ex3);
        }
    }
    
    public final void d(final s s, final boolean b) {
        final a<? extends c, Object> b2 = this.b;
        s.a.put(b2, b);
        ((BasePendingResult)b2).b(new r(s, b2));
    }
}

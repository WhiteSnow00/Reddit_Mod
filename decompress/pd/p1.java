// 
// Decompiled by Procyon v0.6.0
// 

package pd;

import com.google.android.gms.common.api.internal.BasePendingResult;
import od.a$a;
import com.google.android.gms.common.api.a$e;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import od.c;
import com.google.android.gms.common.api.internal.a;

public final class p1<A extends a<? extends c, Object>> extends s1
{
    public final A b;
    
    public p1(final a b) {
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
        final Status status = new Status(10, (PendingIntent)null, a.r(new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length()), simpleName, ": ", localizedMessage));
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
        ((BasePendingResult)b2).b((a$a)new r(s, b2));
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package re;

import pd.b;
import android.os.RemoteException;
import android.os.DeadObjectException;
import ve.h;
import com.google.android.gms.common.api.a$e;
import od.p;

public final class g extends p<j, String>
{
    public final /* synthetic */ String d;
    
    public g(final String d) {
        this.d = d;
    }
    
    public final void a(final a$e a$e, final h h) throws RemoteException {
        final j j = (j)a$e;
        final String d = this.d;
        synchronized (j) {
            a a;
            try {
                a = (a)((b)j).C();
            }
            catch (final DeadObjectException | IllegalStateException ex) {
                a = null;
            }
            if (a != null) {
                final String b = a.b(d);
                monitorexit(j);
                h.b((Object)b);
                return;
            }
            throw new RemoteException("no service for getListLayoutPackage call");
        }
    }
}

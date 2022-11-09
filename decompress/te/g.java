// 
// Decompiled by Procyon v0.6.0
// 

package te;

import rd.b;
import android.os.RemoteException;
import android.os.DeadObjectException;
import xe.h;
import com.google.android.gms.common.api.a$e;
import qd.p;

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
                a = ((b<a>)j).C();
            }
            catch (final DeadObjectException | IllegalStateException ex) {
                a = null;
            }
            if (a != null) {
                final String a2 = a.a(d);
                monitorexit(j);
                h.b(a2);
                return;
            }
            throw new RemoteException("no service for getListLayoutPackage call");
        }
    }
}

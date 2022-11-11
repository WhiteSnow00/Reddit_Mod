// 
// Decompiled by Procyon v0.6.0
// 

package re;

import android.os.RemoteException;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.a$e;
import je.b;
import od.p;

public final class h extends p<j, String>
{
    public final /* synthetic */ b d;
    
    public h(final b d) {
        this.d = d;
    }
    
    public final void a(final a$e a$e, final ve.h h) throws RemoteException {
        final j j = (j)a$e;
        final b d = this.d;
        synchronized (j) {
            a a;
            try {
                a = (a)((pd.b)j).C();
            }
            catch (final DeadObjectException | IllegalStateException ex) {
                a = null;
            }
            if (a != null) {
                final String h2 = a.h(d.f);
                monitorexit(j);
                h.b((Object)h2);
                return;
            }
            throw new RemoteException("no service for getLicenseDetail call");
        }
    }
}

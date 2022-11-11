// 
// Decompiled by Procyon v0.6.0
// 

package re;

import android.os.RemoteException;
import android.os.DeadObjectException;
import ve.h;
import com.google.android.gms.common.api.a$e;
import java.util.ArrayList;
import je.b;
import java.util.List;
import od.p;

public final class i extends p<j, List<b>>
{
    public final /* synthetic */ List d;
    
    public i(final ArrayList d) {
        this.d = d;
    }
    
    public final void a(final a$e a$e, final h h) throws RemoteException {
        final j j = (j)a$e;
        final List d = this.d;
        synchronized (j) {
            a a;
            try {
                a = (a)((pd.b)j).C();
            }
            catch (final DeadObjectException | IllegalStateException ex) {
                a = null;
            }
            if (a != null) {
                final ArrayList r1 = a.r1(d);
                monitorexit(j);
                h.b((Object)r1);
                return;
            }
            throw new RemoteException("no service for getLicenseList call");
        }
    }
}

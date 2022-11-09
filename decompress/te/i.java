// 
// Decompiled by Procyon v0.6.0
// 

package te;

import android.os.RemoteException;
import android.os.DeadObjectException;
import xe.h;
import com.google.android.gms.common.api.a$e;
import java.util.ArrayList;
import le.b;
import java.util.List;
import qd.p;

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
                a = ((rd.b<a>)j).C();
            }
            catch (final DeadObjectException | IllegalStateException ex) {
                a = null;
            }
            if (a != null) {
                final ArrayList j2 = a.j1(d);
                monitorexit(j);
                h.b(j2);
                return;
            }
            throw new RemoteException("no service for getLicenseList call");
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import android.os.RemoteException;
import xd.a;
import lw0.b;

public final class p1 extends u1
{
    public final /* synthetic */ String j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ z1 l;
    
    public p1(final z1 l, final Object k) {
        this.l = l;
        this.j = "Error with data collection. Data lost.";
        this.k = k;
        super(l, false);
    }
    
    public final void a() throws RemoteException {
        final t0 f = this.l.f;
        b.R((Object)f);
        f.logHealthData(5, this.j, (a)new xd.b(this.k), (a)new xd.b((Object)null), (a)new xd.b((Object)null));
    }
}

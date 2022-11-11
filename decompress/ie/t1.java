// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import android.os.RemoteException;
import xd.a;
import lw0.b;

public final class t1 extends u1
{
    public final /* synthetic */ String j;
    public final /* synthetic */ String k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ z1 n;
    
    public t1(final z1 n, final String l) {
        this.n = n;
        this.j = "fcm";
        this.k = "_ln";
        this.l = l;
        this.m = true;
        super(n, true);
    }
    
    public final void a() throws RemoteException {
        final t0 f = this.n.f;
        b.R((Object)f);
        f.setUserProperty(this.j, this.k, (a)new xd.b(this.l), this.m, super.f);
    }
}

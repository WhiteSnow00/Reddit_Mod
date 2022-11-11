// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import android.os.Bundle;
import android.os.RemoteException;
import lw0.b;

public final class o1 extends u1
{
    public final /* synthetic */ String j;
    public final /* synthetic */ String k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ p0 m;
    public final /* synthetic */ z1 n;
    
    public o1(final z1 n, final String j, final String k, final boolean l, final p0 m) {
        this.n = n;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        super(n, true);
    }
    
    public final void a() throws RemoteException {
        final t0 f = this.n.f;
        b.R((Object)f);
        f.getUserProperties(this.j, this.k, this.l, (w0)this.m);
    }
    
    public final void b() {
        this.m.c((Bundle)null);
    }
}

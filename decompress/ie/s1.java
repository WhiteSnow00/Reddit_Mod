// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import android.os.RemoteException;
import lw0.b;
import android.os.Bundle;

public final class s1 extends u1
{
    public final /* synthetic */ Long j;
    public final /* synthetic */ String k;
    public final /* synthetic */ String l;
    public final /* synthetic */ Bundle m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ z1 p;
    
    public s1(final z1 p5, final String k, final String l, final Bundle m, final boolean n) {
        this.p = p5;
        this.j = null;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = true;
        super(p5, true);
    }
    
    public final void a() throws RemoteException {
        final Long j = this.j;
        long n;
        if (j == null) {
            n = super.f;
        }
        else {
            n = j;
        }
        final t0 f = this.p.f;
        b.R((Object)f);
        f.logEvent(this.k, this.l, this.m, this.n, this.o, n);
    }
}

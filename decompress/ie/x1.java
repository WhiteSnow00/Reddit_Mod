// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import android.os.RemoteException;
import xd.a;
import lw0.b;
import android.app.Activity;

public final class x1 extends u1
{
    public final /* synthetic */ Activity j;
    public final /* synthetic */ p0 k;
    public final /* synthetic */ y1 l;
    
    public x1(final y1 l, final Activity j, final p0 k) {
        this.l = l;
        this.j = j;
        this.k = k;
        super(l.f, true);
    }
    
    public final void a() throws RemoteException {
        final t0 f = this.l.f.f;
        b.R((Object)f);
        f.onActivitySaveInstanceState((a)new xd.b((Object)this.j), (w0)this.k, super.g);
    }
}

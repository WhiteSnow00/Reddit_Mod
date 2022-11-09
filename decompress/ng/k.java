// 
// Decompiled by Procyon v0.6.0
// 

package ng;

import android.os.RemoteException;
import java.util.List;
import ig.b0;
import ig.e;

public final class k extends e
{
    public final /* synthetic */ qg.k g;
    public final /* synthetic */ r h;
    
    public k(final r h, final qg.k k, final qg.k g) {
        this.h = h;
        this.g = g;
        super(k);
    }
    
    public final void a() {
        try {
            final r h = this.h;
            ((b0)h.b.n).R0(h.a, new o((qg.k<List<c>>)this.g));
        }
        catch (final RemoteException ex) {
            r.c.i((Exception)ex, "getSessionStates", new Object[0]);
            this.g.a((Exception)new RuntimeException((Throwable)ex));
        }
    }
}

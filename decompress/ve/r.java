// 
// Decompiled by Procyon v0.6.0
// 

package ve;

import com.android.billingclient.api.i0;
import java.util.concurrent.Executor;

public final class r<TResult> implements t<TResult>
{
    public final Executor a;
    public final Object b;
    public d c;
    
    public r(final Executor a, final d c) {
        this.b = new Object();
        this.a = a;
        this.c = c;
    }
    
    public final void b(final g<TResult> g) {
        if (!g.n() && !g.l()) {
            synchronized (this.b) {
                if (this.c == null) {
                    return;
                }
                monitorexit(this.b);
                this.a.execute((Runnable)new i0((Object)this, (Object)g, 8));
            }
        }
    }
}

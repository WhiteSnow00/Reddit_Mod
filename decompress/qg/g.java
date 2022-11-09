// 
// Decompiled by Procyon v0.6.0
// 

package qg;

import eg.r;
import java.util.concurrent.Executor;

public final class g<ResultT> implements i<ResultT>
{
    public final Executor a;
    public final Object b;
    public final b c;
    
    public g(final Executor a, final b c) {
        this.b = new Object();
        this.a = a;
        this.c = c;
    }
    
    public final void a(final n n) {
        if (!n.d()) {
            synchronized (this.b) {
                if (this.c == null) {
                    return;
                }
                monitorexit(this.b);
                this.a.execute((Runnable)new r(this, n));
            }
        }
    }
}

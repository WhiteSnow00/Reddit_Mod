// 
// Decompiled by Procyon v0.6.0
// 

package we;

import md.m;
import java.util.concurrent.Executor;

public final class q<TResult> implements s<TResult>
{
    public final Executor a;
    public final Object b;
    public c<TResult> c;
    
    public q(final Executor a, final c<TResult> c) {
        this.b = new Object();
        this.a = a;
        this.c = c;
    }
    
    public final void b(final g<TResult> g) {
        synchronized (this.b) {
            if (this.c == null) {
                return;
            }
            monitorexit(this.b);
            this.a.execute((Runnable)new m((Object)this, (Object)g, 5));
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package qg;

import re.l;
import java.util.concurrent.Executor;

public final class h<ResultT> implements i<ResultT>
{
    public final Executor a;
    public final Object b;
    public final c<? super ResultT> c;
    
    public h(final Executor a, final c<? super ResultT> c) {
        this.b = new Object();
        this.a = a;
        this.c = c;
    }
    
    public final void a(final n n) {
        if (n.d()) {
            synchronized (this.b) {
                if (this.c == null) {
                    return;
                }
                monitorexit(this.b);
                this.a.execute((Runnable)new l(4, (Object)this, (Object)n));
            }
        }
    }
}

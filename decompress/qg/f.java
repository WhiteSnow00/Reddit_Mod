// 
// Decompiled by Procyon v0.6.0
// 

package qg;

import com.android.billingclient.api.j0;
import java.util.concurrent.Executor;

public final class f<ResultT> implements i<ResultT>
{
    public final Executor a;
    public final Object b;
    public final a<ResultT> c;
    
    public f(final m a, final a c) {
        this.b = new Object();
        this.a = (Executor)a;
        this.c = (a<ResultT>)c;
    }
    
    public final void a(final n n) {
        synchronized (this.b) {
            if (this.c == null) {
                return;
            }
            monitorexit(this.b);
            this.a.execute(new j0(this, n));
        }
    }
}

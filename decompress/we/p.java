// 
// Decompiled by Procyon v0.6.0
// 

package we;

import com.android.billingclient.api.c0;
import java.util.concurrent.Executor;

public final class p<TResult> implements s<TResult>
{
    public final Executor a;
    public final Object b;
    public b c;
    
    public p(final Executor a, final b c) {
        this.b = new Object();
        this.a = a;
        this.c = c;
    }
    
    public final void b(final g<TResult> g) {
        if (g.l()) {
            synchronized (this.b) {
                if (this.c == null) {
                    return;
                }
                monitorexit(this.b);
                this.a.execute((Runnable)new c0((Object)this, 6));
            }
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package ve;

import com.android.billingclient.api.m0;
import java.util.concurrent.Executor;

public final class n implements t
{
    public final /* synthetic */ int a;
    public final Executor b;
    public final Object c;
    public Object d;
    
    public n(final Executor b, final a c, final x d) {
        this.a = 0;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public n(final Executor b, final c d) {
        this.a = 1;
        this.c = new Object();
        this.b = b;
        this.d = d;
    }
    
    public final void b(final g g) {
        switch (this.a) {
            default: {
                synchronized (this.c) {
                    if (this.d == null) {
                        monitorexit(this.c);
                    }
                    else {
                        monitorexit(this.c);
                        this.b.execute((Runnable)new m0((Object)this, (Object)g, 9));
                    }
                    return;
                }
                break;
            }
            case 0: {
                this.b.execute((Runnable)new m0((Object)this, (Object)g, 8));
            }
        }
    }
}

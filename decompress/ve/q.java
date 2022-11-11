// 
// Decompiled by Procyon v0.6.0
// 

package ve;

import od.h1;
import java.util.concurrent.Executor;

public final class q implements t
{
    public final /* synthetic */ int a;
    public final Executor b;
    public final Object c;
    public Object d;
    
    public q(final Executor b, final b d) {
        this.a = 0;
        this.c = new Object();
        this.b = b;
        this.d = d;
    }
    
    public q(final Executor b, final e d) {
        this.a = 1;
        this.c = new Object();
        this.b = b;
        this.d = d;
    }
    
    public final void b(final g g) {
        switch (this.a) {
            default: {
                if (g.n()) {
                    synchronized (this.c) {
                        if (this.d != null) {
                            monitorexit(this.c);
                            this.b.execute(new h1(this, g, 4));
                        }
                    }
                }
                return;
            }
            case 0: {
                if (g.l()) {
                    synchronized (this.c) {
                        if (this.d != null) {
                            monitorexit(this.c);
                            this.b.execute((Runnable)new p(this));
                        }
                    }
                }
            }
        }
    }
}

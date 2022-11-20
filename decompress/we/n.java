// 
// Decompiled by Procyon v0.6.0
// 

package we;

import b6.i;
import java.util.concurrent.Executor;

public final class n implements s
{
    public final int a;
    public final Executor b;
    public final Object c;
    public Object d;
    
    public n(final Executor b, final a c, final v d) {
        this.a = 0;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public n(final Executor b, final e d) {
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
                            this.b.execute((Runnable)new i((s)this, g, 3));
                        }
                    }
                }
                return;
            }
            case 0: {
                this.b.execute((Runnable)new i((s)this, g, 2));
            }
        }
    }
}

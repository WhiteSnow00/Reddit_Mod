// 
// Decompiled by Procyon v0.6.0
// 

package we;

import md.n;
import java.util.concurrent.Executor;

public final class o implements e, d, b, s
{
    public final int a;
    public final Executor b;
    public final v c;
    public final Object d;
    
    public o(final Executor b, final Object d, final v c, final int a) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public final void a(final Exception ex) {
        switch (this.a) {
            default: {
                this.c.s(ex);
                return;
            }
            case 0: {
                this.c.s(ex);
            }
        }
    }
    
    public final void b(final g g) {
        switch (this.a) {
            default: {
                this.b.execute((Runnable)new n((Object)this, (Object)g, 8));
                return;
            }
            case 0: {
                this.b.execute((Runnable)new n((Object)this, (Object)g, 7));
            }
        }
    }
    
    public final void onCanceled() {
        switch (this.a) {
            default: {
                this.c.u();
                return;
            }
            case 0: {
                this.c.u();
            }
        }
    }
    
    public final void onSuccess(final Object o) {
        switch (this.a) {
            default: {
                this.c.t(o);
                return;
            }
            case 0: {
                this.c.t(o);
            }
        }
    }
}

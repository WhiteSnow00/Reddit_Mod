// 
// Decompiled by Procyon v0.6.0
// 

package m6;

import l6.t;
import d6.b;
import d6.j;

public final class k implements Runnable
{
    public final j f;
    public final b g;
    
    public k(final j f) {
        this.f = f;
        this.g = new b();
    }
    
    @Override
    public final void run() {
        try {
            ((t)this.f.c.x()).o();
            this.g.a((c6.j.a)c6.j.a);
        }
        finally {
            final Throwable t;
            this.g.a((c6.j.a)new c6.j.a.a(t));
        }
    }
}

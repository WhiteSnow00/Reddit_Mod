// 
// Decompiled by Procyon v0.6.0
// 

package xe;

import java.util.Queue;
import java.util.Map;
import au2.b;
import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.HashMap;
import java.util.AbstractCollection;
import au2.a;

public final class u implements a
{
    public boolean f;
    public final Object g;
    public AbstractCollection h;
    
    public u(final int n) {
        if (n != 1) {
            this.g = new Object();
            return;
        }
        this.f = false;
        this.g = new HashMap();
        this.h = new LinkedBlockingQueue();
    }
    
    public final void a(final t t) {
        synchronized (this.g) {
            if (this.h == null) {
                this.h = new ArrayDeque();
            }
            ((Queue)this.h).add(t);
        }
    }
    
    public final void b(final g g) {
        synchronized (this.g) {
            if (this.h != null) {
                if (!this.f) {
                    this.f = true;
                    monitorexit(this.g);
                    while (true) {
                        final Object g2 = this.g;
                        synchronized (this.g) {
                            final t t = (t)((Queue)this.h).poll();
                            if (t == null) {
                                this.f = false;
                                return;
                            }
                            monitorexit(this.g);
                            t.b(g);
                            continue;
                        }
                        break;
                    }
                }
            }
        }
    }
    
    public final b c(final String s) {
        synchronized (this) {
            cu2.b b;
            if ((b = ((Map)this.g).get(s)) == null) {
                b = new cu2.b(s, (LinkedBlockingQueue)this.h, this.f);
                ((Map)this.g).put(s, b);
            }
            return (b)b;
        }
    }
}

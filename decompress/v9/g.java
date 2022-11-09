// 
// Decompiled by Procyon v0.6.0
// 

package v9;

import java.io.IOException;
import java.net.Socket;
import com.danikula.videocache.ProxyCacheException;
import w9.b;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class g
{
    public final AtomicInteger a;
    public final String b;
    public volatile e c;
    public final g.g$a d;
    public final c e;
    
    public g(final String b, final c e) {
        this.a = new AtomicInteger(0);
        final CopyOnWriteArrayList list = new CopyOnWriteArrayList();
        b.getClass();
        this.b = b;
        e.getClass();
        this.e = e;
        this.d = new g.g$a(b, list);
    }
    
    public final e a() throws ProxyCacheException {
        final String b = this.b;
        final c e = this.e;
        final h h = new h(b, e.d, e.e);
        final c e2 = this.e;
        final String b2 = this.b;
        e2.b.getClass();
        final e e3 = new e(h, new b(new File(e2.a, w9.e.c(b2)), this.e.c));
        e3.l = (v9.b)this.d;
        return e3;
    }
    
    public final void b(final d d, final Socket socket) throws ProxyCacheException, IOException {
        synchronized (this) {
            e c;
            if (this.c == null) {
                c = this.a();
            }
            else {
                c = this.c;
            }
            this.c = c;
            monitorexit(this);
            try {
                this.a.incrementAndGet();
                this.c.f(d, socket);
                synchronized (this) {
                    if (this.a.decrementAndGet() <= 0) {
                        ((k)this.c).e();
                        this.c = null;
                    }
                }
            }
            finally {
                synchronized (this) {
                    if (this.a.decrementAndGet() <= 0) {
                        ((k)this.c).e();
                        this.c = null;
                    }
                }
            }
        }
    }
}

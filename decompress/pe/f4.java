// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import java.util.concurrent.FutureTask;
import android.os.Process;
import lw0.b;
import java.util.concurrent.BlockingQueue;

public final class f4 extends Thread
{
    public final Object f;
    public final BlockingQueue g;
    public boolean h;
    public final /* synthetic */ g4 i;
    
    public f4(final g4 i, final String name, final BlockingQueue g) {
        this.i = i;
        this.h = false;
        b.R((Object)g);
        this.f = new Object();
        this.g = g;
        this.setName(name);
    }
    
    public final void a() {
        final Object n = this.i.n;
        monitorenter(n);
        while (true) {
            Label_0062: {
                try {
                    if (this.h) {
                        break Label_0101;
                    }
                    this.i.o.release();
                    this.i.n.notifyAll();
                    final g4 i = this.i;
                    if (this == i.h) {
                        i.h = null;
                        break Label_0062;
                    }
                    break Label_0062;
                }
                finally {
                    monitorexit(n);
                    final g4 i;
                    iftrue(Label_0078:)(this != i.i);
                    i.i = null;
                    break Label_0062;
                    Label_0078: {
                        ((h4)i.f).h().k.a("Current scheduler thread is neither worker nor network");
                    }
                    break Label_0062;
                    monitorexit(n);
                    return;
                    this.h = true;
                    continue;
                }
            }
            break;
        }
    }
    
    public final void b(final InterruptedException ex) {
        ((h4)this.i.f).h().n.b((Object)ex, String.valueOf(this.getName()).concat(" was interrupted"));
    }
    
    @Override
    public final void run() {
        int i = 0;
        while (i == 0) {
            try {
                this.i.o.acquire();
                i = 1;
            }
            catch (final InterruptedException ex) {
                this.b(ex);
            }
        }
        try {
            final int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                final e4 e4 = (e4)this.g.poll();
                if (e4 != null) {
                    int threadPriority2;
                    if (!e4.g) {
                        threadPriority2 = 10;
                    }
                    else {
                        threadPriority2 = threadPriority;
                    }
                    Process.setThreadPriority(threadPriority2);
                    ((FutureTask)e4).run();
                }
                else {
                    final Object f = this.f;
                    monitorenter(f);
                    Label_0137: {
                        try {
                            if (this.g.peek() == null) {
                                this.i.getClass();
                                try {
                                    this.f.wait(30000L);
                                }
                                catch (final InterruptedException ex2) {
                                    this.b(ex2);
                                }
                            }
                            break Label_0137;
                        }
                        finally {
                            monitorexit(f);
                            monitorexit(f);
                            synchronized (this.i.n) {
                                if (this.g.peek() == null) {
                                    this.a();
                                    return;
                                }
                                continue;
                            }
                        }
                    }
                }
            }
        }
        finally {
            this.a();
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package v9;

import com.danikula.videocache.ProxyCacheException;
import com.danikula.videocache.InterruptedProxyCacheException;
import au2.c;
import java.util.concurrent.atomic.AtomicInteger;
import au2.b;

public class k
{
    public static final b i;
    public final m a;
    public final v9.a b;
    public final Object c;
    public final Object d;
    public final AtomicInteger e;
    public volatile Thread f;
    public volatile boolean g;
    public volatile int h;
    
    static {
        i = c.b("ProxyCache");
    }
    
    public k(final m a, final v9.a b) {
        this.c = new Object();
        this.d = new Object();
        this.h = -1;
        this.a = a;
        this.b = b;
        this.e = new AtomicInteger();
    }
    
    public static void d(final Throwable t) {
        if (t instanceof InterruptedProxyCacheException) {
            k.i.debug("ProxyCache is interrupted");
        }
        else {
            k.i.error("ProxyCache error", t);
        }
    }
    
    public final void a() {
        try {
            this.a.close();
        }
        catch (final ProxyCacheException ex) {
            final StringBuilder k = a.k("Error closing source ");
            k.append(this.a);
            d((Throwable)new ProxyCacheException(k.toString(), (Throwable)ex));
        }
    }
    
    public final void b(final long n, final long n2) {
        final long n3 = lcmp(n2, 0L);
        boolean b = true;
        int h;
        if (n3 == 0) {
            h = 100;
        }
        else {
            h = (int)(n / (float)n2 * 100.0f);
        }
        final boolean b2 = h != this.h;
        if (n3 < 0) {
            b = false;
        }
        if (b && b2) {
            this.c(h);
        }
        this.h = h;
        synchronized (this.c) {
            this.c.notifyAll();
        }
    }
    
    public void c(final int n) {
        throw null;
    }
    
    public final void e() {
        synchronized (this.d) {
            final b i = k.i;
            final StringBuilder sb = new StringBuilder();
            sb.append("Shutdown proxy for ");
            sb.append(this.a);
            i.debug(sb.toString());
            try {
                this.g = true;
                if (this.f != null) {
                    this.f.interrupt();
                }
                this.b.close();
            }
            catch (final ProxyCacheException ex) {
                d((Throwable)ex);
            }
        }
    }
    
    public final class a implements Runnable
    {
        @Override
        public final void run() {
            final k f = k.this;
            f.getClass();
            final long n = -1L;
            long n2 = 0L;
            long length = n;
            final Throwable t2;
            try {
                long available = f.b.available();
                length = n;
                n2 = available;
                f.a.a(available);
                length = n;
                n2 = available;
                final long n3 = length = f.a.length();
                n2 = available;
                final byte[] array = new byte[8192];
                int n4 = 0;
            Block_11_Outer:
                while (true) {
                    length = n3;
                    n2 = available;
                    final int read = f.a.read(array);
                    n4 = 0;
                    boolean b = false;
                    if (read != -1) {
                        length = n3;
                        n2 = available;
                        final Object d = f.d;
                        length = n3;
                        n2 = available;
                        monitorenter(d);
                        Label_0159: {
                            try {
                                if (!Thread.currentThread().isInterrupted() && !f.g) {
                                    break Label_0159;
                                }
                                break Label_0159;
                            }
                            finally {
                                monitorexit(d);
                                length = n3;
                                n2 = available;
                                b = true;
                                break Label_0159;
                                while (true) {
                                    monitorexit(d);
                                    length = n3;
                                    n2 = available;
                                    return;
                                    iftrue(Label_0180:)(!b);
                                    continue;
                                }
                                Label_0180: {
                                    f.b.b(read, array);
                                }
                                monitorexit(d);
                                available += read;
                                length = n3;
                                n2 = available;
                                f.b(available, n3);
                                continue Block_11_Outer;
                            }
                        }
                        break;
                    }
                    break;
                }
                length = n3;
                n2 = available;
                final Object d2 = f.d;
                length = n3;
                n2 = available;
                monitorenter(d2);
                Label_0285: {
                    while (true) {
                        try {
                            if (Thread.currentThread().isInterrupted()) {
                                break Label_0285;
                            }
                            final int n5 = n4;
                            if (f.g) {
                                break Label_0285;
                            }
                            break Label_0288;
                        }
                        finally {
                            monitorexit(d2);
                            length = n3;
                            n2 = available;
                            final int n5;
                            iftrue(Label_0324:)(n5 != 0 || f.b.available() != f.a.length());
                            Block_17: {
                                break Block_17;
                                Label_0324: {
                                    monitorexit(d2);
                                }
                                length = n3;
                                n2 = available;
                                f.h = 100;
                                length = n3;
                                n2 = available;
                                f.c(f.h);
                                length = n3;
                                n2 = available;
                                return;
                                n5 = 1;
                                continue;
                            }
                            f.b.complete();
                        }
                        break;
                    }
                }
            }
            finally {
                final k k = f;
                final AtomicInteger atomicInteger = k.e;
                atomicInteger.incrementAndGet();
                final Throwable t = t2;
                v9.k.d(t);
            }
            try {
                final k k = f;
                final AtomicInteger atomicInteger = k.e;
                atomicInteger.incrementAndGet();
                final Throwable t = t2;
                v9.k.d(t);
            }
            finally {
                f.a();
                f.b(n2, length);
            }
        }
    }
}

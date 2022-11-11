// 
// Decompiled by Procyon v0.6.0
// 

package od;

import java.util.concurrent.locks.Lock;
import mc2.a;

public abstract class g0 implements Runnable
{
    public final /* synthetic */ int f;
    public final Object g;
    
    public g0(final String s, final Object[] array) {
        this.f = 1;
        this.g = a.l(s, array);
    }
    
    public abstract void a();
    
    public abstract void b();
    
    @Override
    public final void run() {
        switch (this.f) {
            default: {
                final String name = Thread.currentThread().getName();
                Thread.currentThread().setName((String)this.g);
                try {
                    this.a();
                    return;
                }
                finally {
                    Thread.currentThread().setName(name);
                }
                break;
            }
            case 0: {
                ((h0)this.g).b.lock();
                Lock b3 = null;
                try {
                    try {
                        if (Thread.interrupted()) {
                            final Lock b = ((h0)this.g).b;
                        }
                        this.b();
                        final Lock b2 = ((h0)this.g).b;
                    }
                    finally {}
                }
                catch (final RuntimeException ex) {
                    final p0 a = ((h0)this.g).a;
                    a.e.sendMessage(a.e.obtainMessage(2, (Object)ex));
                    b3 = ((h0)this.g).b;
                }
                b3.unlock();
                return;
                ((h0)this.g).b.unlock();
                break;
            }
        }
    }
}

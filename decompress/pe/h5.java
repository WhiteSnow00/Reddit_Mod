// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import z0.d1;
import java.util.concurrent.atomic.AtomicReference;

public final class h5 implements Runnable
{
    public final /* synthetic */ int f;
    public final /* synthetic */ AtomicReference g;
    public final /* synthetic */ o5 h;
    
    @Override
    public final void run() {
        switch (this.f) {
            case 0: {
                final AtomicReference g = this.g;
                monitorenter(g);
                try {
                    final AtomicReference g2 = this.g;
                    final Object f = ((d1)this.h).f;
                    g2.set(((h4)f).l.V(((h4)f).o().R(), r2.K));
                    return;
                }
                finally {
                    this.g.notify();
                }
                try {
                    return;
                }
                finally {
                    monitorexit(g);
                }
                break;
            }
        }
        final AtomicReference g3 = this.g;
        monitorenter(g3);
        try {
            final AtomicReference g4 = this.g;
            final Object f2 = ((d1)this.h).f;
            g4.set(((h4)f2).l.Q(((h4)f2).o().R(), r2.N));
            return;
        }
        finally {
            this.g.notify();
        }
        try {}
        finally {
            monitorexit(g3);
        }
    }
}

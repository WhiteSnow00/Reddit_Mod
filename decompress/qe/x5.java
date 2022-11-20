// 
// Decompiled by Procyon v0.6.0
// 

package qe;

import cg.j;
import android.os.RemoteException;
import mg.d0;

public final class x5 implements Runnable
{
    public final int f;
    public final l7 g;
    public final g6 h;
    
    public x5(final g6 h, final l7 g, final int f) {
        this.f = f;
        this.h = h;
        this.g = g;
    }
    
    @Override
    public final void run() {
        switch (this.f) {
            default: {
                final g6 h = this.h;
                final y2 k = h.k;
                if (k == null) {
                    ((j4)((j)h).g).c().m.a("Failed to send consent settings to service");
                }
                else {
                    try {
                        d0.y((Object)this.g);
                        k.E0(this.g);
                        this.h.D();
                    }
                    catch (final RemoteException ex) {
                        ((j4)((j)this.h).g).c().m.b((Object)ex, "Failed to send consent settings to the service");
                    }
                }
                return;
            }
            case 0: {
                final g6 h2 = this.h;
                final y2 i = h2.k;
                if (i == null) {
                    ((j4)((j)h2).g).c().m.a("Failed to reset data on the service: not connected to service");
                }
                else {
                    try {
                        d0.y((Object)this.g);
                        i.b1(this.g);
                    }
                    catch (final RemoteException ex2) {
                        ((j4)((j)this.h).g).c().m.b((Object)ex2, "Failed to reset data on the service: remote exception");
                    }
                    this.h.D();
                }
            }
        }
    }
}

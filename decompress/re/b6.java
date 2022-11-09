// 
// Decompiled by Procyon v0.6.0
// 

package re;

import u5.w;
import android.os.RemoteException;
import yd.a;

public final class b6 implements Runnable
{
    public final /* synthetic */ int f;
    public final /* synthetic */ q7 g;
    public final /* synthetic */ l6 h;
    
    @Override
    public final void run() {
        switch (this.f) {
            default: {
                final l6 h = this.h;
                final t2 i = h.i;
                if (i == null) {
                    ((h4)((w)h).f).f().k.a("Failed to send measurementEnabled to service");
                }
                else {
                    try {
                        a.S0((Object)this.g);
                        i.k1(this.g);
                        this.h.J();
                    }
                    catch (final RemoteException ex) {
                        ((h4)((w)this.h).f).f().k.b(ex, "Failed to send measurementEnabled to the service");
                    }
                }
                return;
            }
            case 0: {
                final l6 h2 = this.h;
                final t2 j = h2.i;
                if (j == null) {
                    ((h4)((w)h2).f).f().k.a("Discarding data. Failed to send app launch");
                }
                else {
                    try {
                        a.S0((Object)this.g);
                        j.A(this.g);
                        ((h4)((w)this.h).f).p().E();
                        this.h.C(j, (sd.a)null, this.g);
                        this.h.J();
                    }
                    catch (final RemoteException ex2) {
                        ((h4)((w)this.h).f).f().k.b(ex2, "Failed to send app launch to the service");
                    }
                }
            }
        }
    }
}

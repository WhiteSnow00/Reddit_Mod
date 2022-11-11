// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import com.google.android.gms.measurement.internal.zzah;
import lw0.b;

public final class o4 implements Runnable
{
    public final /* synthetic */ int f;
    public final /* synthetic */ q7 g;
    public final /* synthetic */ u4 h;
    
    @Override
    public final void run() {
        switch (this.f) {
            default: {
                this.h.a.a();
                this.h.a.k(this.g);
                return;
            }
            case 0: {
                this.h.a.a();
                final g7 a = this.h.a;
                final q7 g = this.g;
                a.b().M();
                a.c();
                b.O(g.f);
                final g b = pe.g.b(g.A);
                final g k = a.K(g.f);
                a.h().s.c((Object)g.f, "Setting consent, package, consent", (Object)b);
                a.q(g.f, b);
                if (b.g(k, (zzah[])b.a.keySet().toArray(new zzah[0]))) {
                    a.o(g);
                }
            }
        }
    }
}

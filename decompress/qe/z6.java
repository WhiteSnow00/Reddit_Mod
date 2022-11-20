// 
// Decompiled by Procyon v0.6.0
// 

package qe;

import com.google.android.gms.measurement.internal.zzah;
import mg.d0;
import je.g8;
import java.util.concurrent.Callable;

public final class z6 implements Callable
{
    public final int f;
    public final Object g;
    public final Object h;
    
    public z6(final c7 h, final l7 g) {
        this.f = 0;
        this.h = h;
        this.g = g;
    }
    
    public z6(final d4 g, final String h) {
        this.f = 1;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final Object call() {
        switch (this.f) {
            default: {
                return new g8(new a4((d4)this.g, (String)this.h));
            }
            case 0: {
                final c7 c7 = (c7)this.h;
                final String f = ((l7)this.g).f;
                d0.y((Object)f);
                final g k = c7.K(f);
                final zzah zzb = zzah.zzb;
                String w;
                if (k.f(zzb) && qe.g.b(((l7)this.g).A).f(zzb)) {
                    w = ((c7)this.h).I((l7)this.g).w();
                }
                else {
                    ((c7)this.h).c().u.a("Analytics storage consent denied. Returning null app instance id");
                    w = null;
                }
                return w;
            }
        }
    }
}

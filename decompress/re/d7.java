// 
// Decompiled by Procyon v0.6.0
// 

package re;

import com.google.android.gms.measurement.internal.zzah;
import yd.a;
import java.util.concurrent.Callable;

public final class d7 implements Callable
{
    public final /* synthetic */ q7 f;
    public final /* synthetic */ g7 g;
    
    public d7(final g7 g, final q7 f) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final Object call() throws Exception {
        final g7 g = this.g;
        final String f = this.f.f;
        a.S0((Object)f);
        final g k = g.K(f);
        final zzah zzb = zzah.zzb;
        String w;
        if (k.f(zzb) && re.g.b(this.f.A).f(zzb)) {
            w = this.g.I(this.f).w();
        }
        else {
            this.g.f().s.a("Analytics storage consent denied. Returning null app instance id");
            w = null;
        }
        return w;
    }
}

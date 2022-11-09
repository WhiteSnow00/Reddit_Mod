// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import com.google.android.gms.internal.measurement.b;
import java.util.List;

public final class v3 extends c6 implements a7
{
    private static final v3 zza;
    private int zze;
    private int zzf;
    private g6 zzg;
    
    static {
        c6.m(v3.class, zza = new v3());
    }
    
    public v3() {
        this.zzg = (g6)q6.i;
    }
    
    public static u3 u() {
        return (u3)v3.zza.n();
    }
    
    public static void y(final v3 v3, final List list) {
        final g6 zzg = v3.zzg;
        if (!((d5)zzg).f) {
            v3.zzg = (g6)c6.j(zzg);
        }
        b.g((Iterable)list, (h6)v3.zzg);
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new j7((c6)v3.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u0014", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new v3();
        }
        if (n == 4) {
            return new u3(0);
        }
        if (n != 5) {
            return null;
        }
        return v3.zza;
    }
    
    public final int r() {
        return ((q6)this.zzg).h;
    }
    
    public final int s() {
        return this.zzf;
    }
    
    public final long t(final int n) {
        final q6 q6 = (q6)this.zzg;
        q6.d(n);
        return q6.g[n];
    }
    
    public final List w() {
        return (List)this.zzg;
    }
    
    public final boolean z() {
        return (this.zze & 0x1) != 0x0;
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import com.google.android.gms.internal.measurement.b;
import java.util.List;

public final class x3 extends e6 implements c7
{
    private static final x3 zza;
    private int zze;
    private int zzf;
    private i6 zzg;
    
    static {
        e6.m(x3.class, zza = new x3());
    }
    
    public x3() {
        this.zzg = (i6)s6.i;
    }
    
    public static w3 u() {
        return (w3)x3.zza.n();
    }
    
    public static void y(final x3 x3, final List list) {
        final i6 zzg = x3.zzg;
        if (!((f5)zzg).f) {
            x3.zzg = (i6)e6.j(zzg);
        }
        b.g((Iterable)list, (j6)x3.zzg);
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new l7((e6)x3.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u0014", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new x3();
        }
        if (n == 4) {
            return new w3(0);
        }
        if (n != 5) {
            return null;
        }
        return x3.zza;
    }
    
    public final int r() {
        return ((s6)this.zzg).h;
    }
    
    public final int s() {
        return this.zzf;
    }
    
    public final long t(final int n) {
        final s6 s6 = (s6)this.zzg;
        s6.d(n);
        return s6.g[n];
    }
    
    public final List w() {
        return (List)this.zzg;
    }
    
    public final boolean z() {
        return (this.zze & 0x1) != 0x0;
    }
}

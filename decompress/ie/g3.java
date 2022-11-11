// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.util.List;
import com.google.android.gms.internal.measurement.b;

public final class g3 extends e6 implements c7
{
    private static final g3 zza;
    private int zze;
    private j6 zzf;
    private String zzg;
    private long zzh;
    private long zzi;
    private int zzj;
    
    static {
        e6.m(g3.class, zza = new g3());
    }
    
    public g3() {
        this.zzf = (j6)k7.i;
        this.zzg = "";
    }
    
    public static void D(final g3 g3) {
        g3.zzf = (j6)k7.i;
    }
    
    public static f3 v() {
        return (f3)g3.zza.n();
    }
    
    public final boolean I() {
        return (this.zze & 0x8) != 0x0;
    }
    
    public final boolean J() {
        return (this.zze & 0x4) != 0x0;
    }
    
    public final boolean K() {
        return (this.zze & 0x2) != 0x0;
    }
    
    public final void L() {
        final j6 zzf = this.zzf;
        if (!zzf.s()) {
            this.zzf = e6.k(zzf);
        }
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new l7((e6)g3.zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002\u1008\u0000\u0003\u1002\u0001\u0004\u1002\u0002\u0005\u1004\u0003", new Object[] { "zze", "zzf", k3.class, "zzg", "zzh", "zzi", "zzj" });
        }
        if (n == 3) {
            return new g3();
        }
        if (n == 4) {
            return new f3(0);
        }
        if (n != 5) {
            return null;
        }
        return g3.zza;
    }
    
    public final int r() {
        return this.zzj;
    }
    
    public final int s() {
        return ((List)this.zzf).size();
    }
    
    public final long t() {
        return this.zzi;
    }
    
    public final long u() {
        return this.zzh;
    }
    
    public final k3 x(final int n) {
        return ((List<k3>)this.zzf).get(n);
    }
    
    public final String y() {
        return this.zzg;
    }
    
    public final j6 z() {
        return this.zzf;
    }
}

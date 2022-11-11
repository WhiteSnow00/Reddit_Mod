// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.util.List;
import com.google.android.gms.internal.measurement.b;
import java.util.ArrayList;

public final class k3 extends e6 implements c7
{
    private static final k3 zza;
    private int zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private float zzi;
    private double zzj;
    private j6 zzk;
    
    static {
        e6.m(k3.class, zza = new k3());
    }
    
    public k3() {
        this.zzf = "";
        this.zzg = "";
        this.zzk = (j6)k7.i;
    }
    
    public static void H(final k3 k3, final k3 k4) {
        final j6 zzk = k3.zzk;
        if (!zzk.s()) {
            k3.zzk = e6.k(zzk);
        }
        ((List<k3>)k3.zzk).add(k4);
    }
    
    public static void I(final k3 k3, final ArrayList list) {
        final j6 zzk = k3.zzk;
        if (!zzk.s()) {
            k3.zzk = e6.k(zzk);
        }
        b.g((Iterable)list, k3.zzk);
    }
    
    public static void J(final k3 k3) {
        k3.zzk = (j6)k7.i;
    }
    
    public static j3 v() {
        return (j3)k3.zza.n();
    }
    
    public final boolean K() {
        return (this.zze & 0x10) != 0x0;
    }
    
    public final boolean L() {
        return (this.zze & 0x8) != 0x0;
    }
    
    public final boolean M() {
        return (this.zze & 0x4) != 0x0;
    }
    
    public final boolean N() {
        return (this.zze & 0x1) != 0x0;
    }
    
    public final boolean O() {
        return (this.zze & 0x2) != 0x0;
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new l7((e6)k3.zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1002\u0002\u0004\u1001\u0003\u0005\u1000\u0004\u0006\u001b", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", k3.class });
        }
        if (n == 3) {
            return new k3();
        }
        if (n == 4) {
            return new j3(0);
        }
        if (n != 5) {
            return null;
        }
        return k3.zza;
    }
    
    public final double r() {
        return this.zzj;
    }
    
    public final float s() {
        return this.zzi;
    }
    
    public final int t() {
        return ((List)this.zzk).size();
    }
    
    public final long u() {
        return this.zzh;
    }
    
    public final String x() {
        return this.zzf;
    }
    
    public final String y() {
        return this.zzg;
    }
    
    public final j6 z() {
        return this.zzk;
    }
}

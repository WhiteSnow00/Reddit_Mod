// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import com.google.android.gms.internal.measurement.b;
import java.util.ArrayList;

public final class i3 extends c6 implements a7
{
    private static final i3 zza;
    private int zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private float zzi;
    private double zzj;
    private h6 zzk;
    
    static {
        c6.m(i3.class, zza = new i3());
    }
    
    public i3() {
        this.zzf = "";
        this.zzg = "";
        this.zzk = (h6)i7.i;
    }
    
    public static void H(final i3 i3, final i3 i4) {
        final h6 zzk = i3.zzk;
        if (!zzk.s()) {
            i3.zzk = c6.k(zzk);
        }
        i3.zzk.add(i4);
    }
    
    public static void I(final i3 i3, final ArrayList list) {
        final h6 zzk = i3.zzk;
        if (!zzk.s()) {
            i3.zzk = c6.k(zzk);
        }
        b.g((Iterable)list, i3.zzk);
    }
    
    public static void J(final i3 i3) {
        i3.zzk = (h6)i7.i;
    }
    
    public static h3 v() {
        return (h3)i3.zza.n();
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
            return new j7((c6)i3.zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1002\u0002\u0004\u1001\u0003\u0005\u1000\u0004\u0006\u001b", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", i3.class });
        }
        if (n == 3) {
            return new i3();
        }
        if (n == 4) {
            return new h3(0);
        }
        if (n != 5) {
            return null;
        }
        return i3.zza;
    }
    
    public final double r() {
        return this.zzj;
    }
    
    public final float s() {
        return this.zzi;
    }
    
    public final int t() {
        return this.zzk.size();
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
    
    public final h6 z() {
        return this.zzk;
    }
}

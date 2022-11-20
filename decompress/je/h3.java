// 
// Decompiled by Procyon v0.6.0
// 

package je;

import java.util.List;
import com.google.android.gms.internal.measurement.b;
import java.util.ArrayList;

public final class h3 extends c6 implements a7
{
    private static final h3 zza;
    private int zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private float zzi;
    private double zzj;
    private h6 zzk;
    
    static {
        c6.m((Class)h3.class, (c6)(zza = new h3()));
    }
    
    public h3() {
        this.zzf = "";
        this.zzg = "";
        this.zzk = (h6)i7.i;
    }
    
    public static void A(final h3 h3, final String zzf) {
        zzf.getClass();
        h3.zze |= 0x1;
        h3.zzf = zzf;
    }
    
    public static void B(final h3 h3, final String zzg) {
        zzg.getClass();
        h3.zze |= 0x2;
        h3.zzg = zzg;
    }
    
    public static void C(final h3 h3) {
        h3.zze &= 0xFFFFFFFD;
        h3.zzg = h3.zza.zzg;
    }
    
    public static void D(final h3 h3, final long zzh) {
        h3.zze |= 0x4;
        h3.zzh = zzh;
    }
    
    public static void E(final h3 h3) {
        h3.zze &= 0xFFFFFFFB;
        h3.zzh = 0L;
    }
    
    public static void F(final h3 h3, final double zzj) {
        h3.zze |= 0x10;
        h3.zzj = zzj;
    }
    
    public static void G(final h3 h3) {
        h3.zze &= 0xFFFFFFEF;
        h3.zzj = 0.0;
    }
    
    public static void H(final h3 h3, final h3 h4) {
        final h6 zzk = h3.zzk;
        if (!zzk.s()) {
            h3.zzk = c6.k(zzk);
        }
        ((List<h3>)h3.zzk).add(h4);
    }
    
    public static void I(final h3 h3, final ArrayList list) {
        final h6 zzk = h3.zzk;
        if (!zzk.s()) {
            h3.zzk = c6.k(zzk);
        }
        b.g((Iterable)list, h3.zzk);
    }
    
    public static void J(final h3 h3) {
        h3.zzk = (h6)i7.i;
    }
    
    public static g3 v() {
        return (g3)h3.zza.n();
    }
    
    public static h3 w() {
        return h3.zza;
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
    
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new j7((c6)h3.zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1002\u0002\u0004\u1001\u0003\u0005\u1000\u0004\u0006\u001b", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", h3.class });
        }
        if (n == 3) {
            return new h3();
        }
        if (n == 4) {
            return new g3(0);
        }
        if (n != 5) {
            return null;
        }
        return h3.zza;
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
    
    public final h6 z() {
        return this.zzk;
    }
}

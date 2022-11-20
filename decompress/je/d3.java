// 
// Decompiled by Procyon v0.6.0
// 

package je;

import java.util.List;
import com.google.android.gms.internal.measurement.b;

public final class d3 extends c6 implements a7
{
    private static final d3 zza;
    private int zze;
    private h6 zzf;
    private String zzg;
    private long zzh;
    private long zzi;
    private int zzj;
    
    static {
        c6.m((Class)d3.class, (c6)(zza = new d3()));
    }
    
    public d3() {
        this.zzf = (h6)i7.i;
        this.zzg = "";
    }
    
    public static void A(final d3 d3, final int n, final h3 h3) {
        d3.L();
        ((List<h3>)d3.zzf).set(n, h3);
    }
    
    public static void B(final d3 d3, final h3 h3) {
        d3.L();
        ((List<h3>)d3.zzf).add(h3);
    }
    
    public static void C(final d3 d3, final Iterable iterable) {
        d3.L();
        b.g(iterable, d3.zzf);
    }
    
    public static void D(final d3 d3) {
        d3.zzf = (h6)i7.i;
    }
    
    public static void E(final d3 d3, final int n) {
        d3.L();
        ((List<Object>)d3.zzf).remove(n);
    }
    
    public static void F(final d3 d3, final String zzg) {
        zzg.getClass();
        d3.zze |= 0x1;
        d3.zzg = zzg;
    }
    
    public static void G(final long zzh, final d3 d3) {
        d3.zze |= 0x2;
        d3.zzh = zzh;
    }
    
    public static void H(final long zzi, final d3 d3) {
        d3.zze |= 0x4;
        d3.zzi = zzi;
    }
    
    public static c3 v() {
        return (c3)d3.zza.n();
    }
    
    public static d3 w() {
        return d3.zza;
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
        final h6 zzf = this.zzf;
        if (!zzf.s()) {
            this.zzf = c6.k(zzf);
        }
    }
    
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new j7((c6)d3.zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002\u1008\u0000\u0003\u1002\u0001\u0004\u1002\u0002\u0005\u1004\u0003", new Object[] { "zze", "zzf", h3.class, "zzg", "zzh", "zzi", "zzj" });
        }
        if (n == 3) {
            return new d3();
        }
        if (n == 4) {
            return new c3(0);
        }
        if (n != 5) {
            return null;
        }
        return d3.zza;
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
    
    public final h3 x(final int n) {
        return ((List<h3>)this.zzf).get(n);
    }
    
    public final String y() {
        return this.zzg;
    }
    
    public final h6 z() {
        return this.zzf;
    }
}

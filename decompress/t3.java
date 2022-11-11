// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import java.util.ArrayList;
import com.google.android.gms.internal.measurement.b;
import java.util.List;

public final class t3 extends c6 implements a7
{
    private static final t3 zza;
    private g6 zze;
    private g6 zzf;
    private h6 zzg;
    private h6 zzh;
    
    static {
        c6.m(t3.class, zza = new t3());
    }
    
    public t3() {
        final q6 i = q6.i;
        this.zze = (g6)i;
        this.zzf = (g6)i;
        final i7 j = i7.i;
        this.zzg = (h6)j;
        this.zzh = (h6)j;
    }
    
    public static void E(final t3 t3, final List list) {
        final g6 zze = t3.zze;
        if (!((d5)zze).f) {
            t3.zze = (g6)c6.j(zze);
        }
        b.g((Iterable)list, (h6)t3.zze);
    }
    
    public static void F(final t3 t3) {
        t3.zze = (g6)q6.i;
    }
    
    public static void G(final t3 t3, final List list) {
        final g6 zzf = t3.zzf;
        if (!((d5)zzf).f) {
            t3.zzf = (g6)c6.j(zzf);
        }
        b.g((Iterable)list, (h6)t3.zzf);
    }
    
    public static void H(final t3 t3) {
        t3.zzf = (g6)q6.i;
    }
    
    public static void J(final t3 t3) {
        t3.zzg = (h6)i7.i;
    }
    
    public static void L(final t3 t3, final List list) {
        final h6 zzh = t3.zzh;
        if (!zzh.s()) {
            t3.zzh = c6.k(zzh);
        }
        b.g((Iterable)list, t3.zzh);
    }
    
    public static void M(final t3 t3) {
        t3.zzh = (h6)i7.i;
    }
    
    public static void N(final t3 t3, final int n) {
        final h6 zzh = t3.zzh;
        if (!zzh.s()) {
            t3.zzh = c6.k(zzh);
        }
        t3.zzh.remove(n);
    }
    
    public static s3 w() {
        return (s3)t3.zza.n();
    }
    
    public static t3 y() {
        return t3.zza;
    }
    
    public final h6 A() {
        return this.zzg;
    }
    
    public final List B() {
        return (List)this.zzf;
    }
    
    public final h6 C() {
        return this.zzh;
    }
    
    public final List D() {
        return (List)this.zze;
    }
    
    public final void O() {
        final h6 zzg = this.zzg;
        if (!zzg.s()) {
            this.zzg = c6.k(zzg);
        }
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new j7((c6)t3.zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[] { "zze", "zzf", "zzg", c3.class, "zzh", v3.class });
        }
        if (n == 3) {
            return new t3();
        }
        if (n == 4) {
            return new s3(0);
        }
        if (n != 5) {
            return null;
        }
        return t3.zza;
    }
    
    public final int r() {
        return this.zzg.size();
    }
    
    public final int s() {
        return ((q6)this.zzf).h;
    }
    
    public final int t() {
        return this.zzh.size();
    }
    
    public final int u() {
        return ((q6)this.zze).h;
    }
    
    public final c3 v(final int n) {
        return this.zzg.get(n);
    }
    
    public final v3 z(final int n) {
        return this.zzh.get(n);
    }
}

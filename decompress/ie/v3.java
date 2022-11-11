// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.util.ArrayList;
import com.google.android.gms.internal.measurement.b;
import java.util.List;

public final class v3 extends e6 implements c7
{
    private static final v3 zza;
    private i6 zze;
    private i6 zzf;
    private j6 zzg;
    private j6 zzh;
    
    static {
        e6.m(v3.class, zza = new v3());
    }
    
    public v3() {
        final s6 i = s6.i;
        this.zze = (i6)i;
        this.zzf = (i6)i;
        final k7 j = k7.i;
        this.zzg = (j6)j;
        this.zzh = (j6)j;
    }
    
    public static void E(final v3 v3, final List list) {
        final i6 zze = v3.zze;
        if (!((f5)zze).f) {
            v3.zze = (i6)e6.j(zze);
        }
        b.g((Iterable)list, (j6)v3.zze);
    }
    
    public static void F(final v3 v3) {
        v3.zze = (i6)s6.i;
    }
    
    public static void G(final v3 v3, final List list) {
        final i6 zzf = v3.zzf;
        if (!((f5)zzf).f) {
            v3.zzf = (i6)e6.j(zzf);
        }
        b.g((Iterable)list, (j6)v3.zzf);
    }
    
    public static void H(final v3 v3) {
        v3.zzf = (i6)s6.i;
    }
    
    public static void J(final v3 v3) {
        v3.zzg = (j6)k7.i;
    }
    
    public static void L(final v3 v3, final List list) {
        final j6 zzh = v3.zzh;
        if (!zzh.s()) {
            v3.zzh = e6.k(zzh);
        }
        b.g((Iterable)list, v3.zzh);
    }
    
    public static void M(final v3 v3) {
        v3.zzh = (j6)k7.i;
    }
    
    public static void N(final v3 v3, final int n) {
        final j6 zzh = v3.zzh;
        if (!zzh.s()) {
            v3.zzh = e6.k(zzh);
        }
        ((List<Object>)v3.zzh).remove(n);
    }
    
    public static u3 w() {
        return (u3)v3.zza.n();
    }
    
    public static v3 y() {
        return v3.zza;
    }
    
    public final j6 A() {
        return this.zzg;
    }
    
    public final List B() {
        return (List)this.zzf;
    }
    
    public final j6 C() {
        return this.zzh;
    }
    
    public final List D() {
        return (List)this.zze;
    }
    
    public final void O() {
        final j6 zzg = this.zzg;
        if (!zzg.s()) {
            this.zzg = e6.k(zzg);
        }
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new l7((e6)v3.zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[] { "zze", "zzf", "zzg", e3.class, "zzh", x3.class });
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
        return ((List)this.zzg).size();
    }
    
    public final int s() {
        return ((s6)this.zzf).h;
    }
    
    public final int t() {
        return ((List)this.zzh).size();
    }
    
    public final int u() {
        return ((s6)this.zze).h;
    }
    
    public final e3 v(final int n) {
        return ((List<e3>)this.zzg).get(n);
    }
    
    public final x3 z(final int n) {
        return ((List<x3>)this.zzh).get(n);
    }
}

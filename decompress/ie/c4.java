// 
// Decompiled by Procyon v0.6.0
// 

package ie;

public final class c4 extends e6 implements c7
{
    private static final c4 zza;
    private int zze;
    private j6 zzf;
    private a4 zzg;
    
    static {
        e6.m(c4.class, zza = new c4());
    }
    
    public c4() {
        this.zzf = (j6)k7.i;
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new l7((e6)c4.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1009\u0000", new Object[] { "zze", "zzf", e4.class, "zzg" });
        }
        if (n == 3) {
            return new c4();
        }
        if (n == 4) {
            return new z2(0);
        }
        if (n != 5) {
            return null;
        }
        return c4.zza;
    }
    
    public final a4 r() {
        a4 a4;
        if ((a4 = this.zzg) == null) {
            a4 = ie.a4.t();
        }
        return a4;
    }
    
    public final j6 t() {
        return this.zzf;
    }
}

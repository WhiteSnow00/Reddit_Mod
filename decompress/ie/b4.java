// 
// Decompiled by Procyon v0.6.0
// 

package ie;

public final class b4 extends e6 implements c7
{
    private static final b4 zza;
    private int zze;
    private String zzf;
    private j6 zzg;
    
    static {
        e6.m(b4.class, zza = new b4());
    }
    
    public b4() {
        this.zzf = "";
        this.zzg = (j6)k7.i;
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new l7((e6)b4.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b", new Object[] { "zze", "zzf", "zzg", e4.class });
        }
        if (n == 3) {
            return new b4();
        }
        if (n == 4) {
            return new l2(0);
        }
        if (n != 5) {
            return null;
        }
        return b4.zza;
    }
    
    public final String s() {
        return this.zzf;
    }
    
    public final j6 t() {
        return this.zzg;
    }
}

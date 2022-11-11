// 
// Decompiled by Procyon v0.6.0
// 

package ke;

public final class r3 extends c6 implements a7
{
    private static final r3 zza;
    private int zze;
    private int zzf;
    private h6 zzg;
    
    static {
        c6.m(r3.class, zza = new r3());
    }
    
    public r3() {
        this.zzf = 1;
        this.zzg = (h6)i7.i;
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new j7((c6)r3.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u001b", new Object[] { "zze", "zzf", q3.a, "zzg", g3.class });
        }
        if (n == 3) {
            return new r3();
        }
        if (n == 4) {
            return new p3(0);
        }
        if (n != 5) {
            return null;
        }
        return r3.zza;
    }
}

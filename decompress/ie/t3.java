// 
// Decompiled by Procyon v0.6.0
// 

package ie;

public final class t3 extends e6 implements c7
{
    private static final t3 zza;
    private int zze;
    private int zzf;
    private j6 zzg;
    
    static {
        e6.m(t3.class, zza = new t3());
    }
    
    public t3() {
        this.zzf = 1;
        this.zzg = (j6)k7.i;
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new l7((e6)t3.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u001b", new Object[] { "zze", "zzf", s3.a, "zzg", i3.class });
        }
        if (n == 3) {
            return new t3();
        }
        if (n == 4) {
            return new r3(0);
        }
        if (n != 5) {
            return null;
        }
        return t3.zza;
    }
}

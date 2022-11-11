// 
// Decompiled by Procyon v0.6.0
// 

package ke;

public final class t2 extends c6 implements a7
{
    private static final t2 zza;
    private int zze;
    private String zzf;
    private String zzg;
    
    static {
        c6.m(t2.class, zza = new t2());
    }
    
    public t2() {
        this.zzf = "";
        this.zzg = "";
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new j7((c6)t2.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new t2();
        }
        if (n == 4) {
            return new e2(0);
        }
        if (n != 5) {
            return null;
        }
        return t2.zza;
    }
}

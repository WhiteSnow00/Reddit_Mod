// 
// Decompiled by Procyon v0.6.0
// 

package je;

public final class f3 extends c6 implements a7
{
    private static final f3 zza;
    private int zze;
    private String zzf;
    private long zzg;
    
    static {
        c6.m((Class)f3.class, (c6)(zza = new f3()));
    }
    
    public f3() {
        this.zzf = "";
    }
    
    public static f3 r() {
        return f3.zza;
    }
    
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new j7((c6)f3.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new f3();
        }
        if (n == 4) {
            return new e3(0);
        }
        if (n != 5) {
            return null;
        }
        return f3.zza;
    }
}

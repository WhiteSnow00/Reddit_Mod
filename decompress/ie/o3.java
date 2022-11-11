// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.util.List;

public final class o3 extends e6 implements c7
{
    private static final o3 zza;
    private j6 zze;
    
    static {
        e6.m(o3.class, zza = new o3());
    }
    
    public o3() {
        this.zze = (j6)k7.i;
    }
    
    public static n3 r() {
        return (n3)o3.zza.n();
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new l7((e6)o3.zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "zze", q3.class });
        }
        if (n == 3) {
            return new o3();
        }
        if (n == 4) {
            return new n3(0);
        }
        if (n != 5) {
            return null;
        }
        return o3.zza;
    }
    
    public final q3 t() {
        return ((List<q3>)this.zze).get(0);
    }
    
    public final j6 u() {
        return this.zze;
    }
}

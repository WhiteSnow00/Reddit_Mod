// 
// Decompiled by Procyon v0.6.0
// 

package ke;

public final class m3 extends c6 implements a7
{
    private static final m3 zza;
    private h6 zze;
    
    static {
        c6.m(m3.class, zza = new m3());
    }
    
    public m3() {
        this.zze = (h6)i7.i;
    }
    
    public static l3 r() {
        return (l3)m3.zza.n();
    }
    
    @Override
    public final Object q(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new j7((c6)m3.zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "zze", o3.class });
        }
        if (n == 3) {
            return new m3();
        }
        if (n == 4) {
            return new l3(0);
        }
        if (n != 5) {
            return null;
        }
        return m3.zza;
    }
    
    public final o3 t() {
        return this.zze.get(0);
    }
    
    public final h6 u() {
        return this.zze;
    }
}

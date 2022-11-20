// 
// Decompiled by Procyon v0.6.0
// 

package vj2;

public final class d
{
    public static final d d;
    public static final d e;
    public static final d f;
    public static final d g;
    public static final d h;
    public static final d i;
    public static final d j;
    public static final d k;
    public static final d l;
    public static final d m;
    public static final d[] n;
    public final int a;
    public final String b;
    public final boolean c;
    
    static {
        d = new d(-1, "unknown", false);
        n = new d[] { e = new d(1, "AAC Main Profile", true), f = new d(2, "AAC Low Complexity", true), g = new d(3, "AAC Scalable Sample Rate", false), h = new d(4, "AAC Long Term Prediction", false), i = new d(5, "AAC SBR", true), new d(6, "Scalable AAC", false), new d(7, "TwinVQ", false), null, null, null, j = new d(11, "AAC Low Delay", false), null, null, null, null, null, k = new d(17, "Error Resilient AAC Low Complexity", true), new d(18, "Error Resilient AAC SSR", false), l = new d(19, "Error Resilient AAC Long Term Prediction", false), new d(20, "Error Resilient Scalable AAC", false), new d(21, "Error Resilient TwinVQ", false), new d(22, "Error Resilient BSAC", false), m = new d(23, "Error Resilient AAC Low Delay", false) };
    }
    
    public d(final int a, final String b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static d a(final int n) {
        if (n > 0) {
            final d[] n2 = vj2.d.n;
            if (n <= 23) {
                return n2[n - 1];
            }
        }
        return vj2.d.d;
    }
    
    @Override
    public final String toString() {
        return this.b;
    }
}

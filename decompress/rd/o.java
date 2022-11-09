// 
// Decompiled by Procyon v0.6.0
// 

package rd;

public final class o
{
    public static o a;
    
    static {
        new p(0, 0, 0, false, false);
    }
    
    public static o a() {
        synchronized (o.class) {
            if (o.a == null) {
                o.a = new o();
            }
            return o.a;
        }
    }
}

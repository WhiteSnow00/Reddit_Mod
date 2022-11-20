// 
// Decompiled by Procyon v0.6.0
// 

package zi2;

public final class u1
{
    public static final ThreadLocal<p0> a;
    
    static {
        a = new ThreadLocal<p0>();
    }
    
    public static p0 a() {
        final ThreadLocal<p0> a = u1.a;
        Object o;
        if ((o = a.get()) == null) {
            o = new f(Thread.currentThread());
            a.set((p0)o);
        }
        return (p0)o;
    }
}

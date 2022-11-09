// 
// Decompiled by Procyon v0.6.0
// 

package l0;

public interface a<T, V extends i>
{
    boolean a();
    
    default boolean b(final long n) {
        return n >= this.c();
    }
    
    long c();
    
    g0<T, V> d();
    
    T e(final long p0);
    
    T f();
    
    V g(final long p0);
}

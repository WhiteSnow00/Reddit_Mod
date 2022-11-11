// 
// Decompiled by Procyon v0.6.0
// 

package l9;

import z3.g;

public final class a
{
    public static final a$a a;
    
    static {
        a = new a$a();
    }
    
    public static a.a$c a(final int n, final b b) {
        return new a.a$c(new g(n), b, (e)l9.a.a);
    }
    
    public interface b<T>
    {
        T create();
    }
    
    public interface d
    {
        d$a c();
    }
    
    public interface e<T>
    {
        void a(final T p0);
    }
}

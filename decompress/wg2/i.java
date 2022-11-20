// 
// Decompiled by Procyon v0.6.0
// 

package wg2;

import mg2.a;

public final class i
{
    public static void a(final int n) {
        final Object[] array = { "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", null };
        if (n != 1 && n != 2) {
            array[2] = "lazy";
        }
        else {
            array[2] = "lazySoft";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", array));
    }
    
    public static <T> i.i$b<T> b(final a<T> a) {
        return (i.i$b<T>)new i.i$b((a)a);
    }
    
    public static <T> i.i$a<T> c(final a<T> a) {
        if (a != null) {
            return (i.i$a<T>)new i.i$a((Object)null, (a)a);
        }
        a(2);
        throw null;
    }
    
    public abstract static class c<T>
    {
        public static final i$c$a f;
        
        static {
            f = new Object() {};
        }
    }
}

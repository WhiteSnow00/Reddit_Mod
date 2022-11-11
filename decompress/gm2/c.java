// 
// Decompiled by Procyon v0.6.0
// 

package gm2;

import java.io.IOException;
import bl2.b;
import uk2.a;
import zl2.e;
import java.util.HashMap;

public final class c
{
    public static HashMap a;
    
    static {
        (c.a = new HashMap()).put(zl2.e.h, new c.c$c(0));
        c.a.put(zl2.e.i, new c.c$c(0));
        c.a.put(zl2.e.d, new c.c$d(0));
        c.a.put(zl2.e.e, new c.c$b(0));
        c.a.put(zl2.e.f, new c.c$f(0));
        c.a.put(zl2.e.g, new c.c$g(0));
        c.a.put(uk2.a.a, new c.c$f(0));
        c.a.put(uk2.a.b, new c.c$g(0));
        c.a.put(xk2.a.a, new c.c$a(0));
    }
    
    public static jl2.a a(final b b) throws IOException {
        final bl2.a f = b.f;
        final e e = c.a.get(f.f);
        if (e != null) {
            return e.a(b);
        }
        final StringBuilder r = a.r("algorithm identifier in public key not recognised: ");
        r.append(f.f);
        throw new IOException(r.toString());
    }
    
    public abstract static class e
    {
        public abstract jl2.a a(final b p0) throws IOException;
    }
}

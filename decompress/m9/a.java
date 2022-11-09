// 
// Decompiled by Procyon v0.6.0
// 

package m9;

import android.util.Log;
import z3.e;
import z3.g;

public final class a
{
    public static final a$a a;
    
    static {
        a = new e<Object>() {
            @Override
            public final void a(final Object o) {
            }
        };
    }
    
    public static c a(final int n, final b b) {
        return new c(new g(n), b, m9.a.a);
    }
    
    public interface b<T>
    {
        T create();
    }
    
    public static final class c<T> implements e<T>
    {
        public final b<T> a;
        public final a.e<T> b;
        public final e<T> c;
        
        public c(final g c, final b a, final a.e b) {
            this.c = c;
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final T a() {
            Object o;
            if ((o = this.c.a()) == null) {
                final T t = (T)(o = this.a.create());
                if (Log.isLoggable("FactoryPools", 2)) {
                    final StringBuilder k = a.k("Created new ");
                    k.append(((d)t).getClass());
                    Log.v("FactoryPools", k.toString());
                    o = t;
                }
            }
            if (o instanceof d) {
                ((d)o).a().a = false;
            }
            return (T)o;
        }
        
        @Override
        public final boolean b(final T t) {
            if (t instanceof d) {
                ((d)t).a().a = true;
            }
            this.b.a(t);
            return this.c.b(t);
        }
    }
    
    public interface d
    {
        m9.d.a a();
    }
    
    public interface e<T>
    {
        void a(final T p0);
    }
}

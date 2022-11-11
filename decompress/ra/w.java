// 
// Decompiled by Procyon v0.6.0
// 

package ra;

import ta.c;
import ta.a;
import javax.inject.Provider;
import ma.b;

public final class w implements b<v>
{
    public final Provider<a> a;
    public final Provider<a> b;
    public final Provider<e> c;
    public final Provider<c0> d;
    public final Provider<String> e;
    
    public w(final d0 d, final g e) {
        final ta.b a = ta.b.a.a;
        final c a2 = ta.c.a.a;
        final i a3 = i$a.a;
        this.a = (Provider<a>)a;
        this.b = (Provider<a>)a2;
        this.c = (Provider<e>)a3;
        this.d = (Provider<c0>)d;
        this.e = (Provider<String>)e;
    }
    
    public final Object get() {
        final a a = (a)this.a.get();
        final a a2 = (a)this.b.get();
        final Object value = this.c.get();
        final Object value2 = this.d.get();
        final Provider<String> e = this.e;
        final Object c = ma.a.c;
        Object o;
        if (e instanceof la.a) {
            o = e;
        }
        else {
            e.getClass();
            o = new ma.a((Provider)e);
        }
        return new v(a, a2, (e)value, (c0)value2, (la.a<String>)o);
    }
}

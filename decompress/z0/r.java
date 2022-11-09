// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import ak0.m;
import ah2.f;
import zg2.a;

public final class r<T> extends o0<T>
{
    public final a1<T> b;
    
    public r(final a1<T> b, final a<? extends T> a) {
        f.f((Object)b, "policy");
        f.f((Object)a, "defaultFactory");
        super(a);
        this.b = b;
    }
    
    @Override
    public final e1 a(final Object value, final d d) {
        Object o;
        if ((o = m.i(d, -84026900, -492369756)) == d$a.a) {
            o = a80.a.m0(value, this.b);
            d.v(o);
        }
        d.I();
        final h0 h0 = (h0)o;
        h0.setValue(value);
        d.I();
        return h0;
    }
}

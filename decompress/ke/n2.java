// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import x6.h;
import j5.f;

public final class n2
{
    public final f a;
    public final h b;
    public final h c;
    public final j5 d;
    
    public n2() {
        final f a = new f(2);
        this.a = a;
        final h c = new h(null, a);
        this.c = c;
        this.b = c.a();
        final j5 d = new j5();
        this.d = d;
        c.f("require", (o)new fa(d));
        d.a.put("internal.platform", u1.f);
        c.f("runtime.counter", (o)new ke.h(Double.valueOf(0.0)));
    }
    
    public final o a(final h h, final c4... array) {
        Object o = ke.o.f3;
        for (int length = array.length, i = 0; i < length; ++i) {
            final o a = x4.a(array[i]);
            f4.c(this.c);
            if (!(a instanceof p)) {
                o = a;
                if (!(a instanceof n)) {
                    continue;
                }
            }
            o = this.a.c(h, a);
        }
        return (o)o;
    }
}

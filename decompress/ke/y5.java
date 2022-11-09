// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import java.util.HashMap;
import java.util.List;
import x6.h;

public final class y5 extends i
{
    public final b h;
    
    public y5(final b h) {
        super("internal.eventLogger");
        this.h = h;
    }
    
    public final o h(final h h, final List list) {
        f4.h(super.f, 3, list);
        final String c = h.b(list.get(0)).c();
        final long n = (long)f4.a(h.b(list.get(1)).v());
        final o b = h.b(list.get(2));
        HashMap g;
        if (b instanceof l) {
            g = f4.g((l)b);
        }
        else {
            g = new HashMap();
        }
        this.h.c.add(new a(n, c, g));
        return (o)o.f3;
    }
}

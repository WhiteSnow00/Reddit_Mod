// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.util.List;
import px0.c;
import ih.s0;
import ih.n0;
import java.util.ArrayList;
import mg.d0;
import ih.q0;
import java.util.concurrent.Executors;
import zg.d;

public final class qb extends ic
{
    public qb(final d d) {
        super.a = new sb(d);
        super.b = Executors.newCachedThreadPool();
    }
    
    public static q0 b(final d d, final wc wc) {
        d0.y((Object)d);
        d0.y((Object)wc);
        final ArrayList list = new ArrayList();
        list.add(new n0(wc));
        final List f = wc.k.f;
        if (f != null && !f.isEmpty()) {
            for (int i = 0; i < f.size(); ++i) {
                list.add(new n0((fd)f.get(i)));
            }
        }
        final q0 q0 = new q0(d, list);
        q0.n = new s0(wc.o, wc.n);
        q0.o = wc.p;
        q0.p = wc.q;
        q0.g1(c.a3(wc.r));
        return q0;
    }
}

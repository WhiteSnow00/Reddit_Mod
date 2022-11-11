// 
// Decompiled by Procyon v0.6.0
// 

package p50;

import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import bd0.m;
import bd0.o;
import java.util.Map;
import sg2.e;
import kf2.h;

public final class c<T1, T2, T3, R> implements h<T1, T2, T3, R>
{
    public final /* synthetic */ b.a f;
    
    public c(final b.a f) {
        this.f = f;
    }
    
    public final R apply(final T1 t1, final T2 t2, final T3 t3) {
        e.g((Object)t1, "t1");
        e.g((Object)t2, "t2");
        e.g((Object)t3, "t3");
        final Map map = (Map)t3;
        final o o = (o)t2;
        final m m = (m)t1;
        final int b = o.b;
        final boolean b2 = true;
        final boolean b3 = b > 0;
        final List<bd0.h> a = o.a;
        boolean b4 = false;
        Label_0134: {
            if (!(a instanceof Collection) || !a.isEmpty()) {
                final Iterator iterator = a.iterator();
                while (iterator.hasNext()) {
                    final String e = ((bd0.h)iterator.next()).e;
                    this.f.getClass();
                    b4 = b2;
                    if (!sg2.e.a((Object)e, (Object)null)) {
                        continue;
                    }
                    break Label_0134;
                }
            }
            b4 = false;
        }
        this.f.getClass();
        new b.b$b.b(m, map, b3, b4);
        throw null;
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package w50;

import java.util.Iterator;
import java.util.List;
import kd0.g;
import java.util.Collection;
import kd0.l;
import kd0.n;
import java.util.Map;
import ah2.f;
import sf2.h;

public final class c<T1, T2, T3, R> implements h<T1, T2, T3, R>
{
    public final /* synthetic */ b$a f;
    
    public c(final b$a f) {
        this.f = f;
    }
    
    public final R apply(final T1 t1, final T2 t2, final T3 t3) {
        ah2.f.g((Object)t1, "t1");
        ah2.f.g((Object)t2, "t2");
        ah2.f.g((Object)t3, "t3");
        final Map map = (Map)t3;
        final n n = (n)t2;
        final l l = (l)t1;
        final int b = n.b;
        final boolean b2 = true;
        final boolean b3 = b > 0;
        final List a = n.a;
        boolean b4 = false;
        Label_0135: {
            if (!(a instanceof Collection) || !a.isEmpty()) {
                final Iterator iterator = a.iterator();
                while (iterator.hasNext()) {
                    final String e = ((g)iterator.next()).e;
                    this.f.getClass();
                    b4 = b2;
                    if (!ah2.f.a((Object)e, (Object)null)) {
                        continue;
                    }
                    break Label_0135;
                }
            }
            b4 = false;
        }
        this.f.getClass();
        new b$b.b(l, map, b3, b4);
        throw null;
    }
}

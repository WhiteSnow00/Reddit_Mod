// 
// Decompiled by Procyon v0.6.0
// 

package wi2;

import java.util.Collection;
import java.util.List;
import cg2.j;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import gg2.c;

public abstract class m<T>
{
    public abstract CoroutineSingletons a(final Object p0, final c p1);
    
    public abstract Object c(final Iterator<? extends T> p0, final c<? super j> p1);
    
    public final Object d(final List list, final c c) {
        if (list instanceof Collection && list.isEmpty()) {
            return j.a;
        }
        final Object c2 = this.c(list.iterator(), c);
        if (c2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return c2;
        }
        return j.a;
    }
}

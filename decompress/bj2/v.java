// 
// Decompiled by Procyon v0.6.0
// 

package bj2;

import gg2.c;
import kotlin.coroutines.CoroutineContext;
import p2.b;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import zi2.m;
import cg2.j;
import mg2.l;

public final class v<E> extends u<E>
{
    public final l<E, j> k;
    
    public v(final Object o, final m m, final l k) {
        super(o, m);
        this.k = (l<E, j>)k;
    }
    
    public final void H() {
        final l<E, j> k = this.k;
        final Object i = super.i;
        final CoroutineContext context = ((c)super.j).getContext();
        final UndeliveredElementException b = OnUndeliveredElementKt.b((mg2.l<? super Object, j>)k, i, null);
        if (b != null) {
            p2.b.K(context, (Throwable)b);
        }
    }
    
    public final boolean x() {
        if (!super.x()) {
            return false;
        }
        this.H();
        return true;
    }
}

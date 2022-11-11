// 
// Decompiled by Procyon v0.6.0
// 

package q0;

import s0.k$a;
import androidx.compose.foundation.lazy.layout.PinnableParentKt;
import d2.d;
import sg2.e;
import androidx.compose.foundation.lazy.LazyListState;
import d2.b;
import s0.k;
import d2.c;

public final class o implements c<k>, b, k
{
    public static final o$a i;
    public final LazyListState f;
    public final g g;
    public k h;
    
    static {
        i = new o$a();
    }
    
    public o(final LazyListState f, final g g) {
        e.f((Object)f, "state");
        this.f = f;
        this.g = g;
    }
    
    public final void F0(final d d) {
        e.f((Object)d, "scope");
        this.h = (k)d.a((d2.e)PinnableParentKt.a);
    }
    
    public final k$a a() {
        final g g = this.g;
        Object o;
        if (g.a.k()) {
            o = new o$b(this, g);
        }
        else {
            final k h = this.h;
            if (h == null || (o = h.a()) == null) {
                o = q0.o.i;
            }
        }
        return (k$a)o;
    }
    
    public final d2.e<k> getKey() {
        return PinnableParentKt.a;
    }
    
    public final Object getValue() {
        return this;
    }
}

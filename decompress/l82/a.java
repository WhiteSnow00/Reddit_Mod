// 
// Decompiled by Procyon v0.6.0
// 

package l82;

import mg.d0;
import ng2.e;
import com.reddit.queries.n2;
import h7.k;
import h7.k$b;
import h7.k$a;
import b6.h;

public final class a extends h
{
    public static final a f;
    
    static {
        f = new a();
    }
    
    public final <D extends k$a, T, V extends k$b, O extends k<D, T, V>> y60.a H(final O o) {
        if (e.a((Object)ng2.h.a((Class)o.getClass()), (Object)ng2.h.a((Class)n2.class))) {
            final com.reddit.vault.a g = d0.g;
            return new y60.a(g.a, g.b, g.c, 1);
        }
        throw new IllegalArgumentException();
    }
}

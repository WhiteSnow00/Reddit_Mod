// 
// Decompiled by Procyon v0.6.0
// 

package d80;

import ng2.e;
import com.reddit.queries.u2;
import y60.a;
import h7.k;
import h7.k$b;
import h7.k$a;
import b6.h;

public final class b extends h
{
    public static final b f;
    
    static {
        f = new b();
    }
    
    public final <D extends k$a, T, V extends k$b, O extends k<D, T, V>> a H(final O o) {
        if (e.a((Object)ng2.h.a((Class)o.getClass()), (Object)ng2.h.a((Class)u2.class))) {
            final d11.a q = zd.b.q;
            return new a(q.a, q.b, q.c, 1);
        }
        throw new IllegalArgumentException();
    }
}

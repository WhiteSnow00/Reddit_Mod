// 
// Decompiled by Procyon v0.6.0
// 

package l60;

import ug2.d;
import com.reddit.queries.j5;
import ng2.e;
import com.reddit.queries.w2;
import y60.a;
import h7.k;
import h7.k$b;
import h7.k$a;
import b6.h;

public final class c extends h
{
    public static final c f;
    
    static {
        f = new c();
    }
    
    public final <D extends k$a, T, V extends k$b, O extends k<D, T, V>> a H(final O o) {
        final d a = ng2.h.a((Class)o.getClass());
        db1.a a2;
        if (e.a((Object)a, (Object)ng2.h.a((Class)w2.class))) {
            a2 = p7.a.h;
        }
        else {
            if (!e.a((Object)a, (Object)ng2.h.a((Class)j5.class))) {
                throw new IllegalArgumentException();
            }
            a2 = p7.a.i;
        }
        return new a(a2.a, a2.b, a2.c, 1);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package d80;

import a4.a0;
import sg2.e;
import com.reddit.queries.u2;
import sg2.h;
import x60.a;
import h7.k;

public final class b extends android.support.v4.media.b
{
    public static final b f;
    
    static {
        f = new b();
    }
    
    public final <D extends k.a, T, V extends k.b, O extends k<D, T, V>> a K(final O o) {
        if (e.a((Object)h.a((Class)o.getClass()), (Object)h.a((Class)u2.class))) {
            final h80.a o2 = a0.O;
            return new a(o2.a, o2.b, o2.c, 1);
        }
        throw new IllegalArgumentException();
    }
}

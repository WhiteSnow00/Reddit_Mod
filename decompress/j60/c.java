// 
// Decompiled by Procyon v0.6.0
// 

package j60;

import cg.q;
import com.reddit.queries.j5;
import bg.d;
import sg2.e;
import com.reddit.queries.w2;
import sg2.h;
import x60.a;
import h7.k;
import android.support.v4.media.b;

public final class c extends b
{
    public static final c f;
    
    static {
        f = new c();
    }
    
    public final <D extends k.a, T, V extends k.b, O extends k<D, T, V>> a K(final O o) {
        final zg2.d a = h.a((Class)o.getClass());
        q q;
        if (e.a((Object)a, (Object)h.a((Class)w2.class))) {
            q = d.u;
        }
        else {
            if (!e.a((Object)a, (Object)h.a((Class)j5.class))) {
                throw new IllegalArgumentException();
            }
            q = d.v;
        }
        return new a((String)q.f, (String)q.g, (String)q.h, 1);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package e60;

import dg.j;
import com.reddit.queries.wa;
import com.reddit.queries.ya;
import com.reddit.queries.ta;
import com.reddit.queries.sa;
import com.reddit.queries.oa;
import com.reddit.queries.qa;
import dg.d;
import ah2.f;
import com.reddit.queries.ma;
import ah2.i;
import qm.b;
import h7.k;
import h7.k$b;
import h7.k$a;
import android.support.v4.media.a;

public final class c extends a
{
    public static final c f;
    
    static {
        f = new c();
    }
    
    public final <D extends k$a, T, V extends k$b, O extends k<D, T, V>> b F0(final O o) {
        final hh2.d a = i.a((Class)o.getClass());
        j j;
        if (ah2.f.a((Object)a, (Object)i.a((Class)ma.class))) {
            j = d.o;
        }
        else if (ah2.f.a((Object)a, (Object)i.a((Class)qa.class))) {
            j = d.p;
        }
        else if (ah2.f.a((Object)a, (Object)i.a((Class)oa.class))) {
            j = d.q;
        }
        else if (ah2.f.a((Object)a, (Object)i.a((Class)sa.class))) {
            j = d.r;
        }
        else if (ah2.f.a((Object)a, (Object)i.a((Class)ta.class))) {
            j = d.s;
        }
        else if (ah2.f.a((Object)a, (Object)i.a((Class)ya.class))) {
            j = d.t;
        }
        else {
            if (!ah2.f.a((Object)a, (Object)i.a((Class)wa.class))) {
                throw new IllegalArgumentException();
            }
            j = d.u;
        }
        return new b((String)j.g, (String)j.h, (String)j.i, 2);
    }
}

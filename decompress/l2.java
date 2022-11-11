// 
// Decompiled by Procyon v0.6.0
// 

package g60;

import a4.u1;
import sf2.o;
import ov.d;
import java.util.Map;
import okhttp3.OkHttpClient;
import h7.k;
import ur0.e;
import ur0.e$a;
import com.reddit.queries.n9;
import com.reddit.domain.model.Trophy;
import java.util.List;
import nf2.c0;
import javax.inject.Inject;
import ah2.f;
import d60.y;
import r20.a;
import ge0.q0;

public final class l2 implements q0
{
    public final a a;
    public final y b;
    
    @Inject
    public l2(final a a, final y b) {
        f.f((Object)a, "backgroundThread");
        f.f((Object)b, "remoteGql");
        this.a = a;
        this.b = b;
    }
    
    public final c0<List<Trophy>> a(final String s) {
        f.f((Object)s, "username");
        final y b = this.b;
        b.getClass();
        final c0 w = e$a.a((e)b.a, (k)new n9(s), (OkHttpClient)null, (Map)null, 14).w((o)new d(8));
        f.e((Object)w, "graphQlClient.execute(\n \u2026.trophies.orEmpty()\n    }");
        final c0 w2 = u1.j1(w, (r20.d)this.a).w((o)new n0(8));
        f.e((Object)w2, "remoteGql.getTrophies(us\u2026      )\n        }\n      }");
        return (c0<List<Trophy>>)w2;
    }
}

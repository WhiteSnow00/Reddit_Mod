// 
// Decompiled by Procyon v0.6.0
// 

package g60;

import sf2.o;
import ch.b;
import r20.d;
import a4.u1;
import java.util.Map;
import okhttp3.OkHttpClient;
import h7.k;
import ur0.e;
import ur0.e$a;
import com.reddit.queries.t0;
import com.reddit.domain.model.Subreddit;
import java.util.List;
import nf2.c0;
import javax.inject.Inject;
import ah2.f;
import r20.a;
import d60.x;
import ge0.p0;

public final class k2 implements p0
{
    public final x a;
    public final a b;
    
    @Inject
    public k2(final x a, final a b) {
        f.f((Object)a, "remoteGqlSubredditSearchDataSource");
        f.f((Object)b, "backgroundThread");
        this.a = a;
        this.b = b;
    }
    
    public final c0<List<Subreddit>> a(final String s, final boolean b) {
        f.f((Object)s, "query");
        final x a = this.a;
        a.getClass();
        final c0 w = u1.j1(e$a.a((e)a.a, (k)new t0(s, b), (OkHttpClient)null, (Map)null, 14), (d)a.b).w((o)new b(6));
        f.e((Object)w, "client.execute(\n      Co\u2026      }\n        }\n      }");
        return (c0<List<Subreddit>>)u1.j1(w, (d)this.b);
    }
}

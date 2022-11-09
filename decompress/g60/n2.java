// 
// Decompiled by Procyon v0.6.0
// 

package g60;

import m10.p;
import com.reddit.queries.nc;
import r20.d;
import a4.u1;
import sf2.o;
import ov.c;
import java.util.Map;
import okhttp3.OkHttpClient;
import h7.k;
import ur0.e;
import ur0.e$a;
import com.reddit.queries.pc;
import h7.h$a;
import com.reddit.domain.model.wiki.SubredditWikiWrapper;
import nf2.c0;
import javax.inject.Inject;
import ah2.f;
import d60.a0;
import r20.a;
import ge0.t0;

public final class n2 implements t0
{
    public final a a;
    public final a0 b;
    
    @Inject
    public n2(final a a, final a0 b) {
        f.f((Object)a, "backgroundThread");
        f.f((Object)b, "remoteGql");
        this.a = a;
        this.b = b;
    }
    
    public final c0<SubredditWikiWrapper> a(final String s, final String s2) {
        f.f((Object)s, "subredditName");
        f.f((Object)s2, "wikiPage");
        final a0 b = this.b;
        b.getClass();
        final c0 w = e$a.a((e)b.a, (k)new pc(s, h$a.b((Object)s2)), (OkHttpClient)null, (Map)null, 14).w((o)new c(14));
        f.e((Object)w, "graphQlClient.execute(\n \u2026)\n        }\n      }\n    }");
        return (c0<SubredditWikiWrapper>)u1.j1(w, (d)this.a);
    }
    
    public final c0<SubredditWikiWrapper> b(final String s) {
        f.f((Object)s, "subredditName");
        final a0 b = this.b;
        b.getClass();
        final c0 w = e$a.a((e)b.a, (k)new nc(s), (OkHttpClient)null, (Map)null, 14).w((o)new p(7));
        f.e((Object)w, "graphQlClient.execute(\n \u2026)\n        }\n      }\n    }");
        return (c0<SubredditWikiWrapper>)u1.j1(w, (d)this.a);
    }
}

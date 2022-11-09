// 
// Decompiled by Procyon v0.6.0
// 

package g60;

import io.reactivex.plugins.RxJavaPlugins;
import nf2.g0;
import io.reactivex.internal.operators.single.SingleFlatMap;
import sf2.o;
import d60.u;
import r20.d;
import a4.u1;
import java.util.Map;
import okhttp3.OkHttpClient;
import h7.k;
import ur0.e;
import ur0.e$a;
import com.reddit.mutations.q4;
import o22.l4;
import com.reddit.domain.model.PostPollVoteResponse;
import nf2.c0;
import javax.inject.Inject;
import ah2.f;
import r20.a;
import c50.i0;
import d60.v;
import ge0.y;

public final class m1 implements y
{
    public final v a;
    public final i0 b;
    public final a c;
    
    @Inject
    public m1(final v a, final i0 b, final a c) {
        f.f((Object)a, "gqlRemote");
        f.f((Object)b, "localLinkDataSource");
        f.f((Object)c, "backgroundThread");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final c0<PostPollVoteResponse> a(final String s, final String s2) {
        f.f((Object)s, "kindWithId");
        f.f((Object)s2, "pollOptionId");
        final v a = this.a;
        a.getClass();
        final c0 w = u1.j1(e$a.a((e)a.a, (k)new q4(new l4(s, s2)), (OkHttpClient)null, (Map)null, 14), (d)a.b).w((o)new u(s, 0));
        f.e((Object)w, "graphQlClient.execute(Po\u2026te?.ok,\n        )\n      }");
        final c0 onAssembly = RxJavaPlugins.onAssembly((c0)new SingleFlatMap((g0)w, (o)new l1(this, s)));
        f.e((Object)onAssembly, "gqlRemote.postPollVote(\n\u2026en(Single.just(it))\n    }");
        return (c0<PostPollVoteResponse>)onAssembly;
    }
}

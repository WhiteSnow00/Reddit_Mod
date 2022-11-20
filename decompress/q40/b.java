// 
// Decompiled by Procyon v0.6.0
// 

package q40;

import af2.c0;
import gg2.c;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import h7.k;
import javax.inject.Inject;
import mr0.f;
import ws0.g;
import okhttp3.OkHttpClient;
import com.reddit.graphql.a;
import mr0.e;

public final class b implements e
{
    public final a a;
    
    @Inject
    public b(final ke2.a<OkHttpClient> a, final g g, final q20.a a2) {
        ng2.e.f((Object)a, "okHttpClient");
        ng2.e.f((Object)g, "hostSettings");
        ng2.e.f((Object)a2, "backgroundThread");
        this.a = new a((ke2.a)a, g, a2, (f)q40.a.f);
    }
    
    public final Object a(final k k, final RetryAlgo retryAlgo, final Map map, final c c, final OkHttpClient okHttpClient) {
        return this.a.a(k, retryAlgo, map, c, okHttpClient);
    }
    
    public final c0 b(final k k, final RetryAlgo retryAlgo, final Map map, final OkHttpClient okHttpClient) {
        return this.a.b(k, retryAlgo, map, okHttpClient);
    }
    
    public final Object c(final k k, final RetryAlgo retryAlgo, final Map map, final c c, final OkHttpClient okHttpClient) {
        return this.a.c(k, retryAlgo, map, c, okHttpClient);
    }
}

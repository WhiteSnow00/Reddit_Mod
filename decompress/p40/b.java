// 
// Decompiled by Procyon v0.6.0
// 

package p40;

import ff2.c0;
import lg2.c;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import h7.k;
import javax.inject.Inject;
import mr0.f;
import us0.g;
import okhttp3.OkHttpClient;
import com.reddit.graphql.a;
import mr0.e;

public final class b implements e
{
    public final /* synthetic */ a a;
    
    @Inject
    public b(final pe2.a<OkHttpClient> a, final g g, final n20.a a2) {
        sg2.e.f((Object)a, "okHttpClient");
        sg2.e.f((Object)g, "hostSettings");
        sg2.e.f((Object)a2, "backgroundThread");
        this.a = new a((pe2.a)a, g, a2, (f)p40.a.f);
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

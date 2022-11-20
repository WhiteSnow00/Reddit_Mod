// 
// Decompiled by Procyon v0.6.0
// 

package b50;

import ng2.e;
import com.reddit.domain.model.SubredditLeaderboardModel;
import javax.inject.Inject;

public final class a
{
    @Inject
    public a() {
    }
    
    public static SubredditLeaderboardModel a(final f60.a a) {
        e.f((Object)a, "subredditLeaderboardDataModel");
        return new SubredditLeaderboardModel(a.a, a.b, a.c, a.d, a.e, a.f, a.g, a.h, a.i, a.j, a.k, a.l, a.n, a.o);
    }
}

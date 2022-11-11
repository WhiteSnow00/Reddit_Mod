// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import ru2.f;
import com.reddit.domain.model.SubredditStats;
import lg2.c;
import ru2.s;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007" }, d2 = { "Lcom/reddit/data/remote/RemoteSubredditStatsDataSource;", "", "", "subredditId", "Lcom/reddit/domain/model/SubredditStats;", "getSubredditStats", "(Ljava/lang/String;Llg2/c;)Ljava/lang/Object;", "data_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemoteSubredditStatsDataSource
{
    @f("api/v1/{subredditName}/weekly_stats.json")
    Object getSubredditStats(@s("subredditName") final String p0, final c<? super SubredditStats> p1);
}

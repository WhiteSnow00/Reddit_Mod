// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.meta.remote;

import av2.f;
import com.reddit.data.meta.model.LeaderboardItemDataModel;
import java.util.List;
import nf2.c0;
import av2.s;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¨\u0006\b" }, d2 = { "Lcom/reddit/data/meta/remote/RemoteLeaderboardDataSource;", "", "", "subredditId", "Lnf2/c0;", "", "Lcom/reddit/data/meta/model/LeaderboardItemDataModel;", "leaderboard", "data_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemoteLeaderboardDataSource
{
    @f("ratings/{subredditId}/points-monthly")
    c0<List<LeaderboardItemDataModel>> leaderboard(@s("subredditId") final String p0);
}

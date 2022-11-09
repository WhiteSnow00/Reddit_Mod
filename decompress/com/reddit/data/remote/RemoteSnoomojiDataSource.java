// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import av2.f;
import com.reddit.domain.model.SubredditSnoomoji;
import nf2.c0;
import av2.s;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0007" }, d2 = { "Lcom/reddit/data/remote/RemoteSnoomojiDataSource;", "", "", "subreddit", "Lnf2/c0;", "Lcom/reddit/domain/model/SubredditSnoomoji;", "fetchSnoomoji", "remote_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemoteSnoomojiDataSource
{
    @f("/api/v1/{subreddit}/emojis/all.json")
    c0<SubredditSnoomoji> fetchSnoomoji(@s("subreddit") final String p0);
}

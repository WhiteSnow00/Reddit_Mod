// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devplatform.data.source.remote;

import av2.f;
import wu2.w;
import tg2.c;
import av2.t;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J-\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n" }, d2 = { "Lcom/reddit/devplatform/data/source/remote/RemoteSubredditInfoSource;", "", "", "subredditIds", "", "rawJson", "Lwu2/w;", "Lcom/reddit/devplatform/data/source/remote/SubredditInfoResponse;", "getSubredditInfo", "(Ljava/lang/String;ILtg2/c;)Ljava/lang/Object;", "impl_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemoteSubredditInfoSource
{
    @f("/api/info.json")
    Object getSubredditInfo(@t("id") final String p0, @t("raw_json") final int p1, final c<? super w<SubredditInfoResponse>> p2);
}

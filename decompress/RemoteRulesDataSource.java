// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import com.reddit.domain.model.RulesWrapper;
import com.reddit.domain.model.StreamRules;
import com.reddit.domain.model.SiteRulesWrapper;
import nf2.c0;
import av2.f;
import com.reddit.domain.model.streaming.RemovalReasons;
import tg2.c;
import av2.s;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H'J\u001d\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f" }, d2 = { "Lcom/reddit/data/remote/RemoteRulesDataSource;", "", "", "subredditName", "Lnf2/c0;", "Lcom/reddit/domain/model/RulesWrapper;", "getSubredditRules", "Lcom/reddit/domain/model/SiteRulesWrapper;", "getSiteRules", "Lcom/reddit/domain/model/StreamRules;", "getStreamRules", "subreddit", "Lcom/reddit/domain/model/streaming/RemovalReasons;", "getRemovalReasons", "(Ljava/lang/String;Ltg2/c;)Ljava/lang/Object;", "remote_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemoteRulesDataSource
{
    @f("/api/v1/{subreddit}/removal_reasons.json")
    Object getRemovalReasons(@s("subreddit") final String p0, final c<? super RemovalReasons> p1);
    
    @f("api/sitewide_rules.json")
    c0<SiteRulesWrapper> getSiteRules();
    
    @f("/api/livestream_rules.json")
    c0<StreamRules> getStreamRules();
    
    @f("r/{subredditName}/about/rules.json")
    c0<RulesWrapper> getSubredditRules(@s("subredditName") final String p0);
}

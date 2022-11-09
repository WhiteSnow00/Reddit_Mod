// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.meta.remote;

import java.util.Map;
import av2.f;
import com.reddit.data.meta.model.CommunityInfoDataModel;
import nf2.c0;
import av2.s;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u001a\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00070\u0004H'¨\u0006\t" }, d2 = { "Lcom/reddit/data/meta/remote/RemoteMetaCommunityDataSource;", "", "", "subredditId", "Lnf2/c0;", "Lcom/reddit/data/meta/model/CommunityInfoDataModel;", "getCommunityInfo", "", "getMetaEnabledSubredditIds", "data_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemoteMetaCommunityDataSource
{
    @f("communities/{subredditId}/me")
    c0<CommunityInfoDataModel> getCommunityInfo(@s("subredditId") final String p0);
    
    @f("communities")
    c0<Map<String, Object>> getMetaEnabledSubredditIds();
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.communitysettings;

import com.reddit.domain.model.Subreddit;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&?\u0006\u0006" }, d2 = { "Lcom/reddit/domain/modtools/communitysettings/CommunitySettingsChangedTarget;", "", "Lcom/reddit/domain/model/Subreddit;", "subreddit", "Lhg2/j;", "onCommunitySettingsChanged", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public interface CommunitySettingsChangedTarget
{
    void onCommunitySettingsChanged(final Subreddit p0);
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import nu2.d;
import com.twitter.sdk.android.core.Callback;
import java.util.List;
import nu2.b;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.models.Tweet;

public class TwitterListTimeline extends BaseTimeline implements Timeline<Tweet>
{
    private static final String SCRIBE_SECTION = "list";
    public final Boolean includeRetweets;
    public final Long listId;
    public final Integer maxItemsPerRequest;
    public final Long ownerId;
    public final String ownerScreenName;
    public final String slug;
    public final TwitterCore twitterCore;
    
    public TwitterListTimeline(final TwitterCore twitterCore, final Long listId, final String slug, final Long ownerId, final String ownerScreenName, final Integer maxItemsPerRequest, final Boolean includeRetweets) {
        this.twitterCore = twitterCore;
        this.listId = listId;
        this.slug = slug;
        this.ownerId = ownerId;
        this.ownerScreenName = ownerScreenName;
        this.maxItemsPerRequest = maxItemsPerRequest;
        this.includeRetweets = includeRetweets;
    }
    
    public b<List<Tweet>> createListTimelineRequest(final Long n, final Long n2) {
        return (b<List<Tweet>>)this.twitterCore.getApiClient().getListService().statuses(this.listId, this.slug, this.ownerScreenName, this.ownerId, n, n2, this.maxItemsPerRequest, Boolean.TRUE, this.includeRetweets);
    }
    
    public String getTimelineType() {
        return "list";
    }
    
    public void next(final Long n, final Callback<TimelineResult<Tweet>> callback) {
        this.createListTimelineRequest(n, null).w0((d)new BaseTimeline.TweetsCallback(callback));
    }
    
    public void previous(final Long n, final Callback<TimelineResult<Tweet>> callback) {
        this.createListTimelineRequest(null, BaseTimeline.decrementMaxId(n)).w0((d)new BaseTimeline.TweetsCallback(callback));
    }
}

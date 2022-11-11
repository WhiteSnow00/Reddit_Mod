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

public class UserTimeline extends BaseTimeline implements Timeline<Tweet>
{
    private static final String SCRIBE_SECTION = "user";
    public final Boolean includeReplies;
    public final Boolean includeRetweets;
    public final Integer maxItemsPerRequest;
    public final String screenName;
    public final TwitterCore twitterCore;
    public final Long userId;
    
    public UserTimeline(final TwitterCore twitterCore, final Long userId, final String screenName, final Integer maxItemsPerRequest, final Boolean b, final Boolean includeRetweets) {
        this.twitterCore = twitterCore;
        this.userId = userId;
        this.screenName = screenName;
        this.maxItemsPerRequest = maxItemsPerRequest;
        this.includeReplies = (b != null && b);
        this.includeRetweets = includeRetweets;
    }
    
    public b<List<Tweet>> createUserTimelineRequest(final Long n, final Long n2) {
        return (b<List<Tweet>>)this.twitterCore.getApiClient().getStatusesService().userTimeline(this.userId, this.screenName, this.maxItemsPerRequest, n, n2, Boolean.FALSE, Boolean.valueOf(this.includeReplies ^ true), (Boolean)null, this.includeRetweets);
    }
    
    public String getTimelineType() {
        return "user";
    }
    
    public void next(final Long n, final Callback<TimelineResult<Tweet>> callback) {
        this.createUserTimelineRequest(n, null).w0((d)new BaseTimeline.TweetsCallback(callback));
    }
    
    public void previous(final Long n, final Callback<TimelineResult<Tweet>> callback) {
        this.createUserTimelineRequest(null, BaseTimeline.decrementMaxId(n)).w0((d)new BaseTimeline.TweetsCallback(callback));
    }
}

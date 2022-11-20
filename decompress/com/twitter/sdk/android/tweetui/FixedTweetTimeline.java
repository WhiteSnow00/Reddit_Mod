// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import java.util.Collections;
import ku2.w;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.models.Identifiable;
import com.twitter.sdk.android.core.Callback;
import java.util.ArrayList;
import java.util.List;
import com.twitter.sdk.android.core.models.Tweet;

public class FixedTweetTimeline extends BaseTimeline implements Timeline<Tweet>
{
    private static final String SCRIBE_SECTION = "fixed";
    public final List<Tweet> tweets;
    
    public FixedTweetTimeline(final List<Tweet> list) {
        List<Tweet> tweets = list;
        if (list == null) {
            tweets = new ArrayList<Tweet>();
        }
        this.tweets = tweets;
    }
    
    public String getTimelineType() {
        return "fixed";
    }
    
    public void next(final Long n, final Callback<TimelineResult<Tweet>> callback) {
        callback.success((com.twitter.sdk.android.core.Result<TimelineResult<Tweet>>)new Result((Object)new TimelineResult(new TimelineCursor((List<? extends Identifiable>)this.tweets), (List<Object>)this.tweets), (w)null));
    }
    
    public void previous(final Long n, final Callback<TimelineResult<Tweet>> callback) {
        final List<Object> emptyList = Collections.emptyList();
        callback.success((com.twitter.sdk.android.core.Result<TimelineResult<Tweet>>)new Result((Object)new TimelineResult(new TimelineCursor((List<? extends Identifiable>)emptyList), emptyList), (w)null));
    }
}

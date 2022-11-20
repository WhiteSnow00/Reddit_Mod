// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import java.util.ArrayList;
import com.twitter.sdk.android.core.internal.scribe.ScribeItem;
import java.util.List;
import com.twitter.sdk.android.core.Callback;
import hj.n;
import hj.p;
import hj.h;
import com.twitter.sdk.android.core.models.Tweet;

class FilterTimelineDelegate extends TimelineDelegate<Tweet>
{
    public static final String TOTAL_APPLIED_FILTERS_JSON_PROP = "total_filters";
    public static final String TWEETS_COUNT_JSON_PROP = "tweet_count";
    public static final String TWEETS_FILTERED_JSON_PROP = "tweets_filtered";
    public final h gson;
    public final TimelineFilter timelineFilter;
    public final TweetUi tweetUi;
    
    public FilterTimelineDelegate(final Timeline<Tweet> timeline, final TimelineFilter timelineFilter) {
        super(timeline);
        this.gson = new h();
        this.timelineFilter = timelineFilter;
        this.tweetUi = TweetUi.getInstance();
    }
    
    private String getJsonMessage(final int n, final int n2, final int n3) {
        final p p3 = new p();
        p3.e("tweet_count", Integer.valueOf(n));
        p3.e("tweets_filtered", Integer.valueOf(n - n2));
        p3.e("total_filters", Integer.valueOf(n3));
        return this.gson.g((n)p3);
    }
    
    @Override
    public void next(final Callback<TimelineResult<Tweet>> callback) {
        this.loadNext(super.timelineStateHolder.positionForNext(), (Callback<TimelineResult<Tweet>>)new FilterTimelineDelegate.FilterTimelineDelegate$TimelineFilterCallback(this, (TimelineDelegate$DefaultCallback)new NextCallback((Callback<TimelineResult<T>>)callback, super.timelineStateHolder), this.timelineFilter));
    }
    
    @Override
    public void previous() {
        this.loadPrevious(super.timelineStateHolder.positionForPrevious(), (Callback<TimelineResult<Tweet>>)new FilterTimelineDelegate.FilterTimelineDelegate$TimelineFilterCallback(this, (TimelineDelegate$DefaultCallback)new PreviousCallback(super.timelineStateHolder), this.timelineFilter));
    }
    
    @Override
    public void refresh(final Callback<TimelineResult<Tweet>> callback) {
        super.timelineStateHolder.resetCursors();
        this.loadNext(super.timelineStateHolder.positionForNext(), (Callback<TimelineResult<Tweet>>)new FilterTimelineDelegate.FilterTimelineDelegate$TimelineFilterCallback(this, (TimelineDelegate$DefaultCallback)new TimelineDelegate$RefreshCallback((TimelineDelegate)this, (Callback)callback, super.timelineStateHolder), this.timelineFilter));
    }
    
    public void scribeFilteredTimeline(final List<Tweet> list, final List<Tweet> list2) {
        final int size = list.size();
        final ScribeItem fromMessage = ScribeItem.fromMessage(this.getJsonMessage(size, size - list2.size(), this.timelineFilter.totalFilters()));
        final ArrayList list3 = new ArrayList();
        list3.add(fromMessage);
        this.tweetUi.scribe(ScribeConstants.getTfwClientFilterTimelineNamespace(TweetTimelineListAdapter.getTimelineType(super.timeline)), list3);
    }
}

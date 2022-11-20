// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import ku2.d;
import com.twitter.sdk.android.core.Callback;
import ku2.b;
import com.twitter.sdk.android.core.models.TweetBuilder;
import com.twitter.sdk.android.core.models.TwitterCollection$Metadata$Position;
import java.util.Iterator;
import com.twitter.sdk.android.core.models.TwitterCollection$Metadata;
import com.twitter.sdk.android.core.models.TwitterCollection$Content;
import java.util.Collections;
import com.twitter.sdk.android.core.models.User;
import java.util.Map;
import com.twitter.sdk.android.core.models.TwitterCollection$TimelineItem;
import java.util.ArrayList;
import java.util.List;
import com.twitter.sdk.android.core.models.TwitterCollection;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.models.Tweet;

public class CollectionTimeline extends BaseTimeline implements Timeline<Tweet>
{
    public static final String COLLECTION_PREFIX = "custom-";
    private static final String SCRIBE_SECTION = "collection";
    public final String collectionIdentifier;
    public final Integer maxItemsPerRequest;
    public final TwitterCore twitterCore;
    
    public CollectionTimeline(final TwitterCore twitterCore, final Long n, final Integer maxItemsPerRequest) {
        if (n == null) {
            this.collectionIdentifier = null;
        }
        else {
            final StringBuilder t = a.t("custom-");
            t.append(Long.toString(n));
            this.collectionIdentifier = t.toString();
        }
        this.twitterCore = twitterCore;
        this.maxItemsPerRequest = maxItemsPerRequest;
    }
    
    public static List<Tweet> getOrderedTweets(final TwitterCollection collection) {
        if (collection != null) {
            final TwitterCollection$Content contents = collection.contents;
            if (contents != null) {
                final Map tweetMap = contents.tweetMap;
                if (tweetMap != null && contents.userMap != null && !tweetMap.isEmpty() && !collection.contents.userMap.isEmpty()) {
                    final TwitterCollection$Metadata metadata = collection.metadata;
                    if (metadata != null && metadata.timelineItems != null) {
                        if (metadata.position != null) {
                            final ArrayList list = new ArrayList();
                            final Iterator iterator = collection.metadata.timelineItems.iterator();
                            while (iterator.hasNext()) {
                                list.add(mapTweetToUsers((Tweet)collection.contents.tweetMap.get(((TwitterCollection$TimelineItem)iterator.next()).tweetItem.id), collection.contents.userMap));
                            }
                            return list;
                        }
                    }
                }
            }
        }
        return Collections.emptyList();
    }
    
    public static TimelineCursor getTimelineCursor(final TwitterCollection collection) {
        if (collection != null) {
            final TwitterCollection$Metadata metadata = collection.metadata;
            if (metadata != null) {
                final TwitterCollection$Metadata$Position position = metadata.position;
                if (position != null) {
                    return new TimelineCursor(position.minPosition, position.maxPosition);
                }
            }
        }
        return null;
    }
    
    public static Tweet mapTweetToUsers(Tweet quotedStatus, final Map<Long, User> map) {
        final TweetBuilder setUser = new TweetBuilder().copy(quotedStatus).setUser((User)map.get(quotedStatus.user.id));
        quotedStatus = quotedStatus.quotedStatus;
        if (quotedStatus != null) {
            setUser.setQuotedStatus(mapTweetToUsers(quotedStatus, map));
        }
        return setUser.build();
    }
    
    public b<TwitterCollection> createCollectionRequest(final Long n, final Long n2) {
        return (b<TwitterCollection>)this.twitterCore.getApiClient().getCollectionService().collection(this.collectionIdentifier, this.maxItemsPerRequest, n2, n);
    }
    
    public String getTimelineType() {
        return "collection";
    }
    
    public void next(final Long n, final Callback<TimelineResult<Tweet>> callback) {
        this.createCollectionRequest(n, null).H((d)new CollectionTimeline.CollectionTimeline$CollectionCallback(this, (Callback)callback));
    }
    
    public void previous(final Long n, final Callback<TimelineResult<Tweet>> callback) {
        this.createCollectionRequest(null, n).H((d)new CollectionTimeline.CollectionTimeline$CollectionCallback(this, (Callback)callback));
    }
}

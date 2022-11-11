// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import java.util.List;
import java.util.ArrayList;
import com.twitter.sdk.android.core.internal.scribe.ScribeItem;
import com.twitter.sdk.android.core.internal.scribe.EventNamespace;

class VideoScribeClientImpl implements VideoScribeClient
{
    public static final String SCRIBE_IMPRESSION_ACTION = "impression";
    public static final String SCRIBE_PLAY_ACTION = "play";
    public static final String TFW_CLIENT_EVENT_PAGE = "android";
    public static final String TFW_CLIENT_EVENT_SECTION = "video";
    public final TweetUi tweetUi;
    
    public VideoScribeClientImpl(final TweetUi tweetUi) {
        this.tweetUi = tweetUi;
    }
    
    public static EventNamespace getTfwImpressionNamespace() {
        return new EventNamespace.Builder().setClient("tfw").setPage("android").setSection("video").setAction("impression").builder();
    }
    
    public static EventNamespace getTfwPlayNamespace() {
        return new EventNamespace.Builder().setClient("tfw").setPage("android").setSection("video").setAction("play").builder();
    }
    
    public void impression(final ScribeItem scribeItem) {
        final ArrayList list = new ArrayList();
        list.add(scribeItem);
        this.tweetUi.scribe(getTfwImpressionNamespace(), (List)list);
    }
    
    public void play(final ScribeItem scribeItem) {
        final ArrayList list = new ArrayList();
        list.add(scribeItem);
        this.tweetUi.scribe(getTfwPlayNamespace(), (List)list);
    }
}

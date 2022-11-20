// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import java.util.List;
import java.util.ArrayList;
import com.twitter.sdk.android.core.internal.scribe.ScribeItem;
import com.twitter.sdk.android.core.internal.scribe.EventNamespace$Builder;
import com.twitter.sdk.android.core.internal.scribe.EventNamespace;

public class GalleryScribeClientImpl implements GalleryScribeClient
{
    public static final String SCRIBE_DISMISS_ACTION = "dismiss";
    public static final String SCRIBE_IMPRESSION_ACTION = "impression";
    public static final String SCRIBE_NAVIGATE_ACTION = "navigate";
    public static final String SCRIBE_SHOW_ACTION = "show";
    public static final String TFW_CLIENT_EVENT_PAGE = "android";
    public static final String TFW_CLIENT_EVENT_SECTION = "gallery";
    public final TweetUi tweetUi;
    
    public GalleryScribeClientImpl(final TweetUi tweetUi) {
        this.tweetUi = tweetUi;
    }
    
    public static EventNamespace getTfwDimissNamespace() {
        return new EventNamespace$Builder().setClient("tfw").setPage("android").setSection("gallery").setAction("dismiss").builder();
    }
    
    public static EventNamespace getTfwImpressionNamespace() {
        return new EventNamespace$Builder().setClient("tfw").setPage("android").setSection("gallery").setAction("impression").builder();
    }
    
    public static EventNamespace getTfwNavigateNamespace() {
        return new EventNamespace$Builder().setClient("tfw").setPage("android").setSection("gallery").setAction("navigate").builder();
    }
    
    public static EventNamespace getTfwShowNamespace() {
        return new EventNamespace$Builder().setClient("tfw").setPage("android").setSection("gallery").setAction("show").builder();
    }
    
    public void dismiss() {
        this.tweetUi.scribe(getTfwDimissNamespace());
    }
    
    public void impression(final ScribeItem scribeItem) {
        final ArrayList list = new ArrayList();
        list.add(scribeItem);
        this.tweetUi.scribe(getTfwImpressionNamespace(), list);
    }
    
    public void navigate() {
        this.tweetUi.scribe(getTfwNavigateNamespace());
    }
    
    public void show() {
        this.tweetUi.scribe(getTfwShowNamespace());
    }
}
